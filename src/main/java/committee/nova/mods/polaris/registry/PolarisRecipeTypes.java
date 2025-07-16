package committee.nova.mods.polaris.registry;


import committee.nova.mods.polaris.Polaris;
import committee.nova.mods.polaris.common.recipes.ObsidianFurnaceRecipe;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.item.crafting.SimpleCookingSerializer;
import net.minecraftforge.registries.RegistryObject;

public class PolarisRecipeTypes {

    public static final RegistryObject<RecipeSerializer<ObsidianFurnaceRecipe>> OBSIDIAN_FURNACE_SERIALIZER =
            Registration.RECIPE_SERIALIZER.register("obsidian_furnace", () -> new SimpleCookingSerializer<>(ObsidianFurnaceRecipe::new, 200));
    public static final RegistryObject<RecipeType<ObsidianFurnaceRecipe>> OBSIDIAN_FURNACE_RECIPE_TYPE =
            Registration.recipe("obsidian_furnace", () -> RecipeType.simple(Polaris.rl("obsidian_furnace")));

    public static void register() {
    }
}
