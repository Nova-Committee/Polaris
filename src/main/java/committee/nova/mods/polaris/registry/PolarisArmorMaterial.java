package committee.nova.mods.polaris.registry;


import committee.nova.mods.polaris.Polaris;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.LazyLoadedValue;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;
import org.jetbrains.annotations.NotNull;

import java.util.function.Supplier;

public enum PolarisArmorMaterial implements ArmorMaterial {
    STARDUST("stardust", 5, new int[]{3, 8, 6, 3}, 15,
            SoundEvents.ARMOR_EQUIP_DIAMOND, 3.0F, 0.1F, new float[]{2, 2, 2, 2}, Ingredient::of),
    STARBURST("starburst", 5, new int[]{3, 9, 6, 3}, 15,
            SoundEvents.ARMOR_EQUIP_NETHERITE, 3.0F, 0.125F, new float[]{2, 4, 4, 2}, Ingredient::of),
    STAR_LORD("star_lord", 5, new int[]{4, 9, 7, 4}, 15,
            SoundEvents.ARMOR_EQUIP_NETHERITE, 4.0F, 0.15F, new float[]{4, 4, 4, 4}, Ingredient::of),
    MSBase("ms_base", 5, new int[]{3, 8, 6, 3}, 15,
            SoundEvents.ARMOR_EQUIP_NETHERITE, 3.0F, 0.1F, new float[]{2, 2, 2, 2}, Ingredient::of),
    MSWhiteTiger("ms_white_tiger", 5, new int[]{4, 9, 7, 4}, 15,
            SoundEvents.ARMOR_EQUIP_NETHERITE, 3.0F, 0.1F, new float[]{2, 4, 2, 2}, Ingredient::of),
    MSBlueDragon("ms_blue_dragon", 5, new int[]{4, 9, 7, 4}, 15,
            SoundEvents.ARMOR_EQUIP_NETHERITE, 3.0F, 0.1F, new float[]{2, 4, 2, 2}, Ingredient::of),
    MSVermilionBird("ms_vermilion_bird", 5, new int[]{3, 8, 6, 3}, 15,
            SoundEvents.ARMOR_EQUIP_NETHERITE, 3.0F, 0.1F, new float[]{2, 4, 2, 2}, Ingredient::of),
    MSBlackTortoise("ms_black_tortoise", 5, new int[]{4, 9, 7, 4}, 15,
            SoundEvents.ARMOR_EQUIP_NETHERITE, 3.5F, 0.2F, new float[]{4, 4, 4, 4}, Ingredient::of),
    SupremeGenesis("supreme_genesis", 5, new int[]{7, 10, 10, 7}, 15,
            SoundEvents.ARMOR_EQUIP_NETHERITE, 6.0F, 0.225F, new float[]{4, 2, 2, 4}, () -> Ingredient.of(PolarisItems.SpiritOfDivinity.get())),
    SupremeGenesisWhite("supreme_genesis_white", 6, new int[]{8, 11, 11, 8}, 15,
            SoundEvents.ARMOR_EQUIP_NETHERITE, 7.0F, 0.25F, new float[]{4, 2, 2, 4}, () -> Ingredient.of(PolarisItems.SpiritOfDivinity.get())),
    EmperorsNewClothes("emperors_new_clothes", 5, new int[]{4, 8, 6, 4}, 15,
            SoundEvents.ARMOR_EQUIP_NETHERITE, 3.0F, 0.1F, new float[]{2, 2, 2, 2}, Ingredient::of),
    LittleCatYellow("little_cat_yellow", 5, new int[]{4, 8, 6, 4}, 15,
            SoundEvents.ARMOR_EQUIP_NETHERITE, 3.0F, 0.1F, new float[]{2, 2, 2, 2}, Ingredient::of),
    LittleCatBlue("little_cat_blue", 5, new int[]{4, 8, 6, 4}, 15,
            SoundEvents.ARMOR_EQUIP_NETHERITE, 3.0F, 0.1F, new float[]{2, 2, 2, 2}, Ingredient::of),
    LittleCatPink("little_cat_pink", 5, new int[]{4, 8, 6, 4}, 15,
            SoundEvents.ARMOR_EQUIP_NETHERITE, 3.0F, 0.1F, new float[]{2, 2, 2, 2}, Ingredient::of)
    ;
    private final String name;
    private final int durabilityMultiplier;
    private final int[] slotProtections;
    private final int enchantmentValue;
    private final SoundEvent sound;
    private final float toughness;
    private final float knockbackResistance;
    private final float[] healthAdd;
    private final LazyLoadedValue<Ingredient> repairIngredient;

    PolarisArmorMaterial(String name, int durabilityMultiplier, int[] slotProtections, int enchantmentValue, SoundEvent soundEvent, float toughness, float knockbackResistance, float[] healthAdd, Supplier<Ingredient> repairIngredient) {
        this.name = name;
        this.durabilityMultiplier = durabilityMultiplier;
        this.slotProtections = slotProtections;
        this.enchantmentValue = enchantmentValue;
        this.sound = soundEvent;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
        this.healthAdd = healthAdd;
        this.repairIngredient = new LazyLoadedValue<>(repairIngredient);
    }

    public float getHealthAddForType(ArmorItem.Type type) {
        return this.healthAdd[type.ordinal()];
    }

    @Override
    public int getDurabilityForType(ArmorItem.Type type) {
        return this.slotProtections[type.ordinal()] * this.durabilityMultiplier;
    }

    @Override
    public int getDefenseForType(ArmorItem.Type type) {
        return this.slotProtections[type.ordinal()];
    }

    @Override
    public int getEnchantmentValue() {
        return this.enchantmentValue;
    }

    @Override
    public @NotNull SoundEvent getEquipSound() {
        return this.sound;
    }

    @Override
    public @NotNull Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }

    @Override
    public @NotNull String getName() {
        return Polaris.MOD_ID + ":" + this.name;
    }

    @Override
    public float getToughness() {
        return this.toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }

}
