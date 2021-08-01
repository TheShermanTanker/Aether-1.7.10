package com.gildedgames.aether.compatibility.client;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.EntityRenderer;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.RenderPlayer;

import com.gildedgames.aether.client.renders.AetherItemRenderer;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import mods.battlegear2.api.RenderPlayerEventChild.PlayerElementType;
import mods.battlegear2.api.RenderPlayerEventChild.PostRenderPlayerElement;

public class BattlegearClientEventHandler
{

	@SubscribeEvent
	public void renderOffhandGloveEvent(PostRenderPlayerElement event)
	{
		EntityRenderer renderer = Minecraft.getMinecraft().entityRenderer;

		if (event.type == PlayerElementType.Offhand && event.isFirstPerson && renderer != null && renderer.itemRenderer instanceof AetherItemRenderer)
		{
			((AetherItemRenderer)renderer.itemRenderer).renderFirstPersonArm((RenderPlayer) RenderManager.instance.getEntityRenderObject(Minecraft.getMinecraft().thePlayer), Minecraft.getMinecraft().thePlayer);
		}
	}

}