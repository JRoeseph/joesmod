package com.jroeseph.joesmod.blocks;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber
public class BlockFuelHandler {
    @SubscribeEvent
    public static void onEvent(FurnaceFuelBurnTimeEvent event) {
        ItemStack fuel = event.getItemStack();

        if (fuel.isEmpty()){
            return;
        }

        Item item = fuel.getItem();

        if(item.equals(BlockItem.BLOCK_TO_ITEM.get(ModBlocks.LAVA_COAL_BLOCK))) {
            event.setBurnTime(28800);
        } else if(item.equals(BlockItem.BLOCK_TO_ITEM.get(ModBlocks.ENDER_COAL_BLOCK))) {
            event.setBurnTime(57600);
        } else if(item.equals(BlockItem.BLOCK_TO_ITEM.get(ModBlocks.CHARCOAL_BLOCK))) {
            event.setBurnTime(14400);
        }
    }
}
