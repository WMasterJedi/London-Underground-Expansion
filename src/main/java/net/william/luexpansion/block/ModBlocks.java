package net.william.luexpansion.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.BlockView;
import net.william.luexpansion.LUExpansion;
import net.william.luexpansion.block.custom.RotatableBlock;
import net.william.luexpansion.item.ModItemGroup;

public class ModBlocks {
    public static final Block BANK_PLATFORM_EDGE = registerBlock("bank_platform_edge",
            new RotatableBlock(FabricBlockSettings.of(Material.STONE).nonOpaque()), ModItemGroup.LUE_Central);

    public static final Block BANK_PLATFORM_EDGE_GAP = registerBlock("bank_platform_edge_gap",
            new RotatableBlock(FabricBlockSettings.of(Material.STONE).nonOpaque()), ModItemGroup.LUE_Central);

    public static final Block BANK_EASTBOUND_PLATFORM_MIDDLE = registerBlock("bank_eastbound_platform_middle",
            new RotatableBlock(FabricBlockSettings.of(Material.STONE)), ModItemGroup.LUE_Central);

    public static final Block BANK_EASTBOUND_PLATFORM_SIDE = registerBlock("bank_eastbound_platform_side",
            new RotatableBlock(FabricBlockSettings.of(Material.STONE)), ModItemGroup.LUE_Central);

    public static final Block BANK_TILES = registerBlock("bank_tiles",
            new Block(FabricBlockSettings.of(Material.STONE)), ModItemGroup.LUE_Central);

    public static final Block BANK_CEILING_LIGHT = registerBlock("bank_ceiling_light",
            new RotatableBlock(FabricBlockSettings.of(Material.STONE).postProcess(ModBlocks::always).emissiveLighting(ModBlocks::always).luminance(value -> 15)), ModItemGroup.LUE_Central);

    private static Block registerBlock(String name, Block block, ItemGroup tab) {
        registerBlockItem(name, block, tab);
        return Registry.register(Registry.BLOCK, new Identifier(LUExpansion.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup tab) {
        return Registry.register(Registry.ITEM, new Identifier(LUExpansion.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(tab)));
    }

    public static void registerModBlocks() {
        LUExpansion.LOGGER.debug("Registering ModBlocks for " + LUExpansion.MOD_ID);
    }

    public static boolean always(BlockState state, BlockView world, BlockPos pos) {
        return true;
    }
}
