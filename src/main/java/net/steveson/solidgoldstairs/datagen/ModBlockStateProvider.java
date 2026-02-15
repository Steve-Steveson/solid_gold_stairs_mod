package net.steveson.solidgoldstairs.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.StairBlock;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.steveson.solidgoldstairs.SolidGoldStairsMod;
import net.steveson.solidgoldstairs.block.ModBlocks;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, SolidGoldStairsMod.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        stairsBlock(((StairBlock) ModBlocks.COAL_STAIRS.get()), blockTexture(Blocks.COAL_BLOCK));
        slabBlock(((SlabBlock) ModBlocks.COAL_SLAB.get()), blockTexture(Blocks.COAL_BLOCK), blockTexture(Blocks.COAL_BLOCK));
        stairsBlock(((StairBlock) ModBlocks.IRON_STAIRS.get()), blockTexture(Blocks.IRON_BLOCK));
        slabBlock(((SlabBlock) ModBlocks.IRON_SLAB.get()), blockTexture(Blocks.IRON_BLOCK), blockTexture(Blocks.IRON_BLOCK));
        stairsBlock(((StairBlock) ModBlocks.GOLD_STAIRS.get()), blockTexture(Blocks.GOLD_BLOCK));
        slabBlock(((SlabBlock) ModBlocks.GOLD_SLAB.get()), blockTexture(Blocks.GOLD_BLOCK), blockTexture(Blocks.GOLD_BLOCK));

        slabBlock(((SlabBlock) ModBlocks.REDSTONE_SLAB.get()), blockTexture(Blocks.REDSTONE_BLOCK), blockTexture(Blocks.REDSTONE_BLOCK));
        stairsBlock(((StairBlock) ModBlocks.EMERALD_STAIRS.get()), blockTexture(Blocks.EMERALD_BLOCK));
        slabBlock(((SlabBlock) ModBlocks.EMERALD_SLAB.get()), blockTexture(Blocks.EMERALD_BLOCK), blockTexture(Blocks.EMERALD_BLOCK));
        stairsBlock(((StairBlock) ModBlocks.LAPIS_STAIRS.get()), blockTexture(Blocks.LAPIS_BLOCK));
        slabBlock(((SlabBlock) ModBlocks.LAPIS_SLAB.get()), blockTexture(Blocks.LAPIS_BLOCK), blockTexture(Blocks.LAPIS_BLOCK));
        stairsBlock(((StairBlock) ModBlocks.DIAMOND_STAIRS.get()), blockTexture(Blocks.DIAMOND_BLOCK));
        slabBlock(((SlabBlock) ModBlocks.DIAMOND_SLAB.get()), blockTexture(Blocks.DIAMOND_BLOCK), blockTexture(Blocks.DIAMOND_BLOCK));
        stairsBlock(((StairBlock) ModBlocks.NETHERITE_STAIRS.get()), blockTexture(Blocks.NETHERITE_BLOCK));
        slabBlock(((SlabBlock) ModBlocks.NETHERITE_SLAB.get()), blockTexture(Blocks.NETHERITE_BLOCK), blockTexture(Blocks.NETHERITE_BLOCK));
        stairsBlock(((StairBlock) ModBlocks.AMETHYST_STAIRS.get()), blockTexture(Blocks.AMETHYST_BLOCK));
        slabBlock(((SlabBlock) ModBlocks.AMETHYST_SLAB.get()), blockTexture(Blocks.AMETHYST_BLOCK), blockTexture(Blocks.AMETHYST_BLOCK));
    }
}
