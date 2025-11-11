package com.kittykittykitkat.vono_impet;

import com.kittykittykitkat.vono_impet.datagen.*;
import com.kittykittykitkat.vono_impet.world.VonoImpetConfiguredFeatures;
import com.kittykittykitkat.vono_impet.world.VonoImpetPlacedFeatures;
import com.kittykittykitkat.vono_impet.world.biome.VonoImpetBiomes;
import com.kittykittykitkat.vono_impet.world.dimension.VonoImpetDimensions;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecraft.registry.RegistryBuilder;
import net.minecraft.registry.RegistryKeys;

public class VonoImpetDataGenerator implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
        pack.addProvider(VonoImpetBlockLootTableProvider::new);
        pack.addProvider(VonoImpetBlockStateModelProvider::new);
        pack.addProvider(VonoImpetBlockTagProvider::new);
        pack.addProvider(VonoImpetItemTagProvider::new);
        pack.addProvider(VonoImpetRecipeProvider::new);
        pack.addProvider(VonoImpetWorldGenProvider::new);
    }

    @Override
    public void buildRegistry(RegistryBuilder registryBuilder) {
        registryBuilder.addRegistry(RegistryKeys.CONFIGURED_FEATURE, VonoImpetConfiguredFeatures::bootstrap);
        registryBuilder.addRegistry(RegistryKeys.PLACED_FEATURE, VonoImpetPlacedFeatures::bootstrap);
        registryBuilder.addRegistry(RegistryKeys.BIOME, VonoImpetBiomes::bootstrap);
        registryBuilder.addRegistry(RegistryKeys.DIMENSION_TYPE, VonoImpetDimensions::bootstrapType);
    }
}
