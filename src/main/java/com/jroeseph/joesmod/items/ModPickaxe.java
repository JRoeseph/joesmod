package com.jroeseph.joesmod.items;

import com.jroeseph.joesmod.setup.ModSetup;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.PickaxeItem;

public class ModPickaxe extends PickaxeItem {

    public ModPickaxe(IItemTier tier, int attackDamageIn, float attackSpeedIn, String registryName) {
        super(tier, attackDamageIn, attackSpeedIn, new Item.Properties().group(ModSetup.itemGroup));
        setRegistryName(registryName);
    }

}
