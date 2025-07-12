package org.xkmc.polaris.common.tileentity;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.registries.RegistryObject;
import org.xkmc.polaris.registry.PolarisBlocks;
import org.xkmc.polaris.registry.Registration;

public class PolarisTileEntities {
    public static final RegistryObject<BlockEntityType<ObsidianNetherFurnaceTile>> obsidianNetherFurnaceTile =
            Registration.TILE_ENTITIES.register("obsidian_nether_furnace_tile", () -> BlockEntityType.Builder.of(
                    ObsidianNetherFurnaceTile::new, PolarisBlocks.ObsidianNetherFurnace.get()).build(null));

    public static void register() {
    }
}
