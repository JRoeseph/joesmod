package com.jroeseph.joesmod.setup;

import com.jroeseph.joesmod.blocks.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModSetup {

    public static ItemGroup itemGroup = new ItemGroup("joesmod") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModBlocks.COMPRESSED_COBBLESTONE_X1);
        }
    };

    public void init() {

    }
}
