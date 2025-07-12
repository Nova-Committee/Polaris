package org.xkmc.polaris.registry;


import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.item.crafting.SimpleCookingSerializer;
import net.minecraftforge.registries.RegistryObject;
import org.xkmc.polaris.Polaris;
import org.xkmc.polaris.common.recipes.ObsidianFurnaceRecipe;

public class PolarisRecipeTypes {

    public static final RegistryObject<RecipeSerializer<ObsidianFurnaceRecipe>> OBSIDIAN_FURNACE_SERIALIZER =
            Registration.RECIPE_SERIALIZER.register("obsidian_furnace", () -> new SimpleCookingSerializer<>(ObsidianFurnaceRecipe::new, 200));
    public static final RegistryObject<RecipeType<ObsidianFurnaceRecipe>> OBSIDIAN_FURNACE_RECIPE_TYPE =
            Registration.recipe("obsidian_furnace", () -> RecipeType.simple(Polaris.rl("obsidian_furnace")));

    public static void register() {
    }
}
