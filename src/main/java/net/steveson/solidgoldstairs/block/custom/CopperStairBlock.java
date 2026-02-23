package net.steveson.solidgoldstairs.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.WeatheringCopper;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import net.steveson.solidgoldstairs.block.ModBlocks;

import java.util.Optional;
import java.util.function.Supplier;

public class CopperStairBlock extends StairBlock {
    private final WeatheringCopper.WeatherState weatheringState;

    public CopperStairBlock(Supplier<BlockState> state, Properties properties, WeatheringCopper.WeatherState weatheringState) {
        super(state, properties);
        this.weatheringState = weatheringState;
    }

    public WeatheringCopper.WeatherState getWeatheringState() {
        return this.weatheringState;
    }

    /**
     * Gets the unwaxed variant of a waxed copper slab block.
     */
    public static Optional<Block> getUnwaxedBlock(Block block) {
        if (block == ModBlocks.WAXED_COPPER_STAIRS.get()) {
            return Optional.of(ModBlocks.COPPER_STAIRS.get());
        } else if (block == ModBlocks.WAXED_EXPOSED_COPPER_STAIRS.get()) {
            return Optional.of(ModBlocks.EXPOSED_COPPER_STAIRS.get());
        } else if (block == ModBlocks.WAXED_WEATHERED_COPPER_STAIRS.get()) {
            return Optional.of(ModBlocks.WEATHERED_COPPER_STAIRS.get());
        } else if (block == ModBlocks.WAXED_OXIDIZED_COPPER_STAIRS.get()) {
            return Optional.of(ModBlocks.OXIDIZED_COPPER_STAIRS.get());
        }
        return Optional.empty();
    }


    @Override
    public InteractionResult use(BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hit) {
        ItemStack stack = player.getItemInHand(hand);

        // Check if player is using an axe on a waxed stairs - dewax it
        if (stack.is(ItemTags.AXES)) {
            Optional<Block> unwaxedBlock = getUnwaxedBlock(state.getBlock());

            if (unwaxedBlock.isPresent()) {
                level.playSound(player, pos, SoundEvents.AXE_WAX_OFF, SoundSource.BLOCKS, 1.0F, 1.0F);
                level.levelEvent(player, 3004, pos, 0); // WAX_OFF particles

                if (!level.isClientSide) {
                    BlockState newState = unwaxedBlock.get().withPropertiesOf(state);
                    level.setBlockAndUpdate(pos, newState);
                    if (!player.isCreative()) {
                        stack.hurtAndBreak(1, player, p -> p.broadcastBreakEvent(hand));
                    }
                }

                return InteractionResult.sidedSuccess(level.isClientSide);
            }
        }

        return InteractionResult.PASS;
    }
}
