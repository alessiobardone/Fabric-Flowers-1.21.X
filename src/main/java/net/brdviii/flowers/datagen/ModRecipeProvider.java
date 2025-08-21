package net.brdviii.flowers.datagen;


import net.brdviii.flowers.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.RecipeProvider;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
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

                )),
                Map.entry(Items.ORANGE_DYE, List.of(

                )),
                Map.entry(Items.YELLOW_DYE, List.of(

                )),
                Map.entry(Items.LIME_DYE, List.of(

                )),
                Map.entry(Items.GREEN_DYE, List.of(

                )),
                Map.entry(Items.LIGHT_BLUE_DYE, List.of(

                )),
                Map.entry(Items.CYAN_DYE, List.of(

                )),
                Map.entry(Items.BLUE_DYE, List.of(

                )),
                Map.entry(Items.PURPLE_DYE, List.of(

                )),
                Map.entry(Items.MAGENTA_DYE, List.of(

                )),
                Map.entry(Items.PINK_DYE, List.of(

                )),
                Map.entry(Items.BROWN_DYE, List.of(

                )),
                Map.entry(Items.WHITE_DYE, List.of(

                )),
                Map.entry(Items.LIGHT_GRAY_DYE, List.of(

                )),
                Map.entry(Items.GRAY_DYE, List.of(

                )),
                Map.entry(Items.BLACK_DYE, List.of(

                ))
        );

        Map<ItemConvertible, List<ItemConvertible>> tallDyeMap = Map.ofEntries(
                Map.entry(Items.RED_DYE, List.of(

                )),
                Map.entry(Items.ORANGE_DYE, List.of(

                )),
                Map.entry(Items.YELLOW_DYE, List.of(

                )),
                Map.entry(Items.LIME_DYE, List.of(

                )),
                Map.entry(Items.GREEN_DYE, List.of(

                )),
                Map.entry(Items.LIGHT_BLUE_DYE, List.of(

                )),
                Map.entry(Items.CYAN_DYE, List.of(

                )),
                Map.entry(Items.BLUE_DYE, List.of(

                )),
                Map.entry(Items.PURPLE_DYE, List.of(

                )),
                Map.entry(Items.MAGENTA_DYE, List.of(

                )),
                Map.entry(Items.PINK_DYE, List.of(

                )),
                Map.entry(Items.BROWN_DYE, List.of(

                )),
                Map.entry(Items.WHITE_DYE, List.of(

                )),
                Map.entry(Items.LIGHT_GRAY_DYE, List.of(

                )),
                Map.entry(Items.GRAY_DYE, List.of(

                )),
                Map.entry(Items.BLACK_DYE, List.of(

                ))
        );


        for (var entry : smallDyeMap.entrySet()) {
            ItemConvertible dye = entry.getKey();
            List<ItemConvertible> flowers = entry.getValue();

            for (ItemConvertible flower : flowers) {
                ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, dye, 1)
                        .input(flower)
                        .criterion(hasItem(flower), conditionsFromItem(flower))
                        .offerTo(exporter, getRecipeName(flower, dye));
            }
        }

        for (var entry : tallDyeMap.entrySet()) {
            ItemConvertible dye = entry.getKey();
            List<ItemConvertible> flowers = entry.getValue();

            for (ItemConvertible flower : flowers) {
                ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, dye, 2)
                        .input(flower)
                        .criterion(hasItem(flower), conditionsFromItem(flower))
                        .offerTo(exporter, getRecipeName(flower, dye));
            }
        }
    }

    private static String getRecipeName(ItemConvertible flower, ItemConvertible dye) {
        return RecipeProvider.getRecipeName(dye) + "_from_" + RecipeProvider.getRecipeName(flower);
    }
}
