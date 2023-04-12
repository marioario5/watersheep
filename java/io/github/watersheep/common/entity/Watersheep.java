package io.github.watersheep.common.entity;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.level.Level;

public class Watersheep extends Monster{

	public Watersheep(EntityType<Watersheep> entityType, Level level) {
		super(entityType, level);
	}
	
	 public static AttributeSupplier.Builder bakeAttributes() {
	        return Monster.createMonsterAttributes()
	        		.add(Attributes.MAX_HEALTH, 40.0D);
	        		
	    }
	
	protected void registerGoals() {
		
	}
	
}