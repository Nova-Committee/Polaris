package org.xkmc.polaris.common.item.tools.stars;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ShovelItem;
import org.xkmc.polaris.registry.PolarisToolTiers;

/**
 * @author cnlimiter
 */
public class StarShovel extends ShovelItem {
    public StarShovel() {
        super(PolarisToolTiers.STARS, 8, 1, new Properties());
    }
    @Override
    public boolean isDamageable(ItemStack stack) {
        return false;
    }
}
