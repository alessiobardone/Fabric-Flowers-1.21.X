package net.brdviii.flowers.item;

import net.brdviii.flowers.Flowers;
import net.brdviii.flowers.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.PlaceableOnWaterItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item CLOVER_LILY = registerItem("clover_lily",new PlaceableOnWaterItem(ModBlocks.CLOVER_LILY, new Item.Settings()));
    public static final Item FROGBIT = registerItem("frogbit",new PlaceableOnWaterItem(ModBlocks.FROGBIT, new Item.Settings()));
    public static final Item JOY_LARGE_LILY = registerItem("joy_large_lily",new PlaceableOnWaterItem(ModBlocks.JOY_LARGE_LILY, new Item.Settings()));
    public static final Item JOY_LIGHT_LILY = registerItem("joy_light_lily",new PlaceableOnWaterItem(ModBlocks.JOY_LIGHT_LILY, new Item.Settings()));
    public static final Item LAVANDER_LARGE_LILY = registerItem("lavander_large_lily",new PlaceableOnWaterItem(ModBlocks.LAVANDER_LARGE_LILY, new Item.Settings()));
    public static final Item LAVANDER_LIGHT_LILY = registerItem("lavander_light_lily",new PlaceableOnWaterItem(ModBlocks.LAVANDER_LIGHT_LILY, new Item.Settings()));
    public static final Item PURPLE_LARGE_LILY = registerItem("purple_large_lily",new PlaceableOnWaterItem(ModBlocks.PURPLE_LARGE_LILY, new Item.Settings()));
    public static final Item PURPLE_LIGHT_LILY = registerItem("purple_light_lily",new PlaceableOnWaterItem(ModBlocks.PURPLE_LIGHT_LILY, new Item.Settings()));
    public static final Item SUNFIRE_LARGE_LILY = registerItem("sunfire_large_lily",new PlaceableOnWaterItem(ModBlocks.SUNFIRE_LARGE_LILY, new Item.Settings()));
    public static final Item SUNFIRE_LIGHT_LILY = registerItem("sunfire_light_lily",new PlaceableOnWaterItem(ModBlocks.SUNFIRE_LIGHT_LILY, new Item.Settings()));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Flowers.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Flowers.LOGGER.info("Registering Mod Item for " + Flowers.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(entries -> {
            entries.add(ModItems.CLOVER_LILY);
            entries.add(ModItems.FROGBIT);
            entries.add(ModItems.JOY_LARGE_LILY);
            entries.add(ModItems.JOY_LIGHT_LILY);
            entries.add(ModItems.LAVANDER_LARGE_LILY);
            entries.add(ModItems.LAVANDER_LIGHT_LILY);
            entries.add(ModItems.PURPLE_LARGE_LILY);
            entries.add(ModItems.PURPLE_LIGHT_LILY);
            entries.add(ModItems.SUNFIRE_LARGE_LILY);
            entries.add(ModItems.SUNFIRE_LIGHT_LILY);
        });

    }
}
