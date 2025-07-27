package committee.nova.mods.polaris.registry;



import lombok.Getter;
import net.minecraft.util.LazyLoadedValue;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;

import javax.annotation.Nonnull;
import java.util.function.Supplier;

public enum PolarisItemTier implements Tier {
    REFINED_NETHER(10, 4062, 0f, 0F, 25, () -> Ingredient.of(PolarisItems.EndEssence.get())),
    STARS(100, 8888, 0f, 0F, 30, Ingredient::of)
    ;

    @Getter
    private final int level;
    @Getter
    private final int uses;
    @Getter
    private final float speed;
    private final float damage;
    @Getter
    private final int enchantmentValue;
    private final LazyLoadedValue<Ingredient> repairIngredient;

    PolarisItemTier(int level, int uses, float speed, float damage, int enchantmentValue, Supplier<Ingredient> repairIngredient) {
        this.level = level;
        this.uses = uses;
        this.speed = speed;
        this.damage = damage;
        this.enchantmentValue = enchantmentValue;
        this.repairIngredient = new LazyLoadedValue<>(repairIngredient);
    }

    public float getAttackDamageBonus() {
        return this.damage;
    }

    @Nonnull
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }

}
