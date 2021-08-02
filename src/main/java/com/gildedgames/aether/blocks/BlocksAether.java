package com.gildedgames.aether.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;

import com.gildedgames.aether.Aether;
import com.gildedgames.aether.blocks.container.BlockEnchanter;
import com.gildedgames.aether.blocks.container.BlockFreezer;
import com.gildedgames.aether.blocks.container.BlockIncubator;
import com.gildedgames.aether.blocks.container.BlockSunAltar;
import com.gildedgames.aether.blocks.decorative.BlockAerogel;
import com.gildedgames.aether.blocks.decorative.BlockAetherFence;
import com.gildedgames.aether.blocks.decorative.BlockAetherFenceGate;
import com.gildedgames.aether.blocks.decorative.BlockAetherSlab;
import com.gildedgames.aether.blocks.decorative.BlockAetherStairs;
import com.gildedgames.aether.blocks.decorative.BlockAetherWall;
import com.gildedgames.aether.blocks.decorative.BlockAmbrosiumTorch;
import com.gildedgames.aether.blocks.decorative.BlockPresent;
import com.gildedgames.aether.blocks.decorative.BlockQuicksoilGlass;
import com.gildedgames.aether.blocks.decorative.BlockSkyrootBookshelf;
import com.gildedgames.aether.blocks.decorative.BlockSkyrootPlanks;
import com.gildedgames.aether.blocks.decorative.BlockZanite;
import com.gildedgames.aether.blocks.dungeon.BlockDungeonBase;
import com.gildedgames.aether.blocks.dungeon.BlockDungeonTrap;
import com.gildedgames.aether.blocks.dungeon.BlockMimicChest;
import com.gildedgames.aether.blocks.dungeon.BlockPillar;
import com.gildedgames.aether.blocks.dungeon.BlockTreasureChest;
import com.gildedgames.aether.blocks.natural.BlockAercloud;
import com.gildedgames.aether.blocks.natural.BlockAetherDirt;
import com.gildedgames.aether.blocks.natural.BlockAetherFlower;
import com.gildedgames.aether.blocks.natural.BlockAetherGrass;
import com.gildedgames.aether.blocks.natural.BlockAetherLeaves;
import com.gildedgames.aether.blocks.natural.BlockAetherLog;
import com.gildedgames.aether.blocks.natural.BlockAetherOre;
import com.gildedgames.aether.blocks.natural.BlockBerryBush;
import com.gildedgames.aether.blocks.natural.BlockBerryBushStem;
import com.gildedgames.aether.blocks.natural.BlockEnchantedAetherGrass;
import com.gildedgames.aether.blocks.natural.BlockHolystone;
import com.gildedgames.aether.blocks.natural.BlockQuicksoil;
import com.gildedgames.aether.blocks.portal.BlockAetherPortal;
import com.gildedgames.aether.blocks.util.BlockFloating;
import com.gildedgames.aether.items.ItemsAether;
import com.gildedgames.aether.items.block.ItemAetherSlab;
import com.gildedgames.aether.items.block.ItemBlockEnchanter;
import com.gildedgames.aether.items.block.ItemBlockMetadata;
import com.gildedgames.aether.items.block.ItemBlockRarity;
import com.gildedgames.aether.registry.creativetabs.AetherCreativeTabs;
import com.gildedgames.aether.world.biome.decoration.AetherGenOakTree;
import com.gildedgames.aether.world.biome.decoration.AetherGenSkyrootTree;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.EnumRarity;

public class BlocksAether {

	public static Block aetherGrass, enchantedAetherGrass, aetherDirt;

	public static Block holystone, mossyHolystone, holystoneBrick;

	public static Block aercloud, quicksoil, icestone;

	public static Block ambrosiumOre, zaniteOre, gravititeOre;

	public static Block skyrootLeaves, goldenOakLeaves, skyrootLog, goldenOakLog, skyrootPlanks;

	public static Block quicksoilGlass, aerogel;

	public static Block enchantedGravitite, zaniteBlock;

	public static Block berryBush, berryBushStem;

	public static Block enchanter, freezer, incubator;

	public static Block ambrosiumTorch;

	public static Block aetherPortal;

	public static Block chestMimic, treasureChestBronze, treasureChestSilver, treasureChestGolden;

	public static Block carvedStone, angelicStone, hellfireStone;

	public static Block sentryStone, lightAngelicStone, lightHellfireStone;

	public static Block lockedCarvedStone, lockedAngelicStone, lockedHellfireStone;

	public static Block lockedSentryStone, lockedLightAngelicStone, lockedLightHellfireStone;

	public static Block carvedTrap, angelicTrap, hellfireTrap;

	public static Block purpleFlower, whiteFlower;

	public static Block skyrootSapling, goldenOakSapling;

	public static Block crystalLeaves, crystalFruitLeaves;

	public static Block pillar, pillarTop;

	public static Block skyrootFence, skyrootFenceGate;

	public static Block carvedStairs, angelicStairs, hellfireStairs, skyrootStairs, mossyHolystoneStairs, holystoneStairs, holystoneBrickStairs, aerogelStairs;

	public static Block carvedSlab, angelicSlab, hellfireSlab, skyrootSlab, holystoneSlab, holystoneBrickSlab, mossyHolystoneSlab, aerogelSlab;

	public static Block carvedDoubleSlab, angelicDoubleSlab, hellfireDoubleSlab, skyrootDoubleSlab, holystoneDoubleSlab, holystoneBrickDoubleSlab, mossyHolystoneDoubleSlab, aerogelDoubleSlab;

	public static Block holystoneWall, mossyHolystoneWall, holystoneBrickWall, carvedWall, angelicWall, hellfireWall, aerogelWall;

	public static Block holidayLeaves, decoratedHolidayLeaves, present;

	public static Block sunAltar;

	public static Block skyrootBookshelf;

	public static Block skyrootBed;

	public static void initialization() {
		aetherGrass = registerMeta("aether_grass", new BlockAetherGrass());
		enchantedAetherGrass = registerRarity("enchanted_aether_grass", new BlockEnchantedAetherGrass(), EnumRarity.rare);
		aetherDirt = registerMeta("aether_dirt", new BlockAetherDirt());
		holystone = registerMeta("holystone", new BlockHolystone());
		mossyHolystone = registerMeta("mossy_holystone", new BlockHolystone().setBlockTextureName(Aether.find("mossy_holystone")));
		holystoneBrick = register("holystone_brick", new BlockAether(Material.rock, Aether.find("holystone_brick")).setHardness(0.5F).setResistance(10.0F));
		aercloud = registerMeta("aercloud", new BlockAercloud());
		aerogel = registerRarity("aerogel", new BlockAerogel(), ItemsAether.aetherLoot);
		quicksoil = registerMeta("quicksoil", new BlockQuicksoil());
		icestone = register("icestone", new BlockIcestone());
		ambrosiumOre = register("ambrosium_ore", new BlockAetherOre(0).setBlockTextureName(Aether.find("ambrosium_ore")));
		zaniteOre = register("zanite_ore", new BlockAetherOre(1).setBlockTextureName(Aether.find("zanite_ore")));
		gravititeOre = register("gravitite_ore", new BlockFloating(Material.rock, false).setHardness(5.0F).setBlockTextureName(Aether.find("gravitite_ore")));
		enchantedGravitite = registerRarity("enchanted_gravitite", new BlockFloating(Material.rock, true).setHardness(5.0F).setBlockTextureName(Aether.find("enchanted_gravitite")), EnumRarity.rare);
		zaniteBlock = register("zanite_block", new BlockZanite());
		skyrootLeaves = register("skyroot_leaves", new BlockAetherLeaves().setBlockTextureName(Aether.find("skyroot_leaves")));
		goldenOakLeaves = register("golden_oak_leaves", new BlockAetherLeaves().setBlockTextureName(Aether.find("golden_oak_leaves")));
		crystalLeaves = register("crystal_leaves", new BlockAetherLeaves().setBlockTextureName(Aether.find("crystal_leaves")));
		crystalFruitLeaves = register("crystal_fruit_leaves", new BlockAetherLeaves().setBlockTextureName(Aether.find("crystal_fruit_leaves")));
		holidayLeaves = register("holiday_leaves", new BlockAetherLeaves().setBlockTextureName(Aether.find("holiday_leaves")));
		decoratedHolidayLeaves = register("decorated_holiday_leaves", new BlockAetherLeaves().setBlockTextureName(Aether.find("decorated_holiday_leaves")));
		present = register("present", new BlockPresent());
		skyrootLog = registerMeta("skyroot_log", new BlockAetherLog().setBlockTextureName(Aether.find("skyroot_log")));
		goldenOakLog = registerMeta("golden_oak_log", new BlockAetherLog().setBlockTextureName(Aether.find("golden_oak_log")));
		skyrootPlanks = register("skyroot_planks", new BlockSkyrootPlanks());
		quicksoilGlass = registerRarity("quicksoil_glass", new BlockQuicksoilGlass(), EnumRarity.rare);
		ambrosiumTorch = register("ambrosium_torch", new BlockAmbrosiumTorch().setBlockTextureName(Aether.find("ambrosium_torch")));
		berryBushStem = register("berry_bush_stem", new BlockBerryBushStem());
		berryBush = register("berry_bush", new BlockBerryBush());
		purpleFlower = register("purple_flower", new BlockAetherFlower().setBlockTextureName(Aether.find("purple_flower")));
		whiteFlower = register("white_flower", new BlockAetherFlower().setBlockTextureName(Aether.find("white_flower")));
		skyrootSapling = register("skyroot_sapling", new BlockAetherSapling(new AetherGenSkyrootTree(false)).setBlockTextureName(Aether.find("skyroot_sapling")));
		goldenOakSapling = register("golden_oak_sapling", new BlockAetherSapling(new AetherGenOakTree()).setBlockTextureName(Aether.find("golden_oak_sapling")));
		enchanter = registerEnchanter("enchanter", new BlockEnchanter());
		freezer = registerMeta("freezer", new BlockFreezer());
		incubator = registerMeta("incubator", new BlockIncubator());
		sunAltar = register("sun_altar", new BlockSunAltar());
		chestMimic = register("chest_mimic", new BlockMimicChest());
		treasureChestBronze = register("treasure_chest_bronze", new BlockTreasureChest(0));
		treasureChestSilver = register("treasure_chest_silver", new BlockTreasureChest(1));
		treasureChestGolden = register("treasure_chest_golden", new BlockTreasureChest(2));
		aetherPortal = register("aether_portal", new BlockAetherPortal()).setCreativeTab(null);
		pillar = register("pillar", new BlockPillar("pillar_top", "pillar_side"));
		pillarTop = register("pillar_top", new BlockPillar("pillar_top", "pillar_carved"));
		carvedStone = register("carved_stone", new BlockDungeonBase(false).setBlockTextureName(Aether.find("carved_stone")));
		sentryStone = register("sentry_stone", new BlockDungeonBase(true).setBlockTextureName(Aether.find("sentry_stone")));
		angelicStone = register("angelic_stone", new BlockDungeonBase(false).setBlockTextureName(Aether.find("angelic_stone")));
		lightAngelicStone = register("light_angelic_stone", new BlockDungeonBase(true).setBlockTextureName(Aether.find("light_angelic_stone")));
		hellfireStone = register("hellfire_stone", new BlockDungeonBase(false).setBlockTextureName(Aether.find("hellfire_stone")));
		lightHellfireStone = register("light_hellfire_stone", new BlockDungeonBase(true).setBlockTextureName(Aether.find("light_hellfire_stone")));
		lockedCarvedStone = register("locked_carved_stone", new BlockDungeonBase(carvedStone, false).setBlockTextureName(Aether.find("carved_stone"))).setCreativeTab(null);
		lockedSentryStone = register("locked_sentry_stone", new BlockDungeonBase(sentryStone, true).setBlockTextureName(Aether.find("sentry_stone"))).setCreativeTab(null);
		lockedAngelicStone = register("locked_angelic_stone", new BlockDungeonBase(angelicStone, false).setBlockTextureName(Aether.find("angelic_stone"))).setCreativeTab(null);
		lockedLightAngelicStone = register("locked_light_angelic_stone", new BlockDungeonBase(lightAngelicStone, true).setBlockTextureName(Aether.find("light_angelic_stone"))).setCreativeTab(null);
		lockedHellfireStone = register("locked_hellfire_stone", new BlockDungeonBase(hellfireStone, false).setBlockTextureName(Aether.find("hellfire_stone"))).setCreativeTab(null);
		lockedLightHellfireStone = register("locked_light_hellfire_stone", new BlockDungeonBase(lightHellfireStone, true).setBlockTextureName(Aether.find("light_hellfire_stone"))).setCreativeTab(null);
		carvedTrap = register("carved_trap", new BlockDungeonTrap(carvedStone).setBlockTextureName(Aether.find("carved_stone"))).setCreativeTab(null);
		angelicTrap = register("angelic_trap", new BlockDungeonTrap(angelicStone).setBlockTextureName(Aether.find("angelic_stone"))).setCreativeTab(null);
		hellfireTrap = register("hellfire_trap", new BlockDungeonTrap(hellfireStone).setBlockTextureName(Aether.find("hellfire_stone"))).setCreativeTab(null);
		skyrootFence = register("skyroot_fence", new BlockAetherFence());
		skyrootFenceGate = register("skyroot_fence_gate", new BlockAetherFenceGate());
		carvedWall = register("carved_wall", new BlockAetherWall(carvedStone));
		angelicWall = register("angelic_wall", new BlockAetherWall(angelicStone));
		hellfireWall = register("hellfire_wall", new BlockAetherWall(hellfireStone));
		holystoneWall = register("holystone_wall", new BlockAetherWall(holystone));
		holystoneBrickWall = register("holystone_brick_wall", new BlockAetherWall(holystoneBrick));
		mossyHolystoneWall = register("mossy_holystone_wall", new BlockAetherWall(mossyHolystone));
		aerogelWall = registerRarity("aerogel_wall", new BlockAetherWall(aerogel), ItemsAether.aetherLoot);
		carvedStairs = register("carved_stairs", new BlockAetherStairs(carvedStone));
		angelicStairs = register("angelic_stairs", new BlockAetherStairs(angelicStone));
		hellfireStairs = register("hellfire_stairs", new BlockAetherStairs(hellfireStone));
		skyrootStairs = register("skyroot_stairs", new BlockAetherStairs(skyrootPlanks));
		holystoneStairs = register("holystone_stairs", new BlockAetherStairs(holystone));
		holystoneBrickStairs = register("holystone_brick_stairs", new BlockAetherStairs(holystoneBrick));
		mossyHolystoneStairs = register("mossy_holystone_stairs", new BlockAetherStairs(mossyHolystone));
		aerogelStairs = registerRarity("aerogel_stairs", new BlockAetherStairs(aerogel), ItemsAether.aetherLoot);
		skyrootDoubleSlab = register("skyroot_double_slab", new BlockAetherSlab("skyroot_double_slab", true, Material.wood).setBlockTextureName(Aether.find("skyroot_planks")).setHardness(2.0F).setResistance(5.0F)).setCreativeTab(null);
		carvedDoubleSlab = register("carved_double_slab", new BlockAetherSlab("carved_double_slab", true, Material.rock).setBlockTextureName(Aether.find("carved_stone")).setHardness(2.0F).setResistance(10.0F)).setCreativeTab(null);
		angelicDoubleSlab = register("angelic_double_slab", new BlockAetherSlab("angelic_double_slab", true, Material.rock).setBlockTextureName(Aether.find("angelic_stone")).setHardness(2.0F).setResistance(10.0F)).setCreativeTab(null);
		hellfireDoubleSlab = register("hellfire_double_slab", new BlockAetherSlab("hellfire_double_slab", true, Material.rock).setBlockTextureName(Aether.find("hellfire_stone")).setHardness(2.0F).setResistance(10.0F)).setCreativeTab(null);
		holystoneDoubleSlab = register("holystone_double_slab", new BlockAetherSlab("holystone_double_slab", true, Material.rock).setBlockTextureName(Aether.find("holystone")).setHardness(2.0F).setResistance(10.0F)).setCreativeTab(null);
		mossyHolystoneDoubleSlab = register("mossy_holystone_double_slab", new BlockAetherSlab("mossy_holystone_double_slab", true, Material.rock).setBlockTextureName(Aether.find("mossy_holystone")).setHardness(2.0F).setResistance(10.0F)).setCreativeTab(null);
		holystoneBrickDoubleSlab = register("holystone_brick_double_slab", new BlockAetherSlab("holystone_brick_double_slab", true, Material.rock).setBlockTextureName(Aether.find("holystone_brick")).setHardness(2.0F).setResistance(10.0F)).setCreativeTab(null);
		aerogelDoubleSlab = register("aerogel_double_slab", new BlockAetherSlab("aerogel_double_slab", true, Material.rock).setBlockTextureName(Aether.find("aerogel")).setHardness(2.0F).setResistance(2000F).setLightOpacity(3).setStepSound(Block.soundTypeMetal)).setCreativeTab(null);
		skyrootSlab = registerSlab("skyroot_slab", new BlockAetherSlab("skyroot_slab", false, Material.wood).setBlockTextureName(Aether.find("skyroot_planks")).setHardness(2.0F).setResistance(5.0F), skyrootDoubleSlab);
		carvedSlab = registerSlab("carved_slab", new BlockAetherSlab("carved_slab", false, Material.rock).setBlockTextureName(Aether.find("carved_stone")).setHardness(0.5F).setResistance(10.0F), carvedDoubleSlab);
		angelicSlab = registerSlab("angelic_slab", new BlockAetherSlab("angelic_slab", false, Material.rock).setBlockTextureName(Aether.find("angelic_stone")).setHardness(0.5F).setResistance(10.0F), angelicDoubleSlab);
		hellfireSlab = registerSlab("hellfire_slab", new BlockAetherSlab("hellfire_slab", false, Material.rock).setBlockTextureName(Aether.find("hellfire_stone")).setHardness(0.5F).setResistance(10.0F), hellfireDoubleSlab);
		holystoneSlab = registerSlab("holystone_slab", new BlockAetherSlab("holystone_slab", false, Material.rock).setBlockTextureName(Aether.find("holystone")).setHardness(0.5F).setResistance(10.0F), holystoneDoubleSlab);
		mossyHolystoneSlab = registerSlab("mossy_holystone_slab", new BlockAetherSlab("mossy_holystone_slab", false, Material.rock).setBlockTextureName(Aether.find("mossy_holystone")).setHardness(0.5F).setResistance(10.0F), mossyHolystoneDoubleSlab);
		holystoneBrickSlab = registerSlab("holystone_brick_slab", new BlockAetherSlab("holystone_brick_slab", false, Material.rock).setBlockTextureName(Aether.find("holystone_brick")).setHardness(0.5F).setResistance(10.0F), holystoneBrickDoubleSlab);
		aerogelSlab = registerSlab("aerogel_slab", new BlockAetherSlab("aerogel_slab", false, Material.rock).setBlockTextureName(Aether.find("aerogel")).setHardness(0.5F).setResistance(2000F).setLightOpacity(3).setStepSound(Block.soundTypeMetal), aerogelDoubleSlab);
		skyrootBookshelf = register("skyroot_bookshelf", new BlockSkyrootBookshelf());
		skyrootBed = registerBed("skyroot_bed", new BlockSkyrootBed().setBlockTextureName(Aether.find("skyroot_bed")));
	}

	public static void initializeHarvestLevels()
	{
		BlocksAether.aetherGrass.setHarvestLevel("shovel", 0);
		BlocksAether.enchantedAetherGrass.setHarvestLevel("shovel", 0);
		BlocksAether.aetherDirt.setHarvestLevel("shovel", 0);
		BlocksAether.holystone.setHarvestLevel("pickaxe", 0);
		BlocksAether.mossyHolystone.setHarvestLevel("pickaxe", 0);
		BlocksAether.holystoneBrick.setHarvestLevel("pickaxe", 0);
		BlocksAether.aercloud.setHarvestLevel("shovel", 0);
		BlocksAether.quicksoil.setHarvestLevel("shovel", 0);
		BlocksAether.icestone.setHarvestLevel("pickaxe", 1);
		BlocksAether.ambrosiumOre.setHarvestLevel("pickaxe", 0);
		BlocksAether.zaniteOre.setHarvestLevel("pickaxe", 1);
		BlocksAether.gravititeOre.setHarvestLevel("pickaxe", 2);
		BlocksAether.skyrootLog.setHarvestLevel("axe", 0);
		BlocksAether.skyrootPlanks.setHarvestLevel("axe", 0);
		BlocksAether.aerogel.setHarvestLevel("pickaxe", 3);
		BlocksAether.enchantedGravitite.setHarvestLevel("pickaxe", 2);
		BlocksAether.zaniteBlock.setHarvestLevel("pickaxe", 1);
		BlocksAether.berryBushStem.setHarvestLevel("axe", 0);
		BlocksAether.enchanter.setHarvestLevel("pickaxe", 0);
		BlocksAether.freezer.setHarvestLevel("pickaxe", 0);
		BlocksAether.incubator.setHarvestLevel("pickaxe", 0);
		BlocksAether.carvedStone.setHarvestLevel("pickaxe", 0);
		BlocksAether.angelicStone.setHarvestLevel("pickaxe", 0);
		BlocksAether.hellfireStone.setHarvestLevel("pickaxe", 0);
		BlocksAether.chestMimic.setHarvestLevel("axe", 0);
		BlocksAether.pillar.setHarvestLevel("pickaxe", 0);
		BlocksAether.pillarTop.setHarvestLevel("pickaxe", 0);
		BlocksAether.skyrootFence.setHarvestLevel("axe", 0);
		BlocksAether.skyrootFenceGate.setHarvestLevel("axe", 0);
		BlocksAether.carvedWall.setHarvestLevel("pickaxe", 0);
		BlocksAether.angelicWall.setHarvestLevel("pickaxe", 0);
		BlocksAether.angelicWall.setHarvestLevel("pickaxe", 0);
		BlocksAether.hellfireWall.setHarvestLevel("pickaxe", 0);
		BlocksAether.holystoneWall.setHarvestLevel("pickaxe", 0);
		BlocksAether.holystoneBrickWall.setHarvestLevel("pickaxe", 0);
		BlocksAether.mossyHolystoneWall.setHarvestLevel("pickaxe", 0);
		BlocksAether.aerogelWall.setHarvestLevel("pickaxe", 0);
		BlocksAether.carvedStairs.setHarvestLevel("pickaxe", 0);
		BlocksAether.angelicStairs.setHarvestLevel("pickaxe", 0);
		BlocksAether.hellfireStairs.setHarvestLevel("pickaxe", 0);
		BlocksAether.skyrootStairs.setHarvestLevel("axe", 0);
		BlocksAether.mossyHolystoneStairs.setHarvestLevel("pickaxe", 0);
		BlocksAether.holystoneStairs.setHarvestLevel("pickaxe", 0);
		BlocksAether.holystoneBrickStairs.setHarvestLevel("pickaxe", 0);
		BlocksAether.aerogelStairs.setHarvestLevel("pickaxe", 0);
		BlocksAether.skyrootDoubleSlab.setHarvestLevel("axe", 0);
		BlocksAether.carvedDoubleSlab.setHarvestLevel("pickaxe", 0);
		BlocksAether.angelicDoubleSlab.setHarvestLevel("pickaxe", 0);
		BlocksAether.hellfireDoubleSlab.setHarvestLevel("pickaxe", 0);
		BlocksAether.holystoneDoubleSlab.setHarvestLevel("pickaxe", 0);
		BlocksAether.mossyHolystoneDoubleSlab.setHarvestLevel("pickaxe", 0);
		BlocksAether.holystoneBrickDoubleSlab.setHarvestLevel("pickaxe", 0);
		BlocksAether.aerogelDoubleSlab.setHarvestLevel("pickaxe", 0);
		BlocksAether.skyrootSlab.setHarvestLevel("axe", 0);
		BlocksAether.carvedSlab.setHarvestLevel("pickaxe", 0);
		BlocksAether.angelicSlab.setHarvestLevel("pickaxe", 0);
		BlocksAether.hellfireSlab.setHarvestLevel("pickaxe", 0);
		BlocksAether.holystoneSlab.setHarvestLevel("pickaxe", 0);
		BlocksAether.mossyHolystoneSlab.setHarvestLevel("pickaxe", 0);
		BlocksAether.holystoneBrickSlab.setHarvestLevel("pickaxe", 0);
		BlocksAether.aerogelSlab.setHarvestLevel("pickaxe", 0);
		BlocksAether.sunAltar.setHarvestLevel("pickaxe", 0);
		BlocksAether.skyrootBookshelf.setHarvestLevel("axe", 0);
		BlocksAether.skyrootBed.setHarvestLevel("axe", 0);
	}

	public static boolean isGood(Block block) {
		return block == Blocks.air || block == aercloud;
	}

	public static Block registerSlab(String name, Block slab1, Block slab2) {
		slab1.setBlockName(name);
		slab1.setCreativeTab(AetherCreativeTabs.blocks);

		GameRegistry.registerBlock(slab1, ItemAetherSlab.class, name, (BlockAetherSlab) slab1, (BlockAetherSlab) slab2, false);

		return slab1;
	}

	public static Block register(String name, Block block) {
		block.setBlockName(name);
		block.setCreativeTab(AetherCreativeTabs.blocks);

		GameRegistry.registerBlock(block, name);

		return block;
	}

	public static Block registerRarity(String name, Block block, EnumRarity rarity) {
		block.setBlockName(name);
		block.setCreativeTab(AetherCreativeTabs.blocks);

		GameRegistry.registerBlock(block, ItemBlockRarity.class, name, rarity);

		return block;
	}

	public static Block registerMeta(String name, Block block) {
		block.setBlockName(name);
		block.setCreativeTab(AetherCreativeTabs.blocks);

		GameRegistry.registerBlock(block, ItemBlockMetadata.class, name);

		return block;
	}

	public static Block registerBed(String name, Block block) {
		block.setBlockName(name);

		GameRegistry.registerBlock(block, name);

		return block;
	}

	public static Block registerEnchanter(String name, Block block) {
		block.setBlockName(name);
		block.setCreativeTab(AetherCreativeTabs.blocks);

		GameRegistry.registerBlock(block, ItemBlockEnchanter.class, name);

		return block;
	}

}