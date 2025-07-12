package org.xkmc.polaris;

import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.xkmc.polaris.registry.PolarisClientSetup;
import org.xkmc.polaris.registry.PolarisDataGen;
import org.xkmc.polaris.registry.PolarisMenus;
import org.xkmc.polaris.client.screen.ObsidianNetherFurnaceScreen;
import org.xkmc.polaris.registry.Registration;

@Mod(Polaris.MOD_ID)
public class Polaris
{
    public static final String MOD_ID = "polaris";
    public static final Logger LOGGER = LogManager.getLogger();

    public Polaris() {
        var bus = FMLJavaModLoadingContext.get().getModEventBus();

        Registration.register();

        bus.addListener(PolarisClientSetup::doClient);
        bus.addListener(PolarisDataGen::gatherData);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }




    public static ResourceLocation rl(String path) {
        return new ResourceLocation(MOD_ID, path);
    }


}
