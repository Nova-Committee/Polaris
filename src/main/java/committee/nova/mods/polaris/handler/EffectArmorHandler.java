package committee.nova.mods.polaris.handler;

import committee.nova.mods.polaris.registry.PolarisArmorMaterial;
import committee.nova.mods.polaris.tools.ToolUtils;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.player.Player;
import net.minecraftforge.event.entity.living.LivingEquipmentChangeEvent;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.List;

/**
 * @author cnlimiter
 */
@Mod.EventBusSubscriber
public class EffectArmorHandler {
    @SubscribeEvent
    public static void updateAbilities(LivingEvent.LivingTickEvent event) {
        if (event.getEntity() instanceof Player player) {
            String key = player.getGameProfile().getName() + ":" + player.level().isClientSide;
            boolean hasFlyingArmor = ToolUtils.isPlayerWearingAllByMaterial(player,
                    material -> material.equals(PolarisArmorMaterial.STAR_LORD)
                            || material.equals(PolarisArmorMaterial.SupremeGenesis)
                            || material.equals(PolarisArmorMaterial.SupremeGenesisWhite));
            FlyingAbilityHandler.handleChestState(player, key, hasFlyingArmor);
        }
    }

    public static void updateEffects(boolean hasAbility, Player player, List<MobEffect> addEffects){
        if (hasAbility) for (MobEffect effect : addEffects)  player.addEffect(new MobEffectInstance(effect, -1));
        else {
            for (MobEffect effect : addEffects) player.removeEffect(effect);
        }
    }
    @SubscribeEvent
    public static void equipChange(LivingEquipmentChangeEvent event) {
        if (event.getEntity() instanceof Player player) {
//            boolean hasWTArmor = ToolUtils.isPlayerWearingAll(player, item -> item instanceof WhiteTigerArmors);
//            boolean hasBDArmor = ToolUtils.isPlayerWearingAll(player, item -> item instanceof BlueDragonArmors);
//            boolean hasVBArmor = ToolUtils.isPlayerWearingAll(player, item -> item instanceof VermilionBirdArmors);
//            boolean hasBTArmor = ToolUtils.isPlayerWearingAll(player, item -> item instanceof BlackTortoiseArmors);
//            boolean hasStarLordArmor = ToolUtils.isPlayerWearingAll(player, item -> item instanceof StarLordArmors);
//            boolean hasSupremeGenesisArmor = ToolUtils.isPlayerWearingAll(player, item -> item instanceof SupremeGenesisArmors);
//            boolean hasCommonArmor = ToolUtils.isPlayerWearingAll(player, item -> item instanceof StarCommonArmors);
//            updateEffects(hasCommonArmor, player, starLordEffects());
//            updateEffects(hasStarLordArmor, player, starLordEffects());
//            updateEffects(hasSupremeGenesisArmor, player, supremeGenesisEffects());
//            updateEffects(hasWTArmor, player, MSWhiteTigerEffects());
//            updateEffects(hasBDArmor, player, MSBlueDragonEffects());
//            updateEffects(hasVBArmor, player, MSVermilionBirdEffects());
//            updateEffects(hasBTArmor, player, MSBlackTortoiseEffects());
        }

    }

}
