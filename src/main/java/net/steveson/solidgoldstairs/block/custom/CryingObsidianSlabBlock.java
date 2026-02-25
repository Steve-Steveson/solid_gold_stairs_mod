package net.steveson.solidgoldstairs.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LightLayer;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.SlabType;
import net.minecraft.world.level.material.PushReaction;

public class CryingObsidianSlabBlock extends SlabBlock {
    public CryingObsidianSlabBlock(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public PushReaction getPistonPushReaction(BlockState state) {
        return PushReaction.BLOCK;
    }


    @Override
    public boolean useShapeForLightOcclusion(BlockState pState) {
        return false;
    }
    @Override
    public boolean propagatesSkylightDown(BlockState pState, BlockGetter pLevel, BlockPos pPos) {
        return false;
    }
    public int getLightBlock(BlockState pState, BlockGetter pLevel, BlockPos pPos) {
        return 15;
    }

//    public int getLightBlock(BlockState pState, BlockGetter pLevel, BlockPos pPos) {
//
//
//        if (light == 15){
//            return
//        }
//        return 1;
//    }

//    Integer light =0;
//    public int getLight(ServerLevel pLevel, BlockPos pPos) {
//        return pLevel.getBrightness(LightLayer.BLOCK, pPos);
//    }

//    public Integer getLight(ServerLevel pLevel, BlockPos pPos) {
//        return pLevel.getBrightness(LightLayer.BLOCK, pPos);
//    }

    /**
     * Called periodically clientside on blocks near the player to show effects (like furnace fire particles).
     */
    public void animateTick(BlockState state, Level level, BlockPos pos, RandomSource randomSource) {
        if (randomSource.nextInt(5) == 0) {
            Direction direction = Direction.getRandom(randomSource);
            if (direction != Direction.UP) {
                BlockPos blockpos = pos.relative(direction);
                BlockState blockstate = level.getBlockState(blockpos);
                if (!state.canOcclude() || !blockstate.isFaceSturdy(level, blockpos, direction.getOpposite())) {
                    double offsetX = direction.getStepX() == 0 ? randomSource.nextDouble() : 0.5D + (double)direction.getStepX() * 0.6D;
                    double offsetY;
                    if (direction.getStepY() == 0) {
                        switch (state.getValue(TYPE)) {
                            case DOUBLE -> {
                                offsetY = randomSource.nextDouble();
                            }
                            case BOTTOM -> {
                                offsetY = randomSource.nextDouble() / 2;
                            }
                            case TOP -> {
                                offsetY = randomSource.nextDouble() / 2 + 0.5;
                            }
                            default -> {
                                offsetY = 0.5;
                            }
                        }
                    }
                    else {
                        if (state.getValue(TYPE) == SlabType.TOP) {
                            offsetY = 0.75D + (double)direction.getStepY() * 0.35D;
                        }
                        else {
                            offsetY = 0.5D + (double)direction.getStepY() * 0.6D;
                        }
                    }

                    double offsetZ = direction.getStepZ() == 0 ? randomSource.nextDouble() : 0.5D + (double)direction.getStepZ() * 0.6D;
                    level.addParticle(ParticleTypes.DRIPPING_OBSIDIAN_TEAR, (double)pos.getX() + offsetX, (double)pos.getY() + offsetY, (double)pos.getZ() + offsetZ, 0.0D, 0.0D, 0.0D);
                }
            }
        }
    }
}
