package net.fabricmc.example;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.example.items.FabricItem;
import net.minecraft.util.registry.Registry;

public class ExampleMod implements ModInitializer {
	/**
	 * Initialize new Items
	 */
	public static FabricItem FABRIC_ITEM = new FabricItem();

	@Override
	public void onInitialize() {
		Registry.register(Registry.ITEM, FabricItem.ID(), FABRIC_ITEM);
	}
}
