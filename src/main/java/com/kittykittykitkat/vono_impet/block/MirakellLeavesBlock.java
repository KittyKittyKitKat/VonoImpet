package com.kittykittykitkat.vono_impet.block;

import net.minecraft.block.BlockState;
import net.minecraft.block.LeavesBlock;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;

public class MirakellLeavesBlock extends LeavesBlock {

    public MirakellLeavesBlock(Settings settings) {
        super(settings);
    }

    // TODO: Custom particle texture
    // TODO: More custom positioning
    @Override
    public void randomDisplayTick(BlockState state, World world, BlockPos pos, Random random) {
        Direction direction = Direction.random(random);
        double d = (double)pos.getX() + 0.55 - (double)(random.nextFloat() * 0.1F);
        double e = (double)pos.getY() + 0.55 - (double)(random.nextFloat() * 0.1F);
        double f = (double)pos.getZ() + 0.55 - (double)(random.nextFloat() * 0.1F);
        double g = 0.4F - (random.nextFloat() + random.nextFloat()) * 0.4F;
        if (random.nextInt(5) == 0) {
            world.addParticle(
                    ParticleTypes.END_ROD,
                    d + (double)direction.getOffsetX() * g,
                    e + (double)direction.getOffsetY() * g,
                    f + (double)direction.getOffsetZ() * g,
                    random.nextGaussian() * 0.005,
                    random.nextGaussian() * 0.005,
                    random.nextGaussian() * 0.005
            );
        }
    }
}
