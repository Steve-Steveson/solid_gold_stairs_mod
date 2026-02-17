package net.steveson.solidgoldstairs.block.custom;//package net.steveson.solidgoldstairs.block.custom;


import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.Half;
import net.minecraft.world.level.block.state.properties.SlabType;
import net.minecraft.world.level.block.state.properties.StairsShape;
import org.jetbrains.annotations.Nullable;

import java.util.function.Supplier;

public class PoweredStairBlock extends StairBlock {
    public PoweredStairBlock(Supplier<BlockState> state, Properties properties) {
        super(state, properties);
    }

    public boolean isSignalSource(BlockState pState) {
        return true;
    }

    public int getSignal(BlockState pBlockState, BlockGetter pBlockAccess, BlockPos pPos, Direction pSide) {
        if (pBlockState.getValue(HALF) == Half.TOP) {
            if (pSide == Direction.UP){
                return 0;
            }
            if (pBlockState.getValue(FACING) == pSide){
                if (pBlockAccess.getBlockState(pPos.relative(pBlockState.getValue(FACING).getOpposite())).getBlock() != Blocks.REDSTONE_WIRE &&
                        pBlockAccess.getBlockState(pPos.relative(pBlockState.getValue(FACING).getOpposite())).getBlock() != Blocks.REPEATER &&
                        pBlockAccess.getBlockState(pPos.relative(pBlockState.getValue(FACING).getOpposite())).getBlock() != Blocks.COMPARATOR) {
                    return 11;
                }
                return 0;
            }
            if (pBlockState.getValue(SHAPE) == StairsShape.OUTER_LEFT) {
                if (pBlockState.getValue(FACING).getCounterClockWise() == pSide){
                    if (pBlockAccess.getBlockState(pPos.relative(pBlockState.getValue(FACING).getClockWise())).getBlock() != Blocks.REDSTONE_WIRE &&
                            pBlockAccess.getBlockState(pPos.relative(pBlockState.getValue(FACING).getClockWise())).getBlock() != Blocks.REPEATER &&
                            pBlockAccess.getBlockState(pPos.relative(pBlockState.getValue(FACING).getClockWise())).getBlock() != Blocks.COMPARATOR) {
                        return 11;
                    }
                    return 0;
                }
            }
            if (pBlockState.getValue(SHAPE) == StairsShape.OUTER_RIGHT) {
                if (pBlockState.getValue(FACING).getClockWise() == pSide){
                    if (pBlockAccess.getBlockState(pPos.relative(pBlockState.getValue(FACING).getCounterClockWise())).getBlock() != Blocks.REDSTONE_WIRE &&
                            pBlockAccess.getBlockState(pPos.relative(pBlockState.getValue(FACING).getCounterClockWise())).getBlock() != Blocks.REPEATER &&
                            pBlockAccess.getBlockState(pPos.relative(pBlockState.getValue(FACING).getCounterClockWise())).getBlock() != Blocks.COMPARATOR) {
                        return 11;
                    }
                    return 0;
                }
            }
        }
        return 11;
    }

    @Override
    public int getDirectSignal(BlockState pState, BlockGetter pLevel, BlockPos pPos, Direction pDirection) {
        if (pLevel.getBlockState(pPos.relative(pDirection.getOpposite())).getBlock() == Blocks.COMPARATOR){
            if (pState.getValue(HALF) == Half.TOP) {
                if (pState.getValue(FACING) == pDirection){
                    return 0;
                }
                if (pState.getValue(SHAPE) == StairsShape.OUTER_LEFT) {
                    if (pState.getValue(FACING).getCounterClockWise() == pDirection){
                        return 0;
                    }
                }
                if (pState.getValue(SHAPE) == StairsShape.OUTER_RIGHT) {
                    if (pState.getValue(FACING).getClockWise() == pDirection){
                        return 0;
                    }
                }
            }
            return 11;
        }
        return 0;
    }

    @Override
    public boolean canConnectRedstone(BlockState state, BlockGetter level, BlockPos pos, @Nullable Direction direction) {
        if (state.getValue(FACING).getOpposite() == direction){
            return true;
        }
        if (state.getValue(FACING) == direction && state.getValue(HALF) == Half.BOTTOM){
            return true;
        }
        if (state.getValue(FACING).getCounterClockWise() == direction){
            if (state.getValue(SHAPE) == StairsShape.OUTER_LEFT && state.getValue(HALF) == Half.TOP) {
                return false;
            }
            return true;
        }
        if (state.getValue(FACING).getClockWise() == direction){
            if (state.getValue(SHAPE) == StairsShape.OUTER_RIGHT && state.getValue(HALF) == Half.TOP) {
                return false;
            }
            return true;
        }
        return false;
    }
}