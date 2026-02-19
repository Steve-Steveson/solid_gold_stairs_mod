package net.steveson.solidgoldstairs.block;

import net.minecraft.client.particle.GlowParticle;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.ToolAction;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.steveson.solidgoldstairs.SolidGoldStairsMod;
import net.steveson.solidgoldstairs.block.custom.PoweredSlabBlock;
import net.steveson.solidgoldstairs.block.custom.PoweredStairBlock;
import net.steveson.solidgoldstairs.block.custom.UncutWeatheringCopperSlabBlock;
import net.steveson.solidgoldstairs.item.ModItems;

import javax.annotation.Nullable;
import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, SolidGoldStairsMod.MOD_ID);


    public static final RegistryObject<Block> COAL_STAIRS = registerFuelBlock("coal_stairs",
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
            }, 16000);
    public static final RegistryObject<Block> COAL_SLAB = registerFuelBlock("coal_slab",
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
            }, 8000);


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

    public static final RegistryObject<Block> REDSTONE_STAIRS = registerBlock("redstone_stairs",
            ()-> new PoweredStairBlock(()-> Blocks.REDSTONE_BLOCK.defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.REDSTONE_BLOCK)));
    public static final RegistryObject<Block> REDSTONE_SLAB = registerBlock("redstone_slab",
            ()-> new PoweredSlabBlock(BlockBehaviour.Properties.copy(Blocks.REDSTONE_BLOCK)));

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

    public static final RegistryObject<Block> NETHERITE_STAIRS = registerBlockNetherite("netherite_stairs",
            ()-> new StairBlock(()-> Blocks.NETHERITE_BLOCK.defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.NETHERITE_BLOCK)));
    public static final RegistryObject<Block> NETHERITE_SLAB = registerBlockNetherite("netherite_slab",
            ()-> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.NETHERITE_BLOCK)));

    public static final RegistryObject<Block> AMETHYST_STAIRS = registerBlock("amethyst_stairs",
            ()-> new StairBlock(()-> Blocks.AMETHYST_BLOCK.defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK)));
    public static final RegistryObject<Block> AMETHYST_SLAB = registerBlock("amethyst_slab",
            ()-> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK)));


    public static final RegistryObject<Block> OXIDIZED_COPPER_SLAB = registerBlock("oxidized_copper_slab",
            ()-> new UncutWeatheringCopperSlabBlock(WeatheringCopper.WeatherState.OXIDIZED, BlockBehaviour.Properties.copy(Blocks.OXIDIZED_COPPER)));
    public static final RegistryObject<Block> WEATHERED_COPPER_SLAB = registerBlock("weathered_copper_slab",
            ()-> new UncutWeatheringCopperSlabBlock(WeatheringCopper.WeatherState.WEATHERED, BlockBehaviour.Properties.copy(Blocks.WEATHERED_COPPER)));
    public static final RegistryObject<Block> EXPOSED_COPPER_SLAB = registerBlock("exposed_copper_slab",
            ()-> new UncutWeatheringCopperSlabBlock(WeatheringCopper.WeatherState.EXPOSED, BlockBehaviour.Properties.copy(Blocks.EXPOSED_COPPER)));
    public static final RegistryObject<Block> COPPER_SLAB = registerBlock("copper_slab",
            ()-> new UncutWeatheringCopperSlabBlock(WeatheringCopper.WeatherState.UNAFFECTED, BlockBehaviour.Properties.copy(Blocks.COPPER_BLOCK)));


    public static final RegistryObject<Block> WAXED_OXIDIZED_COPPER_SLAB = registerBlock("waxed_oxidized_copper_slab",
            ()-> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.WAXED_OXIDIZED_COPPER)) {
                @Override
                public @org.jetbrains.annotations.Nullable BlockState getToolModifiedState(BlockState state, UseOnContext context, ToolAction toolAction, boolean simulate) {
                   if(context.getItemInHand().getItem() instanceof AxeItem) {
                       return ModBlocks.OXIDIZED_COPPER_SLAB.get().defaultBlockState().setValue(TYPE, state.getValue(TYPE));
                   }
                   return super.getToolModifiedState(state, context, toolAction, simulate);
                }
            });
    public static final RegistryObject<Block> WAXED_WEATHERED_COPPER_SLAB = registerBlock("waxed_weathered_copper_slab",
            ()-> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.WAXED_WEATHERED_COPPER)) {
                @Override
                public @org.jetbrains.annotations.Nullable BlockState getToolModifiedState(BlockState state, UseOnContext context, ToolAction toolAction, boolean simulate) {
                    if(context.getItemInHand().getItem() instanceof AxeItem) {
                        return ModBlocks.WEATHERED_COPPER_SLAB.get().defaultBlockState().setValue(TYPE, state.getValue(TYPE));
                    }
                    return super.getToolModifiedState(state, context, toolAction, simulate);
                }
            });
    public static final RegistryObject<Block> WAXED_EXPOSED_COPPER_SLAB = registerBlock("waxed_exposed_copper_slab",
            ()-> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.WAXED_EXPOSED_COPPER)) {
                @Override
                public @org.jetbrains.annotations.Nullable BlockState getToolModifiedState(BlockState state, UseOnContext context, ToolAction toolAction, boolean simulate) {
                    if(context.getItemInHand().getItem() instanceof AxeItem) {
                        return ModBlocks.EXPOSED_COPPER_SLAB.get().defaultBlockState().setValue(TYPE, state.getValue(TYPE));
                    }
                    return super.getToolModifiedState(state, context, toolAction, simulate);
                }
            });
    public static final RegistryObject<Block> WAXED_COPPER_SLAB = registerBlock("waxed_copper_slab",
            ()-> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.WAXED_COPPER_BLOCK)) {
                @Override
                public @org.jetbrains.annotations.Nullable BlockState getToolModifiedState(BlockState state, UseOnContext context, ToolAction toolAction, boolean simulate) {
                    if(context.getItemInHand().getItem() instanceof AxeItem) {
                        return ModBlocks.COPPER_SLAB.get().defaultBlockState().setValue(TYPE, state.getValue(TYPE));
                    }
                    return super.getToolModifiedState(state, context, toolAction, simulate);
                }
            });

//GlowParticle.WaxOffProvider



    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }
    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, ()-> new BlockItem(block.get(), new Item.Properties()));
    }


    private static <T extends Block> RegistryObject<T> registerFuelBlock(String name, Supplier<T> block, int burnTime) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerFuelBlockItem(name, toReturn, burnTime);
        return toReturn;
    }
    private static <T extends Block> RegistryObject<Item> registerFuelBlockItem(String name, RegistryObject<T> block, int burnTime) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()) {
            @Override
            public int getBurnTime(ItemStack itemStack, @Nullable RecipeType<?> recipeType) {
                return burnTime;
            }
        });
    }


    private static <T extends Block> RegistryObject<T> registerBlockNetherite(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItemNetherite(name, toReturn);
        return toReturn;
    }
    private static <T extends Block> RegistryObject<Item> registerBlockItemNetherite(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, ()-> new BlockItem(block.get(), new Item.Properties().fireResistant()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
