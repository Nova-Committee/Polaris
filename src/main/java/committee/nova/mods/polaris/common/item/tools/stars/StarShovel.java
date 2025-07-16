package committee.nova.mods.polaris.common.item.tools.stars;

import committee.nova.mods.polaris.registry.PolarisToolTiers;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ShovelItem;

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
