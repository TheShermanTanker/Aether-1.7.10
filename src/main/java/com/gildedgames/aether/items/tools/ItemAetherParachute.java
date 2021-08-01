package com.gildedgames.aether.items.tools;

import com.gildedgames.aether.entities.passive.mountable.EntityParachute;
import com.gildedgames.aether.items.ItemsAether;
import com.gildedgames.aether.registry.creativetabs.AetherCreativeTabs;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemAetherParachute extends Item {

	public ItemAetherParachute() {
		this.setMaxDamage(20);
		this.setMaxStackSize(1);
		this.setCreativeTab(AetherCreativeTabs.misc);
	}

	public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer entityplayer) {
		ItemStack heldItem = entityplayer.getHeldItem();

		if (EntityParachute.entityHasRoomForCloud(world, entityplayer)) {
			if (this == ItemsAether.goldenParachute) {
				heldItem.damageItem(1, entityplayer);
			} else {
				--heldItem.stackSize;
			}

			world.spawnEntityInWorld(new EntityParachute(world, entityplayer, this == ItemsAether.goldenParachute));

			return heldItem;
		}

		return super.onItemRightClick(stack, world, entityplayer);
	}

	public int getColorFromItemStack(ItemStack stack, int renderPass) {
		if (this == ItemsAether.goldenParachute) return 0xffff7f;

		return 0xffffff;
	}

}