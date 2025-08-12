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

        blockStateModelGenerator.registerTintableCross(ModBlocks.BEACH_GRASS, BlockStateModelGenerator.TintType.TINTED);

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

    }
}

