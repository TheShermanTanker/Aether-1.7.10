package com.gildedgames.aether.items;

import com.gildedgames.aether.Aether;
import com.gildedgames.aether.network.AetherGUIHandler;
import com.gildedgames.aether.registry.creativetabs.AetherCreativeTabs;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemLoreBook extends Item {

	public ItemLoreBook() {
		this.setMaxStackSize(1);
		this.setCreativeTab(AetherCreativeTabs.misc);
	}

	@Override
	public EnumRarity getRarity(ItemStack stack) {
		return ItemsAether.aetherLoot;
	}

	@Override
	public ItemStack onItemRightClick(ItemStack stackIn, World worldIn, EntityPlayer playerIn) {
		playerIn.openGui(Aether.aether, AetherGUIHandler.LORE, worldIn, (int) playerIn.posX, (int) playerIn.posY, (int) playerIn.posZ);

		return playerIn.getHeldItem();
	}

}