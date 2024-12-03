package net.william.luexpansion.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.william.luexpansion.LUExpansion;

public class ModItems {
    public static final Item BANK_PLATFORM_EDGE = registerItem("bank_platform_edge_item",
            new Item(new FabricItemSettings().group(ModItemGroup.LUE_Central)));
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(LUExpansion.MOD_ID, name), item);
    }
    public static void registerModItems() {
        LUExpansion.LOGGER.debug("Registering Mod Items for " + LUExpansion.MOD_ID);
    }
}
