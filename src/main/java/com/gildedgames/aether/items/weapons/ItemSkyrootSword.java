package com.gildedgames.aether.items.weapons;

import com.gildedgames.aether.blocks.BlocksAether;
import com.gildedgames.aether.registry.creativetabs.AetherCreativeTabs;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;

public class ItemSkyrootSword extends ItemSword {

	public ItemSkyrootSword() {
		super(ToolMaterial.WOOD);
		this.setCreativeTab(AetherCreativeTabs.weapons);
	}

	@Override
	public boolean getIsRepairable(ItemStack repairingItem, ItemStack material) {
		return material.getItem() == Item.getItemFromBlock(BlocksAether.golden_oak_log) || material.getItem() == Item.getItemFromBlock(BlocksAether.skyroot_log) || material.getItem() == Item.getItemFromBlock(BlocksAether.skyroot_planks);
	}

}