package org.xkmc.polaris.data;

import com.google.common.collect.ImmutableList;
import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.data.loot.packs.VanillaLootTableProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import org.jetbrains.annotations.NotNull;
import org.xkmc.polaris.data.loot.ModChestLootProvider;

import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * @author cnlimiter
 */
public class ModLootTableProvider extends LootTableProvider {
    public ModLootTableProvider(PackOutput pOutput) {
        super(pOutput, Collections.emptySet(), VanillaLootTableProvider.create(pOutput).getTables());
    }

    @Override
    public @NotNull List<SubProviderEntry> getTables() {
        return ImmutableList.of(
                new LootTableProvider.SubProviderEntry(ModChestLootProvider::new, LootContextParamSets.CHEST)
        );
    }
}
