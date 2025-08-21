package net.brdviii.flowers.world;

import net.brdviii.flowers.Flowers;
import net.brdviii.flowers.block.ModBlocks;
import net.brdviii.flowers.block.custom.RacoonGrapeBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.SweetBerryBushBlock;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.util.collection.DataPool;
import net.minecraft.util.collection.Pool;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.stateprovider.WeightedBlockStateProvider;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ModConfiguredFeatures {
    public static final RegistryKey<ConfiguredFeature<?, ?>> RACCOON_GRAPE_KEY = registerKey("raccoon_grape_key");
    public static final RegistryKey<ConfiguredFeature<?, ?>> AFRICAN_DAISY_KEY = registerKey("african_daisy_key");

    static Map<Block, Integer> african_daisy = Map.of(
            ModBlocks.AFRICAN_DAISY, 1,
            ModBlocks.PURPLE_AFRICAN_DAISY, 1
    );

    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context) {
        Flowers.LOGGER.info("[Configured] BootsTrap");

        register(context, RACCOON_GRAPE_KEY, Feature.RANDOM_PATCH,
                ModConfiguredFeatures.RACCOON_GRAPES_BUSH_PATCH);
        Flowers.LOGGER.info("[Configured] Created: Raccoon Grape Bush");


        register(context, AFRICAN_DAISY_KEY, Feature.RANDOM_PATCH,
                createMixedPatch(african_daisy,64));
    }

    public static RandomPatchFeatureConfig createSimplePatch(Block block, int tries) {
        Flowers.LOGGER.info("[Configured] Created Simple Patch of Tries " + tries);
        return ConfiguredFeatures.createRandomPatchFeatureConfig(
                tries,
                PlacedFeatures.createEntry(
                        Feature.SIMPLE_BLOCK,
                        new SimpleBlockFeatureConfig(BlockStateProvider.of(block.getDefaultState()))
                )
        );
    }

    public static RandomPatchFeatureConfig createMixedPatch(Map<Block, Integer> blocksWithWeights, int tries) {
        Flowers.LOGGER.info("[Configured] Created Mixed Patch of Tries " + tries);

        DataPool.Builder<BlockState> poolBuilder = DataPool.builder();
        for (Map.Entry<Block, Integer> entry : blocksWithWeights.entrySet()) {
            poolBuilder.add(entry.getKey().getDefaultState(), entry.getValue());
        }

        WeightedBlockStateProvider provider = new WeightedBlockStateProvider(poolBuilder.build());
        SimpleBlockFeatureConfig config = new SimpleBlockFeatureConfig(provider);

        return ConfiguredFeatures.createRandomPatchFeatureConfig(
                tries,
                PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK, config)
        );
    }

    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, Identifier.of(Flowers.MOD_ID, name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
                                                                                   RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }

    public static final RandomPatchFeatureConfig RACCOON_GRAPES_BUSH_PATCH = ConfiguredFeatures.createRandomPatchFeatureConfig(
            Feature.SIMPLE_BLOCK,
            new SimpleBlockFeatureConfig(
                    BlockStateProvider.of(ModBlocks.RACCOON_GRAPES_BUSH.getDefaultState()
                            .with(RacoonGrapeBlock.AGE, 3))
            ),
            List.of(Blocks.GRASS_BLOCK)
    );
}
