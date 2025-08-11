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


    }
}
