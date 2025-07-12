package org.xkmc.polaris.common.blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.EntityBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityTicker;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraftforge.network.NetworkHooks;
import org.jetbrains.annotations.NotNull;
import org.xkmc.polaris.common.tileentity.ObsidianNetherFurnaceTile;
import org.xkmc.polaris.common.tileentity.PolarisTileEntities;

import javax.annotation.Nullable;

/**
 * @Project: Polaris
 * @Author: cnlimiter
 * @CreateTime: 2025/7/1 23:14
 * @Note:
 */
public class ObsidianNetherFurnaceBlock extends PolarisDefaultBlock implements EntityBlock {
    public ObsidianNetherFurnaceBlock(Properties properties) {
        super(properties);
    }
    @Override
    public @NotNull InteractionResult use(@NotNull BlockState pState, @NotNull Level pLevel, @NotNull BlockPos pPos, @NotNull Player pPlayer, @NotNull InteractionHand pHand, @NotNull BlockHitResult pHit) {
        var tileEntity = pLevel.getBlockEntity(pPos);
        if (!pLevel.isClientSide) {
                if (tileEntity instanceof ObsidianNetherFurnaceTile obsidianNetherFurnaceTile) {
                    NetworkHooks.openScreen((ServerPlayer) pPlayer, obsidianNetherFurnaceTile);
                } else {
                    throw new IllegalStateException("Our container provider is missing!");
                }

        }
        return InteractionResult.SUCCESS;
    }

    @Nullable
    @Override
    public BlockEntity newBlockEntity(@NotNull BlockPos pos, @NotNull BlockState state) {
        return new ObsidianNetherFurnaceTile(pos, state);
    }

    @Override
    public <T extends BlockEntity> BlockEntityTicker<T> getTicker(Level level, @NotNull BlockState state, @NotNull BlockEntityType<T> type) {
        return level.isClientSide()
                ? this.getClientTicker(level, state, type)
                : this.getServerTicker(level, state, type);
    }

    protected <T extends BlockEntity> BlockEntityTicker<T> getClientTicker(Level level, BlockState state, BlockEntityType<T> type) {
        return createTicker(type, PolarisTileEntities.obsidianNetherFurnaceTile.get(), ObsidianNetherFurnaceTile::tick);
    }

    protected <T extends BlockEntity> BlockEntityTicker<T> getServerTicker(Level level, BlockState state, BlockEntityType<T> type) {
        return createTicker(type, PolarisTileEntities.obsidianNetherFurnaceTile.get(), ObsidianNetherFurnaceTile::tick);
    }

    @SuppressWarnings("unchecked")
    protected static <E extends BlockEntity, A extends BlockEntity> BlockEntityTicker<A> createTicker(BlockEntityType<A> typeA, BlockEntityType<E> typeB, BlockEntityTicker<? super E> ticker) {
        return typeA == typeB ? (BlockEntityTicker<A>) ticker : null;
    }
}
