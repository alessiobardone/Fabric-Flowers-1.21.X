package net.brdviii.flowers.block;


import net.brdviii.flowers.Flowers;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.*;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import static net.minecraft.block.Blocks.createFlowerPotBlock;

public class ModBlocks {
    public static final Block AFRICAN_DAISY = registerBlock("african_daisy",
            new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, AbstractBlock.Settings.copy(Blocks.BLUE_ORCHID)));
    public static final Block POTTED_AFRICAN_DAISY = registerBlock("potted_african_daisy", createFlowerPotBlock(ModBlocks.AFRICAN_DAISY));

    public static final Block ALBUCA_NAMAQUENSIS = registerBlock("albuca_namaquensis",
            new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, AbstractBlock.Settings.copy(Blocks.BLUE_ORCHID)));
    public static final Block POTTED_ALBUCA_NAMAQUENSIS = registerBlock("potted_albuca_namaquensis", createFlowerPotBlock(ModBlocks.ALBUCA_NAMAQUENSIS));

    public static final Block AUSTRALIAN_CORNFLOWER = registerBlock("australian_cornflower",
            new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, AbstractBlock.Settings.copy(Blocks.BLUE_ORCHID)));
    public static final Block POTTED_AUSTRALIAN_CORNFLOWER = registerBlock("potted_australian_cornflower", createFlowerPotBlock(ModBlocks.AUSTRALIAN_CORNFLOWER));

    public static final Block AUSTRALIAN_FLAME_PEA = registerBlock("australian_flame_pea",
            new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, AbstractBlock.Settings.copy(Blocks.BLUE_ORCHID)));
    public static final Block POTTED_AUSTRALIAN_FLAME_PEA = registerBlock("potted_australian_flame_pea", createFlowerPotBlock(ModBlocks.AUSTRALIAN_FLAME_PEA));

    public static final Block BABY_BLUE_EYES = registerBlock("baby_blue_eyes",
            new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, AbstractBlock.Settings.copy(Blocks.BLUE_ORCHID)));
    public static final Block POTTED_BABY_BLUE_EYES = registerBlock("potted_baby_blue_eyes", createFlowerPotBlock(ModBlocks.BABY_BLUE_EYES));

    public static final Block BABY_BLUE_EYES_SMALL = registerBlock("baby_blue_eyes_small",
            new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, AbstractBlock.Settings.copy(Blocks.BLUE_ORCHID)));
    public static final Block POTTED_BABY_BLUE_EYES_SMALL = registerBlock("potted_baby_blue_eyes_small", createFlowerPotBlock(ModBlocks.BABY_BLUE_EYES_SMALL));

    public static final Block BACHELOR_BUTTON = registerBlock("bachelor_button",
            new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, AbstractBlock.Settings.copy(Blocks.BLUE_ORCHID)));
    public static final Block POTTED_BACHELOR_BUTTON = registerBlock("potted_bachelor_button", createFlowerPotBlock(ModBlocks.BACHELOR_BUTTON));

    public static final Block BANEBERRY = registerBlock("baneberry",
            new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, AbstractBlock.Settings.copy(Blocks.BLUE_ORCHID)));
    public static final Block POTTED_BANEBERRY = registerBlock("potted_baneberry", createFlowerPotBlock(ModBlocks.BANEBERRY));

    public static final Block BEACH_GRASS = registerBlock("beach_grass",
            new ShortPlantBlock(AbstractBlock.Settings.copy(Blocks.SHORT_GRASS)));

    public static final Block BEACH_STRAWBERRY = registerBlock("beach_strawberry",
            new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, AbstractBlock.Settings.copy(Blocks.BLUE_ORCHID)));
    public static final Block POTTED_BEACH_STRAWBERRY = registerBlock("potted_beach_strawberry", createFlowerPotBlock(ModBlocks.BEACH_STRAWBERRY));

    public static final Block BIRDS_EYE_GILIA = registerBlock("birds_eye_gilia",
            new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, AbstractBlock.Settings.copy(Blocks.BLUE_ORCHID)));
    public static final Block POTTED_BIRDS_EYE_GILIA = registerBlock("potted_birds_eye_gilia", createFlowerPotBlock(ModBlocks.BIRDS_EYE_GILIA));

    public static final Block BLEEDING_HEART = registerBlock("bleeding_heart",
            new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, AbstractBlock.Settings.copy(Blocks.BLUE_ORCHID)));
    public static final Block POTTED_BLEEDING_HEART = registerBlock("potted_bleeding_heart", createFlowerPotBlock(ModBlocks.BLEEDING_HEART));

    public static final Block BLUE_BACHELOR_BUTTON = registerBlock("blue_bachelor_button",
            new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, AbstractBlock.Settings.copy(Blocks.BLUE_ORCHID)));
    public static final Block POTTED_BLUE_BACHELOR_BUTTON = registerBlock("potted_blue_bachelor_button", createFlowerPotBlock(ModBlocks.BLUE_BACHELOR_BUTTON));

    public static final Block BLUE_BELL_BACHELOR_BUTTON = registerBlock("blue_bell_bachelor_button",
            new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, AbstractBlock.Settings.copy(Blocks.BLUE_ORCHID)));
    public static final Block POTTED_BLUE_BELL_BACHELOR_BUTTON = registerBlock("potted_blue_bell_bachelor_button", createFlowerPotBlock(ModBlocks.BLUE_BELL_BACHELOR_BUTTON));

    public static final Block BLUE_BELL_SWEET_PEAS = registerBlock("blue_bell_sweet_peas",
            new TallFlowerBlock(AbstractBlock.Settings.copy(Blocks.BLUE_ORCHID)));

    public static final Block BLUE_EYED_GRASS = registerBlock("blue_eyed_grass",
            new ShortPlantBlock(AbstractBlock.Settings.copy(Blocks.SHORT_GRASS)));

    public static final Block BLUE_TINSEL_LILY = registerBlock("blue_tinsel_lily",
            new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, AbstractBlock.Settings.copy(Blocks.BLUE_ORCHID)));
    public static final Block POTTED_BLUE_TINSEL_LILY = registerBlock("potted_blue_tinsel_lily", createFlowerPotBlock(ModBlocks.BLUE_TINSEL_LILY));

    public static final Block BORAGE = registerBlock("borage",
            new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, AbstractBlock.Settings.copy(Blocks.BLUE_ORCHID)));
    public static final Block POTTED_BORAGE = registerBlock("potted_borage", createFlowerPotBlock(ModBlocks.BORAGE));

    public static final Block BRIGHT_MAGENTA_SWEET_PEAS = registerBlock("bright_magenta_sweet_peas",
            new TallFlowerBlock(AbstractBlock.Settings.copy(Blocks.BLUE_ORCHID)));

    public static final Block BUCKWHEAT = registerBlock("buckwheat",
            new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, AbstractBlock.Settings.copy(Blocks.BLUE_ORCHID)));
    public static final Block POTTED_BUCKWHEAT = registerBlock("potted_buckwheat", createFlowerPotBlock(ModBlocks.BUCKWHEAT));

    public static final Block BUCKWHEAT_RED = registerBlock("buckwheat_red",
            new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, AbstractBlock.Settings.copy(Blocks.BLUE_ORCHID)));
    public static final Block POTTED_BUCKWHEAT_RED = registerBlock("potted_buckwheat_red", createFlowerPotBlock(ModBlocks.BUCKWHEAT_RED));

    public static final Block CACTUS = registerBlock("cactus",
            new ShortPlantBlock(AbstractBlock.Settings.copy(Blocks.SHORT_GRASS)));

    public static final Block CALIFORNIA_POPPY = registerBlock("california_poppy",
            new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, AbstractBlock.Settings.copy(Blocks.BLUE_ORCHID)));
    public static final Block POTTED_CALIFORNIA_POPPY = registerBlock("potted_california_poppy", createFlowerPotBlock(ModBlocks.CALIFORNIA_POPPY));

    public static final Block CALIFORNIA_SEA_THRIFT = registerBlock("california_sea_thrift",
            new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, AbstractBlock.Settings.copy(Blocks.BLUE_ORCHID)));
    public static final Block POTTED_CALIFORNIA_SEA_THRIFT = registerBlock("potted_california_sea_thrift", createFlowerPotBlock(ModBlocks.CALIFORNIA_SEA_THRIFT));

    public static final Block CALLA_LILY = registerBlock("calla_lily",
            new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, AbstractBlock.Settings.copy(Blocks.BLUE_ORCHID)));
    public static final Block POTTED_CALLA_LILY = registerBlock("potted_calla_lily", createFlowerPotBlock(ModBlocks.CALLA_LILY));

    public static final Block CAPE_ALOE = registerBlock("cape_aloe",
            new TallFlowerBlock(AbstractBlock.Settings.copy(Blocks.BLUE_ORCHID)));

    public static final Block CHRYSANTHENUM = registerBlock("chrysanthenum",
            new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, AbstractBlock.Settings.copy(Blocks.BLUE_ORCHID)));
    public static final Block POTTED_CHRYSANTHENUM = registerBlock("potted_chrysanthenum", createFlowerPotBlock(ModBlocks.CHRYSANTHENUM));

    public static final Block CINQUEFOIL = registerBlock("cinquefoil",
            new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, AbstractBlock.Settings.copy(Blocks.BLUE_ORCHID)));
    public static final Block POTTED_CINQUEFOIL = registerBlock("potted_cinquefoil", createFlowerPotBlock(ModBlocks.CINQUEFOIL));

    public static final Block CLOUD_BLUE_CORYDALIS = registerBlock("cloud_blue_corydalis",
            new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, AbstractBlock.Settings.copy(Blocks.BLUE_ORCHID)));
    public static final Block POTTED_CLOUD_BLUE_CORYDALIS = registerBlock("potted_cloud_blue_corydalis", createFlowerPotBlock(ModBlocks.CLOUD_BLUE_CORYDALIS));

    public static final Block COASTAL_LOTUS = registerBlock("coastal_lotus",
            new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, AbstractBlock.Settings.copy(Blocks.BLUE_ORCHID)));
    public static final Block POTTED_COASTAL_LOTUS = registerBlock("potted_coastal_lotus", createFlowerPotBlock(ModBlocks.COASTAL_LOTUS));

    public static final Block COMMELINA = registerBlock("commelina",
            new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, AbstractBlock.Settings.copy(Blocks.BLUE_ORCHID)));
    public static final Block POTTED_COMMELINA = registerBlock("potted_commelina", createFlowerPotBlock(ModBlocks.COMMELINA));

    public static final Block COMMON_PERIWINKLE = registerBlock("common_periwinkle",
            new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, AbstractBlock.Settings.copy(Blocks.BLUE_ORCHID)));
    public static final Block POTTED_COMMON_PERIWINKLE = registerBlock("potted_common_periwinkle", createFlowerPotBlock(ModBlocks.COMMON_PERIWINKLE));

    public static final Block CORYDALIS = registerBlock("corydalis",
            new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, AbstractBlock.Settings.copy(Blocks.BLUE_ORCHID)));
    public static final Block POTTED_CORYDALIS = registerBlock("potted_corydalis", createFlowerPotBlock(ModBlocks.CORYDALIS));




    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(Flowers.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(Flowers.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        Flowers.LOGGER.info("Registering Mod Block");
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(entries ->{
            entries.add(ModBlocks.AFRICAN_DAISY);
            entries.add(ModBlocks.ALBUCA_NAMAQUENSIS);
            entries.add(ModBlocks.AUSTRALIAN_CORNFLOWER);
            entries.add(ModBlocks.AUSTRALIAN_FLAME_PEA);
            entries.add(ModBlocks.BABY_BLUE_EYES);
            entries.add(ModBlocks.BABY_BLUE_EYES_SMALL);
            entries.add(ModBlocks.BACHELOR_BUTTON);
            entries.add(ModBlocks.BANEBERRY);
            entries.add(ModBlocks.BEACH_GRASS);
            entries.add(ModBlocks.BEACH_STRAWBERRY);
            entries.add(ModBlocks.BIRDS_EYE_GILIA);
            entries.add(ModBlocks.BLEEDING_HEART);
            entries.add(ModBlocks.BLUE_BACHELOR_BUTTON);
            entries.add(ModBlocks.BLUE_BELL_BACHELOR_BUTTON);
            entries.add(ModBlocks.BLUE_BELL_SWEET_PEAS);
            entries.add(ModBlocks.BLUE_EYED_GRASS);
            entries.add(ModBlocks.BLUE_TINSEL_LILY);
            entries.add(ModBlocks.BORAGE);
            entries.add(ModBlocks.BRIGHT_MAGENTA_SWEET_PEAS);
            entries.add(ModBlocks.BUCKWHEAT);
            entries.add(ModBlocks.BUCKWHEAT_RED);
            entries.add(ModBlocks.CACTUS);
            entries.add(ModBlocks.CALIFORNIA_POPPY);
            entries.add(ModBlocks.CALIFORNIA_SEA_THRIFT);
            entries.add(ModBlocks.CALLA_LILY);
            entries.add(ModBlocks.CAPE_ALOE);
            entries.add(ModBlocks.CHRYSANTHENUM);
            entries.add(ModBlocks.CINQUEFOIL);
            entries.add(ModBlocks.CLOUD_BLUE_CORYDALIS);
            entries.add(ModBlocks.COASTAL_LOTUS);
            entries.add(ModBlocks.COMMELINA);
            entries.add(ModBlocks.COMMON_PERIWINKLE);
            entries.add(ModBlocks.CORYDALIS);
        });
    }
}
