package com.jroeseph.joesmod.items;

import com.jroeseph.joesmod.setup.ModSetup;
import net.minecraft.item.Item;

public class Material extends Item {

    public Material(String registryName) {
        super(new Item.Properties()
                .group(ModSetup.itemGroup)
                .maxStackSize(64)
        );
        setRegistryName(registryName);
    }
}
