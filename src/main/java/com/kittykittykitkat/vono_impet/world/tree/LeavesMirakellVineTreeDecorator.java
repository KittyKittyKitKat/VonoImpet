package com.kittykittykitkat.vono_impet.world.tree;

import com.kittykittykitkat.vono_impet.block.VonoImpetBlocks;
import com.mojang.serialization.Codec;
import net.minecraft.block.Blocks;
import net.minecraft.block.VineBlock;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.gen.treedecorator.TreeDecorator;
import net.minecraft.world.gen.treedecorator.TreeDecoratorType;

import static com.kittykittykitkat.vono_impet.world.gen.VonoImpetWorldGeneration.LEAVE_MIRAKELL_VINE;

public class LeavesMirakellVineTreeDecorator extends TreeDecorator {
    public static final Codec<LeavesMirakellVineTreeDecorator> CODEC = Codec.floatRange(0.0F, 1.0F)
            .fieldOf("probability")
            .xmap(LeavesMirakellVineTreeDecorator::new, treeDecorator -> treeDecorator.probability)
            .codec();

    private final float probability;

    public LeavesMirakellVineTreeDecorator(float probability) {
        this.probability = probability;
    }

    @Override
    protected TreeDecoratorType<?> getType() {
        return LEAVE_MIRAKELL_VINE;
    }

    @Override
    public void generate(Generator generator) {
        Random random = generator.getRandom();
        generator.getLeavesPositions().forEach(pos -> {
            if (random.nextFloat() < this.probability) {
                BlockPos blockPos = pos.west();
                if (generator.isAir(blockPos)) {
                    placeMirakellVines(blockPos, VineBlock.EAST, generator);
                }
            }

            if (random.nextFloat() < this.probability) {
                BlockPos blockPos = pos.east();
                if (generator.isAir(blockPos)) {
                    placeMirakellVines(blockPos, VineBlock.WEST, generator);
                }
            }

            if (random.nextFloat() < this.probability) {
                BlockPos blockPos = pos.north();
                if (generator.isAir(blockPos)) {
                    placeMirakellVines(blockPos, VineBlock.SOUTH, generator);
                }
            }

            if (random.nextFloat() < this.probability) {
                BlockPos blockPos = pos.south();
                if (generator.isAir(blockPos)) {
                    placeMirakellVines(blockPos, VineBlock.NORTH, generator);
                }
            }
        });
    }

    public static void placeMirakellVines(BlockPos pos, BooleanProperty faceProperty, Generator generator) {
        generator.replace(pos, VonoImpetBlocks.MIRAKELL_VINE.getDefaultState().with(faceProperty,true));
        int i = 3;

        for (BlockPos var4 = pos.down(); generator.isAir(var4) && i > 0; i--) {
            generator.replace(var4,  VonoImpetBlocks.MIRAKELL_VINE.getDefaultState().with(faceProperty, true));
            var4 = var4.down();
        }
    }
}
