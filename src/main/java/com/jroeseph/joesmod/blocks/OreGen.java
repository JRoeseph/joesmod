package com.jroeseph.joesmod.blocks;

import net.minecraft.block.Blocks;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biomes;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.feature.ReplaceBlockConfig;
import net.minecraft.world.gen.placement.CountRangeConfig;

import static net.minecraft.world.gen.placement.Placement.COUNT_RANGE;

public class OreGen {
    private static final CountRangeConfig ENDER_COAL_CFG = new CountRangeConfig(120, 10, 0, 70);
    private static final CountRangeConfig LAVA_COAL_CFG = new CountRangeConfig(20, 16, 0, 112);
    private static final int LAVA_COAL_VEINSIZE = 15;
    private static final CountRangeConfig ENDRICITE_CFG = new CountRangeConfig(30, 10, 0, 40);

    public static void setupNetherOreGeneration() {
        Biomes.NETHER.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE,
                new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NETHERRACK, ModBlocks.LAVA_COAL_ORE.getDefaultState(),
                        LAVA_COAL_VEINSIZE), COUNT_RANGE, LAVA_COAL_CFG));
    }

    public static void setupEndOreGeneration() {
        Biomes.THE_END.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.EMERALD_ORE,
                new ReplaceBlockConfig(Blocks.END_STONE.getDefaultState(), ModBlocks.ENDRICITE_ORE.getDefaultState()), COUNT_RANGE, ENDRICITE_CFG));
        Biomes.END_BARRENS.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.EMERALD_ORE,
                new ReplaceBlockConfig(Blocks.END_STONE.getDefaultState(), ModBlocks.ENDRICITE_ORE.getDefaultState()), COUNT_RANGE, ENDRICITE_CFG));
        Biomes.END_HIGHLANDS.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.EMERALD_ORE,
                new ReplaceBlockConfig(Blocks.END_STONE.getDefaultState(), ModBlocks.ENDRICITE_ORE.getDefaultState()), COUNT_RANGE, ENDRICITE_CFG));
        Biomes.END_MIDLANDS.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.EMERALD_ORE,
                new ReplaceBlockConfig(Blocks.END_STONE.getDefaultState(), ModBlocks.ENDRICITE_ORE.getDefaultState()), COUNT_RANGE, ENDRICITE_CFG));
        Biomes.SMALL_END_ISLANDS.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.EMERALD_ORE,
                new ReplaceBlockConfig(Blocks.END_STONE.getDefaultState(), ModBlocks.ENDRICITE_ORE.getDefaultState()), COUNT_RANGE, ENDRICITE_CFG));

        Biomes.THE_END.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.EMERALD_ORE,
                new ReplaceBlockConfig(Blocks.END_STONE.getDefaultState(), ModBlocks.ENDER_COAL_ORE.getDefaultState()), COUNT_RANGE, ENDER_COAL_CFG));
        Biomes.END_BARRENS.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.EMERALD_ORE,
                new ReplaceBlockConfig(Blocks.END_STONE.getDefaultState(), ModBlocks.ENDER_COAL_ORE.getDefaultState()), COUNT_RANGE, ENDER_COAL_CFG));
        Biomes.END_HIGHLANDS.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.EMERALD_ORE,
                new ReplaceBlockConfig(Blocks.END_STONE.getDefaultState(), ModBlocks.ENDER_COAL_ORE.getDefaultState()), COUNT_RANGE, ENDER_COAL_CFG));
        Biomes.END_MIDLANDS.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.EMERALD_ORE,
                new ReplaceBlockConfig(Blocks.END_STONE.getDefaultState(), ModBlocks.ENDER_COAL_ORE.getDefaultState()), COUNT_RANGE, ENDER_COAL_CFG));
        Biomes.SMALL_END_ISLANDS.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.EMERALD_ORE,
                new ReplaceBlockConfig(Blocks.END_STONE.getDefaultState(), ModBlocks.ENDER_COAL_ORE.getDefaultState()), COUNT_RANGE, ENDER_COAL_CFG));
    }
}