package com.gildedgames.aether.registry;

import net.minecraft.item.ItemStack;

import com.gildedgames.aether.items.block.ItemBlockEnchanter;

import cpw.mods.fml.common.registry.GameRegistry;

public class AetherLore {

	public static boolean hasKey;

	public static String getLoreEntryKey(ItemStack stack) {

		if (stack.getItem() instanceof ItemBlockEnchanter)
		{
			return "lore." + GameRegistry.findUniqueIdentifierFor(stack.getItem()).modId + ".enchanter";
		}
		else
		{
			return "lore." + GameRegistry.findUniqueIdentifierFor(stack.getItem()).modId + "." + stack.getUnlocalizedName().replace("item.", "").replace("tile.", "").replace(".name", "").replace(".", "_");
		}
	}
}