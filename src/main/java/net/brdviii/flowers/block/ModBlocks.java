package net.brdviii.flowers.block;


import net.brdviii.flowers.Flowers;
import net.brdviii.flowers.block.custom.*;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.*;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

import java.util.function.Function;

public class ModBlocks {
    public static final Block AFRICAN_DAISY = registerBlock("african_daisy",
            properties -> new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, properties
                    .mapColor(MapColor.DARK_GREEN)
                    .noCollision()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.GRASS)
                    .offset(AbstractBlock.OffsetType.XZ)
                    .pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block POTTED_AFRICAN_DAISY = registerBlock("potted_african_daisy",
            properties -> new FlowerPotBlock(ModBlocks.AFRICAN_DAISY, properties.breakInstantly().nonOpaque().pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block ALBUCA_NAMAQUENSIS = registerBlock("albuca_namaquensis",
            properties -> new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, properties
                    .mapColor(MapColor.DARK_GREEN)
                    .noCollision()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.GRASS)
                    .offset(AbstractBlock.OffsetType.XZ)
                    .pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block POTTED_ALBUCA_NAMAQUENSIS = registerBlock("potted_albuca_namaquensis",
            properties -> new FlowerPotBlock(ModBlocks.ALBUCA_NAMAQUENSIS,properties.breakInstantly().nonOpaque().pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block AUSTRALIAN_CORNFLOWER = registerBlock("australian_cornflower",
            properties -> new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, properties
                    .mapColor(MapColor.DARK_GREEN)
                    .noCollision()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.GRASS)
                    .offset(AbstractBlock.OffsetType.XZ)
                    .pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block POTTED_AUSTRALIAN_CORNFLOWER = registerBlock("potted_australian_cornflower",
            properties -> new FlowerPotBlock(ModBlocks.AUSTRALIAN_CORNFLOWER,properties.breakInstantly().nonOpaque().pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block AUSTRALIAN_FLAME_PEA = registerBlock("australian_flame_pea",
            properties -> new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, properties
                    .mapColor(MapColor.DARK_GREEN)
                    .noCollision()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.GRASS)
                    .offset(AbstractBlock.OffsetType.XZ)
                    .pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block POTTED_AUSTRALIAN_FLAME_PEA = registerBlock("potted_australian_flame_pea",
            properties -> new FlowerPotBlock(ModBlocks.AUSTRALIAN_FLAME_PEA,properties.breakInstantly().nonOpaque().pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block BABY_BLUE_EYES = registerBlock("baby_blue_eyes",
            properties -> new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, properties
                    .mapColor(MapColor.DARK_GREEN)
                    .noCollision()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.GRASS)
                    .offset(AbstractBlock.OffsetType.XZ)
                    .pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block POTTED_BABY_BLUE_EYES = registerBlock("potted_baby_blue_eyes",
            properties -> new FlowerPotBlock(ModBlocks.BABY_BLUE_EYES,properties.breakInstantly().nonOpaque().pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block BABY_BLUE_EYES_SMALL = registerBlock("baby_blue_eyes_small",
            properties -> new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, properties
                    .mapColor(MapColor.DARK_GREEN)
                    .noCollision()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.GRASS)
                    .offset(AbstractBlock.OffsetType.XZ)
                    .pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block POTTED_BABY_BLUE_EYES_SMALL = registerBlock("potted_baby_blue_eyes_small",
            properties -> new FlowerPotBlock(ModBlocks.BABY_BLUE_EYES_SMALL,properties.breakInstantly().nonOpaque().pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block BACHELOR_BUTTON = registerBlock("bachelor_button",
            properties -> new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, properties
                    .mapColor(MapColor.DARK_GREEN)
                    .noCollision()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.GRASS)
                    .offset(AbstractBlock.OffsetType.XZ)
                    .pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block POTTED_BACHELOR_BUTTON = registerBlock("potted_bachelor_button",
            properties -> new FlowerPotBlock(ModBlocks.BACHELOR_BUTTON,properties.breakInstantly().nonOpaque().pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block BANEBERRY = registerBlock("baneberry",
            properties -> new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, properties
                    .mapColor(MapColor.DARK_GREEN)
                    .noCollision()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.GRASS)
                    .offset(AbstractBlock.OffsetType.XZ)
                    .pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block POTTED_BANEBERRY = registerBlock("potted_baneberry",
            properties -> new FlowerPotBlock(ModBlocks.BANEBERRY,properties.breakInstantly().nonOpaque().pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block BEACH_GRASS = registerBlock("beach_grass",
            properties -> new ShortPlantBlock(properties			
                    .mapColor(MapColor.DARK_GREEN)
                    .replaceable()
                    .noCollision()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.GRASS)
                    .offset(AbstractBlock.OffsetType.XYZ)
                    .burnable()
                    .pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block BEACH_STRAWBERRY = registerBlock("beach_strawberry",
            properties -> new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, properties
                    .mapColor(MapColor.DARK_GREEN)
                    .noCollision()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.GRASS)
                    .offset(AbstractBlock.OffsetType.XZ)
                    .pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block POTTED_BEACH_STRAWBERRY = registerBlock("potted_beach_strawberry",
            properties -> new FlowerPotBlock(ModBlocks.BEACH_STRAWBERRY,properties.breakInstantly().nonOpaque().pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block BIRDS_EYE_GILIA = registerBlock("birds_eye_gilia",
            properties -> new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, properties
                    .mapColor(MapColor.DARK_GREEN)
                    .noCollision()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.GRASS)
                    .offset(AbstractBlock.OffsetType.XZ)
                    .pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block POTTED_BIRDS_EYE_GILIA = registerBlock("potted_birds_eye_gilia",
            properties -> new FlowerPotBlock(ModBlocks.BIRDS_EYE_GILIA,properties.breakInstantly().nonOpaque().pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block BLEEDING_HEART = registerBlock("bleeding_heart",
            properties -> new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, properties
                    .mapColor(MapColor.DARK_GREEN)
                    .noCollision()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.GRASS)
                    .offset(AbstractBlock.OffsetType.XZ)
                    .pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block POTTED_BLEEDING_HEART = registerBlock("potted_bleeding_heart",
            properties -> new FlowerPotBlock(ModBlocks.BLEEDING_HEART,properties.breakInstantly().nonOpaque().pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block BLUE_BACHELOR_BUTTON = registerBlock("blue_bachelor_button",
            properties -> new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, properties
                    .mapColor(MapColor.DARK_GREEN)
                    .noCollision()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.GRASS)
                    .offset(AbstractBlock.OffsetType.XZ)
                    .pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block POTTED_BLUE_BACHELOR_BUTTON = registerBlock("potted_blue_bachelor_button",
            properties -> new FlowerPotBlock(ModBlocks.BLUE_BACHELOR_BUTTON,properties.breakInstantly().nonOpaque().pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block BLUE_BELL_BACHELOR_BUTTON = registerBlock("blue_bell_bachelor_button",
            properties -> new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, properties
                    .mapColor(MapColor.DARK_GREEN)
                    .noCollision()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.GRASS)
                    .offset(AbstractBlock.OffsetType.XZ)
                    .pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block POTTED_BLUE_BELL_BACHELOR_BUTTON = registerBlock("potted_blue_bell_bachelor_button",
            properties -> new FlowerPotBlock(ModBlocks.BLUE_BELL_BACHELOR_BUTTON,properties.breakInstantly().nonOpaque().pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block BLUE_BELL_SWEET_PEAS = registerBlock("blue_bell_sweet_peas",
            properties -> new TallFlowerBlock(properties
                    .mapColor(MapColor.DARK_GREEN)
                    .noCollision()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.GRASS)
                    .offset(AbstractBlock.OffsetType.XZ)
                    .pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block BLUE_EYED_GRASS = registerBlock("blue_eyed_grass",
            properties -> new ShortPlantBlock( properties			
                    .mapColor(MapColor.DARK_GREEN)
                    .replaceable()
                    .noCollision()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.GRASS)
                    .offset(AbstractBlock.OffsetType.XYZ)
                    .burnable()
                    .pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block BLUE_TINSEL_LILY = registerBlock("blue_tinsel_lily",
            properties -> new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, properties
                    .mapColor(MapColor.DARK_GREEN)
                    .noCollision()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.GRASS)
                    .offset(AbstractBlock.OffsetType.XZ)
                    .pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block POTTED_BLUE_TINSEL_LILY = registerBlock("potted_blue_tinsel_lily",
            properties -> new FlowerPotBlock(ModBlocks.BLUE_TINSEL_LILY,properties.breakInstantly().nonOpaque().pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block BORAGE = registerBlock("borage",
            properties -> new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, properties
                    .mapColor(MapColor.DARK_GREEN)
                    .noCollision()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.GRASS)
                    .offset(AbstractBlock.OffsetType.XZ)
                    .pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block POTTED_BORAGE = registerBlock("potted_borage",
            properties -> new FlowerPotBlock(ModBlocks.BORAGE,properties.breakInstantly().nonOpaque().pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block BRIGHT_MAGENTA_SWEET_PEAS = registerBlock("bright_magenta_sweet_peas",
            properties -> new TallFlowerBlock(properties
                    .mapColor(MapColor.DARK_GREEN)
                    .noCollision()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.GRASS)
                    .offset(AbstractBlock.OffsetType.XZ)
                    .pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block BUCKWHEAT = registerBlock("buckwheat",
            properties -> new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, properties
                    .mapColor(MapColor.DARK_GREEN)
                    .noCollision()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.GRASS)
                    .offset(AbstractBlock.OffsetType.XZ)
                    .pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block POTTED_BUCKWHEAT = registerBlock("potted_buckwheat",
            properties -> new FlowerPotBlock(ModBlocks.BUCKWHEAT,properties.breakInstantly().nonOpaque().pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block BUCKWHEAT_RED = registerBlock("buckwheat_red",
            properties -> new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, properties
                    .mapColor(MapColor.DARK_GREEN)
                    .noCollision()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.GRASS)
                    .offset(AbstractBlock.OffsetType.XZ)
                    .pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block POTTED_BUCKWHEAT_RED = registerBlock("potted_buckwheat_red",
            properties -> new FlowerPotBlock(ModBlocks.BUCKWHEAT_RED,properties.breakInstantly().nonOpaque().pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block CACTUS = registerBlock("cactus",
            properties -> new ShortPlantBlock(properties			
                    .mapColor(MapColor.DARK_GREEN)
                    .replaceable()
                    .noCollision()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.GRASS)
                    .offset(AbstractBlock.OffsetType.XYZ)
                    .burnable()
                    .pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block CALIFORNIA_POPPY = registerBlock("california_poppy",
            properties -> new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, properties
                    .mapColor(MapColor.DARK_GREEN)
                    .noCollision()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.GRASS)
                    .offset(AbstractBlock.OffsetType.XZ)
                    .pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block POTTED_CALIFORNIA_POPPY = registerBlock("potted_california_poppy",
            properties -> new FlowerPotBlock(ModBlocks.CALIFORNIA_POPPY,properties.breakInstantly().nonOpaque().pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block CALIFORNIA_SEA_THRIFT = registerBlock("california_sea_thrift",
            properties -> new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, properties
                    .mapColor(MapColor.DARK_GREEN)
                    .noCollision()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.GRASS)
                    .offset(AbstractBlock.OffsetType.XZ)
                    .pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block POTTED_CALIFORNIA_SEA_THRIFT = registerBlock("potted_california_sea_thrift",
            properties -> new FlowerPotBlock(ModBlocks.CALIFORNIA_SEA_THRIFT,properties.breakInstantly().nonOpaque().pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block CALLA_LILY = registerBlock("calla_lily",
            properties -> new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, properties
                    .mapColor(MapColor.DARK_GREEN)
                    .noCollision()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.GRASS)
                    .offset(AbstractBlock.OffsetType.XZ)
                    .pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block POTTED_CALLA_LILY = registerBlock("potted_calla_lily",
            properties -> new FlowerPotBlock(ModBlocks.CALLA_LILY,properties.breakInstantly().nonOpaque().pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block CAPE_ALOE = registerBlock("cape_aloe",
            properties -> new TallFlowerBlock(properties
                    .mapColor(MapColor.DARK_GREEN)
                    .noCollision()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.GRASS)
                    .offset(AbstractBlock.OffsetType.XZ)
                    .pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block CHRYSANTHENUM = registerBlock("chrysanthenum",
            properties -> new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, properties
                    .mapColor(MapColor.DARK_GREEN)
                    .noCollision()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.GRASS)
                    .offset(AbstractBlock.OffsetType.XZ)
                    .pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block POTTED_CHRYSANTHENUM = registerBlock("potted_chrysanthenum",
            properties -> new FlowerPotBlock(ModBlocks.CHRYSANTHENUM,properties.breakInstantly().nonOpaque().pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block CINQUEFOIL = registerBlock("cinquefoil",
            properties -> new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, properties
                    .mapColor(MapColor.DARK_GREEN)
                    .noCollision()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.GRASS)
                    .offset(AbstractBlock.OffsetType.XZ)
                    .pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block POTTED_CINQUEFOIL = registerBlock("potted_cinquefoil",
            properties -> new FlowerPotBlock(ModBlocks.CINQUEFOIL,properties.breakInstantly().nonOpaque().pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block CLOUD_BLUE_CORYDALIS = registerBlock("cloud_blue_corydalis",
            properties -> new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, properties
                    .mapColor(MapColor.DARK_GREEN)
                    .noCollision()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.GRASS)
                    .offset(AbstractBlock.OffsetType.XZ)
                    .pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block POTTED_CLOUD_BLUE_CORYDALIS = registerBlock("potted_cloud_blue_corydalis",
            properties -> new FlowerPotBlock(ModBlocks.CLOUD_BLUE_CORYDALIS,properties.breakInstantly().nonOpaque().pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block CLOVER_LILY = registerBlockWithoutItem("clover_lily",
            properties -> new LilyPadBlock(properties
                    .mapColor(MapColor.DARK_GREEN)
                    .breakInstantly()
                    .sounds(BlockSoundGroup.LILY_PAD)
                    .nonOpaque()
                    .pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block COASTAL_LOTUS = registerBlock("coastal_lotus",
            properties -> new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, properties
                    .mapColor(MapColor.DARK_GREEN)
                    .noCollision()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.GRASS)
                    .offset(AbstractBlock.OffsetType.XZ)
                    .pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block POTTED_COASTAL_LOTUS = registerBlock("potted_coastal_lotus",
            properties -> new FlowerPotBlock(ModBlocks.COASTAL_LOTUS,properties.breakInstantly().nonOpaque().pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block COMMELINA = registerBlock("commelina",
            properties -> new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, properties
                    .mapColor(MapColor.DARK_GREEN)
                    .noCollision()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.GRASS)
                    .offset(AbstractBlock.OffsetType.XZ)
                    .pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block POTTED_COMMELINA = registerBlock("potted_commelina",
            properties -> new FlowerPotBlock(ModBlocks.COMMELINA,properties.breakInstantly().nonOpaque().pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block COMMON_PERIWINKLE = registerBlock("common_periwinkle",
            properties -> new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, properties
                    .mapColor(MapColor.DARK_GREEN)
                    .noCollision()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.GRASS)
                    .offset(AbstractBlock.OffsetType.XZ)
                    .pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block POTTED_COMMON_PERIWINKLE = registerBlock("potted_common_periwinkle",
            properties -> new FlowerPotBlock(ModBlocks.COMMON_PERIWINKLE,properties.breakInstantly().nonOpaque().pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block CORYDALIS = registerBlock("corydalis",
            properties -> new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, properties
                    .mapColor(MapColor.DARK_GREEN)
                    .noCollision()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.GRASS)
                    .offset(AbstractBlock.OffsetType.XZ)
                    .pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block POTTED_CORYDALIS = registerBlock("potted_corydalis",
            properties -> new FlowerPotBlock(ModBlocks.CORYDALIS,properties.breakInstantly().nonOpaque().pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block COSMOS = registerBlock("cosmos",
            properties -> new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, properties
                    .mapColor(MapColor.DARK_GREEN)
                    .noCollision()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.GRASS)
                    .offset(AbstractBlock.OffsetType.XZ)
                    .pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block POTTED_COSMOS = registerBlock("potted_cosmos",
            properties -> new FlowerPotBlock(ModBlocks.COSMOS,properties.breakInstantly().nonOpaque().pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block COSMOS_MIX = registerBlock("cosmos_mix",
            properties -> new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, properties
                    .mapColor(MapColor.DARK_GREEN)
                    .noCollision()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.GRASS)
                    .offset(AbstractBlock.OffsetType.XZ)
                    .pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block POTTED_COSMOS_MIX = registerBlock("potted_cosmos_mix",
            properties -> new FlowerPotBlock(ModBlocks.COSMOS_MIX,properties.breakInstantly().nonOpaque().pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block CRACKING_RUSSULA = registerBlock("cracking_russula",
            properties -> new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, properties
                    .mapColor(MapColor.DARK_GREEN)
                    .noCollision()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.GRASS)
                    .offset(AbstractBlock.OffsetType.XZ)
                    .pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block POTTED_CRACKING_RUSSULA = registerBlock("potted_cracking_russula",
            properties -> new FlowerPotBlock(ModBlocks.CRACKING_RUSSULA,properties.breakInstantly().nonOpaque().pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block CREEPING_THYME = registerBlock("creeping_thyme",
            properties -> new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, properties
                    .mapColor(MapColor.DARK_GREEN)
                    .noCollision()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.GRASS)
                    .offset(AbstractBlock.OffsetType.XZ)
                    .pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block POTTED_CREEPING_THYME = registerBlock("potted_creeping_thyme",
            properties -> new FlowerPotBlock(ModBlocks.CREEPING_THYME,properties.breakInstantly().nonOpaque().pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block CRIMSON_GLADIOLA = registerBlock("crimson_gladiola",
            properties -> new TallFlowerBlock(properties
                    .mapColor(MapColor.DARK_GREEN)
                    .noCollision()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.GRASS)
                    .offset(AbstractBlock.OffsetType.XZ)
                    .pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block CRINOLINE_STINKHORN = registerBlock("crinoline_stinkhorn",
            properties -> new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, properties
                    .mapColor(MapColor.DARK_GREEN)
                    .noCollision()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.GRASS)
                    .offset(AbstractBlock.OffsetType.XZ)
                    .pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block POTTED_CRINOLINE_STINKHORN = registerBlock("potted_crinoline_stinkhorn",
            properties -> new FlowerPotBlock(ModBlocks.CRINOLINE_STINKHORN,properties.breakInstantly().nonOpaque().pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block CROCUS_MIX = registerBlock("crocus_mix",
            properties -> new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, properties
                    .mapColor(MapColor.DARK_GREEN)
                    .noCollision()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.GRASS)
                    .offset(AbstractBlock.OffsetType.XZ)
                    .pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block POTTED_CROCUS_MIX = registerBlock("potted_crocus_mix",
            properties -> new FlowerPotBlock(ModBlocks.CROCUS_MIX,properties.breakInstantly().nonOpaque().pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block CYAN_HYACINTH = registerBlock("cyan_hyacinth",
            properties -> new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, properties
                    .mapColor(MapColor.DARK_GREEN)
                    .noCollision()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.GRASS)
                    .offset(AbstractBlock.OffsetType.XZ)
                    .pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block POTTED_CYAN_HYACINTH = registerBlock("potted_cyan_hyacinth",
            properties -> new FlowerPotBlock(ModBlocks.CYAN_HYACINTH,properties.breakInstantly().nonOpaque().pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block DAHLIA = registerBlock("dahlia",
            properties -> new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, properties
                    .mapColor(MapColor.DARK_GREEN)
                    .noCollision()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.GRASS)
                    .offset(AbstractBlock.OffsetType.XZ)
                    .pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block POTTED_DAHLIA = registerBlock("potted_dahlia",
            properties -> new FlowerPotBlock(ModBlocks.DAHLIA,properties.breakInstantly().nonOpaque().pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block DARK_BLUE_BORAGE = registerBlock("dark_blue_borage",
            properties -> new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, properties
                    .mapColor(MapColor.DARK_GREEN)
                    .noCollision()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.GRASS)
                    .offset(AbstractBlock.OffsetType.XZ)
                    .pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block POTTED_DARK_BLUE_BORAGE = registerBlock("potted_dark_blue_borage",
            properties -> new FlowerPotBlock(ModBlocks.DARK_BLUE_BORAGE,properties.breakInstantly().nonOpaque().pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block DARK_BLUE_SWEET_PEAS = registerBlock("dark_blue_sweet_peas",
            properties -> new TallFlowerBlock(properties
                    .mapColor(MapColor.DARK_GREEN)
                    .noCollision()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.GRASS)
                    .offset(AbstractBlock.OffsetType.XZ)
                    .pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block DARKOSTO_TRAPOSTO = registerBlock("darkosto_traposto",
            properties -> new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, properties
                    .mapColor(MapColor.DARK_GREEN)
                    .noCollision()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.GRASS)
                    .offset(AbstractBlock.OffsetType.XZ)
                    .pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block POTTED_DARKOSTO_TRAPOSTO = registerBlock("potted_darkosto_traposto",
            properties -> new FlowerPotBlock(ModBlocks.DARKOSTO_TRAPOSTO,properties.breakInstantly().nonOpaque().pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block DATURA = registerBlock("datura",
            properties -> new TallFlowerBlock(properties
                    .mapColor(MapColor.DARK_GREEN)
                    .noCollision()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.GRASS)
                    .offset(AbstractBlock.OffsetType.XZ)
                    .pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block DAY_LILY = registerBlock("day_lily",
            properties -> new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, properties
                    .mapColor(MapColor.DARK_GREEN)
                    .noCollision()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.GRASS)
                    .offset(AbstractBlock.OffsetType.XZ)
                    .pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block POTTED_DAY_LILY = registerBlock("potted_day_lily",
            properties -> new FlowerPotBlock(ModBlocks.DAY_LILY,properties.breakInstantly().nonOpaque().pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block DESERT_PAINTBRUSH = registerBlock("desert_paintbrush",
            properties -> new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, properties
                    .mapColor(MapColor.DARK_GREEN)
                    .noCollision()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.GRASS)
                    .offset(AbstractBlock.OffsetType.XZ)
                    .pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block POTTED_DESERT_PAINTBRUSH = registerBlock("potted_desert_paintbrush",
            properties -> new FlowerPotBlock(ModBlocks.DESERT_PAINTBRUSH,properties.breakInstantly().nonOpaque().pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block DESERT_SAND_VERBENA = registerBlock("desert_sand_verbena",
            properties -> new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, properties
                    .mapColor(MapColor.DARK_GREEN)
                    .noCollision()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.GRASS)
                    .offset(AbstractBlock.OffsetType.XZ)
                    .pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block POTTED_DESERT_SAND_VERBENA = registerBlock("potted_desert_sand_verbena",
            properties -> new FlowerPotBlock(ModBlocks.DESERT_SAND_VERBENA,properties.breakInstantly().nonOpaque().pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block DESERT_STURT_PEA = registerBlock("desert_sturt_pea",
            properties -> new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, properties
                    .mapColor(MapColor.DARK_GREEN)
                    .noCollision()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.GRASS)
                    .offset(AbstractBlock.OffsetType.XZ)
                    .pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block POTTED_DESERT_STURT_PEA = registerBlock("potted_desert_sturt_pea",
            properties -> new FlowerPotBlock(ModBlocks.DESERT_STURT_PEA,properties.breakInstantly().nonOpaque().pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block DEVILS_CLAW = registerBlock("devils_claw",
            properties -> new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, properties
                    .mapColor(MapColor.DARK_GREEN)
                    .noCollision()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.GRASS)
                    .offset(AbstractBlock.OffsetType.XZ)
                    .pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block POTTED_DEVILS_CLAW = registerBlock("potted_devils_claw",
            properties -> new FlowerPotBlock(ModBlocks.DEVILS_CLAW,properties.breakInstantly().nonOpaque().pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block DEVILS_FINGERS = registerBlock("devils_fingers",
            properties -> new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, properties
                    .mapColor(MapColor.DARK_GREEN)
                    .noCollision()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.GRASS)
                    .offset(AbstractBlock.OffsetType.XZ)
                    .pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block POTTED_DEVILS_FINGERS = registerBlock("potted_devils_fingers",
            properties -> new FlowerPotBlock(ModBlocks.DEVILS_FINGERS,properties.breakInstantly().nonOpaque().pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block DRIED_SUNFLOWER = registerBlock("dried_sunflower",
            properties -> new TallFlowerBlock(properties
                    .mapColor(MapColor.DARK_GREEN)
                    .noCollision()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.GRASS)
                    .offset(AbstractBlock.OffsetType.XZ)
                    .pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block ECHINACEA = registerBlock("echinacea",
            properties -> new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, properties
                    .mapColor(MapColor.DARK_GREEN)
                    .noCollision()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.GRASS)
                    .offset(AbstractBlock.OffsetType.XZ)
                    .pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block POTTED_ECHINACEA = registerBlock("potted_echinacea",
            properties -> new FlowerPotBlock(ModBlocks.ECHINACEA,properties.breakInstantly().nonOpaque().pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block ENGELMANNS_HEDGEHOG_CACTUS = registerBlock("engelmanns_hedgehog_cactus",
            properties -> new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, properties
                    .mapColor(MapColor.DARK_GREEN)
                    .noCollision()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.GRASS)
                    .offset(AbstractBlock.OffsetType.XZ)
                    .pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block POTTED_ENGELMANNS_HEDGEHOG_CACTUS = registerBlock("potted_engelmanns_hedgehog_cactus",
            properties -> new FlowerPotBlock(ModBlocks.ENGELMANNS_HEDGEHOG_CACTUS,properties.breakInstantly().nonOpaque().pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block FLOWERING_CURRENT = registerBlock("flowering_current",
            properties -> new TallFlowerBlock(properties
                    .mapColor(MapColor.DARK_GREEN)
                    .noCollision()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.GRASS)
                    .offset(AbstractBlock.OffsetType.XZ)
                    .pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block FORGET_ME_NOT = registerBlock("forget_me_not",
            properties -> new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, properties
                    .mapColor(MapColor.DARK_GREEN)
                    .noCollision()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.GRASS)
                    .offset(AbstractBlock.OffsetType.XZ)
                    .pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block POTTED_FORGET_ME_NOT = registerBlock("potted_forget_me_not",
            properties -> new FlowerPotBlock(ModBlocks.FORGET_ME_NOT,properties.breakInstantly().nonOpaque().pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block FROGBIT = registerBlockWithoutItem("frogbit",
            properties -> new LilyPadBlock(properties
                    .mapColor(MapColor.DARK_GREEN)
                    .breakInstantly()
                    .sounds(BlockSoundGroup.LILY_PAD)
                    .nonOpaque()
                    .pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block FUCHSIA = registerBlock("fuchsia",
            properties -> new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, properties
                    .mapColor(MapColor.DARK_GREEN)
                    .noCollision()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.GRASS)
                    .offset(AbstractBlock.OffsetType.XZ)
                    .pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block POTTED_FUCHSIA = registerBlock("potted_fuchsia",
            properties -> new FlowerPotBlock(ModBlocks.FUCHSIA,properties.breakInstantly().nonOpaque().pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block GLADIOLA = registerBlock("gladiola",
            properties -> new TallFlowerBlock(properties
                    .mapColor(MapColor.DARK_GREEN)
                    .noCollision()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.GRASS)
                    .offset(AbstractBlock.OffsetType.XZ)
                    .pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block GLORIOSA_LILY = registerBlock("gloriosa_lily",
            properties -> new TallFlowerBlock(properties
                    .mapColor(MapColor.DARK_GREEN)
                    .noCollision()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.GRASS)
                    .offset(AbstractBlock.OffsetType.XZ)
                    .pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block GOLDEN_BEAN = registerBlock("golden_bean",
            properties -> new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, properties
                    .mapColor(MapColor.DARK_GREEN)
                    .noCollision()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.GRASS)
                    .offset(AbstractBlock.OffsetType.XZ)
                    .pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block POTTED_GOLDEN_BEAN = registerBlock("potted_golden_bean",
            properties -> new FlowerPotBlock(ModBlocks.GOLDEN_BEAN,properties.breakInstantly().nonOpaque().pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block GRAPE_HYACINTH = registerBlock("grape_hyacinth",
            properties -> new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, properties
                    .mapColor(MapColor.DARK_GREEN)
                    .noCollision()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.GRASS)
                    .offset(AbstractBlock.OffsetType.XZ)
                    .pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block POTTED_GRAPE_HYACINTH = registerBlock("potted_grape_hyacinth",
            properties -> new FlowerPotBlock(ModBlocks.GRAPE_HYACINTH,properties.breakInstantly().nonOpaque().pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block HAWTHORNE = registerBlock("hawthorne",
            properties -> new TallFlowerBlock(properties
                    .mapColor(MapColor.DARK_GREEN)
                    .noCollision()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.GRASS)
                    .offset(AbstractBlock.OffsetType.XZ)
                    .pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block HIMALAYAN_BLUE_POPPY = registerBlock("himalayan_blue_poppy",
            properties -> new TallFlowerBlock(properties
                    .mapColor(MapColor.DARK_GREEN)
                    .noCollision()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.GRASS)
                    .offset(AbstractBlock.OffsetType.XZ)
                    .pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block INKY_CAP = registerBlock("inky_cap",
            properties -> new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, properties
                    .mapColor(MapColor.DARK_GREEN)
                    .noCollision()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.GRASS)
                    .offset(AbstractBlock.OffsetType.XZ)
                    .pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block POTTED_INKY_CAP = registerBlock("potted_inky_cap",
            properties -> new FlowerPotBlock(ModBlocks.INKY_CAP,properties.breakInstantly().nonOpaque().pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block IRIS = registerBlock("iris",
            properties -> new TallFlowerBlock(properties
                    .mapColor(MapColor.DARK_GREEN)
                    .noCollision()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.GRASS)
                    .offset(AbstractBlock.OffsetType.XZ)
                    .pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block IRIS_FANCY = registerBlock("iris_fancy_dress",
            properties -> new TallFlowerBlock(properties
                    .mapColor(MapColor.DARK_GREEN)
                    .noCollision()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.GRASS)
                    .offset(AbstractBlock.OffsetType.XZ)
                    .pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block JEWEL_OF_THE_DESERT = registerBlock("jewel_of_the_desert",
            properties -> new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, properties
                    .mapColor(MapColor.DARK_GREEN)
                    .noCollision()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.GRASS)
                    .offset(AbstractBlock.OffsetType.XZ)
                    .pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block POTTED_JEWEL_OF_THE_DESERT = registerBlock("potted_jewel_of_the_desert",
            properties -> new FlowerPotBlock(ModBlocks.JEWEL_OF_THE_DESERT,properties.breakInstantly().nonOpaque().pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block LADY_SLIPPER_ORCHID = registerBlock("lady_slipper_orchid",
            properties -> new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, properties
                    .mapColor(MapColor.DARK_GREEN)
                    .noCollision()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.GRASS)
                    .offset(AbstractBlock.OffsetType.XZ)
                    .pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block POTTED_LADY_SLIPPER_ORCHID = registerBlock("potted_lady_slipper_orchid",
            properties -> new FlowerPotBlock(ModBlocks.LADY_SLIPPER_ORCHID,properties.breakInstantly().nonOpaque().pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block LANTANA = registerBlock("lantana",
            properties -> new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, properties
                    .mapColor(MapColor.DARK_GREEN)
                    .noCollision()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.GRASS)
                    .offset(AbstractBlock.OffsetType.XZ)
                    .pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block POTTED_LANTANA = registerBlock("potted_lantana",
            properties -> new FlowerPotBlock(ModBlocks.LANTANA,properties.breakInstantly().nonOpaque().pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block LARKSPUR = registerBlock("larkspur",
            properties -> new TallFlowerBlock(properties
                    .mapColor(MapColor.DARK_GREEN)
                    .noCollision()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.GRASS)
                    .offset(AbstractBlock.OffsetType.XZ)
                    .pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block LAVENDER_LARKSPUR = registerBlock("lavender_larkspur",
            properties -> new TallFlowerBlock(properties
                    .mapColor(MapColor.DARK_GREEN)
                    .noCollision()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.GRASS)
                    .offset(AbstractBlock.OffsetType.XZ)
                    .pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block LEWISIA = registerBlock("lewisia",
            properties -> new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, properties
                    .mapColor(MapColor.DARK_GREEN)
                    .noCollision()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.GRASS)
                    .offset(AbstractBlock.OffsetType.XZ)
                    .pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block POTTED_LEWISIA = registerBlock("potted_lewisia",
            properties -> new FlowerPotBlock(ModBlocks.LEWISIA,properties.breakInstantly().nonOpaque().pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block LIGHT_BLUE_FORGET_ME_NOT = registerBlock("light_blue_forget_me_not",
            properties -> new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, properties
                    .mapColor(MapColor.DARK_GREEN)
                    .noCollision()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.GRASS)
                    .offset(AbstractBlock.OffsetType.XZ)
                    .pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block POTTED_LIGHT_BLUE_FORGET_ME_NOT = registerBlock("potted_light_blue_forget_me_not",
            properties -> new FlowerPotBlock(ModBlocks.LIGHT_BLUE_FORGET_ME_NOT,properties.breakInstantly().nonOpaque().pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block LIGHT_BLUE_LOBELIA = registerBlock("light_blue_lobelia",
            properties -> new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, properties
                    .mapColor(MapColor.DARK_GREEN)
                    .noCollision()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.GRASS)
                    .offset(AbstractBlock.OffsetType.XZ)
                    .pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block POTTED_LIGHT_BLUE_LOBELIA = registerBlock("potted_light_blue_lobelia",
            properties -> new FlowerPotBlock(ModBlocks.LIGHT_BLUE_LOBELIA,properties.breakInstantly().nonOpaque().pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block LIGHT_PINK_GERANIUM = registerBlock("light_pink_geranium",
            properties -> new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, properties
                    .mapColor(MapColor.DARK_GREEN)
                    .noCollision()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.GRASS)
                    .offset(AbstractBlock.OffsetType.XZ)
                    .pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block POTTED_LIGHT_PINK_GERANIUM = registerBlock("potted_light_pink_geranium",
            properties -> new FlowerPotBlock(ModBlocks.LIGHT_PINK_GERANIUM,properties.breakInstantly().nonOpaque().pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block LIGHT_PINK_LARKSPUR = registerBlock("light_pink_larkspur",
            properties -> new TallFlowerBlock(properties
                    .mapColor(MapColor.DARK_GREEN)
                    .noCollision()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.GRASS)
                    .offset(AbstractBlock.OffsetType.XZ)
                    .pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block MAGENTA_CLOVER = registerBlock("magenta_clover",
            properties -> new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, properties
                    .mapColor(MapColor.DARK_GREEN)
                    .noCollision()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.GRASS)
                    .offset(AbstractBlock.OffsetType.XZ)
                    .pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block POTTED_MAGENTA_CLOVER = registerBlock("potted_magenta_clover",
            properties -> new FlowerPotBlock(ModBlocks.MAGENTA_CLOVER,properties.breakInstantly().nonOpaque().pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block MAGENTA_LARKSPUR = registerBlock("magenta_larkspur",
            properties -> new TallFlowerBlock(properties
                    .mapColor(MapColor.DARK_GREEN)
                    .noCollision()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.GRASS)
                    .offset(AbstractBlock.OffsetType.XZ)
                    .pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block MAGENTA_ORCHID = registerBlock("magenta_orchid",
            properties -> new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, properties
                    .mapColor(MapColor.DARK_GREEN)
                    .noCollision()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.GRASS)
                    .offset(AbstractBlock.OffsetType.XZ)
                    .pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block POTTED_MAGENTA_ORCHID = registerBlock("potted_magenta_orchid",
            properties -> new FlowerPotBlock(ModBlocks.MAGENTA_ORCHID,properties.breakInstantly().nonOpaque().pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block MAGENTA_SWEET_PEAS = registerBlock("magenta_sweet_peas",
            properties -> new TallFlowerBlock(properties
                    .mapColor(MapColor.DARK_GREEN)
                    .noCollision()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.GRASS)
                    .offset(AbstractBlock.OffsetType.XZ)
                    .pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block MAGENTA_ZINNIA = registerBlock("magenta_zinnia",
            properties -> new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, properties
                    .mapColor(MapColor.DARK_GREEN)
                    .noCollision()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.GRASS)
                    .offset(AbstractBlock.OffsetType.XZ)
                    .pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block POTTED_MAGENTA_ZINNIA = registerBlock("potted_magenta_zinnia",
            properties -> new FlowerPotBlock(ModBlocks.MAGENTA_ZINNIA,properties.breakInstantly().nonOpaque().pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block MANZANITA_BUSH = registerBlock("manzanita_bush",
            properties -> new TallFlowerBlock(properties
                    .mapColor(MapColor.DARK_GREEN)
                    .noCollision()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.GRASS)
                    .offset(AbstractBlock.OffsetType.XZ)
                    .pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block MAROON_MALLOW = registerBlock("maroon_mallow",
            properties -> new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, properties
                    .mapColor(MapColor.DARK_GREEN)
                    .noCollision()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.GRASS)
                    .offset(AbstractBlock.OffsetType.XZ)
                    .pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block POTTED_MAROON_MALLOW = registerBlock("potted_maroon_mallow",
            properties -> new FlowerPotBlock(ModBlocks.MAROON_MALLOW,properties.breakInstantly().nonOpaque().pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block MEDIUM_BLUE_LOBELIA = registerBlock("medium_blue_lobelia",
            properties -> new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, properties
                    .mapColor(MapColor.DARK_GREEN)
                    .noCollision()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.GRASS)
                    .offset(AbstractBlock.OffsetType.XZ)
                    .pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block POTTED_MEDIUM_BLUE_LOBELIA = registerBlock("potted_medium_blue_lobelia",
            properties -> new FlowerPotBlock(ModBlocks.MEDIUM_BLUE_LOBELIA,properties.breakInstantly().nonOpaque().pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block MENDOCINO_POPPY = registerBlock("mendocino_poppy",
            properties -> new TallFlowerBlock(properties
                    .mapColor(MapColor.DARK_GREEN)
                    .noCollision()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.GRASS)
                    .offset(AbstractBlock.OffsetType.XZ)
                    .pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block MEXICAN_SAGE = registerBlock("mexican_sage",
            properties -> new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, properties
                    .mapColor(MapColor.DARK_GREEN)
                    .noCollision()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.GRASS)
                    .offset(AbstractBlock.OffsetType.XZ)
                    .pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block POTTED_MEXICAN_SAGE = registerBlock("potted_mexican_sage",
            properties -> new FlowerPotBlock(ModBlocks.MEXICAN_SAGE,properties.breakInstantly().nonOpaque().pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block MIXED_PINK_SWEET_PEAS = registerBlock("mixed_pink_sweet_peas",
            properties -> new TallFlowerBlock(properties
                    .mapColor(MapColor.DARK_GREEN)
                    .noCollision()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.GRASS)
                    .offset(AbstractBlock.OffsetType.XZ)
                    .pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block MIXED_ZINNIA = registerBlock("mixed_zinnia",
            properties -> new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, properties
                    .mapColor(MapColor.DARK_GREEN)
                    .noCollision()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.GRASS)
                    .offset(AbstractBlock.OffsetType.XZ)
                    .pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block POTTED_MIXED_ZINNIA = registerBlock("potted_mixed_zinnia",
            properties -> new FlowerPotBlock(ModBlocks.MIXED_ZINNIA,properties.breakInstantly().nonOpaque().pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block MOJAVE_INDIGO_BUSH = registerBlock("mojave_indigo_bush",
            properties -> new TallFlowerBlock(properties
                    .mapColor(MapColor.DARK_GREEN)
                    .noCollision()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.GRASS)
                    .offset(AbstractBlock.OffsetType.XZ)
                    .pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block MORNING_GLORY = registerBlock("morning_glory",
            properties -> new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, properties
                    .mapColor(MapColor.DARK_GREEN)
                    .noCollision()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.GRASS)
                    .offset(AbstractBlock.OffsetType.XZ)
                    .pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block POTTED_MORNING_GLORY = registerBlock("potted_morning_glory",
            properties -> new FlowerPotBlock(ModBlocks.MORNING_GLORY,properties.breakInstantly().nonOpaque().pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block NARCISSUS = registerBlock("narcissus",
            properties -> new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, properties
                    .mapColor(MapColor.DARK_GREEN)
                    .noCollision()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.GRASS)
                    .offset(AbstractBlock.OffsetType.XZ)
                    .pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block POTTED_NARCISSUS = registerBlock("potted_narcissus",
            properties -> new FlowerPotBlock(ModBlocks.NARCISSUS,properties.breakInstantly().nonOpaque().pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block NASTURTIUM = registerBlock("nasturtium",
            properties -> new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, properties
                    .mapColor(MapColor.DARK_GREEN)
                    .noCollision()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.GRASS)
                    .offset(AbstractBlock.OffsetType.XZ)
                    .pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block POTTED_NASTURTIUM = registerBlock("potted_nasturtium",
            properties -> new FlowerPotBlock(ModBlocks.NASTURTIUM,properties.breakInstantly().nonOpaque().pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block NASTURTIUM_PINK = registerBlock("nasturtium_pink",
            properties -> new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, properties
                    .mapColor(MapColor.DARK_GREEN)
                    .noCollision()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.GRASS)
                    .offset(AbstractBlock.OffsetType.XZ)
                    .pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block POTTED_NASTURTIUM_PINK = registerBlock("potted_nasturtium_pink",
            properties -> new FlowerPotBlock(ModBlocks.NASTURTIUM_PINK,properties.breakInstantly().nonOpaque().pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block NOTCH_LEAF_SCORPION_WEED = registerBlock("notch_leaf_scorpion_weed",
            properties -> new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, properties
                    .mapColor(MapColor.DARK_GREEN)
                    .noCollision()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.GRASS)
                    .offset(AbstractBlock.OffsetType.XZ)
                    .pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block POTTED_NOTCH_LEAF_SCORPION_WEED = registerBlock("potted_notch_leaf_scorpion_weed",
            properties -> new FlowerPotBlock(ModBlocks.NOTCH_LEAF_SCORPION_WEED,properties.breakInstantly().nonOpaque().pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block OCOTILLO = registerBlock("ocotillo",
            properties -> new TallFlowerBlock(properties
                    .mapColor(MapColor.DARK_GREEN)
                    .noCollision()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.GRASS)
                    .offset(AbstractBlock.OffsetType.XZ)
                    .pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block ORANGE_AUSTRALIAN_FLAME_PEA = registerBlock("orange_australian_flame_pea",
            properties -> new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, properties
                    .mapColor(MapColor.DARK_GREEN)
                    .noCollision()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.GRASS)
                    .offset(AbstractBlock.OffsetType.XZ)
                    .pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block POTTED_ORANGE_AUSTRALIAN_FLAME_PEA = registerBlock("potted_orange_australian_flame_pea",
            properties -> new FlowerPotBlock(ModBlocks.ORANGE_AUSTRALIAN_FLAME_PEA,properties.breakInstantly().nonOpaque().pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block ORANGE_COSMOS = registerBlock("orange_cosmos",
            properties -> new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, properties
                    .mapColor(MapColor.DARK_GREEN)
                    .noCollision()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.GRASS)
                    .offset(AbstractBlock.OffsetType.XZ)
                    .pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block POTTED_ORANGE_COSMOS = registerBlock("potted_orange_cosmos",
            properties -> new FlowerPotBlock(ModBlocks.ORANGE_COSMOS,properties.breakInstantly().nonOpaque().pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block ORANGE_DAY_LILY = registerBlock("orange_day_lily",
            properties -> new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, properties
                    .mapColor(MapColor.DARK_GREEN)
                    .noCollision()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.GRASS)
                    .offset(AbstractBlock.OffsetType.XZ)
                    .pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block POTTED_ORANGE_DAY_LILY = registerBlock("potted_orange_day_lily",
            properties -> new FlowerPotBlock(ModBlocks.ORANGE_DAY_LILY,properties.breakInstantly().nonOpaque().pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block ORANGE_FREESIA = registerBlock("orange_freesia",
            properties -> new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, properties
                    .mapColor(MapColor.DARK_GREEN)
                    .noCollision()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.GRASS)
                    .offset(AbstractBlock.OffsetType.XZ)
                    .pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block POTTED_ORANGE_FREESIA = registerBlock("potted_orange_freesia",
            properties -> new FlowerPotBlock(ModBlocks.ORANGE_FREESIA,properties.breakInstantly().nonOpaque().pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block ORANGE_GLADIOLA = registerBlock("orange_gladiola",
            properties -> new TallFlowerBlock(properties
                    .mapColor(MapColor.DARK_GREEN)
                    .noCollision()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.GRASS)
                    .offset(AbstractBlock.OffsetType.XZ)
                    .pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block ORANGE_LUPIN = registerBlock("orange_lupin",
            properties -> new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, properties
                    .mapColor(MapColor.DARK_GREEN)
                    .noCollision()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.GRASS)
                    .offset(AbstractBlock.OffsetType.XZ)
                    .pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block POTTED_ORANGE_LUPIN = registerBlock("potted_orange_lupin",
            properties -> new FlowerPotBlock(ModBlocks.ORANGE_LUPIN,properties.breakInstantly().nonOpaque().pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block ORNAMENTAL_CHERRY = registerBlock("ornamental_cherry",
            properties -> new TallFlowerBlock(properties
                    .mapColor(MapColor.DARK_GREEN)
                    .noCollision()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.GRASS)
                    .offset(AbstractBlock.OffsetType.XZ)
                    .pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block OWLS_CLOVER = registerBlock("owls_clover",
            properties -> new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, properties
                    .mapColor(MapColor.DARK_GREEN)
                    .noCollision()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.GRASS)
                    .offset(AbstractBlock.OffsetType.XZ)
                    .pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block POTTED_OWLS_CLOVER = registerBlock("potted_owls_clover",
            properties -> new FlowerPotBlock(ModBlocks.OWLS_CLOVER,properties.breakInstantly().nonOpaque().pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block PANSY = registerBlock("pansy",
            properties -> new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, properties
                    .mapColor(MapColor.DARK_GREEN)
                    .noCollision()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.GRASS)
                    .offset(AbstractBlock.OffsetType.XZ)
                    .pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block POTTED_PANSY = registerBlock("potted_pansy",
            properties -> new FlowerPotBlock(ModBlocks.PANSY,properties.breakInstantly().nonOpaque().pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block PANSY_PURPLE = registerBlock("pansy_purple",
            properties -> new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, properties
                    .mapColor(MapColor.DARK_GREEN)
                    .noCollision()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.GRASS)
                    .offset(AbstractBlock.OffsetType.XZ)
                    .pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block POTTED_PANSY_PURPLE = registerBlock("potted_pansy_purple",
            properties -> new FlowerPotBlock(ModBlocks.PANSY_PURPLE,properties.breakInstantly().nonOpaque().pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block PARADOX_SUNFLOWER = registerBlock("paradox_sunflower",
            properties -> new TallFlowerBlock(properties
                    .mapColor(MapColor.DARK_GREEN)
                    .noCollision()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.GRASS)
                    .offset(AbstractBlock.OffsetType.XZ)
                    .pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block PARODIA_MURICATA = registerBlock("parodia_muricata",
            properties -> new ShortPlantBlock(properties			
                    .mapColor(MapColor.DARK_GREEN)
                    .replaceable()
                    .noCollision()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.GRASS)
                    .offset(AbstractBlock.OffsetType.XYZ)
                    .burnable()
                    .pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block PARROT_FLOWER = registerBlock("parrot_flower",
            properties -> new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, properties
                    .mapColor(MapColor.DARK_GREEN)
                    .noCollision()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.GRASS)
                    .offset(AbstractBlock.OffsetType.XZ)
                    .pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block POTTED_PARROT_FLOWER = registerBlock("potted_parrot_flower",
            properties -> new FlowerPotBlock(ModBlocks.PARROT_FLOWER,properties.breakInstantly().nonOpaque().pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block PEACH_GLADIOLA = registerBlock("peach_gladiola",
            properties -> new TallFlowerBlock(properties
                    .mapColor(MapColor.DARK_GREEN)
                    .noCollision()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.GRASS)
                    .offset(AbstractBlock.OffsetType.XZ)
                    .pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block PEPPERMINT = registerBlock("peppermint",
            properties -> new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, properties
                    .mapColor(MapColor.DARK_GREEN)
                    .noCollision()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.GRASS)
                    .offset(AbstractBlock.OffsetType.XZ)
                    .pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block POTTED_PEPPERMINT = registerBlock("potted_peppermint",
            properties -> new FlowerPotBlock(ModBlocks.PEPPERMINT,properties.breakInstantly().nonOpaque().pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block PERIWINKLE = registerBlock("periwinkle",
            properties -> new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, properties
                    .mapColor(MapColor.DARK_GREEN)
                    .noCollision()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.GRASS)
                    .offset(AbstractBlock.OffsetType.XZ)
                    .pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block POTTED_PERIWINKLE = registerBlock("potted_periwinkle",
            properties -> new FlowerPotBlock(ModBlocks.PERIWINKLE,properties.breakInstantly().nonOpaque().pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block PINK_CLOVER = registerBlock("pink_clover",
            properties -> new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, properties
                    .mapColor(MapColor.DARK_GREEN)
                    .noCollision()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.GRASS)
                    .offset(AbstractBlock.OffsetType.XZ)
                    .pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block POTTED_PINK_CLOVER = registerBlock("potted_pink_clover",
            properties -> new FlowerPotBlock(ModBlocks.PINK_CLOVER,properties.breakInstantly().nonOpaque().pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block PINK_DESERT_SAND_VERBENA = registerBlock("pink_desert_sand_verbena",
            properties -> new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, properties
                    .mapColor(MapColor.DARK_GREEN)
                    .noCollision()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.GRASS)
                    .offset(AbstractBlock.OffsetType.XZ)
                    .pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block POTTED_PINK_DESERT_SAND_VERBENA = registerBlock("potted_pink_desert_sand_verbena",
            properties -> new FlowerPotBlock(ModBlocks.PINK_DESERT_SAND_VERBENA,properties.breakInstantly().nonOpaque().pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block PINK_GERANIUM = registerBlock("pink_geranium",
            properties -> new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, properties
                    .mapColor(MapColor.DARK_GREEN)
                    .noCollision()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.GRASS)
                    .offset(AbstractBlock.OffsetType.XZ)
                    .pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block POTTED_PINK_GERANIUM = registerBlock("potted_pink_geranium",
            properties -> new FlowerPotBlock(ModBlocks.PINK_GERANIUM,properties.breakInstantly().nonOpaque().pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block PINK_LARKSPUR = registerBlock("pink_larkspur",
            properties -> new TallFlowerBlock(properties
                    .mapColor(MapColor.DARK_GREEN)
                    .noCollision()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.GRASS)
                    .offset(AbstractBlock.OffsetType.XZ)
                    .pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block PINK_PETTICOAT = registerBlock("pink_petticoat",
            properties -> new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, properties
                    .mapColor(MapColor.DARK_GREEN)
                    .noCollision()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.GRASS)
                    .offset(AbstractBlock.OffsetType.XZ)
                    .pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block POTTED_PINK_PETTICOAT = registerBlock("potted_pink_petticoat",
            properties -> new FlowerPotBlock(ModBlocks.PINK_PETTICOAT,properties.breakInstantly().nonOpaque().pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block PITCHER_PLANT = registerBlock("pitcher_plant",
            properties -> new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, properties
                    .mapColor(MapColor.DARK_GREEN)
                    .noCollision()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.GRASS)
                    .offset(AbstractBlock.OffsetType.XZ)
                    .pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block POTTED_PITCHER_PLANT = registerBlock("potted_pitcher_plant",
            properties -> new FlowerPotBlock(ModBlocks.PITCHER_PLANT,properties.breakInstantly().nonOpaque().pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block PURPLE_AFRICAN_DAISY = registerBlock("purple_african_daisy",
            properties -> new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, properties
                    .mapColor(MapColor.DARK_GREEN)
                    .noCollision()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.GRASS)
                    .offset(AbstractBlock.OffsetType.XZ)
                    .pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block POTTED_PURPLE_AFRICAN_DAISY = registerBlock("potted_purple_african_daisy",
            properties -> new FlowerPotBlock(ModBlocks.PURPLE_AFRICAN_DAISY,properties.breakInstantly().nonOpaque().pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block PURPLE_CALLA_LILY = registerBlock("purple_calla_lily",
            properties -> new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, properties
                    .mapColor(MapColor.DARK_GREEN)
                    .noCollision()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.GRASS)
                    .offset(AbstractBlock.OffsetType.XZ)
                    .pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block POTTED_PURPLE_CALLA_LILY = registerBlock("potted_purple_calla_lily",
            properties -> new FlowerPotBlock(ModBlocks.PURPLE_CALLA_LILY,properties.breakInstantly().nonOpaque().pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block PURPLE_CROCUS = registerBlock("purple_crocus",
            properties -> new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, properties
                    .mapColor(MapColor.DARK_GREEN)
                    .noCollision()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.GRASS)
                    .offset(AbstractBlock.OffsetType.XZ)
                    .pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block POTTED_PURPLE_CROCUS = registerBlock("potted_purple_crocus",
            properties -> new FlowerPotBlock(ModBlocks.PURPLE_CROCUS,properties.breakInstantly().nonOpaque().pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block PURPLE_FLAG = registerBlock("purple_flag",
            properties -> new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, properties
                    .mapColor(MapColor.DARK_GREEN)
                    .noCollision()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.GRASS)
                    .offset(AbstractBlock.OffsetType.XZ)
                    .pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block POTTED_PURPLE_FLAG = registerBlock("potted_purple_flag",
            properties -> new FlowerPotBlock(ModBlocks.PURPLE_FLAG,properties.breakInstantly().nonOpaque().pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block PURPLE_LARKSPUR = registerBlock("purple_larkspur",
            properties -> new TallFlowerBlock(properties
                    .mapColor(MapColor.DARK_GREEN)
                    .noCollision()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.GRASS)
                    .offset(AbstractBlock.OffsetType.XZ)
                    .pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block PURPLE_LUPIN = registerBlock("purple_lupin",
            properties -> new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, properties
                    .mapColor(MapColor.DARK_GREEN)
                    .noCollision()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.GRASS)
                    .offset(AbstractBlock.OffsetType.XZ)
                    .pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block POTTED_PURPLE_LUPIN = registerBlock("potted_purple_lupin",
            properties -> new FlowerPotBlock(ModBlocks.PURPLE_LUPIN,properties.breakInstantly().nonOpaque().pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block PURPLE_MAGENTA_SALVIA = registerBlock("purple_magenta_salvia",
            properties -> new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, properties
                    .mapColor(MapColor.DARK_GREEN)
                    .noCollision()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.GRASS)
                    .offset(AbstractBlock.OffsetType.XZ)
                    .pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block POTTED_PURPLE_MAGENTA_SALVIA = registerBlock("potted_purple_magenta_salvia",
            properties -> new FlowerPotBlock(ModBlocks.PURPLE_MAGENTA_SALVIA,properties.breakInstantly().nonOpaque().pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block PURPLE_SWEET_PEAS = registerBlock("purple_sweet_peas",
            properties -> new TallFlowerBlock(properties
                    .mapColor(MapColor.DARK_GREEN)
                    .noCollision()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.GRASS)
                    .offset(AbstractBlock.OffsetType.XZ)
                    .pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block QUINCE = registerBlock("quince",
            properties -> new TallFlowerBlock(properties
                    .mapColor(MapColor.DARK_GREEN)
                    .noCollision()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.GRASS)
                    .offset(AbstractBlock.OffsetType.XZ)
                    .pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block RED_CLOVER = registerBlock("red_clover",
            properties -> new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, properties
                    .mapColor(MapColor.DARK_GREEN)
                    .noCollision()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.GRASS)
                    .offset(AbstractBlock.OffsetType.XZ)
                    .pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block POTTED_RED_CLOVER = registerBlock("potted_red_clover",
            properties -> new FlowerPotBlock(ModBlocks.RED_CLOVER,properties.breakInstantly().nonOpaque().pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block RED_FREESIA = registerBlock("red_freesia",
            properties -> new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, properties
                    .mapColor(MapColor.DARK_GREEN)
                    .noCollision()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.GRASS)
                    .offset(AbstractBlock.OffsetType.XZ)
                    .pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block POTTED_RED_FREESIA = registerBlock("potted_red_freesia",
            properties -> new FlowerPotBlock(ModBlocks.RED_FREESIA,properties.breakInstantly().nonOpaque().pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block RED_GERANIUM = registerBlock("red_geranium",
            properties -> new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, properties
                    .mapColor(MapColor.DARK_GREEN)
                    .noCollision()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.GRASS)
                    .offset(AbstractBlock.OffsetType.XZ)
                    .pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block POTTED_RED_GERANIUM = registerBlock("potted_red_geranium",
            properties -> new FlowerPotBlock(ModBlocks.RED_GERANIUM,properties.breakInstantly().nonOpaque().pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block RED_POPPY = registerBlock("red_poppy",
            properties -> new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, properties
                    .mapColor(MapColor.DARK_GREEN)
                    .noCollision()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.GRASS)
                    .offset(AbstractBlock.OffsetType.XZ)
                    .pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block POTTED_RED_POPPY = registerBlock("potted_red_poppy",
            properties -> new FlowerPotBlock(ModBlocks.RED_POPPY,properties.breakInstantly().nonOpaque().pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block RED_SUNFLOWER = registerBlock("red_sunflower",
            properties -> new TallFlowerBlock(properties
                    .mapColor(MapColor.DARK_GREEN)
                    .noCollision()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.GRASS)
                    .offset(AbstractBlock.OffsetType.XZ)
                    .pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block ROCK_ROSE = registerBlock("rock_rose",
            properties -> new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, properties
                    .mapColor(MapColor.DARK_GREEN)
                    .noCollision()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.GRASS)
                    .offset(AbstractBlock.OffsetType.XZ)
                    .pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block POTTED_ROCK_ROSE = registerBlock("potted_rock_rose",
            properties -> new FlowerPotBlock(ModBlocks.ROCK_ROSE,properties.breakInstantly().nonOpaque().pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block ROYAL_BLUE_LOBELIA = registerBlock("royal_blue_lobelia",
            properties -> new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, properties
                    .mapColor(MapColor.DARK_GREEN)
                    .noCollision()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.GRASS)
                    .offset(AbstractBlock.OffsetType.XZ)
                    .pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block POTTED_ROYAL_BLUE_LOBELIA = registerBlock("potted_royal_blue_lobelia",
            properties -> new FlowerPotBlock(ModBlocks.ROYAL_BLUE_LOBELIA,properties.breakInstantly().nonOpaque().pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block SALVIA = registerBlock("salvia",
            properties -> new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, properties
                    .mapColor(MapColor.DARK_GREEN)
                    .noCollision()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.GRASS)
                    .offset(AbstractBlock.OffsetType.XZ)
                    .pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block POTTED_SALVIA = registerBlock("potted_salvia",
            properties -> new FlowerPotBlock(ModBlocks.SALVIA,properties.breakInstantly().nonOpaque().pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block SILVER_CARPET = registerBlock("silver_carpet",
            properties -> new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, properties
                    .mapColor(MapColor.DARK_GREEN)
                    .noCollision()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.GRASS)
                    .offset(AbstractBlock.OffsetType.XZ)
                    .pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block POTTED_SILVER_CARPET = registerBlock("potted_silver_carpet",
            properties -> new FlowerPotBlock(ModBlocks.SILVER_CARPET,properties.breakInstantly().nonOpaque().pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block SKYSCRAPER_SUNFLOWER = registerBlock("skyscraper_sunflower",
            properties -> new TallFlowerBlock(properties
                    .mapColor(MapColor.DARK_GREEN)
                    .noCollision()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.GRASS)
                    .offset(AbstractBlock.OffsetType.XZ)
                    .pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block SNAPDRAGON_PINK = registerBlock("snapdragon_pink",
            properties -> new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, properties
                    .mapColor(MapColor.DARK_GREEN)
                    .noCollision()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.GRASS)
                    .offset(AbstractBlock.OffsetType.XZ)
                    .pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block POTTED_SNAPDRAGON_PINK = registerBlock("potted_snapdragon_pink",
            properties -> new FlowerPotBlock(ModBlocks.SNAPDRAGON_PINK,properties.breakInstantly().nonOpaque().pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block SNAPDRAGON_WHITE = registerBlock("snapdragon_white",
            properties -> new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, properties
                    .mapColor(MapColor.DARK_GREEN)
                    .noCollision()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.GRASS)
                    .offset(AbstractBlock.OffsetType.XZ)
                    .pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block POTTED_SNAPDRAGON_WHITE = registerBlock("potted_snapdragon_white",
            properties -> new FlowerPotBlock(ModBlocks.SNAPDRAGON_WHITE,properties.breakInstantly().nonOpaque().pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block SPROUT = registerBlock("sprout",
            properties -> new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, properties
                    .mapColor(MapColor.DARK_GREEN)
                    .noCollision()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.GRASS)
                    .offset(AbstractBlock.OffsetType.XZ)
                    .pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block POTTED_SPROUT = registerBlock("potted_sprout",
            properties -> new FlowerPotBlock(ModBlocks.SPROUT,properties.breakInstantly().nonOpaque().pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block STACKED_MORNING_GLORY = registerBlock("staked_morning_glory",
            properties -> new TallFlowerBlock(properties
                    .mapColor(MapColor.DARK_GREEN)
                    .noCollision()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.GRASS)
                    .offset(AbstractBlock.OffsetType.XZ)
                    .pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block STACKED_NASTURTIUM = registerBlock("staked_nasturtium",
            properties -> new TallFlowerBlock(properties
                    .mapColor(MapColor.DARK_GREEN)
                    .noCollision()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.GRASS)
                    .offset(AbstractBlock.OffsetType.XZ)
                    .pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block STACKED_NASTURTIUM_PINK = registerBlock("staked_nasturtium_pink",
            properties -> new TallFlowerBlock(properties
                    .mapColor(MapColor.DARK_GREEN)
                    .noCollision()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.GRASS)
                    .offset(AbstractBlock.OffsetType.XZ)
                    .pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block STICKY_MONKEY = registerBlock("sticky_monkey",
            properties -> new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, properties
                    .mapColor(MapColor.DARK_GREEN)
                    .noCollision()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.GRASS)
                    .offset(AbstractBlock.OffsetType.XZ)
                    .pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block POTTED_STICKY_MONKEY = registerBlock("potted_sticky_monkey",
            properties -> new FlowerPotBlock(ModBlocks.STICKY_MONKEY,properties.breakInstantly().nonOpaque().pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block STRIPED_ZINNIA = registerBlock("striped_zinnia",
            properties -> new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, properties
                    .mapColor(MapColor.DARK_GREEN)
                    .noCollision()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.GRASS)
                    .offset(AbstractBlock.OffsetType.XZ)
                    .pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block POTTED_STRIPED_ZINNIA = registerBlock("potted_striped_zinnia",
            properties -> new FlowerPotBlock(ModBlocks.STRIPED_ZINNIA,properties.breakInstantly().nonOpaque().pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block SUNDANCE_KID = registerBlock("sundance_kid_sunflower",
            properties -> new TallFlowerBlock(properties
                    .mapColor(MapColor.DARK_GREEN)
                    .noCollision()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.GRASS)
                    .offset(AbstractBlock.OffsetType.XZ)
                    .pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block SUNNY_ZINNIA = registerBlock("sunny_zinnia",
            properties -> new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, properties
                    .mapColor(MapColor.DARK_GREEN)
                    .noCollision()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.GRASS)
                    .offset(AbstractBlock.OffsetType.XZ)
                    .pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block POTTED_SUNNY_ZINNIA = registerBlock("potted_sunny_zinnia",
            properties -> new FlowerPotBlock(ModBlocks.SUNNY_ZINNIA,properties.breakInstantly().nonOpaque().pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block TALL_CACTUS = registerBlock("tall_cactus",
            properties -> new TallFlowerBlock(properties
                    .mapColor(MapColor.DARK_GREEN)
                    .noCollision()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.GRASS)
                    .offset(AbstractBlock.OffsetType.XZ)
                    .pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block TALL_CALLA_LILY = registerBlock("tall_calla_lily",
            properties -> new TallFlowerBlock(properties
                    .mapColor(MapColor.DARK_GREEN)
                    .noCollision()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.GRASS)
                    .offset(AbstractBlock.OffsetType.XZ)
                    .pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block TALL_COSMOS = registerBlock("tall_cosmos",
            properties -> new TallFlowerBlock(properties
                    .mapColor(MapColor.DARK_GREEN)
                    .noCollision()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.GRASS)
                    .offset(AbstractBlock.OffsetType.XZ)
                    .pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block TALL_LUPIN = registerBlock("tall_lupin",
            properties -> new TallFlowerBlock(properties
                    .mapColor(MapColor.DARK_GREEN)
                    .noCollision()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.GRASS)
                    .offset(AbstractBlock.OffsetType.XZ)
                    .pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block TALL_ORANGE_COSMOS = registerBlock("tall_orange_cosmos",
            properties -> new TallFlowerBlock(properties
                    .mapColor(MapColor.DARK_GREEN)
                    .noCollision()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.GRASS)
                    .offset(AbstractBlock.OffsetType.XZ)
                    .pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block TEDDY_BEAR_SUNFLOWER = registerBlock("teddy_bear_sunflower",
            properties -> new TallFlowerBlock(properties
                    .mapColor(MapColor.DARK_GREEN)
                    .noCollision()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.GRASS)
                    .offset(AbstractBlock.OffsetType.XZ)
                    .pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block TUMBLE_WEED = registerBlock("tumble_weed",
            properties -> new ShortPlantBlock(properties			
                    .mapColor(MapColor.DARK_GREEN)
                    .replaceable()
                    .noCollision()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.GRASS)
                    .offset(AbstractBlock.OffsetType.XYZ)
                    .burnable()
                    .pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block VENUS_FLY_TRAP = registerBlock("venus_fly_trap",
            properties -> new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, properties
                    .mapColor(MapColor.DARK_GREEN)
                    .noCollision()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.GRASS)
                    .offset(AbstractBlock.OffsetType.XZ)
                    .pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block POTTED_VENUS_FLY_TRAP = registerBlock("potted_venus_fly_trap",
            properties -> new FlowerPotBlock(ModBlocks.VENUS_FLY_TRAP,properties.breakInstantly().nonOpaque().pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block VIOLET = registerBlock("violet",
            properties -> new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, properties
                    .mapColor(MapColor.DARK_GREEN)
                    .noCollision()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.GRASS)
                    .offset(AbstractBlock.OffsetType.XZ)
                    .pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block POTTED_VIOLET = registerBlock("potted_violet",
            properties -> new FlowerPotBlock(ModBlocks.VIOLET,properties.breakInstantly().nonOpaque().pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block VIOLET_WEBCAP = registerBlock("violet_webcap",
            properties -> new ShortPlantBlock(properties			
                    .mapColor(MapColor.DARK_GREEN)
                    .replaceable()
                    .noCollision()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.GRASS)
                    .offset(AbstractBlock.OffsetType.XYZ)
                    .burnable()
                    .pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block VIRGINIA_COWSLIP = registerBlock("virginia_cowslip",
            properties -> new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, properties
                    .mapColor(MapColor.DARK_GREEN)
                    .noCollision()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.GRASS)
                    .offset(AbstractBlock.OffsetType.XZ)
                    .pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block POTTED_VIRGINIA_COWSLIP = registerBlock("potted_virginia_cowslip",
            properties -> new FlowerPotBlock(ModBlocks.VIRGINIA_COWSLIP,properties.breakInstantly().nonOpaque().pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block WATER_LILY_SMALL = registerBlockWithoutItem("water_lily_small",
            properties -> new LilyPadBlock(properties.mapColor(MapColor.DARK_GREEN)
                    .breakInstantly()
                    .sounds(BlockSoundGroup.LILY_PAD)
                    .nonOpaque()
                    .pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block WHITE_DAFFODIL = registerBlock("white_daffodil",
            properties -> new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, properties
                    .mapColor(MapColor.DARK_GREEN)
                    .noCollision()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.GRASS)
                    .offset(AbstractBlock.OffsetType.XZ)
                    .pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block POTTED_WHITE_DAFFODIL = registerBlock("potted_white_daffodil",
            properties -> new FlowerPotBlock(ModBlocks.WHITE_DAFFODIL,properties.breakInstantly().nonOpaque().pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block WHITE_LARKSPUR = registerBlock("white_larkspur",
            properties -> new TallFlowerBlock(properties
                    .mapColor(MapColor.DARK_GREEN)
                    .noCollision()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.GRASS)
                    .offset(AbstractBlock.OffsetType.XZ)
                    .pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block WHITE_TINSEL = registerBlock("white_tinsel_flower",
            properties -> new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, properties
                    .mapColor(MapColor.DARK_GREEN)
                    .noCollision()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.GRASS)
                    .offset(AbstractBlock.OffsetType.XZ)
                    .pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block POTTED_WHITE_TINSEL = registerBlock("potted_white_tinsel",
            properties -> new FlowerPotBlock(ModBlocks.WHITE_TINSEL,properties.breakInstantly().nonOpaque().pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block WOLFS_BANE = registerBlock("wolfs_bane",
            properties -> new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, properties
                    .mapColor(MapColor.DARK_GREEN)
                    .noCollision()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.GRASS)
                    .offset(AbstractBlock.OffsetType.XZ)
                    .pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block POTTED_WOLFS_BANE = registerBlock("potted_wolfs_bane",
            properties -> new FlowerPotBlock(ModBlocks.WOLFS_BANE,properties.breakInstantly().nonOpaque().pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block WOOLY_THYME = registerBlock("wooly_thyme",
            properties -> new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, properties
                    .mapColor(MapColor.DARK_GREEN)
                    .noCollision()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.GRASS)
                    .offset(AbstractBlock.OffsetType.XZ)
                    .pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block POTTED_WOOLY_THYME = registerBlock("potted_wooly_thyme",
            properties -> new FlowerPotBlock(ModBlocks.WOOLY_THYME,properties.breakInstantly().nonOpaque().pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block YELLOW_COSMOS = registerBlock("yellow_cosmos",
            properties -> new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, properties
                    .mapColor(MapColor.DARK_GREEN)
                    .noCollision()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.GRASS)
                    .offset(AbstractBlock.OffsetType.XZ)
                    .pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block POTTED_YELLOW_COSMOS = registerBlock("potted_yellow_cosmos",
            properties -> new FlowerPotBlock(ModBlocks.YELLOW_COSMOS,properties.breakInstantly().nonOpaque().pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block YELLOW_CROCUS = registerBlock("yellow_crocus",
            properties -> new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, properties
                    .mapColor(MapColor.DARK_GREEN)
                    .noCollision()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.GRASS)
                    .offset(AbstractBlock.OffsetType.XZ)
                    .pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block POTTED_YELLOW_CROCUS = registerBlock("potted_yellow_crocus",
            properties -> new FlowerPotBlock(ModBlocks.YELLOW_CROCUS,properties.breakInstantly().nonOpaque().pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block YELLOW_DAFFODIL = registerBlock("yellow_daffodil",
            properties -> new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, properties
                    .mapColor(MapColor.DARK_GREEN)
                    .noCollision()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.GRASS)
                    .offset(AbstractBlock.OffsetType.XZ)
                    .pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block POTTED_YELLOW_DAFFODIL = registerBlock("potted_yellow_daffodil",
            properties -> new FlowerPotBlock(ModBlocks.YELLOW_DAFFODIL,properties.breakInstantly().nonOpaque().pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block YELLOW_FREESIA = registerBlock("yellow_freesia",
            properties -> new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, properties
                    .mapColor(MapColor.DARK_GREEN)
                    .noCollision()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.GRASS)
                    .offset(AbstractBlock.OffsetType.XZ)
                    .pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block POTTED_YELLOW_FREESIA = registerBlock("potted_yellow_freesia",
            properties -> new FlowerPotBlock(ModBlocks.YELLOW_FREESIA,properties.breakInstantly().nonOpaque().pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block YELLOW_LUPIN = registerBlock("yellow_lupin",
            properties -> new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, properties
                    .mapColor(MapColor.DARK_GREEN)
                    .noCollision()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.GRASS)
                    .offset(AbstractBlock.OffsetType.XZ)
                    .pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block POTTED_YELLOW_LUPIN = registerBlock("potted_yellow_lupin",
            properties -> new FlowerPotBlock(ModBlocks.YELLOW_LUPIN,properties.breakInstantly().nonOpaque().pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block YELLOW_PATCHES = registerBlock("yellow_patches",
            properties -> new ShortPlantBlock(properties			
                    .mapColor(MapColor.DARK_GREEN)
                    .replaceable()
                    .noCollision()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.GRASS)
                    .offset(AbstractBlock.OffsetType.XYZ)
                    .burnable()
                    .pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block YELLOW_STARTHISTLE = registerBlock("yellow_starthistle",
            properties -> new FlowerBlock(StatusEffects.NIGHT_VISION,5.0F, properties
                    .mapColor(MapColor.DARK_GREEN)
                    .noCollision()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.GRASS)
                    .offset(AbstractBlock.OffsetType.XZ)
                    .pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block POTTED_YELLOW_STARTHISTLE = registerBlock("potted_yellow_starthistle",
            properties -> new FlowerPotBlock(ModBlocks.YELLOW_STARTHISTLE,properties.breakInstantly().nonOpaque().pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block YUCCA_FLOWER = registerBlock("yucca_flower",
            properties -> new TallFlowerBlock(properties
                    .mapColor(MapColor.DARK_GREEN)
                    .noCollision()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.GRASS)
                    .offset(AbstractBlock.OffsetType.XZ)
                    .pistonBehavior(PistonBehavior.DESTROY)));


    public static final Block WISTERIA_LAVANDER = registerBlock("wisteria_lavander",
            properties -> new WisteriaLavanderBlock(properties			
                    .mapColor(MapColor.DARK_GREEN)
                    .noCollision()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.CAVE_VINES)
                    .pistonBehavior(PistonBehavior.DESTROY)
                    .luminance((BlockState state) -> 0)
                    .ticksRandomly()));

    public static final Block WISTERIA_LAVANDER_PLANT = registerBlock("wisteria_lavander_plant",
            properties -> new WisteriaLavanderPlantBlock(properties
                    .mapColor(MapColor.DARK_GREEN)
                    .noCollision()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.CAVE_VINES)
                    .pistonBehavior(PistonBehavior.DESTROY)
                    .luminance((BlockState state) -> 0)));

    public static final Block WISTERIA_PURPLE = registerBlock("wisteria_purple",
            properties -> new WisteriaPurpleBlock(properties			
                    .mapColor(MapColor.DARK_GREEN)
                    .noCollision()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.CAVE_VINES)
                    .pistonBehavior(PistonBehavior.DESTROY)
                    .luminance((BlockState state) -> 0)
                    .ticksRandomly()));

    public static final Block WISTERIA_PURPLE_PLANT = registerBlock("wisteria_purple_plant",
            properties -> new WisteriaPurplePlantBlock(properties
                    .mapColor(MapColor.DARK_GREEN)
                    .noCollision()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.CAVE_VINES)
                    .pistonBehavior(PistonBehavior.DESTROY)
                    .luminance((BlockState state) -> 0)));

    public static final Block WISTERIA_WHITE = registerBlock("wisteria_white",
            properties -> new WisteriaWhiteBlock(properties			
                    .mapColor(MapColor.DARK_GREEN)
                    .noCollision()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.CAVE_VINES)
                    .pistonBehavior(PistonBehavior.DESTROY)
                    .luminance((BlockState state) -> 0)
                    .ticksRandomly()));

    public static final Block WISTERIA_WHITE_PLANT = registerBlock("wisteria_white_plant",
            properties -> new WisteriaWhitePlantBlock(properties
                    .mapColor(MapColor.DARK_GREEN)
                    .noCollision()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.CAVE_VINES)
                    .pistonBehavior(PistonBehavior.DESTROY)
                    .luminance((BlockState state) -> 0)));




    public static final Block JOY_LARGE_LILY = registerBlockWithoutItem("joy_large_lily",
            properties -> new LilyPadBlock(properties
                    .mapColor(MapColor.DARK_GREEN)
                    .breakInstantly()
                    .sounds(BlockSoundGroup.LILY_PAD)
                    .nonOpaque()
                    .pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block JOY_LIGHT_LILY = registerBlockWithoutItem("joy_light_lily",
            properties -> new LilyPadBlock(properties
                    .mapColor(MapColor.DARK_GREEN)
                    .breakInstantly()
                    .sounds(BlockSoundGroup.LILY_PAD)
                    .nonOpaque()
                    .pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block LAVANDER_LARGE_LILY = registerBlockWithoutItem("lavander_large_lily",
            properties -> new LilyPadBlock(properties
                    .mapColor(MapColor.DARK_GREEN)
                    .breakInstantly()
                    .sounds(BlockSoundGroup.LILY_PAD)
                    .nonOpaque()
                    .pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block LAVANDER_LIGHT_LILY = registerBlockWithoutItem("lavander_light_lily",
            properties -> new LilyPadBlock(properties
                    .mapColor(MapColor.DARK_GREEN)
                    .breakInstantly()
                    .sounds(BlockSoundGroup.LILY_PAD)
                    .nonOpaque()
                    .pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block PURPLE_LARGE_LILY = registerBlockWithoutItem("purple_large_lily",
            properties -> new LilyPadBlock(properties
                    .mapColor(MapColor.DARK_GREEN)
                    .breakInstantly()
                    .sounds(BlockSoundGroup.LILY_PAD)
                    .nonOpaque()
                    .pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block PURPLE_LIGHT_LILY = registerBlockWithoutItem("purple_light_lily",
            properties -> new LilyPadBlock(properties
                    .mapColor(MapColor.DARK_GREEN)
                    .breakInstantly()
                    .sounds(BlockSoundGroup.LILY_PAD)
                    .nonOpaque()
                    .pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block SUNFIRE_LARGE_LILY = registerBlockWithoutItem("sunfire_large_lily",
            properties -> new LilyPadBlock(properties
                    .mapColor(MapColor.DARK_GREEN)
                    .breakInstantly()
                    .sounds(BlockSoundGroup.LILY_PAD)
                    .nonOpaque()
                    .pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block SUNFIRE_LIGHT_LILY = registerBlockWithoutItem("sunfire_light_lily",
            properties -> new LilyPadBlock(properties
                    .mapColor(MapColor.DARK_GREEN)
                    .breakInstantly()
                    .sounds(BlockSoundGroup.LILY_PAD)
                    .nonOpaque()
                    .pistonBehavior(PistonBehavior.DESTROY)));


    public static final Block RACCOON_GRAPES_BUSH = registerBlockWithoutItem("raccoon_grape",
            properties -> new RacoonGrapeBlock(properties
                    .mapColor(MapColor.DARK_GREEN)
                    .ticksRandomly()
                    .noCollision()
                    .sounds(BlockSoundGroup.SWEET_BERRY_BUSH)
                    .pistonBehavior(PistonBehavior.DESTROY)));


    private static Block registerBlock(String name, Function<AbstractBlock.Settings, Block> function) {
        Block toRegister = function.apply(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Flowers.MOD_ID, name))));
        registerBlockItem(name, toRegister);
        return Registry.register(Registries.BLOCK, Identifier.of(Flowers.MOD_ID, name), toRegister);
    }

    private static Block registerBlockWithoutItem(String name, Function<AbstractBlock.Settings, Block> function) {
        return Registry.register(Registries.BLOCK, Identifier.of(Flowers.MOD_ID, name),
                function.apply(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Flowers.MOD_ID, name)))));
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(Flowers.MOD_ID, name),
                new BlockItem(block, new Item.Settings().useBlockPrefixedTranslationKey()
                        .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Flowers.MOD_ID, name)))));
    }
    
    

    public static void registerModBlocks() {
        Flowers.LOGGER.info("Registering Mod Block for " + Flowers.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(entries ->{
            entries.add(ModBlocks.AFRICAN_DAISY);
            entries.add(ModBlocks.ALBUCA_NAMAQUENSIS);
            entries.add(ModBlocks.AUSTRALIAN_CORNFLOWER);
            entries.add(ModBlocks.AUSTRALIAN_FLAME_PEA);
            entries.add(ModBlocks.BABY_BLUE_EYES);
            entries.add(ModBlocks.BABY_BLUE_EYES_SMALL);
            entries.add(ModBlocks.BACHELOR_BUTTON);
            entries.add(ModBlocks.BANEBERRY);
            entries.add(ModBlocks.BEACH_GRASS);
            entries.add(ModBlocks.BEACH_STRAWBERRY);
            entries.add(ModBlocks.BIRDS_EYE_GILIA);
            entries.add(ModBlocks.BLEEDING_HEART);
            entries.add(ModBlocks.BLUE_BACHELOR_BUTTON);
            entries.add(ModBlocks.BLUE_BELL_BACHELOR_BUTTON);
            entries.add(ModBlocks.BLUE_BELL_SWEET_PEAS);
            entries.add(ModBlocks.BLUE_EYED_GRASS);
            entries.add(ModBlocks.BLUE_TINSEL_LILY);
            entries.add(ModBlocks.BORAGE);
            entries.add(ModBlocks.BRIGHT_MAGENTA_SWEET_PEAS);
            entries.add(ModBlocks.BUCKWHEAT);
            entries.add(ModBlocks.BUCKWHEAT_RED);
            entries.add(ModBlocks.CACTUS);
            entries.add(ModBlocks.CALIFORNIA_POPPY);
            entries.add(ModBlocks.CALIFORNIA_SEA_THRIFT);
            entries.add(ModBlocks.CALLA_LILY);
            entries.add(ModBlocks.CAPE_ALOE);
            entries.add(ModBlocks.CHRYSANTHENUM);
            entries.add(ModBlocks.CINQUEFOIL);
            entries.add(ModBlocks.CLOUD_BLUE_CORYDALIS);
            entries.add(ModBlocks.COASTAL_LOTUS);
            entries.add(ModBlocks.COMMELINA);
            entries.add(ModBlocks.COMMON_PERIWINKLE);
            entries.add(ModBlocks.COSMOS);
            entries.add(ModBlocks.COSMOS_MIX);
            entries.add(ModBlocks.CRACKING_RUSSULA);
            entries.add(ModBlocks.CREEPING_THYME);
            entries.add(ModBlocks.CRIMSON_GLADIOLA);
            entries.add(ModBlocks.CRINOLINE_STINKHORN);
            entries.add(ModBlocks.CROCUS_MIX);
            entries.add(ModBlocks.CYAN_HYACINTH);
            entries.add(ModBlocks.DAHLIA);
            entries.add(ModBlocks.DARK_BLUE_BORAGE);
            entries.add(ModBlocks.DARK_BLUE_SWEET_PEAS);
            entries.add(ModBlocks.DARKOSTO_TRAPOSTO);
            entries.add(ModBlocks.DATURA);
            entries.add(ModBlocks.DAY_LILY);
            entries.add(ModBlocks.DESERT_PAINTBRUSH);
            entries.add(ModBlocks.DESERT_SAND_VERBENA);
            entries.add(ModBlocks.DESERT_STURT_PEA);
            entries.add(ModBlocks.DEVILS_CLAW);
            entries.add(ModBlocks.DEVILS_FINGERS);
            entries.add(ModBlocks.DRIED_SUNFLOWER);
            entries.add(ModBlocks.ECHINACEA);
            entries.add(ModBlocks.ENGELMANNS_HEDGEHOG_CACTUS);
            entries.add(ModBlocks.FLOWERING_CURRENT);
            entries.add(ModBlocks.FORGET_ME_NOT);
            entries.add(ModBlocks.FUCHSIA);
            entries.add(ModBlocks.GLADIOLA);
            entries.add(ModBlocks.GLORIOSA_LILY);
            entries.add(ModBlocks.GOLDEN_BEAN);
            entries.add(ModBlocks.GRAPE_HYACINTH);
            entries.add(ModBlocks.HAWTHORNE);
            entries.add(ModBlocks.HIMALAYAN_BLUE_POPPY);
            entries.add(ModBlocks.INKY_CAP);
            entries.add(ModBlocks.IRIS);
            entries.add(ModBlocks.IRIS_FANCY);
            entries.add(ModBlocks.JEWEL_OF_THE_DESERT);
            entries.add(ModBlocks.LADY_SLIPPER_ORCHID);
            entries.add(ModBlocks.LANTANA);
            entries.add(ModBlocks.LARKSPUR);
            entries.add(ModBlocks.LAVENDER_LARKSPUR);
            entries.add(ModBlocks.LEWISIA);
            entries.add(ModBlocks.LIGHT_BLUE_FORGET_ME_NOT);
            entries.add(ModBlocks.LIGHT_BLUE_LOBELIA);
            entries.add(ModBlocks.LIGHT_PINK_GERANIUM);
            entries.add(ModBlocks.LIGHT_PINK_LARKSPUR);
            entries.add(ModBlocks.MAGENTA_CLOVER);
            entries.add(ModBlocks.MAGENTA_LARKSPUR);
            entries.add(ModBlocks.MAGENTA_ORCHID);
            entries.add(ModBlocks.MAGENTA_SWEET_PEAS);
            entries.add(ModBlocks.MAGENTA_ZINNIA);
            entries.add(ModBlocks.MANZANITA_BUSH);
            entries.add(ModBlocks.MAROON_MALLOW);
            entries.add(ModBlocks.MEDIUM_BLUE_LOBELIA);
            entries.add(ModBlocks.MENDOCINO_POPPY);
            entries.add(ModBlocks.MEXICAN_SAGE);
            entries.add(ModBlocks.MIXED_PINK_SWEET_PEAS);
            entries.add(ModBlocks.MIXED_ZINNIA);
            entries.add(ModBlocks.MOJAVE_INDIGO_BUSH);
            entries.add(ModBlocks.MORNING_GLORY);
            entries.add(ModBlocks.NARCISSUS);
            entries.add(ModBlocks.NASTURTIUM);
            entries.add(ModBlocks.NASTURTIUM_PINK);
            entries.add(ModBlocks.NOTCH_LEAF_SCORPION_WEED);
            entries.add(ModBlocks.OCOTILLO);
            entries.add(ModBlocks.ORANGE_AUSTRALIAN_FLAME_PEA);
            entries.add(ModBlocks.ORANGE_COSMOS);
            entries.add(ModBlocks.ORANGE_DAY_LILY);
            entries.add(ModBlocks.ORANGE_FREESIA);
            entries.add(ModBlocks.ORANGE_GLADIOLA);
            entries.add(ModBlocks.ORANGE_LUPIN);
            entries.add(ModBlocks.ORNAMENTAL_CHERRY);
            entries.add(ModBlocks.OWLS_CLOVER);
            entries.add(ModBlocks.PANSY);
            entries.add(ModBlocks.PANSY_PURPLE);
            entries.add(ModBlocks.PARADOX_SUNFLOWER);
            entries.add(ModBlocks.PARODIA_MURICATA);
            entries.add(ModBlocks.PARROT_FLOWER);
            entries.add(ModBlocks.PEACH_GLADIOLA);
            entries.add(ModBlocks.PEPPERMINT);
            entries.add(ModBlocks.PERIWINKLE);
            entries.add(ModBlocks.PINK_CLOVER);
            entries.add(ModBlocks.PINK_DESERT_SAND_VERBENA);
            entries.add(ModBlocks.PINK_GERANIUM);
            entries.add(ModBlocks.PINK_LARKSPUR);
            entries.add(ModBlocks.PINK_PETTICOAT);
            entries.add(ModBlocks.PITCHER_PLANT);
            entries.add(ModBlocks.PURPLE_AFRICAN_DAISY);
            entries.add(ModBlocks.PURPLE_CALLA_LILY);
            entries.add(ModBlocks.PURPLE_CROCUS);
            entries.add(ModBlocks.PURPLE_FLAG);
            entries.add(ModBlocks.PURPLE_LARKSPUR);
            entries.add(ModBlocks.PURPLE_LUPIN);
            entries.add(ModBlocks.PURPLE_MAGENTA_SALVIA);
            entries.add(ModBlocks.PURPLE_SWEET_PEAS);
            entries.add(ModBlocks.QUINCE);
            entries.add(ModBlocks.RED_CLOVER);
            entries.add(ModBlocks.RED_FREESIA);
            entries.add(ModBlocks.RED_GERANIUM);
            entries.add(ModBlocks.RED_POPPY);
            entries.add(ModBlocks.RED_SUNFLOWER);
            entries.add(ModBlocks.ROCK_ROSE);
            entries.add(ModBlocks.ROYAL_BLUE_LOBELIA);
            entries.add(ModBlocks.SALVIA);
            entries.add(ModBlocks.SILVER_CARPET);
            entries.add(ModBlocks.SKYSCRAPER_SUNFLOWER);
            entries.add(ModBlocks.SNAPDRAGON_PINK);
            entries.add(ModBlocks.SNAPDRAGON_WHITE);
            entries.add(ModBlocks.SPROUT);
            entries.add(ModBlocks.STACKED_MORNING_GLORY);
            entries.add(ModBlocks.STACKED_NASTURTIUM);
            entries.add(ModBlocks.STACKED_NASTURTIUM_PINK);
            entries.add(ModBlocks.STICKY_MONKEY);
            entries.add(ModBlocks.STRIPED_ZINNIA);
            entries.add(ModBlocks.SUNDANCE_KID);
            entries.add(ModBlocks.SUNNY_ZINNIA);
            entries.add(ModBlocks.TALL_CACTUS);
            entries.add(ModBlocks.TALL_CALLA_LILY);
            entries.add(ModBlocks.TALL_COSMOS);
            entries.add(ModBlocks.TALL_LUPIN);
            entries.add(ModBlocks.TALL_ORANGE_COSMOS);
            entries.add(ModBlocks.TEDDY_BEAR_SUNFLOWER);
            entries.add(ModBlocks.TUMBLE_WEED);
            entries.add(ModBlocks.VENUS_FLY_TRAP);
            entries.add(ModBlocks.VIOLET);
            entries.add(ModBlocks.VIOLET_WEBCAP);
            entries.add(ModBlocks.VIRGINIA_COWSLIP);
            entries.add(ModBlocks.WHITE_DAFFODIL);
            entries.add(ModBlocks.WHITE_LARKSPUR);
            entries.add(ModBlocks.WHITE_TINSEL);
            entries.add(ModBlocks.WOLFS_BANE);
            entries.add(ModBlocks.WOOLY_THYME);
            entries.add(ModBlocks.YELLOW_COSMOS);
            entries.add(ModBlocks.YELLOW_CROCUS);
            entries.add(ModBlocks.YELLOW_DAFFODIL);
            entries.add(ModBlocks.YELLOW_FREESIA);
            entries.add(ModBlocks.YELLOW_LUPIN);
            entries.add(ModBlocks.YELLOW_PATCHES);
            entries.add(ModBlocks.YELLOW_STARTHISTLE);
            entries.add(ModBlocks.YUCCA_FLOWER);

            entries.add(ModBlocks.WISTERIA_LAVANDER);
            entries.add(ModBlocks.WISTERIA_PURPLE);
            entries.add(ModBlocks.WISTERIA_WHITE);
        });
    }
}
