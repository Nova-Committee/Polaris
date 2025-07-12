package org.xkmc.polaris.registry;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.registries.RegistryObject;
import org.xkmc.polaris.common.blocks.ObsidianNetherFurnaceBlock;
import org.xkmc.polaris.common.blocks.PolarisDefaultBlock;

public class PolarisBlocks {

    public static final RegistryObject<Block> AlloySmithingTable = Registration.block("alloy_smithing_table", () ->
            new PolarisDefaultBlock(BlockBehaviour.Properties.of().sound(SoundType.STONE)));
    public static final RegistryObject<Block> ObsidianNetherFurnace = Registration.block("obsidian_nether_furnace", () ->
            new ObsidianNetherFurnaceBlock(BlockBehaviour.Properties.of().sound(SoundType.STONE)));

    public static void register() {
    }


}
