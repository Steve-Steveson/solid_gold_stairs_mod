package net.steveson.solidgoldstairs.datagen.loot;

import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;
import net.steveson.solidgoldstairs.block.ModBlocks;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        this.dropSelf(ModBlocks.COAL_STAIRS.get());
        this.dropSelf(ModBlocks.IRON_STAIRS.get());
        this.dropSelf(ModBlocks.GOLD_STAIRS.get());
        this.dropSelf(ModBlocks.REDSTONE_STAIRS.get());
        this.dropSelf(ModBlocks.EMERALD_STAIRS.get());
        this.dropSelf(ModBlocks.LAPIS_STAIRS.get());
        this.dropSelf(ModBlocks.DIAMOND_STAIRS.get());
        this.dropSelf(ModBlocks.NETHERITE_STAIRS.get());
        this.dropSelf(ModBlocks.AMETHYST_STAIRS.get());

        this.add(ModBlocks.COAL_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.COAL_SLAB.get()));
        this.add(ModBlocks.IRON_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.IRON_SLAB.get()));
        this.add(ModBlocks.GOLD_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.GOLD_SLAB.get()));
        this.add(ModBlocks.REDSTONE_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.REDSTONE_SLAB.get()));
        this.add(ModBlocks.EMERALD_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.EMERALD_SLAB.get()));
        this.add(ModBlocks.LAPIS_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.LAPIS_SLAB.get()));
        this.add(ModBlocks.DIAMOND_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.DIAMOND_SLAB.get()));
        this.add(ModBlocks.NETHERITE_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.NETHERITE_SLAB.get()));
        this.add(ModBlocks.AMETHYST_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.AMETHYST_SLAB.get()));

        this.add(ModBlocks.OXIDIZED_COPPER_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.OXIDIZED_COPPER_SLAB.get()));
        this.add(ModBlocks.WEATHERED_COPPER_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.WEATHERED_COPPER_SLAB.get()));
        this.add(ModBlocks.EXPOSED_COPPER_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.EXPOSED_COPPER_SLAB.get()));
        this.add(ModBlocks.COPPER_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.COPPER_SLAB.get()));
        this.add(ModBlocks.WAXED_OXIDIZED_COPPER_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.WAXED_OXIDIZED_COPPER_SLAB.get()));
        this.add(ModBlocks.WAXED_WEATHERED_COPPER_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.WAXED_WEATHERED_COPPER_SLAB.get()));
        this.add(ModBlocks.WAXED_EXPOSED_COPPER_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.WAXED_EXPOSED_COPPER_SLAB.get()));
        this.add(ModBlocks.WAXED_COPPER_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.WAXED_COPPER_SLAB.get()));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
