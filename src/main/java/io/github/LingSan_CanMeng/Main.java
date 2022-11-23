package io.github.LingSan_CanMeng;

import io.github.LingSan_CanMeng.Blocks.ModBlocksMain;
import io.github.LingSan_CanMeng.items.ModItemsMain;
import io.github.LingSan_CanMeng.items.ModItemsFuelRegistry;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main implements ModInitializer {

	public static final String MOD_ID = "lscm";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemsMain.registerItems();
		ModBlocksMain.registerBlocks();
		ModItemsFuelRegistry.registerFuel();
	}
}
