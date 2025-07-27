package committee.nova.mods.polaris.common.item.tools.stars;

import committee.nova.mods.polaris.registry.PolarisToolTiers;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.ItemStack;

/**
 * @author cnlimiter
 */
public class StarHoe extends HoeItem {
    public StarHoe() {
        super(PolarisToolTiers.STARS, 2, 0, new Properties());
    }
    @Override
    public boolean isDamageable(ItemStack stack) {
        return false;
    }
}
