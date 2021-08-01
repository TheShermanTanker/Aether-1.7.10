package com.gildedgames.aether.api.events.moas;

import com.gildedgames.aether.api.moa.AetherMoaType;

import net.minecraft.tileentity.TileEntity;

public class MoaHatchEvent extends MoaEvent {

	private TileEntity incubator;

	public MoaHatchEvent(AetherMoaType moaType, TileEntity incubator) {
		super(moaType);

		this.incubator = incubator;
	}

	public TileEntity getTileEntity() {
		return this.incubator;
	}

}