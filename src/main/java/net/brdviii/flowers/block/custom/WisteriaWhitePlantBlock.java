package net.brdviii.flowers.block.custom;

import net.brdviii.flowers.block.ModBlocks;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;

public class WisteriaWhitePlantBlock extends Block {
    public WisteriaWhitePlantBlock(AbstractBlock.Settings settings) {
        super(settings);
    }

    @Override
    public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        BlockPos below = pos.down();
        if (world.isAir(below)) {
            world.setBlockState(below, ModBlocks.WISTERIA_WHITE_PLANT.getDefaultState());
        }
    }

    @Override
    public void onStateReplaced(BlockState state, World world, BlockPos pos, BlockState newState, boolean moved) {
        if (!state.isOf(newState.getBlock())) {

            BlockPos abovePos = pos.up();
            BlockState aboveState = world.getBlockState(abovePos);

            if (aboveState.isOf(ModBlocks.WISTERIA_WHITE_PLANT)) {
                world.setBlockState(abovePos, ModBlocks.WISTERIA_WHITE.getDefaultState(), 3);
            }


            BlockPos currentPos = pos.down();
            while (true) {
                BlockState belowState = world.getBlockState(currentPos);
                if (belowState.isOf(ModBlocks.WISTERIA_WHITE_PLANT) || belowState.isOf(ModBlocks.WISTERIA_WHITE)) {
                    world.removeBlock(currentPos, false);
                    currentPos = currentPos.down();
                } else {
                    break;
                }
            }
        }

        super.onStateReplaced(state, world, pos, newState, moved);
    }

    @Override
    public void onEntityCollision(BlockState state, World world, BlockPos pos, Entity entity) {
        if (!(entity instanceof PlayerEntity player)) return;

        // Controlla che il player stia entrando in contatto verticale con il blocco
        Box blockBox = new Box(pos);
        if (!player.getBoundingBox().intersects(blockBox)) return;

        // Velocità verticale minima per simulare arrampicata
        double velY = 0.2;

        // Se il giocatore sta sneaking, resta fermo
        if (player.isSneaking()) {
            velY = 0;
        }
        // Altrimenti la velocità è positiva per salire o negativa per scendere lentamente
        else if (!player.isOnGround()) {
            velY = 0.2; // salita costante
        }

        // Applica la velocità verticale
        player.setVelocity(player.getVelocity().x, velY, player.getVelocity().z);
        player.fallDistance = 0; // previene danni da caduta
    }



    @Override
    public BlockState onBreak(World world, BlockPos pos, BlockState state, PlayerEntity player) {
        BlockPos abovePos = pos.up();
        BlockState aboveState = world.getBlockState(abovePos);
        if (aboveState.isOf(ModBlocks.WISTERIA_WHITE_PLANT)) {
            world.setBlockState(abovePos, ModBlocks.WISTERIA_WHITE.getDefaultState(), 3);
        }

        BlockPos currentPos = pos.down();
        while (true) {
            BlockState belowState = world.getBlockState(currentPos);
            if (belowState.isOf(ModBlocks.WISTERIA_WHITE_PLANT) || belowState.isOf(ModBlocks.WISTERIA_WHITE)) {
                world.removeBlock(currentPos, false);
                currentPos = currentPos.down();
            } else {
                break;
            }
        }

        super.onBreak(world, pos, state, player);
        return aboveState;
    }
}
