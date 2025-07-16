package committee.nova.mods.polaris.common.item.tools.end_essence;

import committee.nova.mods.polaris.registry.PolarisToolTiers;
import net.minecraft.world.item.ShovelItem;

/**
 * @author cnlimiter
 */
public class RefinedNetherShovel extends ShovelItem {
    public RefinedNetherShovel() {
        super(PolarisToolTiers.REFINED_NETHER, 8, 1, new Properties());
    }
}
