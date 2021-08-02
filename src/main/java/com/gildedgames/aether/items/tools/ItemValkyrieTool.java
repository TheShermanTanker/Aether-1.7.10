package com.gildedgames.aether.items.tools;

import com.gildedgames.aether.items.ItemsAether;
import com.gildedgames.aether.items.util.EnumAetherToolType;

import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;

public class ItemValkyrieTool extends ItemAetherTool {

	public ItemValkyrieTool(float damage, EnumAetherToolType toolType) {
		super(damage, ToolMaterial.EMERALD, toolType);
	}

	@Override
	public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) {
		return false;
	}

	@Override
	public EnumRarity getRarity(ItemStack stack) {
		return ItemsAether.aetherLoot;
	}

}