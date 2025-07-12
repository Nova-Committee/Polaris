package org.xkmc.polaris.common.item.tools.stars;

import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.ItemStack;
import org.xkmc.polaris.registry.PolarisToolTiers;

/**
 * @author cnlimiter
 */
public class StarAxe extends AxeItem {
    public StarAxe() {
        super(PolarisToolTiers.STARS, 15, 1, new Properties());
    }
    @Override
    public boolean isDamageable(ItemStack stack) {
        return false;
    }
}
