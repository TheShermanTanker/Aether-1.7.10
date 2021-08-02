package com.gildedgames.aether.items;

import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.util.EnumChatFormatting;
import net.minecraftforge.common.util.EnumHelper;

import com.gildedgames.aether.Aether;
import com.gildedgames.aether.api.accessories.AccessoryType;
import com.gildedgames.aether.blocks.BlocksAether;
import com.gildedgames.aether.items.accessories.ItemAccessory;
import com.gildedgames.aether.items.accessories.ItemAccessoryDyed;
import com.gildedgames.aether.items.armor.ItemAetherArmor;
import com.gildedgames.aether.items.armor.ItemZaniteArmor;
import com.gildedgames.aether.items.dungeon.ItemDungeonKey;
import com.gildedgames.aether.items.dungeon.ItemVictoryMedal;
import com.gildedgames.aether.items.food.ItemAetherFood;
import com.gildedgames.aether.items.food.ItemAmbrosiumShard;
import com.gildedgames.aether.items.food.ItemGummySwet;
import com.gildedgames.aether.items.food.ItemHealingStone;
import com.gildedgames.aether.items.food.ItemLifeShard;
import com.gildedgames.aether.items.food.ItemWhiteApple;
import com.gildedgames.aether.items.staffs.ItemCloudStaff;
import com.gildedgames.aether.items.staffs.ItemNatureStaff;
import com.gildedgames.aether.items.tools.ItemAetherParachute;
import com.gildedgames.aether.items.tools.ItemGravititeTool;
import com.gildedgames.aether.items.tools.ItemHolystoneTool;
import com.gildedgames.aether.items.tools.ItemSkyrootBucket;
import com.gildedgames.aether.items.tools.ItemSkyrootTool;
import com.gildedgames.aether.items.tools.ItemValkyrieTool;
import com.gildedgames.aether.items.tools.ItemZaniteTool;
import com.gildedgames.aether.items.util.EnumAetherToolType;
import com.gildedgames.aether.items.util.ItemAether;
import com.gildedgames.aether.items.util.ItemDeveloperStick;
import com.gildedgames.aether.items.util.ItemSwettyBall;
import com.gildedgames.aether.items.weapons.ItemCandyCaneSword;
import com.gildedgames.aether.items.weapons.ItemElementalSword;
import com.gildedgames.aether.items.weapons.ItemGravititeSword;
import com.gildedgames.aether.items.weapons.ItemHolystoneSword;
import com.gildedgames.aether.items.weapons.ItemLightningKnife;
import com.gildedgames.aether.items.weapons.ItemNotchHammer;
import com.gildedgames.aether.items.weapons.ItemPigSlayer;
import com.gildedgames.aether.items.weapons.ItemSkyrootSword;
import com.gildedgames.aether.items.weapons.ItemValkyrieLance;
import com.gildedgames.aether.items.weapons.ItemVampireBlade;
import com.gildedgames.aether.items.weapons.ItemZaniteSword;
import com.gildedgames.aether.items.weapons.projectile.ItemDart;
import com.gildedgames.aether.items.weapons.projectile.ItemDartShooter;
import com.gildedgames.aether.items.weapons.projectile.ItemPhoenixBow;
import com.gildedgames.aether.registry.creativetabs.AetherCreativeTabs;

import cpw.mods.fml.common.registry.GameRegistry;

public class ItemsAether {

	public static EnumRarity aetherLoot = EnumHelper.addRarity("aether_legacy_loot", EnumChatFormatting.GREEN, "Aether Loot");

	public static Item zaniteGemstone, ambrosiumShard, goldenAmber, aechorPetal, swetBall;

	public static Item skyrootPickaxe, skyrootAxe, skyrootShovel, skyrootSword;

	public static Item holystonePickaxe, holystoneAxe, holystoneShovel, holystoneSword;

	public static Item zanitePickaxe, zaniteAxe, zaniteShovel, zaniteSword;

	public static Item gravititePickaxe, gravititeAxe, gravititeShovel, gravititeSword;

	public static Item valkyriePickaxe, valkyrieAxe, valkyrieShovel, valkyrieSword;

	public static Item zaniteHelmet, zaniteChestplate, zaniteLeggings, zaniteBoots;

	public static Item gravititeHelmet, gravititeChestplate, gravititeLeggings, gravititeBoots;

	public static Item neptuneHelmet, neptuneChestplate, neptuneLeggings, neptuneBoots;

	public static Item phoenixHelmet, phoenixChestplate, phoenixLeggings, phoenixBoots;

	public static Item obsidianHelmet, obsidianChestplate, obsidianLeggings, obsidianBoots;

	public static Item valkyrieHelmet, valkyrieChestplate, valkyrieLeggings, valkyrieBoots;

	public static Item blueberry, gummySwet, healingStone, whiteApple, gingerbread, candyCane, enchantedBlueberry;

	public static Item skyrootStick, victoryMedal;

	public static Item dungeonKey, skyrootBucket, cloudParachute, goldenParachute;

	public static Item natureStaff, cloudStaff, moaEgg;

	public static Item dartShooter, phoenixBow, dart;

	public static Item flamingSword, lightningSword, holySword;

	public static Item vampireBlade, pigSlayer, candyCaneSword, notchHammer, valkyrieLance;

	public static Item leather_gloves, iron_gloves, golden_gloves, chain_gloves, diamond_gloves;

	public static Item zanite_gloves, gravitite_gloves, neptune_gloves, phoenix_gloves, obsidian_gloves, valkyrie_gloves;

	public static Item ironRing, goldenRing, zaniteRing, iceRing, ironPendant, goldenPendant, zanitePendant, icePendant;

	public static Item whiteCape, redCape, blueCape, yellowCape, swetCape, invisibilityCape, agilityCape, valkyrieCape;

	public static Item goldenFeather, regenerationStone, ironBubble, lifeShard;

	public static Item sentryBoots, lightningKnife;

	public static Item aetherTune, ascendingDawn, welcomingSkies, legacy;

	public static Item repulsionShield;

	public static Item loreBook;

	public static Item developerStick;

	public static Item aetherSpawnEgg;

	public static Item skyrootBedItem;

	public static Item aetherPortalFrame;

	public static void initialization() {
		zaniteGemstone = register("zanite_gemstone", new ItemAether(AetherCreativeTabs.material).setTextureName(Aether.find("misc/zanite_gemstone")));
		ambrosiumShard = register("ambrosium_shard", new ItemAmbrosiumShard().setTextureName(Aether.find("misc/ambrosium_shard")));
		goldenAmber = register("golden_amber", new ItemAether(AetherCreativeTabs.material).setTextureName(Aether.find("misc/golden_amber")));
		aechorPetal = register("aechor_petal", new ItemAether(AetherCreativeTabs.material).setTextureName(Aether.find("misc/aechor_petal")));
		swetBall = register("swet_ball", new ItemSwettyBall(AetherCreativeTabs.material).setTextureName(Aether.find("misc/swet_ball")));

		skyrootPickaxe = register("skyroot_pickaxe", new ItemSkyrootTool(2.0F, EnumAetherToolType.PICKAXE).setTextureName(Aether.find("tools/skyroot_pickaxe")));
		skyrootAxe = register("skyroot_axe", new ItemSkyrootTool(3.0F, EnumAetherToolType.AXE).setTextureName(Aether.find("tools/skyroot_axe")));
		skyrootShovel = register("skyroot_shovel", new ItemSkyrootTool(1.0F, EnumAetherToolType.SHOVEL).setTextureName(Aether.find("tools/skyroot_shovel")));

		holystonePickaxe = register("holystone_pickaxe", new ItemHolystoneTool(2.0F, EnumAetherToolType.PICKAXE).setTextureName(Aether.find("tools/holystone_pickaxe")));
		holystoneAxe = register("holystone_axe", new ItemHolystoneTool(3.0F, EnumAetherToolType.AXE).setTextureName(Aether.find("tools/holystone_axe")));
		holystoneShovel = register("holystone_shovel", new ItemHolystoneTool(1.0F, EnumAetherToolType.SHOVEL).setTextureName(Aether.find("tools/holystone_shovel")));

		zanitePickaxe = register("zanite_pickaxe", new ItemZaniteTool(2.0F, EnumAetherToolType.PICKAXE).setTextureName(Aether.find("tools/zanite_pickaxe")));
		zaniteAxe = register("zanite_axe", new ItemZaniteTool(3.0F, EnumAetherToolType.AXE).setTextureName(Aether.find("tools/zanite_axe")));
		zaniteShovel = register("zanite_shovel", new ItemZaniteTool(1.0F, EnumAetherToolType.SHOVEL).setTextureName(Aether.find("tools/zanite_shovel")));

		gravititePickaxe = register("gravitite_pickaxe", new ItemGravititeTool(2.0F, EnumAetherToolType.PICKAXE).setTextureName(Aether.find("tools/gravitite_pickaxe")));
		gravititeAxe = register("gravitite_axe", new ItemGravititeTool(3.0F, EnumAetherToolType.AXE).setTextureName(Aether.find("tools/gravitite_axe")));
		gravititeShovel = register("gravitite_shovel", new ItemGravititeTool(1.0F, EnumAetherToolType.SHOVEL).setTextureName(Aether.find("tools/gravitite_shovel")));

		valkyriePickaxe = register("valkyrie_pickaxe", new ItemValkyrieTool(2.0F, EnumAetherToolType.PICKAXE).setTextureName(Aether.find("tools/valkyrie_pickaxe")));
		valkyrieAxe = register("valkyrie_axe", new ItemValkyrieTool(3.0F, EnumAetherToolType.AXE).setTextureName(Aether.find("tools/valkyrie_axe")));
		valkyrieShovel = register("valkyrie_shovel", new ItemValkyrieTool(1.0F, EnumAetherToolType.SHOVEL).setTextureName(Aether.find("tools/valkyrie_shovel")));

		zaniteHelmet = register("zanite_helmet", new ItemZaniteArmor(0, ArmorMaterial.IRON, "zanite", zaniteGemstone, 0x711ae8).setTextureName(Aether.find("armor/zanite_helmet")));
		zaniteChestplate = register("zanite_chestplate", new ItemZaniteArmor(1, ArmorMaterial.IRON, "zanite", zaniteGemstone, 0x711ae8).setTextureName(Aether.find("armor/zanite_chestplate")));
		zaniteLeggings = register("zanite_leggings", new ItemZaniteArmor(2, ArmorMaterial.IRON, "zanite", zaniteGemstone, 0x711ae8).setTextureName(Aether.find("armor/zanite_leggings")));
		zaniteBoots = register("zanite_boots", new ItemZaniteArmor(3, ArmorMaterial.IRON, "zanite", zaniteGemstone, 0x711ae8).setTextureName(Aether.find("armor/zanite_boots")));

		gravititeHelmet = register("gravitite_helmet", new ItemAetherArmor(0, ArmorMaterial.DIAMOND, "gravitite", Item.getItemFromBlock(BlocksAether.enchantedGravitite), 0xe752db).setTextureName(Aether.find("armor/gravitite_helmet")));
		gravititeChestplate = register("gravitite_chestplate", new ItemAetherArmor(1, ArmorMaterial.DIAMOND, "gravitite", Item.getItemFromBlock(BlocksAether.enchantedGravitite), 0xe752db).setTextureName(Aether.find("armor/gravitite_chestplate")));
		gravititeLeggings = register("gravitite_leggings", new ItemAetherArmor(2, ArmorMaterial.DIAMOND, "gravitite", Item.getItemFromBlock(BlocksAether.enchantedGravitite), 0xe752db).setTextureName(Aether.find("armor/gravitite_leggings")));
		gravititeBoots = register("gravitite_boots", new ItemAetherArmor(3, ArmorMaterial.DIAMOND, "gravitite", Item.getItemFromBlock(BlocksAether.enchantedGravitite), 0xe752db).setTextureName(Aether.find("armor/gravitite_boots")));

		neptuneHelmet = register("neptune_helmet", new ItemAetherArmor(0, ArmorMaterial.DIAMOND, "neptune", null, 0x2654FF).setTextureName(Aether.find("armor/neptune_helmet")));
		neptuneChestplate = register("neptune_chestplate", new ItemAetherArmor(1, ArmorMaterial.DIAMOND, "neptune", null, 0x2654FF).setTextureName(Aether.find("armor/neptune_chestplate")));
		neptuneLeggings = register("neptune_leggings", new ItemAetherArmor(2, ArmorMaterial.DIAMOND, "neptune", null, 0x2654FF).setTextureName(Aether.find("armor/neptune_leggings")));
		neptuneBoots = register("neptune_boots", new ItemAetherArmor(3, ArmorMaterial.DIAMOND, "neptune", null, 0x2654FF).setTextureName(Aether.find("armor/neptune_boots")));

		phoenixHelmet = register("phoenix_helmet", new ItemAetherArmor(0, ArmorMaterial.DIAMOND, "phoenix", null).setTextureName(Aether.find("armor/phoenix_helmet")));
		phoenixChestplate = register("phoenix_chestplate", new ItemAetherArmor(1, ArmorMaterial.DIAMOND, "phoenix", null).setTextureName(Aether.find("armor/phoenix_chestplate")));
		phoenixLeggings = register("phoenix_leggings", new ItemAetherArmor(2, ArmorMaterial.DIAMOND, "phoenix", null).setTextureName(Aether.find("armor/phoenix_leggings")));
		phoenixBoots = register("phoenix_boots", new ItemAetherArmor(3, ArmorMaterial.DIAMOND, "phoenix", null).setTextureName(Aether.find("armor/phoenix_boots")));

		obsidianHelmet = register("obsidian_helmet", new ItemAetherArmor(0, ArmorMaterial.DIAMOND, "obsidian", null, 0x1b1447).setTextureName(Aether.find("armor/obsidian_helmet")));
		obsidianChestplate = register("obsidian_chestplate", new ItemAetherArmor(1, ArmorMaterial.DIAMOND, "obsidian", null, 0x1b1447).setTextureName(Aether.find("armor/obsidian_chestplate")));
		obsidianLeggings = register("obsidian_leggings", new ItemAetherArmor(2, ArmorMaterial.DIAMOND, "obsidian", null, 0x1b1447).setTextureName(Aether.find("armor/obsidian_leggings")));
		obsidianBoots = register("obsidian_boots", new ItemAetherArmor(3, ArmorMaterial.DIAMOND, "obsidian", null, 0x1b1447).setTextureName(Aether.find("armor/obsidian_boots")));

		valkyrieHelmet = register("valkyrie_helmet", new ItemAetherArmor(0, ArmorMaterial.DIAMOND, "valkyrie", null).setTextureName(Aether.find("armor/valkyrie_helmet")));
		valkyrieChestplate = register("valkyrie_chestplate", new ItemAetherArmor(1, ArmorMaterial.DIAMOND, "valkyrie", null).setTextureName(Aether.find("armor/valkyrie_chestplate")));
		valkyrieLeggings = register("valkyrie_leggings", new ItemAetherArmor(2, ArmorMaterial.DIAMOND, "valkyrie", null).setTextureName(Aether.find("armor/valkyrie_leggings")));
		valkyrieBoots = register("valkyrie_boots", new ItemAetherArmor(3, ArmorMaterial.DIAMOND, "valkyrie", null).setTextureName(Aether.find("armor/valkyrie_boots")));

		blueberry = register("blueberry", new ItemAetherFood(2).setTextureName(Aether.find("food/blueberry")));
		enchantedBlueberry = register("enchanted_blueberry", new ItemAetherFood(8).setTextureName(Aether.find("food/enchanted_blueberry")));
		whiteApple = register("white_apple", new ItemWhiteApple().setTextureName(Aether.find("food/white_apple")));
		gummySwet = register("gummy_swet", new ItemGummySwet());
		healingStone = register("healing_stone", new ItemHealingStone().setTextureName(Aether.find("food/healing_stone")));
		candyCane = register("candy_cane", new ItemAetherFood(2).setTextureName(Aether.find("food/candycane")));
		gingerbread = register("gingerbread_man", new ItemAetherFood(2).setTextureName(Aether.find("food/gingerbread_man")));

		skyrootStick = register("skyroot_stick", new Item().setCreativeTab(AetherCreativeTabs.material).setTextureName(Aether.find("skyroot_stick")));
		victoryMedal = register("victory_medal", new ItemVictoryMedal().setTextureName(Aether.find("victory_medal")));

		dungeonKey = register("dungeon_key", new ItemDungeonKey());
		skyrootBucket = register("skyroot_bucket", new ItemSkyrootBucket());
		cloudParachute = register("cold_parachute", new ItemAetherParachute().setTextureName(Aether.find("misc/parachutes/cold_parachute")));
		goldenParachute = register("golden_parachute", new ItemAetherParachute().setTextureName(Aether.find("misc/parachutes/golden_parachute")));

		moaEgg = register("moa_egg", new ItemMoaEgg());

		dartShooter = register("dart_shooter", new ItemDartShooter());
		phoenixBow = register("phoenix_bow", new ItemPhoenixBow());
		dart = register("dart", new ItemDart());

		skyrootSword = register("skyroot_sword", new ItemSkyrootSword().setTextureName(Aether.find("weapons/skyroot_sword")));
		holystoneSword = register("holystone_sword", new ItemHolystoneSword().setTextureName(Aether.find("weapons/holystone_sword")));
		zaniteSword = register("zanite_sword", new ItemZaniteSword().setTextureName(Aether.find("weapons/zanite_sword")));
		gravititeSword = register("gravitite_sword", new ItemGravititeSword().setTextureName(Aether.find("weapons/gravitite_sword")));

		flamingSword = register("flaming_sword", new ItemElementalSword().setTextureName(Aether.find("weapons/flaming_sword")));
		lightningSword = register("lightning_sword", new ItemElementalSword().setTextureName(Aether.find("weapons/lightning_sword")));
		holySword = register("holy_sword", new ItemElementalSword().setTextureName(Aether.find("weapons/holy_sword")));

		vampireBlade = register("vampire_blade", new ItemVampireBlade().setTextureName(Aether.find("weapons/vampire_blade")));
		pigSlayer = register("pig_slayer", new ItemPigSlayer().setTextureName(Aether.find("weapons/pig_slayer")));
		candyCaneSword = register("candy_cane_sword", new ItemCandyCaneSword().setTextureName(Aether.find("weapons/candycane_sword")));
		notchHammer = register("notch_hammer", new ItemNotchHammer().setTextureName(Aether.find("weapons/notch_hammer")));

		leather_gloves = register("leather_gloves", new ItemAccessoryDyed(AccessoryType.GLOVES).setTextureName(Aether.find("accessories/leather_gloves")));
		iron_gloves = register("iron_gloves", new ItemAccessory(AccessoryType.GLOVES).setTextureName(Aether.find("accessories/solid_gloves")));
		golden_gloves = register("golden_gloves", new ItemAccessory(AccessoryType.GLOVES).setColor(0xFBF424).setTextureName(Aether.find("accessories/solid_gloves")));
		chain_gloves = register("chain_gloves", new ItemAccessory(AccessoryType.GLOVES).setTexture("chain").setTextureName(Aether.find("accessories/chain_gloves")));
		diamond_gloves = register("diamond_gloves", new ItemAccessory(AccessoryType.GLOVES).setColor(0x33ebcb).setTextureName(Aether.find("accessories/solid_gloves")));

		zanite_gloves = register("zanite_gloves", new ItemAccessory(AccessoryType.GLOVES).setColor(0x711ae8).setTextureName(Aether.find("accessories/solid_gloves")));
		gravitite_gloves = register("gravitite_gloves", new ItemAccessory(AccessoryType.GLOVES).setColor(0xe752db).setTextureName(Aether.find("accessories/solid_gloves")));
		neptune_gloves = register("neptune_gloves", new ItemAccessory(AccessoryType.GLOVES).setDungeonLoot().setColor(0x2654FF).setTextureName(Aether.find("accessories/chain_gloves")));
		phoenix_gloves = register("phoenix_gloves", new ItemAccessory(AccessoryType.GLOVES).setTexture("phoenix").setDungeonLoot().setMaxDamage(152).setTextureName(Aether.find("accessories/phoenix_gloves")));
		obsidian_gloves = register("obsidian_gloves", new ItemAccessory(AccessoryType.GLOVES).setDungeonLoot().setColor(0x1b1447).setTextureName(Aether.find("accessories/solid_gloves")));
		valkyrie_gloves = register("valkyrie_gloves", new ItemAccessory(AccessoryType.GLOVES).setDungeonLoot().setTexture("valkyrie").setTextureName(Aether.find("accessories/valkyrie_gloves")));

		ironRing = register("iron_ring", new ItemAccessory(AccessoryType.RING).setTextureName(Aether.find("accessories/ring_base")));
		goldenRing = register("golden_ring", new ItemAccessory(AccessoryType.RING).setColor(0xeaee57).setTextureName(Aether.find("accessories/ring_base")));
		zaniteRing = register("zanite_ring", new ItemAccessory(AccessoryType.RING).setColor(0x711ae8).setMaxDamage(49).setTextureName(Aether.find("accessories/ring_base")));
		iceRing = register("ice_ring", new ItemAccessory(AccessoryType.RING).setColor(0x95e6e7).setMaxDamage(125).setTextureName(Aether.find("accessories/ring_base")));

		ironPendant = register("iron_pendant", new ItemAccessory(AccessoryType.PENDANT).setTextureName(Aether.find("accessories/pendant_base")));
		goldenPendant = register("golden_pendant", new ItemAccessory(AccessoryType.PENDANT).setColor(0xeaee57).setTextureName(Aether.find("accessories/pendant_base")));
		zanitePendant = register("zanite_pendant", new ItemAccessory(AccessoryType.PENDANT).setColor(0x711ae8).setMaxDamage(98).setTextureName(Aether.find("accessories/pendant_base")));
		icePendant = register("ice_pendant", new ItemAccessory(AccessoryType.PENDANT).setColor(0x95e6e7).setMaxDamage(250).setTextureName(Aether.find("accessories/pendant_base")));

		redCape = register("red_cape", new ItemAccessory(AccessoryType.CAPE).setColor(0xe81111).setTextureName(Aether.find("accessories/cape_color_base")));
		blueCape = register("blue_cape", new ItemAccessory(AccessoryType.CAPE).setColor(0x137fb7).setTextureName(Aether.find("accessories/cape_color_base")));
		yellowCape = register("yellow_cape", new ItemAccessory(AccessoryType.CAPE).setColor(0xcdcb0e).setTextureName(Aether.find("accessories/cape_color_base")));
		whiteCape = register("white_cape", new ItemAccessory(AccessoryType.CAPE).setTextureName(Aether.find("accessories/cape_color_base")));
		swetCape = register("swet_cape", new ItemAccessory(AccessoryType.CAPE).setTexture("swet_cape").setDungeonLoot().setTextureName(Aether.find("accessories/swet_cape")));
		invisibilityCape = register("invisibility_cape", new ItemAccessory(AccessoryType.CAPE).setDungeonLoot().setTextureName(Aether.find("accessories/invisibility_cape")));
		agilityCape = register("agility_cape", new ItemAccessory(AccessoryType.CAPE).setTexture("agility_cape").setDungeonLoot().setTextureName(Aether.find("accessories/agility_cape")));
		valkyrieCape = register("valkyrie_cape", new ItemAccessory(AccessoryType.CAPE).setTexture("valkyrie_cape").setDungeonLoot().setTextureName(Aether.find("accessories/valkyrie_cape")));

		goldenFeather = register("golden_feather", new ItemAccessory(AccessoryType.MISC).setDungeonLoot().setTextureName(Aether.find("accessories/golden_feather")));
		regenerationStone = register("regeneration_stone", new ItemAccessory(AccessoryType.MISC).setDungeonLoot().setTextureName(Aether.find("accessories/regeneration_stone")));
		ironBubble = register("iron_bubble", new ItemAccessory(AccessoryType.MISC).setDungeonLoot().setTextureName(Aether.find("accessories/iron_bubble")));

		lifeShard = register("life_shard", new ItemLifeShard().setTextureName(Aether.find("misc/life_shard")));
		cloudStaff = register("cloud_staff", new ItemCloudStaff().setTextureName(Aether.find("staff/cloud_staff")));
		natureStaff = register("nature_staff", new ItemNatureStaff().setTextureName(Aether.find("staff/nature_staff")));
		lightningKnife = register("lightning_knife", new ItemLightningKnife().setTextureName(Aether.find("weapons/lightning_knife")));

		valkyrieLance = register("valkyrie_lance", new ItemValkyrieLance().setTextureName(Aether.find("weapons/valkyrie_lance")));
		sentryBoots = register("sentry_boots", new ItemAetherArmor(3, ArmorMaterial.DIAMOND, "sentry", null).setTextureName(Aether.find("armor/sentry_boots")));

		aetherTune = register("aether_tune", new ItemAetherDisc("aether_tune", "Noisestorm").setTextureName(Aether.find("music/aether_tune")));
		ascendingDawn = register("ascending_dawn", new ItemAetherDisc("ascending_dawn", "Emile van Krieken").setTextureName(Aether.find("music/ascending_dawn")));
		welcomingSkies = register("welcoming_skies", new ItemAetherDisc("welcoming_skies", "Voyed").setTextureName(Aether.find("music/welcoming_skies")));
		legacy = register("legacy", new ItemAetherDisc("legacy", "Jon Lachney").setTextureName(Aether.find("music/legacy")));

		repulsionShield = register("repulsion_shield", new ItemAccessory(AccessoryType.SHIELD).setTexture("repulsion").setInactiveTexture("repulsion_movement").setDungeonLoot().setMaxDamage(512).setTextureName(Aether.find("accessories/repulsion_shield")));
		loreBook = register("lore_book", new ItemLoreBook().setTextureName(Aether.find("misc/lore_book")));

		developerStick = register("developer_stick", new ItemDeveloperStick().setTextureName(Aether.find("skyroot_stick")));

		aetherSpawnEgg = register("aether_spawn_egg", new ItemAetherSpawnEgg().setTextureName("spawn_egg"));

		skyrootBedItem = register("skyroot_bed_item", new ItemSkyrootBed().setTextureName(Aether.find("skyroot_bed_item")));

		aetherPortalFrame = register("aether_portal_frame", new ItemAetherPortalFrame().setTextureName(Aether.find("aether_portal_frame")));
	}

	public static Item register(String name, Item item) {
		item.setUnlocalizedName(name);
		GameRegistry.registerItem(item, name, Aether.MOD_ID);

		return item;
	}

}