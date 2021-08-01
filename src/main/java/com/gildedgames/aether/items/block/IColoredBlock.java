package com.gildedgames.aether.items.block;

import net.minecraft.item.ItemStack;

public interface IColoredBlock {

	public int getColorFromItemStack(ItemStack stack, int pass);

}