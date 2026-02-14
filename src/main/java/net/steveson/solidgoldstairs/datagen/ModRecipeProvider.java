package net.steveson.solidgoldstairs.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import net.minecraftforge.registries.RegistryObject;
import net.steveson.solidgoldstairs.SolidGoldStairsMod;
import net.steveson.solidgoldstairs.block.ModBlocks;

import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> consumer) {
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GOLD_STAIRS.get(),4)
                .pattern("G  ")
                .pattern("GG ")
                .pattern("GGG")
                .define('G', Blocks.GOLD_BLOCK)
                .unlockedBy(getHasName(Blocks.GOLD_BLOCK), has(Blocks.GOLD_BLOCK))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GOLD_SLAB.get(),6)
                .pattern("GGG")
                .define('G', Blocks.GOLD_BLOCK)
                .unlockedBy(getHasName(Blocks.GOLD_BLOCK), has(Blocks.GOLD_BLOCK))
                .save(consumer);

        registerStonecuttingRecipe(Blocks.GOLD_BLOCK, ModBlocks.GOLD_STAIRS, consumer);
        registerStonecuttingRecipe(Blocks.GOLD_BLOCK, ModBlocks.GOLD_SLAB, consumer, 2);

    }
    private static void registerStonecuttingRecipe(ItemLike input, RegistryObject<Block> output, Consumer<FinishedRecipe> consumer, int resultCount) {
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(input), RecipeCategory.BUILDING_BLOCKS, output.get(), resultCount)
                .unlockedBy(getHasName(input), has(input))
                .save(consumer,  SolidGoldStairsMod.MOD_ID + ":" + "stonecutting/" + getItemName(output.get()));
    }
    private static void registerStonecuttingRecipe(ItemLike input, RegistryObject<Block> output, Consumer<FinishedRecipe> consumer) {
        registerStonecuttingRecipe(input, output, consumer,1);
    }
}
