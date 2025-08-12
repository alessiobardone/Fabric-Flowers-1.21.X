package net.brdviii.flowers.item;

import net.brdviii.flowers.Flowers;
import net.brdviii.flowers.block.ModBlocks;
import net.brdviii.flowers.item.custom.CloverLilyBlockItem;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item CLOVER_LILY_ITEM = registerLily("clover_lily", ModBlocks.CLOVER_LILY);

    private static Item registerLily(String name, Block block) {
        return Registry.register(Registries.ITEM, Identifier.of(Flowers.MOD_ID, name),
                new CloverLilyBlockItem(block, new Item.Settings()));
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Flowers.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Flowers.LOGGER.info("Registering Mod Item");

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(entries -> {
            entries.add(ModItems.CLOVER_LILY_ITEM);
        });
    }
}
