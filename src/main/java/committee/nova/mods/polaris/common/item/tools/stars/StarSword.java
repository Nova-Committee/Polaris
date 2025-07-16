package committee.nova.mods.polaris.common.item.tools.stars;

import committee.nova.mods.polaris.registry.PolarisToolTiers;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;

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
