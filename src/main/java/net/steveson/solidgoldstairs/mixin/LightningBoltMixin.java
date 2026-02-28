package net.steveson.solidgoldstairs.mixin;

import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LightningBolt;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.steveson.solidgoldstairs.block.custom.SteveHasWeatheringCopper;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import org.spongepowered.asm.mixin.injection.callback.LocalCapture;

import java.util.Iterator;
import java.util.Optional;

//This mixin allows lightning strikes to de-oxidize our copper variants the same as vanilla

@Mixin(LightningBolt.class)
public abstract class LightningBoltMixin extends Entity {


    public LightningBoltMixin(EntityType<?> pEntityType, Level pLevel) {
        super(pEntityType, pLevel);
    }

    @Inject(method = "clearCopperOnLightningStrike", at = @At(value = "INVOKE",
            target = "Lnet/minecraft/world/level/Level;setBlockAndUpdate(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)Z",
            shift = At.Shift.AFTER),
            locals = LocalCapture.CAPTURE_FAILHARD)
    private static void clearCopperOnLightningStrike(Level pLevel, BlockPos pPos, CallbackInfo ci, BlockState blockstate, BlockPos blockpos, BlockState blockstate1){

        if (blockstate1.getBlock() instanceof SteveHasWeatheringCopper) {
            pLevel.setBlockAndUpdate(blockpos, SteveHasWeatheringCopper.getFirstBlock(pLevel.getBlockState(blockpos).getBlock()).withPropertiesOf(blockstate1));
        }
    }

    @Inject(method = "randomStepCleaningCopper", at = @At(value = "INVOKE",
            target = "Lnet/minecraft/world/level/block/WeatheringCopper;getPrevious(Lnet/minecraft/world/level/block/state/BlockState;)Ljava/util/Optional;"),
            locals = LocalCapture.CAPTURE_FAILHARD)
    private static void randomStepCleaningCopper(Level pLevel, BlockPos pPos, CallbackInfoReturnable<Optional<BlockPos>> cir, Iterator var2, BlockPos blockpos, BlockState blockstate){
        if (blockstate.getBlock() instanceof SteveHasWeatheringCopper) {
            SteveHasWeatheringCopper copperBlock = (SteveHasWeatheringCopper) blockstate.getBlock();
            copperBlock.getPreviousBlockGeneric(blockstate.getBlock()).ifPresent((previousBlock) -> {
                pLevel.setBlockAndUpdate(blockpos, previousBlock.withPropertiesOf(blockstate));
            });
        }
    }
}
