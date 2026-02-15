package net.steveson.solidgoldstairs.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.steveson.solidgoldstairs.SolidGoldStairsMod;
import net.steveson.solidgoldstairs.block.ModBlocks;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, SolidGoldStairsMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        evenSimplerBlockItem(ModBlocks.COAL_STAIRS);
        evenSimplerBlockItem(ModBlocks.COAL_SLAB);
        evenSimplerBlockItem(ModBlocks.IRON_STAIRS);
        evenSimplerBlockItem(ModBlocks.IRON_SLAB);
        evenSimplerBlockItem(ModBlocks.GOLD_STAIRS);
        evenSimplerBlockItem(ModBlocks.GOLD_SLAB);

        evenSimplerBlockItem(ModBlocks.REDSTONE_SLAB);
        evenSimplerBlockItem(ModBlocks.EMERALD_STAIRS);
        evenSimplerBlockItem(ModBlocks.EMERALD_SLAB);
        evenSimplerBlockItem(ModBlocks.LAPIS_STAIRS);
        evenSimplerBlockItem(ModBlocks.LAPIS_SLAB);
        evenSimplerBlockItem(ModBlocks.DIAMOND_STAIRS);
        evenSimplerBlockItem(ModBlocks.DIAMOND_SLAB);
        evenSimplerBlockItem(ModBlocks.NETHERITE_STAIRS);
        evenSimplerBlockItem(ModBlocks.NETHERITE_SLAB);
        evenSimplerBlockItem(ModBlocks.AMETHYST_STAIRS);
        evenSimplerBlockItem(ModBlocks.AMETHYST_SLAB);
    }

    public void evenSimplerBlockItem(RegistryObject<Block> block) {
        this.withExistingParent(SolidGoldStairsMod.MOD_ID + ":" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath(),
                modLoc("block/" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath()));
    }
}
