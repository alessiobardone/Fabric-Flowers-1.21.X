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


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Flowers.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Flowers.LOGGER.info("Registering Mod Item");

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(entries -> {
            entries.add(ModItems.CLOVER_LILY);
            entries.add(ModItems.FROGBIT);
        });

    }
}
