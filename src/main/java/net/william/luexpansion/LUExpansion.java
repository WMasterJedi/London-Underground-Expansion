package net.william.luexpansion;

import net.fabricmc.api.ModInitializer;
import net.william.luexpansion.block.ModBlocks;
import net.william.luexpansion.item.ModItems;
import net.william.luexpansion.sound.ModSounds;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LUExpansion implements ModInitializer {

	public static final String MOD_ID = "luexpansion";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModSounds.registerSounds();
	}
}
