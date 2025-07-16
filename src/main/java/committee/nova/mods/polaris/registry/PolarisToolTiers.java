package committee.nova.mods.polaris.registry;

import committee.nova.mods.polaris.Polaris;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

/**
 * @author cnlimiter
 */
public class PolarisToolTiers {
    public static final Tier REFINED_NETHER = TierSortingRegistry.registerTier(new ForgeTier(5, 4062, 0f, 0F, 25, PolarisTags.Blocks.NEEDS_REFINED_NETHER_TOOL,
            () -> Ingredient.of(PolarisItems.EndEssence.get())), Polaris.rl( "end_essence"), List.of(Tiers.NETHERITE), List.of());
    public static final Tier STARS =TierSortingRegistry.registerTier(new ForgeTier(6, 8888, 0f, 0F, 30, PolarisTags.Blocks.NEEDS_STARS_TOOL,
            Ingredient::of), Polaris.rl( "stars"), List.of(REFINED_NETHER), List.of());

}
