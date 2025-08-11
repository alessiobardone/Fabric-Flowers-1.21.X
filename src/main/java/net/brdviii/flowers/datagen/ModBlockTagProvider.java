package net.brdviii.flowers.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.brdviii.flowers.block.ModBlocks;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {

    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        /*getOrCreateTagBuilder(BlockTags.TALL_FLOWERS)*/


        getOrCreateTagBuilder(BlockTags.SMALL_FLOWERS)
                .add(ModBlocks.AFRICAN_DAISY)
                .add(ModBlocks.ALBUCA_NAMAQUENSIS)
                .add(ModBlocks.AUSTRALIAN_CORNFLOWER)
                .add(ModBlocks.AUSTRALIAN_FLAME_PEA)
                .add(ModBlocks.BABY_BLUE_EYES)
                .add(ModBlocks.BABY_BLUE_EYES_SMALL)
                .add(ModBlocks.BACHELOR_BUTTON)
                .add(ModBlocks.BANEBERRY);
    }

}
