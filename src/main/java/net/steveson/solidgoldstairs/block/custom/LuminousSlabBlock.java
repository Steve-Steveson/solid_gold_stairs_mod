package net.steveson.solidgoldstairs.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.SlabType;

public class LuminousSlabBlock extends SlabBlock {
    public LuminousSlabBlock(Properties pProperties) {
        super(pProperties);
    }


    Integer lightLevel = 15;
    @Override
    public int getLightEmission(BlockState state, BlockGetter level, BlockPos pos) {
        switch (state.getValue(TYPE)) {
            case TOP -> {




            }
        }
        return lightLevel;
    }





}
