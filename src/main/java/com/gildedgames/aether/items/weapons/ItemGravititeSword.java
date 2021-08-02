package com.gildedgames.aether.items.weapons;

import com.gildedgames.aether.blocks.BlocksAether;
import com.gildedgames.aether.registry.creativetabs.AetherCreativeTabs;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.network.play.server.S12PacketEntityVelocity;

public class ItemGravititeSword extends ItemSword {

	public ItemGravititeSword() {
		super(ToolMaterial.EMERALD);
		this.setCreativeTab(AetherCreativeTabs.weapons);
	}

	@Override
	public boolean getIsRepairable(ItemStack repairingItem, ItemStack material) {
		return material.getItem() == Item.getItemFromBlock(BlocksAether.enchantedGravitite);
	}

	@Override
	public boolean hitEntity(ItemStack itemstack, EntityLivingBase hitentity, EntityLivingBase player) {
		if ((hitentity.hurtTime > 0 || hitentity.deathTime > 0)) {
			hitentity.addVelocity(0.0D, 1.0D, 0.0D);
		}

		if (hitentity instanceof EntityPlayerMP) {
			((EntityPlayerMP) hitentity).playerNetServerHandler.sendPacket(new S12PacketEntityVelocity(hitentity));
		}

		return super.hitEntity(itemstack, hitentity, player);
	}

}