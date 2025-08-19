package net.brdviii.flowers.block;


import net.brdviii.flowers.Flowers;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.*;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import static net.minecraft.block.Blocks.createFlowerPotBlock;

public class ModBlocks {
    public static final Block AFRICAN_DAISY = registerBlock("african_daisy",
            new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, AbstractBlock.Settings.copy(Blocks.BLUE_ORCHID)));
    public static final Block POTTED_AFRICAN_DAISY = registerBlock("potted_african_daisy", createFlowerPotBlock(ModBlocks.AFRICAN_DAISY));

    public static final Block ALBUCA_NAMAQUENSIS = registerBlock("albuca_namaquensis",
            new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, AbstractBlock.Settings.copy(Blocks.BLUE_ORCHID)));
    public static final Block POTTED_ALBUCA_NAMAQUENSIS = registerBlock("potted_albuca_namaquensis", createFlowerPotBlock(ModBlocks.ALBUCA_NAMAQUENSIS));

    public static final Block AUSTRALIAN_CORNFLOWER = registerBlock("australian_cornflower",
            new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, AbstractBlock.Settings.copy(Blocks.BLUE_ORCHID)));
    public static final Block POTTED_AUSTRALIAN_CORNFLOWER = registerBlock("potted_australian_cornflower", createFlowerPotBlock(ModBlocks.AUSTRALIAN_CORNFLOWER));

    public static final Block AUSTRALIAN_FLAME_PEA = registerBlock("australian_flame_pea",
            new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, AbstractBlock.Settings.copy(Blocks.BLUE_ORCHID)));
    public static final Block POTTED_AUSTRALIAN_FLAME_PEA = registerBlock("potted_australian_flame_pea", createFlowerPotBlock(ModBlocks.AUSTRALIAN_FLAME_PEA));

    public static final Block BABY_BLUE_EYES = registerBlock("baby_blue_eyes",
            new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, AbstractBlock.Settings.copy(Blocks.BLUE_ORCHID)));
    public static final Block POTTED_BABY_BLUE_EYES = registerBlock("potted_baby_blue_eyes", createFlowerPotBlock(ModBlocks.BABY_BLUE_EYES));

    public static final Block BABY_BLUE_EYES_SMALL = registerBlock("baby_blue_eyes_small",
            new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, AbstractBlock.Settings.copy(Blocks.BLUE_ORCHID)));
    public static final Block POTTED_BABY_BLUE_EYES_SMALL = registerBlock("potted_baby_blue_eyes_small", createFlowerPotBlock(ModBlocks.BABY_BLUE_EYES_SMALL));

    public static final Block BACHELOR_BUTTON = registerBlock("bachelor_button",
            new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, AbstractBlock.Settings.copy(Blocks.BLUE_ORCHID)));
    public static final Block POTTED_BACHELOR_BUTTON = registerBlock("potted_bachelor_button", createFlowerPotBlock(ModBlocks.BACHELOR_BUTTON));

    public static final Block BANEBERRY = registerBlock("baneberry",
            new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, AbstractBlock.Settings.copy(Blocks.BLUE_ORCHID)));
    public static final Block POTTED_BANEBERRY = registerBlock("potted_baneberry", createFlowerPotBlock(ModBlocks.BANEBERRY));

    public static final Block BEACH_GRASS = registerBlock("beach_grass",
            new ShortPlantBlock(AbstractBlock.Settings.copy(Blocks.SHORT_GRASS)));

    public static final Block BEACH_STRAWBERRY = registerBlock("beach_strawberry",
            new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, AbstractBlock.Settings.copy(Blocks.BLUE_ORCHID)));
    public static final Block POTTED_BEACH_STRAWBERRY = registerBlock("potted_beach_strawberry", createFlowerPotBlock(ModBlocks.BEACH_STRAWBERRY));

    public static final Block BIRDS_EYE_GILIA = registerBlock("birds_eye_gilia",
            new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, AbstractBlock.Settings.copy(Blocks.BLUE_ORCHID)));
    public static final Block POTTED_BIRDS_EYE_GILIA = registerBlock("potted_birds_eye_gilia", createFlowerPotBlock(ModBlocks.BIRDS_EYE_GILIA));

    public static final Block BLEEDING_HEART = registerBlock("bleeding_heart",
            new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, AbstractBlock.Settings.copy(Blocks.BLUE_ORCHID)));
    public static final Block POTTED_BLEEDING_HEART = registerBlock("potted_bleeding_heart", createFlowerPotBlock(ModBlocks.BLEEDING_HEART));

    public static final Block BLUE_BACHELOR_BUTTON = registerBlock("blue_bachelor_button",
            new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, AbstractBlock.Settings.copy(Blocks.BLUE_ORCHID)));
    public static final Block POTTED_BLUE_BACHELOR_BUTTON = registerBlock("potted_blue_bachelor_button", createFlowerPotBlock(ModBlocks.BLUE_BACHELOR_BUTTON));

    public static final Block BLUE_BELL_BACHELOR_BUTTON = registerBlock("blue_bell_bachelor_button",
            new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, AbstractBlock.Settings.copy(Blocks.BLUE_ORCHID)));
    public static final Block POTTED_BLUE_BELL_BACHELOR_BUTTON = registerBlock("potted_blue_bell_bachelor_button", createFlowerPotBlock(ModBlocks.BLUE_BELL_BACHELOR_BUTTON));

    public static final Block BLUE_BELL_SWEET_PEAS = registerBlock("blue_bell_sweet_peas",
            new TallFlowerBlock(AbstractBlock.Settings.copy(Blocks.BLUE_ORCHID)));

    public static final Block BLUE_EYED_GRASS = registerBlock("blue_eyed_grass",
            new ShortPlantBlock(AbstractBlock.Settings.copy(Blocks.SHORT_GRASS)));

    public static final Block BLUE_TINSEL_LILY = registerBlock("blue_tinsel_lily",
            new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, AbstractBlock.Settings.copy(Blocks.BLUE_ORCHID)));
    public static final Block POTTED_BLUE_TINSEL_LILY = registerBlock("potted_blue_tinsel_lily", createFlowerPotBlock(ModBlocks.BLUE_TINSEL_LILY));

    public static final Block BORAGE = registerBlock("borage",
            new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, AbstractBlock.Settings.copy(Blocks.BLUE_ORCHID)));
    public static final Block POTTED_BORAGE = registerBlock("potted_borage", createFlowerPotBlock(ModBlocks.BORAGE));

    public static final Block BRIGHT_MAGENTA_SWEET_PEAS = registerBlock("bright_magenta_sweet_peas",
            new TallFlowerBlock(AbstractBlock.Settings.copy(Blocks.BLUE_ORCHID)));

    public static final Block BUCKWHEAT = registerBlock("buckwheat",
            new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, AbstractBlock.Settings.copy(Blocks.BLUE_ORCHID)));
    public static final Block POTTED_BUCKWHEAT = registerBlock("potted_buckwheat", createFlowerPotBlock(ModBlocks.BUCKWHEAT));

    public static final Block BUCKWHEAT_RED = registerBlock("buckwheat_red",
            new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, AbstractBlock.Settings.copy(Blocks.BLUE_ORCHID)));
    public static final Block POTTED_BUCKWHEAT_RED = registerBlock("potted_buckwheat_red", createFlowerPotBlock(ModBlocks.BUCKWHEAT_RED));

    public static final Block CACTUS = registerBlock("cactus",
            new ShortPlantBlock(AbstractBlock.Settings.copy(Blocks.SHORT_GRASS)));

    public static final Block CALIFORNIA_POPPY = registerBlock("california_poppy",
            new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, AbstractBlock.Settings.copy(Blocks.BLUE_ORCHID)));
    public static final Block POTTED_CALIFORNIA_POPPY = registerBlock("potted_california_poppy", createFlowerPotBlock(ModBlocks.CALIFORNIA_POPPY));

    public static final Block CALIFORNIA_SEA_THRIFT = registerBlock("california_sea_thrift",
            new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, AbstractBlock.Settings.copy(Blocks.BLUE_ORCHID)));
    public static final Block POTTED_CALIFORNIA_SEA_THRIFT = registerBlock("potted_california_sea_thrift", createFlowerPotBlock(ModBlocks.CALIFORNIA_SEA_THRIFT));

    public static final Block CALLA_LILY = registerBlock("calla_lily",
            new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, AbstractBlock.Settings.copy(Blocks.BLUE_ORCHID)));
    public static final Block POTTED_CALLA_LILY = registerBlock("potted_calla_lily", createFlowerPotBlock(ModBlocks.CALLA_LILY));

    public static final Block CAPE_ALOE = registerBlock("cape_aloe",
            new TallFlowerBlock(AbstractBlock.Settings.copy(Blocks.BLUE_ORCHID)));

    public static final Block CHRYSANTHENUM = registerBlock("chrysanthenum",
            new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, AbstractBlock.Settings.copy(Blocks.BLUE_ORCHID)));
    public static final Block POTTED_CHRYSANTHENUM = registerBlock("potted_chrysanthenum", createFlowerPotBlock(ModBlocks.CHRYSANTHENUM));

    public static final Block CINQUEFOIL = registerBlock("cinquefoil",
            new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, AbstractBlock.Settings.copy(Blocks.BLUE_ORCHID)));
    public static final Block POTTED_CINQUEFOIL = registerBlock("potted_cinquefoil", createFlowerPotBlock(ModBlocks.CINQUEFOIL));

    public static final Block CLOUD_BLUE_CORYDALIS = registerBlock("cloud_blue_corydalis",
            new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, AbstractBlock.Settings.copy(Blocks.BLUE_ORCHID)));
    public static final Block POTTED_CLOUD_BLUE_CORYDALIS = registerBlock("potted_cloud_blue_corydalis", createFlowerPotBlock(ModBlocks.CLOUD_BLUE_CORYDALIS));

    public static final Block CLOVER_LILY = registerBlockWithoutItem("clover_lily",
            new LilyPadBlock(AbstractBlock.Settings.copy(Blocks.LILY_PAD)));

    public static final Block COASTAL_LOTUS = registerBlock("coastal_lotus",
            new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, AbstractBlock.Settings.copy(Blocks.BLUE_ORCHID)));
    public static final Block POTTED_COASTAL_LOTUS = registerBlock("potted_coastal_lotus", createFlowerPotBlock(ModBlocks.COASTAL_LOTUS));

    public static final Block COMMELINA = registerBlock("commelina",
            new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, AbstractBlock.Settings.copy(Blocks.BLUE_ORCHID)));
    public static final Block POTTED_COMMELINA = registerBlock("potted_commelina", createFlowerPotBlock(ModBlocks.COMMELINA));

    public static final Block COMMON_PERIWINKLE = registerBlock("common_periwinkle",
            new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, AbstractBlock.Settings.copy(Blocks.BLUE_ORCHID)));
    public static final Block POTTED_COMMON_PERIWINKLE = registerBlock("potted_common_periwinkle", createFlowerPotBlock(ModBlocks.COMMON_PERIWINKLE));

    public static final Block CORYDALIS = registerBlock("corydalis",
            new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, AbstractBlock.Settings.copy(Blocks.BLUE_ORCHID)));
    public static final Block POTTED_CORYDALIS = registerBlock("potted_corydalis", createFlowerPotBlock(ModBlocks.CORYDALIS));

    public static final Block COSMOS = registerBlock("cosmos",
            new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, AbstractBlock.Settings.copy(Blocks.BLUE_ORCHID)));
    public static final Block POTTED_COSMOS = registerBlock("potted_cosmos", createFlowerPotBlock(ModBlocks.COSMOS));

    public static final Block COSMOS_MIX = registerBlock("cosmos_mix",
            new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, AbstractBlock.Settings.copy(Blocks.BLUE_ORCHID)));
    public static final Block POTTED_COSMOS_MIX = registerBlock("potted_cosmos_mix", createFlowerPotBlock(ModBlocks.COSMOS_MIX));

    public static final Block CRACKING_RUSSULA = registerBlock("cracking_russula",
            new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, AbstractBlock.Settings.copy(Blocks.BLUE_ORCHID)));
    public static final Block POTTED_CRACKING_RUSSULA = registerBlock("potted_cracking_russula", createFlowerPotBlock(ModBlocks.CRACKING_RUSSULA));

    public static final Block CREEPING_THYME = registerBlock("creeping_thyme",
            new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, AbstractBlock.Settings.copy(Blocks.BLUE_ORCHID)));
    public static final Block POTTED_CREEPING_THYME = registerBlock("potted_creeping_thyme", createFlowerPotBlock(ModBlocks.CREEPING_THYME));

    public static final Block CRIMSON_GLADIOLA = registerBlock("crimson_gladiola",
            new TallFlowerBlock(AbstractBlock.Settings.copy(Blocks.BLUE_ORCHID)));

    public static final Block CRINOLINE_STINKHORN = registerBlock("crinoline_stinkhorn",
            new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, AbstractBlock.Settings.copy(Blocks.BLUE_ORCHID)));
    public static final Block POTTED_CRINOLINE_STINKHORN = registerBlock("potted_crinoline_stinkhorn", createFlowerPotBlock(ModBlocks.CRINOLINE_STINKHORN));

    public static final Block CROCUS_MIX = registerBlock("crocus_mix",
            new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, AbstractBlock.Settings.copy(Blocks.BLUE_ORCHID)));
    public static final Block POTTED_CROCUS_MIX = registerBlock("potted_crocus_mix", createFlowerPotBlock(ModBlocks.CROCUS_MIX));

    public static final Block CYAN_HYACINTH = registerBlock("cyan_hyacinth",
            new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, AbstractBlock.Settings.copy(Blocks.BLUE_ORCHID)));
    public static final Block POTTED_CYAN_HYACINTH = registerBlock("potted_cyan_hyacinth", createFlowerPotBlock(ModBlocks.CYAN_HYACINTH));

    public static final Block DAHLIA = registerBlock("dahlia",
            new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, AbstractBlock.Settings.copy(Blocks.BLUE_ORCHID)));
    public static final Block POTTED_DAHLIA = registerBlock("potted_dahlia", createFlowerPotBlock(ModBlocks.DAHLIA));

    public static final Block DARK_BLUE_BORAGE = registerBlock("dark_blue_borage",
            new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, AbstractBlock.Settings.copy(Blocks.BLUE_ORCHID)));
    public static final Block POTTED_DARK_BLUE_BORAGE = registerBlock("potted_dark_blue_borage", createFlowerPotBlock(ModBlocks.DARK_BLUE_BORAGE));

    public static final Block DARK_BLUE_SWEET_PEAS = registerBlock("dark_blue_sweet_peas",
            new TallFlowerBlock(AbstractBlock.Settings.copy(Blocks.BLUE_ORCHID)));

    public static final Block DARKOSTO_TRAPOSTO = registerBlock("darkosto_traposto",
            new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, AbstractBlock.Settings.copy(Blocks.BLUE_ORCHID)));
    public static final Block POTTED_DARKOSTO_TRAPOSTO = registerBlock("potted_darkosto_traposto", createFlowerPotBlock(ModBlocks.DARKOSTO_TRAPOSTO));

    public static final Block DATURA = registerBlock("datura",
            new TallFlowerBlock(AbstractBlock.Settings.copy(Blocks.BLUE_ORCHID)));

    public static final Block DAY_LILY = registerBlock("day_lily",
            new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, AbstractBlock.Settings.copy(Blocks.BLUE_ORCHID)));
    public static final Block POTTED_DAY_LILY = registerBlock("potted_day_lily", createFlowerPotBlock(ModBlocks.DAY_LILY));

    public static final Block DESERT_PAINTBRUSH = registerBlock("desert_paintbrush",
            new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, AbstractBlock.Settings.copy(Blocks.BLUE_ORCHID)));
    public static final Block POTTED_DESERT_PAINTBRUSH = registerBlock("potted_desert_paintbrush", createFlowerPotBlock(ModBlocks.DESERT_PAINTBRUSH));

    public static final Block DESERT_SAND_VERBENA = registerBlock("desert_sand_verbena",
            new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, AbstractBlock.Settings.copy(Blocks.BLUE_ORCHID)));
    public static final Block POTTED_DESERT_SAND_VERBENA = registerBlock("potted_desert_sand_verbena", createFlowerPotBlock(ModBlocks.DESERT_SAND_VERBENA));

    public static final Block DESERT_STURT_PEA = registerBlock("desert_sturt_pea",
            new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, AbstractBlock.Settings.copy(Blocks.BLUE_ORCHID)));
    public static final Block POTTED_DESERT_STURT_PEA = registerBlock("potted_desert_sturt_pea", createFlowerPotBlock(ModBlocks.DESERT_STURT_PEA));

    public static final Block DEVILS_CLAW = registerBlock("devils_claw",
            new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, AbstractBlock.Settings.copy(Blocks.BLUE_ORCHID)));
    public static final Block POTTED_DEVILS_CLAW = registerBlock("potted_devils_claw", createFlowerPotBlock(ModBlocks.DEVILS_CLAW));

    public static final Block DEVILS_FINGERS = registerBlock("devils_fingers",
            new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, AbstractBlock.Settings.copy(Blocks.BLUE_ORCHID)));
    public static final Block POTTED_DEVILS_FINGERS = registerBlock("potted_devils_fingers", createFlowerPotBlock(ModBlocks.DEVILS_FINGERS));

    public static final Block DRIED_SUNFLOWER = registerBlock("dried_sunflower",
            new TallFlowerBlock(AbstractBlock.Settings.copy(Blocks.BLUE_ORCHID)));

    public static final Block ECHINACEA = registerBlock("echinacea",
            new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, AbstractBlock.Settings.copy(Blocks.BLUE_ORCHID)));
    public static final Block POTTED_ECHINACEA = registerBlock("potted_echinacea", createFlowerPotBlock(ModBlocks.ECHINACEA));

    public static final Block ENGELMANNS_HEDGEHOG_CACTUS = registerBlock("engelmanns_hedgehog_cactus",
            new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, AbstractBlock.Settings.copy(Blocks.BLUE_ORCHID)));
    public static final Block POTTED_ENGELMANNS_HEDGEHOG_CACTUS = registerBlock("potted_engelmanns_hedgehog_cactus", createFlowerPotBlock(ModBlocks.ENGELMANNS_HEDGEHOG_CACTUS));

    public static final Block FLOWERING_CURRENT = registerBlock("flowering_current",
            new TallFlowerBlock(AbstractBlock.Settings.copy(Blocks.BLUE_ORCHID)));

    public static final Block FORGET_ME_NOT = registerBlock("forget_me_not",
            new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, AbstractBlock.Settings.copy(Blocks.BLUE_ORCHID)));
    public static final Block POTTED_FORGET_ME_NOT = registerBlock("potted_forget_me_not", createFlowerPotBlock(ModBlocks.FORGET_ME_NOT));

    public static final Block FROGBIT = registerBlockWithoutItem("frogbit",
            new LilyPadBlock(AbstractBlock.Settings.copy(Blocks.LILY_PAD)));

    public static final Block FUCHSIA = registerBlock("fuchsia",
            new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, AbstractBlock.Settings.copy(Blocks.BLUE_ORCHID)));
    public static final Block POTTED_FUCHSIA = registerBlock("potted_fuchsia", createFlowerPotBlock(ModBlocks.FUCHSIA));

    public static final Block GLADIOLA = registerBlock("gladiola",
            new TallFlowerBlock(AbstractBlock.Settings.copy(Blocks.BLUE_ORCHID)));

    public static final Block GLORIOSA_LILY = registerBlock("gloriosa_lily",
            new TallFlowerBlock(AbstractBlock.Settings.copy(Blocks.BLUE_ORCHID)));

    public static final Block GOLDEN_BEAN = registerBlock("golden_bean",
            new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, AbstractBlock.Settings.copy(Blocks.BLUE_ORCHID)));
    public static final Block POTTED_GOLDEN_BEAN = registerBlock("potted_golden_bean", createFlowerPotBlock(ModBlocks.GOLDEN_BEAN));

    public static final Block GRAPE_HYACINTH = registerBlock("grape_hyacinth",
            new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, AbstractBlock.Settings.copy(Blocks.BLUE_ORCHID)));
    public static final Block POTTED_GRAPE_HYACINTH = registerBlock("potted_grape_hyacinth", createFlowerPotBlock(ModBlocks.GRAPE_HYACINTH));

    public static final Block HAWTHORNE = registerBlock("hawthorne",
            new TallFlowerBlock(AbstractBlock.Settings.copy(Blocks.BLUE_ORCHID)));

    public static final Block HIMALAYAN_BLUE_POPPY = registerBlock("himalayan_blue_poppy",
            new TallFlowerBlock(AbstractBlock.Settings.copy(Blocks.BLUE_ORCHID)));

    public static final Block INKY_CAP = registerBlock("inky_cap",
            new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, AbstractBlock.Settings.copy(Blocks.BLUE_ORCHID)));
    public static final Block POTTED_INKY_CAP = registerBlock("potted_inky_cap", createFlowerPotBlock(ModBlocks.INKY_CAP));

    public static final Block IRIS = registerBlock("iris",
            new TallFlowerBlock(AbstractBlock.Settings.copy(Blocks.BLUE_ORCHID)));

    public static final Block IRIS_FANCY = registerBlock("iris_fancy_dress",
            new TallFlowerBlock(AbstractBlock.Settings.copy(Blocks.BLUE_ORCHID)));

    public static final Block JEWEL_OF_THE_DESERT = registerBlock("jewel_of_the_desert",
            new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, AbstractBlock.Settings.copy(Blocks.BLUE_ORCHID)));
    public static final Block POTTED_JEWEL_OF_THE_DESERT = registerBlock("potted_jewel_of_the_desert", createFlowerPotBlock(ModBlocks.JEWEL_OF_THE_DESERT));

    public static final Block LADY_SLIPPER_ORCHID = registerBlock("lady_slipper_orchid",
            new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, AbstractBlock.Settings.copy(Blocks.BLUE_ORCHID)));
    public static final Block POTTED_LADY_SLIPPER_ORCHID = registerBlock("potted_lady_slipper_orchid", createFlowerPotBlock(ModBlocks.LADY_SLIPPER_ORCHID));

    public static final Block LANTANA = registerBlock("lantana",
            new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, AbstractBlock.Settings.copy(Blocks.BLUE_ORCHID)));
    public static final Block POTTED_LANTANA = registerBlock("potted_lantana", createFlowerPotBlock(ModBlocks.LANTANA));

    public static final Block LARKSPUR = registerBlock("larkspur",
            new TallFlowerBlock(AbstractBlock.Settings.copy(Blocks.BLUE_ORCHID)));

    public static final Block LAVENDER_LARKSPUR = registerBlock("lavender_larkspur",
            new TallFlowerBlock(AbstractBlock.Settings.copy(Blocks.BLUE_ORCHID)));

    public static final Block LEWISIA = registerBlock("lewisia",
            new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, AbstractBlock.Settings.copy(Blocks.BLUE_ORCHID)));
    public static final Block POTTED_LEWISIA = registerBlock("potted_lewisia", createFlowerPotBlock(ModBlocks.LEWISIA));

    public static final Block LIGHT_BLUE_FORGET_ME_NOT = registerBlock("light_blue_forget_me_not",
            new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, AbstractBlock.Settings.copy(Blocks.BLUE_ORCHID)));
    public static final Block POTTED_LIGHT_BLUE_FORGET_ME_NOT = registerBlock("potted_light_blue_forget_me_not", createFlowerPotBlock(ModBlocks.LIGHT_BLUE_FORGET_ME_NOT));

    public static final Block LIGHT_BLUE_LOBELIA = registerBlock("light_blue_lobelia",
            new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, AbstractBlock.Settings.copy(Blocks.BLUE_ORCHID)));
    public static final Block POTTED_LIGHT_BLUE_LOBELIA = registerBlock("potted_light_blue_lobelia", createFlowerPotBlock(ModBlocks.LIGHT_BLUE_LOBELIA));

    public static final Block LIGHT_PINK_GERANIUM = registerBlock("light_pink_geranium",
            new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, AbstractBlock.Settings.copy(Blocks.BLUE_ORCHID)));
    public static final Block POTTED_LIGHT_PINK_GERANIUM = registerBlock("potted_light_pink_geranium", createFlowerPotBlock(ModBlocks.LIGHT_PINK_GERANIUM));

    public static final Block LIGHT_PINK_LARKSPUR = registerBlock("light_pink_larkspur",
            new TallFlowerBlock(AbstractBlock.Settings.copy(Blocks.BLUE_ORCHID)));

    public static final Block MAGENTA_CLOVER = registerBlock("magenta_clover",
            new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, AbstractBlock.Settings.copy(Blocks.BLUE_ORCHID)));
    public static final Block POTTED_MAGENTA_CLOVER = registerBlock("potted_magenta_clover", createFlowerPotBlock(ModBlocks.MAGENTA_CLOVER));

    public static final Block MAGENTA_LARKSPUR = registerBlock("magenta_larkspur",
            new TallFlowerBlock(AbstractBlock.Settings.copy(Blocks.BLUE_ORCHID)));

    public static final Block MAGENTA_ORCHID = registerBlock("magenta_orchid",
            new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, AbstractBlock.Settings.copy(Blocks.BLUE_ORCHID)));
    public static final Block POTTED_MAGENTA_ORCHID = registerBlock("potted_magenta_orchid", createFlowerPotBlock(ModBlocks.MAGENTA_ORCHID));

    public static final Block MAGENTA_SWEET_PEAS = registerBlock("magenta_sweet_peas",
            new TallFlowerBlock(AbstractBlock.Settings.copy(Blocks.BLUE_ORCHID)));

    public static final Block MAGENTA_ZINNIA = registerBlock("magenta_zinnia",
            new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, AbstractBlock.Settings.copy(Blocks.BLUE_ORCHID)));
    public static final Block POTTED_MAGENTA_ZINNIA = registerBlock("potted_magenta_zinnia", createFlowerPotBlock(ModBlocks.MAGENTA_ZINNIA));

    public static final Block MANZANITA_BUSH = registerBlock("manzanita_bush",
            new TallFlowerBlock(AbstractBlock.Settings.copy(Blocks.BLUE_ORCHID)));

    public static final Block MAROON_MALLOW = registerBlock("maroon_mallow",
            new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, AbstractBlock.Settings.copy(Blocks.BLUE_ORCHID)));
    public static final Block POTTED_MAROON_MALLOW = registerBlock("potted_maroon_mallow", createFlowerPotBlock(ModBlocks.MAROON_MALLOW));

    public static final Block MEDIUM_BLUE_LOBELIA = registerBlock("medium_blue_lobelia",
            new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, AbstractBlock.Settings.copy(Blocks.BLUE_ORCHID)));
    public static final Block POTTED_MEDIUM_BLUE_LOBELIA = registerBlock("potted_medium_blue_lobelia", createFlowerPotBlock(ModBlocks.MEDIUM_BLUE_LOBELIA));

    public static final Block MENDOCINO_POPPY = registerBlock("mendocino_poppy",
            new TallFlowerBlock(AbstractBlock.Settings.copy(Blocks.BLUE_ORCHID)));

    public static final Block MEXICAN_SAGE = registerBlock("mexican_sage",
            new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, AbstractBlock.Settings.copy(Blocks.BLUE_ORCHID)));
    public static final Block POTTED_MEXICAN_SAGE = registerBlock("potted_mexican_sage", createFlowerPotBlock(ModBlocks.MEXICAN_SAGE));

    public static final Block MIXED_PINK_SWEET_PEAS = registerBlock("mixed_pink_sweet_peas",
            new TallFlowerBlock(AbstractBlock.Settings.copy(Blocks.BLUE_ORCHID)));

    public static final Block MIXED_ZINNIA = registerBlock("mixed_zinnia",
            new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, AbstractBlock.Settings.copy(Blocks.BLUE_ORCHID)));
    public static final Block POTTED_MIXED_ZINNIA = registerBlock("potted_mixed_zinnia", createFlowerPotBlock(ModBlocks.MIXED_ZINNIA));

    public static final Block MOJAVE_INDIGO_BUSH = registerBlock("mojave_indigo_bush",
            new TallFlowerBlock(AbstractBlock.Settings.copy(Blocks.BLUE_ORCHID)));

    public static final Block MORNING_GLORY = registerBlock("morning_glory",
            new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, AbstractBlock.Settings.copy(Blocks.BLUE_ORCHID)));
    public static final Block POTTED_MORNING_GLORY = registerBlock("potted_morning_glory", createFlowerPotBlock(ModBlocks.MORNING_GLORY));

    public static final Block NARCISSUS = registerBlock("narcissus",
            new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, AbstractBlock.Settings.copy(Blocks.BLUE_ORCHID)));
    public static final Block POTTED_NARCISSUS = registerBlock("potted_narcissus", createFlowerPotBlock(ModBlocks.NARCISSUS));

    public static final Block NASTURTIUM = registerBlock("nasturtium",
            new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, AbstractBlock.Settings.copy(Blocks.BLUE_ORCHID)));
    public static final Block POTTED_NASTURTIUM = registerBlock("potted_nasturtium", createFlowerPotBlock(ModBlocks.NASTURTIUM));

    public static final Block NASTURTIUM_PINK = registerBlock("nasturtium_pink",
            new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, AbstractBlock.Settings.copy(Blocks.BLUE_ORCHID)));
    public static final Block POTTED_NASTURTIUM_PINK = registerBlock("potted_nasturtium_pink", createFlowerPotBlock(ModBlocks.NASTURTIUM_PINK));

    public static final Block NOTCH_LEAF_SCORPION_WEED = registerBlock("notch_leaf_scorpion_weed",
            new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, AbstractBlock.Settings.copy(Blocks.BLUE_ORCHID)));
    public static final Block POTTED_NOTCH_LEAF_SCORPION_WEED = registerBlock("potted_notch_leaf_scorpion_weed", createFlowerPotBlock(ModBlocks.NOTCH_LEAF_SCORPION_WEED));

    public static final Block OCOTILLO = registerBlock("ocotillo",
            new TallFlowerBlock(AbstractBlock.Settings.copy(Blocks.BLUE_ORCHID)));

    public static final Block ORANGE_AUSTRALIAN_FLAME_PEA = registerBlock("orange_australian_flame_pea",
            new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, AbstractBlock.Settings.copy(Blocks.BLUE_ORCHID)));
    public static final Block POTTED_ORANGE_AUSTRALIAN_FLAME_PEA = registerBlock("potted_orange_australian_flame_pea", createFlowerPotBlock(ModBlocks.ORANGE_AUSTRALIAN_FLAME_PEA));

    public static final Block ORANGE_COSMOS = registerBlock("orange_cosmos",
            new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, AbstractBlock.Settings.copy(Blocks.BLUE_ORCHID)));
    public static final Block POTTED_ORANGE_COSMOS = registerBlock("potted_orange_cosmos", createFlowerPotBlock(ModBlocks.ORANGE_COSMOS));

    public static final Block ORANGE_DAY_LILY = registerBlock("orange_day_lily",
            new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, AbstractBlock.Settings.copy(Blocks.BLUE_ORCHID)));
    public static final Block POTTED_ORANGE_DAY_LILY = registerBlock("potted_orange_day_lily", createFlowerPotBlock(ModBlocks.ORANGE_DAY_LILY));

    public static final Block ORANGE_FREESIA = registerBlock("orange_freesia",
            new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, AbstractBlock.Settings.copy(Blocks.BLUE_ORCHID)));
    public static final Block POTTED_ORANGE_FREESIA = registerBlock("potted_orange_freesia", createFlowerPotBlock(ModBlocks.ORANGE_FREESIA));

    public static final Block ORANGE_GLADIOLA = registerBlock("orange_gladiola",
            new TallFlowerBlock(AbstractBlock.Settings.copy(Blocks.BLUE_ORCHID)));

    public static final Block ORANGE_LUPIN = registerBlock("orange_lupin",
            new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, AbstractBlock.Settings.copy(Blocks.BLUE_ORCHID)));
    public static final Block POTTED_ORANGE_LUPIN = registerBlock("potted_orange_lupin", createFlowerPotBlock(ModBlocks.ORANGE_LUPIN));

    public static final Block ORNAMENTAL_CHERRY = registerBlock("ornamental_cherry",
            new TallFlowerBlock(AbstractBlock.Settings.copy(Blocks.BLUE_ORCHID)));

    public static final Block OWLS_CLOVER = registerBlock("owls_clover",
            new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, AbstractBlock.Settings.copy(Blocks.BLUE_ORCHID)));
    public static final Block POTTED_OWLS_CLOVER = registerBlock("potted_owls_clover", createFlowerPotBlock(ModBlocks.OWLS_CLOVER));

    public static final Block PANSY = registerBlock("pansy",
            new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, AbstractBlock.Settings.copy(Blocks.BLUE_ORCHID)));
    public static final Block POTTED_PANSY = registerBlock("potted_pansy", createFlowerPotBlock(ModBlocks.PANSY));

    public static final Block PANSY_PURPLE = registerBlock("pansy_purple",
            new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, AbstractBlock.Settings.copy(Blocks.BLUE_ORCHID)));
    public static final Block POTTED_PANSY_PURPLE = registerBlock("potted_pansy_purple", createFlowerPotBlock(ModBlocks.PANSY_PURPLE));

    public static final Block PARADOX_SUNFLOWER = registerBlock("paradox_sunflower",
            new TallFlowerBlock(AbstractBlock.Settings.copy(Blocks.BLUE_ORCHID)));

    public static final Block PARODIA_MURICATA = registerBlock("parodia_muricata",
            new ShortPlantBlock(AbstractBlock.Settings.copy(Blocks.SHORT_GRASS)));

    public static final Block PARROT_FLOWER = registerBlock("parrot_flower",
            new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, AbstractBlock.Settings.copy(Blocks.BLUE_ORCHID)));
    public static final Block POTTED_PARROT_FLOWER = registerBlock("potted_parrot_flower", createFlowerPotBlock(ModBlocks.PARROT_FLOWER));

    public static final Block PEACH_GLADIOLA = registerBlock("peach_gladiola",
            new TallFlowerBlock(AbstractBlock.Settings.copy(Blocks.BLUE_ORCHID)));


    public static final Block JOY_LARGE_LILY = registerBlockWithoutItem("joy_large_lily",
            new LilyPadBlock(AbstractBlock.Settings.copy(Blocks.LILY_PAD)));

    public static final Block JOY_LIGHT_LILY = registerBlockWithoutItem("joy_light_lily",
            new LilyPadBlock(AbstractBlock.Settings.copy(Blocks.LILY_PAD)));

    public static final Block LAVANDER_LARGE_LILY = registerBlockWithoutItem("lavander_large_lily",
            new LilyPadBlock(AbstractBlock.Settings.copy(Blocks.LILY_PAD)));

    public static final Block LAVANDER_LIGHT_LILY = registerBlockWithoutItem("lavander_light_lily",
            new LilyPadBlock(AbstractBlock.Settings.copy(Blocks.LILY_PAD)));

    public static final Block PURPLE_LARGE_LILY = registerBlockWithoutItem("purple_large_lily",
            new LilyPadBlock(AbstractBlock.Settings.copy(Blocks.LILY_PAD)));

    public static final Block PURPLE_LIGHT_LILY = registerBlockWithoutItem("purple_light_lily",
            new LilyPadBlock(AbstractBlock.Settings.copy(Blocks.LILY_PAD)));

    public static final Block SUNFIRE_LARGE_LILY = registerBlockWithoutItem("sunfire_large_lily",
            new LilyPadBlock(AbstractBlock.Settings.copy(Blocks.LILY_PAD)));

    public static final Block SUNFIRE_LIGHT_LILY = registerBlockWithoutItem("sunfire_light_lily",
            new LilyPadBlock(AbstractBlock.Settings.copy(Blocks.LILY_PAD)));


    private static Block registerBlockWithoutItem(String name, Block block){
        return Registry.register(Registries.BLOCK, Identifier.of(Flowers.MOD_ID, name), block);
    }

    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(Flowers.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(Flowers.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        Flowers.LOGGER.info("Registering Mod Block");
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(entries ->{
            entries.add(ModBlocks.AFRICAN_DAISY);
            entries.add(ModBlocks.ALBUCA_NAMAQUENSIS);
            entries.add(ModBlocks.AUSTRALIAN_CORNFLOWER);
            entries.add(ModBlocks.AUSTRALIAN_FLAME_PEA);
            entries.add(ModBlocks.BABY_BLUE_EYES);
            entries.add(ModBlocks.BABY_BLUE_EYES_SMALL);
            entries.add(ModBlocks.BACHELOR_BUTTON);
            entries.add(ModBlocks.BANEBERRY);
            entries.add(ModBlocks.BEACH_GRASS);
            entries.add(ModBlocks.BEACH_STRAWBERRY);
            entries.add(ModBlocks.BIRDS_EYE_GILIA);
            entries.add(ModBlocks.BLEEDING_HEART);
            entries.add(ModBlocks.BLUE_BACHELOR_BUTTON);
            entries.add(ModBlocks.BLUE_BELL_BACHELOR_BUTTON);
            entries.add(ModBlocks.BLUE_BELL_SWEET_PEAS);
            entries.add(ModBlocks.BLUE_EYED_GRASS);
            entries.add(ModBlocks.BLUE_TINSEL_LILY);
            entries.add(ModBlocks.BORAGE);
            entries.add(ModBlocks.BRIGHT_MAGENTA_SWEET_PEAS);
            entries.add(ModBlocks.BUCKWHEAT);
            entries.add(ModBlocks.BUCKWHEAT_RED);
            entries.add(ModBlocks.CACTUS);
            entries.add(ModBlocks.CALIFORNIA_POPPY);
            entries.add(ModBlocks.CALIFORNIA_SEA_THRIFT);
            entries.add(ModBlocks.CALLA_LILY);
            entries.add(ModBlocks.CAPE_ALOE);
            entries.add(ModBlocks.CHRYSANTHENUM);
            entries.add(ModBlocks.CINQUEFOIL);
            entries.add(ModBlocks.CLOUD_BLUE_CORYDALIS);
            entries.add(ModBlocks.COASTAL_LOTUS);
            entries.add(ModBlocks.COMMELINA);
            entries.add(ModBlocks.COMMON_PERIWINKLE);
            entries.add(ModBlocks.COSMOS);
            entries.add(ModBlocks.COSMOS_MIX);
            entries.add(ModBlocks.CRACKING_RUSSULA);
            entries.add(ModBlocks.CREEPING_THYME);
            entries.add(ModBlocks.CRIMSON_GLADIOLA);
            entries.add(ModBlocks.CRINOLINE_STINKHORN);
            entries.add(ModBlocks.CROCUS_MIX);
            entries.add(ModBlocks.CYAN_HYACINTH);
            entries.add(ModBlocks.DAHLIA);
            entries.add(ModBlocks.DARK_BLUE_BORAGE);
            entries.add(ModBlocks.DARK_BLUE_SWEET_PEAS);
            entries.add(ModBlocks.DARKOSTO_TRAPOSTO);
            entries.add(ModBlocks.DATURA);
            entries.add(ModBlocks.DAY_LILY);
            entries.add(ModBlocks.DESERT_PAINTBRUSH);
            entries.add(ModBlocks.DESERT_SAND_VERBENA);
            entries.add(ModBlocks.DESERT_STURT_PEA);
            entries.add(ModBlocks.DEVILS_CLAW);
            entries.add(ModBlocks.DEVILS_FINGERS);
            entries.add(ModBlocks.DRIED_SUNFLOWER);
            entries.add(ModBlocks.ECHINACEA);
            entries.add(ModBlocks.ENGELMANNS_HEDGEHOG_CACTUS);
            entries.add(ModBlocks.FLOWERING_CURRENT);
            entries.add(ModBlocks.FORGET_ME_NOT);
            entries.add(ModBlocks.FUCHSIA);
            entries.add(ModBlocks.GLADIOLA);
            entries.add(ModBlocks.GLORIOSA_LILY);
            entries.add(ModBlocks.GOLDEN_BEAN);
            entries.add(ModBlocks.GRAPE_HYACINTH);
            entries.add(ModBlocks.HAWTHORNE);
            entries.add(ModBlocks.HIMALAYAN_BLUE_POPPY);
            entries.add(ModBlocks.INKY_CAP);
            entries.add(ModBlocks.IRIS);
            entries.add(ModBlocks.IRIS_FANCY);
            entries.add(ModBlocks.JEWEL_OF_THE_DESERT);
            entries.add(ModBlocks.LADY_SLIPPER_ORCHID);
            entries.add(ModBlocks.LANTANA);
            entries.add(ModBlocks.LARKSPUR);
            entries.add(ModBlocks.LAVENDER_LARKSPUR);
            entries.add(ModBlocks.LEWISIA);
            entries.add(ModBlocks.LIGHT_BLUE_FORGET_ME_NOT);
            entries.add(ModBlocks.LIGHT_BLUE_LOBELIA);
            entries.add(ModBlocks.LIGHT_PINK_GERANIUM);
            entries.add(ModBlocks.LIGHT_PINK_LARKSPUR);
            entries.add(ModBlocks.MAGENTA_CLOVER);
            entries.add(ModBlocks.MAGENTA_LARKSPUR);
            entries.add(ModBlocks.MAGENTA_ORCHID);
            entries.add(ModBlocks.MAGENTA_SWEET_PEAS);
            entries.add(ModBlocks.MAGENTA_ZINNIA);
            entries.add(ModBlocks.MANZANITA_BUSH);
            entries.add(ModBlocks.MAROON_MALLOW);
            entries.add(ModBlocks.MEDIUM_BLUE_LOBELIA);
            entries.add(ModBlocks.MENDOCINO_POPPY);
            entries.add(ModBlocks.MEXICAN_SAGE);
            entries.add(ModBlocks.MIXED_PINK_SWEET_PEAS);
            entries.add(ModBlocks.MIXED_ZINNIA);
            entries.add(ModBlocks.MOJAVE_INDIGO_BUSH);
            entries.add(ModBlocks.MORNING_GLORY);
            entries.add(ModBlocks.NARCISSUS);
            entries.add(ModBlocks.NASTURTIUM);
            entries.add(ModBlocks.NASTURTIUM_PINK);
            entries.add(ModBlocks.NOTCH_LEAF_SCORPION_WEED);
            entries.add(ModBlocks.OCOTILLO);
            entries.add(ModBlocks.ORANGE_AUSTRALIAN_FLAME_PEA);
            entries.add(ModBlocks.ORANGE_COSMOS);
            entries.add(ModBlocks.ORANGE_DAY_LILY);
            entries.add(ModBlocks.ORANGE_FREESIA);
            entries.add(ModBlocks.ORANGE_GLADIOLA);
            entries.add(ModBlocks.ORANGE_LUPIN);
            entries.add(ModBlocks.ORNAMENTAL_CHERRY);
            entries.add(ModBlocks.OWLS_CLOVER);
            entries.add(ModBlocks.PANSY);
            entries.add(ModBlocks.PANSY_PURPLE);
            entries.add(ModBlocks.PARADOX_SUNFLOWER);
            entries.add(ModBlocks.PARODIA_MURICATA);
            entries.add(ModBlocks.PARROT_FLOWER);
            entries.add(ModBlocks.PEACH_GLADIOLA);
        });
    }
}
