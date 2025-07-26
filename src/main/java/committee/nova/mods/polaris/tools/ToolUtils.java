package committee.nova.mods.polaris.tools;

import committee.nova.mods.polaris.common.item.UnDamageArmors;
import committee.nova.mods.polaris.registry.PolarisArmorMaterial;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

import java.util.function.Predicate;

/**
 * @author cnlimiter
 */
public class ToolUtils {
    public static boolean isPlayingMode(Player player) {
        return !player.isCreative() && !player.isSpectator();
    }

    public static boolean isPlayerWearing(LivingEntity entity, EquipmentSlot slot, Predicate<Item> predicate) {
        ItemStack stack = entity.getItemBySlot(slot);
        return !stack.isEmpty() && predicate.test(stack.getItem());
    }

    public static boolean isPlayerWearingAll(LivingEntity player, Predicate<Item> predicate) {
        for (EquipmentSlot slot : EquipmentSlot.values()) {
            if (slot.getType() != EquipmentSlot.Type.ARMOR) {
                continue;
            }
            ItemStack stack = player.getItemBySlot(slot);
            if (stack.isEmpty() || !(predicate.test(stack.getItem()))) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPlayerWearingAllByMaterial(LivingEntity player, Predicate<PolarisArmorMaterial> material) {
        for (EquipmentSlot slot : EquipmentSlot.values()) {
            if (slot.getType() != EquipmentSlot.Type.ARMOR) {
                continue;
            }
            ItemStack stack = player.getItemBySlot(slot);
            if (stack.isEmpty() || !(stack.getItem() instanceof UnDamageArmors armor && material.test(armor.getArmorMaterial()))) {
                return false;
            }
        }
        return true;
    }
}
