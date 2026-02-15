package net.steveson.solidgoldstairs.block.intefaces;

import com.google.common.base.Suppliers;
import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.ChangeOverTimeBlock;
import net.minecraft.world.level.block.WeatheringCopper;
import net.minecraft.world.level.block.state.BlockState;
import net.steveson.solidgoldstairs.block.ModBlocks;

import java.util.Optional;
import java.util.function.Supplier;

public interface ModWeatheringCopper extends ChangeOverTimeBlock<WeatheringCopper.WeatherState> {
    Supplier<BiMap<Block, Block>> NEXT_BY_BLOCK = Suppliers.memoize(() -> {
        return ImmutableBiMap.<Block, Block>builder()
                .put(ModBlocks.COPPER_SLAB.get(), ModBlocks.EXPOSED_COPPER_SLAB.get())
                .put(ModBlocks.EXPOSED_COPPER_SLAB.get(), ModBlocks.WEATHERED_COPPER_SLAB.get())
                .put(ModBlocks.WEATHERED_COPPER_SLAB.get(), ModBlocks.OXIDIZED_COPPER_SLAB.get())
                .build();
    });
    Supplier<BiMap<Block, Block>> PREVIOUS_BY_BLOCK = Suppliers.memoize(() -> {
        return NEXT_BY_BLOCK.get().inverse();
    });

    default void onRandomTick(BlockState pState, ServerLevel pLevel, BlockPos pPos, RandomSource pRandom) {
        float f = 0.05688889F;
        if (pRandom.nextFloat() < 0.05688889F) {

            Optional<Block> nextBlock = Optional.ofNullable(NEXT_BY_BLOCK.get().get(pState.getBlock()));

            if (nextBlock.isPresent()) {
                BlockState newState = nextBlock.get().withPropertiesOf(pState);
                pLevel.setBlockAndUpdate(pPos, newState);

            }
        }
    }





    static Optional<Block> getPrevious(Block pBlock) {
        return Optional.ofNullable(PREVIOUS_BY_BLOCK.get().get(pBlock));
    }

    static Block getFirst(Block pBlock) {
        Block block = pBlock;

        for(Block block1 = PREVIOUS_BY_BLOCK.get().get(pBlock); block1 != null; block1 = PREVIOUS_BY_BLOCK.get().get(block1)) {
            block = block1;
        }

        return block;
    }

    static Optional<BlockState> getPrevious(BlockState pState) {
        return getPrevious(pState.getBlock()).map((p_154903_) -> {
            return p_154903_.withPropertiesOf(pState);
        });
    }

    static Optional<Block> getNext(Block pBlock) {
        return Optional.ofNullable(NEXT_BY_BLOCK.get().get(pBlock));
    }

    static BlockState getFirst(BlockState pState) {
        return getFirst(pState.getBlock()).withPropertiesOf(pState);
    }

    default Optional<BlockState> getNext(BlockState pState) {
        return getNext(pState.getBlock()).map((p_154896_) -> {
            return p_154896_.withPropertiesOf(pState);
        });
    }

    default float getChanceModifier() {
        return this.getAge() == WeatheringCopper.WeatherState.UNAFFECTED ? 0.75F : 1.0F;
    }

    public static enum WeatherState {
        UNAFFECTED,
        EXPOSED,
        WEATHERED,
        OXIDIZED;
    }
}
