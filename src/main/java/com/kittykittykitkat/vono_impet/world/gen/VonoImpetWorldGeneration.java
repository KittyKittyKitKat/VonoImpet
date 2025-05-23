package com.kittykittykitkat.vono_impet.world.gen;

import com.kittykittykitkat.vono_impet.world.tree.LeavesMirakellVineTreeDecorator;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.world.gen.treedecorator.TreeDecoratorType;

public class VonoImpetWorldGeneration {
    public static final TreeDecoratorType<LeavesMirakellVineTreeDecorator> LEAVE_MIRAKELL_VINE = Registry.register(Registries.TREE_DECORATOR_TYPE, "leave_mirakell_vine", new TreeDecoratorType<>(LeavesMirakellVineTreeDecorator.CODEC));

    public static void generateWorldGen() {

        VonoImpetOreGeneration.generateOres();
    }
}
