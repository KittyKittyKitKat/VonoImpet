package com.kittykittykitkat.vono_impet.datagen;

import com.kittykittykitkat.vono_impet.block.VonoImpetBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;

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
//        addDrop(VonoImpetBlocks.MIRAKELL_LEAVES, leavesDrops(VonoImpetBlocks.MIRAKELL_LEAVES, VonoImpetBlocks.MIRAKELL_SAPLING, SAPLING_DROP_CHANCE));
        addDrop(VonoImpetBlocks.MIRAKELL_PLANKS);
        addDrop(VonoImpetBlocks.MIRAKELL_SLAB, slabDrops(VonoImpetBlocks.MIRAKELL_SLAB));
        addDrop(VonoImpetBlocks.MIRAKELL_STAIRS);
        addDrop(VonoImpetBlocks.MIRAKELL_FENCE);
        addDrop(VonoImpetBlocks.MIRAKELL_FENCE_GATE);
        addDrop(VonoImpetBlocks.MIRAKELL_DOOR, doorDrops(VonoImpetBlocks.MIRAKELL_DOOR));
        addDrop(VonoImpetBlocks.MIRAKELL_TRAPDOOR);
        addDrop(VonoImpetBlocks.MIRAKELL_BUTTON);
        addDrop(VonoImpetBlocks.MIRAKELL_PRESSURE_PLATE);
//        addDrop(VonoImpetBlocks.MIRAKELL_SAPLING);
//        addDrop(VonoImpetBlocks.POTTED_MIRAKELL_SAPLING, pottedPlantDrops(VonoImpetBlocks.MIRAKELL_SAPLING));
        addDrop(VonoImpetBlocks.MIRAKELL_SIGN);
        addDrop(VonoImpetBlocks.MIRAKELL_HANGING_SIGN);

        addDrop(VonoImpetBlocks.VARSTER_LOG);
        addDrop(VonoImpetBlocks.VARSTER_WOOD);
        addDrop(VonoImpetBlocks.STRIPPED_VARSTER_LOG);
        addDrop(VonoImpetBlocks.STRIPPED_VARSTER_WOOD);
//        addDrop(VonoImpetBlocks.VARSTER_LEAVES, leavesDrops(VonoImpetBlocks.VARSTER_LEAVES, VonoImpetBlocks.VARSTER_SAPLING, SAPLING_DROP_CHANCE));
        addDrop(VonoImpetBlocks.VARSTER_PLANKS);
        addDrop(VonoImpetBlocks.VARSTER_SLAB, slabDrops(VonoImpetBlocks.VARSTER_SLAB));
        addDrop(VonoImpetBlocks.VARSTER_STAIRS);
        addDrop(VonoImpetBlocks.VARSTER_FENCE);
        addDrop(VonoImpetBlocks.VARSTER_FENCE_GATE);
        addDrop(VonoImpetBlocks.VARSTER_DOOR, doorDrops(VonoImpetBlocks.VARSTER_DOOR));
        addDrop(VonoImpetBlocks.VARSTER_TRAPDOOR);
        addDrop(VonoImpetBlocks.VARSTER_BUTTON);
        addDrop(VonoImpetBlocks.VARSTER_PRESSURE_PLATE);
//        addDrop(VonoImpetBlocks.VARSTER_SAPLING);
//        addDrop(VonoImpetBlocks.POTTED_VARSTER_SAPLING, pottedPlantDrops(VonoImpetBlocks.VARSTER_SAPLING));
        addDrop(VonoImpetBlocks.VARSTER_SIGN);
        addDrop(VonoImpetBlocks.VARSTER_HANGING_SIGN);
    }
}
