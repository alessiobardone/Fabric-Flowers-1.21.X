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

        blockStateModelGenerator.registerTintableCross(ModBlocks.BEACH_GRASS, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(ModBlocks.BLUE_EYED_GRASS, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(ModBlocks.CACTUS, BlockStateModelGenerator.TintType.TINTED);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

    }
}

