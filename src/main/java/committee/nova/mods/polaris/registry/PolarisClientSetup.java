package committee.nova.mods.polaris.registry;

import committee.nova.mods.polaris.client.screen.ObsidianNetherFurnaceScreen;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

/**
 * @author cnlimiter
 */
public class PolarisClientSetup {
    public static void doClient(final FMLClientSetupEvent event) {
        event.enqueueWork(() -> {
            MenuScreens.register(PolarisMenus.OBSIDIAN_NETHER_FURNACE_CONTAINER.get(), ObsidianNetherFurnaceScreen::new);
        });
    }
}
