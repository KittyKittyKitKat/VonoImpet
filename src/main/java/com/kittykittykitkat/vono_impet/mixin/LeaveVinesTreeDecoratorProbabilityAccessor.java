package com.kittykittykitkat.vono_impet.mixin;

import net.minecraft.world.gen.treedecorator.LeavesVineTreeDecorator;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(LeavesVineTreeDecorator.class)
public interface LeaveVinesTreeDecoratorProbabilityAccessor {
    @Accessor("probability")
    float getProbability();
}
