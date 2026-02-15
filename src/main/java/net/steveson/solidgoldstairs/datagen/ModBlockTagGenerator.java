package net.steveson.solidgoldstairs.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.steveson.solidgoldstairs.SolidGoldStairsMod;
import net.steveson.solidgoldstairs.block.ModBlocks;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {
    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, SolidGoldStairsMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(
                ModBlocks.COAL_STAIRS.get(),
                ModBlocks.COAL_SLAB.get(),
                ModBlocks.IRON_STAIRS.get(),
                ModBlocks.IRON_SLAB.get(),
                ModBlocks.GOLD_STAIRS.get(),
                ModBlocks.GOLD_SLAB.get(),
                ModBlocks.REDSTONE_STAIRS.get(),
                ModBlocks.REDSTONE_SLAB.get(),
                ModBlocks.EMERALD_STAIRS.get(),
                ModBlocks.EMERALD_SLAB.get(),
                ModBlocks.LAPIS_STAIRS.get(),
                ModBlocks.LAPIS_SLAB.get(),
                ModBlocks.DIAMOND_STAIRS.get(),
                ModBlocks.DIAMOND_SLAB.get(),
                ModBlocks.NETHERITE_STAIRS.get(),
                ModBlocks.NETHERITE_SLAB.get(),
                ModBlocks.AMETHYST_STAIRS.get(),
                ModBlocks.AMETHYST_SLAB.get(),

                ModBlocks.OXIDIZED_COPPER_SLAB.get(),
                ModBlocks.WEATHERED_COPPER_SLAB.get(),
                ModBlocks.EXPOSED_COPPER_SLAB.get(),
                ModBlocks.COPPER_SLAB.get(),

                ModBlocks.WAXED_OXIDIZED_COPPER_SLAB.get(),
                ModBlocks.WAXED_WEATHERED_COPPER_SLAB.get(),
                ModBlocks.WAXED_EXPOSED_COPPER_SLAB.get(),
                ModBlocks.WAXED_COPPER_SLAB.get()
        );

        this.tag(BlockTags.NEEDS_STONE_TOOL).add(
                ModBlocks.IRON_STAIRS.get(),
                ModBlocks.IRON_SLAB.get(),
                ModBlocks.LAPIS_STAIRS.get(),
                ModBlocks.LAPIS_SLAB.get(),

                ModBlocks.OXIDIZED_COPPER_SLAB.get(),
                ModBlocks.WEATHERED_COPPER_SLAB.get(),
                ModBlocks.EXPOSED_COPPER_SLAB.get(),
                ModBlocks.COPPER_SLAB.get(),

                ModBlocks.WAXED_OXIDIZED_COPPER_SLAB.get(),
                ModBlocks.WAXED_WEATHERED_COPPER_SLAB.get(),
                ModBlocks.WAXED_EXPOSED_COPPER_SLAB.get(),
                ModBlocks.WAXED_COPPER_SLAB.get()
        );
        this.tag(BlockTags.NEEDS_IRON_TOOL).add(
                ModBlocks.GOLD_STAIRS.get(),
                ModBlocks.GOLD_SLAB.get(),
                ModBlocks.EMERALD_STAIRS.get(),
                ModBlocks.EMERALD_SLAB.get(),
                ModBlocks.DIAMOND_STAIRS.get(),
                ModBlocks.DIAMOND_SLAB.get()
        );
        this.tag(BlockTags.NEEDS_DIAMOND_TOOL).add(
                ModBlocks.NETHERITE_STAIRS.get(),
                ModBlocks.NETHERITE_SLAB.get()
        );
        this.tag(BlockTags.STAIRS).add(
                ModBlocks.COAL_STAIRS.get(),
                ModBlocks.IRON_STAIRS.get(),
                ModBlocks.GOLD_STAIRS.get(),
                ModBlocks.REDSTONE_STAIRS.get(),
                ModBlocks.EMERALD_STAIRS.get(),
                ModBlocks.LAPIS_STAIRS.get(),
                ModBlocks.DIAMOND_STAIRS.get(),
                ModBlocks.NETHERITE_STAIRS.get(),
                ModBlocks.AMETHYST_STAIRS.get()
        );
        this.tag(BlockTags.SLABS).add(
                ModBlocks.COAL_SLAB.get(),
                ModBlocks.IRON_SLAB.get(),
                ModBlocks.GOLD_SLAB.get(),
                ModBlocks.REDSTONE_SLAB.get(),
                ModBlocks.EMERALD_SLAB.get(),
                ModBlocks.LAPIS_SLAB.get(),
                ModBlocks.DIAMOND_SLAB.get(),
                ModBlocks.NETHERITE_SLAB.get(),
                ModBlocks.AMETHYST_SLAB.get(),

                ModBlocks.OXIDIZED_COPPER_SLAB.get(),
                ModBlocks.WEATHERED_COPPER_SLAB.get(),
                ModBlocks.EXPOSED_COPPER_SLAB.get(),
                ModBlocks.COPPER_SLAB.get(),
                ModBlocks.WAXED_OXIDIZED_COPPER_SLAB.get(),
                ModBlocks.WAXED_WEATHERED_COPPER_SLAB.get(),
                ModBlocks.WAXED_EXPOSED_COPPER_SLAB.get(),
                ModBlocks.WAXED_COPPER_SLAB.get()
        );

        this.tag(BlockTags.GUARDED_BY_PIGLINS).add(
                ModBlocks.GOLD_STAIRS.get(),
                ModBlocks.GOLD_SLAB.get()
        );
    }
}
