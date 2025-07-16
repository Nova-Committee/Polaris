package committee.nova.mods.polaris.handler;

import committee.nova.mods.polaris.common.item.armors.FlyingArmors.FlyingEffectArmors;
import committee.nova.mods.polaris.common.item.armors.FlyingArmors.StarLordArmors;
import committee.nova.mods.polaris.common.item.armors.FlyingArmors.SupremeGenesisArmors;
import committee.nova.mods.polaris.common.item.armors.MSArmor.BlackTortoiseArmors;
import committee.nova.mods.polaris.common.item.armors.MSArmor.BlueDragonArmors;
import committee.nova.mods.polaris.common.item.armors.MSArmor.VermilionBirdArmors;
import committee.nova.mods.polaris.common.item.armors.MSArmor.WhiteTigerArmors;
import committee.nova.mods.polaris.common.item.armors.StarCommonArmors;
import committee.nova.mods.polaris.tools.ToolUtils;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.player.Player;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.ArrayList;
import java.util.List;

/**
 * @author cnlimiter
 */
@Mod.EventBusSubscriber
public class EffectArmorHandler {
    public static List<MobEffect> supremeGenesisEffects() {
        List<MobEffect> armorEffects = new ArrayList<>();
        armorEffects.add(MobEffects.DIG_SPEED);
        armorEffects.add(MobEffects.DAMAGE_RESISTANCE);
        armorEffects.add(MobEffects.HEALTH_BOOST);
        armorEffects.add(MobEffects.DAMAGE_BOOST);
        armorEffects.add(MobEffects.CONDUIT_POWER);
        armorEffects.add(MobEffects.LUCK);
        return armorEffects;
    }

    public static List<MobEffect> MSWhiteTigerEffects() {
        List<MobEffect> armorEffects = new ArrayList<>();
        armorEffects.add(MobEffects.MOVEMENT_SPEED);
        armorEffects.add(MobEffects.DIG_SPEED);
        armorEffects.add(MobEffects.DAMAGE_BOOST);
        return armorEffects;
    }

    public static List<MobEffect> MSBlueDragonEffects() {
        List<MobEffect> armorEffects = new ArrayList<>();
        armorEffects.add(MobEffects.HEALTH_BOOST);
        armorEffects.add(MobEffects.DIG_SPEED);
        armorEffects.add(MobEffects.CONDUIT_POWER);
        return armorEffects;
    }

    public static List<MobEffect> MSVermilionBirdEffects() {
        List<MobEffect> armorEffects = new ArrayList<>();
        armorEffects.add(MobEffects.HEALTH_BOOST);
        armorEffects.add(MobEffects.DIG_SPEED);
        armorEffects.add(MobEffects.FIRE_RESISTANCE);
        return armorEffects;
    }

    public static List<MobEffect> MSBlackTortoiseEffects() {
        List<MobEffect> armorEffects = new ArrayList<>();
        armorEffects.add(MobEffects.HEALTH_BOOST);
        armorEffects.add(MobEffects.SATURATION);
        armorEffects.add(MobEffects.DAMAGE_RESISTANCE);
        return armorEffects;
    }
    public static List<MobEffect> starLordEffects() {
        List<MobEffect> armorEffects = new ArrayList<>();
        armorEffects.add(MobEffects.DIG_SPEED);
        armorEffects.add(MobEffects.HEALTH_BOOST);
        return armorEffects;
    }

    @SubscribeEvent
    public static void updateAbilities(LivingEvent.LivingTickEvent event) {
        if (event.getEntity() instanceof Player player) {
            String key = player.getGameProfile().getName() + ":" + player.level().isClientSide;
            boolean hasWTArmor = ToolUtils.isPlayerWearingAll(player, item -> item instanceof WhiteTigerArmors);
            boolean hasBDArmor = ToolUtils.isPlayerWearingAll(player, item -> item instanceof BlueDragonArmors);
            boolean hasVBArmor = ToolUtils.isPlayerWearingAll(player, item -> item instanceof VermilionBirdArmors);
            boolean hasBTArmor = ToolUtils.isPlayerWearingAll(player, item -> item instanceof BlackTortoiseArmors);
            boolean hasFlyingArmor = ToolUtils.isPlayerWearingAll(player, item -> item instanceof FlyingEffectArmors);
            boolean hasStarLordArmor = ToolUtils.isPlayerWearingAll(player, item -> item instanceof StarLordArmors);
            boolean hasSupremeGenesisArmor = ToolUtils.isPlayerWearingAll(player, item -> item instanceof SupremeGenesisArmors);
            boolean hasCommonArmor = ToolUtils.isPlayerWearingAll(player, item -> item instanceof StarCommonArmors);


            FlyingAbilityHandler.handleChestState(player, key, hasFlyingArmor, supremeGenesisEffects());
            updateEffects(hasCommonArmor, player, starLordEffects());
            updateEffects(hasStarLordArmor, player, starLordEffects());
            updateEffects(hasSupremeGenesisArmor, player, supremeGenesisEffects());
            updateEffects(hasWTArmor, player, MSWhiteTigerEffects());
            updateEffects(hasBDArmor, player, MSBlueDragonEffects());
            updateEffects(hasVBArmor, player, MSVermilionBirdEffects());
            updateEffects(hasBTArmor, player, MSBlackTortoiseEffects());
            updateEffects(hasBTArmor, player, MSBlackTortoiseEffects());

        }
    }

    public static void updateEffects(boolean hasAbility, Player player, List<MobEffect> addEffects){
        if (hasAbility) for (MobEffect effect : addEffects)  player.addEffect(new MobEffectInstance(effect, -1));
    }
}
