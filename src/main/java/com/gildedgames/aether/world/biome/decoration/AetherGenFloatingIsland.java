package com.gildedgames.aether.world.biome.decoration;

import java.util.Random;

import com.gildedgames.aether.blocks.BlocksAether;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class AetherGenFloatingIsland extends WorldGenerator {

	public AetherGenFloatingIsland() {

	}

	public boolean generate(World world, Random random, int j, int k, int l) {
		boolean cangen = true;

		for (int x1 = j - 6; x1 < j + 12; x1++) {
			for (int y1 = k - 6; y1 < k + 17; y1++) {
				for (int z1 = l - 6; z1 < l + 12; z1++) {
					if (world.getBlock(x1, y1, z1) != Blocks.air) {
						cangen = false;
					}
				}
			}
		}

		if (k + 11 <= world.getHeight() && cangen) {
			for (int z = 1; z < 2; ++z) {
				world.setBlock(j, k, l + z, BlocksAether.holystone);
			}

			for (int x = -1; x < 2; ++x) {
				world.setBlock(x + j, k, l, BlocksAether.holystone);
			}

			for (int z = -2; z < 3; ++z) {
				world.setBlock(j, k + 1, l + z, BlocksAether.holystone);
			}

			for (int x = -2; x < 3; ++x) {
				world.setBlock(j + x, k + 1, l, BlocksAether.holystone);
			}

			for (int x = -1; x < 2; ++x) {
				for (int z = 1; z > -2; --z) {
					if (x != 0 || z != 0) {
						world.setBlock(j + x, k + 1, l + z, BlocksAether.holystone);
					}
				}
			}

			world.setBlock(j + 1, k + 1, l + 1, BlocksAether.holystone);
			world.setBlock(j - 1, k + 1, l - 1, BlocksAether.holystone);

			for (int z = -2; z < 3; ++z) {
				world.setBlock(j, k + 2, l + z, BlocksAether.aetherGrass);
			}

			for (int x = -2; x < 3; ++x) {
				world.setBlock(x + j, k + 2, l, BlocksAether.aetherGrass);
			}

			for (int x = -1; x < 2; ++x) {
				for (int z = 1; z > -2; --z) {
					if (x != 0 || z != 0) {
						world.setBlock(j + x, k + 2, l + z, BlocksAether.aetherGrass);
					}
				}
			}

			world.setBlock(j + 1, k + 2, l + 1, BlocksAether.aetherGrass);
			world.setBlock(j - 1, k + 2, l - 1, BlocksAether.aetherGrass);

			world.setBlock(j, k + 10, l, setRandomBlock(world, random));

			for (int z = -1; z < 2; ++z) {
				if (z != 0)
					world.setBlock(j, k + 5, l + z, BlocksAether.skyrootLog);
			}

			for (int x = -1; x < 2; ++x) {
				if (x != 0)
					world.setBlock(j + x, k + 5, l, BlocksAether.skyrootLog);
			}

			for (int z = -2; z < 3; ++z) {
				if (z != 0 || z != 1)
					world.setBlock(j, k + 5, l + z, setRandomBlock(world, random));
			}

			for (int x = -2; x < 3; ++x) {
				if (x != 0 || x != 1)
					world.setBlock(j + x, k + 5, l, setRandomBlock(world, random));
			}

			for (int x = -1; x < 2; ++x) {
				if (x != 0)
					world.setBlock(j + x, k + 5, l - 2, setRandomBlock(world, random));
			}

			for (int x = -1; x < 2; ++x) {
				if (x != 0)
					world.setBlock(j + x, k + 5, l + 2, setRandomBlock(world, random));
			}

			for (int z = -1; z < 2; ++z) {
				if (z != 0)
					world.setBlock(j - 2, k + 5, l + z, setRandomBlock(world, random));
			}

			for (int z = -1; z < 2; ++z) {
				if (z != 0)
					world.setBlock(j + 2, k + 5, l + z, setRandomBlock(world, random));
			}

			for (int x = -1; x < 2; ++x) {
				for (int z = 1; z > -2; --z) {
					if (x != 0 || z != 0) {
						world.setBlock(j + x, k + 5, l + z, setRandomBlock(world, random));
					}
				}
			}

			world.setBlock(j + 1, k + 5, l + 1, setRandomBlock(world, random));
			world.setBlock(j - 1, k + 5, l - 1, setRandomBlock(world, random));

			for (int z = -2; z < 3; ++z) {
				if (z != 0 || z != 1)
					world.setBlock(j, k + 6, l + z, setRandomBlock(world, random));
			}

			for (int x = -2; x < 3; ++x) {
				if (x != 0 || x != 1)
					world.setBlock(j + x, k + 6, l, setRandomBlock(world, random));
			}

			for (int x = -1; x < 2; ++x) {
				for (int z = 1; z > -2; --z) {
					if (x != 0 || z != 0) {
						world.setBlock(j + x, k + 6, l + z, setRandomBlock(world, random));
					}
				}
			}

			world.setBlock(j + 1, k + 6, l + 1, setRandomBlock(world, random));
			world.setBlock(j - 1, k + 6, l - 1, setRandomBlock(world, random));

			for (int z = -1; z < 2; ++z) {
				if (z != 0)
					world.setBlock(j, k + 6, l + z, setRandomBlock(world, random));
			}

			for (int x = -1; x < 2; ++x) {
				if (x != 0)
					world.setBlock(j + x, k + 6, l, setRandomBlock(world, random));
			}

			for (int z = -1; z < 2; ++z) {
				if (z != 0)
					world.setBlock(j, k + 7, l + z, setRandomBlock(world, random));
			}

			for (int x = -1; x < 2; ++x) {
				if (x != 0)
					world.setBlock(j + x, k + 7, l, setRandomBlock(world, random));
			}

			for (int z = -1; z < 2; ++z) {
				if (z != 0)
					world.setBlock(j, k + 8, l + z, BlocksAether.skyrootLog);
			}

			for (int x = -1; x < 2; ++x) {
				if (x != 0)
					world.setBlock(j + x, k + 8, l, BlocksAether.skyrootLog);
			}

			for (int z = -2; z < 3; ++z) {
				if (z != 0 || z != 1)
					world.setBlock(j, k + 8, l + z, setRandomBlock(world, random));
			}

			for (int x = -2; x < 3; ++x) {
				if (x != 0 || x != 1)
					world.setBlock(j + x, k + 8, l, setRandomBlock(world, random));
			}

			for (int x = -1; x < 2; ++x) {
				for (int z = 1; z > -2; --z) {
					if (x != 0 || z != 0) {
						world.setBlock(j + x, k + 8, l + z, setRandomBlock(world, random));
					}
				}
			}

			world.setBlock(j + 1, k + 8, l + 1, setRandomBlock(world, random));
			world.setBlock(j - 1, k + 8, l - 1, setRandomBlock(world, random));

			for (int z = -1; z < 2; ++z) {
				if (z != 0)
					world.setBlock(j, k + 9, l + z, setRandomBlock(world, random));
			}

			for (int x = -1; x < 2; ++x) {
				if (x != 0)
					world.setBlock(j + x, k + 9, l, setRandomBlock(world, random));
			}

			for (int y = k + 3; y <= k + 9; y++) {
				world.setBlock(j, y, l, BlocksAether.skyrootLog);
			}

			return true;
		}

		return false;
	}

	protected Block setRandomBlock(World world, Random random) {
		int nextInt = random.nextInt(3);

		if (nextInt == 0) {
			return BlocksAether.crystalFruitLeaves;
		}

		return BlocksAether.crystalLeaves;
	}

}