package com.kittykittykitkat.vono_impet.datagen;

import com.kittykittykitkat.vono_impet.block.VonoImpetBlocks;
import com.kittykittykitkat.vono_impet.tag.VonoImpetBlockTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Block;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class VonoImpetBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public VonoImpetBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(BlockTags.CAVE_VINES)
                .add(VonoImpetBlocks.MIRAKELL_BUSHY_VINES)
                .add(VonoImpetBlocks.MIRAKELL_BUSHY_VINES_PLANT);

        getOrCreateTagBuilder(BlockTags.LEAVES)
                .add(VonoImpetBlocks.MIRAKELL_LEAVES)
                .add(VonoImpetBlocks.VARSTER_LEAVES);

        getOrCreateTagBuilder(BlockTags.HOE_MINEABLE)
                .add(VonoImpetBlocks.MIRAKELL_LEAVES)
                .add(VonoImpetBlocks.VARSTER_LEAVES);

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
                .add(VonoImpetBlocks.MIRAKELL_WALL_HANGING_SIGN)
                .add(VonoImpetBlocks.MIRAKELL_SAPLING)
                .add(VonoImpetBlocks.MIRAKELL_VINE)
                .add(VonoImpetBlocks.MIRAKELL_BUSHY_VINES)
                .add(VonoImpetBlocks.MIRAKELL_BUSHY_VINES_PLANT)
                .add(VonoImpetBlocks.VARSTER_LOG)
                .add(VonoImpetBlocks.VARSTER_WOOD)
                .add(VonoImpetBlocks.STRIPPED_VARSTER_LOG)
                .add(VonoImpetBlocks.STRIPPED_VARSTER_WOOD)
                .add(VonoImpetBlocks.VARSTER_PLANKS)
                .add(VonoImpetBlocks.VARSTER_SLAB)
                .add(VonoImpetBlocks.VARSTER_STAIRS)
                .add(VonoImpetBlocks.VARSTER_FENCE)
                .add(VonoImpetBlocks.VARSTER_FENCE_GATE)
                .add(VonoImpetBlocks.VARSTER_DOOR)
                .add(VonoImpetBlocks.VARSTER_TRAPDOOR)
                .add(VonoImpetBlocks.VARSTER_BUTTON)
                .add(VonoImpetBlocks.VARSTER_PRESSURE_PLATE)
                .add(VonoImpetBlocks.VARSTER_SIGN)
                .add(VonoImpetBlocks.VARSTER_WALL_SIGN)
                .add(VonoImpetBlocks.VARSTER_HANGING_SIGN)
                .add(VonoImpetBlocks.VARSTER_WALL_HANGING_SIGN)
                .add(VonoImpetBlocks.VARSTER_SAPLING);

        getOrCreateTagBuilder(BlockTags.FENCE_GATES)
                .add(VonoImpetBlocks.MIRAKELL_FENCE_GATE)
                .add(VonoImpetBlocks.VARSTER_FENCE_GATE);

        getOrCreateTagBuilder(BlockTags.WOODEN_SLABS)
                .add(VonoImpetBlocks.MIRAKELL_SLAB)
                .add(VonoImpetBlocks.VARSTER_SLAB);

        getOrCreateTagBuilder(BlockTags.WOODEN_STAIRS)
                .add(VonoImpetBlocks.MIRAKELL_STAIRS)
                .add(VonoImpetBlocks.VARSTER_STAIRS);

        getOrCreateTagBuilder(BlockTags.WOODEN_FENCES)
                .add(VonoImpetBlocks.MIRAKELL_FENCE)
                .add(VonoImpetBlocks.VARSTER_FENCE);

        getOrCreateTagBuilder(BlockTags.WOODEN_BUTTONS)
                .add(VonoImpetBlocks.MIRAKELL_BUTTON)
                .add(VonoImpetBlocks.VARSTER_BUTTON);

        getOrCreateTagBuilder(BlockTags.WOODEN_PRESSURE_PLATES)
                .add(VonoImpetBlocks.MIRAKELL_PRESSURE_PLATE)
                .add(VonoImpetBlocks.VARSTER_PRESSURE_PLATE);

        getOrCreateTagBuilder(BlockTags.WOODEN_TRAPDOORS)
                .add(VonoImpetBlocks.MIRAKELL_TRAPDOOR)
                .add(VonoImpetBlocks.VARSTER_TRAPDOOR);

        getOrCreateTagBuilder(BlockTags.WOODEN_DOORS)
                .add(VonoImpetBlocks.MIRAKELL_DOOR)
                .add(VonoImpetBlocks.VARSTER_DOOR);

        getOrCreateTagBuilder(BlockTags.UNSTABLE_BOTTOM_CENTER)
                .add(VonoImpetBlocks.MIRAKELL_FENCE_GATE)
                .add(VonoImpetBlocks.VARSTER_FENCE_GATE);

        getOrCreateTagBuilder(BlockTags.WALL_POST_OVERRIDE)
                .add(VonoImpetBlocks.MIRAKELL_PRESSURE_PLATE)
                .add(VonoImpetBlocks.MIRAKELL_SIGN)
                .add(VonoImpetBlocks.MIRAKELL_WALL_SIGN)
                .add(VonoImpetBlocks.VARSTER_PRESSURE_PLATE)
                .add(VonoImpetBlocks.VARSTER_SIGN)
                .add(VonoImpetBlocks.VARSTER_WALL_SIGN);

        getOrCreateTagBuilder(BlockTags.LOGS_THAT_BURN)
                .add(VonoImpetBlocks.MIRAKELL_LOG)
                .add(VonoImpetBlocks.MIRAKELL_WOOD)
                .add(VonoImpetBlocks.STRIPPED_MIRAKELL_LOG)
                .add(VonoImpetBlocks.STRIPPED_MIRAKELL_WOOD)
                .add(VonoImpetBlocks.VARSTER_LOG)
                .add(VonoImpetBlocks.VARSTER_WOOD)
                .add(VonoImpetBlocks.STRIPPED_VARSTER_LOG)
                .add(VonoImpetBlocks.STRIPPED_VARSTER_WOOD);

        getOrCreateTagBuilder(BlockTags.LOGS)
                .add(VonoImpetBlocks.MIRAKELL_LOG)
                .add(VonoImpetBlocks.MIRAKELL_WOOD)
                .add(VonoImpetBlocks.STRIPPED_MIRAKELL_LOG)
                .add(VonoImpetBlocks.STRIPPED_MIRAKELL_WOOD)
                .add(VonoImpetBlocks.VARSTER_LOG)
                .add(VonoImpetBlocks.VARSTER_WOOD)
                .add(VonoImpetBlocks.STRIPPED_VARSTER_LOG)
                .add(VonoImpetBlocks.STRIPPED_VARSTER_WOOD);

        getOrCreateTagBuilder(BlockTags.PLANKS)
                .add(VonoImpetBlocks.MIRAKELL_PLANKS)
                .add(VonoImpetBlocks.VARSTER_PLANKS);

        getOrCreateTagBuilder(BlockTags.PARROTS_SPAWNABLE_ON)
                .add(VonoImpetBlocks.MIRAKELL_LOG)
                .add(VonoImpetBlocks.MIRAKELL_WOOD)
                .add(VonoImpetBlocks.STRIPPED_MIRAKELL_LOG)
                .add(VonoImpetBlocks.STRIPPED_MIRAKELL_WOOD)
                .add(VonoImpetBlocks.MIRAKELL_LEAVES)
                .add(VonoImpetBlocks.VARSTER_LOG)
                .add(VonoImpetBlocks.VARSTER_WOOD)
                .add(VonoImpetBlocks.STRIPPED_VARSTER_LOG)
                .add(VonoImpetBlocks.STRIPPED_VARSTER_WOOD)
                .add(VonoImpetBlocks.VARSTER_LEAVES);

        getOrCreateTagBuilder(BlockTags.REPLACEABLE_BY_TREES)
                .add(VonoImpetBlocks.MIRAKELL_LEAVES)
                .add(VonoImpetBlocks.MIRAKELL_VINE)
                .add(VonoImpetBlocks.VARSTER_LEAVES);

        getOrCreateTagBuilder(BlockTags.SWORD_EFFICIENT)
                .add(VonoImpetBlocks.MIRAKELL_SAPLING)
                .add(VonoImpetBlocks.MIRAKELL_LEAVES)
                .add(VonoImpetBlocks.MIRAKELL_VINE)
                .add(VonoImpetBlocks.MIRAKELL_BUSHY_VINES)
                .add(VonoImpetBlocks.MIRAKELL_BUSHY_VINES_PLANT)
                .add(VonoImpetBlocks.VARSTER_SAPLING)
                .add(VonoImpetBlocks.VARSTER_LEAVES);

        getOrCreateTagBuilder(BlockTags.FLOWER_POTS)
            .add(VonoImpetBlocks.POTTED_MIRAKELL_SAPLING)
            .add(VonoImpetBlocks.POTTED_VARSTER_SAPLING)
            .add(VonoImpetBlocks.POTTED_KAYO);

        getOrCreateTagBuilder(BlockTags.LAVA_POOL_STONE_CANNOT_REPLACE)
                .add(VonoImpetBlocks.MIRAKELL_LOG)
                .add(VonoImpetBlocks.MIRAKELL_WOOD)
                .add(VonoImpetBlocks.STRIPPED_MIRAKELL_LOG)
                .add(VonoImpetBlocks.STRIPPED_MIRAKELL_WOOD)
                .add(VonoImpetBlocks.MIRAKELL_LEAVES)
                .add(VonoImpetBlocks.VARSTER_LOG)
                .add(VonoImpetBlocks.VARSTER_WOOD)
                .add(VonoImpetBlocks.STRIPPED_VARSTER_LOG)
                .add(VonoImpetBlocks.STRIPPED_VARSTER_WOOD)
                .add(VonoImpetBlocks.VARSTER_LEAVES);

        getOrCreateTagBuilder(VonoImpetBlockTags.MIRAKELL_LOGS)
                .add(VonoImpetBlocks.MIRAKELL_LOG)
                .add(VonoImpetBlocks.MIRAKELL_WOOD)
                .add(VonoImpetBlocks.STRIPPED_MIRAKELL_LOG)
                .add(VonoImpetBlocks.STRIPPED_MIRAKELL_WOOD);

        getOrCreateTagBuilder(VonoImpetBlockTags.VARSTER_LOGS)
                .add(VonoImpetBlocks.VARSTER_LOG)
                .add(VonoImpetBlocks.VARSTER_WOOD)
                .add(VonoImpetBlocks.STRIPPED_VARSTER_LOG)
                .add(VonoImpetBlocks.STRIPPED_VARSTER_WOOD);

        getOrCreateTagBuilder(BlockTags.STANDING_SIGNS)
                .add(VonoImpetBlocks.MIRAKELL_SIGN)
                .add(VonoImpetBlocks.VARSTER_SIGN);

        getOrCreateTagBuilder(BlockTags.WALL_SIGNS)
                .add(VonoImpetBlocks.MIRAKELL_WALL_SIGN)
                .add(VonoImpetBlocks.VARSTER_WALL_SIGN);

        getOrCreateTagBuilder(BlockTags.CEILING_HANGING_SIGNS)
                .add(VonoImpetBlocks.MIRAKELL_HANGING_SIGN)
                .add(VonoImpetBlocks.VARSTER_HANGING_SIGN);

        getOrCreateTagBuilder(BlockTags.WALL_HANGING_SIGNS)
                .add(VonoImpetBlocks.MIRAKELL_WALL_HANGING_SIGN)
                .add(VonoImpetBlocks.VARSTER_WALL_HANGING_SIGN);

        getOrCreateTagBuilder(BlockTags.SAPLINGS)
                .add(VonoImpetBlocks.MIRAKELL_SAPLING)
                .add(VonoImpetBlocks.VARSTER_SAPLING);

        getOrCreateTagBuilder(BlockTags.COMPLETES_FIND_TREE_TUTORIAL)
                .add(VonoImpetBlocks.MIRAKELL_LOG)
                .add(VonoImpetBlocks.MIRAKELL_WOOD)
                .add(VonoImpetBlocks.STRIPPED_MIRAKELL_LOG)
                .add(VonoImpetBlocks.STRIPPED_MIRAKELL_WOOD)
                .add(VonoImpetBlocks.MIRAKELL_LEAVES)
                .add(VonoImpetBlocks.VARSTER_LOG)
                .add(VonoImpetBlocks.VARSTER_WOOD)
                .add(VonoImpetBlocks.STRIPPED_VARSTER_LOG)
                .add(VonoImpetBlocks.STRIPPED_VARSTER_WOOD)
                .add(VonoImpetBlocks.VARSTER_LEAVES);

        getOrCreateTagBuilder(BlockTags.CLIMBABLE)
                .add(VonoImpetBlocks.MIRAKELL_VINE)
                .add(VonoImpetBlocks.MIRAKELL_BUSHY_VINES)
                .add(VonoImpetBlocks.MIRAKELL_BUSHY_VINES_PLANT);

        getOrCreateTagBuilder(BlockTags.MANGROVE_LOGS_CAN_GROW_THROUGH)
                .add(VonoImpetBlocks.MIRAKELL_VINE);

        getOrCreateTagBuilder(BlockTags.MANGROVE_ROOTS_CAN_GROW_THROUGH)
                .add(VonoImpetBlocks.MIRAKELL_VINE);

        getOrCreateTagBuilder(BlockTags.SLABS)
                .add(VonoImpetBlocks.HADELITE_SLAB)
                .add(VonoImpetBlocks.POLISHED_HADELITE_SLAB)
                .add(VonoImpetBlocks.HADELITE_TILE_SLAB)
                .add(VonoImpetBlocks.HADELITE_BRICK_SLAB);

        getOrCreateTagBuilder(BlockTags.STAIRS)
                .add(VonoImpetBlocks.HADELITE_STAIRS)
                .add(VonoImpetBlocks.POLISHED_HADELITE_STAIRS)
                .add(VonoImpetBlocks.HADELITE_TILE_STAIRS)
                .add(VonoImpetBlocks.HADELITE_BRICK_STAIRS);

        getOrCreateTagBuilder(BlockTags.WALLS)
                .add(VonoImpetBlocks.HADELITE_WALL)
                .add(VonoImpetBlocks.POLISHED_HADELITE_WALL)
                .add(VonoImpetBlocks.HADELITE_TILE_WALL)
                .add(VonoImpetBlocks.HADELITE_BRICK_WALL);

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(VonoImpetBlocks.HADELITE)
                .add(VonoImpetBlocks.HADELITE_SLAB)
                .add(VonoImpetBlocks.HADELITE_STAIRS)
                .add(VonoImpetBlocks.HADELITE_WALL)
                .add(VonoImpetBlocks.HADELITE_BUTTON)
                .add(VonoImpetBlocks.HADELITE_PRESSURE_PLATE)
                .add(VonoImpetBlocks.POLISHED_HADELITE)
                .add(VonoImpetBlocks.POLISHED_HADELITE_SLAB)
                .add(VonoImpetBlocks.POLISHED_HADELITE_STAIRS)
                .add(VonoImpetBlocks.POLISHED_HADELITE_WALL)
                .add(VonoImpetBlocks.HADELITE_TILES)
                .add(VonoImpetBlocks.HADELITE_TILE_SLAB)
                .add(VonoImpetBlocks.HADELITE_TILE_STAIRS)
                .add(VonoImpetBlocks.HADELITE_TILE_WALL)
                .add(VonoImpetBlocks.CRACKED_HADELITE_TILES)
                .add(VonoImpetBlocks.HADELITE_BRICKS)
                .add(VonoImpetBlocks.HADELITE_BRICK_SLAB)
                .add(VonoImpetBlocks.HADELITE_BRICK_STAIRS)
                .add(VonoImpetBlocks.HADELITE_BRICK_WALL)
                .add(VonoImpetBlocks.CRACKED_HADELITE_BRICKS)
                .add(VonoImpetBlocks.CHISELED_HADELITE_BRICKS)
                .add(VonoImpetBlocks.HADELITE_PILLAR)
                .add(VonoImpetBlocks.HADELITE_CORNER_PILLAR)
                .add(VonoImpetBlocks.UNREFINED_CRYNIA)
                .add(VonoImpetBlocks.CRYNIA_BLOCK)
                .add(VonoImpetBlocks.CRYNIA_BARS)
                .add(VonoImpetBlocks.CRYNIA_DOOR)
                .add(VonoImpetBlocks.CRYNIA_TRAPDOOR)
                .add(VonoImpetBlocks.BLACK_SAIGA)
                .add(VonoImpetBlocks.BLUE_SAIGA)
                .add(VonoImpetBlocks.BROWN_SAIGA)
                .add(VonoImpetBlocks.CYAN_SAIGA)
                .add(VonoImpetBlocks.GRAY_SAIGA)
                .add(VonoImpetBlocks.GREEN_SAIGA)
                .add(VonoImpetBlocks.LIGHT_BLUE_SAIGA)
                .add(VonoImpetBlocks.LIGHT_GRAY_SAIGA)
                .add(VonoImpetBlocks.LIME_SAIGA)
                .add(VonoImpetBlocks.MAGENTA_SAIGA)
                .add(VonoImpetBlocks.ORANGE_SAIGA)
                .add(VonoImpetBlocks.PINK_SAIGA)
                .add(VonoImpetBlocks.PURPLE_SAIGA)
                .add(VonoImpetBlocks.RED_SAIGA)
                .add(VonoImpetBlocks.WHITE_SAIGA)
                .add(VonoImpetBlocks.YELLOW_SAIGA);

        getOrCreateTagBuilder(VonoImpetBlockTags.HADELITE_ORE_REPLACEABLES)
                .add(VonoImpetBlocks.HADELITE);

        getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(VonoImpetBlocks.UNREFINED_CRYNIA)
                .add(VonoImpetBlocks.CRYNIA_BLOCK)
                .add(VonoImpetBlocks.CRYNIA_BARS)
                .add(VonoImpetBlocks.CRYNIA_DOOR)
                .add(VonoImpetBlocks.CRYNIA_TRAPDOOR);

        getOrCreateTagBuilder(BlockTags.BEACON_BASE_BLOCKS)
                .add(VonoImpetBlocks.CRYNIA_BLOCK);

        getOrCreateTagBuilder(BlockTags.IMPERMEABLE)
                .add(VonoImpetBlocks.BLACK_SAIGA)
                .add(VonoImpetBlocks.BLUE_SAIGA)
                .add(VonoImpetBlocks.BROWN_SAIGA)
                .add(VonoImpetBlocks.CYAN_SAIGA)
                .add(VonoImpetBlocks.GRAY_SAIGA)
                .add(VonoImpetBlocks.GREEN_SAIGA)
                .add(VonoImpetBlocks.LIGHT_BLUE_SAIGA)
                .add(VonoImpetBlocks.LIGHT_GRAY_SAIGA)
                .add(VonoImpetBlocks.LIME_SAIGA)
                .add(VonoImpetBlocks.MAGENTA_SAIGA)
                .add(VonoImpetBlocks.ORANGE_SAIGA)
                .add(VonoImpetBlocks.PINK_SAIGA)
                .add(VonoImpetBlocks.PURPLE_SAIGA)
                .add(VonoImpetBlocks.RED_SAIGA)
                .add(VonoImpetBlocks.WHITE_SAIGA)
                .add(VonoImpetBlocks.YELLOW_SAIGA);

        getOrCreateTagBuilder(BlockTags.DOORS)
                .add(VonoImpetBlocks.CRYNIA_DOOR);

        getOrCreateTagBuilder(BlockTags.TRAPDOORS)
                .add(VonoImpetBlocks.CRYNIA_TRAPDOOR);

        getOrCreateTagBuilder(BlockTags.SMALL_FLOWERS)
                .add(VonoImpetBlocks.KAYO);

    }
}
