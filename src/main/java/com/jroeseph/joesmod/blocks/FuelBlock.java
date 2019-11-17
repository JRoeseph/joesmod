package com.jroeseph.joesmod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class FuelBlock extends Block {

    private int burnTime;

    public FuelBlock(Material material, SoundType sound, int hardness, ToolType tool,
                     int harvestLevel, int burnTime, String registryName) {
        super(Properties.create(material)
                .sound(sound)
                .hardnessAndResistance(hardness)
                .harvestTool(tool)
                .harvestLevel(harvestLevel)
        );
        this.burnTime = burnTime;
        setRegistryName(registryName);
    }


}
