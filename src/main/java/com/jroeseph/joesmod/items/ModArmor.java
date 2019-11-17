package com.jroeseph.joesmod.items;

import com.jroeseph.joesmod.setup.ModSetup;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.Item;

public class ModArmor extends ArmorItem {

    public ModArmor(IArmorMaterial materialIn, EquipmentSlotType slot, String registryName) {
        super(materialIn, slot, new Item.Properties().group(ModSetup.itemGroup));
        setRegistryName(registryName);
    }
}
