package com.gildedgames.aether.client.renders.entity;

import com.gildedgames.aether.Aether;
import com.gildedgames.aether.client.models.entities.MiniCloudModel;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class MiniCloudRenderer extends RenderLiving {

    public MiniCloudRenderer() {
        super(new MiniCloudModel(), 0.5F);
    }

    @Override
    protected ResourceLocation getEntityTexture(Entity entity) {
        return Aether.locate("textures/entities/mini_cloud/mini_cloud.png");
    }

}