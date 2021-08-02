package com.gildedgames.aether.blocks.dungeon;

import java.util.Random;

import com.gildedgames.aether.Aether;
import com.gildedgames.aether.CommonProxy;
import com.gildedgames.aether.items.ItemsAether;
import com.gildedgames.aether.network.AetherGUIHandler;
import com.gildedgames.aether.tileentity.TileEntityTreasureChest;

import net.minecraft.block.BlockChest;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockTreasureChest extends BlockChest {

	private int dungeonType;

	public BlockTreasureChest(int dungeonType) {
		super(56);

		this.setHardness(-1.0F);
		this.setResistance(2000.0F);
		this.dungeonType = dungeonType;
	}

	@Override
	public float getBlockHardness(World world, int locX, int locY, int locZ) {
		TileEntityTreasureChest treasurechest = (TileEntityTreasureChest) world.getTileEntity(locX, locY, locZ);

		if (treasurechest != null) {
			return treasurechest.isLocked() ? this.blockHardness : 5.0F;
		} else {
			return this.blockHardness;
		}
	}

	@Override
	public float getExplosionResistance(Entity entity, World world, int x, int y, int z, double explosionX, double explosionY, double explosionZ) {
		TileEntityTreasureChest treasurechest = (TileEntityTreasureChest) world.getTileEntity(x, y, z);

		if (treasurechest != null) {
			return treasurechest.isLocked() ? this.blockResistance : 10.0F;
		} else {
			return this.blockResistance;
		}
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister registry) {
		this.blockIcon = registry.registerIcon(Aether.find("carved_stone"));
	}

	@Override
	public TileEntity createNewTileEntity(World worldIn, int meta) {
		return new TileEntityTreasureChest(this.dungeonType);
	}

	@Override
	public boolean onBlockActivated(World worldIn, int x, int y, int z, EntityPlayer playerIn, int side, float hitX, float hitY, float hitZ) {
		if (worldIn.isRemote) {
			return true;
		}

		TileEntityTreasureChest treasurechest = (TileEntityTreasureChest) worldIn.getTileEntity(x, y, z);

		ItemStack guiID = playerIn.getCurrentEquippedItem();

		if (treasurechest.isLocked()) {
			if (guiID == null || guiID != null && guiID.getItem() != ItemsAether.dungeonKey) {
				return false;
			}
			if(guiID.getItemDamage() != treasurechest.getKind()) return false;

			treasurechest.unlock(guiID.getItemDamage());

			--guiID.stackSize;
		} else {
			playerIn.openGui(Aether.aether, AetherGUIHandler.TREASURE_CHEST, worldIn, x, y, z);
		}

		return true;
	}

	@Override
	public int quantityDropped(Random random) {
		return 0;
	}

	@Override
	public int getRenderType() {
		return CommonProxy.treasureChestRenderID;
	}

}