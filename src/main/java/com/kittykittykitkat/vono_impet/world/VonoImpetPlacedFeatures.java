package com.kittykittykitkat.vono_impet.world;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.feature.PlacedFeatures;
import net.minecraft.world.gen.placementmodifier.*;

import java.util.List;

import static com.kittykittykitkat.vono_impet.VonoImpet.MOD_ID;

public class VonoImpetPlacedFeatures {
    public static final RegistryKey<PlacedFeature> UNREFINED_CRYNIA_PLACED_KEY = registerKey("unrefined_crynia_placed");
    public static final RegistryKey<PlacedFeature> HADELITE_DEPOSIT_PLACED_KEY = registerKey("hadelite_deposit_placed_key");

    public static void bootstrap(Registerable<PlacedFeature> context) {
        var configuredFeatureRegistryEntryLookup = context.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);

        // TODO: Decide better YLevel and rarity per chunk (12 as of rn)
        register(context, UNREFINED_CRYNIA_PLACED_KEY,
                configuredFeatureRegistryEntryLookup.getOrThrow(VonoImpetConfiguredFeatures.UNREFINED_CRYNIA_KEY),
                VonoImpetOrePlacement.modifiersWithCount(12, HeightRangePlacementModifier.uniform(YOffset.fixed(-80), YOffset.fixed(80)))
        );

        register(context, HADELITE_DEPOSIT_PLACED_KEY,
                configuredFeatureRegistryEntryLookup.getOrThrow(VonoImpetConfiguredFeatures.HADELITE_DEPOSIT_KEY),
                List.of(
                        CountPlacementModifier.of(2),
                        SquarePlacementModifier.of(),
                        PlacedFeatures.BOTTOM_TO_TOP_RANGE,
                        BiomePlacementModifier.of()
                )
        );

    }

    public static RegistryKey<PlacedFeature> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier(MOD_ID, name));
    }

    private static void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key, RegistryEntry<ConfiguredFeature<?,? >> configuration, List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }

    public static void registerBiomeModifications() {
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.SOUL_SAND_VALLEY), GenerationStep.Feature.UNDERGROUND_DECORATION, HADELITE_DEPOSIT_PLACED_KEY);
    }
}
