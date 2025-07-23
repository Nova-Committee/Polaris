package committee.nova.mods.polaris.common.item.armors;

import committee.nova.mods.polaris.common.item.UnDamageArmors;
import committee.nova.mods.polaris.handler.EffectArmorHandler;
import committee.nova.mods.polaris.registry.PolarisArmorMaterial;
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
public class FlyingArmors {
    public static class FlyingEffectArmors extends UnDamageArmors {
        public FlyingEffectArmors(PolarisArmorMaterial pMaterial, Type pType, Properties pProperties) {
            super(pMaterial, pType, pProperties);
        }
    }
    public static class StarLordArmors extends FlyingEffectArmors {
        public StarLordArmors(PolarisArmorMaterial pMaterial, Type pType, Properties pProperties) {
            super(pMaterial, pType, pProperties);
        }

        @Override
        public void appendHoverText(@NotNull ItemStack pStack, @Nullable Level pLevel, @NotNull List<Component> pTooltipComponents, @NotNull TooltipFlag pIsAdvanced) {
            pTooltipComponents.add(Component.translatable("tooltip.polaris.wearing_all").withStyle(ChatFormatting.GRAY));
            for (MobEffect effect: EffectArmorHandler.starLordEffects()) {
                pTooltipComponents.add(Component.translatable(effect.getDescriptionId()).withStyle(ChatFormatting.BLUE));
            }
            pTooltipComponents.add(Component.translatable("tooltip.polaris.flying").withStyle(ChatFormatting.DARK_PURPLE));
            super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
        }
    }
    public static class SupremeGenesisArmors extends FlyingEffectArmors{
        public SupremeGenesisArmors(PolarisArmorMaterial pMaterial, Type pType, Properties pProperties) {
            super(pMaterial, pType, pProperties);
        }

        @Override
        public void appendHoverText(@NotNull ItemStack pStack, @Nullable Level pLevel, @NotNull List<Component> pTooltipComponents, @NotNull TooltipFlag pIsAdvanced) {
            pTooltipComponents.add(Component.translatable("tooltip.polaris.wearing_all").withStyle(ChatFormatting.GRAY));
            for (MobEffect effect: EffectArmorHandler.supremeGenesisEffects()) {
                pTooltipComponents.add(Component.translatable(effect.getDescriptionId()).withStyle(ChatFormatting.BLUE));
            }
            pTooltipComponents.add(Component.translatable("tooltip.polaris.flying").withStyle(ChatFormatting.DARK_PURPLE));
            super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
        }
    }
}
