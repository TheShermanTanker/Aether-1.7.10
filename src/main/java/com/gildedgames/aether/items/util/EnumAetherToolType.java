package com.gildedgames.aether.items.util;

import java.util.Set;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemStack;

import com.gildedgames.aether.blocks.BlocksAether;
import com.google.common.collect.Sets;

public enum EnumAetherToolType {

	PICKAXE(Sets.newHashSet(new Block[]
			{
					Blocks.cobblestone, Blocks.double_stone_slab, Blocks.stone_slab,
					Blocks.stone, Blocks.sandstone, Blocks.mossy_cobblestone, Blocks.iron_ore,
					Blocks.iron_block, Blocks.coal_ore, Blocks.gold_ore, Blocks.gold_block,
					Blocks.diamond_ore, Blocks.diamond_block, Blocks.ice, Blocks.netherrack,
					Blocks.lapis_ore, Blocks.lapis_block, Blocks.redstone_ore, Blocks.lit_redstone_ore,
					Blocks.rail, Blocks.detector_rail, Blocks.golden_rail, Blocks.activator_rail, Blocks.mob_spawner,
					BlocksAether.holystone, BlocksAether.holystoneBrick, BlocksAether.mossyHolystone,
					BlocksAether.enchanter, BlocksAether.incubator, BlocksAether.enchanter, BlocksAether.ambrosiumOre,
					BlocksAether.icestone, BlocksAether.aerogel, BlocksAether.carvedStone, BlocksAether.angelicStone,
					BlocksAether.hellfireStone, BlocksAether.sentryStone, BlocksAether.lightAngelicStone,
					BlocksAether.lightHellfireStone
			})) {
		@Override
		public boolean canHarvestBlock(ToolMaterial toolMaterial, Block state) {
			Block block = state;

			if (block == BlocksAether.zaniteOre || block == BlocksAether.zaniteBlock || block == BlocksAether.icestone) {
				return toolMaterial.getHarvestLevel() >= 1;
			} else if (block == BlocksAether.gravititeOre || block == BlocksAether.enchantedGravitite) {
				return toolMaterial.getHarvestLevel() >= 2;
			}
			else if (block == BlocksAether.aerogel) {
				return toolMaterial.getHarvestLevel() == 3;
			}

			return block == Blocks.obsidian ? toolMaterial.getHarvestLevel() == 3 : (block != Blocks.diamond_block && block != Blocks.diamond_ore ? (block != Blocks.emerald_ore && block != Blocks.emerald_block ? (block != Blocks.gold_block && block != Blocks.gold_ore ? (block != Blocks.iron_block && block != Blocks.iron_ore ? (block != Blocks.lapis_block && block != Blocks.lapis_ore ? (block != Blocks.redstone_ore && block != Blocks.lit_redstone_ore ? (state.getMaterial() == Material.rock ? true : (state.getMaterial() == Material.iron ? true : state.getMaterial() == Material.anvil)) : toolMaterial.getHarvestLevel() >= 2) : toolMaterial.getHarvestLevel() >= 1) : toolMaterial.getHarvestLevel() >= 1) : toolMaterial.getHarvestLevel() >= 2) : toolMaterial.getHarvestLevel() >= 2) : toolMaterial.getHarvestLevel() >= 2);
		}

		@Override
		public float getStrVsBlock(ItemStack stack, Block block) {
			return block != null && (block.getMaterial() == Material.iron || block.getMaterial() == Material.anvil || block.getMaterial() == Material.rock) ? this.efficiencyOnProperMaterial : super.getStrVsBlock(stack, block);
		}
	},
	SHOVEL(Sets.newHashSet(new Block[]
			{
					Blocks.grass, Blocks.dirt, Blocks.sand, Blocks.gravel, Blocks.snow,
					Blocks.snow_layer, Blocks.clay, Blocks.farmland, Blocks.soul_sand,
					Blocks.mycelium, BlocksAether.aetherDirt, BlocksAether.aetherGrass,
					BlocksAether.aercloud, BlocksAether.enchantedAetherGrass, BlocksAether.quicksoil
			})) {
		@Override
		public boolean canHarvestBlock(ToolMaterial toolMaterial, Block block) {
			return block == Blocks.snow ? true : block == Blocks.snow_layer;
		}
	},

	AXE(Sets.newHashSet(new Block[]
			{
					Blocks.planks, Blocks.bookshelf, Blocks.log, Blocks.chest,
					Blocks.double_stone_slab, Blocks.stone_slab, Blocks.pumpkin,
					Blocks.lit_pumpkin, BlocksAether.skyrootLog, BlocksAether.goldenOakLog, BlocksAether.skyrootPlanks,
					BlocksAether.chestMimic
			})) {
		@Override
		public float getStrVsBlock(ItemStack stack, Block block) {
			return block != null && (block.getMaterial() == Material.wood || block.getMaterial() == Material.plants || block.getMaterial() == Material.vine) ? this.efficiencyOnProperMaterial : super.getStrVsBlock(stack, block);
		}
	};

	private Set<Block> toolBlockSet;

	public float efficiencyOnProperMaterial = 4.0F;

	EnumAetherToolType(Set<Block> toolBlockSet) {
		this.toolBlockSet = toolBlockSet;
	}

	public Set<Block> getToolBlockSet() {
		return this.toolBlockSet;
	}

	public boolean canHarvestBlock(ToolMaterial toolMaterial, Block block) {
		return false;
	}

	public float getStrVsBlock(ItemStack stack, Block block) {
		return this.toolBlockSet.contains(block) ? this.efficiencyOnProperMaterial : 1.0F;
	}

}