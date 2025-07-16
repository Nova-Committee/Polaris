package committee.nova.mods.polaris.registry;

import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraftforge.registries.RegistryObject;

import java.util.ArrayList;
import java.util.List;

import static committee.nova.mods.polaris.registry.Registration.TABS;

public class PolarisTabs {
    public static final List<RegistryObject<Item>> ACCEPT_ITEM = new ArrayList<>();

    public static final RegistryObject<CreativeModeTab> TAB_POLARIS_MISCELLANEOUS = TABS.register("polaris_miscellaneous", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.tab.polaris_miscellaneous"))
            .icon(() -> PolarisItems.NetherStar.get().getDefaultInstance())
            .displayItems((parameters, output) -> {
                for (var item : ACCEPT_ITEM){
                    output.accept(item.get());
                }

            })
            .build());
//    public static final List<RegistryObject<BlockItem>> ACCEPT_BLOCKS = new ArrayList<>();
//
//    public static final RegistryObject<CreativeModeTab> TAB_POLARIS_BLOCKS = TABS.register("polaris_blocks", () -> CreativeModeTab.builder()
//            .title(Component.translatable("itemGroup.tab.polaris_blocks"))
//            .icon(() -> PolarisBlocks.ObsidianNetherFurnace.get().asItem().getDefaultInstance())
//            .displayItems((parameters, output) -> {
//                for (var item : ACCEPT_BLOCKS){
//                    output.accept(item.get());
//                }
//
//            })
//            .build());
    public static final List<RegistryObject<Item>> ACCEPT_ARMORS = new ArrayList<>();

    public static final RegistryObject<CreativeModeTab> TAB_POLARIS_ARMORS = TABS.register("polaris_armors", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.tab.polaris_armors"))
            .icon(Items.DIAMOND_HELMET::getDefaultInstance)
            .displayItems((parameters, output) -> {
                for (var item : ACCEPT_ARMORS){
                    output.accept(item.get());
                }

            })
            .build());
}
