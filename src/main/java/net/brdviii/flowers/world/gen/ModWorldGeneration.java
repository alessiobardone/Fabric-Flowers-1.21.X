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

        String[] flowerKeys = {
                "african_daisy",
                "albuca_namaquensis",
                "australian_cornflower",
                "australian_flame_pea",
                "baby_blue_eyes"
        };


        for (String name : flowerKeys) {
            RegistryKey<PlacedFeature> placedKey = RegistryKey.of(
                    RegistryKeys.PLACED_FEATURE,
                    Identifier.of(Flowers.MOD_ID, name + "_placed_key") // deve corrispondere al JSON generato
            );

            BiomeModifications.addFeature(
                    BiomeSelectors.foundInOverworld(),
                    GenerationStep.Feature.VEGETAL_DECORATION,
                    placedKey
            );

            Flowers.LOGGER.info("[WorldGen] Feature Added to Biome: {}", name);
        }
    }
}

