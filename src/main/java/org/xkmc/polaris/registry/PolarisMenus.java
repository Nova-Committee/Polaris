package org.xkmc.polaris.registry;

import net.minecraft.world.inventory.MenuType;
import net.minecraftforge.common.extensions.IForgeMenuType;
import net.minecraftforge.registries.RegistryObject;
import org.xkmc.polaris.common.container.ObsidianNetherFurnaceMenu;

public class PolarisMenus {
    public static final RegistryObject<MenuType<ObsidianNetherFurnaceMenu>> OBSIDIAN_NETHER_FURNACE_CONTAINER =
            Registration.CONTAINERS.register("obsidian_nether_furnace_container", () ->
                    IForgeMenuType.create((containerID, inventory, data) ->
                            new ObsidianNetherFurnaceMenu(containerID, inventory)));

    public static void register() {
    }
}
