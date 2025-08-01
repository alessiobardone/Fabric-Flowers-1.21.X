package net.brdviii.flowers;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.brdviii.flowers.datagen.ModModelProvider;
import net.brdviii.flowers.datagen.ModBlockTagProvider;
import net.brdviii.flowers.datagen.ModLootTableProvider;
import net.brdviii.flowers.datagen.ModRecipeProvider;

public class FlowersDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(ModBlockTagProvider::new);
		pack.addProvider(ModModelProvider::new);
		pack.addProvider(ModLootTableProvider::new);
		pack.addProvider(ModRecipeProvider::new);
	}
}
