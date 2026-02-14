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
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.COAL_STAIRS.get(),4)
                .pattern("G  ")
                .pattern("GG ")
                .pattern("GGG")
                .define('G', Blocks.COAL_BLOCK)
                .unlockedBy(getHasName(Blocks.COAL_BLOCK), has(Blocks.COAL_BLOCK))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.COAL_SLAB.get(),6)
                .pattern("GGG")
                .define('G', Blocks.COAL_BLOCK)
                .unlockedBy(getHasName(Blocks.COAL_BLOCK), has(Blocks.COAL_BLOCK))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.IRON_STAIRS.get(),4)
                .pattern("G  ")
                .pattern("GG ")
                .pattern("GGG")
                .define('G', Blocks.IRON_BLOCK)
                .unlockedBy(getHasName(Blocks.IRON_BLOCK), has(Blocks.IRON_BLOCK))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.IRON_SLAB.get(),6)
                .pattern("GGG")
                .define('G', Blocks.IRON_BLOCK)
                .unlockedBy(getHasName(Blocks.IRON_BLOCK), has(Blocks.IRON_BLOCK))
                .save(consumer);

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



        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.EMERALD_STAIRS.get(),4)
                .pattern("G  ")
                .pattern("GG ")
                .pattern("GGG")
                .define('G', Blocks.EMERALD_BLOCK)
                .unlockedBy(getHasName(Blocks.EMERALD_BLOCK), has(Blocks.EMERALD_BLOCK))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.EMERALD_SLAB.get(),6)
                .pattern("GGG")
                .define('G', Blocks.EMERALD_BLOCK)
                .unlockedBy(getHasName(Blocks.EMERALD_BLOCK), has(Blocks.EMERALD_BLOCK))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LAPIS_STAIRS.get(),4)
                .pattern("G  ")
                .pattern("GG ")
                .pattern("GGG")
                .define('G', Blocks.LAPIS_BLOCK)
                .unlockedBy(getHasName(Blocks.LAPIS_BLOCK), has(Blocks.LAPIS_BLOCK))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LAPIS_SLAB.get(),6)
                .pattern("GGG")
                .define('G', Blocks.LAPIS_BLOCK)
                .unlockedBy(getHasName(Blocks.LAPIS_BLOCK), has(Blocks.LAPIS_BLOCK))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIAMOND_STAIRS.get(),4)
                .pattern("G  ")
                .pattern("GG ")
                .pattern("GGG")
                .define('G', Blocks.DIAMOND_BLOCK)
                .unlockedBy(getHasName(Blocks.DIAMOND_BLOCK), has(Blocks.DIAMOND_BLOCK))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIAMOND_SLAB.get(),6)
                .pattern("GGG")
                .define('G', Blocks.DIAMOND_BLOCK)
                .unlockedBy(getHasName(Blocks.DIAMOND_BLOCK), has(Blocks.DIAMOND_BLOCK))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.NETHERITE_STAIRS.get(),4)
                .pattern("G  ")
                .pattern("GG ")
                .pattern("GGG")
                .define('G', Blocks.NETHERITE_BLOCK)
                .unlockedBy(getHasName(Blocks.NETHERITE_BLOCK), has(Blocks.NETHERITE_BLOCK))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.NETHERITE_SLAB.get(),6)
                .pattern("GGG")
                .define('G', Blocks.NETHERITE_BLOCK)
                .unlockedBy(getHasName(Blocks.NETHERITE_BLOCK), has(Blocks.NETHERITE_BLOCK))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.AMETHYST_STAIRS.get(),4)
                .pattern("G  ")
                .pattern("GG ")
                .pattern("GGG")
                .define('G', Blocks.AMETHYST_BLOCK)
                .unlockedBy(getHasName(Blocks.AMETHYST_BLOCK), has(Blocks.AMETHYST_BLOCK))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.AMETHYST_SLAB.get(),6)
                .pattern("GGG")
                .define('G', Blocks.AMETHYST_BLOCK)
                .unlockedBy(getHasName(Blocks.AMETHYST_BLOCK), has(Blocks.AMETHYST_BLOCK))
                .save(consumer);


        registerStonecuttingRecipe(Blocks.COAL_BLOCK, ModBlocks.COAL_STAIRS, consumer);
        registerStonecuttingRecipe(Blocks.COAL_BLOCK, ModBlocks.COAL_SLAB, consumer, 2);
        registerStonecuttingRecipe(Blocks.IRON_BLOCK, ModBlocks.IRON_STAIRS, consumer);
        registerStonecuttingRecipe(Blocks.IRON_BLOCK, ModBlocks.IRON_SLAB, consumer, 2);
        registerStonecuttingRecipe(Blocks.GOLD_BLOCK, ModBlocks.GOLD_STAIRS, consumer);
        registerStonecuttingRecipe(Blocks.GOLD_BLOCK, ModBlocks.GOLD_SLAB, consumer, 2);
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
    private static void registerStonecuttingRecipe(ItemLike input, RegistryObject<Block> output, Consumer<FinishedRecipe> consumer, int resultCount) {
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(input), RecipeCategory.BUILDING_BLOCKS, output.get(), resultCount)
                .unlockedBy(getHasName(input), has(input))
                .save(consumer,  SolidGoldStairsMod.MOD_ID + ":" + "stonecutting/" + getItemName(output.get()));
    }
    private static void registerStonecuttingRecipe(ItemLike input, RegistryObject<Block> output, Consumer<FinishedRecipe> consumer) {
        registerStonecuttingRecipe(input, output, consumer,1);
    }
}
