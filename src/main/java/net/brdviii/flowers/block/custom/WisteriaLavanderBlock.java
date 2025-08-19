package net.brdviii.flowers.block.custom;

import net.brdviii.flowers.block.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Fertilizable;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ShearsItem;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;
import net.minecraft.world.WorldView;

import javax.swing.text.html.BlockView;

public class WisteriaLavanderBlock extends Block implements Fertilizable {
    public static final BooleanProperty CAN_GROW = BooleanProperty.of("can_grow");

    public WisteriaLavanderBlock(Settings settings) {
        super(settings.ticksRandomly());
        this.setDefaultState(this.getDefaultState().with(CAN_GROW, true));
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(CAN_GROW);
    }


    @Override
    public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        if (!state.get(CAN_GROW)) return;

        BlockPos below = pos.down();
        if (world.isAir(below)) {
            world.setBlockState(pos, ModBlocks.WISTERIA_LAVANDER_PLANT.getDefaultState());
            world.setBlockState(below, ModBlocks.WISTERIA_LAVANDER.getDefaultState());
        }
    }

    @Override
    public boolean isFertilizable(WorldView world, BlockPos pos, BlockState state) {
        return world.isAir(pos.down());
    }

    @Override
    public boolean canGrow(World world, Random random, BlockPos pos, BlockState state) {
        return world.isAir(pos.down());
    }

    @Override
    public boolean canPlaceAt(BlockState state, WorldView world, BlockPos pos) {
        BlockPos abovePos = pos.up();
        BlockState aboveState = world.getBlockState(abovePos);

        return !aboveState.isAir();
    }

    @Override
    public void grow(ServerWorld world, Random random, BlockPos pos, BlockState state) {
        if (!state.get(CAN_GROW)) return;

        BlockPos below = pos.down();
        if (world.isAir(below)) {
            world.setBlockState(pos, ModBlocks.WISTERIA_LAVANDER_PLANT.getDefaultState());
            world.setBlockState(below, ModBlocks.WISTERIA_LAVANDER.getDefaultState());
        }
    }

    @Override
    protected ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, BlockHitResult hit) {

        ItemStack main = player.getMainHandStack();
        ItemStack off = player.getOffHandStack();

        if (state.get(CAN_GROW)) {
            if (main.getItem() instanceof ShearsItem) {
                world.setBlockState(pos, state.with(CAN_GROW, false), 3);
                main.damage(1, player, EquipmentSlot.MAINHAND);
                world.playSound(null, pos, SoundEvents.ENTITY_SHEEP_SHEAR, SoundCategory.BLOCKS, 1.0F, 1.0F);
                return ActionResult.SUCCESS;

            } else if (off.getItem() instanceof ShearsItem) {
                world.setBlockState(pos, state.with(CAN_GROW, false), 3);
                off.damage(1, player, EquipmentSlot.OFFHAND);
                world.playSound(null, pos, SoundEvents.ENTITY_SHEEP_SHEAR, SoundCategory.BLOCKS, 1.0F, 1.0F);
                return ActionResult.SUCCESS;
            }
        }

        return ActionResult.PASS;
    }

    @Override
    public BlockState onBreak(World world, BlockPos pos, BlockState state, PlayerEntity player) {
        super.onBreak(world, pos, state, player);

        BlockPos abovePos = pos.up();
        BlockState aboveState = world.getBlockState(abovePos);
        if (aboveState.isOf(ModBlocks.WISTERIA_LAVANDER_PLANT)) {
            world.setBlockState(abovePos, ModBlocks.WISTERIA_LAVANDER.getDefaultState(), 3);
        }


        return aboveState;
    }
}