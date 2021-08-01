package com.gildedgames.aether.items.weapons;

import com.gildedgames.aether.items.ItemsAether;
import com.gildedgames.aether.registry.creativetabs.AetherCreativeTabs;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.util.DamageSource;

public class ItemPigSlayer extends ItemSword {

	public ItemPigSlayer() {
		super(ToolMaterial.IRON);
		this.setMaxDamage(200);
		this.setCreativeTab(AetherCreativeTabs.weapons);
	}

	@Override
	public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) {
		return false;
	}

	@Override
	public EnumRarity getRarity(ItemStack stack) {
		return ItemsAether.aetherLoot;
	}

	@Override
	public boolean hitEntity(ItemStack itemstack, EntityLivingBase entityliving, EntityLivingBase entityliving1) {
		if (entityliving == null || entityliving1 == null) {
			return false;
		}

		String string = EntityList.getEntityString((Entity) entityliving);

		if (string != null && (string.toLowerCase().contains("pig") || string.toLowerCase().contains("phyg") || string.toLowerCase().contains("taegore") || entityliving.getUniqueID().toString().equals("1d680bb6-2a9a-4f25-bf2f-a1af74361d69"))) {
			if (entityliving.getHealth() > 0) {
				entityliving.setHealth(0);
				entityliving.attackEntityFrom(DamageSource.causeMobDamage(entityliving1), 0); //Doesn't actually kill the entityliving target, rather updates it so Minecraft knows that it's already dead
			}
		}

		return super.hitEntity(itemstack, entityliving, entityliving1);
	}

}