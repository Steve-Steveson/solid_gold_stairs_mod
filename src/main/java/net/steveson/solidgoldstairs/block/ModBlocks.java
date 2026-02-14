package net.steveson.solidgoldstairs.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.steveson.solidgoldstairs.SolidGoldStairsMod;
import net.steveson.solidgoldstairs.item.ModItems;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, SolidGoldStairsMod.MOD_ID);


    public static final RegistryObject<Block> COAL_STAIRS = registerBlock("coal_stairs",
            ()-> new StairBlock(()-> Blocks.COAL_BLOCK.defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.COAL_BLOCK)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 5;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 5;
                }
            });
    public static final RegistryObject<Block> COAL_SLAB = registerBlock("coal_slab",
            ()-> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.COAL_BLOCK)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 5;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 5;
                }
            });


    public static final RegistryObject<Block> IRON_STAIRS = registerBlock("iron_stairs",
            ()-> new StairBlock(()-> Blocks.IRON_BLOCK.defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));
    public static final RegistryObject<Block> IRON_SLAB = registerBlock("iron_slab",
            ()-> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));

    public static final RegistryObject<Block> GOLD_STAIRS = registerBlock("gold_stairs",
            ()-> new StairBlock(()-> Blocks.GOLD_BLOCK.defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.GOLD_BLOCK)));
    public static final RegistryObject<Block> GOLD_SLAB = registerBlock("gold_slab",
            ()-> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.GOLD_BLOCK)));


    public static final RegistryObject<Block> EMERALD_STAIRS = registerBlock("emerald_stairs",
            ()-> new StairBlock(()-> Blocks.EMERALD_BLOCK.defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.EMERALD_BLOCK)));
    public static final RegistryObject<Block> EMERALD_SLAB = registerBlock("emerald_slab",
            ()-> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.EMERALD_BLOCK)));

    public static final RegistryObject<Block> LAPIS_STAIRS = registerBlock("lapis_stairs",
            ()-> new StairBlock(()-> Blocks.LAPIS_BLOCK.defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.LAPIS_BLOCK)));
    public static final RegistryObject<Block> LAPIS_SLAB = registerBlock("lapis_slab",
            ()-> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.LAPIS_BLOCK)));

    public static final RegistryObject<Block> DIAMOND_STAIRS = registerBlock("diamond_stairs",
            ()-> new StairBlock(()-> Blocks.DIAMOND_BLOCK.defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.DIAMOND_BLOCK)));
    public static final RegistryObject<Block> DIAMOND_SLAB = registerBlock("diamond_slab",
            ()-> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.DIAMOND_BLOCK)));

    public static final RegistryObject<Block> NETHERITE_STAIRS = registerBlock("netherite_stairs",
            ()-> new StairBlock(()-> Blocks.NETHERITE_BLOCK.defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.NETHERITE_BLOCK)));
    public static final RegistryObject<Block> NETHERITE_SLAB = registerBlock("netherite_slab",
            ()-> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.NETHERITE_BLOCK)));

    public static final RegistryObject<Block> AMETHYST_STAIRS = registerBlock("amethyst_stairs",
            ()-> new StairBlock(()-> Blocks.AMETHYST_BLOCK.defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK)));
    public static final RegistryObject<Block> AMETHYST_SLAB = registerBlock("amethyst_slab",
            ()-> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK)));



    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, ()-> new BlockItem(block.get(), new Item.Properties()));
    }
    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
