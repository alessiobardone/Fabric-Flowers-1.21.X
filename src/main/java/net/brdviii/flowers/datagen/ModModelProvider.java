package net.brdviii.flowers.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.brdviii.flowers.block.ModBlocks;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        /*blockStateModelGenerator.registerDoubleBlock(ModBlocks.GOOB_BLOSSOM, BlockStateModelGenerator.TintType.NOT_TINTED);*/
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.AFRICAN_DAISY,ModBlocks.POTTED_AFRICAN_DAISY,BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.ALBUCA_NAMAQUENSIS,ModBlocks.POTTED_ALBUCA_NAMAQUENSIS,BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.AUSTRALIAN_CORNFLOWER,ModBlocks.POTTED_AUSTRALIAN_CORNFLOWER,BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.AUSTRALIAN_FLAME_PEA,ModBlocks.POTTED_AUSTRALIAN_FLAME_PEA,BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.BABY_BLUE_EYES,ModBlocks.POTTED_BABY_BLUE_EYES,BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.BABY_BLUE_EYES_SMALL,ModBlocks.POTTED_BABY_BLUE_EYES_SMALL,BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.BACHELOR_BUTTON,ModBlocks.POTTED_BACHELOR_BUTTON,BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.BANEBERRY,ModBlocks.POTTED_BANEBERRY,BlockStateModelGenerator.TintType.NOT_TINTED);

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

    }

    
}

