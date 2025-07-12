package org.xkmc.polaris.registry;

import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import org.xkmc.polaris.client.screen.ObsidianNetherFurnaceScreen;

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
