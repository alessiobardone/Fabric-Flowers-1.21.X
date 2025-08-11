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
        });
    }
}
