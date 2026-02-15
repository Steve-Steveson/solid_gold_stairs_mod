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
        registerStairsCraftingRecipe(RecipeCategory.BUILDING_BLOCKS, Blocks.COAL_BLOCK, ModBlocks.COAL_STAIRS,consumer);
        registerSlabCraftingRecipe(RecipeCategory.BUILDING_BLOCKS, Blocks.COAL_BLOCK, ModBlocks.COAL_SLAB,consumer);
        registerStairsCraftingRecipe(RecipeCategory.BUILDING_BLOCKS, Blocks.IRON_BLOCK, ModBlocks.IRON_STAIRS,consumer);
        registerSlabCraftingRecipe(RecipeCategory.BUILDING_BLOCKS, Blocks.IRON_BLOCK, ModBlocks.IRON_SLAB,consumer);
        registerStairsCraftingRecipe(RecipeCategory.BUILDING_BLOCKS, Blocks.GOLD_BLOCK, ModBlocks.GOLD_STAIRS,consumer);
        registerSlabCraftingRecipe(RecipeCategory.BUILDING_BLOCKS, Blocks.GOLD_BLOCK, ModBlocks.GOLD_SLAB,consumer);
        registerStairsCraftingRecipe(RecipeCategory.REDSTONE, Blocks.REDSTONE_BLOCK, ModBlocks.REDSTONE_STAIRS,consumer);
        registerSlabCraftingRecipe(RecipeCategory.REDSTONE, Blocks.REDSTONE_BLOCK, ModBlocks.REDSTONE_SLAB,consumer);
        registerStairsCraftingRecipe(RecipeCategory.BUILDING_BLOCKS, Blocks.EMERALD_BLOCK, ModBlocks.EMERALD_STAIRS,consumer);
        registerSlabCraftingRecipe(RecipeCategory.BUILDING_BLOCKS, Blocks.EMERALD_BLOCK, ModBlocks.EMERALD_SLAB,consumer);
        registerStairsCraftingRecipe(RecipeCategory.BUILDING_BLOCKS, Blocks.LAPIS_BLOCK, ModBlocks.LAPIS_STAIRS,consumer);
        registerSlabCraftingRecipe(RecipeCategory.BUILDING_BLOCKS, Blocks.LAPIS_BLOCK, ModBlocks.LAPIS_SLAB,consumer);
        registerStairsCraftingRecipe(RecipeCategory.BUILDING_BLOCKS, Blocks.DIAMOND_BLOCK, ModBlocks.DIAMOND_STAIRS,consumer);
        registerSlabCraftingRecipe(RecipeCategory.BUILDING_BLOCKS, Blocks.DIAMOND_BLOCK, ModBlocks.DIAMOND_SLAB,consumer);
        registerStairsCraftingRecipe(RecipeCategory.BUILDING_BLOCKS, Blocks.NETHERITE_BLOCK, ModBlocks.NETHERITE_STAIRS,consumer);
        registerSlabCraftingRecipe(RecipeCategory.BUILDING_BLOCKS, Blocks.NETHERITE_BLOCK, ModBlocks.NETHERITE_SLAB,consumer);
        registerStairsCraftingRecipe(RecipeCategory.BUILDING_BLOCKS, Blocks.AMETHYST_BLOCK, ModBlocks.AMETHYST_STAIRS,consumer);
        registerSlabCraftingRecipe(RecipeCategory.BUILDING_BLOCKS, Blocks.AMETHYST_BLOCK, ModBlocks.AMETHYST_SLAB,consumer);


        registerStonecuttingRecipe(Blocks.COAL_BLOCK, ModBlocks.COAL_STAIRS, consumer);
        registerStonecuttingRecipe(Blocks.COAL_BLOCK, ModBlocks.COAL_SLAB, consumer, 2);
        registerStonecuttingRecipe(Blocks.IRON_BLOCK, ModBlocks.IRON_STAIRS, consumer);
        registerStonecuttingRecipe(Blocks.IRON_BLOCK, ModBlocks.IRON_SLAB, consumer, 2);
        registerStonecuttingRecipe(Blocks.GOLD_BLOCK, ModBlocks.GOLD_STAIRS, consumer);
        registerStonecuttingRecipe(Blocks.GOLD_BLOCK, ModBlocks.GOLD_SLAB, consumer, 2);
        registerStonecuttingRecipe(Blocks.REDSTONE_BLOCK, ModBlocks.REDSTONE_STAIRS, consumer);
        registerStonecuttingRecipe(Blocks.REDSTONE_BLOCK, ModBlocks.REDSTONE_SLAB, consumer, 2);
        registerStonecuttingRecipe(Blocks.EMERALD_BLOCK, ModBlocks.EMERALD_STAIRS, consumer);
        registerStonecuttingRecipe(Blocks.EMERALD_BLOCK, ModBlocks.EMERALD_SLAB, consumer, 2);
        registerStonecuttingRecipe(Blocks.LAPIS_BLOCK, ModBlocks.LAPIS_STAIRS, consumer);
        registerStonecuttingRecipe(Blocks.LAPIS_BLOCK, ModBlocks.LAPIS_SLAB, consumer, 2);
        registerStonecuttingRecipe(Blocks.DIAMOND_BLOCK, ModBlocks.DIAMOND_STAIRS, consumer);
        registerStonecuttingRecipe(Blocks.DIAMOND_BLOCK, ModBlocks.DIAMOND_SLAB, consumer, 2);
        registerStonecuttingRecipe(Blocks.NETHERITE_BLOCK, ModBlocks.NETHERITE_STAIRS, consumer);
        registerStonecuttingRecipe(Blocks.NETHERITE_BLOCK, ModBlocks.NETHERITE_SLAB, consumer, 2);
        registerStonecuttingRecipe(Blocks.AMETHYST_BLOCK, ModBlocks.AMETHYST_STAIRS, consumer);
        registerStonecuttingRecipe(Blocks.AMETHYST_BLOCK, ModBlocks.AMETHYST_SLAB, consumer, 2);

    }


    private static void registerStairsCraftingRecipe(RecipeCategory category, ItemLike input, RegistryObject<Block> output, Consumer<FinishedRecipe> consumer) {
        ShapedRecipeBuilder.shaped(category, output.get(),4)
                .pattern("I  ")
                .pattern("II ")
                .pattern("III")
                .define('I', input)
                .unlockedBy(getHasName(input), has(input))
                .save(consumer,  SolidGoldStairsMod.MOD_ID + ":" + "crafting/" + getItemName(output.get()));
    }

    private static void registerSlabCraftingRecipe(RecipeCategory category, ItemLike input, RegistryObject<Block> output, Consumer<FinishedRecipe> consumer) {
        ShapedRecipeBuilder.shaped(category, output.get(),6)
                .pattern("III")
                .define('I', input)
                .unlockedBy(getHasName(input), has(input))
                .save(consumer,  SolidGoldStairsMod.MOD_ID + ":" + "crafting/" + getItemName(output.get()));
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
