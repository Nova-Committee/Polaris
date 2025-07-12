package org.xkmc.polaris.common.container;

import net.minecraft.world.Container;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.AbstractFurnaceMenu;
import net.minecraft.world.inventory.ContainerData;
import net.minecraft.world.inventory.RecipeBookType;
import org.xkmc.polaris.registry.PolarisRecipeTypes;
import org.xkmc.polaris.registry.PolarisMenus;

public class ObsidianNetherFurnaceMenu extends AbstractFurnaceMenu {
    public ObsidianNetherFurnaceMenu(int containerID, Inventory playerInventory) {
        super(PolarisMenus.OBSIDIAN_NETHER_FURNACE_CONTAINER.get(), PolarisRecipeTypes.OBSIDIAN_FURNACE_RECIPE_TYPE.get(), RecipeBookType.FURNACE, containerID, playerInventory);
    }
    public ObsidianNetherFurnaceMenu(int containerID, Inventory playerInventory, Container data, ContainerData slots) {
        super(PolarisMenus.OBSIDIAN_NETHER_FURNACE_CONTAINER.get(), PolarisRecipeTypes.OBSIDIAN_FURNACE_RECIPE_TYPE.get(), RecipeBookType.FURNACE, containerID, playerInventory, data,slots);
    }
}
