package com.jroeseph.joesmod;

import com.jroeseph.joesmod.blocks.CompressedBlock;
import com.jroeseph.joesmod.blocks.ModBlocks;
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
    }

    @Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents {
        @SubscribeEvent
        public static void onBlocksRegistry(final RegistryEvent.Register<Block> event) {
            event.getRegistry().register(new CompressedBlock(Material.IRON, SoundType.STONE, 4,
                    ToolType.PICKAXE, 0, "compressed_cobblestone_x1"));
            event.getRegistry().register(new CompressedBlock(Material.IRON, SoundType.STONE, 6,
                    ToolType.PICKAXE, 0, "compressed_cobblestone_x2"));
            event.getRegistry().register(new CompressedBlock(Material.IRON, SoundType.STONE, 8,
                    ToolType.PICKAXE, 1, "compressed_cobblestone_x3"));
            event.getRegistry().register(new CompressedBlock(Material.IRON, SoundType.STONE, 12,
                    ToolType.PICKAXE, 1, "compressed_cobblestone_x4"));
            event.getRegistry().register(new CompressedBlock(Material.IRON, SoundType.STONE, 15,
                    ToolType.PICKAXE, 2, "compressed_cobblestone_x5"));
            event.getRegistry().register(new CompressedBlock(Material.IRON, SoundType.STONE, 20,
                    ToolType.PICKAXE, 2, "compressed_cobblestone_x6"));
            event.getRegistry().register(new CompressedBlock(Material.IRON, SoundType.STONE, 25,
                    ToolType.PICKAXE, 3, "compressed_cobblestone_x7"));
            event.getRegistry().register(new CompressedBlock(Material.IRON, SoundType.STONE, 30,
                    ToolType.PICKAXE, 3, "compressed_cobblestone_x8"));
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
        }
    }
}
