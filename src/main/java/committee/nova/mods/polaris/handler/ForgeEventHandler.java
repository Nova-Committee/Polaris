package committee.nova.mods.polaris.handler;

import committee.nova.mods.polaris.registry.PolarisItems;
import net.minecraftforge.event.AnvilUpdateEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

/**
 * @author cnlimiter
 */
@Mod.EventBusSubscriber
public class ForgeEventHandler {

    @SubscribeEvent
    public static void anvilRecipe(AnvilUpdateEvent event) {
        if (event.getRight().is(PolarisItems.FlameOfTheSoul.get())) {
            event.setCost(5);
            if (event.getLeft().is(PolarisItems.InactiveCore1.get())) {
                event.setOutput(PolarisItems.ActivatingCore1.get().getDefaultInstance());
            } else if (event.getLeft().is(PolarisItems.InactiveCore2.get())) {
                event.setOutput(PolarisItems.ActivatingCore2.get().getDefaultInstance());
            } else if (event.getLeft().is(PolarisItems.InactiveCore3.get())) {
                event.setOutput(PolarisItems.ActivatingCore3.get().getDefaultInstance());
            } else if (event.getLeft().is(PolarisItems.InactiveCore4.get())) {
                event.setOutput(PolarisItems.ActivatingCore4.get().getDefaultInstance());
            }
        }

    }
}
