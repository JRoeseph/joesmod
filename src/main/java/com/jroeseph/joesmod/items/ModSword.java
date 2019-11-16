package com.jroeseph.joesmod.items;

import com.jroeseph.joesmod.setup.ModSetup;
import net.minecraft.item.IItemTier;
import net.minecraft.item.SwordItem;

public class ModSword extends SwordItem {

    public ModSword(IItemTier tier, int attackDamageIn, float attackSpeedIn, String registryName) {
        super(tier, attackDamageIn, attackSpeedIn, new Properties().group(ModSetup.itemGroup));
        setRegistryName(registryName);
    }

}
