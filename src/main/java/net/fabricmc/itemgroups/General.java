package net.fabricmc.itemgroups;

import net.fabricmc.example.Definitions;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;

public class General {
    public static ItemGroup ItemGroup = FabricItemGroupBuilder.build(
		new Identifier(Definitions.modID, "general"),
        () -> new ItemStack(Items.NETHER_STAR)
    );
}