package com.gildedgames.aether.registry.creativetabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import com.gildedgames.aether.blocks.BlocksAether;
import com.gildedgames.aether.items.ItemsAether;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class AetherCreativeTabs {

	public static AetherTab blocks = new AetherTab("aether_blocks"),
			tools = new AetherTab("aether_tools"),
			weapons = new AetherTab("aether_weapons"),
			armor = new AetherTab("aether_armor"),
			food = new AetherTab("aether_food"),
			accessories = new AetherTab("aether_accessories"),
			material = new AetherTab("aether_material"),
			misc = new AetherTab("aether_misc");

	public static void initialization() {
		blocks.setIcon(new ItemStack(BlocksAether.aetherGrass));
		tools.setIcon(new ItemStack(ItemsAether.gravititePickaxe));
		weapons.setIcon(new ItemStack(ItemsAether.gravititeSword));
		armor.setIcon(new ItemStack(ItemsAether.gravititeHelmet));
		food.setIcon(new ItemStack(ItemsAether.blueberry));
		accessories.setIcon(new ItemStack(ItemsAether.gravitite_gloves));
		material.setIcon(new ItemStack(ItemsAether.ambrosiumShard));
		misc.setIcon(new ItemStack(ItemsAether.dungeonKey));
	}

	public static class AetherTab extends CreativeTabs {

		private ItemStack stack;

		public AetherTab(String unlocalizedName) {
			super(unlocalizedName);
		}

		public AetherTab(String unlocalizedName, ItemStack stack) {
			super(unlocalizedName);
			this.stack = stack;
		}

		public void setIcon(ItemStack stack) {
			this.stack = stack;
		}

		@SideOnly(Side.CLIENT)
		public String getTranslatedTabLabel() {
			return "tab." + this.getTabLabel();
		}

		@Override
		public ItemStack getIconItemStack() {
			return stack;
		}

		@Override
		public Item getTabIconItem() {
			return stack.getItem();
		}

	}

}