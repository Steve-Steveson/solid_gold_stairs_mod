package net.steveson.solidgoldstairs.util;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;
import net.steveson.solidgoldstairs.SolidGoldStairsMod;

public class ModTags {
    public static class Blocks{
        public static final TagKey<Block> LOW_REDSTONE_COMPONENTS = tag("low_redstone_components");

        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(SolidGoldStairsMod.MOD_ID, name));
        }
    }
}
