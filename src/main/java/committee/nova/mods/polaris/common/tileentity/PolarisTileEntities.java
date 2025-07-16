package committee.nova.mods.polaris.common.tileentity;

import committee.nova.mods.polaris.registry.PolarisBlocks;
import committee.nova.mods.polaris.registry.Registration;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.registries.RegistryObject;

public class PolarisTileEntities {
    public static final RegistryObject<BlockEntityType<ObsidianNetherFurnaceTile>> obsidianNetherFurnaceTile =
            Registration.TILE_ENTITIES.register("obsidian_nether_furnace_tile", () -> BlockEntityType.Builder.of(
                    ObsidianNetherFurnaceTile::new, PolarisBlocks.ObsidianNetherFurnace.get()).build(null));

    public static void register() {
    }
}
