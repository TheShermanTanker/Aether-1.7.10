package com.gildedgames.aether.entities.projectile;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.monster.EntityEnderman;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.play.server.S2BPacketChangeGameState;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EntityDamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;
import cpw.mods.fml.common.registry.IThrowableEntity;

import java.util.List;

public class EntityPhoenixArrow extends EntityArrow implements IThrowableEntity {

	private int timeInGround;

	private boolean hitGround;
	private int tileX = -1;
	private int tileY = -1;
	private int tileZ = -1;
	private Block inTile;
	private int inData;
    private boolean inGround;
    private int ticksInGround;
    private int ticksInAir;

	public EntityPhoenixArrow(World worldIn) {
		super(worldIn);
	}

	public EntityPhoenixArrow(World worldIn, EntityLivingBase shooter, float distance) {
		super(worldIn, shooter, distance);
	}

	@Override
	public void onUpdate() {

		if (this.arrowShake == 7) {
			this.hitGround = true;
		}

		if (this.hitGround) {
			++this.timeInGround;

			if (this.timeInGround % 5 == 0) {
				this.worldObj.spawnParticle("flame", this.posX + (this.rand.nextGaussian() / 5D), this.posY + (this.rand.nextGaussian() / 5D), this.posZ + (this.rand.nextGaussian() / 3D), 0.0D, 0.0D, 0.0D);
			}
		} else {
			for (int j = 0; j < 2; ++j) {
				this.worldObj.spawnParticle("flame", this.posX + (this.rand.nextGaussian() / 5D), this.posY + (this.rand.nextGaussian() / 5D), this.posZ + (this.rand.nextGaussian() / 3D), 0.0D, 0.0D, 0.0D);
			}
		}

		Vec3 vec31 = Vec3.createVectorHelper(this.posX, this.posY, this.posZ);
		Vec3 vec3 = Vec3.createVectorHelper(this.posX + this.motionX, this.posY + this.motionY, this.posZ + this.motionZ);
		MovingObjectPosition movingobjectposition = this.worldObj.func_147447_a(vec31, vec3, false, true, false);
		vec31 = Vec3.createVectorHelper(this.posX, this.posY, this.posZ);
		vec3 = Vec3.createVectorHelper(this.posX + this.motionX, this.posY + this.motionY, this.posZ + this.motionZ);

		if (movingobjectposition != null) {
			vec3 = Vec3.createVectorHelper(movingobjectposition.hitVec.xCoord, movingobjectposition.hitVec.yCoord, movingobjectposition.hitVec.zCoord);
		}

		Entity entity = null;
		List list = this.worldObj.getEntitiesWithinAABBExcludingEntity(this, this.boundingBox.addCoord(this.motionX, this.motionY, this.motionZ).expand(1.0D, 1.0D, 1.0D));
		double d0 = 0.0D;
		int i;
		float f1;

		for (i = 0; i < list.size(); ++i) {
			Entity entity1 = (Entity)list.get(i);

			if (entity1.canBeCollidedWith() && (entity1 != this.shootingEntity)) {
				f1 = 0.3F;
				AxisAlignedBB axisalignedbb1 = entity1.boundingBox.expand((double)f1, (double)f1, (double)f1);
				MovingObjectPosition movingobjectposition1 = axisalignedbb1.calculateIntercept(vec31, vec3);

				if (movingobjectposition1 != null) {
					double d1 = vec31.distanceTo(movingobjectposition1.hitVec);

					if (d1 < d0 || d0 == 0.0D) {
						entity = entity1;
						d0 = d1;
					}
				}
			}
		}

		if (entity != null) {
			movingobjectposition = new MovingObjectPosition(entity);
		}

		if (movingobjectposition != null && movingobjectposition.entityHit != null && movingobjectposition.entityHit instanceof EntityPlayer) {
			EntityPlayer entityplayer = (EntityPlayer)movingobjectposition.entityHit;

			if (entityplayer.capabilities.disableDamage || this.shootingEntity instanceof EntityPlayer && !((EntityPlayer)this.shootingEntity).canAttackPlayer(entityplayer)) {
				movingobjectposition = null;
			}
		}

		float f2;
		float f4;

		if (movingobjectposition != null) {
			if (movingobjectposition.entityHit != null) {
				f2 = MathHelper.sqrt_double(this.motionX * this.motionX + this.motionY * this.motionY + this.motionZ * this.motionZ);
                int k = MathHelper.ceiling_double_int((double)f2 * this.getDamage());
                k += this.rand.nextInt(k / 2 + 2);
                if (movingobjectposition.entityHit.attackEntityFrom(new EntityDamageSource("arrow", this.shootingEntity == null ? this : this.shootingEntity).setProjectile(), (float)k)) {
                    if (movingobjectposition.entityHit instanceof EntityLivingBase) {
                        EntityLivingBase entitylivingbase = (EntityLivingBase)movingobjectposition.entityHit;

                        if (!this.worldObj.isRemote) {
                            entitylivingbase.setArrowCountInEntity(entitylivingbase.getArrowCountInEntity() + 1);
                        }

                        f4 = MathHelper.sqrt_double(this.motionX * this.motionX + this.motionZ * this.motionZ);

                        if (f4 > 0.0F) {
                            movingobjectposition.entityHit.addVelocity(this.motionX * (double) 2 * 0.6000000238418579D / (double)f4, 0.1D, this.motionZ * (double) 2 * 0.6000000238418579D / (double)f4);
                        }

                        if (this.shootingEntity != null && this.shootingEntity instanceof EntityLivingBase) {
                            EnchantmentHelper.func_151384_a(entitylivingbase, this.shootingEntity);
                            EnchantmentHelper.func_151385_b((EntityLivingBase)this.shootingEntity, entitylivingbase);
                        }

                        if (this.shootingEntity != null && movingobjectposition.entityHit != this.shootingEntity && movingobjectposition.entityHit instanceof EntityPlayer && this.shootingEntity instanceof EntityPlayerMP) {
                            ((EntityPlayerMP)this.shootingEntity).playerNetServerHandler.sendPacket(new S2BPacketChangeGameState(6, 0.0F));
                        }
                    }

                    this.playSound("random.bowhit", 1.0F, 1.2F / (this.rand.nextFloat() * 0.2F + 0.9F));

                    this.setDead();
                } else {
                    this.motionX *= -0.10000000149011612D;
                    this.motionY *= -0.10000000149011612D;
                    this.motionZ *= -0.10000000149011612D;
                    this.rotationYaw += 180.0F;
                    this.prevRotationYaw += 180.0F;
                    this.ticksInAir = 0;
                }
				movingobjectposition.entityHit.setFire(10);
			} else {
                this.tileX = movingobjectposition.blockX;
                this.tileY = movingobjectposition.blockY;
                this.tileZ = movingobjectposition.blockZ;
                this.inTile = this.worldObj.getBlock(this.tileX, this.tileY, this.tileZ);
                this.inData = this.worldObj.getBlockMetadata(this.tileX, this.tileY, this.tileZ);
                this.motionX = (double)((float)(movingobjectposition.hitVec.xCoord - this.posX));
                this.motionY = (double)((float)(movingobjectposition.hitVec.yCoord - this.posY));
                this.motionZ = (double)((float)(movingobjectposition.hitVec.zCoord - this.posZ));
                f2 = MathHelper.sqrt_double(this.motionX * this.motionX + this.motionY * this.motionY + this.motionZ * this.motionZ);
                this.posX -= this.motionX / (double)f2 * 0.05000000074505806D;
                this.posY -= this.motionY / (double)f2 * 0.05000000074505806D;
                this.posZ -= this.motionZ / (double)f2 * 0.05000000074505806D;
                this.playSound("random.bowhit", 1.0F, 1.2F / (this.rand.nextFloat() * 0.2F + 0.9F));
                this.inGround = true;
                this.arrowShake = 7;

                if (this.inTile.getMaterial() != Material.air) {
                    this.inTile.onEntityCollidedWithBlock(this.worldObj, this.tileX, this.tileY, this.tileZ, this);
                }
            }
		}

		this.onEntityUpdate();
		if (this.prevRotationPitch == 0.0F && this.prevRotationYaw == 0.0F) {
            float f = MathHelper.sqrt_double(this.motionX * this.motionX + this.motionZ * this.motionZ);
            this.prevRotationYaw = this.rotationYaw = (float)(Math.atan2(this.motionX, this.motionZ) * 180.0D / Math.PI);
            this.prevRotationPitch = this.rotationPitch = (float)(Math.atan2(this.motionY, (double)f) * 180.0D / Math.PI);
        }

        Block block = this.worldObj.getBlock(this.tileX, this.tileY, this.tileZ);

        if (block.getMaterial() != Material.air) {
            block.setBlockBoundsBasedOnState(this.worldObj, this.tileX, this.tileY, this.tileZ);
            AxisAlignedBB axisalignedbb = block.getCollisionBoundingBoxFromPool(this.worldObj, this.tileX, this.tileY, this.tileZ);

            if (axisalignedbb != null && axisalignedbb.isVecInside(Vec3.createVectorHelper(this.posX, this.posY, this.posZ))) {
                this.inGround = true;
            }
        }

        if (this.arrowShake > 0) {
            --this.arrowShake;
        }

        if (this.inGround) {
            int j = this.worldObj.getBlockMetadata(this.tileX, this.tileY, this.tileZ);

            if (block == this.inTile && j == this.inData) {
                if (++this.ticksInGround == 1200) {
                    this.setDead();
                }
            } else {
                this.inGround = false;
                this.motionX *= (double)(this.rand.nextFloat() * 0.2F);
                this.motionY *= (double)(this.rand.nextFloat() * 0.2F);
                this.motionZ *= (double)(this.rand.nextFloat() * 0.2F);
                this.ticksInGround = 0;
                this.ticksInAir = 0;
            }
        } else {
            ++this.ticksInAir;

            this.posX += this.motionX;
            this.posY += this.motionY;
            this.posZ += this.motionZ;
            f2 = MathHelper.sqrt_double(this.motionX * this.motionX + this.motionZ * this.motionZ);
            this.rotationYaw = (float)(Math.atan2(this.motionX, this.motionZ) * 180.0D / Math.PI);

            for (this.rotationPitch = (float)(Math.atan2(this.motionY, (double)f2) * 180.0D / Math.PI); this.rotationPitch - this.prevRotationPitch < -180.0F; this.prevRotationPitch -= 360.0F) {
                ;
            }

            while (this.rotationPitch - this.prevRotationPitch >= 180.0F) {
                this.prevRotationPitch += 360.0F;
            }

            while (this.rotationYaw - this.prevRotationYaw < -180.0F) {
                this.prevRotationYaw -= 360.0F;
            }

            while (this.rotationYaw - this.prevRotationYaw >= 180.0F) {
                this.prevRotationYaw += 360.0F;
            }

            this.rotationPitch = this.prevRotationPitch + (this.rotationPitch - this.prevRotationPitch) * 0.2F;
            this.rotationYaw = this.prevRotationYaw + (this.rotationYaw - this.prevRotationYaw) * 0.2F;
            f1 = 0.05F;

            if(this.isInWater()) {
                for (int l = 0; l < 4; ++l) {
                    f4 = 0.25F;
                    this.worldObj.spawnParticle("bubble", this.posX - this.motionX * (double)f4, this.posY - this.motionY * (double)f4, this.posZ - this.motionZ * (double)f4, this.motionX, this.motionY, this.motionZ);
                }
            }

            this.motionY -= (double) f1;
            this.setPosition(this.posX, this.posY, this.posZ);
            this.func_145775_I();
        }
	}

    @Override
    public void writeEntityToNBT(NBTTagCompound nbttagcompound) {
        nbttagcompound.setShort("xTile", (short) this.tileX);
        nbttagcompound.setShort("yTile", (short) this.tileY);
        nbttagcompound.setShort("zTile", (short) this.tileZ);
        nbttagcompound.setShort("life", (short) this.ticksInGround);
        nbttagcompound.setByte("inTile", (byte) Block.getIdFromBlock(this.inTile));
        nbttagcompound.setByte("inData", (byte) this.inData);
        nbttagcompound.setByte("shake", (byte) this.arrowShake);
        nbttagcompound.setByte("inGround", (byte) (this.inGround ? 1 : 0));
        nbttagcompound.setByte("pickup", (byte) this.canBePickedUp);
        nbttagcompound.setDouble("damage", this.getDamage());
    }

    @Override
    public void readEntityFromNBT(NBTTagCompound nbttagcompound) {
        this.tileX = nbttagcompound.getShort("xTile");
        this.tileY = nbttagcompound.getShort("yTile");
        this.tileZ = nbttagcompound.getShort("zTile");
        this.ticksInGround = nbttagcompound.getShort("life");
        this.inTile = Block.getBlockById(nbttagcompound.getByte("inTile") & 255);
        this.inData = nbttagcompound.getByte("inData") & 255;
        this.arrowShake = nbttagcompound.getByte("shake") & 255;
        this.inGround = nbttagcompound.getByte("inGround") == 1;

        if (nbttagcompound.hasKey("damage", 99)) {
            this.setDamage(nbttagcompound.getDouble("damage"));
        }

        if (nbttagcompound.hasKey("pickup", 99)) {
            this.canBePickedUp = nbttagcompound.getByte("pickup");
        } else if (nbttagcompound.hasKey("player", 99)) {
            this.canBePickedUp = nbttagcompound.getBoolean("player") ? 1 : 0;
        }
    }

	@Override
    public void setIsCritical(boolean isCritical) {
    }

    /**
     * Whether the arrow has a stream of critical hit particles flying behind it.
     */
    public boolean getIsCritical() {
        return false;
    }

    @Override
    public boolean isBurning() {
    	return false;
    }

    @Override
    public void setFire(int seconds) {
    }

    @Override
    public void extinguish() {
    }

    @Override
    public void setKnockbackStrength(int power) {
    }

	@Override
	public void setThrower(Entity entity) {
		this.shootingEntity = entity;
	}

	@Override
	public Entity getThrower() {
		return this.shootingEntity;
	}

}