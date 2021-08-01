package com.gildedgames.aether.network;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.ContainerChest;
import net.minecraft.inventory.IInventory;
import net.minecraft.world.World;

import com.gildedgames.aether.client.gui.GuiEnchanter;
import com.gildedgames.aether.client.gui.GuiFreezer;
import com.gildedgames.aether.client.gui.GuiIncubator;
import com.gildedgames.aether.client.gui.GuiLore;
import com.gildedgames.aether.client.gui.GuiTreasureChest;
import com.gildedgames.aether.client.gui.inventory.GuiAccessories;
import com.gildedgames.aether.inventory.ContainerAccessories;
import com.gildedgames.aether.inventory.ContainerEnchanter;
import com.gildedgames.aether.inventory.ContainerFreezer;
import com.gildedgames.aether.inventory.ContainerIncubator;
import com.gildedgames.aether.inventory.ContainerLore;
import com.gildedgames.aether.player.PlayerAether;
import com.gildedgames.aether.tileentity.TileEntityEnchanter;
import com.gildedgames.aether.tileentity.TileEntityFreezer;
import com.gildedgames.aether.tileentity.TileEntityIncubator;
import com.gildedgames.aether.tileentity.TileEntityTreasureChest;

import cpw.mods.fml.common.network.IGuiHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class AetherGUIHandler implements IGuiHandler {

	public static final int ACCESSORIES = 1, ENCHANTER = 2, FREEZER = 3, INCUBATOR = 4, TREASURE_CHEST = 5, LORE = 6;

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		if (ID == ACCESSORIES) {
			return new ContainerAccessories(PlayerAether.get(player).getAccessoryInventory(), player);
		} else if (ID == ENCHANTER) {
			return new ContainerEnchanter(player.inventory, (TileEntityEnchanter) world.getTileEntity(x, y, z));
		} else if (ID == FREEZER) {
			return new ContainerFreezer(player.inventory, (TileEntityFreezer) world.getTileEntity(x, y, z));
		} else if (ID == INCUBATOR) {
			return new ContainerIncubator(player, player.inventory, (TileEntityIncubator) world.getTileEntity(x, y, z));
		} else if (ID == TREASURE_CHEST) {
			return new ContainerChest(player.inventory, (IInventory) world.getTileEntity(x, y, z));
		} else if (ID == LORE) {
			return new ContainerLore(player.inventory);
		}

		return null;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		if (ID == ACCESSORIES) {
			return new GuiAccessories(PlayerAether.get(player));
		} else if (ID == ENCHANTER) {
			return new GuiEnchanter(player.inventory, (TileEntityEnchanter) world.getTileEntity(x, y, z));
		} else if (ID == FREEZER) {
			return new GuiFreezer(player.inventory, (TileEntityFreezer) world.getTileEntity(x, y, z));
		} else if (ID == INCUBATOR) {
			return new GuiIncubator(player, player.inventory, (TileEntityIncubator) world.getTileEntity(x, y, z));
		} else if (ID == TREASURE_CHEST) {
			return new GuiTreasureChest(player.inventory, (TileEntityTreasureChest) world.getTileEntity(x, y, z));
		} else if (ID == LORE) {
			return new GuiLore(player.inventory);
		}

		return null;
	}

}