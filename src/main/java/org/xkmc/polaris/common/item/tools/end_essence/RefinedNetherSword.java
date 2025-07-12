package org.xkmc.polaris.common.item.tools.end_essence;

import net.minecraft.world.item.SwordItem;
import org.xkmc.polaris.registry.PolarisToolTiers;

/**
 * @author cnlimiter
 */
public class RefinedNetherSword extends SwordItem {
    public RefinedNetherSword() {
        super(PolarisToolTiers.REFINED_NETHER, 12, -2, new Properties());
    }
}
