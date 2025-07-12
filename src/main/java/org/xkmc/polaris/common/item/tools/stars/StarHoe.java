package org.xkmc.polaris.common.item.tools.stars;

import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.ItemStack;
import org.xkmc.polaris.registry.PolarisToolTiers;

/**
 * @author cnlimiter
 */
public class StarHoe extends HoeItem {
    public StarHoe() {
        super(PolarisToolTiers.STARS, 2, 2, new Properties());
    }
    @Override
    public boolean isDamageable(ItemStack stack) {
        return false;
    }
}
