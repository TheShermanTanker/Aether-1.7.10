package com.gildedgames.aether.inventory;

import javax.annotation.Nullable;

import com.gildedgames.aether.items.ItemsAether;
import com.gildedgames.aether.registry.achievements.AchievementsAether;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.InventoryBasic;
import net.minecraft.item.ItemStack;

public class InventoryLore extends InventoryBasic {

	private EntityPlayer player;

	public InventoryLore(EntityPlayer player) {
		super("Lore Item", false, 1);

		this.player = player;
	}

	@Override
	public void setInventorySlotContents(int index, @Nullable ItemStack stack) {
		if (stack != null && stack.getItem() == ItemsAether.loreBook) {
			this.player.triggerAchievement(AchievementsAether.loreception);
		}

		super.setInventorySlotContents(index, stack);
	}

}