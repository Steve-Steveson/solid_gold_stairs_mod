package net.steveson.solidgoldstairs.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.PushReaction;

public class CryingObsidianSlabBlock extends SlabBlock {
    public CryingObsidianSlabBlock(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public PushReaction getPistonPushReaction(BlockState state) {
        return PushReaction.BLOCK;
    }

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
                    double d0 = direction.getStepX() == 0 ? randomSource.nextDouble() : 0.5D + (double)direction.getStepX() * 0.6D;
                    double d1 = direction.getStepY() == 0 ? randomSource.nextDouble() : 0.5D + (double)direction.getStepY() * 0.6D;
                    double d2 = direction.getStepZ() == 0 ? randomSource.nextDouble() : 0.5D + (double)direction.getStepZ() * 0.6D;
                    level.addParticle(ParticleTypes.DRIPPING_OBSIDIAN_TEAR, (double)pos.getX() + d0, (double)pos.getY() + d1, (double)pos.getZ() + d2, 0.0D, 0.0D, 0.0D);
                }
            }
        }
    }
}
