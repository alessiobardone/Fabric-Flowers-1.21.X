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
                .add(ModBlocks.BRIGHT_MAGENTA_SWEET_PEAS)
                .add(ModBlocks.CAPE_ALOE)
                .add(ModBlocks.CRIMSON_GLADIOLA)
                .add(ModBlocks.DARK_BLUE_SWEET_PEAS)
                .add(ModBlocks.DATURA)
                .add(ModBlocks.DRIED_SUNFLOWER)
                .add(ModBlocks.FLOWERING_CURRENT)
                .add(ModBlocks.GLADIOLA)
                .add(ModBlocks.GLORIOSA_LILY)
                .add(ModBlocks.HAWTHORNE)
                .add(ModBlocks.HIMALAYAN_BLUE_POPPY)
                .add(ModBlocks.IRIS)
                .add(ModBlocks.IRIS_FANCY)
                .add(ModBlocks.LARKSPUR)
                .add(ModBlocks.LAVENDER_LARKSPUR)
                .add(ModBlocks.LIGHT_PINK_LARKSPUR)
                .add(ModBlocks.MAGENTA_LARKSPUR)
                .add(ModBlocks.MAGENTA_SWEET_PEAS)
                .add(ModBlocks.MANZANITA_BUSH)
                .add(ModBlocks.MENDOCINO_POPPY)
                .add(ModBlocks.MIXED_PINK_SWEET_PEAS)
                .add(ModBlocks.MOJAVE_INDIGO_BUSH)
                .add(ModBlocks.OCOTILLO)
                .add(ModBlocks.ORANGE_GLADIOLA)
                .add(ModBlocks.ORNAMENTAL_CHERRY)
                .add(ModBlocks.PARADOX_SUNFLOWER)
                .add(ModBlocks.PEACH_GLADIOLA)
                .add(ModBlocks.PINK_LARKSPUR)
                .add(ModBlocks.PURPLE_LARKSPUR)
                .add(ModBlocks.PURPLE_SWEET_PEAS)
                .add(ModBlocks.QUINCE)
                .add(ModBlocks.RED_SUNFLOWER)
                .add(ModBlocks.SKYSCRAPER_SUNFLOWER)
                .add(ModBlocks.STACKED_MORNING_GLORY)
                .add(ModBlocks.STACKED_NASTURTIUM)
                .add(ModBlocks.STACKED_NASTURTIUM_PINK)
                .add(ModBlocks.SUNDANCE_KID)
                .add(ModBlocks.TALL_CACTUS)
                .add(ModBlocks.TALL_CALLA_LILY)
                .add(ModBlocks.TALL_COSMOS)
                .add(ModBlocks.TALL_LUPIN)
                .add(ModBlocks.TALL_ORANGE_COSMOS)
                .add(ModBlocks.TEDDY_BEAR_SUNFLOWER);





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
                .add(ModBlocks.CALIFORNIA_POPPY)
                .add(ModBlocks.CALIFORNIA_SEA_THRIFT)
                .add(ModBlocks.CALLA_LILY)
                .add(ModBlocks.CHRYSANTHENUM)
                .add(ModBlocks.CINQUEFOIL)
                .add(ModBlocks.CLOUD_BLUE_CORYDALIS)
                .add(ModBlocks.COASTAL_LOTUS)
                .add(ModBlocks.COMMELINA)
                .add(ModBlocks.COMMON_PERIWINKLE)
                .add(ModBlocks.CORYDALIS)
                .add(ModBlocks.COSMOS)
                .add(ModBlocks.COSMOS_MIX)
                .add(ModBlocks.CRACKING_RUSSULA)
                .add(ModBlocks.CREEPING_THYME)
                .add(ModBlocks.CRINOLINE_STINKHORN)
                .add(ModBlocks.CROCUS_MIX)
                .add(ModBlocks.CYAN_HYACINTH)
                .add(ModBlocks.DAHLIA)
                .add(ModBlocks.DARK_BLUE_BORAGE)
                .add(ModBlocks.DARKOSTO_TRAPOSTO)
                .add(ModBlocks.DAY_LILY)
                .add(ModBlocks.DESERT_PAINTBRUSH)
                .add(ModBlocks.DESERT_SAND_VERBENA)
                .add(ModBlocks.DESERT_STURT_PEA)
                .add(ModBlocks.DEVILS_CLAW)
                .add(ModBlocks.ECHINACEA)
                .add(ModBlocks.ENGELMANNS_HEDGEHOG_CACTUS)
                .add(ModBlocks.FORGET_ME_NOT)
                .add(ModBlocks.FUCHSIA)
                .add(ModBlocks.GOLDEN_BEAN)
                .add(ModBlocks.GRAPE_HYACINTH)
                .add(ModBlocks.INKY_CAP)
                .add(ModBlocks.JEWEL_OF_THE_DESERT)
                .add(ModBlocks.LADY_SLIPPER_ORCHID)
                .add(ModBlocks.LANTANA)
                .add(ModBlocks.LEWISIA)
                .add(ModBlocks.LIGHT_BLUE_FORGET_ME_NOT)
                .add(ModBlocks.LIGHT_BLUE_LOBELIA)
                .add(ModBlocks.LIGHT_PINK_GERANIUM)
                .add(ModBlocks.MAGENTA_CLOVER)
                .add(ModBlocks.MAGENTA_ORCHID)
                .add(ModBlocks.MAGENTA_ZINNIA)
                .add(ModBlocks.MAROON_MALLOW)
                .add(ModBlocks.MEDIUM_BLUE_LOBELIA)
                .add(ModBlocks.MEXICAN_SAGE)
                .add(ModBlocks.MIXED_ZINNIA)
                .add(ModBlocks.MORNING_GLORY)
                .add(ModBlocks.NARCISSUS)
                .add(ModBlocks.NASTURTIUM)
                .add(ModBlocks.NASTURTIUM_PINK)
                .add(ModBlocks.NOTCH_LEAF_SCORPION_WEED)
                .add(ModBlocks.ORANGE_AUSTRALIAN_FLAME_PEA)
                .add(ModBlocks.ORANGE_COSMOS)
                .add(ModBlocks.ORANGE_DAY_LILY)
                .add(ModBlocks.ORANGE_FREESIA)
                .add(ModBlocks.ORANGE_LUPIN)
                .add(ModBlocks.OWLS_CLOVER)
                .add(ModBlocks.PANSY)
                .add(ModBlocks.PANSY_PURPLE)
                .add(ModBlocks.PARROT_FLOWER)
                .add(ModBlocks.PEPPERMINT)
                .add(ModBlocks.PERIWINKLE)
                .add(ModBlocks.PINK_CLOVER)
                .add(ModBlocks.PINK_DESERT_SAND_VERBENA)
                .add(ModBlocks.PINK_GERANIUM)
                .add(ModBlocks.PINK_PETTICOAT)
                .add(ModBlocks.PITCHER_PLANT)
                .add(ModBlocks.PURPLE_AFRICAN_DAISY)
                .add(ModBlocks.PURPLE_CALLA_LILY)
                .add(ModBlocks.PURPLE_CROCUS)
                .add(ModBlocks.PURPLE_FLAG)
                .add(ModBlocks.PURPLE_LUPIN)
                .add(ModBlocks.PURPLE_MAGENTA_SALVIA)
                .add(ModBlocks.RED_CLOVER)
                .add(ModBlocks.RED_FREESIA)
                .add(ModBlocks.RED_GERANIUM)
                .add(ModBlocks.RED_POPPY)
                .add(ModBlocks.ROCK_ROSE)
                .add(ModBlocks.ROYAL_BLUE_LOBELIA)
                .add(ModBlocks.SALVIA)
                .add(ModBlocks.SILVER_CARPET)
                .add(ModBlocks.SNAPDRAGON_PINK)
                .add(ModBlocks.SNAPDRAGON_WHITE)
                .add(ModBlocks.SPROUT)
                .add(ModBlocks.STICKY_MONKEY)
                .add(ModBlocks.STRIPED_ZINNIA)
                .add(ModBlocks.SUNNY_ZINNIA);







        getOrCreateTagBuilder(BlockTags.LEAVES)
                .add(ModBlocks.BEACH_GRASS)
                .add(ModBlocks.BLUE_EYED_GRASS)
                .add(ModBlocks.CACTUS)
                .add(ModBlocks.PARODIA_MURICATA)
                .add(ModBlocks.TUMBLE_WEED);


        getOrCreateTagBuilder(BlockTags.FLOWERS)
                .add(ModBlocks.CLOVER_LILY)
                .add(ModBlocks.FROGBIT)
                .add(ModBlocks.JOY_LARGE_LILY)
                .add(ModBlocks.JOY_LIGHT_LILY)
                .add(ModBlocks.LAVANDER_LARGE_LILY)
                .add(ModBlocks.LAVANDER_LIGHT_LILY)
                .add(ModBlocks.PURPLE_LARGE_LILY)
                .add(ModBlocks.PURPLE_LIGHT_LILY)
                .add(ModBlocks.SUNFIRE_LARGE_LILY)
                .add(ModBlocks.SUNFIRE_LIGHT_LILY);



    }

}
