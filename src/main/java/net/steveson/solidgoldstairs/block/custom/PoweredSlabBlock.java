package net.steveson.solidgoldstairs.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.SlabType;

public class PoweredSlabBlock extends SlabBlock {
    public PoweredSlabBlock(Properties pProperties) {
        super(pProperties);
    }
    public boolean isSignalSource(BlockState pState) {
        return pState.getValue(TYPE) != SlabType.TOP;
    }
    public int getSignal(BlockState pBlockState, BlockGetter pBlockAccess, BlockPos pPos, Direction pSide) {
        if(pBlockState.getValue(TYPE) == SlabType.DOUBLE) {
           return 15;
        }
        if(pBlockState.getValue(TYPE) == SlabType.BOTTOM && pSide != Direction.DOWN) {
            return 7;
        }
        if(pBlockState.getValue(TYPE) == SlabType.TOP && pSide == Direction.DOWN) {
            return 7;
        }
        return 0;
    }

}
