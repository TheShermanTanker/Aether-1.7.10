package com.gildedgames.aether.blocks.decorative;

import java.util.Random;

import com.gildedgames.aether.blocks.BlocksAether;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.world.World;

public class BlockAetherSlab extends BlockSlab {

	private String name;

	public BlockAetherSlab(String name, boolean double_slab, Material materialIn) {
		super(double_slab, materialIn);
		this.name = name;

		this.setLightOpacity(0);
		this.setStepSound(materialIn == Material.wood ? soundTypeWood : soundTypeStone);
	}

	@Override
	public Item getItem(World p_149694_1_, int p_149694_2_, int p_149694_3_, int p_149694_4_) {
		return Item.getItemFromBlock(this.getDroppedSlab());
	}

	public Block getDroppedSlab() {
		if (this == BlocksAether.skyrootDoubleSlab) {
			return BlocksAether.skyrootSlab;
		} else if (this == BlocksAether.carvedDoubleSlab) {
			return BlocksAether.carvedSlab;
		} else if (this == BlocksAether.angelicDoubleSlab) {
			return BlocksAether.angelicSlab;
		} else if (this == BlocksAether.hellfireDoubleSlab) {
			return BlocksAether.hellfireSlab;
		} else if (this == BlocksAether.holystoneBrickDoubleSlab) {
			return BlocksAether.holystoneBrickSlab;
		} else if (this == BlocksAether.holystoneDoubleSlab) {
			return BlocksAether.holystoneSlab;
		} else if (this == BlocksAether.mossyHolystoneDoubleSlab) {
			return BlocksAether.mossyHolystoneSlab;
		} else {
			return this;
		}
	}

	@Override
	public Item getItemDropped(int meta, Random rand, int fortune) {
		return Item.getItemFromBlock(this.getDroppedSlab());
	}

	@Override
	public int damageDropped(int meta) {
		return 0;
	}

	@Override
	public String func_150002_b(int meta) {
		return this.name;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public int getRenderBlockPass() {
		return this == BlocksAether.aerogelSlab || this == BlocksAether.aerogelDoubleSlab ? 1 : 0;
	}
}
