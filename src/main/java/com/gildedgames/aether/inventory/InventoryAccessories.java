package com.gildedgames.aether.inventory;

import io.netty.buffer.ByteBuf;

import java.util.List;

import com.gildedgames.aether.api.accessories.AccessoryType;
import com.gildedgames.aether.api.player.IPlayerAether;
import com.gildedgames.aether.api.player.util.IAccessoryInventory;
import com.gildedgames.aether.items.ItemsAether;
import com.gildedgames.aether.items.accessories.ItemAccessory;
import com.gildedgames.aether.network.AetherNetwork;
import com.gildedgames.aether.network.packets.PacketAccessory;
import com.gildedgames.aether.util.FilledList;

import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.util.ObjectIntIdentityMap;
import cpw.mods.fml.common.network.ByteBufUtils;

public class InventoryAccessories implements IAccessoryInventory {

	private final FilledList<ItemStack> stacks = new FilledList<ItemStack>(8, null);

	private ObjectIntIdentityMap orderedList = AccessoryType.createCompleteList();

	private IPlayerAether playerAether;

	public InventoryAccessories(IPlayerAether playerAether) {
		this.playerAether = playerAether;
	}

	public float getCurrentPlayerStrVsBlock(float original) {
		float f = original;

		if (this.wearingAccessory(new ItemStack(ItemsAether.zanitePendant))) {
			f *= (1F + ((float) (this.getStackInSlot(AccessoryType.PENDANT).getItemDamage()) / ((float) (this.getStackInSlot(AccessoryType.PENDANT).getMaxDamage()) * 3F)));
		}

		if (this.getStackInSlot(AccessoryType.RING) != null && this.getStackInSlot(AccessoryType.RING).getItem() == ItemsAether.zaniteRing) {
			f *= (1F + ((float) (this.getStackInSlot(AccessoryType.RING).getItemDamage()) / ((float) (this.getStackInSlot(AccessoryType.RING).getMaxDamage()) * 3F)));
		}

		if (this.getStackInSlot(AccessoryType.EXTRA_RING) != null && this.getStackInSlot(AccessoryType.EXTRA_RING).getItem() == ItemsAether.zaniteRing) {
			f *= (1F + ((float) (this.getStackInSlot(AccessoryType.EXTRA_RING).getItemDamage()) / ((float) (this.getStackInSlot(AccessoryType.EXTRA_RING).getMaxDamage()) * 3F)));
		}

		return f == original ? original : f + original;
	}

	@Override
	public int getSizeInventory() {
		return this.stacks.size();
	}

	@Override
	public ItemStack getStackInSlot(int slot) {
		return this.stacks.get(slot);
	}

	@Override
	public ItemStack decrStackSize(int slot, int size) {
		ItemStack stack = this.getStackInSlot(slot);

		if (stack.stackSize <= size) {
			this.setInventorySlotContents(slot, null);

			return stack;
		}

		if (stack.stackSize == 0) {
			this.setInventorySlotContents(slot, null);
		}

		return this.stacks.get(slot).splitStack(size);
	}

	@Override
	public ItemStack getStackInSlotOnClosing(int slot) {
		ItemStack stack = this.getStackInSlot(slot);

		if (this.getStackInSlot(slot) != null) {
			this.setInventorySlotContents(slot, null);
		}

		return stack;
	}

	@Override
	public void setInventorySlotContents(int slot, ItemStack stack) {
		this.stacks.set(slot, stack);
		this.markDirty();
	}

	@Override
	public String getInventoryName() {
		return "aether_legacy:accessories";
	}

	@Override
	public boolean hasCustomInventoryName() {
		return true;
	}

	@Override
	public int getInventoryStackLimit() {
		return 1;
	}

	@Override
	public void markDirty() {
		if (!this.playerAether.getEntity().worldObj.isRemote && this.playerAether.getEntity() instanceof EntityPlayer) {
			AetherNetwork.sendToAll(new PacketAccessory(this.playerAether));
		}
	}

	@Override
	public boolean isUseableByPlayer(EntityPlayer player) {
		return !player.isInsideOfMaterial(Material.portal) || !player.isDead;
	}

	@Override
	public void openInventory() {

	}

	@Override
	public void closeInventory() {

	}

	@Override
	public boolean isItemValidForSlot(int slot, ItemStack stack) {
		if (stack != null && stack.getItem() instanceof ItemAccessory) {
			return ((this.orderedList.func_148745_a(slot) == ((ItemAccessory) stack.getItem()).getType()) || (this.orderedList.func_148745_a(slot) == ((ItemAccessory) stack.getItem()).getExtraType())) && this.getStackInSlot(slot) == null;
		}

		return false;
	}

	@Override
	public void dropAccessories() {
		for (int i = 0; i < this.getSizeInventory(); ++i) {
			ItemStack stack = this.getStackInSlot(i);

			if (stack != null) {
				this.playerAether.getEntity().dropItem(stack.getItem(), stack.stackSize);
			}
		}

		this.markDirty();
	}

	@Override
	public void damageAccessory(int damage, AccessoryType type) {
		ItemStack stack = this.getStackInSlot(type);

		if (stack != null) {
			stack.damageItem(damage, this.playerAether.getEntity());
		}
	}

	@Override
	public void damageWornStack(int damage, ItemStack search) {
		int slot = -1;

		for (int i = 0; i < this.stacks.size(); ++i) {
			ItemStack index = this.stacks.get(i);

			if (slot == -1 && index != null && search.getItem() == index.getItem()) {
				slot = i;
			}
		}

		if (slot != -1) {
			this.stacks.get(slot).damageItem(damage, this.playerAether.getEntity());

			ItemStack stack = this.stacks.get(slot);

			if (stack.stackSize == 0) {
				this.setInventorySlotContents(slot, null);
				this.playerAether.getEntity().renderBrokenItemStack(stack);
			}
		}
	}

	@Override
	public void setAccessorySlot(AccessoryType type, ItemStack stack) {
		if (stack.getItem() instanceof ItemAccessory) {
			if (this.getStackInSlot(type) == null) {
				this.setInventorySlotContents(this.orderedList.func_148747_b(type), stack);
			} else if (this.getStackInSlot(((ItemAccessory) stack.getItem()).getExtraType()) == null) {
				this.setAccessorySlot(((ItemAccessory) stack.getItem()).getExtraType(), stack);
			}
		}
	}

	@Override
	public ItemStack getStackInSlot(AccessoryType type) {
		return this.getStackInSlot(this.orderedList.func_148747_b(type));
	}

	@Override
	public ItemStack removeStackFromAccessorySlot(AccessoryType type) {
		ItemStack stack = this.getStackInSlot(this.orderedList.func_148747_b(type));

		if (stack != null) {
			this.setAccessorySlot(type, null);
		}

		return stack;
	}

	@Override
	public int getAccessoryCount(ItemStack stack) {
		int count = 0;

		for (int i = 0; i < this.getSizeInventory(); ++i) {
			ItemStack accessoryStack = this.getStackInSlot(i);

			if (accessoryStack != null && accessoryStack.getItem() == stack.getItem()) {
				++count;
			}
		}

		return count;
	}

	@Override
	public boolean setAccessorySlot(ItemStack stack) {
		for (int i = 0; i < this.getSizeInventory(); ++i) {
			if (this.isItemValidForSlot(i, stack)) {
				this.stacks.set(i, stack);
				this.markDirty();

				return true;
			}
		}

		return false;
	}

	@Override
	public boolean wearingAccessory(ItemStack stack) {
		boolean flag = false;

		for (int i = 0; i < this.getSizeInventory(); ++i) {
			ItemStack accessoryStack = this.getStackInSlot(i);

			if (!flag && accessoryStack != null && accessoryStack.getItem() == stack.getItem()) {
				flag = true;
			}
		}

		return flag;
	}

	@Override
	public boolean wearingArmor(ItemStack stack) {
		if (this.playerAether.getEntity() instanceof EntityPlayer) {
			EntityPlayer player = (EntityPlayer) this.playerAether.getEntity();
			boolean flag = false;

			for (int i = 0; i < player.inventory.armorInventory.length; ++i) {
				ItemStack armorStack = player.getCurrentArmor(i);

				if (!flag && armorStack != null && armorStack.getItem() == stack.getItem()) {
					flag = true;
				}
			}

			return flag;
		} else {
			EntityLivingBase entityLiving = this.playerAether.getEntity();
			boolean flag = false;

			for (int i = 1; i < 5; ++i) {
				ItemStack armorStack = entityLiving.getEquipmentInSlot(i);

				if (!flag && armorStack != null && armorStack.getItem() == stack.getItem()) {
					flag = true;
				}
			}

			return flag;
		}
	}

	@Override
	public NBTTagList writeToNBT(NBTTagCompound compound) {
		NBTTagList nbttaglist = new NBTTagList();

		for (int i = 0; i < this.getSizeInventory(); ++i) {
			ItemStack stack = this.getStackInSlot(i);

			if (stack != null) {
				NBTTagCompound stackCompound = new NBTTagCompound();
				stackCompound.setByte("Slot", (byte) i);
				stack.writeToNBT(stackCompound);
				nbttaglist.appendTag(stackCompound);
			}
		}

		return nbttaglist;
	}

	@Override
	public void readFromNBT(NBTTagList list) {
		for (int i = 0; i < list.tagCount(); ++i) {
			NBTTagCompound stackCompound = list.getCompoundTagAt(i);
			byte slot = stackCompound.getByte("Slot");

			if (slot >= 0 && slot < this.getSizeInventory()) {
				this.stacks.set(slot, ItemStack.loadItemStackFromNBT(stackCompound));
			}
		}
	}

	@Override
	public void writeData(ByteBuf buf) {
		buf.writeInt(this.getAccessories().size());

		for (int i = 0; i < this.getSizeInventory(); ++i) {
			ItemStack stack = this.getStackInSlot(i);

			ByteBufUtils.writeItemStack(buf, stack);
		}
	}

	@Override
	public void readData(ByteBuf buf) {
		int size = buf.readInt();

		for (int i = 0; i < size; ++i) {
			this.stacks.set(i, ByteBufUtils.readItemStack(buf));
		}
	}

	@Override
	public boolean isWearingZaniteSet() {
		return wearingArmor(new ItemStack(ItemsAether.zaniteHelmet)) && wearingArmor(new ItemStack(ItemsAether.zaniteChestplate)) && wearingArmor(new ItemStack(ItemsAether.zaniteLeggings)) && wearingArmor(new ItemStack(ItemsAether.zaniteBoots));
	}

	@Override
	public boolean isWearingGravititeSet() {
		return wearingArmor(new ItemStack(ItemsAether.gravititeHelmet)) && wearingArmor(new ItemStack(ItemsAether.gravititeChestplate)) && wearingArmor(new ItemStack(ItemsAether.gravititeLeggings)) && wearingArmor(new ItemStack(ItemsAether.gravititeBoots));
	}

	@Override
	public boolean isWearingNeptuneSet() {
		return wearingArmor(new ItemStack(ItemsAether.neptuneHelmet)) && wearingArmor(new ItemStack(ItemsAether.neptuneChestplate)) && wearingArmor(new ItemStack(ItemsAether.neptuneLeggings)) && wearingArmor(new ItemStack(ItemsAether.neptuneBoots));
	}

	@Override
	public boolean isWearingPhoenixSet() {
		return wearingArmor(new ItemStack(ItemsAether.phoenixHelmet)) && wearingArmor(new ItemStack(ItemsAether.phoenixChestplate)) && wearingArmor(new ItemStack(ItemsAether.phoenixLeggings)) && wearingArmor(new ItemStack(ItemsAether.phoenixBoots));
	}

	@Override
	public boolean isWearingValkyrieSet() {
		return wearingArmor(new ItemStack(ItemsAether.valkyrieHelmet)) && wearingArmor(new ItemStack(ItemsAether.valkyrieChestplate)) && wearingArmor(new ItemStack(ItemsAether.valkyrieLeggings)) && wearingArmor(new ItemStack(ItemsAether.valkyrieBoots));
	}

	@Override
	public boolean isWearingObsidianSet() {
		return wearingArmor(new ItemStack(ItemsAether.obsidianHelmet)) && wearingArmor(new ItemStack(ItemsAether.obsidianChestplate)) && wearingArmor(new ItemStack(ItemsAether.obsidianLeggings)) && wearingArmor(new ItemStack(ItemsAether.obsidianBoots));
	}

	@Override
	public List<ItemStack> getAccessories() {
		return this.stacks;
	}

}