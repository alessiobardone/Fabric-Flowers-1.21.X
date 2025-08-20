package net.brdviii.flowers.world;

import net.brdviii.flowers.Flowers;
import net.brdviii.flowers.block.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.placementmodifier.BiomePlacementModifier;
import net.minecraft.world.gen.placementmodifier.PlacementModifier;
import net.minecraft.world.gen.placementmodifier.RarityFilterPlacementModifier;
import net.minecraft.world.gen.placementmodifier.SquarePlacementModifier;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ModPlacedFeatures {
    private static final Map<String, Block> FLOWERS = Map.of(
            "african_daisy", ModBlocks.AFRICAN_DAISY,
            "albuca_namaquensis", ModBlocks.ALBUCA_NAMAQUENSIS,
            "australian_cornflower", ModBlocks.AUSTRALIAN_CORNFLOWER,
            "australian_flame_pea", ModBlocks.AUSTRALIAN_FLAME_PEA,
            "baby_blue_eyes", ModBlocks.BABY_BLUE_EYES
            // aggiungi tutti gli altri fiori qui
    );

    public static final Map<String, RegistryKey<PlacedFeature>> PLACED_FEATURES = new HashMap<>();

    public static void bootstrap(Registerable<PlacedFeature> context) {
        var configuredFeatures = context.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);
        Flowers.LOGGER.info("[WorldGen] PlacedBootsTrap");

        ModConfiguredFeatures.CONFIGURED_FEATURES.forEach((name, configuredKey) -> {
            RegistryKey<PlacedFeature> placedKey = RegistryKey.of(
                    RegistryKeys.PLACED_FEATURE,
                    Identifier.of(Flowers.MOD_ID, name + "_placed_key")
            );
            PLACED_FEATURES.put(name, placedKey);

            context.register(placedKey, new PlacedFeature(
                    context.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE).getOrThrow(configuredKey),
                    List.of(
                            RarityFilterPlacementModifier.of(5),
                            SquarePlacementModifier.of(),
                            PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP,
                            BiomePlacementModifier.of()
                    )
            ));

            Flowers.LOGGER.info("[WorldGen] PlacedFeature: {}", name);
        });
    }


    public static RegistryKey<PlacedFeature> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.PLACED_FEATURE, Identifier.of(Flowers.MOD_ID, name));
    }

    private static void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key, RegistryEntry<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key,
                                                                                   RegistryEntry<ConfiguredFeature<?, ?>> configuration,
                                                                                   PlacementModifier... modifiers) {
        register(context, key, configuration, List.of(modifiers));
    }
}
