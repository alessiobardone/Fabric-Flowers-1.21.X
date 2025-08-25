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
    public static final RegistryKey<PlacedFeature> AFRICAN_DAISY_GROUP_PLACED_KEY = registerKey("african_daisy_group_placed_key");
    public static final RegistryKey<PlacedFeature> CALLA_LILY_GROUP_PLACED_KEY = registerKey("calla_lily_group_placed_key");
    public static final RegistryKey<PlacedFeature> DAY_LILY_GROUP_PLACED_KEY = registerKey("day_lily_group_placed_key");
    public static final RegistryKey<PlacedFeature> LUPIN_GROUP_PLACED_KEY = registerKey("lupin_group_placed_key");
    public static final RegistryKey<PlacedFeature> POPPY_GROUP_PLACED_KEY = registerKey("poppy_group_placed_key");
    public static final RegistryKey<PlacedFeature> ZINNIA_GROUP_PLACED_KEY = registerKey("zinnia_group_placed_key");
    public static final RegistryKey<PlacedFeature> SUNFLOWER_GROUP_PLACED_KEY = registerKey("sunflower_group_placed_key");
    public static final RegistryKey<PlacedFeature> MORNING_GLORY_GROUP_PLACED_KEY = registerKey("morning_glory_group_placed_key");
    public static final RegistryKey<PlacedFeature> CROCUS_GROUP_PLACED_KEY = registerKey("crocus_group_placed_key");
    public static final RegistryKey<PlacedFeature> GERANIUM_GROUP_PLACED_KEY = registerKey("geranium_group_placed_key");
    public static final RegistryKey<PlacedFeature> DESERT_GROUP_PLACED_KEY = registerKey("desert_group_placed_key");

    public static final RegistryKey<PlacedFeature> RED_PURPLE1_PLACED_KEY = registerKey("red_purple1_placed_key");
    public static final RegistryKey<PlacedFeature> RED_PURPLE2_PLACED_KEY = registerKey("red_purple2_placed_key");
    public static final RegistryKey<PlacedFeature> RED_PURPLE3_PLACED_KEY = registerKey("red_purple3_placed_key");
    public static final RegistryKey<PlacedFeature> YELLOW_ORANGE1_PLACED_KEY = registerKey("yellow_orange1_placed_key");
    public static final RegistryKey<PlacedFeature> YELLOW_ORANGE2_PLACED_KEY = registerKey("yellow_orange2_placed_key");
    public static final RegistryKey<PlacedFeature> YELLOW_ORANGE3_PLACED_KEY = registerKey("yellow_orange3_placed_key");
    public static final RegistryKey<PlacedFeature> PINK_MAGENTA1_PLACED_KEY = registerKey("pink_magenta1_placed_key");
    public static final RegistryKey<PlacedFeature> PINK_MAGENTA2_PLACED_KEY = registerKey("pink_magenta2_placed_key");
    public static final RegistryKey<PlacedFeature> PINK_MAGENTA3_PLACED_KEY = registerKey("pink_magenta3_placed_key");
    public static final RegistryKey<PlacedFeature> BLUE_PURPLE1_PLACED_KEY = registerKey("blue_purple1_placed_key");
    public static final RegistryKey<PlacedFeature> BLUE_PURPLE2_PLACED_KEY = registerKey("blue_purple2_placed_key");
    public static final RegistryKey<PlacedFeature> BLUE_PURPLE3_PLACED_KEY = registerKey("blue_purple3_placed_key");
    public static final RegistryKey<PlacedFeature> RED_ORANGE1_PLACED_KEY = registerKey("red_orange1_placed_key");
    public static final RegistryKey<PlacedFeature> RED_ORANGE2_PLACED_KEY = registerKey("red_orange2_placed_key");
    public static final RegistryKey<PlacedFeature> YELLOW_PURPLE1_PLACED_KEY = registerKey("yellow_purple1_placed_key");
    public static final RegistryKey<PlacedFeature> YELLOW_PURPLE2_PLACED_KEY = registerKey("yellow_purple2_placed_key");
    public static final RegistryKey<PlacedFeature> PINK_BLUE1_PLACED_KEY = registerKey("pink_blue1_placed_key");
    public static final RegistryKey<PlacedFeature> PINK_BLUE2_PLACED_KEY = registerKey("pink_blue2_placed_key");
    public static final RegistryKey<PlacedFeature> MAGENTA_WHITE1_PLACED_KEY = registerKey("magenta_white1_placed_key");
    public static final RegistryKey<PlacedFeature> MAGENTA_WHITE2_PLACED_KEY = registerKey("magenta_white2_placed_key");
    public static final RegistryKey<PlacedFeature> CYAN_BLUE1_PLACED_KEY = registerKey("cyan_blue1_placed_key");
    public static final RegistryKey<PlacedFeature> CYAN_BLUE2_PLACED_KEY = registerKey("cyan_blue2_placed_key");
    public static final RegistryKey<PlacedFeature> GREEN_MIX1_PLACED_KEY = registerKey("green_mix1_placed_key");
    public static final RegistryKey<PlacedFeature> GREEN_MIX2_PLACED_KEY = registerKey("green_mix2_placed_key");

    public static final RegistryKey<PlacedFeature> CACTUS_GROUP_PLACED_KEY = registerKey("cactus_group_placed_key");
    public static final RegistryKey<PlacedFeature> MUSHROOM_GROUP_PLACED_KEY = registerKey("mushroom_group_placed_key");
    public static final RegistryKey<PlacedFeature> EXOTIC_GROUP_PLACED_KEY = registerKey("exotic_group_placed_key");
    public static final RegistryKey<PlacedFeature> TREE_FLOWER_GROUP_PLACED_KEY = registerKey("tree_flower_group_placed_key");
    public static final RegistryKey<PlacedFeature> ALPINE_GROUP_PLACED_KEY = registerKey("alpine_group_placed_key");
    public static final RegistryKey<PlacedFeature> WHITE_GROUP_PLACED_KEY = registerKey("white_group_placed_key");
    public static final RegistryKey<PlacedFeature> DESERT_DRY_GROUP_PLACED_KEY = registerKey("desert_dry_group_placed_key");
    public static final RegistryKey<PlacedFeature> SPECIAL_BLUE_GROUP_PLACED_KEY = registerKey("special_blue_group_placed_key");
    public static final RegistryKey<PlacedFeature> FANCY_IRIS_GROUP_PLACED_KEY = registerKey("fancy_iris_group_placed_key");
    public static final RegistryKey<PlacedFeature> SWEETPEAS_GROUP_PLACED_KEY = registerKey("sweetpeas_group_placed_key");
    public static final RegistryKey<PlacedFeature> DAISY_MIXED_GROUP_PLACED_KEY = registerKey("daisy_mixed_group_placed_key");
    public static final RegistryKey<PlacedFeature> DESERT_EXTRA1_PLACED_KEY = registerKey("desert_extra1_placed_key");

    public static final RegistryKey<PlacedFeature> LARGE_LILY_PLACED_KEY = registerKey("large_lily_placed_key");
    public static final RegistryKey<PlacedFeature> LIGHT_LILY_PLACED_KEY = registerKey("light_lily_placed_key");
    public static final RegistryKey<PlacedFeature> SMALL1_PLACED_KEY = registerKey("small1_placed_key");
    public static final RegistryKey<PlacedFeature> SMALL2_PLACED_KEY = registerKey("small2_placed_key");


    public static void bootstrap(Registerable<PlacedFeature> context) {
        var configuredFeatures = context.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);
        Flowers.LOGGER.info("[Placed] BootsTrap");


        register(context, RACCOON_GRAPE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.RACCOON_GRAPE_KEY),
                createFlowerPatchPlacement(12));

        register(context, AFRICAN_DAISY_GROUP_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.AFRICAN_DAISY_GROUP_KEY),
                createFlowerPatchPlacement(12));

        register(context, CALLA_LILY_GROUP_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.CALLA_LILY_GROUP_KEY),
                createFlowerPatchPlacement(20));

        register(context, DAY_LILY_GROUP_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.DAY_LILY_GROUP_KEY),
                createFlowerPatchPlacement(12));

        register(context, LUPIN_GROUP_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.LUPIN_GROUP_KEY),
                createFlowerPatchPlacement(16));

        register(context, POPPY_GROUP_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.POPPY_GROUP_KEY),
                createFlowerPatchPlacement(8));

        register(context, ZINNIA_GROUP_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.ZINNIA_GROUP_KEY),
                createFlowerPatchPlacement(12));

        register(context, SUNFLOWER_GROUP_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.SUNFLOWER_GROUP_KEY),
                createFlowerPatchPlacement(8));

        register(context, MORNING_GLORY_GROUP_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.MORNING_GLORY_GROUP_KEY),
                createFlowerPatchPlacement(16));

        register(context, CROCUS_GROUP_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.CROCUS_GROUP_KEY),
                createFlowerPatchPlacement(10));

        register(context, GERANIUM_GROUP_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.GERANIUM_GROUP_KEY),
                createFlowerPatchPlacement(10));

        register(context, DESERT_GROUP_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.DESERT_GROUP_KEY),
                createFlowerPatchPlacement(10));

        register(context, RED_PURPLE1_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.RED_PURPLE1_KEY),
                createFlowerPatchPlacement(12));

        register(context, RED_PURPLE2_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.RED_PURPLE2_KEY),
                createFlowerPatchPlacement(12));

        register(context, RED_PURPLE3_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.RED_PURPLE3_KEY),
                createFlowerPatchPlacement(16));

        register(context, YELLOW_ORANGE1_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.YELLOW_ORANGE1_KEY),
                createFlowerPatchPlacement(12));

        register(context, YELLOW_ORANGE2_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.YELLOW_ORANGE2_KEY),
                createFlowerPatchPlacement(12));

        register(context, YELLOW_ORANGE3_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.YELLOW_ORANGE3_KEY),
                createFlowerPatchPlacement(16));

        register(context, PINK_MAGENTA1_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.PINK_MAGENTA1_KEY),
                createFlowerPatchPlacement(12));

        register(context, PINK_MAGENTA2_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.PINK_MAGENTA2_KEY),
                createFlowerPatchPlacement(16));

        register(context, PINK_MAGENTA3_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.PINK_MAGENTA3_KEY),
                createFlowerPatchPlacement(16));

        register(context, BLUE_PURPLE1_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.BLUE_PURPLE1_KEY),
                createFlowerPatchPlacement(12));

        register(context, BLUE_PURPLE2_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.BLUE_PURPLE2_KEY),
                createFlowerPatchPlacement(12));

        register(context, BLUE_PURPLE3_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.BLUE_PURPLE3_KEY),
                createFlowerPatchPlacement(16));

        register(context, RED_ORANGE1_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.RED_ORANGE1_KEY),
                createFlowerPatchPlacement(12));

        register(context, RED_ORANGE2_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.RED_ORANGE2_KEY),
                createFlowerPatchPlacement(16));

        register(context, YELLOW_PURPLE1_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.YELLOW_PURPLE1_KEY),
                createFlowerPatchPlacement(16));

        register(context, YELLOW_PURPLE2_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.YELLOW_PURPLE2_KEY),
                createFlowerPatchPlacement(16));

        register(context, PINK_BLUE1_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.PINK_BLUE1_KEY),
                createFlowerPatchPlacement(12));

        register(context, PINK_BLUE2_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.PINK_BLUE2_KEY),
                createFlowerPatchPlacement(16));

        register(context, MAGENTA_WHITE1_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.MAGENTA_WHITE1_KEY),
                createFlowerPatchPlacement(12));

        register(context, MAGENTA_WHITE2_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.MAGENTA_WHITE2_KEY),
                createFlowerPatchPlacement(16));

        register(context, CYAN_BLUE1_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.CYAN_BLUE1_KEY),
                createFlowerPatchPlacement(12));

        register(context, CYAN_BLUE2_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.CYAN_BLUE2_KEY),
                createFlowerPatchPlacement(16));

        register(context, GREEN_MIX1_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.GREEN_MIX1_KEY),
                createFlowerPatchPlacement(16));

        register(context, GREEN_MIX2_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.GREEN_MIX2_KEY),
                createFlowerPatchPlacement(16));

        register(context, CACTUS_GROUP_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.CACTUS_GROUP_KEY),
                createFlowerPatchPlacement(20));

        register(context, MUSHROOM_GROUP_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.MUSHROOM_GROUP_KEY),
                createFlowerPatchPlacement(20));

        register(context, EXOTIC_GROUP_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.EXOTIC_GROUP_KEY),
                createFlowerPatchPlacement(20));

        register(context, TREE_FLOWER_GROUP_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.TREE_FLOWER_GROUP_KEY),
                createFlowerPatchPlacement(16));

        register(context, ALPINE_GROUP_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.ALPINE_GROUP_KEY),
                createFlowerPatchPlacement(12));

        register(context, WHITE_GROUP_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.WHITE_GROUP_KEY),
                createFlowerPatchPlacement(12));

        register(context, DESERT_DRY_GROUP_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.DESERT_DRY_GROUP_KEY),
                createFlowerPatchPlacement(20));

        register(context, SPECIAL_BLUE_GROUP_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.SPECIAL_BLUE_GROUP_KEY),
                createFlowerPatchPlacement(16));

        register(context, FANCY_IRIS_GROUP_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.FANCY_IRIS_GROUP_KEY),
                createFlowerPatchPlacement(16));

        register(context, SWEETPEAS_GROUP_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.SWEETPEAS_GROUP_KEY),
                createFlowerPatchPlacement(12));

        register(context, DAISY_MIXED_GROUP_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.DAISY_MIXED_GROUP_KEY),
                createFlowerPatchPlacement(12));

        register(context, DESERT_EXTRA1_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.DESERT_EXTRA1_KEY),
                createFlowerPatchPlacement(20));


        register(context, LARGE_LILY_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.LARGE_LILY_KEY),
                createFlowerPatchPlacement(6));

        register(context, LIGHT_LILY_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.LIGHT_LILY_KEY),
                createFlowerPatchPlacement(6));

        register(context, SMALL1_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.SMALL1_KEY),
                createFlowerPatchPlacement(6));

        register(context, SMALL2_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.SMALL2_KEY),
                createFlowerPatchPlacement(6));

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
