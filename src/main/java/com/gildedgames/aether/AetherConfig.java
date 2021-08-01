package com.gildedgames.aether;

import java.io.File;
import java.io.IOException;

import net.minecraftforge.common.config.Configuration;

public class AetherConfig {

	public static Configuration config;

	private static int maxLifeShards;

	private static boolean christmasContent, tallGrass, seasonalChristmas;

	private static int aetherBiomeID, aetherDimensionID;

	private static boolean disableTrivia, oldMobs;

	private static boolean skyrootBucketOnly, valkyrieCape, goldenFeather;

	private static boolean floatingBlockCollision;

	private static int travelDimension;

	private static boolean menuEnabled, menuButton, installResourcepack;

	private static boolean legacyAltarName;

	private static int inebriationID;

	private static boolean sunAltarMultiplayer, repeatSunSpiritDialog;

	private static boolean aetherStart;

	private static boolean disableEternalDay;

	private static int phygSpawnrate, flyingcowSpawnrate, sheepuffSpawnrate, aerbunnySpawnrate, moaSpawnrate, aerwhaleSpawnrate;

	private static int zephyrSpawnrate, cockatriceSpawnrate, swetSpawnrate, aechorplantSpawnrate, whirlwindSpawnrate;

	public static void init(File location) {
		File newFile = new File(location + "/aether" + "/AetherI.cfg");

		try {
			newFile.createNewFile();
		} catch (IOException e) {

		}

		config = new Configuration(newFile);

		config.load();

		christmasContent = config.get("Aether World Generation", "Christmas Content", false).getBoolean(false);
		seasonalChristmas = config.get("Aether World Generation", "Spawns Holiday Trees during December and January automatically. Christmas Content overrides this.", true).getBoolean(true);
		tallGrass = config.get("Aether World Generation", "Enable Tall Grass", false).getBoolean(false);

		aetherDimensionID = config.get("World Identification", "Aether Dimension ID", 4).getInt(4);
		aetherBiomeID = config.get("World Identification", "Aether Biome ID", 127).getInt(127);

		skyrootBucketOnly = config.get("Misc", "Activate portal with only Skyroot bucket", false).getBoolean(false);
		valkyrieCape = config.get("Misc", "Enables the Valkyrie Cape in dungeon loot", true).getBoolean(true);
		goldenFeather = config.get("Misc", "Enables the Golden Feather in dungeon loot", false).getBoolean(false);
		travelDimension = config.get("Misc", "Dimension below aether", 0).getInt(0);
		floatingBlockCollision = config.get("Misc", "Floating block collision", true).getBoolean(true);

		disableTrivia = config.get("Trivia", "Disable random trivia", false).getBoolean(false);

		oldMobs = config.get("Misc", "Enable Legacy Visuals", false).getBoolean(false);

		aetherStart = config.get("Gameplay", "Spawns Player with Aether Portal Frame", false).getBoolean(false);

		maxLifeShards = config.get("Gameplay", "Max Life Shards", 10).getInt(10);

		menuEnabled = config.get("Misc", "Enables the Aether Menu", false).getBoolean(false);
		menuButton = config.get("Misc", "Enables the Aether Menu toggle button", true).getBoolean(true);

		installResourcepack = config.get("Misc", "Determines whether the Aether b1.7.3 resource pack should be generated.", true).getBoolean(true);

		legacyAltarName = config.get("Misc", "Changes whether the Altar should be named Enchanter or not.", false).getBoolean(false);

		inebriationID = config.get("Misc", "Sets the id for the Inebriation effect.", 31).getInt(31);

		sunAltarMultiplayer = config.get("Gameplay", "Removes the requirement for a player to be an operator to use the Sun Altar in multiplayer.", false).getBoolean(false);

		repeatSunSpiritDialog = config.get("Misc", "If disabed, the Sun Spirit's dialog will only show once per world.", true).getBoolean(true);

		disableEternalDay = config.get("Misc", "Disables eternal day making time cycle in the Aether without having to kill the Sun Spirit. This is mainly intended for use in modpacks.", false).getBoolean(false);

		//Spawnrates
		phygSpawnrate = config.get("Spawnrates", "Phyg Spawnrate. 1 is always, higher numbers decrease chances.", 1).getInt(1);
		flyingcowSpawnrate = config.get("Spawnrates", "Flying Cow Spawnrate. 1 is always, higher numbers decrease chances.", 1).getInt(1);
		sheepuffSpawnrate = config.get("Spawnrates", "Sheepuff Spawnrate. 1 is always, higher numbers decrease chances.", 1).getInt(1);
		aerbunnySpawnrate = config.get("Spawnrates", "Aerbunny Spawnrate. 1 is always, higher numbers decrease chances.", 1).getInt(1);
		moaSpawnrate = config.get("Spawnrates", "Moa Spawnrate. 1 is always, higher numbers decrease chances.", 1).getInt(1);
		aerwhaleSpawnrate = config.get("Spawnrates", "Aerwhale Spawnrate. 1 is always, higher numbers decrease chances.", 1).getInt(1);
		zephyrSpawnrate = config.get("Spawnrates", "Zephyr Spawnrate. 1 is always, higher numbers decrease chances.", 65).getInt(65);
		cockatriceSpawnrate = config.get("Spawnrates", "Cockatrice Spawnrate. 1 is always, higher numbers decrease chances.", 45).getInt(45);
		swetSpawnrate = config.get("Spawnrates", "Swet Spawnrate. 1 is always, higher numbers decrease chances.", 40).getInt(40);
		aechorplantSpawnrate = config.get("Spawnrates", "Aechor Plant Spawnrate. 1 is always, higher numbers decrease chances.", 55).getInt(55);
		whirlwindSpawnrate = config.get("Spawnrates", "Whirlwind Spawnrate. 1 is always, higher numbers decrease chances.", 55).getInt(55);

		config.save();
	}

	public static int getAetherDimensionID() {
		return AetherConfig.aetherDimensionID;
	}

	public static int getAetherBiomeID() {
		return AetherConfig.aetherBiomeID;
	}

	public static int getMaxLifeShards() {
		return AetherConfig.maxLifeShards;
	}

	public static int getTravelDimensionID() {
		return AetherConfig.travelDimension;
	}

	public static boolean shouldFloatWithBlock() {
		return AetherConfig.floatingBlockCollision;
	}

	public static boolean triviaDisabled() {
		return AetherConfig.disableTrivia;
	}

	public static boolean oldMobsEnabled() {
		return AetherConfig.oldMobs;
	}

	public static boolean shouldLoadHolidayContent() {
		return AetherConfig.christmasContent;
	}

	public static boolean tallgrassEnabled() {
		return AetherConfig.tallGrass;
	}

	public static boolean activateOnlyWithSkyroot() {
		return AetherConfig.skyrootBucketOnly;
	}

	public static boolean valkyrieCapeEnabled()
	{
		return AetherConfig.valkyrieCape;
	}

	public static boolean goldenFeatherEnabled()
	{
		return AetherConfig.goldenFeather;
	}

	public static boolean menuEnabled()
	{
		return AetherConfig.menuEnabled;
	}

	public static boolean menuButtonEnabled()
	{
		return AetherConfig.menuButton;
	}

	public static boolean installResourcepack()
	{
		return AetherConfig.installResourcepack;
	}

	public static boolean legacyAltarName() {
		return AetherConfig.legacyAltarName;
	}

	public static int getInebriationId()
	{
		return AetherConfig.inebriationID;
	}

	public static boolean sunAltarMultiplayer() {
		return AetherConfig.sunAltarMultiplayer;
	}

	public static boolean repeatSunSpiritDialogue() {
		return repeatSunSpiritDialog;
	}

	public static boolean shouldAetherStart()
	{
		return aetherStart;
	}

	public static boolean eternalDayDisabled()
	{
		return disableEternalDay;
	}

	public static boolean allowSeasonalChristmas() {
		return seasonalChristmas;
	}

	public static int getPhygSpawnrate() {
		return phygSpawnrate;
	}
	public static int getFlyingCowSpawnrate() {
		return flyingcowSpawnrate;
	}
	public static int getSheepuffSpawnrate() {
		return sheepuffSpawnrate;
	}
	public static int getAerbunnySpawnrate() {
		return aerbunnySpawnrate;
	}
	public static int getMoaSpawnrate() {
		return moaSpawnrate;
	}
	public static int getAerwhaleSpawnrate() {
		return aerwhaleSpawnrate;
	}
	public static int getZephyrSpawnrate() {
		return zephyrSpawnrate;
	}
	public static int getCockatriceSpawnrate() {
		return cockatriceSpawnrate;
	}
	public static int getSwetSpawnrate() {
		return swetSpawnrate;
	}
	public static int getAechorPlantSpawnrate() {
		return aechorplantSpawnrate;
	}
	public static int getWhirlwindSpawnrate() {
		return whirlwindSpawnrate;
	}
}