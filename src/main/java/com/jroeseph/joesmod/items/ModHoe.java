package com.jroeseph.joesmod.items;

import com.jroeseph.joesmod.setup.ModSetup;
import net.minecraft.item.HoeItem;
import net.minecraft.item.IItemTier;

public class ModHoe extends HoeItem {

    public ModHoe(IItemTier tier, float attackSpeedIn, String registryName) {
        super(tier, attackSpeedIn, new Properties().group(ModSetup.itemGroup));
        setRegistryName(registryName);
    }

}
