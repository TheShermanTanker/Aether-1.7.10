package com.gildedgames.aether.items.food;

import com.gildedgames.aether.items.ItemsAether;
import com.gildedgames.aether.registry.creativetabs.AetherCreativeTabs;

import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemFood;

import net.minecraft.item.ItemStack;

public class ItemAetherFood extends ItemFood {

	public ItemAetherFood(int healAmmount) {
		super(healAmmount, false);
		this.setCreativeTab(AetherCreativeTabs.food);
	}

	public ItemAetherFood(int healAmmount, float saturationAmmount) {
		super(healAmmount, saturationAmmount, false);
		this.setCreativeTab(AetherCreativeTabs.food);
	}

	@Override
	public EnumRarity getRarity(ItemStack p_77613_1_) {
		return p_77613_1_.getItem() == ItemsAether.enchantedBlueberry ? EnumRarity.rare : super.getRarity(p_77613_1_);
	}
}