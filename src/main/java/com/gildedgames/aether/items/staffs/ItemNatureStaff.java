package com.gildedgames.aether.items.staffs;

import com.gildedgames.aether.registry.creativetabs.AetherCreativeTabs;

import net.minecraft.item.Item;

public class ItemNatureStaff extends Item {

	public ItemNatureStaff() {
		this.setFull3D();
		this.setMaxDamage(100);
		this.setMaxStackSize(1);
		this.setCreativeTab(AetherCreativeTabs.misc);
	}

}