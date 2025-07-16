package committee.nova.mods.polaris.data;

import com.google.common.collect.ImmutableList;
import committee.nova.mods.polaris.data.loot.ModChestLootProvider;
import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.data.loot.packs.VanillaLootTableProvider;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import org.jetbrains.annotations.NotNull;

import java.util.Collections;
import java.util.List;

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
