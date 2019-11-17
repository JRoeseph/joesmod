package com.jroeseph.joesmod.items;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraftforge.registries.ObjectHolder;

public class ModItems {

    @ObjectHolder("joesmod:obsidian_gold_mesh")
    public static Material OBSIDIAN_GOLD_MESH = new Material("obsidian_gold_mesh");

    @ObjectHolder("joesmod:obsidian_ingot")
    public static Material OBSIDIAN_INGOT = new Material("obsidian_ingot");

    @ObjectHolder("joesmod:obsidian_pickaxe")
    public static ModPickaxe OBSIDIAN_PICKAXE = new ModPickaxe(ModItemTier.OBSIDIAN, 1, (float)-2.8, "obsidian_pickaxe");

    @ObjectHolder("joesmod:obsidian_axe")
    public static ModPickaxe OBSIDIAN_AXE = new ModPickaxe(ModItemTier.OBSIDIAN, 5, (float)-3, "obsidian_axe");

    @ObjectHolder("joesmod:obsidian_shovel")
    public static ModPickaxe OBSIDIAN_SHOVEL = new ModPickaxe(ModItemTier.OBSIDIAN, 2, (float)-3, "obsidian_shovel");

    @ObjectHolder("joesmod:obsidian_sword")
    public static ModPickaxe OBSIDIAN_SWORD = new ModPickaxe(ModItemTier.OBSIDIAN, 3, (float)-2.4, "obsidian_sword");

    @ObjectHolder("joesmod:obsidian_hoe")
    public static ModPickaxe OBSIDIAN_HOE = new ModPickaxe(ModItemTier.OBSIDIAN, -3, (float)1, "obsidian_hoe");

    @ObjectHolder("joesmod:obsidian_boots")
    public static ModArmor OBSIDIAN_BOOTS = new ModArmor(ModArmorMaterial.OBSIDIAN, EquipmentSlotType.FEET, "obsidian_boots");

    @ObjectHolder("joesmod:obsidian_leggings")
    public static ModArmor OBSIDIAN_LEGGINGS = new ModArmor(ModArmorMaterial.OBSIDIAN, EquipmentSlotType.LEGS, "obsidian_leggings");

    @ObjectHolder("joesmod:obsidian_chestplate")
    public static ModArmor OBSIDIAN_CHESTPLATE = new ModArmor(ModArmorMaterial.OBSIDIAN, EquipmentSlotType.CHEST, "obsidian_chestplate");

    @ObjectHolder("joesmod:obsidian_helmet")
    public static ModArmor OBSIDIAN_HELMET = new ModArmor(ModArmorMaterial.OBSIDIAN, EquipmentSlotType.HEAD, "obsidian_helmet");
}
