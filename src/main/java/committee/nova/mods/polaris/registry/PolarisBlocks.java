package committee.nova.mods.polaris.registry;

import committee.nova.mods.polaris.common.blocks.ObsidianNetherFurnaceBlock;
import committee.nova.mods.polaris.common.blocks.PolarisDefaultBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.registries.RegistryObject;

public class PolarisBlocks {

    public static final RegistryObject<Block> AlloySmithingTable = Registration.block("alloy_smithing_table", () ->
            new PolarisDefaultBlock(BlockBehaviour.Properties.of().sound(SoundType.STONE)));
    public static final RegistryObject<Block> ObsidianNetherFurnace = Registration.block("obsidian_nether_furnace", () ->
            new ObsidianNetherFurnaceBlock(BlockBehaviour.Properties.of().sound(SoundType.STONE)));

    public static void register() {
    }


}
