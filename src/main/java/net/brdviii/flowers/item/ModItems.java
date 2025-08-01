package net.brdviii.flowers.item;

import net.brdviii.flowers.Flowers;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Flowers.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Flowers.LOGGER.info("Registering Mod Item");

    }
}
