package committee.nova.mods.polaris.registry;


import committee.nova.mods.polaris.Polaris;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.LazyLoadedValue;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;
import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.function.Supplier;

public enum PolarisArmorMaterial implements ArmorMaterial {
    STARDUST("stardust", false, 5, new int[]{3, 8, 6, 3}, 15,
            SoundEvents.ARMOR_EQUIP_DIAMOND, 3.0F, 0.1F, new float[]{2, 2, 2, 2},
            List.of(MobEffects.DIG_SPEED), Ingredient::of),
    STARBURST("starburst", false,5, new int[]{3, 9, 6, 3}, 15,
            SoundEvents.ARMOR_EQUIP_NETHERITE, 3.0F, 0.125F, new float[]{2, 4, 4, 2},
            List.of(MobEffects.DIG_SPEED), Ingredient::of),
    STAR_LORD("star_lord", true,5, new int[]{4, 9, 7, 4}, 15,
            SoundEvents.ARMOR_EQUIP_NETHERITE, 4.0F, 0.15F, new float[]{4, 4, 4, 4},
            List.of(MobEffects.DIG_SPEED), Ingredient::of),
    MSBase("ms_base", false,5, new int[]{3, 8, 6, 3}, 15,
            SoundEvents.ARMOR_EQUIP_NETHERITE, 3.0F, 0.1F, new float[]{2, 2, 2, 2},
            List.of(MobEffects.DIG_SPEED),Ingredient::of),
    MSWhiteTiger("ms_white_tiger", false,5, new int[]{4, 9, 7, 4}, 15,
            SoundEvents.ARMOR_EQUIP_NETHERITE, 3.0F, 0.1F, new float[]{2, 4, 2, 2},
            List.of(MobEffects.DIG_SPEED, MobEffects.MOVEMENT_SPEED, MobEffects.DAMAGE_BOOST),Ingredient::of),
    MSBlueDragon("ms_blue_dragon", false,5, new int[]{4, 9, 7, 4}, 15,
            SoundEvents.ARMOR_EQUIP_NETHERITE, 3.0F, 0.1F, new float[]{2, 4, 2, 2},
            List.of(MobEffects.DIG_SPEED, MobEffects.CONDUIT_POWER),Ingredient::of),
    MSVermilionBird("ms_vermilion_bird", false,5, new int[]{3, 8, 6, 3}, 15,
            SoundEvents.ARMOR_EQUIP_NETHERITE, 3.0F, 0.1F, new float[]{2, 4, 2, 2},
            List.of(MobEffects.DIG_SPEED, MobEffects.FIRE_RESISTANCE),Ingredient::of),
    MSBlackTortoise("ms_black_tortoise", false,5, new int[]{4, 9, 7, 4}, 15,
            SoundEvents.ARMOR_EQUIP_NETHERITE, 3.5F, 0.2F, new float[]{4, 4, 4, 4},
            List.of(MobEffects.SATURATION, MobEffects.DAMAGE_RESISTANCE),Ingredient::of),
    SupremeGenesis("supreme_genesis", true,5, new int[]{7, 10, 10, 7}, 15,
            SoundEvents.ARMOR_EQUIP_NETHERITE, 6.0F, 0.225F, new float[]{4, 4, 4, 4},
            List.of(MobEffects.DIG_SPEED, MobEffects.DAMAGE_RESISTANCE, MobEffects.DAMAGE_BOOST, MobEffects.CONDUIT_POWER, MobEffects.LUCK),
            () -> Ingredient.of(PolarisItems.SpiritOfDivinity.get())),
    SupremeGenesisWhite("supreme_genesis_white", true,6, new int[]{8, 11, 11, 8}, 15,
            SoundEvents.ARMOR_EQUIP_NETHERITE, 7.0F, 0.25F, new float[]{4, 4, 4, 4},
            List.of(MobEffects.DIG_SPEED, MobEffects.DAMAGE_RESISTANCE, MobEffects.DAMAGE_BOOST, MobEffects.CONDUIT_POWER, MobEffects.LUCK),
            () -> Ingredient.of(PolarisItems.SpiritOfDivinity.get())),
    EmperorsNewClothes("emperors_new_clothes", false,5, new int[]{4, 8, 6, 4}, 15,
            SoundEvents.ARMOR_EQUIP_NETHERITE, 3.0F, 0.1F, new float[]{2, 2, 2, 2},
            List.of(),Ingredient::of),
    LittleCatYellow("little_cat_yellow", false,5, new int[]{4, 8, 6, 4}, 15,
            SoundEvents.ARMOR_EQUIP_NETHERITE, 3.0F, 0.1F, new float[]{2, 2, 2, 2},
            List.of(),Ingredient::of),
    LittleCatBlue("little_cat_blue", false,5, new int[]{4, 8, 6, 4}, 15,
            SoundEvents.ARMOR_EQUIP_NETHERITE, 3.0F, 0.1F, new float[]{2, 2, 2, 2},
            List.of(),Ingredient::of),
    LittleCatPink("little_cat_pink", false,5, new int[]{4, 8, 6, 4}, 15,
            SoundEvents.ARMOR_EQUIP_NETHERITE, 3.0F, 0.1F, new float[]{2, 2, 2, 2},
            List.of(),Ingredient::of)
    ;
    private final String name;
    private final boolean isFlying;
    private final int durabilityMultiplier;
    private final int[] slotProtections;
    private final int enchantmentValue;
    private final SoundEvent sound;
    private final float toughness;
    private final float knockbackResistance;
    private final float[] healthAdd;
    private final List<MobEffect> effects;
    private final LazyLoadedValue<Ingredient> repairIngredient;

    PolarisArmorMaterial(String name, boolean isFlying, int durabilityMultiplier, int[] slotProtections, int enchantmentValue,
                         SoundEvent soundEvent, float toughness, float knockbackResistance,
                         float[] healthAdd, List<MobEffect> effects, Supplier<Ingredient> repairIngredient) {
        this.name = name;
        this.isFlying = isFlying;
        this.durabilityMultiplier = durabilityMultiplier;
        this.slotProtections = slotProtections;
        this.enchantmentValue = enchantmentValue;
        this.sound = soundEvent;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
        this.healthAdd = healthAdd;
        this.effects = effects;
        this.repairIngredient = new LazyLoadedValue<>(repairIngredient);
    }

    public boolean isFlying() {
        return isFlying;
    }

    public List<MobEffect> getArmorEffects() {
        return this.effects;
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
