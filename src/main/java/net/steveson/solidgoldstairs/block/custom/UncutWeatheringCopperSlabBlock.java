package net.steveson.solidgoldstairs.block.custom;

import com.google.common.base.Suppliers;
import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.WeatheringCopper;
import net.minecraft.world.level.block.WeatheringCopperSlabBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.steveson.solidgoldstairs.block.ModBlocks;

import java.util.Optional;
import java.util.function.Supplier;

public class UncutWeatheringCopperSlabBlock extends WeatheringCopperSlabBlock {
    public UncutWeatheringCopperSlabBlock(WeatherState pWeatherState, Properties pProperties) {
        super(pWeatherState, pProperties);
    }

    static Supplier<BiMap<Block, Block>> NEXT_BY_BLOCK = Suppliers.memoize(() -> {
        return ImmutableBiMap.<Block, Block>builder()
                .put(ModBlocks.COPPER_SLAB.get(), ModBlocks.EXPOSED_COPPER_SLAB.get())
                .put(ModBlocks.EXPOSED_COPPER_SLAB.get(), ModBlocks.WEATHERED_COPPER_SLAB.get())
                .put(ModBlocks.WEATHERED_COPPER_SLAB.get(), ModBlocks.OXIDIZED_COPPER_SLAB.get())
                .build();
    });
//    Supplier<BiMap<Block, Block>> PREVIOUS_BY_BLOCK = Suppliers.memoize(() -> {
//        return NEXT_BY_BLOCK.get().inverse();
//    });


    public boolean isRandomlyTicking(BlockState pState) {
        return getNext(pState.getBlock()).isPresent();
    }

    static Optional<Block> getNext(Block pBlock) {
        return Optional.ofNullable(NEXT_BY_BLOCK.get().get(pBlock));
    }

}
