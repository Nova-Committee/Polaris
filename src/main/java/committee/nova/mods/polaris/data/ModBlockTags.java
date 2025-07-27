package committee.nova.mods.polaris.data;


import committee.nova.mods.polaris.Polaris;
import committee.nova.mods.polaris.registry.PolarisBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.IntrinsicHolderTagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nullable;
import java.util.concurrent.CompletableFuture;



public class ModBlockTags extends IntrinsicHolderTagsProvider<Block> {

    public ModBlockTags(PackOutput output, CompletableFuture<HolderLookup.Provider> future, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, Registries.BLOCK, future, block -> block.builtInRegistryHolder().key(), Polaris.MOD_ID, existingFileHelper);
    }

    @Override
    public @NotNull String getName() {
        return "Polaris Block Tags";
    }


    @Override
    protected void addTags(HolderLookup.@NotNull Provider pProvider) {
        tag(BlockTags.NEEDS_IRON_TOOL).add(
                PolarisBlocks.ObsidianNetherFurnace.get(),
                PolarisBlocks.AlloySmithingTable.get()
                );
    }
}
