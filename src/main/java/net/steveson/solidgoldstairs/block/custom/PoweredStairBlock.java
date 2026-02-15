package net.steveson.solidgoldstairs.block.custom;

import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.Half;
import net.minecraft.world.level.block.state.properties.SlabType;

public class PoweredStairBlock extends StairBlock {
    public PoweredStairBlock(BlockState pBaseState, Properties pProperties) {
        super(pBaseState, pProperties);
    }
    public boolean isSignalSource(BlockState pState) {
        if (pState.getValue(HALF) == Half.TOP){
            return false;
        }
        return true;
    }

}
