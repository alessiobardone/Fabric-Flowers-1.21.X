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
        addDrop(ModBlocks.COSMOS);
        addDrop(ModBlocks.COSMOS_MIX);
        addDrop(ModBlocks.CRACKING_RUSSULA);
        addDrop(ModBlocks.CREEPING_THYME);
        addDrop(ModBlocks.CRIMSON_GLADIOLA);
        addDrop(ModBlocks.CRINOLINE_STINKHORN);
        addDrop(ModBlocks.CROCUS_MIX);
        addDrop(ModBlocks.CYAN_HYACINTH);
        addDrop(ModBlocks.DAHLIA);
        addDrop(ModBlocks.DARK_BLUE_BORAGE);
        addDrop(ModBlocks.DARK_BLUE_SWEET_PEAS);
        addDrop(ModBlocks.DARKOSTO_TRAPOSTO);
        addDrop(ModBlocks.DATURA);
        addDrop(ModBlocks.DAY_LILY);
        addDrop(ModBlocks.DESERT_PAINTBRUSH);
        addDrop(ModBlocks.DESERT_SAND_VERBENA);
        addDrop(ModBlocks.DESERT_STURT_PEA);
        addDrop(ModBlocks.DEVILS_CLAW);
        addDrop(ModBlocks.DEVILS_FINGERS);
        addDrop(ModBlocks.DRIED_SUNFLOWER);
        addDrop(ModBlocks.ECHINACEA);
        addDrop(ModBlocks.ENGELMANNS_HEDGEHOG_CACTUS);
        addDrop(ModBlocks.FLOWERING_CURRENT);
        addDrop(ModBlocks.FORGET_ME_NOT);
        addDrop(ModBlocks.FROGBIT);
        addDrop(ModBlocks.FUCHSIA);
        addDrop(ModBlocks.GLADIOLA);
        addDrop(ModBlocks.GLORIOSA_LILY);
        addDrop(ModBlocks.GOLDEN_BEAN);
        addDrop(ModBlocks.GRAPE_HYACINTH);
        addDrop(ModBlocks.HAWTHORNE);
        addDrop(ModBlocks.HIMALAYAN_BLUE_POPPY);
        addDrop(ModBlocks.INKY_CAP);
        addDrop(ModBlocks.IRIS);
        addDrop(ModBlocks.IRIS_FANCY);
        addDrop(ModBlocks.JEWEL_OF_THE_DESERT);
        addDrop(ModBlocks.LADY_SLIPPER_ORCHID);
        addDrop(ModBlocks.LANTANA);
        addDrop(ModBlocks.LARKSPUR);
        addDrop(ModBlocks.LAVENDER_LARKSPUR);
        addDrop(ModBlocks.LEWISIA);
        addDrop(ModBlocks.LIGHT_BLUE_FORGET_ME_NOT);
        addDrop(ModBlocks.LIGHT_BLUE_LOBELIA);
        addDrop(ModBlocks.LIGHT_PINK_GERANIUM);
        addDrop(ModBlocks.LIGHT_PINK_LARKSPUR);
        addDrop(ModBlocks.MAGENTA_CLOVER);
        addDrop(ModBlocks.MAGENTA_LARKSPUR);
        addDrop(ModBlocks.MAGENTA_ORCHID);

        addDrop(ModBlocks.JOY_LARGE_LILY);
        addDrop(ModBlocks.JOY_LIGHT_LILY);
        addDrop(ModBlocks.LAVANDER_LARGE_LILY);
        addDrop(ModBlocks.LAVANDER_LIGHT_LILY);
        addDrop(ModBlocks.PURPLE_LARGE_LILY);
        addDrop(ModBlocks.PURPLE_LIGHT_LILY);
        addDrop(ModBlocks.SUNFIRE_LARGE_LILY);
        addDrop(ModBlocks.SUNFIRE_LIGHT_LILY);
    }
}
