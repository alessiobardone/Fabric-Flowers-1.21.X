package net.brdviii.flowers.datagen;


import net.brdviii.flowers.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.RecipeProvider;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;

import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        Map<ItemConvertible, List<ItemConvertible>> smallDyeMap = Map.ofEntries(
                Map.entry(Items.RED_DYE, List.of(
                        ModBlocks.BANEBERRY,
                        ModBlocks.BUCKWHEAT_RED,
                        ModBlocks.DAHLIA,
                        ModBlocks.DESERT_PAINTBRUSH,
                        ModBlocks.DESERT_STURT_PEA,
                        ModBlocks.DEVILS_FINGERS,
                        ModBlocks.JEWEL_OF_THE_DESERT,
                        ModBlocks.PINK_CLOVER,
                        ModBlocks.RED_CLOVER,
                        ModBlocks.RED_FREESIA,
                        ModBlocks.RED_GERANIUM,
                        ModBlocks.RED_POPPY
                )),
                Map.entry(Items.ORANGE_DYE, List.of(
                        ModBlocks.CALIFORNIA_POPPY,
                        ModBlocks.CORYDALIS,
                        ModBlocks.DAY_LILY,
                        ModBlocks.LADY_SLIPPER_ORCHID,
                        ModBlocks.LANTANA,
                        ModBlocks.MIXED_ZINNIA,
                        ModBlocks.ORANGE_AUSTRALIAN_FLAME_PEA,
                        ModBlocks.ORANGE_COSMOS,
                        ModBlocks.ORANGE_DAY_LILY,
                        ModBlocks.ORANGE_FREESIA,
                        ModBlocks.ORANGE_LUPIN,
                        ModBlocks.STICKY_MONKEY,
                        ModBlocks.STRIPED_ZINNIA
                )),
                Map.entry(Items.YELLOW_DYE, List.of(
                        ModBlocks.AUSTRALIAN_FLAME_PEA,
                        ModBlocks.BEACH_STRAWBERRY,
                        ModBlocks.CINQUEFOIL,
                        ModBlocks.COASTAL_LOTUS,
                        ModBlocks.CRINOLINE_STINKHORN,
                        ModBlocks.CROCUS_MIX,
                        ModBlocks.GOLDEN_BEAN,
                        ModBlocks.NASTURTIUM,
                        ModBlocks.SUNNY_ZINNIA,
                        ModBlocks.YELLOW_COSMOS,
                        ModBlocks.YELLOW_CROCUS,
                        ModBlocks.YELLOW_DAFFODIL,
                        ModBlocks.YELLOW_FREESIA,
                        ModBlocks.YELLOW_LUPIN,
                        ModBlocks.YELLOW_PATCHES,
                        ModBlocks.YELLOW_STARTHISTLE
                )),
                Map.entry(Items.LIME_DYE, List.of(
                        ModBlocks.PITCHER_PLANT
                )),
                Map.entry(Items.GREEN_DYE, List.of(
                        ModBlocks.ALBUCA_NAMAQUENSIS,
                        ModBlocks.SPROUT,
                        ModBlocks.VENUS_FLY_TRAP
                )),
                Map.entry(Items.LIGHT_BLUE_DYE, List.of(
                        ModBlocks.BORAGE,
                        ModBlocks.CLOUD_BLUE_CORYDALIS,
                        ModBlocks.FORGET_ME_NOT,
                        ModBlocks.LIGHT_BLUE_FORGET_ME_NOT,
                        ModBlocks.LIGHT_BLUE_LOBELIA,
                        ModBlocks.VIRGINIA_COWSLIP
                )),
                Map.entry(Items.CYAN_DYE, List.of(
                        ModBlocks.AUSTRALIAN_CORNFLOWER,
                        ModBlocks.BLUE_TINSEL_LILY,
                        ModBlocks.COMMELINA,
                        ModBlocks.CYAN_HYACINTH
                )),
                Map.entry(Items.BLUE_DYE, List.of(
                        ModBlocks.BABY_BLUE_EYES,
                        ModBlocks.BABY_BLUE_EYES_SMALL,
                        ModBlocks.BLUE_BACHELOR_BUTTON,
                        ModBlocks.BLUE_BELL_BACHELOR_BUTTON,
                        ModBlocks.DARK_BLUE_BORAGE,
                        ModBlocks.GRAPE_HYACINTH,
                        ModBlocks.MEDIUM_BLUE_LOBELIA,
                        ModBlocks.MORNING_GLORY,
                        ModBlocks.ROYAL_BLUE_LOBELIA
                )),
                Map.entry(Items.PURPLE_DYE, List.of(
                        ModBlocks.AFRICAN_DAISY,
                        ModBlocks.BACHELOR_BUTTON,
                        ModBlocks.BLUE_EYED_GRASS,
                        ModBlocks.COMMON_PERIWINKLE,
                        ModBlocks.CREEPING_THYME,
                        ModBlocks.DARKOSTO_TRAPOSTO,
                        ModBlocks.MEXICAN_SAGE,
                        ModBlocks.NOTCH_LEAF_SCORPION_WEED,
                        ModBlocks.PANSY,
                        ModBlocks.PANSY_PURPLE,
                        ModBlocks.PURPLE_AFRICAN_DAISY,
                        ModBlocks.PURPLE_CALLA_LILY,
                        ModBlocks.PURPLE_LUPIN,
                        ModBlocks.PURPLE_MAGENTA_SALVIA,
                        ModBlocks.SALVIA,
                        ModBlocks.VIOLET,
                        ModBlocks.VIOLET_WEBCAP,
                        ModBlocks.WOLFS_BANE
                )),
                Map.entry(Items.MAGENTA_DYE, List.of(
                        ModBlocks.COSMOS,
                        ModBlocks.ECHINACEA,
                        ModBlocks.ENGELMANNS_HEDGEHOG_CACTUS,
                        ModBlocks.FUCHSIA,
                        ModBlocks.MAGENTA_CLOVER,
                        ModBlocks.MAGENTA_ORCHID,
                        ModBlocks.MAGENTA_ZINNIA,
                        ModBlocks.MAROON_MALLOW,
                        ModBlocks.PARROT_FLOWER,
                        ModBlocks.PINK_GERANIUM,
                        ModBlocks.PINK_PETTICOAT
                )),
                Map.entry(Items.PINK_DYE, List.of(
                        ModBlocks.BIRDS_EYE_GILIA,
                        ModBlocks.BLEEDING_HEART,
                        ModBlocks.BUCKWHEAT,
                        ModBlocks.CALIFORNIA_SEA_THRIFT,
                        ModBlocks.COSMOS_MIX,
                        ModBlocks.DESERT_SAND_VERBENA,
                        ModBlocks.DEVILS_CLAW,
                        ModBlocks.LEWISIA,
                        ModBlocks.LIGHT_PINK_GERANIUM,
                        ModBlocks.NASTURTIUM_PINK,
                        ModBlocks.OWLS_CLOVER,
                        ModBlocks.PEPPERMINT,
                        ModBlocks.PERIWINKLE,
                        ModBlocks.PINK_DESERT_SAND_VERBENA,
                        ModBlocks.PURPLE_CROCUS,
                        ModBlocks.PURPLE_FLAG,
                        ModBlocks.ROCK_ROSE,
                        ModBlocks.SNAPDRAGON_PINK,
                        ModBlocks.WOOLY_THYME
                )),
                Map.entry(Items.WHITE_DYE, List.of(
                        ModBlocks.CALLA_LILY,
                        ModBlocks.CHRYSANTHENUM,
                        ModBlocks.NARCISSUS,
                        ModBlocks.SNAPDRAGON_WHITE,
                        ModBlocks.WHITE_DAFFODIL,
                        ModBlocks.WHITE_TINSEL
                )),
                Map.entry(Items.LIGHT_GRAY_DYE, List.of(
                        ModBlocks.SILVER_CARPET
                ))
        );

        Map<ItemConvertible, List<ItemConvertible>> tallDyeMap = Map.ofEntries(
                Map.entry(Items.RED_DYE, List.of(
                        ModBlocks.CAPE_ALOE,
                        ModBlocks.CRIMSON_GLADIOLA,
                        ModBlocks.GLORIOSA_LILY,
                        ModBlocks.OCOTILLO,
                        ModBlocks.QUINCE,
                        ModBlocks.RED_SUNFLOWER
                )),
                Map.entry(Items.ORANGE_DYE, List.of(
                        ModBlocks.DATURA,
                        ModBlocks.DRIED_SUNFLOWER,
                        ModBlocks.ORANGE_GLADIOLA,
                        ModBlocks.PEACH_GLADIOLA,
                        ModBlocks.STACKED_NASTURTIUM,
                        ModBlocks.TALL_ORANGE_COSMOS
                )),
                Map.entry(Items.YELLOW_DYE, List.of(
                        ModBlocks.PARADOX_SUNFLOWER,
                        ModBlocks.SKYSCRAPER_SUNFLOWER,
                        ModBlocks.SUNDANCE_KID,
                        ModBlocks.TEDDY_BEAR_SUNFLOWER
                )),
                Map.entry(Items.LIME_DYE, List.of(
                        ModBlocks.TALL_CACTUS
                )),
                Map.entry(Items.GREEN_DYE, List.of(
                        ModBlocks.MANZANITA_BUSH
                )),
                Map.entry(Items.CYAN_DYE, List.of(
                        ModBlocks.HIMALAYAN_BLUE_POPPY
                )),
                Map.entry(Items.BLUE_DYE, List.of(
                        ModBlocks.DARK_BLUE_SWEET_PEAS,
                        ModBlocks.STACKED_MORNING_GLORY
                )),
                Map.entry(Items.PURPLE_DYE, List.of(
                        ModBlocks.BLUE_BELL_SWEET_PEAS,
                        ModBlocks.IRIS,
                        ModBlocks.LARKSPUR,
                        ModBlocks.MOJAVE_INDIGO_BUSH,
                        ModBlocks.PURPLE_LARKSPUR,
                        ModBlocks.PURPLE_SWEET_PEAS,
                        ModBlocks.TALL_LUPIN
                )),
                Map.entry(Items.MAGENTA_DYE, List.of(
                        ModBlocks.BRIGHT_MAGENTA_SWEET_PEAS,
                        ModBlocks.GLADIOLA,
                        ModBlocks.MAGENTA_LARKSPUR,
                        ModBlocks.MAGENTA_SWEET_PEAS,
                        ModBlocks.MIXED_PINK_SWEET_PEAS
                )),
                Map.entry(Items.PINK_DYE, List.of(
                        ModBlocks.FLOWERING_CURRENT,
                        ModBlocks.HAWTHORNE,
                        ModBlocks.IRIS_FANCY,
                        ModBlocks.LAVENDER_LARKSPUR,
                        ModBlocks.LIGHT_PINK_LARKSPUR,
                        ModBlocks.ORNAMENTAL_CHERRY,
                        ModBlocks.PINK_LARKSPUR,
                        ModBlocks.STACKED_NASTURTIUM_PINK,
                        ModBlocks.TALL_COSMOS
                )),
                Map.entry(Items.BROWN_DYE, List.of(
                        ModBlocks.TUMBLE_WEED
                )),
                Map.entry(Items.WHITE_DYE, List.of(
                        ModBlocks.MENDOCINO_POPPY,
                        ModBlocks.TALL_CALLA_LILY,
                        ModBlocks.WHITE_LARKSPUR,
                        ModBlocks.YUCCA_FLOWER
                )),
                Map.entry(Items.BLACK_DYE, List.of(
                        ModBlocks.INKY_CAP,
                        ModBlocks.CRACKING_RUSSULA
                ))
        );


        for (var entry : smallDyeMap.entrySet()) {
            ItemConvertible dye = entry.getKey();
            List<ItemConvertible> flowers = entry.getValue();

            Ingredient ingredient = Ingredient.ofItems(flowers.toArray(new ItemConvertible[0]));

            ShapelessRecipeJsonBuilder builder = ShapelessRecipeJsonBuilder
                    .create(RecipeCategory.MISC, dye, 1)
                    .input(ingredient);

            for (ItemConvertible flower : flowers) {
                builder.criterion("has_" + RecipeProvider.getRecipeName(flower), conditionsFromItem(flower));
            }

            builder.offerTo(exporter, RecipeProvider.getRecipeName(dye) + "_from_flowers");
        }

        for (var entry : tallDyeMap.entrySet()) {
            ItemConvertible dye = entry.getKey();
            List<ItemConvertible> flowers = entry.getValue();

            Ingredient ingredient = Ingredient.ofItems(flowers.toArray(new ItemConvertible[0]));

            ShapelessRecipeJsonBuilder builder = ShapelessRecipeJsonBuilder
                    .create(RecipeCategory.MISC, dye, 2)
                    .input(ingredient);

            for (ItemConvertible flower : flowers) {
                builder.criterion("has_" + RecipeProvider.getRecipeName(flower), conditionsFromItem(flower));
            }

            builder.offerTo(exporter, RecipeProvider.getRecipeName(dye) + "_from_tall_flowers");
        }
    }

    private static String getRecipeName(ItemConvertible flower, ItemConvertible dye) {
        return RecipeProvider.getRecipeName(dye) + "_from_" + RecipeProvider.getRecipeName(flower);
    }
}
