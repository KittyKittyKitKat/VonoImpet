package com.kittykittykitkat.vono_impet.datagen;

import com.kittykittykitkat.vono_impet.block.VonoImpetBlocks;
import com.kittykittykitkat.vono_impet.tag.VonoImpetBlockTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class VonoImpetBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public VonoImpetBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {

        getOrCreateTagBuilder(BlockTags.HOE_MINEABLE)
                .add(VonoImpetBlocks.MIRAKELL_LEAVES);

        getOrCreateTagBuilder(BlockTags.AXE_MINEABLE)
                .add(VonoImpetBlocks.MIRAKELL_LOG)
                .add(VonoImpetBlocks.MIRAKELL_WOOD)
                .add(VonoImpetBlocks.STRIPPED_MIRAKELL_LOG)
                .add(VonoImpetBlocks.STRIPPED_MIRAKELL_WOOD)
                .add(VonoImpetBlocks.MIRAKELL_PLANKS)
                .add(VonoImpetBlocks.MIRAKELL_SLAB)
                .add(VonoImpetBlocks.MIRAKELL_STAIRS)
                .add(VonoImpetBlocks.MIRAKELL_FENCE)
                .add(VonoImpetBlocks.MIRAKELL_FENCE_GATE)
                .add(VonoImpetBlocks.MIRAKELL_DOOR)
                .add(VonoImpetBlocks.MIRAKELL_TRAPDOOR)
                .add(VonoImpetBlocks.MIRAKELL_BUTTON)
                .add(VonoImpetBlocks.MIRAKELL_PRESSURE_PLATE)
                .add(VonoImpetBlocks.MIRAKELL_SIGN)
                .add(VonoImpetBlocks.MIRAKELL_WALL_SIGN)
                .add(VonoImpetBlocks.MIRAKELL_HANGING_SIGN)
                .add(VonoImpetBlocks.MIRAKELL_WALL_HANGING_SIGN);
//                .add(VonoImpetBlocks.MIRAKELL_SAPLING)

        getOrCreateTagBuilder(BlockTags.SLABS)
                .add(VonoImpetBlocks.MIRAKELL_SLAB);

        getOrCreateTagBuilder(BlockTags.STAIRS)
                .add(VonoImpetBlocks.MIRAKELL_STAIRS);

        getOrCreateTagBuilder(BlockTags.FENCES)
                .add(VonoImpetBlocks.MIRAKELL_FENCE);

        getOrCreateTagBuilder(BlockTags.FENCE_GATES)
                .add(VonoImpetBlocks.MIRAKELL_FENCE_GATE);

        getOrCreateTagBuilder(BlockTags.BUTTONS)
                .add(VonoImpetBlocks.MIRAKELL_BUTTON);

        getOrCreateTagBuilder(BlockTags.PRESSURE_PLATES)
            .add(VonoImpetBlocks.MIRAKELL_PRESSURE_PLATE);

        getOrCreateTagBuilder(BlockTags.TRAPDOORS)
                .add(VonoImpetBlocks.MIRAKELL_TRAPDOOR);

        getOrCreateTagBuilder(BlockTags.DOORS)
                .add(VonoImpetBlocks.MIRAKELL_DOOR);

        getOrCreateTagBuilder(BlockTags.WOODEN_SLABS)
                .add(VonoImpetBlocks.MIRAKELL_SLAB);

        getOrCreateTagBuilder(BlockTags.WOODEN_STAIRS)
                .add(VonoImpetBlocks.MIRAKELL_STAIRS);

        getOrCreateTagBuilder(BlockTags.WOODEN_FENCES)
                .add(VonoImpetBlocks.MIRAKELL_FENCE);

        getOrCreateTagBuilder(BlockTags.WOODEN_BUTTONS)
                .add(VonoImpetBlocks.MIRAKELL_BUTTON);

        getOrCreateTagBuilder(BlockTags.WOODEN_PRESSURE_PLATES)
                .add(VonoImpetBlocks.MIRAKELL_PRESSURE_PLATE);

        getOrCreateTagBuilder(BlockTags.WOODEN_TRAPDOORS)
                .add(VonoImpetBlocks.MIRAKELL_TRAPDOOR);

        getOrCreateTagBuilder(BlockTags.WOODEN_DOORS)
                .add(VonoImpetBlocks.MIRAKELL_DOOR);

        getOrCreateTagBuilder(BlockTags.UNSTABLE_BOTTOM_CENTER)
                .add(VonoImpetBlocks.MIRAKELL_FENCE_GATE);

        getOrCreateTagBuilder(BlockTags.WALL_POST_OVERRIDE)
                .add(VonoImpetBlocks.MIRAKELL_PRESSURE_PLATE)
                .add(VonoImpetBlocks.MIRAKELL_SIGN)
                .add(VonoImpetBlocks.MIRAKELL_WALL_SIGN);

        getOrCreateTagBuilder(BlockTags.LOGS_THAT_BURN)
                .add(VonoImpetBlocks.MIRAKELL_LOG)
                .add(VonoImpetBlocks.MIRAKELL_WOOD)
                .add(VonoImpetBlocks.STRIPPED_MIRAKELL_LOG)
                .add(VonoImpetBlocks.STRIPPED_MIRAKELL_WOOD);

        getOrCreateTagBuilder(BlockTags.LOGS)
                .add(VonoImpetBlocks.MIRAKELL_LOG)
                .add(VonoImpetBlocks.MIRAKELL_WOOD)
                .add(VonoImpetBlocks.STRIPPED_MIRAKELL_LOG)
                .add(VonoImpetBlocks.STRIPPED_MIRAKELL_WOOD);

        getOrCreateTagBuilder(BlockTags.PLANKS)
                .add(VonoImpetBlocks.MIRAKELL_PLANKS);

        getOrCreateTagBuilder(BlockTags.PARROTS_SPAWNABLE_ON)
                .add(VonoImpetBlocks.MIRAKELL_LOG)
                .add(VonoImpetBlocks.MIRAKELL_WOOD)
                .add(VonoImpetBlocks.STRIPPED_MIRAKELL_LOG)
                .add(VonoImpetBlocks.STRIPPED_MIRAKELL_WOOD)
                .add(VonoImpetBlocks.MIRAKELL_LEAVES);

        getOrCreateTagBuilder(BlockTags.REPLACEABLE_BY_TREES)
                .add(VonoImpetBlocks.MIRAKELL_LEAVES);

        getOrCreateTagBuilder(BlockTags.SWORD_EFFICIENT)
//                .add(VonoImpetBlocks.MIRAKELL_SAPLIING)
                .add(VonoImpetBlocks.MIRAKELL_LEAVES);

        getOrCreateTagBuilder(BlockTags.FLOWER_POTS);
//            .add(VonoImpetBlocks.POTTED_MIRAKELL_SAPLING);

        getOrCreateTagBuilder(BlockTags.LAVA_POOL_STONE_CANNOT_REPLACE)
                .add(VonoImpetBlocks.MIRAKELL_LOG)
                .add(VonoImpetBlocks.MIRAKELL_WOOD)
                .add(VonoImpetBlocks.STRIPPED_MIRAKELL_LOG)
                .add(VonoImpetBlocks.STRIPPED_MIRAKELL_WOOD)
                .add(VonoImpetBlocks.MIRAKELL_LEAVES);

        getOrCreateTagBuilder(VonoImpetBlockTags.MIRAKELL_LOGS)
                .add(VonoImpetBlocks.MIRAKELL_LOG)
                .add(VonoImpetBlocks.MIRAKELL_WOOD)
                .add(VonoImpetBlocks.STRIPPED_MIRAKELL_LOG)
                .add(VonoImpetBlocks.STRIPPED_MIRAKELL_WOOD);

        getOrCreateTagBuilder(BlockTags.STANDING_SIGNS)
                .add(VonoImpetBlocks.MIRAKELL_SIGN);

        getOrCreateTagBuilder(BlockTags.WALL_SIGNS)
                .add(VonoImpetBlocks.MIRAKELL_WALL_SIGN);

        getOrCreateTagBuilder(BlockTags.CEILING_HANGING_SIGNS)
                .add(VonoImpetBlocks.MIRAKELL_HANGING_SIGN);

        getOrCreateTagBuilder(BlockTags.WALL_HANGING_SIGNS)
                .add(VonoImpetBlocks.MIRAKELL_WALL_HANGING_SIGN);

    }
}
