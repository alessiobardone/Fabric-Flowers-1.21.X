package net.brdviii.flowers.world.gen;

import net.brdviii.flowers.Flowers;
import net.brdviii.flowers.block.ModBlocks;
import net.brdviii.flowers.world.ModConfiguredFeatures;
import net.brdviii.flowers.world.ModPlacedFeatures;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.block.Block;
import net.minecraft.registry.BuiltinRegistries;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.placementmodifier.BiomePlacementModifier;
import net.minecraft.world.gen.placementmodifier.RarityFilterPlacementModifier;
import net.minecraft.world.gen.placementmodifier.SquarePlacementModifier;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ModWorldGeneration {
    public static void generateModWorldGen() {
        Flowers.LOGGER.info("Adding Custom Worldgen for " + Flowers.MOD_ID);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.PLAINS,BiomeKeys.FOREST),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.RACCOON_GRAPE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.all(),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.AFRICAN_DAISY_PLACED_KEY);
    }
}

