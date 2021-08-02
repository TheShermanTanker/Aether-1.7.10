package com.gildedgames.aether.entities.passive;

import java.util.Random;

import com.gildedgames.aether.blocks.BlocksAether;
import com.gildedgames.aether.items.ItemsAether;

import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public abstract class EntityAetherAnimal extends EntityAnimal {

	Random random = new Random();

	public EntityAetherAnimal(World worldIn) {
		super(worldIn);
	}

	@Override
	public float getBlockPathWeight(int x, int y, int z) {
		return this.worldObj.getBlock(x, y - 1, z) == BlocksAether.aetherGrass ? 10.0F : this.worldObj.getLightBrightness(x, y, z) - 0.5F;
	}

	@Override
	public boolean isBreedingItem(ItemStack stack) {
		return stack.getItem() == ItemsAether.blueberry;
	}

}