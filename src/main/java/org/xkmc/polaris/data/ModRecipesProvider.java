package org.xkmc.polaris.data;

import net.minecraft.advancements.critereon.InventoryChangeTrigger;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import org.jetbrains.annotations.NotNull;
import org.xkmc.polaris.registry.PolarisItems;
import org.xkmc.polaris.registry.PolarisRecipeTypes;

import java.util.function.Consumer;

/**
 * @author cnlimiter
 */
public class ModRecipesProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipesProvider(PackOutput output) {
        super(output);
    }

    @Override
    protected void buildRecipes(@NotNull Consumer<FinishedRecipe> consumer) {
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Items.NETHERITE_INGOT), RecipeCategory.MISC, PolarisItems.NetherAlloyEssence.get(), 3f, 2400);
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(PolarisItems.NetherAlloyIngotEssence.get()), RecipeCategory.MISC, PolarisItems.EndEssence.get(), 3f, 3600);

        smithing(
                Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE,
                Items.NETHERITE_AXE,
                PolarisItems.NetherAlloyIngotEssence.get(),
                PolarisItems.refinedNetherAxe.get(),
                RecipeCategory.COMBAT, consumer);
        smithing(
                Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE,
                Items.NETHERITE_PICKAXE,
                PolarisItems.NetherAlloyIngotEssence.get(),
                PolarisItems.refinedNetherPickAxe.get(),
                RecipeCategory.COMBAT, consumer);
        smithing(
                Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE,
                Items.NETHERITE_SHOVEL,
                PolarisItems.NetherAlloyIngotEssence.get(),
                PolarisItems.refinedNetherShovel.get(),
                RecipeCategory.COMBAT, consumer);
        smithing(
                Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE,
                Items.NETHERITE_SWORD,
                PolarisItems.NetherAlloyIngotEssence.get(),
                PolarisItems.refinedNetherSword.get(),
                RecipeCategory.COMBAT, consumer);
        smithing(
                Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE,
                Items.NETHERITE_HOE,
                PolarisItems.NetherAlloyIngotEssence.get(),
                PolarisItems.refinedNetherHoe.get(),
                RecipeCategory.COMBAT, consumer);


        modSmithing(
                PolarisItems.ActivatingCore1.get(),
                Items.NETHERITE_HELMET,
                PolarisItems.MSBaseHelmet.get(),
                RecipeCategory.COMBAT, consumer);
        modSmithing(
                PolarisItems.ActivatingCore1.get(),
                Items.NETHERITE_CHESTPLATE,
                PolarisItems.MSBaseChest.get(),
                RecipeCategory.COMBAT, consumer);
        modSmithing(
                PolarisItems.ActivatingCore1.get(),
                Items.NETHERITE_LEGGINGS,
                PolarisItems.MSBaseLeggings.get(),
                RecipeCategory.COMBAT, consumer);
        modSmithing(
                PolarisItems.ActivatingCore1.get(),
                Items.NETHERITE_BOOTS,
                PolarisItems.MSBaseBoots.get(),
                RecipeCategory.COMBAT, consumer);

        modSmithing(
                PolarisItems.QingLongTemplate.get(),
                PolarisItems.MSBaseHelmet.get(),
                PolarisItems.MSBlueDragonHelmet.get(),
                RecipeCategory.COMBAT, consumer);
        modSmithing(
                PolarisItems.QingLongTemplate.get(),
                PolarisItems.MSBaseChest.get(),
                PolarisItems.MSBlueDragonChest.get(),
                RecipeCategory.COMBAT, consumer);
        modSmithing(
                PolarisItems.QingLongTemplate.get(),
                PolarisItems.MSBaseLeggings.get(),
                PolarisItems.MSBlueDragonLeggings.get(),
                RecipeCategory.COMBAT, consumer);
        modSmithing(
                PolarisItems.QingLongTemplate.get(),
                PolarisItems.MSBaseBoots.get(),
                PolarisItems.MSBlueDragonBoots.get(),
                RecipeCategory.COMBAT, consumer);

        modSmithing(
                PolarisItems.BaiHuTemplate.get(),
                PolarisItems.MSBaseHelmet.get(),
                PolarisItems.MSWhiteTigerHelmet.get(),
                RecipeCategory.COMBAT, consumer);
        modSmithing(
                PolarisItems.BaiHuTemplate.get(),
                PolarisItems.MSBaseChest.get(),
                PolarisItems.MSWhiteTigerChest.get(),
                RecipeCategory.COMBAT, consumer);
        modSmithing(
                PolarisItems.BaiHuTemplate.get(),
                PolarisItems.MSBaseLeggings.get(),
                PolarisItems.MSWhiteTigerLeggings.get(),
                RecipeCategory.COMBAT, consumer);
        modSmithing(
                PolarisItems.BaiHuTemplate.get(),
                PolarisItems.MSBaseBoots.get(),
                PolarisItems.MSWhiteTigerBoots.get(),
                RecipeCategory.COMBAT, consumer);

        modSmithing(
                PolarisItems.ZhuQueTemplate.get(),
                PolarisItems.MSBaseHelmet.get(),
                PolarisItems.MSVermilionBirdHelmet.get(),
                RecipeCategory.COMBAT, consumer);
        modSmithing(
                PolarisItems.ZhuQueTemplate.get(),
                PolarisItems.MSBaseChest.get(),
                PolarisItems.MSVermilionBirdChest.get(),
                RecipeCategory.COMBAT, consumer);
        modSmithing(
                PolarisItems.ZhuQueTemplate.get(),
                PolarisItems.MSBaseLeggings.get(),
                PolarisItems.MSVermilionBirdLeggings.get(),
                RecipeCategory.COMBAT, consumer);
        modSmithing(
                PolarisItems.ZhuQueTemplate.get(),
                PolarisItems.MSBaseBoots.get(),
                PolarisItems.MSVermilionBirdBoots.get(),
                RecipeCategory.COMBAT, consumer);

        modSmithing(
                PolarisItems.XuanWuTemplate.get(),
                PolarisItems.MSBaseHelmet.get(),
                PolarisItems.MSBlackTortoiseHelmet.get(),
                RecipeCategory.COMBAT, consumer);
        modSmithing(
                PolarisItems.XuanWuTemplate.get(),
                PolarisItems.MSBaseChest.get(),
                PolarisItems.MSBlackTortoiseChest.get(),
                RecipeCategory.COMBAT, consumer);
        modSmithing(
                PolarisItems.XuanWuTemplate.get(),
                PolarisItems.MSBaseLeggings.get(),
                PolarisItems.MSBlackTortoiseLeggings.get(),
                RecipeCategory.COMBAT, consumer);
        modSmithing(
                PolarisItems.XuanWuTemplate.get(),
                PolarisItems.MSBaseBoots.get(),
                PolarisItems.MSBlackTortoiseBoots.get(),
                RecipeCategory.COMBAT, consumer);

        modSmithing(
                PolarisItems.StardustTemplate.get(),
                PolarisItems.MSBaseHelmet.get(),
                PolarisItems.StardustHelmet.get(),
                RecipeCategory.COMBAT, consumer);
        modSmithing(
                PolarisItems.StardustTemplate.get(),
                PolarisItems.MSBaseChest.get(),
                PolarisItems.StardustChest.get(),
                RecipeCategory.COMBAT, consumer);
        modSmithing(
                PolarisItems.StardustTemplate.get(),
                PolarisItems.MSBaseLeggings.get(),
                PolarisItems.StardustLeggings.get(),
                RecipeCategory.COMBAT, consumer);
        modSmithing(
                PolarisItems.StardustTemplate.get(),
                PolarisItems.MSBaseBoots.get(),
                PolarisItems.StardustBoots.get(),
                RecipeCategory.COMBAT, consumer);

        modSmithing(
                PolarisItems.StarburstTemplate.get(),
                PolarisItems.MSBaseHelmet.get(),
                PolarisItems.StarburstHelmet.get(),
                RecipeCategory.COMBAT, consumer);
        modSmithing(
                PolarisItems.StarburstTemplate.get(),
                PolarisItems.MSBaseChest.get(),
                PolarisItems.StarburstChest.get(),
                RecipeCategory.COMBAT, consumer);
        modSmithing(
                PolarisItems.StarburstTemplate.get(),
                PolarisItems.MSBaseLeggings.get(),
                PolarisItems.StarburstLeggings.get(),
                RecipeCategory.COMBAT, consumer);
        modSmithing(
                PolarisItems.StarburstTemplate.get(),
                PolarisItems.MSBaseBoots.get(),
                PolarisItems.StarburstBoots.get(),
                RecipeCategory.COMBAT, consumer);

        modSmithing(
                PolarisItems.StarLordTemplate.get(),
                PolarisItems.MSBaseHelmet.get(),
                PolarisItems.StarLordHelmet.get(),
                RecipeCategory.COMBAT, consumer);
        modSmithing(
                PolarisItems.StarLordTemplate.get(),
                PolarisItems.MSBaseChest.get(),
                PolarisItems.StarLordChest.get(),
                RecipeCategory.COMBAT, consumer);
        modSmithing(
                PolarisItems.StarLordTemplate.get(),
                PolarisItems.MSBaseLeggings.get(),
                PolarisItems.StarLordLeggings.get(),
                RecipeCategory.COMBAT, consumer);
        modSmithing(
                PolarisItems.StarLordTemplate.get(),
                PolarisItems.MSBaseBoots.get(),
                PolarisItems.StarLordBoots.get(),
                RecipeCategory.COMBAT, consumer);

        //精炼下界合金锭
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, PolarisItems.NetherAlloyIngotEssence.get())
                .pattern(" x ")
                .pattern("xyx")
                .pattern(" x ")
                .define('x', PolarisItems.NetherAlloyEssence.get())
                .define('y', Items.IRON_INGOT)
                .unlockedBy("has_item", has(PolarisItems.NetherAlloyEssence.get())).save(consumer);
        //终极合金锭
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, PolarisItems.EndAlloyIngot.get())
                .pattern(" x ")
                .pattern("xyx")
                .pattern(" x ")
                .define('x', PolarisItems.EndEssence.get())
                .define('y', PolarisItems.NetherAlloyIngotEssence.get())
                .unlockedBy("has_item", has(PolarisItems.EndEssence.get())).save(consumer);

        //未激活符文核心1
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, PolarisItems.InactiveCore1.get())
                .pattern(" x ")
                .pattern("xyx")
                .pattern(" x ")
                .define('x', Items.NETHERITE_SCRAP)
                .define('y', PolarisItems.NetherAlloyIngotEssence.get())
                .unlockedBy("has_item", has(Items.NETHERITE_SCRAP)).save(consumer);

        //未激活符文核心2
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, PolarisItems.InactiveCore2.get())
                .pattern(" x ")
                .pattern("xyx")
                .pattern(" x ")
                .define('x', PolarisItems.ActivatingCore1.get())
                .define('y', PolarisItems.NetherAlloyIngotEssence.get())
                .unlockedBy("has_item", has(PolarisItems.ActivatingCore1.get())).save(consumer);

        //未激活符文核心3
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, PolarisItems.InactiveCore3.get())
                .pattern(" x ")
                .pattern("xyx")
                .pattern(" x ")
                .define('x', PolarisItems.ActivatingCore2.get())
                .define('y', PolarisItems.NetherAlloyIngotEssence.get())
                .unlockedBy("has_item", has(PolarisItems.ActivatingCore2.get())).save(consumer);

        //未激活符文核心4
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, PolarisItems.InactiveCore4.get())
                .pattern(" x ")
                .pattern("xyx")
                .pattern(" x ")
                .define('x', PolarisItems.ActivatingCore3.get())
                .define('y', PolarisItems.NetherAlloyIngotEssence.get())
                .unlockedBy("has_item", has(PolarisItems.ActivatingCore3.get())).save(consumer);

        //未激活神权核心
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, PolarisItems.InactiveCorePower.get())
                .pattern("a b")
                .pattern(" x ")
                .pattern("c d")
                .define('x', PolarisItems.SpiritOfDivinity.get())
                .define('a', PolarisItems.ActivatingCore1.get())
                .define('b', PolarisItems.ActivatingCore2.get())
                .define('c', PolarisItems.ActivatingCore3.get())
                .define('d', PolarisItems.ActivatingCore4.get())
                .unlockedBy("has_item", has(PolarisItems.SpiritOfDivinity.get())).save(consumer);

        //神性之灵
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, PolarisItems.SpiritOfDivinity.get())
                .pattern("aba")
                .pattern("bxb")
                .pattern("aba")
                .define('x', Items.TOTEM_OF_UNDYING)
                .define('a', PolarisItems.NetherStar.get())
                .define('b', Items.CONDUIT)
                .unlockedBy("has_item", has(PolarisItems.NetherStar.get())).save(consumer);

        //灵魂之炎
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, PolarisItems.FlameOfTheSoul.get())
                .pattern("aba")
                .pattern("bxb")
                .pattern("aba")
                .define('x', Items.NETHER_STAR)
                .define('a', Items.BLAZE_POWDER)
                .define('b', Items.GHAST_TEAR)
                .unlockedBy("has_item", has(Items.NETHER_STAR)).save(consumer);

        //璀璨下界之星
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, PolarisItems.NetherStar.get())
                .pattern("aba")
                .pattern("bxb")
                .pattern("aba")
                .define('x', Items.NETHER_STAR)
                .define('a', PolarisItems.FlameOfTheSoul.get())
                .define('b', Items.BLAZE_POWDER)
                .unlockedBy("has_item", has(PolarisItems.FlameOfTheSoul.get())).save(consumer);

        //星界之尘升级模板
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, PolarisItems.StardustTemplate.get())
                .pattern(" a ")
                .pattern("bxb")
                .pattern(" b ")
                .define('x', Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE)
                .define('a', PolarisItems.ActivatingCore2.get())
                .define('b', PolarisItems.NetherAlloyEssence.get())
                .unlockedBy("has_item", has(PolarisItems.ActivatingCore2.get())).save(consumer);

        //星界之辉升级模板
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, PolarisItems.StarburstTemplate.get())
                .pattern(" a ")
                .pattern("bxb")
                .pattern(" b ")
                .define('x', PolarisItems.StardustTemplate.get())
                .define('a', PolarisItems.ActivatingCore3.get())
                .define('b', PolarisItems.NetherAlloyIngotEssence.get())
                .unlockedBy("has_item", has(PolarisItems.ActivatingCore3.get())).save(consumer);

        //星界之主升级模板
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, PolarisItems.StarLordTemplate.get())
                .pattern("cac")
                .pattern("bxb")
                .pattern("cbc")
                .define('x', PolarisItems.StarburstTemplate.get())
                .define('a', PolarisItems.ActivatingCore4.get())
                .define('b', PolarisItems.EndAlloyIngot.get())
                .define('c', PolarisItems.NetherStar.get())
                .unlockedBy("has_item", has(PolarisItems.ActivatingCore4.get())).save(consumer);

        //创世头盔
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, PolarisItems.SupremeGenesisHelmet.get())
                .pattern("afb")
                .pattern("exe")
                .pattern("cgd")
                .define('x', PolarisItems.StarLordHelmet.get())
                .define('a', PolarisItems.MSBlueDragonHelmet.get())
                .define('b', PolarisItems.MSWhiteTigerHelmet.get())
                .define('c', PolarisItems.MSVermilionBirdHelmet.get())
                .define('d', PolarisItems.MSBlackTortoiseHelmet.get())
                .define('e', PolarisItems.NetherStar.get())
                .define('f', PolarisItems.ActivatingCorePower.get())
                .define('g', PolarisItems.SpiritOfDivinity.get())
                .unlockedBy("has_item", has(PolarisItems.StarLordHelmet.get())).save(consumer);
        //创世胸甲
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, PolarisItems.SupremeGenesisChest.get())
                .pattern("afb")
                .pattern("exe")
                .pattern("cgd")
                .define('x', PolarisItems.StarLordChest.get())
                .define('a', PolarisItems.MSBlueDragonChest.get())
                .define('b', PolarisItems.MSWhiteTigerChest.get())
                .define('c', PolarisItems.MSVermilionBirdChest.get())
                .define('d', PolarisItems.MSBlackTortoiseChest.get())
                .define('e', PolarisItems.NetherStar.get())
                .define('f', PolarisItems.ActivatingCorePower.get())
                .define('g', PolarisItems.SpiritOfDivinity.get())
                .unlockedBy("has_item", has(PolarisItems.StarLordChest.get())).save(consumer);
        //创世腿甲
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, PolarisItems.SupremeGenesisLeggings.get())
                .pattern("afb")
                .pattern("exe")
                .pattern("cgd")
                .define('x', PolarisItems.StarLordLeggings.get())
                .define('a', PolarisItems.MSBlueDragonLeggings.get())
                .define('b', PolarisItems.MSWhiteTigerLeggings.get())
                .define('c', PolarisItems.MSVermilionBirdLeggings.get())
                .define('d', PolarisItems.MSBlackTortoiseLeggings.get())
                .define('e', PolarisItems.NetherStar.get())
                .define('f', PolarisItems.ActivatingCorePower.get())
                .define('g', PolarisItems.SpiritOfDivinity.get())
                .unlockedBy("has_item", has(PolarisItems.StarLordLeggings.get())).save(consumer);
        //创世靴子
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, PolarisItems.SupremeGenesisBoots.get())
                .pattern("afb")
                .pattern("exe")
                .pattern("cgd")
                .define('x', PolarisItems.StarLordBoots.get())
                .define('a', PolarisItems.MSBlueDragonBoots.get())
                .define('b', PolarisItems.MSWhiteTigerBoots.get())
                .define('c', PolarisItems.MSVermilionBirdBoots.get())
                .define('d', PolarisItems.MSBlackTortoiseBoots.get())
                .define('e', PolarisItems.NetherStar.get())
                .define('f', PolarisItems.ActivatingCorePower.get())
                .define('g', PolarisItems.SpiritOfDivinity.get())
                .unlockedBy("has_item", has(PolarisItems.StarLordBoots.get())).save(consumer);

        //星界之斧
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, PolarisItems.starAxe.get())
                .pattern(" a ")
                .pattern(" x ")
                .pattern(" b ")
                .define('x', PolarisItems.EndAlloyIngot.get())
                .define('a', PolarisItems.refinedNetherAxe.get())
                .define('b', PolarisItems.SpiritOfDivinity.get())
                .unlockedBy("has_item", has(PolarisItems.refinedNetherAxe.get())).save(consumer);
        //星界之铲
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, PolarisItems.starShovel.get())
                .pattern(" a ")
                .pattern(" x ")
                .pattern(" b ")
                .define('x', PolarisItems.EndAlloyIngot.get())
                .define('a', PolarisItems.refinedNetherShovel.get())
                .define('b', PolarisItems.SpiritOfDivinity.get())
                .unlockedBy("has_item", has(PolarisItems.refinedNetherShovel.get())).save(consumer);
        //星界之镐
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, PolarisItems.starPickAxe.get())
                .pattern(" a ")
                .pattern(" x ")
                .pattern(" b ")
                .define('x', PolarisItems.EndAlloyIngot.get())
                .define('a', PolarisItems.refinedNetherPickAxe.get())
                .define('b', PolarisItems.SpiritOfDivinity.get())
                .unlockedBy("has_item", has(PolarisItems.refinedNetherPickAxe.get())).save(consumer);
        //星界之锄
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, PolarisItems.starHoe.get())
                .pattern(" a ")
                .pattern(" x ")
                .pattern(" b ")
                .define('x', PolarisItems.EndAlloyIngot.get())
                .define('a', PolarisItems.refinedNetherHoe.get())
                .define('b', PolarisItems.SpiritOfDivinity.get())
                .unlockedBy("has_item", has(PolarisItems.refinedNetherHoe.get())).save(consumer);
        //星界之剑
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, PolarisItems.starSword.get())
                .pattern(" a ")
                .pattern(" x ")
                .pattern(" b ")
                .define('x', PolarisItems.EndAlloyIngot.get())
                .define('a', PolarisItems.refinedNetherSword.get())
                .define('b', PolarisItems.SpiritOfDivinity.get())
                .unlockedBy("has_item", has(PolarisItems.refinedNetherSword.get())).save(consumer);
    }

    protected static InventoryChangeTrigger.TriggerInstance has(@NotNull TagKey<Item> tagKey) {
        return inventoryTrigger(ItemPredicate.Builder.item().of(tagKey).build());
    }

    public static SimpleCookingRecipeBuilder netherFurnace(Ingredient pIngredient, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime) {
        return SimpleCookingRecipeBuilder.generic(pIngredient, pCategory, pResult, pExperience, pCookingTime, PolarisRecipeTypes.OBSIDIAN_FURNACE_SERIALIZER.get());
    }

    protected static void modSmithing(Item pTemplateItem, Item pBaseItem, Item pResultItem, RecipeCategory pCategory, Consumer<FinishedRecipe> pFinishedRecipeConsumer) {
        SmithingTransformRecipeBuilder.smithing(Ingredient.of(pTemplateItem), Ingredient.of(pBaseItem), Ingredient.of(PolarisItems.FlameOfTheSoul.get()), pCategory, pResultItem).unlocks("has_item", has(pBaseItem)).save(pFinishedRecipeConsumer, getItemName(pResultItem) + "_smithing");
    }

    protected static void smithing(Item pTemplateItem, Item pBaseItem, Item pAdditonItem, Item pResultItem, RecipeCategory pCategory, Consumer<FinishedRecipe> pFinishedRecipeConsumer) {
        SmithingTransformRecipeBuilder.smithing(Ingredient.of(pTemplateItem), Ingredient.of(pBaseItem), Ingredient.of(pAdditonItem), pCategory, pResultItem).unlocks("has_item", has(pBaseItem)).save(pFinishedRecipeConsumer, getItemName(pResultItem) + "_smithing");
    }
}
