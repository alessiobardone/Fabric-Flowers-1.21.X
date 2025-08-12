package net.brdviii.flowers.datagen;

import net.brdviii.flowers.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModLangProvider extends FabricLanguageProvider {
    public ModLangProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup wrapperLookup, TranslationBuilder translationBuilder) {
        translationBuilder.add(ModBlocks.AFRICAN_DAISY,"African Daisy");
        translationBuilder.add(ModBlocks.ALBUCA_NAMAQUENSIS,"Albuca Namaquensis");
        translationBuilder.add(ModBlocks.AUSTRALIAN_CORNFLOWER,"Australian Cornflower");
        translationBuilder.add(ModBlocks.AUSTRALIAN_FLAME_PEA,"Australian Flame Pea");
        translationBuilder.add(ModBlocks.BABY_BLUE_EYES,"Baby Blue Eyes");
        translationBuilder.add(ModBlocks.BABY_BLUE_EYES_SMALL,"Baby Blue Eyes Small");
        translationBuilder.add(ModBlocks.BACHELOR_BUTTON,"Bachelor Button");
        translationBuilder.add(ModBlocks.BANEBERRY,"Baneberry");
        translationBuilder.add(ModBlocks.BEACH_GRASS,"Beach Grass");
        translationBuilder.add(ModBlocks.BEACH_STRAWBERRY,"Beach Strawberry");
        translationBuilder.add(ModBlocks.BIRDS_EYE_GILIA,"Birds Eye Gilia");
        translationBuilder.add(ModBlocks.BLEEDING_HEART,"Bleeding heart");
        translationBuilder.add(ModBlocks.BLUE_BACHELOR_BUTTON,"Blue Bachelor Button");
        translationBuilder.add(ModBlocks.BLUE_BELL_BACHELOR_BUTTON,"Blue Bell Bachelor Button");
        translationBuilder.add(ModBlocks.BLUE_BELL_SWEET_PEAS,"Blue Bell Sweet Peas");
    }
}
