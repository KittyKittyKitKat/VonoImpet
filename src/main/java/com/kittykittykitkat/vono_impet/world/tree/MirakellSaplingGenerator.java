package com.kittykittykitkat.vono_impet.world.tree;

import com.kittykittykitkat.vono_impet.world.VonoImpetConfiguredFeatures;
import net.minecraft.block.sapling.SaplingGenerator;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import org.jetbrains.annotations.Nullable;

public class MirakellSaplingGenerator extends SaplingGenerator {
    @Override
    protected @Nullable RegistryKey<ConfiguredFeature<?, ?>> getTreeFeature(Random random, boolean bees) {
        return VonoImpetConfiguredFeatures.MIRAKELL_KEY;
    }
}
