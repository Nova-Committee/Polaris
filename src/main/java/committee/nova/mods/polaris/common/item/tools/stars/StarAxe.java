package committee.nova.mods.polaris.common.item.tools.stars;

import committee.nova.mods.polaris.registry.PolarisToolTiers;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.ItemStack;

/**
 * @author cnlimiter
 */
public class StarAxe extends AxeItem {
    public StarAxe() {
        super(PolarisToolTiers.STARS, 21, -2.9F, new Properties());
    }
    @Override
    public boolean isDamageable(ItemStack stack) {
        return false;
    }
}
