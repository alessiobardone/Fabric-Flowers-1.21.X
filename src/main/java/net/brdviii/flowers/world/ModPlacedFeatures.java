package net.brdviii.flowers.world;

import net.brdviii.flowers.Flowers;
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


import java.util.List;


public class ModPlacedFeatures {
    public static final RegistryKey<PlacedFeature> RACCOON_GRAPE_PLACED_KEY = registerKey("raccoon_grape_placed_key");
    public static final RegistryKey<PlacedFeature> AFRICAN_DAISY_PLACED_KEY = registerKey("african_daisy_placed_key");
    public static final RegistryKey<PlacedFeature> DAY_LILY_PLACED_KEY = registerKey("day_lily_placed_key");
    public static final RegistryKey<PlacedFeature> CALLA_LILY_PLACED_KEY = registerKey("calla_lily_placed_key");


    public static void bootstrap(Registerable<PlacedFeature> context) {
        var configuredFeatures = context.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);
        Flowers.LOGGER.info("[Placed] BootsTrap");



        register(context, RACCOON_GRAPE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.RACCOON_GRAPE_KEY),
                createFlowerPatchPlacement(5));

        register(context, AFRICAN_DAISY_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.AFRICAN_DAISY_KEY),
                createFlowerPatchPlacement(5));

        register(context, DAY_LILY_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.DAY_LILY_KEY),
                createFlowerPatchPlacement(5));

        register(context, CALLA_LILY_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.CALLA_LILY_KEY),
                createFlowerPatchPlacement(5));

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

    public static List<PlacementModifier> createFlowerPatchPlacement(int rarity) {
        Flowers.LOGGER.info("[Placed] Created Random Patch of Rarity " + rarity);

        return List.of(
                RarityFilterPlacementModifier.of(rarity),
                SquarePlacementModifier.of(),
                PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP,
                BiomePlacementModifier.of()
        );
    }
}
