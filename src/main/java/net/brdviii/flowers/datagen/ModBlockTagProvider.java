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
        getOrCreateTagBuilder(BlockTags.TALL_FLOWERS)
                .add(ModBlocks.BLUE_BELL_SWEET_PEAS)
                .add(ModBlocks.BRIGHT_MAGENTA_SWEET_PEAS);


        getOrCreateTagBuilder(BlockTags.SMALL_FLOWERS)
                .add(ModBlocks.AFRICAN_DAISY)
                .add(ModBlocks.ALBUCA_NAMAQUENSIS)
                .add(ModBlocks.AUSTRALIAN_CORNFLOWER)
                .add(ModBlocks.AUSTRALIAN_FLAME_PEA)
                .add(ModBlocks.BABY_BLUE_EYES)
                .add(ModBlocks.BABY_BLUE_EYES_SMALL)
                .add(ModBlocks.BACHELOR_BUTTON)
                .add(ModBlocks.BANEBERRY)
                .add(ModBlocks.BLUE_TINSEL_LILY)
                .add(ModBlocks.BORAGE)
                .add(ModBlocks.BUCKWHEAT)
                .add(ModBlocks.BUCKWHEAT_RED)
                .add(ModBlocks.CALIFORNIA_POPPY);

        getOrCreateTagBuilder(BlockTags.LEAVES)
                .add(ModBlocks.BEACH_GRASS)
                .add(ModBlocks.BLUE_EYED_GRASS)
                .add(ModBlocks.CACTUS);
    }

}
