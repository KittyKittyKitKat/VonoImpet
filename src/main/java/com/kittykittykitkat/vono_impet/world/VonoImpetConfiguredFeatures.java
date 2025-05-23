package com.kittykittykitkat.vono_impet.world;

import com.kittykittykitkat.vono_impet.block.VonoImpetBlocks;
import com.kittykittykitkat.vono_impet.world.tree.LeavesMirakellVineTreeDecorator;
import net.minecraft.block.AbstractPlantStemBlock;
import net.minecraft.block.Blocks;
import net.minecraft.block.PropaguleBlock;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.structure.rule.TagMatchRuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.util.collection.DataPool;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.util.math.intprovider.IntProvider;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.math.intprovider.WeightedListIntProvider;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.BlobFoliagePlacer;
import net.minecraft.world.gen.foliage.CherryFoliagePlacer;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.stateprovider.RandomizedIntBlockStateProvider;
import net.minecraft.world.gen.treedecorator.AttachedToLeavesTreeDecorator;
import net.minecraft.world.gen.treedecorator.LeavesVineTreeDecorator;
import net.minecraft.world.gen.trunk.BendingTrunkPlacer;
import net.minecraft.world.gen.trunk.CherryTrunkPlacer;
import net.minecraft.world.gen.trunk.StraightTrunkPlacer;

import java.util.List;

import static com.kittykittykitkat.vono_impet.VonoImpet.MOD_ID;

public class VonoImpetConfiguredFeatures {
    public static final RegistryKey<ConfiguredFeature<?, ?>> UNREFINED_CRYNIA_KEY = registerKey("unrefined_crynia");

    public static final RegistryKey<ConfiguredFeature<?, ?>> MIRAKELL_KEY = registerKey("mirakell_tree");

    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context) {
        // TODO: Replace with Hadelite
        RuleTest hadeliteReplacables = new TagMatchRuleTest(BlockTags.STONE_ORE_REPLACEABLES);

        // TODO: Replace with Unrefined Crynia
        List<OreFeatureConfig.Target> unrefinedCryniaDeposit = List.of(
                OreFeatureConfig.createTarget(hadeliteReplacables, VonoImpetBlocks.MIRAKELL_PLANKS.getDefaultState())
        );

        register(context, UNREFINED_CRYNIA_KEY, Feature.SCATTERED_ORE, new OreFeatureConfig(unrefinedCryniaDeposit, 3, 1.0F));

        register(context, MIRAKELL_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(VonoImpetBlocks.MIRAKELL_LOG),
                new CherryTrunkPlacer(
                        7,
                        1,
                        1,
                        ConstantIntProvider.create(3),
                        UniformIntProvider.create(2, 3),
                        UniformIntProvider.create(-3, -2),
                        UniformIntProvider.create(-1, 0)
                ),
                BlockStateProvider.of(VonoImpetBlocks.MIRAKELL_LEAVES),
                new CherryFoliagePlacer(ConstantIntProvider.create(4), ConstantIntProvider.create(0), ConstantIntProvider.create(5), 0.4F, 0.5F, 1.0F, 0.5F),
                new TwoLayersFeatureSize(1, 0, 2)
        )
                .decorators(
                        List.of(
                                new LeavesMirakellVineTreeDecorator(0.125F),
                                new AttachedToLeavesTreeDecorator(
                                        0.14F,
                                        1,
                                        0,
                                        new RandomizedIntBlockStateProvider(
                                                BlockStateProvider.of(VonoImpetBlocks.MIRAKELL_BUSHY_VINES.getDefaultState().with(AbstractPlantStemBlock.AGE, 0)),
                                                PropaguleBlock.AGE,
                                                UniformIntProvider.create(0, 4)
                                        ),
                                        2,
                                        List.of(Direction.DOWN)
                                )
                        )
                )
                .ignoreVines()

                .build());
    }

    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, new Identifier(MOD_ID, name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context, RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
