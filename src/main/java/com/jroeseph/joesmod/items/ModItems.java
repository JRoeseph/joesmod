package com.jroeseph.joesmod.items;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ItemTier;
import net.minecraftforge.registries.ObjectHolder;

public class ModItems {

    @ObjectHolder("joesmod:obsidian_gold_mesh")
    public static Material OBSIDIAN_GOLD_MESH = new Material("obsidian_gold_mesh");

    @ObjectHolder("joesmod:obsidian_ingot")
    public static Material OBSIDIAN_INGOT = new Material("obsidian_ingot");

    @ObjectHolder("joesmod:obsidian_pickaxe")
    public static ModPickaxe OBSIDIAN_PICKAXE = new ModPickaxe(ModItemTier.OBSIDIAN, 1, (float)-2.8, "obsidian_pickaxe");

    @ObjectHolder("joesmod:obsidian_axe")
    public static ModAxe OBSIDIAN_AXE = new ModAxe(ModItemTier.OBSIDIAN, 5, (float)-3, "obsidian_axe");

    @ObjectHolder("joesmod:obsidian_shovel")
    public static ModShovel OBSIDIAN_SHOVEL = new ModShovel(ModItemTier.OBSIDIAN, 2, (float)-3, "obsidian_shovel");

    @ObjectHolder("joesmod:obsidian_sword")
    public static ModSword OBSIDIAN_SWORD = new ModSword(ModItemTier.OBSIDIAN, 3, (float)-2.4, "obsidian_sword");

    @ObjectHolder("joesmod:obsidian_hoe")
    public static ModHoe OBSIDIAN_HOE = new ModHoe(ModItemTier.OBSIDIAN, 1, "obsidian_hoe");

    @ObjectHolder("joesmod:obsidian_boots")
    public static ModArmor OBSIDIAN_BOOTS = new ModArmor(ModArmorMaterial.OBSIDIAN, EquipmentSlotType.FEET, "obsidian_boots");

    @ObjectHolder("joesmod:obsidian_leggings")
    public static ModArmor OBSIDIAN_LEGGINGS = new ModArmor(ModArmorMaterial.OBSIDIAN, EquipmentSlotType.LEGS, "obsidian_leggings");

    @ObjectHolder("joesmod:obsidian_chestplate")
    public static ModArmor OBSIDIAN_CHESTPLATE = new ModArmor(ModArmorMaterial.OBSIDIAN, EquipmentSlotType.CHEST, "obsidian_chestplate");

    @ObjectHolder("joesmod:obsidian_helmet")
    public static ModArmor OBSIDIAN_HELMET = new ModArmor(ModArmorMaterial.OBSIDIAN, EquipmentSlotType.HEAD, "obsidian_helmet");

    @ObjectHolder("joesmod:lava_coal")
    public static FuelItem LAVA_COAL = new FuelItem("lava_coal", 3200);

    @ObjectHolder("joesmod:lava_coal_chunk")
    public static FuelItem LAVA_COAL_CHUNK = new FuelItem("lava_coal_chunk", 400);

    @ObjectHolder("joesmod:ender_coal")
    public static FuelItem ENDER_COAL = new FuelItem("ender_coal", 6400);

    @ObjectHolder("joesmod:ender_coal_chunk")
    public static FuelItem ENDER_COAL_CHUNK = new FuelItem("ender_coal_chunk", 800);

    @ObjectHolder("joesmod:coal_chunk")
    public static FuelItem COAL_CHUNK = new FuelItem("coal_chunk", 200);

    @ObjectHolder("joesmod:charcoal_chunk")
    public static FuelItem CHARCOAL_CHUNK = new FuelItem("charcoal_chunk", 200);

    @ObjectHolder("joesmod:obsidian_horse_armor")
    public static ModHorseArmor OBSIDIAN_HORSE_ARMOR = new ModHorseArmor("obsidian_horse_armor", 14);

    @ObjectHolder("joesmod:endricite")
    public static Material ENDRICITE = new Material("endricite");

    @ObjectHolder("joesmod:endricite_pickaxe")
    public static ModPickaxe ENDRICITE_PICKAXE = new ModPickaxe(ModItemTier.ENDRICITE, 1, (float)-2.8, "endricite_pickaxe");

    @ObjectHolder("joesmod:endricite_axe")
    public static ModAxe ENDRICITE_AXE = new ModAxe(ModItemTier.ENDRICITE, 5, (float)-3, "endricite_axe");

    @ObjectHolder("joesmod:endricite_shovel")
    public static ModShovel ENDRICITE_SHOVEL = new ModShovel(ModItemTier.ENDRICITE, 2, (float)-3, "endricite_shovel");

    @ObjectHolder("joesmod:endricite_sword")
    public static ModShovel ENDRICITE_SWORD = new ModShovel(ModItemTier.ENDRICITE, 3, (float)-2.4, "endricite_sword");

    @ObjectHolder("joesmod:endricite_hoe")
    public static ModHoe ENDRICITE_HOE = new ModHoe(ModItemTier.ENDRICITE, 2, "endricite_hoe");

    @ObjectHolder("joesmod:endricite_boots")
    public static ModArmor ENDRICITE_BOOTS = new ModArmor(ModArmorMaterial.ENDRICITE, EquipmentSlotType.FEET, "endricite_boots");

    @ObjectHolder("joesmod:endricite_leggings")
    public static ModArmor ENDRICITE_LEGGINGS = new ModArmor(ModArmorMaterial.ENDRICITE, EquipmentSlotType.LEGS, "endricite_leggings");

    @ObjectHolder("joesmod:endricite_chestplate")
    public static ModArmor ENDRICITE_CHESTPLATE = new ModArmor(ModArmorMaterial.ENDRICITE, EquipmentSlotType.CHEST, "endricite_chestplate");

    @ObjectHolder("joesmod:endricite_helmet")
    public static ModArmor ENDRICITE_HELMET = new ModArmor(ModArmorMaterial.ENDRICITE, EquipmentSlotType.HEAD, "endricite_helmet");

    @ObjectHolder("joesmod:endricite_horse_armor")
    public static ModHorseArmor ENDRICITE_HORSE_ARMOR = new ModHorseArmor("endricite_horse_armor", 17);

    @ObjectHolder("joesmod:iron_thiccaxe")
    public static ModThiccaxe IRON_THICCAXE = new ModThiccaxe("iron_thiccaxe", ItemTier.IRON, 2, (float)-3.5);

    @ObjectHolder("joesmod:gold_thiccaxe")
    public static ModThiccaxe GOLD_THICCAXE = new ModThiccaxe("gold_thiccaxe", ItemTier.GOLD, 3, (float)-3.5);

    @ObjectHolder("joesmod:diamond_thiccaxe")
    public static ModThiccaxe DIAMOND_THICCAXE = new ModThiccaxe("diamond_thiccaxe", ItemTier.DIAMOND, 4, (float)-3.5);

    @ObjectHolder("joesmod:endricite_thiccaxe")
    public static ModThiccaxe ENDRICITE_THICCAXE = new ModThiccaxe("endricite_thiccaxe", ModItemTier.ENDRICITE, 6, (float)-3.5);

    @ObjectHolder("joesmod:obsidian_thiccaxe")
    public static ModThiccaxe OBSIDIAN_THICCAXE = new ModThiccaxe("obsidian_thiccaxe", ModItemTier.OBSIDIAN, 5, (float)-3.5);

    @ObjectHolder("joesmod:stone_thiccaxe")
    public static ModThiccaxe STONE_THICCAXE = new ModThiccaxe("stone_thiccaxe", ItemTier.STONE, 1, (float)-3.5);
}
