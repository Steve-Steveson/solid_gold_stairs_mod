package net.steveson.solidgoldstairs.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;
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

    // Allow it to affect the sides of comparators, but needs to be limited to only comparators, or it will power things through solid blocks
    @Override
    public int getDirectSignal(BlockState pState, BlockGetter pLevel, BlockPos pPos, Direction pDirection) {
        if(pState.getValue(TYPE) == SlabType.DOUBLE && pLevel.getBlockState(pPos.relative(pDirection.getOpposite())).getBlock() == Blocks.COMPARATOR) {
            return 15;
        }
        if(pState.getValue(TYPE) == SlabType.BOTTOM&& pLevel.getBlockState(pPos.relative(pDirection.getOpposite())).getBlock() == Blocks.COMPARATOR) {
            return 7;
        }
        return 0;
    }
    public int getSignal(BlockState pBlockState, BlockGetter pBlockAccess, BlockPos pPos, Direction pSide) {
        if(pBlockState.getValue(TYPE) == SlabType.DOUBLE) {
           return 15;
        }
        if(pBlockState.getValue(TYPE) == SlabType.BOTTOM && pSide != Direction.DOWN) {
            return 7;
        }
        if(pBlockState.getValue(TYPE) == SlabType.TOP) {
            if (pSide == Direction.DOWN) {
                return 7;
            }
            if(pSide == Direction.WEST &&
                    pBlockAccess.getBlockState(pPos.east()).getBlock() !=  Blocks.REDSTONE_WIRE &&
                    pBlockAccess.getBlockState(pPos.east()).getBlock() !=  Blocks.REPEATER &&
                    pBlockAccess.getBlockState(pPos.east()).getBlock() !=  Blocks.COMPARATOR
            ) {
                return 7;
            }
            if(pSide == Direction.SOUTH &&
                    pBlockAccess.getBlockState(pPos.north()).getBlock() !=  Blocks.REDSTONE_WIRE &&
                    pBlockAccess.getBlockState(pPos.north()).getBlock() !=  Blocks.REPEATER &&
                    pBlockAccess.getBlockState(pPos.north()).getBlock() !=  Blocks.COMPARATOR
            ) {
                return 7;
            }
            if(pSide == Direction.EAST &&
                    pBlockAccess.getBlockState(pPos.west()).getBlock() !=  Blocks.REDSTONE_WIRE &&
                    pBlockAccess.getBlockState(pPos.west()).getBlock() !=  Blocks.REPEATER &&
                    pBlockAccess.getBlockState(pPos.west()).getBlock() !=  Blocks.COMPARATOR
            ) {
                return 7;
            }
            if(pSide == Direction.NORTH &&
                    pBlockAccess.getBlockState(pPos.south()).getBlock() !=  Blocks.REDSTONE_WIRE &&
                    pBlockAccess.getBlockState(pPos.south()).getBlock() !=  Blocks.REPEATER &&
                    pBlockAccess.getBlockState(pPos.south()).getBlock() !=  Blocks.COMPARATOR
            ) {
                return 7;
            }
        }
        return 0;
    }
}
