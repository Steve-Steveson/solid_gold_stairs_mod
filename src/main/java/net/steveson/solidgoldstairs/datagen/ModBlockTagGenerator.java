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
                ModBlocks.GOLD_STAIRS.get(),
                ModBlocks.GOLD_SLAB.get()
        );
        this.tag(BlockTags.NEEDS_IRON_TOOL).add(
                ModBlocks.GOLD_STAIRS.get(),
                ModBlocks.GOLD_SLAB.get()
        );
        this.tag(BlockTags.STAIRS).add(
                ModBlocks.GOLD_STAIRS.get()
        );
        this.tag(BlockTags.SLABS).add(
                ModBlocks.GOLD_SLAB.get()
        );
        this.tag(BlockTags.GUARDED_BY_PIGLINS).add(
                ModBlocks.GOLD_STAIRS.get(),
                ModBlocks.GOLD_SLAB.get()
        );
    }
}
