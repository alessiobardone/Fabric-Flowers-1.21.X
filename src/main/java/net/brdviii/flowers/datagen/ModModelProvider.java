package net.brdviii.flowers.datagen;

import net.brdviii.flowers.block.custom.RacoonGrapeBlock;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.brdviii.flowers.block.ModBlocks;
import net.minecraft.client.data.BlockStateModelGenerator;
import net.minecraft.client.data.ItemModelGenerator;


public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerDoubleBlock(ModBlocks.BLUE_BELL_SWEET_PEAS, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerDoubleBlock(ModBlocks.BRIGHT_MAGENTA_SWEET_PEAS, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerDoubleBlock(ModBlocks.CAPE_ALOE, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerDoubleBlock(ModBlocks.CRIMSON_GLADIOLA, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerDoubleBlock(ModBlocks.DARK_BLUE_SWEET_PEAS, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerDoubleBlock(ModBlocks.DATURA, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerDoubleBlock(ModBlocks.FLOWERING_CURRENT, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerDoubleBlock(ModBlocks.GLADIOLA, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerDoubleBlock(ModBlocks.GLORIOSA_LILY, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerDoubleBlock(ModBlocks.HAWTHORNE, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerDoubleBlock(ModBlocks.HIMALAYAN_BLUE_POPPY, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerDoubleBlock(ModBlocks.IRIS, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerDoubleBlock(ModBlocks.IRIS_FANCY, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerDoubleBlock(ModBlocks.LARKSPUR, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerDoubleBlock(ModBlocks.LAVENDER_LARKSPUR, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerDoubleBlock(ModBlocks.LIGHT_PINK_LARKSPUR, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerDoubleBlock(ModBlocks.MAGENTA_LARKSPUR, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerDoubleBlock(ModBlocks.MAGENTA_SWEET_PEAS, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerDoubleBlock(ModBlocks.MANZANITA_BUSH, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerDoubleBlock(ModBlocks.MENDOCINO_POPPY, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerDoubleBlock(ModBlocks.MIXED_PINK_SWEET_PEAS, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerDoubleBlock(ModBlocks.MOJAVE_INDIGO_BUSH, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerDoubleBlock(ModBlocks.OCOTILLO, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerDoubleBlock(ModBlocks.ORANGE_GLADIOLA, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerDoubleBlock(ModBlocks.ORNAMENTAL_CHERRY, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerDoubleBlock(ModBlocks.PARADOX_SUNFLOWER, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerDoubleBlock(ModBlocks.PEACH_GLADIOLA, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerDoubleBlock(ModBlocks.PINK_LARKSPUR, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerDoubleBlock(ModBlocks.PURPLE_LARKSPUR, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerDoubleBlock(ModBlocks.PURPLE_SWEET_PEAS, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerDoubleBlock(ModBlocks.QUINCE, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerDoubleBlock(ModBlocks.STACKED_MORNING_GLORY, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerDoubleBlock(ModBlocks.STACKED_NASTURTIUM, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerDoubleBlock(ModBlocks.STACKED_NASTURTIUM_PINK, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerDoubleBlock(ModBlocks.SUNDANCE_KID, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerDoubleBlock(ModBlocks.TALL_CACTUS, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerDoubleBlock(ModBlocks.TALL_CALLA_LILY, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerDoubleBlock(ModBlocks.TALL_COSMOS, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerDoubleBlock(ModBlocks.TALL_LUPIN, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerDoubleBlock(ModBlocks.TALL_ORANGE_COSMOS, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerDoubleBlock(ModBlocks.TEDDY_BEAR_SUNFLOWER, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerDoubleBlock(ModBlocks.WHITE_LARKSPUR, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerDoubleBlock(ModBlocks.YUCCA_FLOWER, BlockStateModelGenerator.CrossType.NOT_TINTED);

        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.AFRICAN_DAISY,ModBlocks.POTTED_AFRICAN_DAISY,BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.ALBUCA_NAMAQUENSIS,ModBlocks.POTTED_ALBUCA_NAMAQUENSIS,BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.AUSTRALIAN_CORNFLOWER,ModBlocks.POTTED_AUSTRALIAN_CORNFLOWER,BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.AUSTRALIAN_FLAME_PEA,ModBlocks.POTTED_AUSTRALIAN_FLAME_PEA,BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.BABY_BLUE_EYES,ModBlocks.POTTED_BABY_BLUE_EYES,BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.BABY_BLUE_EYES_SMALL,ModBlocks.POTTED_BABY_BLUE_EYES_SMALL,BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.BACHELOR_BUTTON,ModBlocks.POTTED_BACHELOR_BUTTON,BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.BANEBERRY,ModBlocks.POTTED_BANEBERRY,BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.BEACH_STRAWBERRY,ModBlocks.POTTED_BEACH_STRAWBERRY,BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.BIRDS_EYE_GILIA,ModBlocks.POTTED_BIRDS_EYE_GILIA,BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.BLEEDING_HEART,ModBlocks.POTTED_BLEEDING_HEART,BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.BLUE_BACHELOR_BUTTON,ModBlocks.POTTED_BLUE_BACHELOR_BUTTON,BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.BLUE_BELL_BACHELOR_BUTTON,ModBlocks.POTTED_BLUE_BELL_BACHELOR_BUTTON,BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.BLUE_TINSEL_LILY,ModBlocks.POTTED_BLUE_TINSEL_LILY,BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.BORAGE,ModBlocks.POTTED_BORAGE,BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.BUCKWHEAT,ModBlocks.POTTED_BUCKWHEAT,BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.BUCKWHEAT_RED,ModBlocks.POTTED_BUCKWHEAT_RED,BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.CALIFORNIA_POPPY,ModBlocks.POTTED_CALIFORNIA_POPPY,BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.CALIFORNIA_SEA_THRIFT,ModBlocks.POTTED_CALIFORNIA_SEA_THRIFT,BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.CALLA_LILY,ModBlocks.POTTED_CALLA_LILY,BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.CHRYSANTHENUM,ModBlocks.POTTED_CHRYSANTHENUM,BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.CINQUEFOIL,ModBlocks.POTTED_CINQUEFOIL,BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.CLOUD_BLUE_CORYDALIS,ModBlocks.POTTED_CLOUD_BLUE_CORYDALIS,BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.COASTAL_LOTUS,ModBlocks.POTTED_COASTAL_LOTUS,BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.COMMELINA,ModBlocks.POTTED_COMMELINA,BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.COMMON_PERIWINKLE,ModBlocks.POTTED_COMMON_PERIWINKLE,BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.CORYDALIS,ModBlocks.POTTED_CORYDALIS,BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.COSMOS,ModBlocks.POTTED_COSMOS,BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.COSMOS_MIX,ModBlocks.POTTED_COSMOS_MIX,BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.CRACKING_RUSSULA,ModBlocks.POTTED_CRACKING_RUSSULA,BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.CREEPING_THYME,ModBlocks.POTTED_CREEPING_THYME,BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.CRINOLINE_STINKHORN,ModBlocks.POTTED_CRINOLINE_STINKHORN,BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.CROCUS_MIX,ModBlocks.POTTED_CROCUS_MIX,BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.CYAN_HYACINTH,ModBlocks.POTTED_CYAN_HYACINTH,BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.DAHLIA,ModBlocks.POTTED_DAHLIA,BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.DARK_BLUE_BORAGE,ModBlocks.POTTED_DARK_BLUE_BORAGE,BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.DARKOSTO_TRAPOSTO,ModBlocks.POTTED_DARKOSTO_TRAPOSTO,BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.DAY_LILY,ModBlocks.POTTED_DAY_LILY,BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.DESERT_PAINTBRUSH,ModBlocks.POTTED_DESERT_PAINTBRUSH,BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.DESERT_SAND_VERBENA,ModBlocks.POTTED_DESERT_SAND_VERBENA,BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.DESERT_STURT_PEA,ModBlocks.POTTED_DESERT_STURT_PEA,BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.ECHINACEA,ModBlocks.POTTED_ECHINACEA,BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.ENGELMANNS_HEDGEHOG_CACTUS,ModBlocks.POTTED_ENGELMANNS_HEDGEHOG_CACTUS,BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.FORGET_ME_NOT,ModBlocks.POTTED_FORGET_ME_NOT,BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.GOLDEN_BEAN,ModBlocks.POTTED_GOLDEN_BEAN,BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.GRAPE_HYACINTH,ModBlocks.POTTED_GRAPE_HYACINTH,BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.INKY_CAP,ModBlocks.POTTED_INKY_CAP,BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.JEWEL_OF_THE_DESERT,ModBlocks.POTTED_JEWEL_OF_THE_DESERT,BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.LADY_SLIPPER_ORCHID,ModBlocks.POTTED_LADY_SLIPPER_ORCHID,BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.LANTANA,ModBlocks.POTTED_LANTANA,BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.LEWISIA,ModBlocks.POTTED_LEWISIA,BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.LIGHT_BLUE_FORGET_ME_NOT,ModBlocks.POTTED_LIGHT_BLUE_FORGET_ME_NOT,BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.LIGHT_BLUE_LOBELIA,ModBlocks.POTTED_LIGHT_BLUE_LOBELIA,BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.LIGHT_PINK_GERANIUM,ModBlocks.POTTED_LIGHT_PINK_GERANIUM,BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.MAGENTA_CLOVER,ModBlocks.POTTED_MAGENTA_CLOVER,BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.MAGENTA_ORCHID,ModBlocks.POTTED_MAGENTA_ORCHID,BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.MAGENTA_ZINNIA,ModBlocks.POTTED_MAGENTA_ZINNIA,BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.MAROON_MALLOW,ModBlocks.POTTED_MAROON_MALLOW,BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.MEDIUM_BLUE_LOBELIA,ModBlocks.POTTED_MEDIUM_BLUE_LOBELIA,BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.MEXICAN_SAGE,ModBlocks.POTTED_MEXICAN_SAGE,BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.MIXED_ZINNIA,ModBlocks.POTTED_MIXED_ZINNIA,BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.MORNING_GLORY,ModBlocks.POTTED_MORNING_GLORY,BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.NARCISSUS,ModBlocks.POTTED_NARCISSUS,BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.NASTURTIUM,ModBlocks.POTTED_NASTURTIUM,BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.NASTURTIUM_PINK,ModBlocks.POTTED_NASTURTIUM_PINK,BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.NOTCH_LEAF_SCORPION_WEED,ModBlocks.POTTED_NOTCH_LEAF_SCORPION_WEED,BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.ORANGE_AUSTRALIAN_FLAME_PEA,ModBlocks.POTTED_ORANGE_AUSTRALIAN_FLAME_PEA,BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.ORANGE_COSMOS,ModBlocks.POTTED_ORANGE_COSMOS,BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.ORANGE_DAY_LILY,ModBlocks.POTTED_ORANGE_DAY_LILY,BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.ORANGE_FREESIA,ModBlocks.POTTED_ORANGE_FREESIA,BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.ORANGE_LUPIN,ModBlocks.POTTED_ORANGE_LUPIN,BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.OWLS_CLOVER,ModBlocks.POTTED_OWLS_CLOVER,BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.PANSY,ModBlocks.POTTED_PANSY,BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.PANSY_PURPLE,ModBlocks.POTTED_PANSY_PURPLE,BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.PARROT_FLOWER,ModBlocks.POTTED_PARROT_FLOWER,BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.PEPPERMINT,ModBlocks.POTTED_PEPPERMINT,BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.PERIWINKLE,ModBlocks.POTTED_PERIWINKLE,BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.PINK_CLOVER,ModBlocks.POTTED_PINK_CLOVER,BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.PINK_DESERT_SAND_VERBENA,ModBlocks.POTTED_PINK_DESERT_SAND_VERBENA,BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.PINK_GERANIUM,ModBlocks.POTTED_PINK_GERANIUM,BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.PINK_PETTICOAT,ModBlocks.POTTED_PINK_PETTICOAT,BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.PITCHER_PLANT,ModBlocks.POTTED_PITCHER_PLANT,BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.PURPLE_AFRICAN_DAISY,ModBlocks.POTTED_PURPLE_AFRICAN_DAISY,BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.PURPLE_CALLA_LILY,ModBlocks.POTTED_PURPLE_CALLA_LILY,BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.PURPLE_CROCUS,ModBlocks.POTTED_PURPLE_CROCUS,BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.PURPLE_FLAG,ModBlocks.POTTED_PURPLE_FLAG,BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.PURPLE_LUPIN,ModBlocks.POTTED_PURPLE_LUPIN,BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.PURPLE_MAGENTA_SALVIA,ModBlocks.POTTED_PURPLE_MAGENTA_SALVIA,BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.RED_CLOVER,ModBlocks.POTTED_RED_CLOVER,BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.RED_FREESIA,ModBlocks.POTTED_RED_FREESIA,BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.RED_GERANIUM,ModBlocks.POTTED_RED_GERANIUM,BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.RED_POPPY,ModBlocks.POTTED_RED_POPPY,BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.ROYAL_BLUE_LOBELIA,ModBlocks.POTTED_ROYAL_BLUE_LOBELIA,BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.SALVIA,ModBlocks.POTTED_SALVIA,BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.SILVER_CARPET,ModBlocks.POTTED_SILVER_CARPET,BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.SNAPDRAGON_PINK,ModBlocks.POTTED_SNAPDRAGON_PINK,BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.SNAPDRAGON_WHITE,ModBlocks.POTTED_SNAPDRAGON_WHITE,BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.SPROUT,ModBlocks.POTTED_SPROUT,BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.STICKY_MONKEY,ModBlocks.POTTED_STICKY_MONKEY,BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.STRIPED_ZINNIA,ModBlocks.POTTED_STRIPED_ZINNIA,BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.SUNNY_ZINNIA,ModBlocks.POTTED_SUNNY_ZINNIA,BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.VENUS_FLY_TRAP,ModBlocks.POTTED_VENUS_FLY_TRAP,BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.VIOLET,ModBlocks.POTTED_VIOLET,BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.VIRGINIA_COWSLIP,ModBlocks.POTTED_VIRGINIA_COWSLIP,BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.WHITE_DAFFODIL,ModBlocks.POTTED_WHITE_DAFFODIL,BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.WHITE_TINSEL,ModBlocks.POTTED_WHITE_TINSEL,BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.WOLFS_BANE,ModBlocks.POTTED_WOLFS_BANE,BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.WOOLY_THYME,ModBlocks.POTTED_WOOLY_THYME,BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.YELLOW_COSMOS,ModBlocks.POTTED_YELLOW_COSMOS,BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.YELLOW_CROCUS,ModBlocks.POTTED_YELLOW_CROCUS,BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.YELLOW_DAFFODIL,ModBlocks.POTTED_YELLOW_DAFFODIL,BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.YELLOW_FREESIA,ModBlocks.POTTED_YELLOW_FREESIA,BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.YELLOW_LUPIN,ModBlocks.POTTED_YELLOW_LUPIN,BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.YELLOW_STARTHISTLE,ModBlocks.POTTED_YELLOW_STARTHISTLE,BlockStateModelGenerator.CrossType.NOT_TINTED);


        blockStateModelGenerator.registerTintableCross(ModBlocks.BEACH_GRASS, BlockStateModelGenerator.CrossType.TINTED);
        blockStateModelGenerator.registerTintableCross(ModBlocks.BLUE_EYED_GRASS, BlockStateModelGenerator.CrossType.TINTED);
        blockStateModelGenerator.registerTintableCross(ModBlocks.CACTUS, BlockStateModelGenerator.CrossType.TINTED);
        blockStateModelGenerator.registerTintableCross(ModBlocks.PARODIA_MURICATA, BlockStateModelGenerator.CrossType.TINTED);
        blockStateModelGenerator.registerTintableCross(ModBlocks.TUMBLE_WEED, BlockStateModelGenerator.CrossType.TINTED);
        blockStateModelGenerator.registerTintableCross(ModBlocks.VIOLET_WEBCAP, BlockStateModelGenerator.CrossType.TINTED);
        blockStateModelGenerator.registerTintableCross(ModBlocks.YELLOW_PATCHES, BlockStateModelGenerator.CrossType.TINTED);

        blockStateModelGenerator.registerTintableCrossBlockStateWithStages(ModBlocks.RACCOON_GRAPES_BUSH,BlockStateModelGenerator.CrossType.NOT_TINTED,
                RacoonGrapeBlock.AGE,0,1,2,3);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
    }
}

