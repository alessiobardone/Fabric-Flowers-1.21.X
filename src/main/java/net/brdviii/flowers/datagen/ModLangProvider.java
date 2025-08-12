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
        translationBuilder.add(ModBlocks.BLUE_EYED_GRASS,"Blue Eyes Grass");
        translationBuilder.add(ModBlocks.BLUE_TINSEL_LILY,"Blue Tinsel Lily");
        translationBuilder.add(ModBlocks.BORAGE,"Borage");
        translationBuilder.add(ModBlocks.BRIGHT_MAGENTA_SWEET_PEAS,"Bright Magenta Peas");
        translationBuilder.add(ModBlocks.BUCKWHEAT,"Buckwheat");
        translationBuilder.add(ModBlocks.BUCKWHEAT_RED,"Red Buckwheat");
        translationBuilder.add(ModBlocks.CACTUS,"Cactus");
        translationBuilder.add(ModBlocks.CALIFORNIA_POPPY,"California Poppy");
        translationBuilder.add(ModBlocks.CALIFORNIA_SEA_THRIFT,"California Sea Thrift");
        translationBuilder.add(ModBlocks.CALLA_LILY,"Calla Lily");
        translationBuilder.add(ModBlocks.CAPE_ALOE,"Cape Aloe");
        translationBuilder.add(ModBlocks.CHRYSANTHENUM,"Chrysanthenum");
        translationBuilder.add(ModBlocks.CINQUEFOIL,"Cinquefoil");
        translationBuilder.add(ModBlocks.CLOUD_BLUE_CORYDALIS,"Cloud Blue Corydalis");
        translationBuilder.add(ModBlocks.COASTAL_LOTUS,"Coastal Lotus");
        translationBuilder.add(ModBlocks.COMMELINA,"Commelina");
        translationBuilder.add(ModBlocks.COMMON_PERIWINKLE,"Common Periwinkle");
        translationBuilder.add(ModBlocks.CORYDALIS,"Corydalis");
    }
}
