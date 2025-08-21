package net.brdviii.flowers.world;

import net.brdviii.flowers.Flowers;
import net.brdviii.flowers.block.ModBlocks;
import net.brdviii.flowers.block.custom.RacoonGrapeBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.SweetBerryBushBlock;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ModConfiguredFeatures {
    public static final RegistryKey<ConfiguredFeature<?, ?>> RACCOON_GRAPE_KEY = registerKey("raccoon_grape_key");


    private static final Map<String, Block> FLOWERS = Map.of(
            "african_daisy", ModBlocks.AFRICAN_DAISY,
            "albuca_namaquensis", ModBlocks.ALBUCA_NAMAQUENSIS,
            "australian_cornflower", ModBlocks.AUSTRALIAN_CORNFLOWER,
            "australian_flame_pea", ModBlocks.AUSTRALIAN_FLAME_PEA,
            "baby_blue_eyes", ModBlocks.BABY_BLUE_EYES
    );

    public static final Map<String, RegistryKey<ConfiguredFeature<?, ?>>> CONFIGURED_FEATURES = new HashMap<>();

    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context) {
        Flowers.LOGGER.info("[WorldGen] ConfigureBootsTrap");

        FLOWERS.forEach((name, block) -> {
            RegistryKey<ConfiguredFeature<?, ?>> key = RegistryKey.of(
                    RegistryKeys.CONFIGURED_FEATURE,
                    Identifier.of(Flowers.MOD_ID, name + "_key")
            );
            CONFIGURED_FEATURES.put(name, key);

            context.register(key, new ConfiguredFeature<>(
                    Feature.FLOWER,
                    ConfiguredFeatures.createRandomPatchFeatureConfig(
                            64,
                            PlacedFeatures.createEntry(
                                    Feature.SIMPLE_BLOCK,
                                    new SimpleBlockFeatureConfig(BlockStateProvider.of(block.getDefaultState()))
                            )
                    )
            ));

            Flowers.LOGGER.info("[WorldGen] ConfigureFeature: {}", name);
        });

        register(context, RACCOON_GRAPE_KEY, Feature.RANDOM_PATCH,
                ConfiguredFeatures.createRandomPatchFeatureConfig(
                        Feature.SIMPLE_BLOCK,
                        new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.RACCOON_GRAPES_BUSH.getDefaultState().with(RacoonGrapeBlock.AGE, 3))),
                        List.of(Blocks.GRASS_BLOCK)
                ));

        Flowers.LOGGER.info("[WorldGen] ConfigureFeature: Raccoon Grape Bush");
    }


    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, Identifier.of(Flowers.MOD_ID, name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
                                                                                   RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
