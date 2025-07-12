package org.xkmc.polaris.common.item.tools.stars;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import org.xkmc.polaris.registry.PolarisToolTiers;

/**
 * @author cnlimiter
 */
public class StarSword extends SwordItem {
    public StarSword() {
        super(PolarisToolTiers.STARS, 12, 2, new Properties());
    }

    @Override
    public boolean isDamageable(ItemStack stack) {
        return false;
    }
}
