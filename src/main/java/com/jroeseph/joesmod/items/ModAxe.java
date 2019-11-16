package com.jroeseph.joesmod.items;

import com.jroeseph.joesmod.setup.ModSetup;
import net.minecraft.item.AxeItem;
import net.minecraft.item.IItemTier;

public class ModAxe extends AxeItem {

    public ModAxe(IItemTier tier, int attackDamageIn, float attackSpeedIn, String registryName) {
        super(tier, attackDamageIn, attackSpeedIn, new Properties().group(ModSetup.itemGroup));
        setRegistryName(registryName);
    }

}
