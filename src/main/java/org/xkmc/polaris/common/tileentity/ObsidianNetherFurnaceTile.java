package org.xkmc.polaris.common.tileentity;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.SimpleContainer;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.ForgeCapabilities;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.ItemStackHandler;
import org.jetbrains.annotations.NotNull;
import org.xkmc.polaris.common.container.ObsidianNetherFurnaceMenu;
import org.xkmc.polaris.common.container.ObsidianNetherFurnaceItemNumber;
import org.xkmc.polaris.common.recipes.ObsidianFurnaceRecipe;
import org.xkmc.polaris.registry.PolarisRecipeTypes;
import org.xkmc.polaris.registry.PolarisItems;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.Optional;

public class ObsidianNetherFurnaceTile extends BlockEntity implements MenuProvider {
    private final ItemStackHandler itemHandler = createHandler();
    private final LazyOptional<IItemHandler> handler = LazyOptional.of(() -> itemHandler);
    private SimpleContainer inventory = new SimpleContainer(1);
    private ObsidianNetherFurnaceItemNumber itemNumber = new ObsidianNetherFurnaceItemNumber();

    public ObsidianNetherFurnaceTile(BlockPos pPos, BlockState pBlockState) {
        super(PolarisTileEntities.obsidianNetherFurnaceTile.get(), pPos, pBlockState);
    }

    @Override
    public void load(CompoundTag pTag) {
        itemHandler.deserializeNBT(pTag.getCompound("inv"));
        super.load(pTag);
    }

    @Override
    protected void saveAdditional(CompoundTag pTag) {
        pTag.put("inv", itemHandler.serializeNBT());
        super.saveAdditional(pTag);
    }


    private ItemStackHandler createHandler() {
        return new ItemStackHandler(2) {
            @Override
            protected void onContentsChanged(int slot) {
                setChanged();
            }

            @Override
            public boolean isItemValid(int slot, @Nonnull ItemStack stack) {
                return switch (slot) {
                    case 0 -> stack.getItem() == Items.GLASS_PANE;
//                    case 1 ->
//                            stack.getItem() == PolarisItems.DemonSoul.get() || stack.getItem() == PolarisItems.HeartOfOre.get();
                    default -> false;
                };
            }

            @Override
            public int getSlotLimit(int slot) {
                return 1;
            }

            @Nonnull
            @Override
            public ItemStack insertItem(int slot, @Nonnull ItemStack stack, boolean simulate) {
                if (!isItemValid(slot, stack)) {
                    return stack;
                }
                return super.insertItem(slot, stack, simulate);
            }
        };
    }

    @Nonnull
    @Override
    public <T> LazyOptional<T> getCapability(@Nonnull Capability<T> cap, @Nullable Direction side) {
        if (!this.isRemoved() && cap == ForgeCapabilities.ITEM_HANDLER) {
            return ForgeCapabilities.ITEM_HANDLER.orEmpty(cap, this.handler);
        }
        return super.getCapability(cap, side);
    }


    public static void tick(Level level, BlockPos pos, BlockState state, ObsidianNetherFurnaceTile tile) {
        SimpleContainer inv = new SimpleContainer(tile.itemHandler.getSlots());
        for (int i = 0; i < tile.itemHandler.getSlots(); i++) {
            inv.setItem(i, tile.itemHandler.getStackInSlot(i));
        }

        Optional<ObsidianFurnaceRecipe> recipe = tile.level.getRecipeManager()
                .getRecipeFor(PolarisRecipeTypes.OBSIDIAN_FURNACE_RECIPE_TYPE.get(), inv, tile.level);

        recipe.ifPresent(iRecipe -> {
            ItemStack output = iRecipe.getResultItem(tile.getLevel().registryAccess());
            tile.itemHandler.extractItem(0, 1, false);
            tile.itemHandler.extractItem(1, 1, false);
            tile.itemHandler.insertItem(1, output, false);
            tile.setChanged();
        });
    }

    @Override
    public @NotNull Component getDisplayName() {
        return Component.translatable("screen.polaris.obsidian_nether_future");
    }

    @Override
    public @Nullable AbstractContainerMenu createMenu(int containerId, @NotNull Inventory inventory, Player player) {
        return new ObsidianNetherFurnaceMenu(containerId, player.getInventory());
    }
}
