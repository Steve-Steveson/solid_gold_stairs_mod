package net.steveson.solidgoldstairs.mixin;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.ChorusFlowerBlock;
import net.minecraft.world.level.block.state.BlockState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import org.spongepowered.asm.mixin.injection.callback.LocalCapture;

import java.util.Iterator;

@Mixin(ChorusFlowerBlock.class)
public class ChorusFlowerMixin {


//    @Inject( method = "canSurvive", at = @At(value = "INVOKE",
//            target = "Lnet/minecraft/world/level/LevelReader;getBlockState(Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/block/state/BlockState;",
//            ordinal = 0, shift = At.Shift.AFTER)
////            , locals = LocalCapture.CAPTURE_FAILHARD
//    )
//    public void canSurvive(BlockState pState, LevelReader pLevel, BlockPos pPos, CallbackInfoReturnable<Boolean> cir) {
//        BlockState blockstate = pLevel.getBlockState(pPos.below());
//        if(blockstate.is(net.minecraftforge.common.Tags.Blocks.CHORUS_ADDITIONALLY_GROWS_ON) && !blockstate.isFaceSturdy(pLevel, pPos, Direction.UP)) {
//            boolean flag = false;
//            }
//
//    }

    @Inject( method = "canSurvive", at = @At(value = "INVOKE",
            target = "Lnet/minecraft/world/level/LevelReader;getBlockState(Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/block/state/BlockState;",
            ordinal = 1)
            , locals = LocalCapture.CAPTURE_FAILHARD
    )
    public void canSurvive(BlockState pState, LevelReader pLevel, BlockPos pPos, CallbackInfoReturnable<Boolean> cir, BlockState blockstate, boolean flag, Iterator var6, Direction direction) {
        if(blockstate.is(net.minecraftforge.common.Tags.Blocks.CHORUS_ADDITIONALLY_GROWS_ON) && !blockstate.isFaceSturdy(pLevel, pPos, Direction.UP)) {
             flag = false;
             }

    }

//    @Inject( method = "canSurvive", at = @At(value = "INVOKE",
//            target = "Lnet/minecraft/world/level/block/state/BlockState;isAir()Z",
//            ordinal = 1)
//            , locals = LocalCapture.CAPTURE_FAILHARD
//    )
//    public void canSurvive(BlockState pState, LevelReader pLevel, BlockPos pPos, CallbackInfoReturnable<Boolean> cir, BlockState blockstate, boolean flag) {
//
//        if(blockstate.is(net.minecraftforge.common.Tags.Blocks.CHORUS_ADDITIONALLY_GROWS_ON) && !blockstate.isFaceSturdy(pLevel, pPos, Direction.UP)) {
//             flag = false;
//        }
//    }


}
