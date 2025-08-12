package net.brdviii.flowers.item.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.FluidBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class CloverLilyBlockItem extends BlockItem {
    public CloverLilyBlockItem(Block block, Settings settings) {
        super(block, settings);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        World world = context.getWorld();
        BlockPos clickedPos = context.getBlockPos();
        BlockPos placePos = clickedPos.up(); // vogliamo piazzare sopra il blocco cliccato

        BlockState stateBelow = world.getBlockState(clickedPos);

        if (stateBelow.isOf(Blocks.WATER) &&
                stateBelow.get(FluidBlock.LEVEL) == 0 &&
                world.isAir(placePos)) {

            if (!world.isClient) {
                world.setBlockState(placePos, getBlock().getDefaultState());
                if (context.getPlayer() != null && !context.getPlayer().getAbilities().creativeMode) {
                    context.getStack().decrement(1);
                }
            }
            return ActionResult.SUCCESS;
        }

        return ActionResult.FAIL;
    }
}
