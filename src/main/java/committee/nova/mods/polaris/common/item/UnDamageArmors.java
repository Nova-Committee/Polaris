package committee.nova.mods.polaris.common.item;

import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import committee.nova.mods.polaris.registry.PolarisArmorMaterial;
import committee.nova.mods.polaris.tools.ToolUtils;
import net.minecraft.ChatFormatting;
import net.minecraft.Util;
import net.minecraft.network.chat.Component;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.monster.EnderMan;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.EnumMap;
import java.util.List;
import java.util.UUID;

/**
 * @author cnlimiter
 */
public class UnDamageArmors extends ArmorItem {
    private final PolarisArmorMaterial armorMaterial;
    private static final EnumMap<Type, UUID> ARMOR_MODIFIER_UUID_PER_TYPE = Util.make(new EnumMap<>(ArmorItem.Type.class), (uuidEnumMap) -> {
        uuidEnumMap.put(ArmorItem.Type.BOOTS, UUID.fromString("845DB27C-C624-495F-8C9F-6020A9A58B6B"));
        uuidEnumMap.put(ArmorItem.Type.LEGGINGS, UUID.fromString("D8499B04-0E66-4726-AB29-64469D734E0D"));
        uuidEnumMap.put(ArmorItem.Type.CHESTPLATE, UUID.fromString("9F3D476D-C118-4544-8365-64846904B48E"));
        uuidEnumMap.put(ArmorItem.Type.HELMET, UUID.fromString("2AD3F246-FEE1-4E67-B886-69FD380BB150"));
    });
    private final Multimap<Attribute, AttributeModifier> defaultModifiers2;
    public UnDamageArmors(PolarisArmorMaterial pMaterial, Type pType, Properties pProperties) {
        super(pMaterial, pType, pProperties);
        this.armorMaterial = pMaterial;
        ImmutableMultimap.Builder<Attribute, AttributeModifier> builder = ImmutableMultimap.builder();
        UUID uuid = ARMOR_MODIFIER_UUID_PER_TYPE.get(pType);
        builder.put(Attributes.MAX_HEALTH, new AttributeModifier(uuid, "Armor health", pMaterial.getHealthAddForType(pType), AttributeModifier.Operation.ADDITION));
        builder.put(Attributes.ARMOR, new AttributeModifier(uuid, "Armor modifier", pMaterial.getDefenseForType(pType), AttributeModifier.Operation.ADDITION));
        builder.put(Attributes.ARMOR_TOUGHNESS, new AttributeModifier(uuid, "Armor toughness", pMaterial.getToughness(), AttributeModifier.Operation.ADDITION));
        if (pMaterial.getKnockbackResistance() > 0) {
            builder.put(Attributes.KNOCKBACK_RESISTANCE, new AttributeModifier(uuid, "Armor knockback resistance", pMaterial.getKnockbackResistance(), AttributeModifier.Operation.ADDITION));
        }
        this.defaultModifiers2 = builder.build();
    }

    @Override
    public @NotNull Multimap<Attribute, AttributeModifier> getDefaultAttributeModifiers(@NotNull EquipmentSlot pEquipmentSlot) {
        return pEquipmentSlot == this.type.getSlot() ? this.defaultModifiers2 : super.getDefaultAttributeModifiers(pEquipmentSlot);
    }

    @Override
    public boolean isDamageable(ItemStack stack) {
        return false;
    }

    @Override
    public boolean isEnderMask(ItemStack stack, Player player, EnderMan enderMan) {
        return true;
    }

    @Override
    public boolean makesPiglinsNeutral(ItemStack stack, LivingEntity wearer) {
        return true;
    }

    @Override
    public void appendHoverText(@NotNull ItemStack pStack, @Nullable Level pLevel, @NotNull List<Component> pTooltipComponents, @NotNull TooltipFlag pIsAdvanced) {
        pTooltipComponents.add(Component.translatable("tooltip.polaris.wearing_all").withStyle(ChatFormatting.GRAY));
        for (MobEffect effect: this.armorMaterial.getArmorEffects()) {
            pTooltipComponents.add(Component.translatable(effect.getDescriptionId()).withStyle(ChatFormatting.BLUE));
        }
        if (armorMaterial.isFlying()) pTooltipComponents.add(Component.translatable("tooltip.polaris.flying").withStyle(ChatFormatting.DARK_PURPLE));
        super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
    }

    public PolarisArmorMaterial getArmorMaterial() {
        return armorMaterial;
    }

    public void onArmorTicks(ItemStack stack, Level level, Player player) {
        boolean wearingAll = ToolUtils.isPlayerWearingAllByMaterial(player, material -> material.equals(this.armorMaterial));
        if (wearingAll) for (MobEffect effect : this.armorMaterial.getArmorEffects())  player.addEffect(new MobEffectInstance(effect, -1));
        else {
            for (MobEffect effect : this.armorMaterial.getArmorEffects()) player.removeEffect(effect);
        }
    }


    @Override
    public void onInventoryTick(ItemStack stack, Level level, Player player, int slotIndex, int selectedIndex) {
        var inv = player.getInventory();
        int vanillaIndex = slotIndex;
        if (slotIndex >= inv.items.size()) {
            vanillaIndex -= inv.items.size();
            if (vanillaIndex >= inv.armor.size())
                vanillaIndex -= inv.armor.size();
            else
                onArmorTicks(stack, level, player);
        }
        stack.inventoryTick(level, player, vanillaIndex, selectedIndex == vanillaIndex);
    }
}
