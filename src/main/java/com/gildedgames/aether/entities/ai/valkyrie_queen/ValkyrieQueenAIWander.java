package com.gildedgames.aether.entities.ai.valkyrie_queen;

import com.gildedgames.aether.entities.bosses.valkyriequeen.EntityValkyrieQueen;

import net.minecraft.entity.ai.EntityAIWander;

public class ValkyrieQueenAIWander extends EntityAIWander {

    private EntityValkyrieQueen theQueen;

    public ValkyrieQueenAIWander(EntityValkyrieQueen creatureIn, double speedIn) {
        super(creatureIn, speedIn);

        this.theQueen = creatureIn;
    }

    @Override
    public boolean shouldExecute() {
        return super.shouldExecute() && this.theQueen.isBossReady();
    }

}