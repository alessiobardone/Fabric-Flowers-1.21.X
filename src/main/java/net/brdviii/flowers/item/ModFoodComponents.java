package net.brdviii.flowers.item;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class ModFoodComponents {
    public static final FoodComponent RACCOON_GRAPE = new FoodComponent.Builder()
            .nutrition(4)
            .saturationModifier(1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 500),0.15f)
            .build();
}
