package com.gildedgames.aether.items.dungeon;

import com.gildedgames.aether.items.ItemsAether;
import com.gildedgames.aether.registry.creativetabs.AetherCreativeTabs;

import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemVictoryMedal extends Item {

	public ItemVictoryMedal() {
		super();

		this.setMaxStackSize(10);
		this.setCreativeTab(AetherCreativeTabs.misc);
	}

	@Override
	public EnumRarity getRarity(ItemStack stack) {
		return ItemsAether.aetherLoot;
	}

}