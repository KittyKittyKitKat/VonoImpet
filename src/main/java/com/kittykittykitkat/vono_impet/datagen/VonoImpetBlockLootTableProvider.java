package com.kittykittykitkat.vono_impet.datagen;

import com.kittykittykitkat.vono_impet.block.VonoImpetBlocks;
import com.kittykittykitkat.vono_impet.item.VonoImpetItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.data.server.loottable.BlockLootTableGenerator;

public class VonoImpetBlockLootTableProvider extends FabricBlockLootTableProvider {

    public VonoImpetBlockLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        // MIRAKELL
        addDrop(VonoImpetBlocks.MIRAKELL_LOG);
        addDrop(VonoImpetBlocks.MIRAKELL_WOOD);
        addDrop(VonoImpetBlocks.STRIPPED_MIRAKELL_LOG);
        addDrop(VonoImpetBlocks.STRIPPED_MIRAKELL_WOOD);
        // TODO: Drop Potential Sparks
        addDrop(VonoImpetBlocks.MIRAKELL_LEAVES, leavesDrops(VonoImpetBlocks.MIRAKELL_LEAVES, VonoImpetBlocks.MIRAKELL_SAPLING, SAPLING_DROP_CHANCE));
        addDrop(VonoImpetBlocks.MIRAKELL_PLANKS);
        addDrop(VonoImpetBlocks.MIRAKELL_SLAB, slabDrops(VonoImpetBlocks.MIRAKELL_SLAB));
        addDrop(VonoImpetBlocks.MIRAKELL_STAIRS);
        addDrop(VonoImpetBlocks.MIRAKELL_FENCE);
        addDrop(VonoImpetBlocks.MIRAKELL_FENCE_GATE);
        addDrop(VonoImpetBlocks.MIRAKELL_DOOR, doorDrops(VonoImpetBlocks.MIRAKELL_DOOR));
        addDrop(VonoImpetBlocks.MIRAKELL_TRAPDOOR);
        addDrop(VonoImpetBlocks.MIRAKELL_BUTTON);
        addDrop(VonoImpetBlocks.MIRAKELL_PRESSURE_PLATE);
        addDrop(VonoImpetBlocks.MIRAKELL_SAPLING);
        addPottedPlantDrops(VonoImpetBlocks.POTTED_MIRAKELL_SAPLING);
        addDrop(VonoImpetBlocks.MIRAKELL_SIGN);
        addDrop(VonoImpetBlocks.MIRAKELL_HANGING_SIGN);
        addDrop(VonoImpetBlocks.MIRAKELL_VINE, BlockLootTableGenerator::dropsWithShears);
        addVinePlantDrop(VonoImpetBlocks.MIRAKELL_BUSHY_VINES, VonoImpetBlocks.MIRAKELL_BUSHY_VINES_PLANT);

        addDrop(VonoImpetBlocks.VARSTER_LOG);
        addDrop(VonoImpetBlocks.VARSTER_WOOD);
        addDrop(VonoImpetBlocks.STRIPPED_VARSTER_LOG);
        addDrop(VonoImpetBlocks.STRIPPED_VARSTER_WOOD);
        // TODO: Drop Varster Anvi
        addDrop(VonoImpetBlocks.VARSTER_LEAVES, leavesDrops(VonoImpetBlocks.VARSTER_LEAVES, VonoImpetBlocks.VARSTER_SAPLING, SAPLING_DROP_CHANCE));
        addDrop(VonoImpetBlocks.VARSTER_PLANKS);
        addDrop(VonoImpetBlocks.VARSTER_SLAB, slabDrops(VonoImpetBlocks.VARSTER_SLAB));
        addDrop(VonoImpetBlocks.VARSTER_STAIRS);
        addDrop(VonoImpetBlocks.VARSTER_FENCE);
        addDrop(VonoImpetBlocks.VARSTER_FENCE_GATE);
        addDrop(VonoImpetBlocks.VARSTER_DOOR, doorDrops(VonoImpetBlocks.VARSTER_DOOR));
        addDrop(VonoImpetBlocks.VARSTER_TRAPDOOR);
        addDrop(VonoImpetBlocks.VARSTER_BUTTON);
        addDrop(VonoImpetBlocks.VARSTER_PRESSURE_PLATE);
        addDrop(VonoImpetBlocks.VARSTER_SAPLING);
        addPottedPlantDrops(VonoImpetBlocks.POTTED_VARSTER_SAPLING);
        addDrop(VonoImpetBlocks.VARSTER_SIGN);
        addDrop(VonoImpetBlocks.VARSTER_HANGING_SIGN);

        addDrop(VonoImpetBlocks.HADELITE);
        addDrop(VonoImpetBlocks.HADELITE_SLAB, slabDrops(VonoImpetBlocks.HADELITE_SLAB));
        addDrop(VonoImpetBlocks.HADELITE_STAIRS);
        addDrop(VonoImpetBlocks.HADELITE_WALL);
        addDrop(VonoImpetBlocks.HADELITE_BUTTON);
        addDrop(VonoImpetBlocks.HADELITE_PRESSURE_PLATE);
        addDrop(VonoImpetBlocks.POLISHED_HADELITE);
        addDrop(VonoImpetBlocks.POLISHED_HADELITE_SLAB, slabDrops(VonoImpetBlocks.POLISHED_HADELITE_SLAB));
        addDrop(VonoImpetBlocks.POLISHED_HADELITE_STAIRS);
        addDrop(VonoImpetBlocks.POLISHED_HADELITE_WALL);
        addDrop(VonoImpetBlocks.HADELITE_TILES);
        addDrop(VonoImpetBlocks.HADELITE_TILE_SLAB, slabDrops(VonoImpetBlocks.HADELITE_TILE_SLAB));
        addDrop(VonoImpetBlocks.HADELITE_TILE_STAIRS);
        addDrop(VonoImpetBlocks.HADELITE_TILE_WALL);
        addDrop(VonoImpetBlocks.CRACKED_HADELITE_TILES);
        addDrop(VonoImpetBlocks.HADELITE_BRICKS);
        addDrop(VonoImpetBlocks.HADELITE_BRICK_SLAB, slabDrops(VonoImpetBlocks.HADELITE_BRICK_SLAB));
        addDrop(VonoImpetBlocks.HADELITE_BRICK_STAIRS);
        addDrop(VonoImpetBlocks.HADELITE_BRICK_WALL);
        addDrop(VonoImpetBlocks.CRACKED_HADELITE_BRICKS);
        addDrop(VonoImpetBlocks.CHISELED_HADELITE_BRICKS);
        addDrop(VonoImpetBlocks.HADELITE_PILLAR);
        addDrop(VonoImpetBlocks.HADELITE_CORNER_PILLAR);

    }
}
