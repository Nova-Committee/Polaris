package committee.nova.mods.polaris.common.item.tools.stars;

import committee.nova.mods.polaris.registry.PolarisToolTiers;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.PickaxeItem;

/**
 * @author cnlimiter
 */
public class StarPickaxe extends PickaxeItem {
    public StarPickaxe() {
        super(PolarisToolTiers.STARS, 11, -2.6F, new Properties());
    }
    @Override
    public boolean isDamageable(ItemStack stack) {
        return false;
    }
}
