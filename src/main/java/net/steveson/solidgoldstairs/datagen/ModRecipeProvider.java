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
        registerStairsCraftingRecipe(RecipeCategory.BUILDING_BLOCKS, Blocks.CHISELED_QUARTZ_BLOCK, ModBlocks.CHISELED_QUARTZ_STAIRS,consumer);
        registerSlabCraftingRecipe(RecipeCategory.BUILDING_BLOCKS, Blocks.CHISELED_QUARTZ_BLOCK, ModBlocks.CHISELED_QUARTZ_SLAB,consumer);
        registerStairsCraftingRecipe(RecipeCategory.BUILDING_BLOCKS, Blocks.QUARTZ_BRICKS, ModBlocks.QUARTZ_BRICK_STAIRS,consumer);
        registerSlabCraftingRecipe(RecipeCategory.BUILDING_BLOCKS, Blocks.QUARTZ_BRICKS, ModBlocks.QUARTZ_BRICK_SLAB,consumer);
        registerStairsCraftingRecipe(RecipeCategory.BUILDING_BLOCKS, Blocks.AMETHYST_BLOCK, ModBlocks.AMETHYST_STAIRS,consumer);
        registerSlabCraftingRecipe(RecipeCategory.BUILDING_BLOCKS, Blocks.AMETHYST_BLOCK, ModBlocks.AMETHYST_SLAB,consumer);

        registerStairsCraftingRecipe(RecipeCategory.BUILDING_BLOCKS, Blocks.OXIDIZED_COPPER, ModBlocks.OXIDIZED_COPPER_STAIRS,consumer);
        registerStairsCraftingRecipe(RecipeCategory.BUILDING_BLOCKS, Blocks.WEATHERED_COPPER, ModBlocks.WEATHERED_COPPER_STAIRS,consumer);
        registerStairsCraftingRecipe(RecipeCategory.BUILDING_BLOCKS, Blocks.EXPOSED_COPPER, ModBlocks.EXPOSED_COPPER_STAIRS,consumer);
        registerStairsCraftingRecipe(RecipeCategory.BUILDING_BLOCKS, Blocks.COPPER_BLOCK, ModBlocks.COPPER_STAIRS,consumer);
        registerStairsCraftingRecipe(RecipeCategory.BUILDING_BLOCKS, Blocks.WAXED_OXIDIZED_COPPER, ModBlocks.WAXED_OXIDIZED_COPPER_STAIRS,consumer);
        registerStairsCraftingRecipe(RecipeCategory.BUILDING_BLOCKS, Blocks.WAXED_WEATHERED_COPPER, ModBlocks.WAXED_WEATHERED_COPPER_STAIRS,consumer);
        registerStairsCraftingRecipe(RecipeCategory.BUILDING_BLOCKS, Blocks.WAXED_EXPOSED_COPPER, ModBlocks.WAXED_EXPOSED_COPPER_STAIRS,consumer);
        registerStairsCraftingRecipe(RecipeCategory.BUILDING_BLOCKS, Blocks.WAXED_COPPER_BLOCK, ModBlocks.WAXED_COPPER_STAIRS,consumer);

        registerSlabCraftingRecipe(RecipeCategory.BUILDING_BLOCKS, Blocks.OXIDIZED_COPPER, ModBlocks.OXIDIZED_COPPER_SLAB,consumer);
        registerSlabCraftingRecipe(RecipeCategory.BUILDING_BLOCKS, Blocks.WEATHERED_COPPER, ModBlocks.WEATHERED_COPPER_SLAB,consumer);
        registerSlabCraftingRecipe(RecipeCategory.BUILDING_BLOCKS, Blocks.EXPOSED_COPPER, ModBlocks.EXPOSED_COPPER_SLAB,consumer);
        registerSlabCraftingRecipe(RecipeCategory.BUILDING_BLOCKS, Blocks.COPPER_BLOCK, ModBlocks.COPPER_SLAB,consumer);
        registerSlabCraftingRecipe(RecipeCategory.BUILDING_BLOCKS, Blocks.WAXED_OXIDIZED_COPPER, ModBlocks.WAXED_OXIDIZED_COPPER_SLAB,consumer);
        registerSlabCraftingRecipe(RecipeCategory.BUILDING_BLOCKS, Blocks.WAXED_WEATHERED_COPPER, ModBlocks.WAXED_WEATHERED_COPPER_SLAB,consumer);
        registerSlabCraftingRecipe(RecipeCategory.BUILDING_BLOCKS, Blocks.WAXED_EXPOSED_COPPER, ModBlocks.WAXED_EXPOSED_COPPER_SLAB,consumer);
        registerSlabCraftingRecipe(RecipeCategory.BUILDING_BLOCKS, Blocks.WAXED_COPPER_BLOCK, ModBlocks.WAXED_COPPER_SLAB,consumer);

        registerStairsCraftingRecipe(RecipeCategory.BUILDING_BLOCKS, Blocks.GLOWSTONE, ModBlocks.GLOWSTONE_STAIRS,consumer);
        registerSlabCraftingRecipe(RecipeCategory.BUILDING_BLOCKS, Blocks.GLOWSTONE, ModBlocks.GLOWSTONE_SLAB,consumer);
        registerStairsCraftingRecipe(RecipeCategory.BUILDING_BLOCKS, Blocks.OBSIDIAN, ModBlocks.OBSIDIAN_STAIRS,consumer);
        registerSlabCraftingRecipe(RecipeCategory.BUILDING_BLOCKS, Blocks.OBSIDIAN, ModBlocks.OBSIDIAN_SLAB,consumer);
        registerStairsCraftingRecipe(RecipeCategory.BUILDING_BLOCKS, Blocks.CRYING_OBSIDIAN, ModBlocks.CRYING_OBSIDIAN_STAIRS,consumer);
        registerSlabCraftingRecipe(RecipeCategory.BUILDING_BLOCKS, Blocks.CRYING_OBSIDIAN, ModBlocks.CRYING_OBSIDIAN_SLAB,consumer);


        registerWaxCraftingRecipe(ModBlocks.OXIDIZED_COPPER_STAIRS, ModBlocks.WAXED_OXIDIZED_COPPER_STAIRS, consumer);
        registerWaxCraftingRecipe(ModBlocks.WEATHERED_COPPER_STAIRS, ModBlocks.WAXED_WEATHERED_COPPER_STAIRS, consumer);
        registerWaxCraftingRecipe(ModBlocks.EXPOSED_COPPER_STAIRS, ModBlocks.WAXED_EXPOSED_COPPER_STAIRS, consumer);
        registerWaxCraftingRecipe(ModBlocks.COPPER_STAIRS, ModBlocks.WAXED_COPPER_STAIRS, consumer);
        registerWaxCraftingRecipe(ModBlocks.OXIDIZED_COPPER_SLAB, ModBlocks.WAXED_OXIDIZED_COPPER_SLAB, consumer);
        registerWaxCraftingRecipe(ModBlocks.WEATHERED_COPPER_SLAB, ModBlocks.WAXED_WEATHERED_COPPER_SLAB, consumer);
        registerWaxCraftingRecipe(ModBlocks.EXPOSED_COPPER_SLAB, ModBlocks.WAXED_EXPOSED_COPPER_SLAB, consumer);
        registerWaxCraftingRecipe(ModBlocks.COPPER_SLAB, ModBlocks.WAXED_COPPER_SLAB, consumer);


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
        registerStonecuttingRecipe(Blocks.CHISELED_QUARTZ_BLOCK, ModBlocks.CHISELED_QUARTZ_STAIRS, consumer);
        registerStonecuttingRecipe(Blocks.CHISELED_QUARTZ_BLOCK, ModBlocks.CHISELED_QUARTZ_SLAB, consumer, 2);
        registerStonecuttingRecipe(Blocks.QUARTZ_BRICKS, ModBlocks.QUARTZ_BRICK_STAIRS, consumer);
        registerStonecuttingRecipe(Blocks.QUARTZ_BRICKS, ModBlocks.QUARTZ_BRICK_SLAB, consumer, 2);
        registerStonecuttingRecipe(Blocks.AMETHYST_BLOCK, ModBlocks.AMETHYST_STAIRS, consumer);
        registerStonecuttingRecipe(Blocks.AMETHYST_BLOCK, ModBlocks.AMETHYST_SLAB, consumer, 2);

        registerStonecuttingRecipe(Blocks.OXIDIZED_COPPER, ModBlocks.OXIDIZED_COPPER_STAIRS, consumer);
        registerStonecuttingRecipe(Blocks.WEATHERED_COPPER, ModBlocks.WEATHERED_COPPER_STAIRS, consumer);
        registerStonecuttingRecipe(Blocks.EXPOSED_COPPER, ModBlocks.EXPOSED_COPPER_STAIRS, consumer);
        registerStonecuttingRecipe(Blocks.COPPER_BLOCK, ModBlocks.COPPER_STAIRS, consumer);
        registerStonecuttingRecipe(Blocks.WAXED_OXIDIZED_COPPER, ModBlocks.WAXED_OXIDIZED_COPPER_STAIRS, consumer);
        registerStonecuttingRecipe(Blocks.WAXED_WEATHERED_COPPER, ModBlocks.WAXED_WEATHERED_COPPER_STAIRS, consumer);
        registerStonecuttingRecipe(Blocks.WAXED_EXPOSED_COPPER, ModBlocks.WAXED_EXPOSED_COPPER_STAIRS, consumer);
        registerStonecuttingRecipe(Blocks.WAXED_COPPER_BLOCK, ModBlocks.WAXED_COPPER_STAIRS, consumer);

        registerStonecuttingRecipe(Blocks.OXIDIZED_COPPER, ModBlocks.OXIDIZED_COPPER_SLAB, consumer, 2);
        registerStonecuttingRecipe(Blocks.WEATHERED_COPPER, ModBlocks.WEATHERED_COPPER_SLAB, consumer, 2);
        registerStonecuttingRecipe(Blocks.EXPOSED_COPPER, ModBlocks.EXPOSED_COPPER_SLAB, consumer, 2);
        registerStonecuttingRecipe(Blocks.COPPER_BLOCK, ModBlocks.COPPER_SLAB, consumer, 2);
        registerStonecuttingRecipe(Blocks.WAXED_OXIDIZED_COPPER, ModBlocks.WAXED_OXIDIZED_COPPER_SLAB, consumer, 2);
        registerStonecuttingRecipe(Blocks.WAXED_WEATHERED_COPPER, ModBlocks.WAXED_WEATHERED_COPPER_SLAB, consumer, 2);
        registerStonecuttingRecipe(Blocks.WAXED_EXPOSED_COPPER, ModBlocks.WAXED_EXPOSED_COPPER_SLAB, consumer, 2);
        registerStonecuttingRecipe(Blocks.WAXED_COPPER_BLOCK, ModBlocks.WAXED_COPPER_SLAB, consumer, 2);

        registerStonecuttingRecipe(Blocks.GLOWSTONE, ModBlocks.GLOWSTONE_STAIRS, consumer);
        registerStonecuttingRecipe(Blocks.GLOWSTONE, ModBlocks.GLOWSTONE_SLAB, consumer, 2);
        registerStonecuttingRecipe(Blocks.OBSIDIAN, ModBlocks.OBSIDIAN_STAIRS, consumer);
        registerStonecuttingRecipe(Blocks.OBSIDIAN, ModBlocks.OBSIDIAN_SLAB, consumer, 2);
        registerStonecuttingRecipe(Blocks.CRYING_OBSIDIAN, ModBlocks.CRYING_OBSIDIAN_STAIRS, consumer);
        registerStonecuttingRecipe(Blocks.CRYING_OBSIDIAN, ModBlocks.CRYING_OBSIDIAN_SLAB, consumer, 2);
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


    private static void registerWaxCraftingRecipe(RegistryObject<Block> input, RegistryObject<Block> output, Consumer<FinishedRecipe> consumer) {
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, output.get())
                .requires(input.get())
                .requires(Items.HONEYCOMB)
                .unlockedBy(getHasName(input.get()), has(input.get()))
                .save(consumer,  SolidGoldStairsMod.MOD_ID + ":" + "crafting/" + getItemName(output.get()) + "_from_honeycomb");
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
