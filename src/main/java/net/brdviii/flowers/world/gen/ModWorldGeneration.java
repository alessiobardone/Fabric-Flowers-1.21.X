package net.brdviii.flowers.world.gen;

import net.brdviii.flowers.Flowers;
import net.brdviii.flowers.world.ModPlacedFeatures;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.GenerationStep;


public class ModWorldGeneration {
    public static void generateModWorldGen() {
        Flowers.LOGGER.info("Adding Custom Worldgen for " + Flowers.MOD_ID);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.PLAINS,BiomeKeys.FOREST),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.RACCOON_GRAPE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.all(),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.AFRICAN_DAISY_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.all(),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.DAY_LILY_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.all(),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.CALLA_LILY_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.all(),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.REDPURPLE1_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.all(),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.REDPURPLE2_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.all(),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.REDPURPLE3_PLACED_KEY);
    }
}

