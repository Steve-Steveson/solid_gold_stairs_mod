package net.steveson.solidgoldstairs.block.custom;//package net.steveson.solidgoldstairs.block.custom;


import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.Half;
import net.minecraft.world.level.block.state.properties.SlabType;
import org.jetbrains.annotations.Nullable;

import java.util.function.Supplier;

public class PoweredStairBlock extends StairBlock {
    public PoweredStairBlock(Supplier<BlockState> state, Properties properties) {
        super(state, properties);
    }

    public int getSignal(BlockState pBlockState, BlockGetter pBlockAccess, BlockPos pPos, Direction pSide) {
        if (pBlockState.getValue(HALF) == Half.TOP) {
            if (pBlockState.getValue(FACING) == pSide){
                return 0;
            }
            if (pSide == Direction.UP){
                return 0;
            }
        }
        return 11;
    }


    @Override
    public boolean canConnectRedstone(BlockState state, BlockGetter level, BlockPos pos, @Nullable Direction direction) {
        if (state.getValue(HALF) == Half.TOP) {
            if (state.getValue(FACING) == direction){
                return false;
            }
        }
        return true;
    }


}