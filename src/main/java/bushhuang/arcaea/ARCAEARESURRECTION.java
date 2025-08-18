package bushhuang.arcaea;

import bushhuang.arcaea.block.ModBlocks;
import bushhuang.arcaea.item.ModItemGroups;
import bushhuang.arcaea.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ARCAEARESURRECTION implements ModInitializer {
	public static final String MOD_ID = "arcaea-resurrection";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModItemGroups.registerModGroups();

		LOGGER.info("Hello Arcaea World!");
	}
}