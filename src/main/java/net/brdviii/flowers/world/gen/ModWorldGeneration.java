package net.brdviii.flowers.world.gen;

import net.brdviii.flowers.world.ModPlacedFeatures;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.gen.GenerationStep;

public class ModWorldGeneration {
    public static void generateModWorldGen() {
        BiomeModifications.addFeature(
                BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.VEGETAL_DECORATION,
                ModPlacedFeatures.AFRICAN_DAISY_PLACED_KEY
        );
    }
}
