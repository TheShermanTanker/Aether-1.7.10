package com.gildedgames.aether.registry;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;

import com.gildedgames.aether.api.AetherAPI;
import com.gildedgames.aether.api.accessories.AccessoryType;
import com.gildedgames.aether.api.accessories.AetherAccessory;
import com.gildedgames.aether.api.enchantments.AetherEnchantment;
import com.gildedgames.aether.api.enchantments.AetherEnchantmentFuel;
import com.gildedgames.aether.api.freezables.AetherFreezable;
import com.gildedgames.aether.api.freezables.AetherFreezableFuel;
import com.gildedgames.aether.blocks.BlocksAether;
import com.gildedgames.aether.items.ItemsAether;
import com.gildedgames.aether.registry.recipe.RecipeAccessoryDyes;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;

public class AetherRegistries {

	public static void initializeAccessories() {
		AetherAPI.instance().register(new AetherAccessory(ItemsAether.leather_gloves, AccessoryType.GLOVES));
		AetherAPI.instance().register(new AetherAccessory(ItemsAether.iron_gloves, AccessoryType.GLOVES));
		AetherAPI.instance().register(new AetherAccessory(ItemsAether.golden_gloves, AccessoryType.GLOVES));
		AetherAPI.instance().register(new AetherAccessory(ItemsAether.chain_gloves, AccessoryType.GLOVES));
		AetherAPI.instance().register(new AetherAccessory(ItemsAether.diamond_gloves, AccessoryType.GLOVES));

		AetherAPI.instance().register(new AetherAccessory(ItemsAether.zanite_gloves, AccessoryType.GLOVES));
		AetherAPI.instance().register(new AetherAccessory(ItemsAether.gravitite_gloves, AccessoryType.GLOVES));
		AetherAPI.instance().register(new AetherAccessory(ItemsAether.neptune_gloves, AccessoryType.GLOVES));
		AetherAPI.instance().register(new AetherAccessory(ItemsAether.phoenix_gloves, AccessoryType.GLOVES));
		AetherAPI.instance().register(new AetherAccessory(ItemsAether.obsidian_gloves, AccessoryType.GLOVES));
		AetherAPI.instance().register(new AetherAccessory(ItemsAether.valkyrie_gloves, AccessoryType.GLOVES));

		AetherAPI.instance().register(new AetherAccessory(ItemsAether.ironRing, AccessoryType.RING));
		AetherAPI.instance().register(new AetherAccessory(ItemsAether.goldenRing, AccessoryType.RING));
		AetherAPI.instance().register(new AetherAccessory(ItemsAether.zaniteRing, AccessoryType.RING));
		AetherAPI.instance().register(new AetherAccessory(ItemsAether.iceRing, AccessoryType.RING));

		AetherAPI.instance().register(new AetherAccessory(ItemsAether.ironPendant, AccessoryType.PENDANT));
		AetherAPI.instance().register(new AetherAccessory(ItemsAether.goldenPendant, AccessoryType.PENDANT));
		AetherAPI.instance().register(new AetherAccessory(ItemsAether.zanitePendant, AccessoryType.PENDANT));
		AetherAPI.instance().register(new AetherAccessory(ItemsAether.icePendant, AccessoryType.PENDANT));

		AetherAPI.instance().register(new AetherAccessory(ItemsAether.redCape, AccessoryType.CAPE));
		AetherAPI.instance().register(new AetherAccessory(ItemsAether.blueCape, AccessoryType.CAPE));
		AetherAPI.instance().register(new AetherAccessory(ItemsAether.yellowCape, AccessoryType.CAPE));
		AetherAPI.instance().register(new AetherAccessory(ItemsAether.whiteCape, AccessoryType.CAPE));
		AetherAPI.instance().register(new AetherAccessory(ItemsAether.swetCape, AccessoryType.CAPE));
		AetherAPI.instance().register(new AetherAccessory(ItemsAether.invisibilityCape, AccessoryType.CAPE));
		AetherAPI.instance().register(new AetherAccessory(ItemsAether.agilityCape, AccessoryType.CAPE));
		AetherAPI.instance().register(new AetherAccessory(ItemsAether.valkyrieCape, AccessoryType.CAPE));

		AetherAPI.instance().register(new AetherAccessory(ItemsAether.goldenFeather, AccessoryType.MISC));
		AetherAPI.instance().register(new AetherAccessory(ItemsAether.regenerationStone, AccessoryType.MISC));
		AetherAPI.instance().register(new AetherAccessory(ItemsAether.ironBubble, AccessoryType.MISC));

		AetherAPI.instance().register(new AetherAccessory(ItemsAether.repulsionShield, AccessoryType.SHIELD));
	}

	public static void initializeEnchantments() {
		AetherAPI.instance().register(new AetherEnchantment(ItemsAether.skyrootPickaxe, 225));
		AetherAPI.instance().register(new AetherEnchantment(ItemsAether.skyrootAxe, 225));
		AetherAPI.instance().register(new AetherEnchantment(ItemsAether.skyrootShovel, 225));
		AetherAPI.instance().register(new AetherEnchantment(ItemsAether.skyrootSword, 225));

		AetherAPI.instance().register(new AetherEnchantment(ItemsAether.holystonePickaxe, 550));
		AetherAPI.instance().register(new AetherEnchantment(ItemsAether.holystoneAxe, 550));
		AetherAPI.instance().register(new AetherEnchantment(ItemsAether.holystoneShovel, 550));
		AetherAPI.instance().register(new AetherEnchantment(ItemsAether.holystoneSword, 550));

		AetherAPI.instance().register(new AetherEnchantment(ItemsAether.zanitePickaxe, 2250));
		AetherAPI.instance().register(new AetherEnchantment(ItemsAether.zaniteAxe, 2250));
		AetherAPI.instance().register(new AetherEnchantment(ItemsAether.zaniteShovel, 2250));
		AetherAPI.instance().register(new AetherEnchantment(ItemsAether.zaniteSword, 2250));

		AetherAPI.instance().register(new AetherEnchantment(ItemsAether.gravititePickaxe, 5500));
		AetherAPI.instance().register(new AetherEnchantment(ItemsAether.gravititeAxe, 5500));
		AetherAPI.instance().register(new AetherEnchantment(ItemsAether.gravititeShovel, 5500));
		AetherAPI.instance().register(new AetherEnchantment(ItemsAether.gravititeSword, 5500));

		AetherAPI.instance().register(new AetherEnchantment(ItemsAether.zaniteHelmet, 6000));
		AetherAPI.instance().register(new AetherEnchantment(ItemsAether.zaniteChestplate, 6000));
		AetherAPI.instance().register(new AetherEnchantment(ItemsAether.zaniteLeggings, 6000));
		AetherAPI.instance().register(new AetherEnchantment(ItemsAether.zaniteBoots, 6000));

		AetherAPI.instance().register(new AetherEnchantment(ItemsAether.gravititeHelmet, 13000));
		AetherAPI.instance().register(new AetherEnchantment(ItemsAether.gravititeChestplate, 13000));
		AetherAPI.instance().register(new AetherEnchantment(ItemsAether.gravititeLeggings, 13000));
		AetherAPI.instance().register(new AetherEnchantment(ItemsAether.gravititeBoots, 13000));

		AetherAPI.instance().register(new AetherEnchantment(ItemsAether.zaniteRing, 2250));
		AetherAPI.instance().register(new AetherEnchantment(ItemsAether.zanitePendant, 2250));

		AetherAPI.instance().register(new AetherEnchantment(ItemsAether.dart, new ItemStack(ItemsAether.dart, 1, 2), 250));
		AetherAPI.instance().register(new AetherEnchantment(ItemsAether.dartShooter, new ItemStack(ItemsAether.dartShooter, 1, 2), 500));

		AetherAPI.instance().register(new AetherEnchantment(new ItemStack(ItemsAether.skyrootBucket, 1, 2), new ItemStack(ItemsAether.skyrootBucket.setContainerItem(null), 1, 3), 1000));

		AetherAPI.instance().register(new AetherEnchantment(BlocksAether.holystone, ItemsAether.healingStone, 750));
		AetherAPI.instance().register(new AetherEnchantment(BlocksAether.gravitite_ore, BlocksAether.enchanted_gravitite, 1000));
		AetherAPI.instance().register(new AetherEnchantment(BlocksAether.quicksoil, BlocksAether.quicksoil_glass, 250));

		AetherAPI.instance().register(new AetherEnchantment(ItemsAether.blueberry, ItemsAether.enchantedBlueberry, 300));

		AetherAPI.instance().register(new AetherEnchantment(Items.bow, 4000));
		AetherAPI.instance().register(new AetherEnchantment(Items.fishing_rod, 600));

		AetherAPI.instance().register(new AetherEnchantment(Items.record_11, ItemsAether.aetherTune, 2500));
		AetherAPI.instance().register(new AetherEnchantment(Items.record_13, ItemsAether.aetherTune, 2500));
		AetherAPI.instance().register(new AetherEnchantment(Items.record_blocks, ItemsAether.aetherTune, 2500));
		AetherAPI.instance().register(new AetherEnchantment(Items.record_cat, ItemsAether.legacy, 2500));
		AetherAPI.instance().register(new AetherEnchantment(Items.record_far, ItemsAether.aetherTune, 2500));
		AetherAPI.instance().register(new AetherEnchantment(Items.record_mall, ItemsAether.aetherTune, 2500));
		AetherAPI.instance().register(new AetherEnchantment(Items.record_mellohi, ItemsAether.aetherTune, 2500));
		AetherAPI.instance().register(new AetherEnchantment(Items.record_stal, ItemsAether.aetherTune, 2500));
		AetherAPI.instance().register(new AetherEnchantment(Items.record_strad, ItemsAether.aetherTune, 2500));
		AetherAPI.instance().register(new AetherEnchantment(Items.record_wait, ItemsAether.aetherTune, 2500));
		AetherAPI.instance().register(new AetherEnchantment(Items.record_ward, ItemsAether.aetherTune, 2500));

		AetherAPI.instance().register(new AetherEnchantment(Items.wooden_pickaxe, 225));
		AetherAPI.instance().register(new AetherEnchantment(Items.wooden_axe, 225));
		AetherAPI.instance().register(new AetherEnchantment(Items.wooden_shovel, 225));
		AetherAPI.instance().register(new AetherEnchantment(Items.wooden_hoe, 225));
		AetherAPI.instance().register(new AetherEnchantment(Items.wooden_sword, 225));

		AetherAPI.instance().register(new AetherEnchantment(Items.stone_pickaxe, 550));
		AetherAPI.instance().register(new AetherEnchantment(Items.stone_axe, 550));
		AetherAPI.instance().register(new AetherEnchantment(Items.stone_shovel, 550));
		AetherAPI.instance().register(new AetherEnchantment(Items.stone_hoe, 550));
		AetherAPI.instance().register(new AetherEnchantment(Items.stone_sword, 550));

		AetherAPI.instance().register(new AetherEnchantment(Items.iron_pickaxe, 2250));
		AetherAPI.instance().register(new AetherEnchantment(Items.iron_axe, 2250));
		AetherAPI.instance().register(new AetherEnchantment(Items.iron_shovel, 2250));
		AetherAPI.instance().register(new AetherEnchantment(Items.iron_hoe, 2250));
		AetherAPI.instance().register(new AetherEnchantment(Items.iron_sword, 550));

		AetherAPI.instance().register(new AetherEnchantment(Items.diamond_pickaxe, 5500));
		AetherAPI.instance().register(new AetherEnchantment(Items.diamond_axe, 5500));
		AetherAPI.instance().register(new AetherEnchantment(Items.diamond_shovel, 5500));
		AetherAPI.instance().register(new AetherEnchantment(Items.diamond_hoe, 5500));
		AetherAPI.instance().register(new AetherEnchantment(Items.diamond_sword, 5500));

		AetherAPI.instance().register(new AetherEnchantment(Items.leather_helmet, 550));
		AetherAPI.instance().register(new AetherEnchantment(Items.leather_chestplate, 550));
		AetherAPI.instance().register(new AetherEnchantment(Items.leather_leggings, 550));
		AetherAPI.instance().register(new AetherEnchantment(Items.leather_boots, 550));

		AetherAPI.instance().register(new AetherEnchantment(Items.iron_helmet, 6000));
		AetherAPI.instance().register(new AetherEnchantment(Items.iron_chestplate, 6000));
		AetherAPI.instance().register(new AetherEnchantment(Items.iron_leggings, 6000));
		AetherAPI.instance().register(new AetherEnchantment(Items.iron_boots, 6000));

		AetherAPI.instance().register(new AetherEnchantment(Items.golden_helmet, 2250));
		AetherAPI.instance().register(new AetherEnchantment(Items.golden_chestplate, 2250));
		AetherAPI.instance().register(new AetherEnchantment(Items.golden_leggings, 2250));
		AetherAPI.instance().register(new AetherEnchantment(Items.golden_boots, 2250));

		AetherAPI.instance().register(new AetherEnchantment(Items.chainmail_helmet, 2250));
		AetherAPI.instance().register(new AetherEnchantment(Items.chainmail_chestplate, 2250));
		AetherAPI.instance().register(new AetherEnchantment(Items.chainmail_leggings, 2250));
		AetherAPI.instance().register(new AetherEnchantment(Items.chainmail_boots, 2250));

		AetherAPI.instance().register(new AetherEnchantment(Items.diamond_helmet, 10000));
		AetherAPI.instance().register(new AetherEnchantment(Items.diamond_chestplate, 10000));
		AetherAPI.instance().register(new AetherEnchantment(Items.diamond_leggings, 10000));
		AetherAPI.instance().register(new AetherEnchantment(Items.diamond_boots, 10000));
	}

	public static void initializeEnchantmentFuel() {
		AetherAPI.instance().register(new AetherEnchantmentFuel(ItemsAether.ambrosiumShard, 500));
	}

	public static void initializeFreezables() {
		AetherAPI.instance().register(new AetherFreezable(BlocksAether.aercloud, new ItemStack(BlocksAether.aercloud, 1, 1), 100));
		AetherAPI.instance().register(new AetherFreezable(BlocksAether.skyroot_leaves, BlocksAether.crystal_leaves, 150));
		AetherAPI.instance().register(new AetherFreezable(BlocksAether.golden_oak_leaves, BlocksAether.crystal_leaves, 150));
		AetherAPI.instance().register(new AetherFreezable(new ItemStack(ItemsAether.skyrootBucket, 1, 1), Blocks.ice, 500));
		AetherAPI.instance().register(new AetherFreezable(ItemsAether.ascendingDawn, ItemsAether.welcomingSkies, 2500));
		AetherAPI.instance().register(new AetherFreezable(Blocks.ice, Blocks.packed_ice, 750));
		AetherAPI.instance().register(new AetherFreezable(Items.water_bucket, Blocks.ice, 500));
		AetherAPI.instance().register(new AetherFreezable(Items.lava_bucket, Blocks.obsidian, 500));
		AetherAPI.instance().register(new AetherFreezable(ItemsAether.ironRing, ItemsAether.iceRing, 2500));
		AetherAPI.instance().register(new AetherFreezable(ItemsAether.goldenRing, ItemsAether.iceRing, 2500));
		AetherAPI.instance().register(new AetherFreezable(ItemsAether.ironPendant, ItemsAether.icePendant, 2500));
		AetherAPI.instance().register(new AetherFreezable(ItemsAether.goldenPendant, ItemsAether.icePendant, 2500));
	}

	public static void initializeFreezableFuel() {
		AetherAPI.instance().register(new AetherFreezableFuel(BlocksAether.icestone, 500));
	}

	public static void register() {
		initializeAccessories();
		initializeEnchantments();
		initializeEnchantmentFuel();
		initializeFreezables();
		initializeFreezableFuel();

		initializeRecipes();
		initializeShapelessRecipes();

		GameRegistry.addRecipe(new RecipeAccessoryDyes());
		FurnaceRecipes.smelting().func_151394_a(new ItemStack(BlocksAether.skyroot_log, 1, 1), new ItemStack(Items.coal, 1, 1), 0.15F);
		FurnaceRecipes.smelting().func_151394_a(new ItemStack(BlocksAether.golden_oak_log, 1, 1), new ItemStack(Items.coal, 1, 1), 0.15F);

		OreDictionary.registerOre("stickWood", ItemsAether.skyrootStick);
	}

	private static void initializeShapelessRecipes() {
		registerShapeless("poison_dart_shooter", new ItemStack(ItemsAether.dartShooter, 1, 1), new ItemStack(ItemsAether.dartShooter, 1, 0), new ItemStack(ItemsAether.skyrootBucket, 1, 2));
		registerShapeless("purple_dye", new ItemStack(Items.dye, 2, 5), BlocksAether.purple_flower);
		registerShapeless("skyroot_planks", new ItemStack(BlocksAether.skyroot_planks, 4), new ItemStack(BlocksAether.skyroot_log, 1, 1));
		registerShapeless("skyroot_planks", new ItemStack(BlocksAether.skyroot_planks, 4), new ItemStack(BlocksAether.golden_oak_log, 1, 1));
		registerShapeless("book_of_lore", new ItemStack(ItemsAether.loreBook), new ItemStack(Items.book), new ItemStack(ItemsAether.ambrosiumShard));
		registerShapeless("book_of_lore", new ItemStack(ItemsAether.loreBook), new ItemStack(Items.book), new ItemStack(Items.flint));
		registerShapeless("book_of_lore", new ItemStack(ItemsAether.loreBook), new ItemStack(Items.book), new ItemStack(Items.glowstone_dust));
	}

	private static void initializeRecipes() {
		register("nature_staf", new ItemStack(ItemsAether.natureStaff), "Y", "X", 'Y', ItemsAether.zaniteGemstone, 'X', ItemsAether.skyrootStick);
		register("skyroot_stick", new ItemStack(ItemsAether.skyrootStick, 4), "X", "X", 'X', BlocksAether.skyroot_planks);
		register("trapdoor", new ItemStack(Blocks.trapdoor, 2), "XXX", "XXX", 'X', BlocksAether.skyroot_planks);
		register("holystone_brick", new ItemStack(BlocksAether.holystone_brick, 4), "XX", "XX", 'X', BlocksAether.holystone);
		register("zanite_block", new ItemStack(BlocksAether.zanite_block), "XXX", "XXX", "XXX", 'X', ItemsAether.zaniteGemstone);
		register("zanite_gemstone", new ItemStack(ItemsAether.zaniteGemstone, 9), "X", 'X', BlocksAether.zanite_block);
		register("golden_dart_shooter", new ItemStack(ItemsAether.dartShooter, 1), "X  ", " Y ", "  Y", 'X', ItemsAether.goldenAmber, 'Y', BlocksAether.skyroot_planks);
		register("golden_dart", new ItemStack(ItemsAether.dart, 1), "X", "Y", "Z", 'X', Items.feather, 'Y', ItemsAether.skyrootStick, 'Z', ItemsAether.goldenAmber);
		register("poison_dart", new ItemStack(ItemsAether.dart, 8, 1), "XXX", "XYX", "XXX", 'X', new ItemStack(ItemsAether.dart, 1), 'Y', new ItemStack(ItemsAether.skyrootBucket, 1, 2));
		register("incubator", new ItemStack(BlocksAether.incubator), "XXX", "XZX", "XXX", 'X', BlocksAether.holystone, 'Z', BlocksAether.ambrosium_torch);
		register("freezer", new ItemStack(BlocksAether.freezer), "XXX", "XYX", "ZZZ", 'X', BlocksAether.holystone, 'Y', BlocksAether.icestone, 'Z', BlocksAether.skyroot_planks);
		register("enchanter", new ItemStack(BlocksAether.enchanter), "XXX", "XYX", "XXX", 'X', BlocksAether.holystone, 'Y', ItemsAether.zaniteGemstone);
		register("furnace", new ItemStack(Blocks.furnace), "XXX", "X X", "XXX", 'X', BlocksAether.holystone);
		register("ladder", new ItemStack(Blocks.ladder, 4), "X X", "XXX", "X X", 'X', ItemsAether.skyrootStick);
		register("jukebox", new ItemStack(Blocks.jukebox), "XXX", "XYX", "XXX", 'X', BlocksAether.skyroot_planks, 'Y', BlocksAether.enchanted_gravitite);
		register("oak_door", new ItemStack(Items.wooden_door, 3), "XX", "XX", "XX", 'X', BlocksAether.skyroot_planks);
		register("sign", new ItemStack(Items.sign, 3), "XXX", "XXX", " Y ", 'X', BlocksAether.skyroot_planks, 'Y', ItemsAether.skyrootStick);
		register("ambrosium_torch", new ItemStack(BlocksAether.ambrosium_torch, 2), "Z", "Y", 'Z', ItemsAether.ambrosiumShard, 'Y', ItemsAether.skyrootStick);
		register("lead", new ItemStack(Items.lead, 2), "YY ", "YX ", "  Y", 'Y', Items.string, 'X', ItemsAether.swetBall);

		register("cloud_parachute", new ItemStack(ItemsAether.cloudParachute, 1), "XX", "XX", 'X', new ItemStack(BlocksAether.aercloud, 1));
		register("golden_parachute", new ItemStack(ItemsAether.goldenParachute, 1), "XX", "XX", 'X', new ItemStack(BlocksAether.aercloud, 1, 2));
		register("saddle", new ItemStack(Items.saddle, 1), "XXX", "XZX", 'X', Items.leather, 'Z', Items.string);
		register("chest", new ItemStack(Blocks.chest, 1), "XXX", "X X", "XXX", 'X', BlocksAether.skyroot_planks);
		register("skyroot_bucket", new ItemStack(ItemsAether.skyrootBucket, 1, 0), "Z Z", " Z ", 'Z', BlocksAether.skyroot_planks);
		register("crafting_table", new ItemStack(Blocks.crafting_table, 1), "XX", "XX", 'X', BlocksAether.skyroot_planks);

		register("gravitite_helmet", new ItemStack(ItemsAether.gravititeHelmet, 1), "XXX", "X X", 'X', BlocksAether.enchanted_gravitite);
		register("gravitite_chestplate", new ItemStack(ItemsAether.gravititeChestplate, 1), "X X", "XXX", "XXX", 'X', BlocksAether.enchanted_gravitite);
		register("gravitite_leggings", new ItemStack(ItemsAether.gravititeLeggings, 1), "XXX", "X X", "X X", 'X', BlocksAether.enchanted_gravitite);
		register("gravitite_boots", new ItemStack(ItemsAether.gravititeBoots, 1), "X X", "X X", 'X', BlocksAether.enchanted_gravitite);
		register("zanite_helmet", new ItemStack(ItemsAether.zaniteHelmet, 1), "XXX", "X X", 'X', ItemsAether.zaniteGemstone);
		register("zanite_chestplate", new ItemStack(ItemsAether.zaniteChestplate, 1), "X X", "XXX", "XXX", 'X', ItemsAether.zaniteGemstone);
		register("zanite_leggings", new ItemStack(ItemsAether.zaniteLeggings, 1), "XXX", "X X", "X X", 'X', ItemsAether.zaniteGemstone);
		register("zanite_boots", new ItemStack(ItemsAether.zaniteBoots, 1), "X X", "X X", 'X', ItemsAether.zaniteGemstone);

		register("skyroot_pickaxe", new ItemStack(ItemsAether.skyrootPickaxe, 1), "ZZZ", " Y ", " Y ", 'Z', BlocksAether.skyroot_planks, 'Y', ItemsAether.skyrootStick);
		register("holystone_pickaxe", new ItemStack(ItemsAether.holystonePickaxe, 1), "ZZZ", " Y ", " Y ", 'Z', BlocksAether.holystone, 'Y', ItemsAether.skyrootStick);
		register("zanite_pickaxe", new ItemStack(ItemsAether.zanitePickaxe, 1), "ZZZ", " Y ", " Y ", 'Z', ItemsAether.zaniteGemstone, 'Y', ItemsAether.skyrootStick);
		register("gravitite_pickaxe", new ItemStack(ItemsAether.gravititePickaxe, 1), "ZZZ", " Y ", " Y ", 'Z', BlocksAether.enchanted_gravitite, 'Y', ItemsAether.skyrootStick);
		register("skyroot_axe", new ItemStack(ItemsAether.skyrootAxe, 1), "ZZ", "ZY", " Y", 'Z', BlocksAether.skyroot_planks, 'Y', ItemsAether.skyrootStick);
		register("holystone_axe", new ItemStack(ItemsAether.holystoneAxe, 1), "ZZ", "ZY", " Y", 'Z', BlocksAether.holystone, 'Y', ItemsAether.skyrootStick);
		register("zanite_axe", new ItemStack(ItemsAether.zaniteAxe, 1), "ZZ", "ZY", " Y", 'Z', ItemsAether.zaniteGemstone, 'Y', ItemsAether.skyrootStick);
		register("gravitite_axe", new ItemStack(ItemsAether.gravititeAxe, 1), "ZZ", "ZY", " Y", 'Z', BlocksAether.enchanted_gravitite, 'Y', ItemsAether.skyrootStick);
		register("skyroot_shovel", new ItemStack(ItemsAether.skyrootShovel, 1), "Z", "Y", "Y", 'Z', BlocksAether.skyroot_planks, 'Y', ItemsAether.skyrootStick);
		register("holystone_shovel", new ItemStack(ItemsAether.holystoneShovel, 1), "Z", "Y", "Y", 'Z', BlocksAether.holystone, 'Y', ItemsAether.skyrootStick);
		register("zanite_shovel", new ItemStack(ItemsAether.zaniteShovel, 1), "Z", "Y", "Y", 'Z', ItemsAether.zaniteGemstone, 'Y', ItemsAether.skyrootStick);
		register("gravitite_shovel", new ItemStack(ItemsAether.gravititeShovel, 1), "Z", "Y", "Y", 'Z', BlocksAether.enchanted_gravitite, 'Y', ItemsAether.skyrootStick);
		register("skyroot_sword", new ItemStack(ItemsAether.skyrootSword, 1), "Z", "Z", "Y", 'Z', BlocksAether.skyroot_planks, 'Y', ItemsAether.skyrootStick);
		register("holystone_sword", new ItemStack(ItemsAether.holystoneSword, 1), "Z", "Z", "Y", 'Z', BlocksAether.holystone, 'Y', ItemsAether.skyrootStick);
		register("zanite_sword", new ItemStack(ItemsAether.zaniteSword, 1), "Z", "Z", "Y", 'Z', ItemsAether.zaniteGemstone, 'Y', ItemsAether.skyrootStick);
		register("gravitite_sword", new ItemStack(ItemsAether.gravititeSword, 1), "Z", "Z", "Y", 'Z', BlocksAether.enchanted_gravitite, 'Y', ItemsAether.skyrootStick);

		register("white_cape", new ItemStack(ItemsAether.whiteCape), "ZZ", "ZZ", "ZZ", 'Z', new ItemStack(Blocks.wool, 1, 0));

		register("iron_pendant", new ItemStack(ItemsAether.ironPendant), " Z ", "Z Z", " ZS", 'Z', new ItemStack(Items.iron_ingot), 'S', new ItemStack(Items.string));
		register("golden_pendant", new ItemStack(ItemsAether.goldenPendant), " Z ", "Z Z", " ZS", 'Z', new ItemStack(Items.gold_ingot), 'S', new ItemStack(Items.string));

		register("leather_gloves", new ItemStack(ItemsAether.leather_gloves), "C C", 'C', Items.leather);
		register("iron_gloves", new ItemStack(ItemsAether.iron_gloves), "C C", 'C', Items.iron_ingot);
		register("golden_gloves", new ItemStack(ItemsAether.golden_gloves), "C C", 'C', Items.gold_ingot);
		register("diamond_gloves", new ItemStack(ItemsAether.diamond_gloves), "C C", 'C', Items.diamond);
		register("zanite_gloves", new ItemStack(ItemsAether.zanite_gloves), "C C", 'C', ItemsAether.zaniteGemstone);
		register("gravitite_gloves", new ItemStack(ItemsAether.gravitite_gloves), "C C", 'C', BlocksAether.enchanted_gravitite);

		register("skyroot_fence", new ItemStack(BlocksAether.skyroot_fence, 3), "ZXZ", "ZXZ", 'Z', new ItemStack(BlocksAether.skyroot_planks), 'X', new ItemStack(ItemsAether.skyrootStick));
		register("skyroot_fence_gate", new ItemStack(BlocksAether.skyroot_fence_gate), "ZXZ", "ZXZ", 'X', new ItemStack(BlocksAether.skyroot_planks), 'Z', new ItemStack(ItemsAether.skyrootStick));

		register("carved_stone_slab", new ItemStack(BlocksAether.carved_slab, 6), "ZZZ", 'Z', new ItemStack(BlocksAether.carved_stone));
		register("angelic_stone_slab", new ItemStack(BlocksAether.angelic_slab, 6), "ZZZ", 'Z', new ItemStack(BlocksAether.angelic_stone));
		register("hellfire_stone_slab", new ItemStack(BlocksAether.hellfire_slab, 6), "ZZZ", 'Z', new ItemStack(BlocksAether.hellfire_stone));
		register("holystone_slab", new ItemStack(BlocksAether.holystone_slab, 6), "ZZZ", 'Z', new ItemStack(BlocksAether.holystone, 1, 1));
		register("mossy_holystone_slab", new ItemStack(BlocksAether.mossy_holystone_slab, 6), "ZZZ", 'Z', new ItemStack(BlocksAether.mossy_holystone, 1, 1));
		register("holystone_brick_slab", new ItemStack(BlocksAether.holystone_brick_slab, 6), "ZZZ", 'Z', new ItemStack(BlocksAether.holystone_brick, 1));
		register("skyroot_slab", new ItemStack(BlocksAether.skyroot_slab, 6), "ZZZ", 'Z', new ItemStack(BlocksAether.skyroot_planks));

		register("carved_stone_wall", new ItemStack(BlocksAether.carved_wall, 6), "ZZZ", "ZZZ", 'Z', new ItemStack(BlocksAether.carved_stone));
		register("angelic_stone_wall", new ItemStack(BlocksAether.angelic_wall, 6), "ZZZ", "ZZZ", 'Z', new ItemStack(BlocksAether.angelic_stone));
		register("hellfire_stone_wall", new ItemStack(BlocksAether.hellfire_wall, 6), "ZZZ", "ZZZ", 'Z', new ItemStack(BlocksAether.hellfire_stone));
		register("holystone_wall", new ItemStack(BlocksAether.holystone_wall, 6), "ZZZ", "ZZZ", 'Z', new ItemStack(BlocksAether.holystone, 1, 1));
		register("mossy_holystone_wall", new ItemStack(BlocksAether.mossy_holystone_wall, 6), "ZZZ", "ZZZ", 'Z', new ItemStack(BlocksAether.mossy_holystone, 1, 1));
		register("holystone_brick_wall", new ItemStack(BlocksAether.holystone_brick_wall, 6), "ZZZ", "ZZZ", 'Z', new ItemStack(BlocksAether.holystone_brick, 1));

		register("carved_stone_stairs", new ItemStack(BlocksAether.carved_stairs, 4), "Z  ", "ZZ ", "ZZZ", 'Z', new ItemStack(BlocksAether.carved_stone));
		register("angelic_stone_stairs", new ItemStack(BlocksAether.angelic_stairs, 4), "Z  ", "ZZ ", "ZZZ", 'Z', new ItemStack(BlocksAether.angelic_stone));
		register("hellfire_stone_stairs", new ItemStack(BlocksAether.hellfire_stairs, 4), "Z  ", "ZZ ", "ZZZ", 'Z', new ItemStack(BlocksAether.hellfire_stone));
		register("holystone_stairs", new ItemStack(BlocksAether.holystone_stairs, 4), "Z  ", "ZZ ", "ZZZ", 'Z', new ItemStack(BlocksAether.holystone, 1, 1));
		register("mossy_holystone_stairs", new ItemStack(BlocksAether.mossy_holystone_stairs, 4), "Z  ", "ZZ ", "ZZZ", 'Z', new ItemStack(BlocksAether.mossy_holystone, 1, 1));
		register("holystone_brick_stairs", new ItemStack(BlocksAether.holystone_brick_stairs, 4), "Z  ", "ZZ ", "ZZZ", 'Z', new ItemStack(BlocksAether.holystone_brick, 1));
		register("skyroot_stairs", new ItemStack(BlocksAether.skyroot_stairs, 4), "Z  ", "ZZ ", "ZZZ", 'Z', new ItemStack(BlocksAether.skyroot_planks));

		register("skyroot_bookshelf", new ItemStack(BlocksAether.skyroot_bookshelf, 1),  "ZZZ", "XXX", "ZZZ", 'Z', new ItemStack(BlocksAether.skyroot_planks), 'X', new ItemStack(Items.book));

		register("skyroot_bed_item", new ItemStack(ItemsAether.skyrootBedItem, 1),  "XXX", "ZZZ", 'Z', new ItemStack(BlocksAether.skyroot_planks), 'X', Blocks.wool);
	}

	private static void register(String name, ItemStack stack, Object... recipe) {
		GameRegistry.addRecipe(stack, recipe);
	}

	private static void registerShapeless(String name, ItemStack stack, Object... recipe) {
		GameRegistry.addShapelessRecipe(stack, recipe);
	}

}