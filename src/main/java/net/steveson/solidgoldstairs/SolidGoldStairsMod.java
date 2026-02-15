package net.steveson.solidgoldstairs;

import com.mojang.logging.LogUtils;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.steveson.solidgoldstairs.block.ModBlocks;
import net.steveson.solidgoldstairs.item.ModItems;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(SolidGoldStairsMod.MOD_ID)
public class SolidGoldStairsMod
{
    // Define mod id in a common place for everything to reference
    public static final String MOD_ID = "solid_gold_stairs";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();
    public SolidGoldStairsMod(FMLJavaModLoadingContext context)
    {
        IEventBus modEventBus = context.getModEventBus();

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);

        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);

        modEventBus.addListener(this::addCreative);

        context.registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {

    }

    // Add the example block item to the building blocks tab
    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if(event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
            event.accept(ModBlocks.COAL_STAIRS);
            event.accept(ModBlocks.COAL_SLAB);
            event.accept(ModBlocks.IRON_STAIRS);
            event.accept(ModBlocks.IRON_SLAB);
            event.accept(ModBlocks.GOLD_STAIRS);
            event.accept(ModBlocks.GOLD_SLAB);

            event.accept(ModBlocks.REDSTONE_SLAB);
            event.accept(ModBlocks.EMERALD_STAIRS);
            event.accept(ModBlocks.EMERALD_SLAB);
            event.accept(ModBlocks.LAPIS_STAIRS);
            event.accept(ModBlocks.LAPIS_SLAB);
            event.accept(ModBlocks.DIAMOND_STAIRS);
            event.accept(ModBlocks.DIAMOND_SLAB);
            event.accept(ModBlocks.NETHERITE_STAIRS);
            event.accept(ModBlocks.NETHERITE_SLAB);
            event.accept(ModBlocks.AMETHYST_STAIRS);
            event.accept(ModBlocks.AMETHYST_SLAB);
        }
        if (event.getTabKey() == CreativeModeTabs.REDSTONE_BLOCKS) {
            event.accept(ModBlocks.REDSTONE_SLAB);
        }
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)
    {

    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {

        }
    }
}
