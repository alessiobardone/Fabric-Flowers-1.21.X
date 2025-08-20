package net.brdviii.flowers.world.gen;

import net.brdviii.flowers.Flowers;
import net.brdviii.flowers.world.ModConfiguredFeatures;
import net.brdviii.flowers.world.ModPlacedFeatures;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.gen.GenerationStep;

public class ModWorldGeneration {
    public static void generateModWorldGen() {
        Flowers.LOGGER.info("Adding Custom Worldgen for " + Flowers.MOD_ID);
        Flowers.LOGGER.info("[WorldGen] PLACED_FEATURES size: {}", ModPlacedFeatures.PLACED_FEATURES.size());


        ModPlacedFeatures.PLACED_FEATURES.values().forEach(key -> {
            BiomeModifications.addFeature(
                    BiomeSelectors.foundInOverworld(),
                    GenerationStep.Feature.VEGETAL_DECORATION,
                    key
            );
            Flowers.LOGGER.info("[WorldGen] Feature Added to Biome: {}", key.getValue());
        });

        /*BiomeModifications.addFeature(
                BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.VEGETAL_DECORATION,
                ModPlacedFeatures.AFRICAN_DAISY_PLACED_KEY
        );*/
    }
}
