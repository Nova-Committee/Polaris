package org.xkmc.polaris.common.item.tools.stars;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.PickaxeItem;
import org.xkmc.polaris.registry.PolarisToolTiers;

/**
 * @author cnlimiter
 */
public class StarPickaxe extends PickaxeItem {
    public StarPickaxe() {
        super(PolarisToolTiers.STARS, 9, 1, new Properties());
    }
    @Override
    public boolean isDamageable(ItemStack stack) {
        return false;
    }
}
