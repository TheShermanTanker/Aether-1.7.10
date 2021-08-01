package com.gildedgames.aether.items.weapons;

import com.gildedgames.aether.items.ItemsAether;
import com.gildedgames.aether.registry.creativetabs.AetherCreativeTabs;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.util.DamageSource;

public class ItemElementalSword extends ItemSword {

	public ItemElementalSword() {
		super(ToolMaterial.EMERALD);

		this.setMaxDamage(502);
		this.setCreativeTab(AetherCreativeTabs.weapons);
	}

	@Override
	public EnumRarity getRarity(ItemStack stack) {
		return ItemsAether.aetherLoot;
	}

	@Override
	public boolean hitEntity(ItemStack itemstack, EntityLivingBase entityliving, EntityLivingBase entityliving1) {
		if (this == ItemsAether.flamingSword) {
			int defaultTime = 30;
			int fireAspectModifier = EnchantmentHelper.getFireAspectModifier(entityliving1);
			if (fireAspectModifier > 0)
			{
				defaultTime += (fireAspectModifier * 4);
			}
			entityliving.setFire(defaultTime);
		} else if (this == ItemsAether.lightningSword) {
			EntityLightningBolt lightning = new EntityLightningBolt(entityliving1.worldObj, entityliving.posX, entityliving.posY, entityliving.posZ);

			entityliving1.worldObj.spawnEntityInWorld(lightning);
		} else if (this == ItemsAether.holySword && (entityliving.isEntityUndead() || entityliving.getCreatureAttribute() == EnumCreatureAttribute.UNDEAD)) {

			float damage = 15.0F;

			int level = EnchantmentHelper.getEnchantmentLevel(Enchantment.smite.effectId, itemstack);

			if (level > 0)
			{
				damage += (level * 2.5);
			}

			entityliving.attackEntityFrom(DamageSource.drown, damage);
			itemstack.damageItem(10, entityliving1);
		}

		return super.hitEntity(itemstack, entityliving, entityliving1);
	}

	@Override
	public boolean getIsRepairable(ItemStack stack, ItemStack repairStack) {
		return false;
	}

}