package org.xkmc.polaris.common.recipes;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.*;
import org.jetbrains.annotations.NotNull;
import org.xkmc.polaris.registry.PolarisBlocks;
import org.xkmc.polaris.registry.PolarisRecipeTypes;

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
