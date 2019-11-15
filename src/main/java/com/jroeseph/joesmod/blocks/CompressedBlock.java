package com.jroeseph.joesmod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class CompressedBlock extends Block {

    public CompressedBlock(Material material, SoundType sound, int hardness, ToolType tool,
                           int harvestLevel, String registryName) {
        super(Properties.create(material)
                .sound(sound)
                .hardnessAndResistance(hardness)
                .harvestTool(tool)
                .harvestLevel(harvestLevel)
        );
        setRegistryName(registryName);
    }
}
