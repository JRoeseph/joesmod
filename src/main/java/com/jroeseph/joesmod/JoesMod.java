package com.jroeseph.joesmod;

import com.jroeseph.joesmod.blocks.FuelBlock;
import com.jroeseph.joesmod.blocks.MaterialBlock;
import com.jroeseph.joesmod.blocks.ModBlocks;
import com.jroeseph.joesmod.blocks.OreGen;
import com.jroeseph.joesmod.items.ModItems;
import com.jroeseph.joesmod.setup.ClientProxy;
import com.jroeseph.joesmod.setup.IProxy;
import com.jroeseph.joesmod.setup.ModSetup;
import com.jroeseph.joesmod.setup.ServerProxy;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("joesmod")
public class JoesMod {

    public static IProxy proxy = DistExecutor.runForDist(() -> () -> new ClientProxy(), () -> () -> new ServerProxy());

    public static ModSetup setup = new ModSetup();

    private static final Logger LOGGER = LogManager.getLogger();

    public JoesMod() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {
        setup.init();
        proxy.getClientWorld();
        OreGen.setupNetherOreGeneration();
        OreGen.setupEndOreGeneration();
    }

    @Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents {
        @SubscribeEvent
        public static void onBlocksRegistry(final RegistryEvent.Register<Block> event) {
            event.getRegistry().register(new MaterialBlock(Material.IRON, SoundType.STONE, 4,
                    ToolType.PICKAXE, 0, "compressed_cobblestone_x1"));
            event.getRegistry().register(new MaterialBlock(Material.IRON, SoundType.STONE, 6,
                    ToolType.PICKAXE, 0, "compressed_cobblestone_x2"));
            event.getRegistry().register(new MaterialBlock(Material.IRON, SoundType.STONE, 8,
                    ToolType.PICKAXE, 1, "compressed_cobblestone_x3"));
            event.getRegistry().register(new MaterialBlock(Material.IRON, SoundType.STONE, 12,
                    ToolType.PICKAXE, 1, "compressed_cobblestone_x4"));
            event.getRegistry().register(new MaterialBlock(Material.IRON, SoundType.STONE, 15,
                    ToolType.PICKAXE, 2, "compressed_cobblestone_x5"));
            event.getRegistry().register(new MaterialBlock(Material.IRON, SoundType.STONE, 20,
                    ToolType.PICKAXE, 2, "compressed_cobblestone_x6"));
            event.getRegistry().register(new MaterialBlock(Material.IRON, SoundType.STONE, 25,
                    ToolType.PICKAXE, 3, "compressed_cobblestone_x7"));
            event.getRegistry().register(new MaterialBlock(Material.IRON, SoundType.STONE, 30,
                    ToolType.PICKAXE, 3, "compressed_cobblestone_x8"));
            event.getRegistry().register(new MaterialBlock(Material.IRON, SoundType.METAL, 8,
                    ToolType.PICKAXE, 3, "obsidian_ingot_block"));
            event.getRegistry().register(new FuelBlock(Material.IRON, SoundType.STONE, 8,
                    ToolType.PICKAXE, 3, 288000,"lava_coal_block"));
            event.getRegistry().register(new MaterialBlock(Material.IRON, SoundType.STONE, 8,
                    ToolType.PICKAXE, 3, "ender_coal_block"));
            event.getRegistry().register(new MaterialBlock(Material.IRON, SoundType.STONE, 8,
                    ToolType.PICKAXE, 3, "charcoal_block"));
            event.getRegistry().register(new MaterialBlock(Material.IRON, SoundType.METAL, 9,
                    ToolType.PICKAXE, 4, "endricite_block"));
            event.getRegistry().register(new MaterialBlock(Material.IRON, SoundType.STONE, 10,
                    ToolType.PICKAXE, 4, "endricite_ore"));
            event.getRegistry().register(new MaterialBlock(Material.IRON, SoundType.STONE, 6,
                    ToolType.PICKAXE, 3, "lava_coal_ore"));
            event.getRegistry().register(new MaterialBlock(Material.IRON, SoundType.STONE, 8,
                    ToolType.PICKAXE, 4, "ender_coal_ore"));
        }

        @SubscribeEvent
        public static void onItemsRegistry(final RegistryEvent.Register<Item> event) {
            Item.Properties properties = new Item.Properties().group(setup.itemGroup);

            event.getRegistry().register(new BlockItem(ModBlocks.COMPRESSED_COBBLESTONE_X1, properties).setRegistryName("compressed_cobblestone_x1"));
            event.getRegistry().register(new BlockItem(ModBlocks.COMPRESSED_COBBLESTONE_X2, properties).setRegistryName("compressed_cobblestone_x2"));
            event.getRegistry().register(new BlockItem(ModBlocks.COMPRESSED_COBBLESTONE_X3, properties).setRegistryName("compressed_cobblestone_x3"));
            event.getRegistry().register(new BlockItem(ModBlocks.COMPRESSED_COBBLESTONE_X4, properties).setRegistryName("compressed_cobblestone_x4"));
            event.getRegistry().register(new BlockItem(ModBlocks.COMPRESSED_COBBLESTONE_X5, properties).setRegistryName("compressed_cobblestone_x5"));
            event.getRegistry().register(new BlockItem(ModBlocks.COMPRESSED_COBBLESTONE_X6, properties).setRegistryName("compressed_cobblestone_x6"));
            event.getRegistry().register(new BlockItem(ModBlocks.COMPRESSED_COBBLESTONE_X7, properties).setRegistryName("compressed_cobblestone_x7"));
            event.getRegistry().register(new BlockItem(ModBlocks.COMPRESSED_COBBLESTONE_X8, properties).setRegistryName("compressed_cobblestone_x8"));
            event.getRegistry().register(new BlockItem(ModBlocks.OBSIDIAN_INGOT_BLOCK, properties).setRegistryName("obsidian_ingot_block"));
            event.getRegistry().register(new BlockItem(ModBlocks.LAVA_COAL_BLOCK, properties).setRegistryName("lava_coal_block"));
            event.getRegistry().register(new BlockItem(ModBlocks.ENDER_COAL_BLOCK, properties).setRegistryName("ender_coal_block"));
            event.getRegistry().register(new BlockItem(ModBlocks.CHARCOAL_BLOCK, properties).setRegistryName("charcoal_block"));
            event.getRegistry().register(new BlockItem(ModBlocks.ENDRICITE_BLOCK, properties).setRegistryName("endricite_block"));
            event.getRegistry().register(new BlockItem(ModBlocks.ENDRICITE_ORE, properties).setRegistryName("endricite_ore"));
            event.getRegistry().register(new BlockItem(ModBlocks.ENDER_COAL_ORE, properties).setRegistryName("ender_coal_ore"));
            event.getRegistry().register(new BlockItem(ModBlocks.LAVA_COAL_ORE, properties).setRegistryName("lava_coal_ore"));

            event.getRegistry().register(ModItems.OBSIDIAN_GOLD_MESH);
            event.getRegistry().register(ModItems.OBSIDIAN_INGOT);
            event.getRegistry().register(ModItems.OBSIDIAN_PICKAXE);
            event.getRegistry().register(ModItems.OBSIDIAN_AXE);
            event.getRegistry().register(ModItems.OBSIDIAN_SHOVEL);
            event.getRegistry().register(ModItems.OBSIDIAN_SWORD);
            event.getRegistry().register(ModItems.OBSIDIAN_HOE);
            event.getRegistry().register(ModItems.OBSIDIAN_BOOTS);
            event.getRegistry().register(ModItems.OBSIDIAN_LEGGINGS);
            event.getRegistry().register(ModItems.OBSIDIAN_CHESTPLATE);
            event.getRegistry().register(ModItems.OBSIDIAN_HELMET);
            event.getRegistry().register(ModItems.LAVA_COAL);
            event.getRegistry().register(ModItems.LAVA_COAL_CHUNK);
            event.getRegistry().register(ModItems.ENDER_COAL);
            event.getRegistry().register(ModItems.ENDER_COAL_CHUNK);
            event.getRegistry().register(ModItems.COAL_CHUNK);
            event.getRegistry().register(ModItems.CHARCOAL_CHUNK);
            event.getRegistry().register(ModItems.OBSIDIAN_HORSE_ARMOR);
            event.getRegistry().register(ModItems.ENDRICITE);
            event.getRegistry().register(ModItems.ENDRICITE_PICKAXE);
            event.getRegistry().register(ModItems.ENDRICITE_AXE);
            event.getRegistry().register(ModItems.ENDRICITE_SHOVEL);
            event.getRegistry().register(ModItems.ENDRICITE_SWORD);
            event.getRegistry().register(ModItems.ENDRICITE_HOE);
            event.getRegistry().register(ModItems.ENDRICITE_BOOTS);
            event.getRegistry().register(ModItems.ENDRICITE_LEGGINGS);
            event.getRegistry().register(ModItems.ENDRICITE_CHESTPLATE);
            event.getRegistry().register(ModItems.ENDRICITE_HELMET);
            event.getRegistry().register(ModItems.ENDRICITE_HORSE_ARMOR);
            event.getRegistry().register(ModItems.IRON_THICCAXE);
            event.getRegistry().register(ModItems.ENDRICITE_THICCAXE);
            event.getRegistry().register(ModItems.OBSIDIAN_THICCAXE);
            event.getRegistry().register(ModItems.GOLD_THICCAXE);
            event.getRegistry().register(ModItems.DIAMOND_THICCAXE);
            event.getRegistry().register(ModItems.STONE_THICCAXE);
        }
    }
}
