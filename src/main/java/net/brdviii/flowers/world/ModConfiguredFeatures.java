package net.brdviii.flowers.world;

import net.brdviii.flowers.Flowers;
import net.brdviii.flowers.block.ModBlocks;
import net.brdviii.flowers.block.custom.RacoonGrapeBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.util.collection.DataPool;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.stateprovider.WeightedBlockStateProvider;
import org.jetbrains.annotations.NotNull;


import java.util.List;
import java.util.Map;

public class ModConfiguredFeatures {
    public static final RegistryKey<ConfiguredFeature<?, ?>> RACCOON_GRAPE_KEY = registerKey("raccoon_grape_key");
    public static final RegistryKey<ConfiguredFeature<?, ?>> AFRICAN_DAISY_GROUP_KEY = registerKey("african_daisy_group_key");
    public static final RegistryKey<ConfiguredFeature<?, ?>> CALLA_LILY_GROUP_KEY = registerKey("calla_lily_group_key");
    public static final RegistryKey<ConfiguredFeature<?, ?>> DAY_LILY_GROUP_KEY = registerKey("day_lily_group_key");
    public static final RegistryKey<ConfiguredFeature<?, ?>> LUPIN_GROUP_KEY = registerKey("lupin_group_key");
    public static final RegistryKey<ConfiguredFeature<?, ?>> POPPY_GROUP_KEY = registerKey("poppy_group_key");
    public static final RegistryKey<ConfiguredFeature<?, ?>> ZINNIA_GROUP_KEY = registerKey("zinnia_group_key");
    public static final RegistryKey<ConfiguredFeature<?, ?>> SUNFLOWER_GROUP_KEY = registerKey("sunflower_group_key");
    public static final RegistryKey<ConfiguredFeature<?, ?>> MORNING_GLORY_GROUP_KEY = registerKey("morning_glory_group_key");
    public static final RegistryKey<ConfiguredFeature<?, ?>> CROCUS_GROUP_KEY = registerKey("crocus_group_key");
    public static final RegistryKey<ConfiguredFeature<?, ?>> GERANIUM_GROUP_KEY = registerKey("geranium_group_key");
    public static final RegistryKey<ConfiguredFeature<?, ?>> DESERT_GROUP_KEY = registerKey("desert_group_key");

    public static final RegistryKey<ConfiguredFeature<?, ?>> RED_PURPLE1_KEY = registerKey("red_purple1_key");
    public static final RegistryKey<ConfiguredFeature<?, ?>> RED_PURPLE2_KEY = registerKey("red_purple2_key");
    public static final RegistryKey<ConfiguredFeature<?, ?>> RED_PURPLE3_KEY = registerKey("red_purple3_key");
    public static final RegistryKey<ConfiguredFeature<?, ?>> YELLOW_ORANGE1_KEY = registerKey("yellow_orange1_key");
    public static final RegistryKey<ConfiguredFeature<?, ?>> YELLOW_ORANGE2_KEY = registerKey("yellow_orange2_key");
    public static final RegistryKey<ConfiguredFeature<?, ?>> YELLOW_ORANGE3_KEY = registerKey("yellow_orange3_key");
    public static final RegistryKey<ConfiguredFeature<?, ?>> PINK_MAGENTA1_KEY = registerKey("pink_magenta1_key");
    public static final RegistryKey<ConfiguredFeature<?, ?>> PINK_MAGENTA2_KEY = registerKey("pink_magenta2_key");
    public static final RegistryKey<ConfiguredFeature<?, ?>> PINK_MAGENTA3_KEY = registerKey("pink_magenta3_key");
    public static final RegistryKey<ConfiguredFeature<?, ?>> BLUE_PURPLE1_KEY = registerKey("blue_purple1_key");
    public static final RegistryKey<ConfiguredFeature<?, ?>> BLUE_PURPLE2_KEY = registerKey("blue_purple2_key");
    public static final RegistryKey<ConfiguredFeature<?, ?>> BLUE_PURPLE3_KEY = registerKey("blue_purple3_key");
    public static final RegistryKey<ConfiguredFeature<?, ?>> RED_ORANGE1_KEY = registerKey("red_orange1_key");
    public static final RegistryKey<ConfiguredFeature<?, ?>> RED_ORANGE2_KEY = registerKey("red_orange2_key");
    public static final RegistryKey<ConfiguredFeature<?, ?>> YELLOW_PURPLE1_KEY = registerKey("yellow_purple1_key");
    public static final RegistryKey<ConfiguredFeature<?, ?>> YELLOW_PURPLE2_KEY = registerKey("yellow_purple2_key");
    public static final RegistryKey<ConfiguredFeature<?, ?>> PINK_BLUE1_KEY = registerKey("pink_blue1_key");
    public static final RegistryKey<ConfiguredFeature<?, ?>> PINK_BLUE2_KEY = registerKey("pink_blue2_key");
    public static final RegistryKey<ConfiguredFeature<?, ?>> MAGENTA_WHITE1_KEY = registerKey("magenta_white1_key");
    public static final RegistryKey<ConfiguredFeature<?, ?>> MAGENTA_WHITE2_KEY = registerKey("magenta_white2_key");
    public static final RegistryKey<ConfiguredFeature<?, ?>> CYAN_BLUE1_KEY = registerKey("cyan_blue1_key");
    public static final RegistryKey<ConfiguredFeature<?, ?>> CYAN_BLUE2_KEY = registerKey("cyan_blue2_key");
    public static final RegistryKey<ConfiguredFeature<?, ?>> GREEN_MIX1_KEY = registerKey("green_mix1_key");
    public static final RegistryKey<ConfiguredFeature<?, ?>> GREEN_MIX2_KEY = registerKey("green_mix2_key");

    public static final RegistryKey<ConfiguredFeature<?, ?>> CACTUS_GROUP_KEY = registerKey("cactus_group_key");
    public static final RegistryKey<ConfiguredFeature<?, ?>> MUSHROOM_GROUP_KEY = registerKey("mushroom_group_key");
    public static final RegistryKey<ConfiguredFeature<?, ?>> EXOTIC_GROUP_KEY = registerKey("exotic_group_key");
    public static final RegistryKey<ConfiguredFeature<?, ?>> TREE_FLOWER_GROUP_KEY = registerKey("tree_flower_group_key");
    public static final RegistryKey<ConfiguredFeature<?, ?>> ALPINE_GROUP_KEY = registerKey("alpine_group_key");
    public static final RegistryKey<ConfiguredFeature<?, ?>> WHITE_GROUP_KEY = registerKey("white_group_key");
    public static final RegistryKey<ConfiguredFeature<?, ?>> DESERT_DRY_GROUP_KEY = registerKey("desert_dry_group_key");
    public static final RegistryKey<ConfiguredFeature<?, ?>> SPECIAL_BLUE_GROUP_KEY = registerKey("special_blue_group_key");
    public static final RegistryKey<ConfiguredFeature<?, ?>> FANCY_IRIS_GROUP_KEY = registerKey("fancy_iris_group_key");
    public static final RegistryKey<ConfiguredFeature<?, ?>> SWEETPEAS_GROUP_KEY = registerKey("sweetpeas_group_key");
    public static final RegistryKey<ConfiguredFeature<?, ?>> DAISY_MIXED_GROUP_KEY = registerKey("daisy_mixed_group_key");
    public static final RegistryKey<ConfiguredFeature<?, ?>> DESERT_EXTRA1_KEY = registerKey("desert_extra1_key");


    static Map<Block, Integer> african_daisy_group = Map.of(
            ModBlocks.AFRICAN_DAISY, 1,
            ModBlocks.PURPLE_AFRICAN_DAISY, 1
    );

    static Map<Block, Integer> calla_lily_group = Map.of(
            ModBlocks.CALLA_LILY, 1,
            ModBlocks.PURPLE_CALLA_LILY, 1,
            ModBlocks.TALL_CALLA_LILY, 1
    );

    static Map<Block, Integer> day_liy_group = Map.of(
            ModBlocks.BLUE_TINSEL_LILY, 1,
            ModBlocks.DAY_LILY, 1,
            ModBlocks.GLORIOSA_LILY, 1,
            ModBlocks.ORANGE_DAY_LILY, 1
    );

    static Map<Block, Integer> red_purple1 = Map.of(
            ModBlocks.BANEBERRY,1,
            ModBlocks.BUCKWHEAT_RED,1,
            ModBlocks.AFRICAN_DAISY,1,
            ModBlocks.BACHELOR_BUTTON,1
    );

    static Map<Block, Integer> red_purple2 = Map.of(
            ModBlocks.DAHLIA,1,
            ModBlocks.DESERT_PAINTBRUSH,1,
            ModBlocks.BLUE_EYED_GRASS,1,
            ModBlocks.COMMON_PERIWINKLE,1
    );

    static Map<Block, Integer> red_purple3 = Map.of(
            ModBlocks.CAPE_ALOE,1,
            ModBlocks.DESERT_STURT_PEA,1,
            ModBlocks.CREEPING_THYME,1,
            ModBlocks.MEXICAN_SAGE,1
    );

    // --- Gruppi per fiore specifico
    static Map<Block, Integer> lupin_group = Map.of(
            ModBlocks.ORANGE_LUPIN, 1,
            ModBlocks.YELLOW_LUPIN, 1,
            ModBlocks.PURPLE_LUPIN, 1,
            ModBlocks.TALL_LUPIN, 1
    );

    static Map<Block, Integer> poppy_group = Map.of(
            ModBlocks.RED_POPPY, 1,
            ModBlocks.MENDOCINO_POPPY, 1,
            ModBlocks.CALIFORNIA_POPPY, 1,
            ModBlocks.COASTAL_LOTUS, 1
    );

    static Map<Block, Integer> zinnia_group = Map.of(
            ModBlocks.MIXED_ZINNIA, 1,
            ModBlocks.STRIPED_ZINNIA, 1,
            ModBlocks.SUNNY_ZINNIA, 1,
            ModBlocks.MAGENTA_ZINNIA, 1
    );

    static Map<Block, Integer> sunflower_group = Map.of(
            ModBlocks.PARADOX_SUNFLOWER, 1,
            ModBlocks.RED_SUNFLOWER, 1,
            ModBlocks.SKYSCRAPER_SUNFLOWER, 1,
            ModBlocks.TEDDY_BEAR_SUNFLOWER, 1
    );

    static Map<Block, Integer> morning_glory_group = Map.of(
            ModBlocks.MORNING_GLORY, 1,
            ModBlocks.STACKED_MORNING_GLORY, 1,
            ModBlocks.PURPLE_SWEET_PEAS, 1,
            ModBlocks.MIXED_PINK_SWEET_PEAS, 1
    );

    static Map<Block, Integer> crocus_group = Map.of(
            ModBlocks.CROCUS_MIX, 1,
            ModBlocks.YELLOW_CROCUS, 1,
            ModBlocks.PURPLE_CROCUS, 1,
            ModBlocks.YELLOW_DAFFODIL, 1
    );

    static Map<Block, Integer> geranium_group = Map.of(
            ModBlocks.RED_GERANIUM, 1,
            ModBlocks.PINK_GERANIUM, 1,
            ModBlocks.LIGHT_PINK_GERANIUM, 1,
            ModBlocks.MAGENTA_CLOVER, 1
    );

    static Map<Block, Integer> desert_group = Map.of(
            ModBlocks.DESERT_PAINTBRUSH, 1,
            ModBlocks.DESERT_SAND_VERBENA, 1,
            ModBlocks.PINK_DESERT_SAND_VERBENA, 1,
            ModBlocks.DESERT_STURT_PEA, 1
    );

    // --- Yellow + Orange
    static Map<Block, Integer> yellow_orange1 = Map.of(
            ModBlocks.NASTURTIUM, 1,
            ModBlocks.ORANGE_COSMOS, 1,
            ModBlocks.ORANGE_DAY_LILY, 1,
            ModBlocks.YELLOW_STARTHISTLE, 1
    );

    static Map<Block, Integer> yellow_orange2 = Map.of(
            ModBlocks.CINQUEFOIL, 1,
            ModBlocks.CRINOLINE_STINKHORN, 1,
            ModBlocks.DAY_LILY, 1,
            ModBlocks.LANTANA, 1
    );

    static Map<Block, Integer> yellow_orange3 = Map.of(
            ModBlocks.AUSTRALIAN_FLAME_PEA, 1,
            ModBlocks.ORANGE_AUSTRALIAN_FLAME_PEA, 1,
            ModBlocks.ORANGE_FREESIA, 1,
            ModBlocks.YELLOW_FREESIA, 1
    );

    // --- Pink + Magenta
    static Map<Block, Integer> pink_magenta1 = Map.of(
            ModBlocks.BIRDS_EYE_GILIA, 1,
            ModBlocks.COSMOS, 1,
            ModBlocks.FUCHSIA, 1,
            ModBlocks.PERIWINKLE, 1
    );

    static Map<Block, Integer> pink_magenta2 = Map.of(
            ModBlocks.BLEEDING_HEART, 1,
            ModBlocks.MAGENTA_ORCHID, 1,
            ModBlocks.MAROON_MALLOW, 1,
            ModBlocks.OWLS_CLOVER, 1
    );

    static Map<Block, Integer> pink_magenta3 = Map.of(
            ModBlocks.COSMOS_MIX, 1,
            ModBlocks.MAGENTA_SWEET_PEAS, 1,
            ModBlocks.SNAPDRAGON_PINK, 1,
            ModBlocks.WOOLY_THYME, 1
    );

    // --- Blue + Purple
    static Map<Block, Integer> blue_purple1 = Map.of(
            ModBlocks.BABY_BLUE_EYES, 1,
            ModBlocks.BLUE_BACHELOR_BUTTON, 1,
            ModBlocks.IRIS, 1,
            ModBlocks.MOJAVE_INDIGO_BUSH, 1
    );

    static Map<Block, Integer> blue_purple2 = Map.of(
            ModBlocks.DARK_BLUE_BORAGE, 1,
            ModBlocks.BLUE_BELL_BACHELOR_BUTTON, 1,
            ModBlocks.LARKSPUR, 1,
            ModBlocks.PURPLE_LARKSPUR, 1
    );

    static Map<Block, Integer> blue_purple3 = Map.of(
            ModBlocks.VIRGINIA_COWSLIP, 1,
            ModBlocks.LIGHT_BLUE_LOBELIA, 1,
            ModBlocks.ROYAL_BLUE_LOBELIA, 1,
            ModBlocks.PURPLE_MAGENTA_SALVIA, 1
    );

    // --- Special groups
    static Map<Block, Integer> cactus_group = Map.of(
            ModBlocks.PITCHER_PLANT, 1,
            ModBlocks.TALL_CACTUS, 1,
            ModBlocks.MANZANITA_BUSH, 1,
            ModBlocks.VENUS_FLY_TRAP, 1
    );

    static Map<Block, Integer> mushroom_group = Map.of(
            ModBlocks.VIOLET_WEBCAP, 1,
            ModBlocks.INKY_CAP, 1,
            ModBlocks.CRACKING_RUSSULA, 1,
            ModBlocks.DARKOSTO_TRAPOSTO, 1
    );

    static Map<Block, Integer> exotic_group = Map.of(
            ModBlocks.ENGELMANNS_HEDGEHOG_CACTUS, 1,
            ModBlocks.JEWEL_OF_THE_DESERT, 1,
            ModBlocks.GOLDEN_BEAN, 1,
            ModBlocks.LEWISIA, 1
    );

    static Map<Block, Integer> tree_flower_group = Map.of(
            ModBlocks.ORNAMENTAL_CHERRY, 1,
            ModBlocks.HAWTHORNE, 1,
            ModBlocks.QUINCE, 1,
            ModBlocks.FLOWERING_CURRENT, 1
    );

    static Map<Block, Integer> alpine_group = Map.of(
            ModBlocks.ALBUCA_NAMAQUENSIS, 1,
            ModBlocks.SPROUT, 1,
            ModBlocks.BORAGE, 1,
            ModBlocks.NOTCH_LEAF_SCORPION_WEED, 1
    );

    static Map<Block, Integer> white_group = Map.of(
            ModBlocks.WHITE_TINSEL, 1,
            ModBlocks.CHRYSANTHENUM, 1,
            ModBlocks.NARCISSUS, 1,
            ModBlocks.SNAPDRAGON_WHITE, 1
    );

    static Map<Block, Integer> desert_dry_group = Map.of(
            ModBlocks.TUMBLE_WEED, 1,
            ModBlocks.DRIED_SUNFLOWER, 1
    );

    static Map<Block, Integer> special_blue_group = Map.of(
            ModBlocks.AUSTRALIAN_CORNFLOWER, 1,
            ModBlocks.HIMALAYAN_BLUE_POPPY, 1,
            ModBlocks.CYAN_HYACINTH, 1,
            ModBlocks.COMMELINA, 1
    );

    static Map<Block, Integer> fancy_iris_group = Map.of(
            ModBlocks.IRIS_FANCY, 1,
            ModBlocks.LAVENDER_LARKSPUR, 1,
            ModBlocks.LIGHT_PINK_LARKSPUR, 1,
            ModBlocks.PINK_LARKSPUR, 1
    );

    static Map<Block, Integer> sweetpeas_group = Map.of(
            ModBlocks.BLUE_BELL_SWEET_PEAS, 1,
            ModBlocks.DARK_BLUE_SWEET_PEAS, 1,
            ModBlocks.BRIGHT_MAGENTA_SWEET_PEAS, 1,
            ModBlocks.GLADIOLA, 1
    );

    static Map<Block, Integer> daisy_mixed_group = Map.of(
            ModBlocks.VIOLET, 1,
            ModBlocks.VIOLET_WEBCAP, 1,
            ModBlocks.SILVER_CARPET, 1,
            ModBlocks.ROCK_ROSE, 1
    );

    // --- Extra (Rosso + Arancio)
    static Map<Block, Integer> red_orange1 = Map.of(
            ModBlocks.RED_GERANIUM, 1,
            ModBlocks.RED_SUNFLOWER, 1,
            ModBlocks.ORANGE_GLADIOLA, 1,
            ModBlocks.LADY_SLIPPER_ORCHID, 1
    );

    static Map<Block, Integer> red_orange2 = Map.of(
            ModBlocks.CAPE_ALOE, 1,
            ModBlocks.CRIMSON_GLADIOLA, 1,
            ModBlocks.ORANGE_COSMOS, 1,
            ModBlocks.BUCKWHEAT_RED, 1
    );

    // --- Extra (Giallo + Viola)
    static Map<Block, Integer> yellow_purple1 = Map.of(
            ModBlocks.YELLOW_PATCHES, 1,
            ModBlocks.YELLOW_STARTHISTLE, 1,
            ModBlocks.PANSY_PURPLE, 1,
            ModBlocks.PURPLE_FLAG, 1
    );

    static Map<Block, Integer> yellow_purple2 = Map.of(
            ModBlocks.GOLDEN_BEAN, 1,
            ModBlocks.SUNNY_ZINNIA, 1,
            ModBlocks.IRIS, 1,
            ModBlocks.PURPLE_MAGENTA_SALVIA, 1
    );

    // --- Extra (Rosa + Blu)
    static Map<Block, Integer> pink_blue1 = Map.of(
            ModBlocks.PINK_CLOVER, 1,
            ModBlocks.LIGHT_PINK_GERANIUM, 1,
            ModBlocks.BABY_BLUE_EYES, 1,
            ModBlocks.ROYAL_BLUE_LOBELIA, 1
    );

    static Map<Block, Integer> pink_blue2 = Map.of(
            ModBlocks.SNAPDRAGON_PINK, 1,
            ModBlocks.ROCK_ROSE, 1,
            ModBlocks.BLUE_EYED_GRASS, 1,
            ModBlocks.DARK_BLUE_BORAGE, 1
    );

    // --- Extra (Magenta + Bianco)
    static Map<Block, Integer> magenta_white1 = Map.of(
            ModBlocks.MAGENTA_ORCHID, 1,
            ModBlocks.MAGENTA_ZINNIA, 1,
            ModBlocks.WHITE_TINSEL, 1,
            ModBlocks.SNAPDRAGON_WHITE, 1
    );

    static Map<Block, Integer> magenta_white2 = Map.of(
            ModBlocks.MAGENTA_CLOVER, 1,
            ModBlocks.PARROT_FLOWER, 1,
            ModBlocks.WHITE_LARKSPUR, 1,
            ModBlocks.CHRYSANTHENUM, 1
    );

    // --- Extra (Desertici aggiuntivi)
    static Map<Block, Integer> desert_extra1 = Map.of(
            ModBlocks.JEWEL_OF_THE_DESERT, 1,
            ModBlocks.DEVILS_CLAW, 1,
            ModBlocks.ENGELMANNS_HEDGEHOG_CACTUS, 1,
            ModBlocks.OCOTILLO, 1
    );

    // --- Extra (Blu + Ciano)
    static Map<Block, Integer> cyan_blue1 = Map.of(
            ModBlocks.CYAN_HYACINTH, 1,
            ModBlocks.AUSTRALIAN_CORNFLOWER, 1,
            ModBlocks.BLUE_BACHELOR_BUTTON, 1,
            ModBlocks.MEDIUM_BLUE_LOBELIA, 1
    );

    static Map<Block, Integer> cyan_blue2 = Map.of(
            ModBlocks.HIMALAYAN_BLUE_POPPY, 1,
            ModBlocks.BLUE_TINSEL_LILY, 1,
            ModBlocks.STACKED_MORNING_GLORY, 1,
            ModBlocks.DARK_BLUE_SWEET_PEAS, 1
    );

    // --- Extra (Verdi)
    static Map<Block, Integer> green_mix1 = Map.of(
            ModBlocks.VENUS_FLY_TRAP, 1,
            ModBlocks.SPROUT, 1,
            ModBlocks.MANZANITA_BUSH, 1,
            ModBlocks.ALBUCA_NAMAQUENSIS, 1
    );

    static Map<Block, Integer> green_mix2 = Map.of(
            ModBlocks.PITCHER_PLANT, 1,
            ModBlocks.TALL_CACTUS, 1,
            ModBlocks.COASTAL_LOTUS, 1,
            ModBlocks.BEACH_STRAWBERRY, 1
    );



    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context) {
        Flowers.LOGGER.info("[Configured] BootsTrap");

        register(context, RACCOON_GRAPE_KEY, Feature.RANDOM_PATCH,
                ModConfiguredFeatures.RACCOON_GRAPES_BUSH_PATCH);
        Flowers.LOGGER.info("[Configured] Created: Raccoon Grape Bush");


        register(context, AFRICAN_DAISY_GROUP_KEY, Feature.RANDOM_PATCH,
                createMixedPatch(african_daisy_group,32));

        register(context, DAY_LILY_GROUP_KEY, Feature.RANDOM_PATCH,
                createMixedPatch(day_liy_group,32));

        register(context, CALLA_LILY_GROUP_KEY, Feature.RANDOM_PATCH,
                createMixedPatch(calla_lily_group,32));

        register(context, LUPIN_GROUP_KEY, Feature.RANDOM_PATCH,
                createMixedPatch(lupin_group,32));

        register(context, POPPY_GROUP_KEY, Feature.RANDOM_PATCH,
                createMixedPatch(poppy_group,32));

        register(context, ZINNIA_GROUP_KEY, Feature.RANDOM_PATCH,
                createMixedPatch(zinnia_group,32));

        register(context, SUNFLOWER_GROUP_KEY, Feature.RANDOM_PATCH,
                createMixedPatch(sunflower_group,32));

        register(context, MORNING_GLORY_GROUP_KEY, Feature.RANDOM_PATCH,
                createMixedPatch(morning_glory_group,32));

        register(context, CROCUS_GROUP_KEY, Feature.RANDOM_PATCH,
                createMixedPatch(crocus_group,32));

        register(context, GERANIUM_GROUP_KEY, Feature.RANDOM_PATCH,
                createMixedPatch(geranium_group,32));

        register(context, DESERT_GROUP_KEY, Feature.RANDOM_PATCH,
                createMixedPatch(desert_group,32));


        register(context, RED_PURPLE1_KEY, Feature.RANDOM_PATCH,
                createMixedPatch(red_purple1,32));

        register(context, RED_PURPLE2_KEY, Feature.RANDOM_PATCH,
                createMixedPatch(red_purple2,32));

        register(context, RED_PURPLE3_KEY, Feature.RANDOM_PATCH,
                createMixedPatch(red_purple3,32));

        register(context, YELLOW_ORANGE1_KEY, Feature.RANDOM_PATCH,
                createMixedPatch(yellow_orange1,32));

        register(context, YELLOW_ORANGE2_KEY, Feature.RANDOM_PATCH,
                createMixedPatch(yellow_orange2,32));

        register(context, YELLOW_ORANGE3_KEY, Feature.RANDOM_PATCH,
                createMixedPatch(yellow_orange3,32));

        register(context, PINK_MAGENTA1_KEY, Feature.RANDOM_PATCH,
                createMixedPatch(pink_magenta1,32));

        register(context, PINK_MAGENTA2_KEY, Feature.RANDOM_PATCH,
                createMixedPatch(pink_magenta2,32));

        register(context, PINK_MAGENTA3_KEY, Feature.RANDOM_PATCH,
                createMixedPatch(pink_magenta3,32));

        register(context, BLUE_PURPLE1_KEY, Feature.RANDOM_PATCH,
                createMixedPatch(blue_purple1,32));

        register(context, BLUE_PURPLE2_KEY, Feature.RANDOM_PATCH,
                createMixedPatch(blue_purple2,32));

        register(context, BLUE_PURPLE3_KEY, Feature.RANDOM_PATCH,
                createMixedPatch(blue_purple3,32));

        register(context, RED_ORANGE1_KEY, Feature.RANDOM_PATCH,
                createMixedPatch(red_orange1,32));

        register(context, RED_ORANGE2_KEY, Feature.RANDOM_PATCH,
                createMixedPatch(red_orange2,32));

        register(context, YELLOW_PURPLE1_KEY, Feature.RANDOM_PATCH,
                createMixedPatch(yellow_purple1,32));

        register(context, YELLOW_PURPLE2_KEY, Feature.RANDOM_PATCH,
                createMixedPatch(yellow_purple2,32));

        register(context, PINK_BLUE1_KEY, Feature.RANDOM_PATCH,
                createMixedPatch(pink_blue1,32));

        register(context, PINK_BLUE2_KEY, Feature.RANDOM_PATCH,
                createMixedPatch(pink_blue2,32));

        register(context, MAGENTA_WHITE1_KEY, Feature.RANDOM_PATCH,
                createMixedPatch(magenta_white1,32));

        register(context, MAGENTA_WHITE2_KEY, Feature.RANDOM_PATCH,
                createMixedPatch(magenta_white2,32));

        register(context, CYAN_BLUE1_KEY, Feature.RANDOM_PATCH,
                createMixedPatch(cyan_blue1,32));

        register(context, CYAN_BLUE2_KEY, Feature.RANDOM_PATCH,
                createMixedPatch(cyan_blue2,32));

        register(context, GREEN_MIX1_KEY, Feature.RANDOM_PATCH,
                createMixedPatch(green_mix1,32));

        register(context, GREEN_MIX2_KEY, Feature.RANDOM_PATCH,
                createMixedPatch(green_mix2,32));


        register(context, CACTUS_GROUP_KEY, Feature.RANDOM_PATCH,
                createMixedPatch(cactus_group,32));

        register(context, MUSHROOM_GROUP_KEY, Feature.RANDOM_PATCH,
                createMixedPatch(mushroom_group,32));

        register(context, EXOTIC_GROUP_KEY, Feature.RANDOM_PATCH,
                createMixedPatch(exotic_group,32));

        register(context, TREE_FLOWER_GROUP_KEY, Feature.RANDOM_PATCH,
                createMixedPatch(tree_flower_group,32));

        register(context, ALPINE_GROUP_KEY, Feature.RANDOM_PATCH,
                createMixedPatch(alpine_group,32));

        register(context, WHITE_GROUP_KEY, Feature.RANDOM_PATCH,
                createMixedPatch(white_group,32));

        register(context, DESERT_DRY_GROUP_KEY, Feature.RANDOM_PATCH,
                createMixedPatch(desert_dry_group,32));

        register(context, SPECIAL_BLUE_GROUP_KEY, Feature.RANDOM_PATCH,
                createMixedPatch(special_blue_group,32));

        register(context, FANCY_IRIS_GROUP_KEY, Feature.RANDOM_PATCH,
                createMixedPatch(fancy_iris_group,32));

        register(context, SWEETPEAS_GROUP_KEY, Feature.RANDOM_PATCH,
                createMixedPatch(sweetpeas_group,32));

        register(context, DAISY_MIXED_GROUP_KEY, Feature.RANDOM_PATCH,
                createMixedPatch(daisy_mixed_group,32));

        register(context, DESERT_EXTRA1_KEY, Feature.RANDOM_PATCH,
                createMixedPatch(desert_extra1,32));
    }

    public static RandomPatchFeatureConfig createSimplePatch(Block block, int tries) {
        Flowers.LOGGER.info("[Configured] Created Simple Patch of Tries " + tries);
        return ConfiguredFeatures.createRandomPatchFeatureConfig(
                tries,
                PlacedFeatures.createEntry(
                        Feature.SIMPLE_BLOCK,
                        new SimpleBlockFeatureConfig(BlockStateProvider.of(block.getDefaultState()))
                )
        );
    }

    public static RandomPatchFeatureConfig createMixedPatch(Map<Block, Integer> blocksWithWeights, int tries) {
        Flowers.LOGGER.info("[Configured] Created Mixed Patch of Tries " + tries);

        DataPool.Builder<BlockState> poolBuilder = DataPool.builder();
        for (Map.Entry<Block, Integer> entry : blocksWithWeights.entrySet()) {
            poolBuilder.add(entry.getKey().getDefaultState(), entry.getValue());
        }

        WeightedBlockStateProvider provider = new WeightedBlockStateProvider(poolBuilder.build());
        SimpleBlockFeatureConfig config = new SimpleBlockFeatureConfig(provider);

        return ConfiguredFeatures.createRandomPatchFeatureConfig(
                tries,
                PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK, config)
        );
    }

    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, Identifier.of(Flowers.MOD_ID, name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(@NotNull Registerable<ConfiguredFeature<?, ?>> context,
                                                                                   RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }

    public static final RandomPatchFeatureConfig RACCOON_GRAPES_BUSH_PATCH = ConfiguredFeatures.createRandomPatchFeatureConfig(
            Feature.SIMPLE_BLOCK,
            new SimpleBlockFeatureConfig(
                    BlockStateProvider.of(ModBlocks.RACCOON_GRAPES_BUSH.getDefaultState()
                            .with(RacoonGrapeBlock.AGE, 3))
            ),
            List.of(Blocks.GRASS_BLOCK)
    );
}
