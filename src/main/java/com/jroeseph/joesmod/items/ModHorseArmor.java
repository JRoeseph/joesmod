package com.jroeseph.joesmod.items;

import com.jroeseph.joesmod.setup.ModSetup;
import net.minecraft.item.HorseArmorItem;
import net.minecraft.item.Item;

public class ModHorseArmor extends HorseArmorItem {

    public ModHorseArmor(String registryName, int armorLevel){
        super(armorLevel, registryName, new Item.Properties()
                .group(ModSetup.itemGroup)
        );
        setRegistryName(registryName);
    }
}
