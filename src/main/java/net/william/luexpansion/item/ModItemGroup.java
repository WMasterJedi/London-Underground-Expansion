package net.william.luexpansion.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.william.luexpansion.LUExpansion;

public class ModItemGroup {
    public static final ItemGroup LUE_Central = FabricItemGroupBuilder.build(
            new Identifier(LUExpansion.MOD_ID, "luexpansioncentralline"), () -> new ItemStack(ModItems.BANK_PLATFORM_EDGE));
}
