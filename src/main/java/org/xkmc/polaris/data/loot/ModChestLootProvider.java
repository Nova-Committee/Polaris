package org.xkmc.polaris.data.loot;

import net.minecraft.data.loot.LootTableSubProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.storage.loot.BuiltInLootTables;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import org.xkmc.polaris.registry.PolarisItems;

import java.util.function.BiConsumer;

/**
 * @author cnlimiter
 */
public class ModChestLootProvider implements LootTableSubProvider {
    @Override
    public void generate(BiConsumer<ResourceLocation, LootTable.Builder> pOutput) {
        pOutput.accept(BuiltInLootTables.SIMPLE_DUNGEON,
                LootTable.lootTable()
                        .withPool(LootPool.lootPool().setRolls(
                                UniformGenerator.between(1.0F, 1.5F))
                                .add(LootItem.lootTableItem(PolarisItems.QingLongTemplate.get()).setWeight(1))
                                .add(LootItem.lootTableItem(PolarisItems.BaiHuTemplate.get()).setWeight(1))
                                .add(LootItem.lootTableItem(PolarisItems.ZhuQueTemplate.get()).setWeight(1))
                                .add(LootItem.lootTableItem(PolarisItems.XuanWuTemplate.get()).setWeight(1))
                        )
        );
    }
}
