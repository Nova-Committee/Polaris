package committee.nova.mods.polaris.common.recipes;

import committee.nova.mods.polaris.registry.PolarisBlocks;
import committee.nova.mods.polaris.registry.PolarisRecipeTypes;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.CookingBookCategory;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import org.jetbrains.annotations.NotNull;

public class ObsidianFurnaceRecipe extends AbstractCookingRecipe {
    public ObsidianFurnaceRecipe(ResourceLocation pId, String pGroup, CookingBookCategory pCategory, Ingredient pIngredient, ItemStack pResult, float pExperience, int pCookingTime) {
        super(PolarisRecipeTypes.OBSIDIAN_FURNACE_RECIPE_TYPE.get(), pId, pGroup, pCategory, pIngredient, pResult, pExperience, pCookingTime);
    }

    public @NotNull ItemStack getToastSymbol() {
        return new ItemStack(PolarisBlocks.ObsidianNetherFurnace.get());
    }

    public @NotNull RecipeSerializer<?> getSerializer() {
        return PolarisRecipeTypes.OBSIDIAN_FURNACE_SERIALIZER.get();
    }
}
