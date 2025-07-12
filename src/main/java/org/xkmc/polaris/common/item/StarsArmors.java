package org.xkmc.polaris.common.item;

import com.google.common.collect.ImmutableMap;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import org.xkmc.polaris.registry.PolarisArmorMaterial;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class StarsArmors extends UnDamageArmors {
    public static final List<MobEffect> STARDUST_Effects = new ArrayList<>();

    public static List<MobEffect> getSTARDUST_Effects() {
        STARDUST_Effects.add(MobEffects.DIG_SPEED);
        STARDUST_Effects.add(MobEffects.HEALTH_BOOST);
        return STARDUST_Effects;
    }

    private static final Map<ArmorMaterial, List<MobEffect>> MATERIAL_EFFECT_MAP =
            new ImmutableMap.Builder<ArmorMaterial, List<MobEffect>>()
                    .put(PolarisArmorMaterial.STARDUST, getSTARDUST_Effects())
                    .build();

    public StarsArmors(ArmorMaterial materialIn, Type slots, Properties settings) {
        super(materialIn, slots, settings);
    }

    @Override
    public void onInventoryTick(ItemStack stack, Level world, Player player, int slotIndex, int selectedIndex) {
        if (hasFullSuitOfArmorOn(player) && !player.isCreative()) {
            evaluateArmorEffects(player);
        }
        super.onInventoryTick(stack, world, player, slotIndex, selectedIndex);
    }

    private void evaluateArmorEffects(Player player) {
        for (Map.Entry<ArmorMaterial, List<MobEffect>> entry : MATERIAL_EFFECT_MAP.entrySet()) {
            ArmorMaterial mapArmorMaterial = entry.getKey();
            List<MobEffect> mapStatusEffects = entry.getValue();
            if (hasCorrectArmorOn(mapArmorMaterial, player)) {
                for (MobEffect mapStatusEffect : mapStatusEffects) {
                    addStatusEffectsForMaterial(player, mapArmorMaterial, mapStatusEffect);
                }

            }
        }
    }

    private void addStatusEffectsForMaterial(Player player, ArmorMaterial mapArmorMaterial, MobEffect mapStatusEffect) {
        boolean hasPlayerEffect = !Objects.equals(player.getEffect(mapStatusEffect), null);
        if (hasCorrectArmorOn(mapArmorMaterial, player) && !hasPlayerEffect && player.tickCount % 1000 == 0) {
//            player.addEffect(new EffectInstance(mapStatusEffect, 100));
            player.setAbsorptionAmount(2f);
        }
    }


    private boolean hasFullSuitOfArmorOn(Player player) {
        ItemStack helmet = player.getItemBySlot(EquipmentSlot.HEAD);
        ItemStack chestplate = player.getItemBySlot(EquipmentSlot.CHEST);
        ItemStack leggings = player.getItemBySlot(EquipmentSlot.LEGS);
        ItemStack boots = player.getItemBySlot(EquipmentSlot.FEET);
        return !helmet.isEmpty() && !chestplate.isEmpty()
                && !leggings.isEmpty() && !boots.isEmpty();
    }

    private boolean hasCorrectArmorOn(ArmorMaterial material, Player player) {
        ArmorItem helmet = ((ArmorItem) player.getItemBySlot(EquipmentSlot.HEAD).getItem());
        ArmorItem chestplate = ((ArmorItem) player.getItemBySlot(EquipmentSlot.CHEST).getItem());
        ArmorItem leggings = ((ArmorItem) player.getItemBySlot(EquipmentSlot.LEGS).getItem());
        ArmorItem boots = ((ArmorItem) player.getItemBySlot(EquipmentSlot.FEET).getItem());

        return helmet.getMaterial().equals(material)
                && chestplate.getMaterial().equals(material)
                && leggings.getMaterial().equals(material)
                && boots.getMaterial().equals(material);
    }
}
