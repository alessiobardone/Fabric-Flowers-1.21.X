package net.brdviii.flowers;

import net.brdviii.flowers.block.ModBlocks;
import net.brdviii.flowers.item.ModItems;
import net.brdviii.flowers.world.ModConfiguredFeatures;
import net.brdviii.flowers.world.ModPlacedFeatures;
import net.brdviii.flowers.world.gen.ModWorldGeneration;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.event.registry.DynamicRegistrySetupCallback;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

import net.minecraft.registry.RegistryBuilder;
import net.minecraft.registry.RegistryKeys;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Flowers implements ModInitializer {
	public static final String MOD_ID = "flowers";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModBlocks.registerModBlocks();
		ModItems.registerModItems();
		ModWorldGeneration.generateModWorldGen();
	}
}