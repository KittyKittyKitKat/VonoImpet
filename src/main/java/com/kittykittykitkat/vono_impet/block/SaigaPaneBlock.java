package com.kittykittykitkat.vono_impet.block;

import net.minecraft.block.BlockState;
import net.minecraft.block.GlassBlock;
import net.minecraft.block.StainedGlassPaneBlock;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.DyeColor;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;

// TODO: Better particle and sound design

public class SaigaPaneBlock extends StainedGlassPaneBlock {
    public SaigaPaneBlock(DyeColor color, Settings settings) {
        super(color, settings);
    }

    @Override
    public void onBreak(World world, BlockPos pos, BlockState state, PlayerEntity player) {
        if (!world.isClient) {
            Random random = world.random;
            for (int i = 0; i < 20; ++i) {
                double dx = pos.getX() + 0.5 + (random.nextDouble() - 0.5);
                double dy = pos.getY() + 0.5 + (random.nextDouble() - 0.5);
                double dz = pos.getZ() + 0.5 + (random.nextDouble() - 0.5);

                ((ServerWorld) world).spawnParticles(ParticleTypes.END_ROD, dx, dy, dz, 1, 0, 0, 0, 0);
            }
        }

        super.onBreak(world, pos, state, player);
    }
}
