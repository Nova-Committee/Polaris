package committee.nova.mods.polaris.data;

import committee.nova.mods.polaris.Polaris;
import committee.nova.mods.polaris.registry.PolarisItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.IntrinsicHolderTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nullable;
import java.util.concurrent.CompletableFuture;

public class ModItemTags extends IntrinsicHolderTagsProvider<Item> {

    public ModItemTags(PackOutput output, CompletableFuture<HolderLookup.Provider> future, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, Registries.ITEM, future, block -> block.builtInRegistryHolder().key(), Polaris.MOD_ID, existingFileHelper);
    }

    @Override
    public @NotNull String getName() {
        return "Polaris Item Tags";
    }


    @Override
    protected void addTags(HolderLookup.@NotNull Provider pProvider) {
        tag(ItemTags.PICKAXES).add(PolarisItems.refinedNetherPickAxe.get(), PolarisItems.starPickAxe.get());
        tag(ItemTags.AXES).add(PolarisItems.refinedNetherAxe.get(), PolarisItems.starAxe.get());
        tag(ItemTags.SHOVELS).add(PolarisItems.refinedNetherShovel.get(), PolarisItems.starShovel.get());
        tag(ItemTags.HOES).add(PolarisItems.refinedNetherHoe.get(), PolarisItems.starHoe.get());
        tag(ItemTags.SWORDS).add(PolarisItems.refinedNetherSword.get(), PolarisItems.starSword.get());
    }
}
