package com.gildedgames.aether.tileentity;

import java.util.concurrent.ThreadLocalRandom;

import com.gildedgames.aether.world.dungeon.BronzeDungeon;
import com.gildedgames.aether.world.gen.components.ComponentGoldenDungeon;
import com.gildedgames.aether.world.gen.components.ComponentSilverDungeon;

import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.Packet;
import net.minecraft.network.play.server.S35PacketUpdateTileEntity;
import net.minecraft.server.management.ServerConfigurationManager;
import net.minecraft.tileentity.TileEntityChest;
import cpw.mods.fml.common.FMLCommonHandler;

public class TileEntityTreasureChest extends TileEntityChest {

	private boolean locked = true;

	private int kind = 0;

	public TileEntityTreasureChest(int dungeonType) {
		this.kind = dungeonType;
		int p;

		if (this.kind == 0) {
			for (p = 0; p < 5 + ThreadLocalRandom.current().nextInt(1); ++p) {
				this.setInventorySlotContents(ThreadLocalRandom.current().nextInt(this.getSizeInventory()), BronzeDungeon.getBronzeLoot(ThreadLocalRandom.current()));
			}
		}

		if (this.kind == 1) {
			for (p = 0; p < 5 + ThreadLocalRandom.current().nextInt(1); ++p) {
				this.setInventorySlotContents(ThreadLocalRandom.current().nextInt(this.getSizeInventory()), ComponentSilverDungeon.getSilverLoot(ThreadLocalRandom.current()));
			}
		}

		if (this.kind == 2) {
			for (p = 0; p < 5 + ThreadLocalRandom.current().nextInt(1); ++p) {
				this.setInventorySlotContents(ThreadLocalRandom.current().nextInt(this.getSizeInventory()), ComponentGoldenDungeon.getGoldLoot(ThreadLocalRandom.current()));
			}
		}
	}

	@Override
	public void readFromNBT(NBTTagCompound compound) {
		super.readFromNBT(compound);

		this.locked = compound.getBoolean("locked");
		this.kind = compound.getInteger("dungeonType");
	}

	@Override
	public void writeToNBT(NBTTagCompound compound) {
		super.writeToNBT(compound);

		compound.setBoolean("locked", this.locked);
		compound.setInteger("dungeonType", this.kind);
	}

	public void unlock(int kind) {
		if(kind != this.kind) return;

		this.locked = false;

		if (!this.worldObj.isRemote) {
			this.sendToAllInOurWorld(this.getDescriptionPacket());
		}
	}

	@Override
	public void onDataPacket(NetworkManager net, S35PacketUpdateTileEntity pkt) {
		this.readFromNBT(pkt.func_148857_g());
	}

	@Override
	public Packet getDescriptionPacket() {
		NBTTagCompound nbttagcompound = new NBTTagCompound();
		this.writeToNBT(nbttagcompound);
		return new S35PacketUpdateTileEntity(this.xCoord, this.yCoord, this.zCoord, 1, nbttagcompound);
	}

	@Override
	public void openInventory() {
		super.openInventory();
	}

	@Override
	public void closeInventory() {
		--this.numPlayersUsing;
		this.worldObj.addBlockEvent(this.xCoord, this.yCoord, this.zCoord, this.getBlockType(), 1, this.numPlayersUsing);
		this.worldObj.notifyBlocksOfNeighborChange(this.xCoord, this.yCoord, this.zCoord, this.getBlockType());
		this.worldObj.notifyBlocksOfNeighborChange(this.xCoord, this.yCoord - 1, this.zCoord, this.getBlockType());
	}

	private void sendToAllInOurWorld(Packet pkt) {
		ServerConfigurationManager scm = FMLCommonHandler.instance().getMinecraftServerInstance().getConfigurationManager();

		for (Object obj : scm.playerEntityList) {
			EntityPlayerMP player = (EntityPlayerMP) obj;

			if (this.worldObj == player.worldObj) {
				player.playerNetServerHandler.sendPacket(pkt);
			}
		}
	}

	public boolean isLocked() {
		return this.locked;
	}

	public int getKind() {
		return this.kind;
	}

}