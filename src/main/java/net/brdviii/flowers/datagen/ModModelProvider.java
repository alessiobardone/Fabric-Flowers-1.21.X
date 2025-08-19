package net.brdviii.flowers.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.enums.BambooLeaves;
import net.minecraft.data.client.*;
import net.brdviii.flowers.block.ModBlocks;
import net.minecraft.state.property.Properties;
import net.minecraft.data.client.BlockStateModelGenerator;

import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerDoubleBlock(ModBlocks.BLUE_BELL_SWEET_PEAS, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerDoubleBlock(ModBlocks.BRIGHT_MAGENTA_SWEET_PEAS, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerDoubleBlock(ModBlocks.CAPE_ALOE, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerDoubleBlock(ModBlocks.CRIMSON_GLADIOLA, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerDoubleBlock(ModBlocks.DARK_BLUE_SWEET_PEAS, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerDoubleBlock(ModBlocks.DATURA, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerDoubleBlock(ModBlocks.DRIED_SUNFLOWER, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerDoubleBlock(ModBlocks.FLOWERING_CURRENT, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerDoubleBlock(ModBlocks.GLADIOLA, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerDoubleBlock(ModBlocks.GLORIOSA_LILY, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerDoubleBlock(ModBlocks.HAWTHORNE, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerDoubleBlock(ModBlocks.HIMALAYAN_BLUE_POPPY, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerDoubleBlock(ModBlocks.IRIS, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerDoubleBlock(ModBlocks.IRIS_FANCY, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerDoubleBlock(ModBlocks.LARKSPUR, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerDoubleBlock(ModBlocks.LAVENDER_LARKSPUR, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerDoubleBlock(ModBlocks.LIGHT_PINK_LARKSPUR, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerDoubleBlock(ModBlocks.MAGENTA_LARKSPUR, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerDoubleBlock(ModBlocks.MAGENTA_SWEET_PEAS, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerDoubleBlock(ModBlocks.MANZANITA_BUSH, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerDoubleBlock(ModBlocks.MENDOCINO_POPPY, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerDoubleBlock(ModBlocks.MIXED_PINK_SWEET_PEAS, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerDoubleBlock(ModBlocks.MOJAVE_INDIGO_BUSH, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerDoubleBlock(ModBlocks.OCOTILLO, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerDoubleBlock(ModBlocks.ORANGE_GLADIOLA, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerDoubleBlock(ModBlocks.ORNAMENTAL_CHERRY, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerDoubleBlock(ModBlocks.PARADOX_SUNFLOWER, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerDoubleBlock(ModBlocks.PEACH_GLADIOLA, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerDoubleBlock(ModBlocks.PINK_LARKSPUR, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerDoubleBlock(ModBlocks.PURPLE_LARKSPUR, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerDoubleBlock(ModBlocks.PURPLE_SWEET_PEAS, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerDoubleBlock(ModBlocks.QUINCE, BlockStateModelGenerator.TintType.NOT_TINTED);

        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.AFRICAN_DAISY,ModBlocks.POTTED_AFRICAN_DAISY,BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.ALBUCA_NAMAQUENSIS,ModBlocks.POTTED_ALBUCA_NAMAQUENSIS,BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.AUSTRALIAN_CORNFLOWER,ModBlocks.POTTED_AUSTRALIAN_CORNFLOWER,BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.AUSTRALIAN_FLAME_PEA,ModBlocks.POTTED_AUSTRALIAN_FLAME_PEA,BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.BABY_BLUE_EYES,ModBlocks.POTTED_BABY_BLUE_EYES,BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.BABY_BLUE_EYES_SMALL,ModBlocks.POTTED_BABY_BLUE_EYES_SMALL,BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.BACHELOR_BUTTON,ModBlocks.POTTED_BACHELOR_BUTTON,BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.BANEBERRY,ModBlocks.POTTED_BANEBERRY,BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.BEACH_STRAWBERRY,ModBlocks.POTTED_BEACH_STRAWBERRY,BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.BIRDS_EYE_GILIA,ModBlocks.POTTED_BIRDS_EYE_GILIA,BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.BLEEDING_HEART,ModBlocks.POTTED_BLEEDING_HEART,BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.BLUE_BACHELOR_BUTTON,ModBlocks.POTTED_BLUE_BACHELOR_BUTTON,BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.BLUE_BELL_BACHELOR_BUTTON,ModBlocks.POTTED_BLUE_BELL_BACHELOR_BUTTON,BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.BLUE_TINSEL_LILY,ModBlocks.POTTED_BLUE_TINSEL_LILY,BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.BORAGE,ModBlocks.POTTED_BORAGE,BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.BUCKWHEAT,ModBlocks.POTTED_BUCKWHEAT,BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.BUCKWHEAT_RED,ModBlocks.POTTED_BUCKWHEAT_RED,BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.CALIFORNIA_POPPY,ModBlocks.POTTED_CALIFORNIA_POPPY,BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.CALIFORNIA_SEA_THRIFT,ModBlocks.POTTED_CALIFORNIA_SEA_THRIFT,BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.CALLA_LILY,ModBlocks.POTTED_CALLA_LILY,BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.CHRYSANTHENUM,ModBlocks.POTTED_CHRYSANTHENUM,BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.CINQUEFOIL,ModBlocks.POTTED_CINQUEFOIL,BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.CLOUD_BLUE_CORYDALIS,ModBlocks.POTTED_CLOUD_BLUE_CORYDALIS,BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.COASTAL_LOTUS,ModBlocks.POTTED_COASTAL_LOTUS,BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.COMMELINA,ModBlocks.POTTED_COMMELINA,BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.COMMON_PERIWINKLE,ModBlocks.POTTED_COMMON_PERIWINKLE,BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.CORYDALIS,ModBlocks.POTTED_CORYDALIS,BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.COSMOS,ModBlocks.POTTED_COSMOS,BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.COSMOS_MIX,ModBlocks.POTTED_COSMOS_MIX,BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.CRACKING_RUSSULA,ModBlocks.POTTED_CRACKING_RUSSULA,BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.CREEPING_THYME,ModBlocks.POTTED_CREEPING_THYME,BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.CRINOLINE_STINKHORN,ModBlocks.POTTED_CRINOLINE_STINKHORN,BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.CROCUS_MIX,ModBlocks.POTTED_CROCUS_MIX,BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.CYAN_HYACINTH,ModBlocks.POTTED_CYAN_HYACINTH,BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.DAHLIA,ModBlocks.POTTED_DAHLIA,BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.DARK_BLUE_BORAGE,ModBlocks.POTTED_DARK_BLUE_BORAGE,BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.DARKOSTO_TRAPOSTO,ModBlocks.POTTED_DARKOSTO_TRAPOSTO,BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.DAY_LILY,ModBlocks.POTTED_DAY_LILY,BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.DESERT_PAINTBRUSH,ModBlocks.POTTED_DESERT_PAINTBRUSH,BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.DESERT_SAND_VERBENA,ModBlocks.POTTED_DESERT_SAND_VERBENA,BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.DESERT_STURT_PEA,ModBlocks.POTTED_DESERT_STURT_PEA,BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.ECHINACEA,ModBlocks.POTTED_ECHINACEA,BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.ENGELMANNS_HEDGEHOG_CACTUS,ModBlocks.POTTED_ENGELMANNS_HEDGEHOG_CACTUS,BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.FORGET_ME_NOT,ModBlocks.POTTED_FORGET_ME_NOT,BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.GOLDEN_BEAN,ModBlocks.POTTED_GOLDEN_BEAN,BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.GRAPE_HYACINTH,ModBlocks.POTTED_GRAPE_HYACINTH,BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.INKY_CAP,ModBlocks.POTTED_INKY_CAP,BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.JEWEL_OF_THE_DESERT,ModBlocks.POTTED_JEWEL_OF_THE_DESERT,BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.LADY_SLIPPER_ORCHID,ModBlocks.POTTED_LADY_SLIPPER_ORCHID,BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.LANTANA,ModBlocks.POTTED_LANTANA,BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.LEWISIA,ModBlocks.POTTED_LEWISIA,BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.LIGHT_BLUE_FORGET_ME_NOT,ModBlocks.POTTED_LIGHT_BLUE_FORGET_ME_NOT,BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.LIGHT_BLUE_LOBELIA,ModBlocks.POTTED_LIGHT_BLUE_LOBELIA,BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.LIGHT_PINK_GERANIUM,ModBlocks.POTTED_LIGHT_PINK_GERANIUM,BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.MAGENTA_CLOVER,ModBlocks.POTTED_MAGENTA_CLOVER,BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.MAGENTA_ORCHID,ModBlocks.POTTED_MAGENTA_ORCHID,BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.MAGENTA_ZINNIA,ModBlocks.POTTED_MAGENTA_ZINNIA,BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.MAROON_MALLOW,ModBlocks.POTTED_MAROON_MALLOW,BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.MEDIUM_BLUE_LOBELIA,ModBlocks.POTTED_MEDIUM_BLUE_LOBELIA,BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.MEXICAN_SAGE,ModBlocks.POTTED_MEXICAN_SAGE,BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.MIXED_ZINNIA,ModBlocks.POTTED_MIXED_ZINNIA,BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.MORNING_GLORY,ModBlocks.POTTED_MORNING_GLORY,BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.NARCISSUS,ModBlocks.POTTED_NARCISSUS,BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.NASTURTIUM,ModBlocks.POTTED_NASTURTIUM,BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.NASTURTIUM_PINK,ModBlocks.POTTED_NASTURTIUM_PINK,BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.NOTCH_LEAF_SCORPION_WEED,ModBlocks.POTTED_NOTCH_LEAF_SCORPION_WEED,BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.ORANGE_AUSTRALIAN_FLAME_PEA,ModBlocks.POTTED_ORANGE_AUSTRALIAN_FLAME_PEA,BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.ORANGE_COSMOS,ModBlocks.POTTED_ORANGE_COSMOS,BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.ORANGE_DAY_LILY,ModBlocks.POTTED_ORANGE_DAY_LILY,BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.ORANGE_FREESIA,ModBlocks.POTTED_ORANGE_FREESIA,BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.ORANGE_LUPIN,ModBlocks.POTTED_ORANGE_LUPIN,BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.OWLS_CLOVER,ModBlocks.POTTED_OWLS_CLOVER,BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.PANSY,ModBlocks.POTTED_PANSY,BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.PANSY_PURPLE,ModBlocks.POTTED_PANSY_PURPLE,BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.PARROT_FLOWER,ModBlocks.POTTED_PARROT_FLOWER,BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.PEPPERMINT,ModBlocks.POTTED_PEPPERMINT,BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.PERIWINKLE,ModBlocks.POTTED_PERIWINKLE,BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.PINK_CLOVER,ModBlocks.POTTED_PINK_CLOVER,BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.PINK_DESERT_SAND_VERBENA,ModBlocks.POTTED_PINK_DESERT_SAND_VERBENA,BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.PINK_GERANIUM,ModBlocks.POTTED_PINK_GERANIUM,BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.PINK_PETTICOAT,ModBlocks.POTTED_PINK_PETTICOAT,BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.PITCHER_PLANT,ModBlocks.POTTED_PITCHER_PLANT,BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.PURPLE_AFRICAN_DAISY,ModBlocks.POTTED_PURPLE_AFRICAN_DAISY,BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.PURPLE_CALLA_LILY,ModBlocks.POTTED_PURPLE_CALLA_LILY,BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.PURPLE_CROCUS,ModBlocks.POTTED_PURPLE_CROCUS,BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.PURPLE_FLAG,ModBlocks.POTTED_PURPLE_FLAG,BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.PURPLE_LUPIN,ModBlocks.POTTED_PURPLE_LUPIN,BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.PURPLE_MAGENTA_SALVIA,ModBlocks.POTTED_PURPLE_MAGENTA_SALVIA,BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.RED_CLOVER,ModBlocks.POTTED_RED_CLOVER,BlockStateModelGenerator.TintType.NOT_TINTED);

        blockStateModelGenerator.registerTintableCross(ModBlocks.BEACH_GRASS, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(ModBlocks.BLUE_EYED_GRASS, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(ModBlocks.CACTUS, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(ModBlocks.PARODIA_MURICATA, BlockStateModelGenerator.TintType.TINTED);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

    }
}

