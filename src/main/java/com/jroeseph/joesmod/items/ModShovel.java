package com.jroeseph.joesmod.items;

import com.jroeseph.joesmod.setup.ModSetup;
import net.minecraft.item.IItemTier;
import net.minecraft.item.ShovelItem;

public class ModShovel extends ShovelItem {

    public ModShovel(IItemTier tier, int attackDamageIn, float attackSpeedIn, String registryName) {
        super(tier, attackDamageIn, attackSpeedIn, new Properties().group(ModSetup.itemGroup));
        setRegistryName(registryName);
    }

}
