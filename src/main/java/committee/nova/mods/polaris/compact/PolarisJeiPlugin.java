package committee.nova.mods.polaris.compact;

import committee.nova.mods.polaris.Polaris;
import committee.nova.mods.polaris.registry.PolarisItems;
import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.constants.RecipeTypes;
import mezz.jei.api.recipe.vanilla.IVanillaRecipeFactory;
import mezz.jei.api.registration.IRecipeCatalystRegistration;
import mezz.jei.api.registration.IRecipeRegistration;
import mezz.jei.library.plugins.vanilla.anvil.AnvilRecipeMaker;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * @author: cnlimiter
 */
@JeiPlugin
public class PolarisJeiPlugin implements IModPlugin {
    public static final ResourceLocation UID = new ResourceLocation(Polaris.MOD_ID, "jei_plugin");
    @Override
    public @NotNull ResourceLocation getPluginUid() {
        return UID;
    }

    @Override
    public void registerRecipes(@NotNull IRecipeRegistration registration) {
        IVanillaRecipeFactory vanillaRecipeFactory = registration.getVanillaRecipeFactory();
        var anvilRecipes = List.of(
                vanillaRecipeFactory.createAnvilRecipe(PolarisItems.InactiveCore1.get().getDefaultInstance(),
                        List.of(PolarisItems.FlameOfTheSoul.get().getDefaultInstance()),
                        List.of(PolarisItems.ActivatingCore1.get().getDefaultInstance())),
                vanillaRecipeFactory.createAnvilRecipe(PolarisItems.InactiveCore2.get().getDefaultInstance(),
                        List.of(PolarisItems.FlameOfTheSoul.get().getDefaultInstance()),
                        List.of(PolarisItems.ActivatingCore2.get().getDefaultInstance())),
                vanillaRecipeFactory.createAnvilRecipe(PolarisItems.InactiveCore3.get().getDefaultInstance(),
                        List.of(PolarisItems.FlameOfTheSoul.get().getDefaultInstance()),
                        List.of(PolarisItems.ActivatingCore3.get().getDefaultInstance())),
                vanillaRecipeFactory.createAnvilRecipe(PolarisItems.InactiveCore4.get().getDefaultInstance(),
                        List.of(PolarisItems.FlameOfTheSoul.get().getDefaultInstance()),
                        List.of(PolarisItems.ActivatingCore4.get().getDefaultInstance())),
                vanillaRecipeFactory.createAnvilRecipe(PolarisItems.InactiveCorePower.get().getDefaultInstance(),
                        List.of(PolarisItems.FlameOfTheSoul.get().getDefaultInstance()),
                        List.of(PolarisItems.ActivatingCorePower.get().getDefaultInstance()))
        );
        registration.addRecipes(RecipeTypes.ANVIL, anvilRecipes);
    }
}
