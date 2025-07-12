package org.xkmc.polaris.registry;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.Container;
import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.crafting.Recipe;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.xkmc.polaris.Polaris;
import org.xkmc.polaris.common.tileentity.PolarisTileEntities;

import java.util.function.Supplier;

public class Registration {
    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB,
            Polaris.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS,
            Polaris.MOD_ID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,
            Polaris.MOD_ID);
    public static DeferredRegister<MenuType<?>> CONTAINERS = DeferredRegister.create(ForgeRegistries.MENU_TYPES,
            Polaris.MOD_ID);
    public static DeferredRegister<BlockEntityType<?>> TILE_ENTITIES = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES,
            Polaris.MOD_ID);
    public static final DeferredRegister<RecipeSerializer<?>> RECIPE_SERIALIZER =
            DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS, Polaris.MOD_ID);
    public static final DeferredRegister<RecipeType<?>> RECIPE_TYPES =
            DeferredRegister.create(ForgeRegistries.RECIPE_TYPES, Polaris.MOD_ID);

    public static RegistryObject<Item> item(String name, Supplier<Item> item) {
        var regItem = ITEMS.register(name, item);
        PolarisTabs.ACCEPT_ITEM.add(regItem);
        return regItem;
    }

    public static RegistryObject<Item> armorItem(String name, Supplier<Item> item) {
        var regItem = ITEMS.register(name, item);
        PolarisTabs.ACCEPT_ARMORS.add(regItem);
        return regItem;
    }

    public static <T extends Recipe<Container>> RegistryObject<RecipeType<T>> recipe(String name, Supplier<RecipeType<T>> type) {
        return RECIPE_TYPES.register(name, type);
    }

    protected static <T extends Block> RegistryObject<T> block(String name, Supplier<T> block) {
        RegistryObject<T> registryObject = Registration.BLOCKS.register(name, block);
//        var regItem = Registration.ITEMS.register(name, () -> new BlockItem(registryObject.get(), new Item.Properties()));
//        PolarisTabs.ACCEPT_BLOCKS.add(regItem);
        return registryObject;
    }

    public static void register(){
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        TABS.register(modEventBus);
        BLOCKS.register(modEventBus);
        ITEMS.register(modEventBus);
        CONTAINERS.register(modEventBus);
        TILE_ENTITIES.register(modEventBus);
        RECIPE_SERIALIZER.register(modEventBus);
        RECIPE_TYPES.register(modEventBus);
        PolarisItems.register();
        PolarisBlocks.register();
        PolarisTileEntities.register();
        PolarisMenus.register();
        PolarisRecipeTypes.register();
    }
}
