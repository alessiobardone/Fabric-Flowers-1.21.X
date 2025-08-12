package net.brdviii.flowers.block.custom;

import net.minecraft.block.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.WorldView;

public class CloverLilyBlock extends LilyPadBlock {

    public CloverLilyBlock() {
        super(AbstractBlock.Settings.copy(Blocks.LILY_PAD));
    }

    @Override
    public boolean canPlaceAt(BlockState state, WorldView world, BlockPos pos) {
        BlockPos below = pos.down();
        BlockState belowState = world.getBlockState(below);
        return belowState.isOf(Blocks.WATER) &&
                belowState.get(FluidBlock.LEVEL) == 0 &&
                world.isAir(pos);
    }
}
