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

        // 🌼 PLAINS – solo pochi fiori comuni
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.PLAINS),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.AFRICAN_DAISY_GROUP_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.PLAINS),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.POPPY_GROUP_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.PLAINS),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.SWEETPEAS_GROUP_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.PLAINS),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.CROCUS_GROUP_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.SUNFLOWER_PLAINS),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.SUNFLOWER_GROUP_PLACED_KEY);

// 🌳 FOREST / DARK FOREST
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.FOREST, BiomeKeys.DARK_FOREST),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.GERANIUM_GROUP_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.FOREST),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.MORNING_GLORY_GROUP_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.FOREST, BiomeKeys.FLOWER_FOREST),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.TREE_FLOWER_GROUP_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.PLAINS,BiomeKeys.FOREST),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.RACCOON_GRAPE_PLACED_KEY);

// 🌸 FLOWER FOREST – massima varietà
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.FLOWER_FOREST),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.ZINNIA_GROUP_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.FLOWER_FOREST),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.RED_PURPLE1_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.FLOWER_FOREST),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.RED_PURPLE2_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.FLOWER_FOREST),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.RED_PURPLE3_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.FLOWER_FOREST),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.YELLOW_ORANGE3_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.FLOWER_FOREST),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.PINK_MAGENTA1_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.FLOWER_FOREST),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.PINK_MAGENTA2_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.FLOWER_FOREST),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.YELLOW_PURPLE2_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.FLOWER_FOREST),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.PINK_BLUE1_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.FLOWER_FOREST),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.PINK_BLUE2_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.FLOWER_FOREST),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.MAGENTA_WHITE1_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.FLOWER_FOREST),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.MAGENTA_WHITE2_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.FLOWER_FOREST),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.FANCY_IRIS_GROUP_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.FLOWER_FOREST),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.DAISY_MIXED_GROUP_PLACED_KEY);

// ⛰️ MEADOW
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.MEADOW),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.LUPIN_GROUP_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.MEADOW),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.CROCUS_GROUP_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.MEADOW),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.YELLOW_PURPLE1_PLACED_KEY);

// 🌲 TAIGA + NEVIOSO
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.TAIGA),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.BLUE_PURPLE1_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.TAIGA),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.BLUE_PURPLE2_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.TAIGA),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.BLUE_PURPLE3_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.TAIGA),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.CYAN_BLUE1_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.TAIGA),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.CYAN_BLUE2_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.SNOWY_TAIGA, BiomeKeys.SNOWY_PLAINS),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.ALPINE_GROUP_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.SNOWY_PLAINS),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.WHITE_GROUP_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.TAIGA),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.SPECIAL_BLUE_GROUP_PLACED_KEY);

// 🏜️ DESERT / SAVANNA / BADLANDS
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.DESERT),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.DESERT_GROUP_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.DESERT),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.DESERT_DRY_GROUP_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.DESERT, BiomeKeys.SAVANNA),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.CACTUS_GROUP_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.DESERT, BiomeKeys.BADLANDS),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.EXOTIC_GROUP_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.BADLANDS),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.DESERT_EXTRA1_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.SAVANNA),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.YELLOW_ORANGE1_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.SAVANNA, BiomeKeys.DESERT),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.YELLOW_ORANGE2_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.SAVANNA, BiomeKeys.DESERT),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.RED_ORANGE1_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.SAVANNA),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.RED_ORANGE2_PLACED_KEY);

// 🐸 SWAMP / MANGROVE
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.SWAMP, BiomeKeys.MANGROVE_SWAMP),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.CALLA_LILY_GROUP_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.SWAMP, BiomeKeys.MANGROVE_SWAMP,BiomeKeys.PLAINS),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.LARGE_LILY_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.SWAMP, BiomeKeys.MANGROVE_SWAMP,BiomeKeys.PLAINS),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.LIGHT_LILY_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.SWAMP, BiomeKeys.MANGROVE_SWAMP,BiomeKeys.PLAINS),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.SMALL1_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.SWAMP, BiomeKeys.MANGROVE_SWAMP,BiomeKeys.PLAINS),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.SMALL2_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.SWAMP),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.MUSHROOM_GROUP_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.SWAMP),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.GREEN_MIX2_PLACED_KEY);

// 🌴 JUNGLE
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.JUNGLE),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.GREEN_MIX1_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.JUNGLE),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.EXOTIC_GROUP_PLACED_KEY);

        // Birch Forest
        BiomeModifications.addFeature(
                BiomeSelectors.includeByKey(BiomeKeys.BIRCH_FOREST, BiomeKeys.OLD_GROWTH_BIRCH_FOREST),
                GenerationStep.Feature.VEGETAL_DECORATION,
                ModPlacedFeatures.DAISY_MIXED_GROUP_PLACED_KEY
        );
        BiomeModifications.addFeature(
                BiomeSelectors.includeByKey(BiomeKeys.BIRCH_FOREST, BiomeKeys.OLD_GROWTH_BIRCH_FOREST),
                GenerationStep.Feature.VEGETAL_DECORATION,
                ModPlacedFeatures.CYAN_BLUE2_PLACED_KEY
        );
        BiomeModifications.addFeature(
                BiomeSelectors.includeByKey(BiomeKeys.BIRCH_FOREST, BiomeKeys.OLD_GROWTH_BIRCH_FOREST),
                GenerationStep.Feature.VEGETAL_DECORATION,
                ModPlacedFeatures.RED_PURPLE2_PLACED_KEY
        );

// Cherry Grove
        BiomeModifications.addFeature(
                BiomeSelectors.includeByKey(BiomeKeys.CHERRY_GROVE),
                GenerationStep.Feature.VEGETAL_DECORATION,
                ModPlacedFeatures.CALLA_LILY_GROUP_PLACED_KEY
        );
        BiomeModifications.addFeature(
                BiomeSelectors.includeByKey(BiomeKeys.CHERRY_GROVE),
                GenerationStep.Feature.VEGETAL_DECORATION,
                ModPlacedFeatures.CROCUS_GROUP_PLACED_KEY
        );
        BiomeModifications.addFeature(
                BiomeSelectors.includeByKey(BiomeKeys.CHERRY_GROVE),
                GenerationStep.Feature.VEGETAL_DECORATION,
                ModPlacedFeatures.PINK_MAGENTA3_PLACED_KEY
        );
        BiomeModifications.addFeature(
                BiomeSelectors.includeByKey(BiomeKeys.CHERRY_GROVE),
                GenerationStep.Feature.VEGETAL_DECORATION,
                ModPlacedFeatures.PINK_BLUE2_PLACED_KEY
        );

// Old Growth Taiga
        BiomeModifications.addFeature(
                BiomeSelectors.includeByKey(BiomeKeys.OLD_GROWTH_PINE_TAIGA, BiomeKeys.OLD_GROWTH_SPRUCE_TAIGA),
                GenerationStep.Feature.VEGETAL_DECORATION,
                ModPlacedFeatures.LUPIN_GROUP_PLACED_KEY
        );
        BiomeModifications.addFeature(
                BiomeSelectors.includeByKey(BiomeKeys.OLD_GROWTH_PINE_TAIGA, BiomeKeys.OLD_GROWTH_SPRUCE_TAIGA),
                GenerationStep.Feature.VEGETAL_DECORATION,
                ModPlacedFeatures.ALPINE_GROUP_PLACED_KEY
        );

// Windswept biomes
        BiomeModifications.addFeature(
                BiomeSelectors.includeByKey(BiomeKeys.WINDSWEPT_HILLS, BiomeKeys.WINDSWEPT_FOREST, BiomeKeys.WINDSWEPT_SAVANNA, BiomeKeys.STONY_PEAKS),
                GenerationStep.Feature.VEGETAL_DECORATION,
                ModPlacedFeatures.ZINNIA_GROUP_PLACED_KEY
        );
        BiomeModifications.addFeature(
                BiomeSelectors.includeByKey(BiomeKeys.CHERRY_GROVE),
                GenerationStep.Feature.VEGETAL_DECORATION,
                ModPlacedFeatures.RED_PURPLE3_PLACED_KEY
        );

// Dripstone Caves
        BiomeModifications.addFeature(
                BiomeSelectors.includeByKey(BiomeKeys.DRIPSTONE_CAVES),
                GenerationStep.Feature.VEGETAL_DECORATION,
                ModPlacedFeatures.MUSHROOM_GROUP_PLACED_KEY
        );

// Lush Caves
        BiomeModifications.addFeature(
                BiomeSelectors.includeByKey(BiomeKeys.LUSH_CAVES),
                GenerationStep.Feature.VEGETAL_DECORATION,
                ModPlacedFeatures.EXOTIC_GROUP_PLACED_KEY
        );

// Beach & River
        BiomeModifications.addFeature(
                BiomeSelectors.includeByKey(BiomeKeys.BEACH),
                GenerationStep.Feature.VEGETAL_DECORATION,
                ModPlacedFeatures.CALLA_LILY_GROUP_PLACED_KEY
        );
        BiomeModifications.addFeature(
                BiomeSelectors.includeByKey(BiomeKeys.RIVER),
                GenerationStep.Feature.VEGETAL_DECORATION,
                ModPlacedFeatures.DAY_LILY_GROUP_PLACED_KEY
        );
        BiomeModifications.addFeature(
                BiomeSelectors.includeByKey(BiomeKeys.CHERRY_GROVE),
                GenerationStep.Feature.VEGETAL_DECORATION,
                ModPlacedFeatures.YELLOW_ORANGE1_PLACED_KEY
        );

// Ice Spikes (super rari)
        BiomeModifications.addFeature(
                BiomeSelectors.includeByKey(BiomeKeys.ICE_SPIKES),
                GenerationStep.Feature.VEGETAL_DECORATION,
                ModPlacedFeatures.ALPINE_GROUP_PLACED_KEY
        );


    }
}

