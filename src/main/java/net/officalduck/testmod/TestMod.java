package net.officalduck.testmod;

import net.fabricmc.api.ModInitializer;

import net.officalduck.testmod.block.ModBlocks;
import net.officalduck.testmod.item.ModItemGroup;
import net.officalduck.testmod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestMod implements ModInitializer
{
	public static final String MOD_ID = "test-mod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize()
	{
		ModItems.registerModItems();
		ModItemGroup.registerItemGroups();
		ModBlocks.registerModBloks();
	}
}