package committee.nova.mods.polaris.common.item.armors;

import committee.nova.mods.polaris.common.item.UnDamageArmors;
import committee.nova.mods.polaris.handler.EffectArmorHandler;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

/**
 * @author cnlimiter
 */
public class MSArmor {
    public static class WhiteTigerArmors extends UnDamageArmors{
        public WhiteTigerArmors(ArmorMaterial pMaterial, Type pType, Properties pProperties) {
            super(pMaterial, pType, pProperties);
        }
        @Override
        public void appendHoverText(@NotNull ItemStack pStack, @Nullable Level pLevel, @NotNull List<Component> pTooltipComponents, @NotNull TooltipFlag pIsAdvanced) {
            pTooltipComponents.add(Component.translatable("tooltip.polaris.wearing_all").withStyle(ChatFormatting.GRAY));
            for (MobEffect effect: EffectArmorHandler.MSWhiteTigerEffects()) {
                pTooltipComponents.add(Component.translatable(effect.getDescriptionId()).withStyle(ChatFormatting.BLUE));
            }
            super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
        }
    }
    public static class BlueDragonArmors extends UnDamageArmors{
        public BlueDragonArmors(ArmorMaterial pMaterial, Type pType, Properties pProperties) {
            super(pMaterial, pType, pProperties);
        }
        @Override
        public void appendHoverText(@NotNull ItemStack pStack, @Nullable Level pLevel, @NotNull List<Component> pTooltipComponents, @NotNull TooltipFlag pIsAdvanced) {
            pTooltipComponents.add(Component.translatable("tooltip.polaris.wearing_all").withStyle(ChatFormatting.GRAY));
            for (MobEffect effect: EffectArmorHandler.MSBlueDragonEffects()) {
                pTooltipComponents.add(Component.translatable(effect.getDescriptionId()).withStyle(ChatFormatting.BLUE));
            }
            super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
        }
    }
    public static class VermilionBirdArmors extends UnDamageArmors{
        public VermilionBirdArmors(ArmorMaterial pMaterial, Type pType, Properties pProperties) {
            super(pMaterial, pType, pProperties);
        }
        @Override
        public void appendHoverText(@NotNull ItemStack pStack, @Nullable Level pLevel, @NotNull List<Component> pTooltipComponents, @NotNull TooltipFlag pIsAdvanced) {
            pTooltipComponents.add(Component.translatable("tooltip.polaris.wearing_all").withStyle(ChatFormatting.GRAY));
            for (MobEffect effect: EffectArmorHandler.MSVermilionBirdEffects()) {
                pTooltipComponents.add(Component.translatable(effect.getDescriptionId()).withStyle(ChatFormatting.BLUE));
            }
            super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
        }
    }
    public static class BlackTortoiseArmors extends UnDamageArmors{
        public BlackTortoiseArmors(ArmorMaterial pMaterial, Type pType, Properties pProperties) {
            super(pMaterial, pType, pProperties);
        }
        @Override
        public void appendHoverText(@NotNull ItemStack pStack, @Nullable Level pLevel, @NotNull List<Component> pTooltipComponents, @NotNull TooltipFlag pIsAdvanced) {
            pTooltipComponents.add(Component.translatable("tooltip.polaris.wearing_all").withStyle(ChatFormatting.GRAY));
            for (MobEffect effect: EffectArmorHandler.MSBlackTortoiseEffects()) {
                pTooltipComponents.add(Component.translatable(effect.getDescriptionId()).withStyle(ChatFormatting.BLUE));
            }
            super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
        }
    }

}
