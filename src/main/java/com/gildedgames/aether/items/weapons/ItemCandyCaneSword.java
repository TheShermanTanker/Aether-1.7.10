package com.gildedgames.aether.items.weapons;

import java.util.Random;

import com.gildedgames.aether.items.ItemsAether;
import com.gildedgames.aether.registry.creativetabs.AetherCreativeTabs;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;

public class ItemCandyCaneSword extends ItemSword {

	public ItemCandyCaneSword() {
		super(ToolMaterial.GOLD);
		this.setCreativeTab(AetherCreativeTabs.weapons);
	}

	@Override
	public boolean getIsRepairable(ItemStack par1ItemStack, ItemStack material) {
		return material.getItem() == ItemsAether.candyCane;
	}

	@Override
	public boolean hitEntity(ItemStack itemstack, EntityLivingBase entityliving, EntityLivingBase entityliving1) {
		if (entityliving.deathTime > 0) {
			return true;
		} else {
			if ((new Random()).nextBoolean() && entityliving1 != null && entityliving1 instanceof EntityPlayer && !entityliving1.worldObj.isRemote && entityliving.hurtTime > 0) {
				entityliving.dropItem(ItemsAether.candyCane, 1);
			}

			itemstack.damageItem(1, entityliving1);
			return true;
		}
	}

}