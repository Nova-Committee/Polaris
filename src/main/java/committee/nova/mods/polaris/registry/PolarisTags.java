package committee.nova.mods.polaris.registry;


import committee.nova.mods.polaris.Polaris;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class PolarisTags {
    public static class Blocks {
        public static final TagKey<Block> NEEDS_REFINED_NETHER_TOOL = createTag("needs_refined_nether_tool");
        public static final TagKey<Block> NEEDS_STARS_TOOL = createTag("needs_stars_tool");

        private static TagKey<Block> createTag(String name){
            return BlockTags.create(Polaris.rl(name));
        }
        private static TagKey<Block> createForgeTag(String name){
            return BlockTags.create(new ResourceLocation("forge", name));
        }
    }
    public static class Items {

        private static TagKey<Item> createTag(String name){
            return ItemTags.create(Polaris.rl(name));
        }
        private static TagKey<Item> createForgeTag(String name){
            return ItemTags.create(new ResourceLocation("forge", name));
        }
    }
}
