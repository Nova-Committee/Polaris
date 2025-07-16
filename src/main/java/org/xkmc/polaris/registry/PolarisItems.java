package org.xkmc.polaris.registry;



import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SmithingTemplateItem;
import net.minecraftforge.registries.RegistryObject;
import org.xkmc.polaris.Polaris;
import org.xkmc.polaris.common.item.armors.FlyingArmors.*;
import org.xkmc.polaris.common.item.armors.MSArmor.*;
import org.xkmc.polaris.common.item.armors.StarCommonArmors;
import org.xkmc.polaris.common.item.tools.end_essence.*;
import org.xkmc.polaris.common.item.tools.stars.*;

public class PolarisItems {


    //已删除
//    public static final RegistryObject<Item> HeartOfOre = Registration.item("heart_of_ore",
//            () -> new Item(new Item.Properties().durability(300)));

    //已删除
//    public static final RegistryObject<Item> PurgatorySoil = Registration.item("purgatory_soil",
//            () -> new Item(new Item.Properties()));

    //已删除
//    public static final RegistryObject<Item> DemonSoul = Registration.item("demon_soul",
//            () -> new Item(new Item.Properties()));

    //已删除
//    public static final RegistryObject<Item> TheSoilOfEverything = Registration.item(
//            "the_soil_of_everything",
//            () -> new Item(new Item.Properties().durability(500)));

    public static final RegistryObject<Item> NetherStar = Registration.item("nether_star",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> SpiritOfBright = Registration.item("spirit_of_bright",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> EndAlloyIngot = Registration.item("end_alloy_ingot",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> EndEssence = Registration.item(
            "end_essence",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> NetherAlloyIngotEssence = Registration.item(
            "nether_alloy_ingot_essence",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> NetherAlloyEssence = Registration.item(
            "nether_alloy_essence",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> ActivatingCore1 = Registration.item("activating_core_1",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> ActivatingCore2 = Registration.item("activating_core_2",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> ActivatingCore3 = Registration.item("activating_core_3",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> ActivatingCore4 = Registration.item("activating_core_4",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> ActivatingCorePower = Registration.item(
            "activating_core_power",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> InactiveCore1 = Registration.item("inactive_core_1",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> InactiveCore2 = Registration.item("inactive_core_2",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> InactiveCore3 = Registration.item("inactive_core_3",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> InactiveCore4 = Registration.item("inactive_core_4",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> InactiveCorePower = Registration.item("inactive_core_power",
            () -> new Item(new Item.Properties()));

    //已删除
//    public static final RegistryObject<Item> TheVoidOfSource = Registration.item("the_void_of_source",
//            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> FlameOfTheSoul = Registration.item("flame_of_the_soul",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> SpiritOfDivinity = Registration.item("spirit_of_divinity",
            () -> new Item(new Item.Properties().durability(300)));


    //已删除
//    public static final RegistryObject<Item> LifeOfSeeds = Registration.item("life_of_seeds",
//            () -> new Item(new Item.Properties().durability(300)));

//    public static final RegistryObject<Item> CryingGhost = Registration.item("crying_ghost",
//            () -> new Item(new Item.Properties()));

    //已删除
//    public static final RegistryObject<Item> StarCoin1 = Registration.item("star_coin_1",
//            () -> new Item(new Item.Properties()));
//
//    public static final RegistryObject<Item> StarCoin2 = Registration.item("star_coin_2",
//            () -> new Item(new Item.Properties()));
//
//    public static final RegistryObject<Item> StarCoin3 = Registration.item("star_coin_3",
//            () -> new Item(new Item.Properties()));
//
//    public static final RegistryObject<Item> StarCoin4 = Registration.item("star_coin_4",
//            () -> new Item(new Item.Properties()));
//
//    public static final RegistryObject<Item> StarCoin5 = Registration.item("star_coin_5",
//            () -> new Item(new Item.Properties()));
//
//    public static final RegistryObject<Item> StarCoin6 = Registration.item("star_coin_6",
//            () -> new Item(new Item.Properties()));
//
//    public static final RegistryObject<Item> StarCoin7 = Registration.item("star_coin_7",
//            () -> new Item(new Item.Properties()));

//    public static final RegistryObject<Item> StarCoin8 = Registration.item("star_coin_8",
//            () -> new Item(new Item.Properties()));


    public static final RegistryObject<Item> StardustHelmet = Registration.armorItem("stardust_helmet",
            () -> new StarCommonArmors(PolarisArmorMaterial.STARDUST, ArmorItem.Type.HELMET, new Item.Properties()));

    public static final RegistryObject<Item> StardustChest = Registration.armorItem("stardust_chestplate",
            () -> new StarCommonArmors(PolarisArmorMaterial.STARDUST,  ArmorItem.Type.CHESTPLATE, new Item.Properties()));

    public static final RegistryObject<Item> StardustLeggings = Registration.armorItem("stardust_leggings",
            () -> new StarCommonArmors(PolarisArmorMaterial.STARDUST, ArmorItem.Type.LEGGINGS, new Item.Properties()));

    public static final RegistryObject<Item> StardustBoots = Registration.armorItem("stardust_boots",
            () -> new StarCommonArmors(PolarisArmorMaterial.STARDUST, ArmorItem.Type.BOOTS, new Item.Properties()));


    public static final RegistryObject<Item> StarburstHelmet = Registration.armorItem("starburst_helmet",
            () -> new StarCommonArmors(PolarisArmorMaterial.STARBURST, ArmorItem.Type.HELMET, new Item.Properties()));

    public static final RegistryObject<Item> StarburstChest = Registration.armorItem("starburst_chestplate",
            () -> new StarCommonArmors(PolarisArmorMaterial.STARBURST, ArmorItem.Type.CHESTPLATE, new Item.Properties()));

    public static final RegistryObject<Item> StarburstLeggings = Registration.armorItem("starburst_leggings",
            () -> new StarCommonArmors(PolarisArmorMaterial.STARBURST, ArmorItem.Type.LEGGINGS, new Item.Properties()));

    public static final RegistryObject<Item> StarburstBoots = Registration.armorItem("starburst_boots",
            () -> new StarCommonArmors(PolarisArmorMaterial.STARBURST, ArmorItem.Type.BOOTS, new Item.Properties()));



    public static final RegistryObject<Item> StarLordHelmet = Registration.armorItem("star_lord_helmet",
            () -> new StarLordArmors(PolarisArmorMaterial.STAR_LORD, ArmorItem.Type.HELMET, new Item.Properties().setNoRepair()));

    public static final RegistryObject<Item> StarLordChest = Registration.armorItem("star_lord_chestplate",
            () -> new StarLordArmors(PolarisArmorMaterial.STAR_LORD,  ArmorItem.Type.CHESTPLATE, new Item.Properties().setNoRepair()));

    public static final RegistryObject<Item> StarLordLeggings = Registration.armorItem("star_lord_leggings",
            () -> new StarLordArmors(PolarisArmorMaterial.STAR_LORD, ArmorItem.Type.LEGGINGS, new Item.Properties().setNoRepair()));

    public static final RegistryObject<Item> StarLordBoots = Registration.armorItem("star_lord_boots",
            () -> new StarLordArmors(PolarisArmorMaterial.STAR_LORD, ArmorItem.Type.BOOTS, new Item.Properties().setNoRepair()));


    public static final RegistryObject<Item> MSBaseHelmet = Registration.armorItem("ms_base_helmet",
            () -> new ArmorItem(PolarisArmorMaterial.MSBase, ArmorItem.Type.HELMET, new Item.Properties()));

    public static final RegistryObject<Item> MSBaseChest = Registration.armorItem("ms_base_chestplate",
            () -> new ArmorItem(PolarisArmorMaterial.MSBase,  ArmorItem.Type.CHESTPLATE, new Item.Properties()));

    public static final RegistryObject<Item> MSBaseLeggings = Registration.armorItem("ms_base_leggings",
            () -> new ArmorItem(PolarisArmorMaterial.MSBase, ArmorItem.Type.LEGGINGS, new Item.Properties()));

    public static final RegistryObject<Item> MSBaseBoots = Registration.armorItem("ms_base_boots",
            () -> new ArmorItem(PolarisArmorMaterial.MSBase, ArmorItem.Type.BOOTS, new Item.Properties()));



    public static final RegistryObject<Item> MSWhiteTigerHelmet = Registration.armorItem("ms_white_tiger_helmet",
            () -> new WhiteTigerArmors(PolarisArmorMaterial.MSWhiteTiger, ArmorItem.Type.HELMET, new Item.Properties()));

    public static final RegistryObject<Item> MSWhiteTigerChest = Registration.armorItem("ms_white_tiger_chestplate",
            () -> new WhiteTigerArmors(PolarisArmorMaterial.MSWhiteTiger,  ArmorItem.Type.CHESTPLATE, new Item.Properties()));

    public static final RegistryObject<Item> MSWhiteTigerLeggings = Registration.armorItem("ms_white_tiger_leggings",
            () -> new WhiteTigerArmors(PolarisArmorMaterial.MSWhiteTiger, ArmorItem.Type.LEGGINGS,new Item.Properties()));

    public static final RegistryObject<Item> MSWhiteTigerBoots = Registration.armorItem("ms_white_tiger_boots",
            () -> new WhiteTigerArmors(PolarisArmorMaterial.MSWhiteTiger, ArmorItem.Type.BOOTS, new Item.Properties()));


    public static final RegistryObject<Item> MSBlueDragonHelmet = Registration.armorItem("ms_blue_dragon_helmet",
            () -> new BlueDragonArmors(PolarisArmorMaterial.MSBlueDragon, ArmorItem.Type.HELMET, new Item.Properties()));

    public static final RegistryObject<Item> MSBlueDragonChest = Registration.armorItem("ms_blue_dragon_chestplate",
            () -> new BlueDragonArmors(PolarisArmorMaterial.MSBlueDragon,  ArmorItem.Type.CHESTPLATE, new Item.Properties()));

    public static final RegistryObject<Item> MSBlueDragonLeggings = Registration.armorItem("ms_blue_dragon_leggings",
            () -> new BlueDragonArmors(PolarisArmorMaterial.MSBlueDragon, ArmorItem.Type.LEGGINGS, new Item.Properties()));

    public static final RegistryObject<Item> MSBlueDragonBoots = Registration.armorItem("ms_blue_dragon_boots",
            () -> new BlueDragonArmors(PolarisArmorMaterial.MSBlueDragon, ArmorItem.Type.BOOTS, new Item.Properties()));


    public static final RegistryObject<Item> MSVermilionBirdHelmet = Registration.armorItem("ms_vermilion_bird_helmet",
            () -> new VermilionBirdArmors(PolarisArmorMaterial.MSVermilionBird, ArmorItem.Type.HELMET, new Item.Properties()));

    public static final RegistryObject<Item> MSVermilionBirdChest = Registration.armorItem("ms_vermilion_bird_chestplate",
            () -> new VermilionBirdArmors(PolarisArmorMaterial.MSVermilionBird,  ArmorItem.Type.CHESTPLATE, new Item.Properties()));

    public static final RegistryObject<Item> MSVermilionBirdLeggings = Registration.armorItem("ms_vermilion_bird_leggings",
            () -> new VermilionBirdArmors(PolarisArmorMaterial.MSVermilionBird, ArmorItem.Type.LEGGINGS, new Item.Properties()));

    public static final RegistryObject<Item> MSVermilionBirdBoots = Registration.armorItem("ms_vermilion_bird_boots",
            () -> new VermilionBirdArmors(PolarisArmorMaterial.MSVermilionBird, ArmorItem.Type.BOOTS, new Item.Properties()));


    public static final RegistryObject<Item> MSBlackTortoiseHelmet = Registration.armorItem("ms_black_tortoise_helmet",
            () -> new BlackTortoiseArmors(PolarisArmorMaterial.MSBlackTortoise, ArmorItem.Type.HELMET, new Item.Properties()));

    public static final RegistryObject<Item> MSBlackTortoiseChest = Registration.armorItem("ms_black_tortoise_chestplate",
            () -> new BlackTortoiseArmors(PolarisArmorMaterial.MSBlackTortoise,  ArmorItem.Type.CHESTPLATE, new Item.Properties()));

    public static final RegistryObject<Item> MSBlackTortoiseLeggings = Registration.armorItem("ms_black_tortoise_leggings",
            () -> new BlackTortoiseArmors(PolarisArmorMaterial.MSBlackTortoise, ArmorItem.Type.LEGGINGS, new Item.Properties()));

    public static final RegistryObject<Item> MSBlackTortoiseBoots = Registration.armorItem("ms_black_tortoise_boots",
            () -> new BlackTortoiseArmors(PolarisArmorMaterial.MSBlackTortoise, ArmorItem.Type.BOOTS, new Item.Properties()));




    public static final RegistryObject<Item> SupremeGenesisHelmet = Registration.armorItem("supreme_genesis_helmet",
            () -> new SupremeGenesisArmors(PolarisArmorMaterial.SupremeGenesis, ArmorItem.Type.HELMET, new Item.Properties().setNoRepair()));

    public static final RegistryObject<Item> SupremeGenesisChest = Registration.armorItem("supreme_genesis_chestplate",
            () -> new SupremeGenesisArmors(PolarisArmorMaterial.SupremeGenesis,  ArmorItem.Type.CHESTPLATE, new Item.Properties().setNoRepair()));

    public static final RegistryObject<Item> SupremeGenesisLeggings = Registration.armorItem("supreme_genesis_leggings",
            () -> new SupremeGenesisArmors(PolarisArmorMaterial.SupremeGenesis, ArmorItem.Type.LEGGINGS, new Item.Properties().setNoRepair()));

    public static final RegistryObject<Item> SupremeGenesisBoots = Registration.armorItem("supreme_genesis_boots",
            () -> new SupremeGenesisArmors(PolarisArmorMaterial.SupremeGenesis, ArmorItem.Type.BOOTS, new Item.Properties().setNoRepair()));
    //已删除
//    public static final RegistryObject<Item> SupremeGenesisWhiteHelmet = Registration.armorItem("supreme_genesis_white_helmet",
//            () -> new ArmorItem(PolarisArmorMaterial.SupremeGenesisWhite, ArmorItem.Type.HELMET, new Item.Properties()));
//
//    public static final RegistryObject<Item> SupremeGenesisWhiteChest = Registration.armorItem("supreme_genesis_white_chestplate",
//            () -> new ArmorItem(PolarisArmorMaterial.SupremeGenesisWhite,  ArmorItem.Type.CHESTPLATE, new Item.Properties()));
//
//    public static final RegistryObject<Item> SupremeGenesisWhiteLeggings = Registration.armorItem("supreme_genesis_white_leggings",
//            () -> new ArmorItem(PolarisArmorMaterial.SupremeGenesisWhite, ArmorItem.Type.LEGGINGS, new Item.Properties()));
//
//    public static final RegistryObject<Item> SupremeGenesisWhiteBoots = Registration.armorItem("supreme_genesis_white_boots",
//            () -> new ArmorItem(PolarisArmorMaterial.SupremeGenesisWhite, ArmorItem.Type.BOOTS, new Item.Properties()));


    public static final RegistryObject<Item> EmperorsNewClothesHelmet = Registration.armorItem("emperors_new_clothes_helmet",
            () -> new ArmorItem(PolarisArmorMaterial.EmperorsNewClothes, ArmorItem.Type.HELMET, new Item.Properties()));

    public static final RegistryObject<Item> EmperorsNewClothesChest = Registration.armorItem("emperors_new_clothes_chestplate",
            () -> new ArmorItem(PolarisArmorMaterial.EmperorsNewClothes,  ArmorItem.Type.CHESTPLATE, new Item.Properties()));

    public static final RegistryObject<Item> EmperorsNewClothesLeggings = Registration.armorItem("emperors_new_clothes_leggings",
            () -> new ArmorItem(PolarisArmorMaterial.EmperorsNewClothes, ArmorItem.Type.LEGGINGS, new Item.Properties()));

    public static final RegistryObject<Item> EmperorsNewClothesBoots = Registration.armorItem("emperors_new_clothes_boots",
            () -> new ArmorItem(PolarisArmorMaterial.EmperorsNewClothes, ArmorItem.Type.BOOTS, new Item.Properties()));


    public static final RegistryObject<Item> LittleCatPinkHelmet = Registration.armorItem("little_cat_pink_helmet",
            () -> new ArmorItem(PolarisArmorMaterial.LittleCatPink, ArmorItem.Type.HELMET, new Item.Properties()));

    public static final RegistryObject<Item> LittleCatPinkChest = Registration.armorItem("little_cat_pink_chestplate",
            () -> new ArmorItem(PolarisArmorMaterial.LittleCatPink,  ArmorItem.Type.CHESTPLATE, new Item.Properties()));

    public static final RegistryObject<Item> LittleCatPinkLeggings = Registration.armorItem("little_cat_pink_leggings",
            () -> new ArmorItem(PolarisArmorMaterial.LittleCatPink, ArmorItem.Type.LEGGINGS, new Item.Properties()));

    public static final RegistryObject<Item> LittleCatPinkBoots = Registration.armorItem("little_cat_pink_boots",
            () -> new ArmorItem(PolarisArmorMaterial.LittleCatPink, ArmorItem.Type.BOOTS, new Item.Properties()));


    public static final RegistryObject<Item> LittleCatBlueHelmet = Registration.armorItem("little_cat_blue_helmet",
            () -> new ArmorItem(PolarisArmorMaterial.LittleCatBlue, ArmorItem.Type.HELMET, new Item.Properties()));

    public static final RegistryObject<Item> LittleCatBlueChest = Registration.armorItem("little_cat_blue_chestplate",
            () -> new ArmorItem(PolarisArmorMaterial.LittleCatBlue,  ArmorItem.Type.CHESTPLATE, new Item.Properties()));

    public static final RegistryObject<Item> LittleCatBlueLeggings = Registration.armorItem("little_cat_blue_leggings",
            () -> new ArmorItem(PolarisArmorMaterial.LittleCatBlue, ArmorItem.Type.LEGGINGS, new Item.Properties()));

    public static final RegistryObject<Item> LittleCatBlueBoots = Registration.armorItem("little_cat_blue_boots",
            () -> new ArmorItem(PolarisArmorMaterial.LittleCatBlue, ArmorItem.Type.BOOTS, new Item.Properties()));


    public static final RegistryObject<Item> LittleCatYellowHelmet = Registration.armorItem("little_cat_yellow_helmet",
            () -> new ArmorItem(PolarisArmorMaterial.LittleCatYellow, ArmorItem.Type.HELMET, new Item.Properties()));

    public static final RegistryObject<Item> LittleCatYellowChest = Registration.armorItem("little_cat_yellow_chestplate",
            () -> new ArmorItem(PolarisArmorMaterial.LittleCatYellow,  ArmorItem.Type.CHESTPLATE, new Item.Properties()));

    public static final RegistryObject<Item> LittleCatYellowLeggings = Registration.armorItem("little_cat_yellow_leggings",
            () -> new ArmorItem(PolarisArmorMaterial.LittleCatYellow, ArmorItem.Type.LEGGINGS, new Item.Properties()));

    public static final RegistryObject<Item> LittleCatYellowBoots = Registration.armorItem("little_cat_yellow_boots",
            () -> new ArmorItem(PolarisArmorMaterial.LittleCatYellow, ArmorItem.Type.BOOTS, new Item.Properties()));


    public static final RegistryObject<Item> QingLongTemplate = Registration.item("qing_long_template",
            () -> SmithingTemplateItem.createArmorTrimTemplate(Polaris.rl("qing_long")));
    public static final RegistryObject<Item> BaiHuTemplate = Registration.item("bai_hu_template",
            () -> SmithingTemplateItem.createArmorTrimTemplate(Polaris.rl("bai_hu")));
    public static final RegistryObject<Item> ZhuQueTemplate = Registration.item("zhu_que_template",
            () -> SmithingTemplateItem.createArmorTrimTemplate(Polaris.rl("zhu_que")));
    public static final RegistryObject<Item> XuanWuTemplate = Registration.item("xuan_wu_template",
            () -> SmithingTemplateItem.createArmorTrimTemplate(Polaris.rl("xuan_wu")));
    public static final RegistryObject<Item> StardustTemplate = Registration.item("stardust_template",
            () -> SmithingTemplateItem.createArmorTrimTemplate(Polaris.rl("stardust")));
    public static final RegistryObject<Item> StarburstTemplate = Registration.item("starburst_template",
            () -> SmithingTemplateItem.createArmorTrimTemplate(Polaris.rl("starburst")));
    public static final RegistryObject<Item> StarLordTemplate = Registration.item("star_lord_template",
            () -> SmithingTemplateItem.createArmorTrimTemplate(Polaris.rl("star_lord")));

    public static final RegistryObject<Item> refinedNetherAxe = Registration.item("refined_nether_axe",
            RefinedNetherAxe::new);
    public static final RegistryObject<Item> refinedNetherPickAxe = Registration.item("refined_nether_pickaxe",
            RefinedNetherPickaxe::new);
    public static final RegistryObject<Item> refinedNetherSword = Registration.item("refined_nether_sword",
            RefinedNetherSword::new);
    public static final RegistryObject<Item> refinedNetherHoe = Registration.item("refined_nether_hoe",
            RefinedNetherHoe::new);
    public static final RegistryObject<Item> refinedNetherShovel = Registration.item("refined_nether_shovel",
            RefinedNetherShovel::new);

    public static final RegistryObject<Item> starAxe = Registration.item("star_axe",
            StarAxe::new);
    public static final RegistryObject<Item> starPickAxe = Registration.item("star_pickaxe",
            StarPickaxe::new);
    public static final RegistryObject<Item> starSword = Registration.item("star_sword",
            StarSword::new);
    public static final RegistryObject<Item> starHoe = Registration.item("star_hoe",
            StarHoe::new);
    public static final RegistryObject<Item> starShovel = Registration.item("star_shovel",
            StarShovel::new);
    public static void register() {
    }

}
