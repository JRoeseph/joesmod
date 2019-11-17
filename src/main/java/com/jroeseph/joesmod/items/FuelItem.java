package com.jroeseph.joesmod.items;

import com.jroeseph.joesmod.setup.ModSetup;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class FuelItem extends Item {

    private int burnTime;

    public FuelItem(String registryName, int burnTime) {
        super(new Item.Properties()
                .group(ModSetup.itemGroup)
                .maxStackSize(64)
        );
        this.burnTime = burnTime;
        setRegistryName(registryName);
    }

    @Override
    public int getBurnTime(ItemStack itemStack) {
        return burnTime;
    }

    //Used by FuelBlock to add the blocks burn time
    public void setBurnTime(int burnTime) {
        this.burnTime = burnTime;
    }
}
