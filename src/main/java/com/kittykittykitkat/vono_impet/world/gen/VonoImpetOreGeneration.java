package com.kittykittykitkat.vono_impet.world.gen;

import com.kittykittykitkat.vono_impet.world.VonoImpetPlacedFeatures;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.gen.GenerationStep;

public class VonoImpetOreGeneration {
    public static void generateOres() {
        // TODO: Replace with void biomes
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, VonoImpetPlacedFeatures.UNREFINED_CRYNIA_PLACED_KEY);
    }
}
