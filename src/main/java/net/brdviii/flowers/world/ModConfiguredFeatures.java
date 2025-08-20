package net.brdviii.flowers.world;

import net.brdviii.flowers.Flowers;
import net.brdviii.flowers.block.ModBlocks;
import net.minecraft.block.Blocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;

public class ModConfiguredFeatures {
    public static final RegistryKey<ConfiguredFeature<?, ?>> AFRICAN_DAISY_KEY = registerKey("african_daisy");

    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context) {
        register(context, AFRICAN_DAISY_KEY, Feature.FLOWER,
                ConfiguredFeatures.createRandomPatchFeatureConfig(
                        64,
                        PlacedFeatures.createEntry(
                                Feature.SIMPLE_BLOCK,
                                new SimpleBlockFeatureConfig(
                                        BlockStateProvider.of(ModBlocks.AFRICAN_DAISY.getDefaultState())
                                )
                        )
                )
        );


    }


    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, Identifier.of(Flowers.MOD_ID, name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
                                                                                   RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
