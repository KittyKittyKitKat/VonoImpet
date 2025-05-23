package com.kittykittykitkat.vono_impet.world;

import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.placementmodifier.HeightRangePlacementModifier;
import net.minecraft.world.gen.placementmodifier.PlacementModifier;

import java.util.List;

import static com.kittykittykitkat.vono_impet.VonoImpet.MOD_ID;

public class VonoImpetPlacedFeatures {
    public static final RegistryKey<PlacedFeature> UNREFINED_CRYNIA_PLACED_KEY = registerKey("unrefined_crynia_placed");

    public static void bootstrap(Registerable<PlacedFeature> context) {
        var configuredFeatureRegistryEntryLookup = context.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);

        // TODO: Decide better YLevel and rarity per chunk (12 as of rn)
        register(context, UNREFINED_CRYNIA_PLACED_KEY,
                configuredFeatureRegistryEntryLookup.getOrThrow(VonoImpetConfiguredFeatures.UNREFINED_CRYNIA_KEY),
                VonoImpetOrePlacement.modifiersWithCount(12, HeightRangePlacementModifier.uniform(YOffset.fixed(-80), YOffset.fixed(80)))
        );

    }

    public static RegistryKey<PlacedFeature> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier(MOD_ID, name));
    }

    private static void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key, RegistryEntry<ConfiguredFeature<?,? >> configuration, List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }
}
