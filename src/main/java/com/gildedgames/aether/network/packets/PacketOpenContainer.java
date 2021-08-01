package com.gildedgames.aether.network.packets;

import com.gildedgames.aether.Aether;

import io.netty.buffer.ByteBuf;
import net.minecraft.entity.player.EntityPlayer;

public class PacketOpenContainer extends AetherPacket<PacketOpenContainer> {

	public int id;

	public PacketOpenContainer() {

	}

	public PacketOpenContainer(int id) {
		this.id = id;
	}

	@Override
	public void fromBytes(ByteBuf buf) {
		id = buf.readInt();
	}

	@Override
	public void toBytes(ByteBuf buf) {
		buf.writeInt(id);
	}

	@Override
	public void handleClient(PacketOpenContainer message, EntityPlayer player) {
	}

	@Override
	public void handleServer(PacketOpenContainer message, EntityPlayer player) {
		if (message.id == -1) {
			player.openContainer.onContainerClosed(player);
			player.openContainer = player.inventoryContainer;
		}

		player.openGui(Aether.aether, message.id, player.worldObj, (int) player.posX, (int) player.posY, (int) player.posZ);
	}

}