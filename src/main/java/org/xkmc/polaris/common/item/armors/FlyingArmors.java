package org.xkmc.polaris.common.item.armors;

import net.minecraft.world.item.ArmorMaterial;
import org.xkmc.polaris.common.item.UnDamageArmors;

/**
 * @author cnlimiter
 */
public class FlyingArmors {
    public static class FlyingEffectArmors extends UnDamageArmors {
        public FlyingEffectArmors(ArmorMaterial pMaterial, Type pType, Properties pProperties) {
            super(pMaterial, pType, pProperties);
        }
    }
    public static class StarLordArmors extends FlyingEffectArmors {
        public StarLordArmors(ArmorMaterial pMaterial, Type pType, Properties pProperties) {
            super(pMaterial, pType, pProperties);
        }
    }
    public static class SupremeGenesisArmors extends FlyingEffectArmors{
        public SupremeGenesisArmors(ArmorMaterial pMaterial, Type pType, Properties pProperties) {
            super(pMaterial, pType, pProperties);
        }
    }
}
