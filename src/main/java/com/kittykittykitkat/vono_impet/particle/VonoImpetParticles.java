package com.kittykittykitkat.vono_impet.particle;

import net.fabricmc.fabric.api.client.particle.v1.ParticleFactoryRegistry;
import net.fabricmc.fabric.api.particle.v1.FabricParticleTypes;
import net.minecraft.client.particle.EndRodParticle;
import net.minecraft.particle.DefaultParticleType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import static com.kittykittykitkat.vono_impet.VonoImpet.MOD_ID;

public class VonoImpetParticles {
    public static final DefaultParticleType MIRAKELL_JEWEL = FabricParticleTypes.simple();

    public static void registerParticles(){
        Registry.register(Registries.PARTICLE_TYPE, new Identifier(MOD_ID, "mirakell_jewel"), MIRAKELL_JEWEL);
    }

    public static void clientRegisterParticles() {
        ParticleFactoryRegistry.getInstance().register(MIRAKELL_JEWEL, EndRodParticle.Factory::new);
    }
}
