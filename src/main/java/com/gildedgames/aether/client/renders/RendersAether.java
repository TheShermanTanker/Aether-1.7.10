package com.gildedgames.aether.client.renders;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.entity.Entity;
import net.minecraftforge.client.MinecraftForgeClient;

import com.gildedgames.aether.client.renders.block.AetherFlowerRenderer;
import com.gildedgames.aether.client.renders.block.BerryBushRenderer;
import com.gildedgames.aether.client.renders.block.TreasureChestBlockRenderer;
import com.gildedgames.aether.client.renders.entity.AechorPlantRenderer;
import com.gildedgames.aether.client.renders.entity.AerbunnyRenderer;
import com.gildedgames.aether.client.renders.entity.AerwhaleRenderer;
import com.gildedgames.aether.client.renders.entity.CockatriceRenderer;
import com.gildedgames.aether.client.renders.entity.CrystalRenderer;
import com.gildedgames.aether.client.renders.entity.DartBaseRenderer;
import com.gildedgames.aether.client.renders.entity.FireMinionRenderer;
import com.gildedgames.aether.client.renders.entity.FloatingBlockRenderer;
import com.gildedgames.aether.client.renders.entity.FlyingCowRenderer;
import com.gildedgames.aether.client.renders.entity.HammerProjectileRenderer;
import com.gildedgames.aether.client.renders.entity.LightningKnifeRenderer;
import com.gildedgames.aether.client.renders.entity.MimicRenderer;
import com.gildedgames.aether.client.renders.entity.MiniCloudRenderer;
import com.gildedgames.aether.client.renders.entity.MoaRenderer;
import com.gildedgames.aether.client.renders.entity.ParachuteRenderer;
import com.gildedgames.aether.client.renders.entity.PhoenixArrowRenderer;
import com.gildedgames.aether.client.renders.entity.PhygRenderer;
import com.gildedgames.aether.client.renders.entity.SentryRenderer;
import com.gildedgames.aether.client.renders.entity.SheepuffRenderer;
import com.gildedgames.aether.client.renders.entity.SliderRenderer;
import com.gildedgames.aether.client.renders.entity.SunSpiritRenderer;
import com.gildedgames.aether.client.renders.entity.SwetRenderer;
import com.gildedgames.aether.client.renders.entity.TNTPresentRenderer;
import com.gildedgames.aether.client.renders.entity.ValkyrieQueenRenderer;
import com.gildedgames.aether.client.renders.entity.ValkyrieRenderer;
import com.gildedgames.aether.client.renders.entity.WhirlwindRenderer;
import com.gildedgames.aether.client.renders.entity.ZephyrRenderer;
import com.gildedgames.aether.client.renders.entity.ZephyrSnowballRenderer;
import com.gildedgames.aether.client.renders.items.PhoenixBowRenderer;
import com.gildedgames.aether.entities.block.EntityFloatingBlock;
import com.gildedgames.aether.entities.block.EntityTNTPresent;
import com.gildedgames.aether.entities.bosses.EntityFireMinion;
import com.gildedgames.aether.entities.bosses.EntityValkyrie;
import com.gildedgames.aether.entities.bosses.slider.EntitySlider;
import com.gildedgames.aether.entities.bosses.sunspirit.EntitySunSpirit;
import com.gildedgames.aether.entities.bosses.valkyriequeen.EntityValkyrieQueen;
import com.gildedgames.aether.entities.hostile.EntityAechorPlant;
import com.gildedgames.aether.entities.hostile.EntityCockatrice;
import com.gildedgames.aether.entities.hostile.EntityMimic;
import com.gildedgames.aether.entities.hostile.EntitySentry;
import com.gildedgames.aether.entities.hostile.EntityWhirlwind;
import com.gildedgames.aether.entities.hostile.EntityZephyr;
import com.gildedgames.aether.entities.passive.EntityAerwhale;
import com.gildedgames.aether.entities.passive.EntityMiniCloud;
import com.gildedgames.aether.entities.passive.EntitySheepuff;
import com.gildedgames.aether.entities.passive.mountable.EntityAerbunny;
import com.gildedgames.aether.entities.passive.mountable.EntityFlyingCow;
import com.gildedgames.aether.entities.passive.mountable.EntityMoa;
import com.gildedgames.aether.entities.passive.mountable.EntityParachute;
import com.gildedgames.aether.entities.passive.mountable.EntityPhyg;
import com.gildedgames.aether.entities.passive.mountable.EntitySwet;
import com.gildedgames.aether.entities.projectile.EntityHammerProjectile;
import com.gildedgames.aether.entities.projectile.EntityLightningKnife;
import com.gildedgames.aether.entities.projectile.EntityPhoenixArrow;
import com.gildedgames.aether.entities.projectile.EntityZephyrSnowball;
import com.gildedgames.aether.entities.projectile.crystals.EntityCrystal;
import com.gildedgames.aether.entities.projectile.darts.EntityDartBase;
import com.gildedgames.aether.items.ItemsAether;
import com.gildedgames.aether.tileentity.TileEntityTreasureChest;

import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;

public class RendersAether {

	public static void initialization() {
		/* Misc */
		register(EntityHammerProjectile.class, new HammerProjectileRenderer());
		register(EntityFloatingBlock.class, new FloatingBlockRenderer());
		register(EntityParachute.class, new ParachuteRenderer());
		register(EntityZephyrSnowball.class, new ZephyrSnowballRenderer());
		register(EntityPhoenixArrow.class, new PhoenixArrowRenderer());
		register(EntityLightningKnife.class, new LightningKnifeRenderer());

		/* Darts */
		register(EntityDartBase.class, new DartBaseRenderer());

		/* Crystals */
		register(EntityCrystal.class, new CrystalRenderer());

		/* Bosses */
		register(EntitySlider.class, new SliderRenderer());
		register(EntityValkyrieQueen.class, new ValkyrieQueenRenderer());
		register(EntitySunSpirit.class, new SunSpiritRenderer());

		/* Hostile */
		register(EntityMimic.class, new MimicRenderer());
		register(EntitySentry.class, new SentryRenderer());
		register(EntityAechorPlant.class, new AechorPlantRenderer());
		register(EntityFireMinion.class, new FireMinionRenderer());
		register(EntityZephyr.class, new ZephyrRenderer());
		register(EntityValkyrie.class, new ValkyrieRenderer());
		register(EntityCockatrice.class, new CockatriceRenderer());

		/* Passive */
		register(EntityMoa.class, new MoaRenderer());
		register(EntityPhyg.class, new PhygRenderer());
		register(EntityFlyingCow.class, new FlyingCowRenderer());
		register(EntitySheepuff.class, new SheepuffRenderer());
		register(EntityAerwhale.class, new AerwhaleRenderer());
		register(EntityAerbunny.class, new AerbunnyRenderer());
		register(EntitySwet.class, new SwetRenderer());
		register(EntityMiniCloud.class, new MiniCloudRenderer());
		register(EntityTNTPresent.class, new TNTPresentRenderer());
		register(EntityWhirlwind.class, new WhirlwindRenderer());

		MinecraftForgeClient.registerItemRenderer(ItemsAether.phoenixBow, new PhoenixBowRenderer());
		RenderingRegistry.registerBlockHandler(new BerryBushRenderer());
		RenderingRegistry.registerBlockHandler(new TreasureChestBlockRenderer());
		RenderingRegistry.registerBlockHandler(new AetherFlowerRenderer());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityTreasureChest.class, new TreasureChestRenderer());
	}

	public static void register(Class<? extends Entity> entityClass, Render render) {
		RenderingRegistry.registerEntityRenderingHandler(entityClass, render);
	}
}