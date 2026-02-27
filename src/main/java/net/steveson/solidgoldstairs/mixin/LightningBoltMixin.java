package net.steveson.solidgoldstairs.mixin;

import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LightningBolt;
import net.minecraft.world.level.Level;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(LightningBolt.class)
public abstract class LightningBoltMixin extends Entity {


    public LightningBoltMixin(EntityType<?> pEntityType, Level pLevel) {
        super(pEntityType, pLevel);
    }


}
