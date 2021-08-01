package com.gildedgames.aether.entities.projectile.darts;

import com.gildedgames.aether.items.ItemsAether;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class EntityDartGolden extends EntityDartBase {

    public EntityDartGolden(World worldIn) {
        super(worldIn);
    }

    public EntityDartGolden(World world, EntityLivingBase entity, float velocity) {
        super(world, entity, velocity);
    }

    @Override
    public void entityInit() {
        super.entityInit();
        this.setDamage(5);
    }

    @Override
    protected ItemStack getStack() {
        return new ItemStack(ItemsAether.dart, 1, 0);
    }

}