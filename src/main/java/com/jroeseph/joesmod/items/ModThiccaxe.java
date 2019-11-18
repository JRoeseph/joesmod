package com.jroeseph.joesmod.items;


import com.google.common.collect.ImmutableSet;
import com.jroeseph.joesmod.blocks.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.RayTraceContext;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;

import java.util.Set;
import java.util.TreeSet;

public class ModThiccaxe extends ModPickaxe {

    private static final Set<Block> EFFECTIVE_ON = ImmutableSet.of(Blocks.ACTIVATOR_RAIL, Blocks.COAL_ORE, Blocks.COBBLESTONE, Blocks.DETECTOR_RAIL, Blocks.DIAMOND_BLOCK, Blocks.DIAMOND_ORE, Blocks.POWERED_RAIL, Blocks.GOLD_BLOCK, Blocks.GOLD_ORE, Blocks.ICE, Blocks.IRON_BLOCK, Blocks.IRON_ORE, Blocks.LAPIS_BLOCK, Blocks.LAPIS_ORE, Blocks.MOSSY_COBBLESTONE, Blocks.NETHERRACK, Blocks.PACKED_ICE, Blocks.BLUE_ICE, Blocks.RAIL, Blocks.REDSTONE_ORE, Blocks.SANDSTONE, Blocks.CHISELED_SANDSTONE, Blocks.CUT_SANDSTONE, Blocks.CHISELED_RED_SANDSTONE, Blocks.CUT_RED_SANDSTONE, Blocks.RED_SANDSTONE, Blocks.STONE, Blocks.GRANITE, Blocks.POLISHED_GRANITE, Blocks.DIORITE, Blocks.POLISHED_DIORITE, Blocks.ANDESITE, Blocks.POLISHED_ANDESITE, Blocks.STONE_SLAB, Blocks.SMOOTH_STONE_SLAB, Blocks.SANDSTONE_SLAB, Blocks.PETRIFIED_OAK_SLAB, Blocks.COBBLESTONE_SLAB, Blocks.BRICK_SLAB, Blocks.STONE_BRICK_SLAB, Blocks.NETHER_BRICK_SLAB, Blocks.QUARTZ_SLAB, Blocks.RED_SANDSTONE_SLAB, Blocks.PURPUR_SLAB, Blocks.SMOOTH_QUARTZ, Blocks.SMOOTH_RED_SANDSTONE, Blocks.SMOOTH_SANDSTONE, Blocks.SMOOTH_STONE, Blocks.STONE_BUTTON, Blocks.STONE_PRESSURE_PLATE, Blocks.POLISHED_GRANITE_SLAB, Blocks.SMOOTH_RED_SANDSTONE_SLAB, Blocks.MOSSY_STONE_BRICK_SLAB, Blocks.POLISHED_DIORITE_SLAB, Blocks.MOSSY_COBBLESTONE_SLAB, Blocks.END_STONE_BRICK_SLAB, Blocks.SMOOTH_SANDSTONE_SLAB, Blocks.SMOOTH_QUARTZ_SLAB, Blocks.GRANITE_SLAB, Blocks.ANDESITE_SLAB, Blocks.RED_NETHER_BRICK_SLAB, Blocks.POLISHED_ANDESITE_SLAB, Blocks.DIORITE_SLAB, Blocks.SHULKER_BOX, Blocks.BLACK_SHULKER_BOX, Blocks.BLUE_SHULKER_BOX, Blocks.BROWN_SHULKER_BOX, Blocks.CYAN_SHULKER_BOX, Blocks.GRAY_SHULKER_BOX, Blocks.GREEN_SHULKER_BOX, Blocks.LIGHT_BLUE_SHULKER_BOX, Blocks.LIGHT_GRAY_SHULKER_BOX, Blocks.LIME_SHULKER_BOX, Blocks.MAGENTA_SHULKER_BOX, Blocks.ORANGE_SHULKER_BOX, Blocks.PINK_SHULKER_BOX, Blocks.PURPLE_SHULKER_BOX, Blocks.RED_SHULKER_BOX, Blocks.WHITE_SHULKER_BOX, Blocks.YELLOW_SHULKER_BOX, Blocks.END_STONE, ModBlocks.ENDER_COAL_BLOCK, ModBlocks.ENDER_COAL_ORE, ModBlocks.ENDRICITE_ORE, ModBlocks.LAVA_COAL_ORE, ModBlocks.ENDRICITE_BLOCK, ModBlocks.LAVA_COAL_BLOCK, ModBlocks.CHARCOAL_BLOCK, ModBlocks.OBSIDIAN_INGOT_BLOCK, ModBlocks.COMPRESSED_COBBLESTONE_X1, ModBlocks.COMPRESSED_COBBLESTONE_X2, ModBlocks.COMPRESSED_COBBLESTONE_X3, ModBlocks.COMPRESSED_COBBLESTONE_X4, ModBlocks.COMPRESSED_COBBLESTONE_X5, ModBlocks.COMPRESSED_COBBLESTONE_X6, ModBlocks.COMPRESSED_COBBLESTONE_X7, ModBlocks.COMPRESSED_COBBLESTONE_X8, Blocks.OBSIDIAN);

    public ModThiccaxe (String registryName, IItemTier tier, int attackDamageIn, float attackSpeedIn) {
        super (tier, attackDamageIn, attackSpeedIn, registryName);
    }


    @Override
    public boolean onBlockDestroyed(ItemStack stack, World worldIn, BlockState state, BlockPos pos, LivingEntity entityLiving)
    {
        if (!worldIn.isRemote && (double)state.getBlockHardness(worldIn, pos) != 0.0D)
        {
            stack.damageItem(1, entityLiving, (p_220038_0_) -> {
                p_220038_0_.sendBreakAnimation(EquipmentSlotType.MAINHAND);
            });
        }

        RayTraceResult traceResult = VectorHelper.getLookingAt((PlayerEntity) entityLiving, RayTraceContext.FluidMode.NONE);
        Direction sideHit = ((BlockRayTraceResult) traceResult).getFace();

        Set<BlockPos> blocks = new TreeSet<>();
        switch (sideHit) {
            case NORTH:
            case SOUTH:
                for (int i = -1; i <= 1; i++) {
                    for (int j = -1; j <= 1; j++) {
                        if (i != 0 || j != 0) {
                            blocks.add(new BlockPos(pos.getX() + i,pos.getY() + j,pos.getZ()));
                        }
                    }
                }
                break;
            case EAST:
            case WEST:
                for (int i = -1; i <= 1; i++) {
                    for (int j = -1; j <= 1; j++) {
                        if (i != 0 || j != 0) {
                            blocks.add(new BlockPos(pos.getX(),pos.getY() + j,pos.getZ() + i));
                        }
                    }
                }
                break;
            case UP:
            case DOWN:
                for (int i = -1; i <= 1; i++) {
                    for (int j = -1; j <= 1; j++) {
                        if (i != 0 || j != 0) {
                            blocks.add(new BlockPos(pos.getX() + i,pos.getY(),pos.getZ() + j));
                        }
                    }
                }
                break;
        }

        for (BlockPos block : blocks) {
            if (EFFECTIVE_ON.contains(worldIn.getBlockState(block).getBlock())) {
                System.out.println("RUNS AND " + this.canHarvestBlock(worldIn.getBlockState(block)));
                if (this.canHarvestBlock(worldIn.getBlockState(block))) {
                    worldIn.destroyBlock(block, true);
                }
            }
        }
        return true;
    }
}