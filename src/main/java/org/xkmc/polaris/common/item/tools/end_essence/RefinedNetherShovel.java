package org.xkmc.polaris.common.item.tools.end_essence;

import net.minecraft.world.item.ShovelItem;
import org.xkmc.polaris.registry.PolarisToolTiers;

/**
 * @author cnlimiter
 */
public class RefinedNetherShovel extends ShovelItem {
    public RefinedNetherShovel() {
        super(PolarisToolTiers.REFINED_NETHER, 8, 1, new Properties());
    }
}
