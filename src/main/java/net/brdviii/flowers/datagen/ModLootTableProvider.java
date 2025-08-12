package net.brdviii.flowers.datagen;


import net.brdviii.flowers.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        RegistryWrapper.Impl<Enchantment> impl = this.registryLookup.getWrapperOrThrow(RegistryKeys.ENCHANTMENT);


        addDrop(ModBlocks.AFRICAN_DAISY);
        addDrop(ModBlocks.ALBUCA_NAMAQUENSIS);
        addDrop(ModBlocks.AUSTRALIAN_CORNFLOWER);
        addDrop(ModBlocks.AUSTRALIAN_FLAME_PEA);
        addDrop(ModBlocks.BABY_BLUE_EYES);
        addDrop(ModBlocks.BABY_BLUE_EYES_SMALL);
        addDrop(ModBlocks.BACHELOR_BUTTON);
        addDrop(ModBlocks.BANEBERRY);
        addDrop(ModBlocks.BEACH_GRASS);
        addDrop(ModBlocks.BEACH_STRAWBERRY);
        addDrop(ModBlocks.BIRDS_EYE_GILIA);
        addDrop(ModBlocks.BLEEDING_HEART);
        addDrop(ModBlocks.BLUE_BACHELOR_BUTTON);
        addDrop(ModBlocks.BLUE_BELL_BACHELOR_BUTTON);
        addDrop(ModBlocks.BLUE_BELL_SWEET_PEAS);
        addDrop(ModBlocks.BLUE_EYED_GRASS);
        addDrop(ModBlocks.BLUE_TINSEL_LILY);
        addDrop(ModBlocks.BORAGE);
        addDrop(ModBlocks.BRIGHT_MAGENTA_SWEET_PEAS);
        addDrop(ModBlocks.BUCKWHEAT);
        addDrop(ModBlocks.BUCKWHEAT_RED);
        addDrop(ModBlocks.CACTUS);
        addDrop(ModBlocks.CALIFORNIA_POPPY);
        addDrop(ModBlocks.CALIFORNIA_SEA_THRIFT);
        addDrop(ModBlocks.CALLA_LILY);
        addDrop(ModBlocks.CAPE_ALOE);
        addDrop(ModBlocks.CHRYSANTHENUM);
        addDrop(ModBlocks.CINQUEFOIL);
        addDrop(ModBlocks.CLOUD_BLUE_CORYDALIS);
        addDrop(ModBlocks.CLOVER_LILY);
        addDrop(ModBlocks.COASTAL_LOTUS);
        addDrop(ModBlocks.COMMELINA);
        addDrop(ModBlocks.COMMON_PERIWINKLE);
        addDrop(ModBlocks.CORYDALIS);

    }
}
