package com.kittykittykitkat.vono_impet.datagen;

import com.kittykittykitkat.vono_impet.block.VonoImpetBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;

public class VonoImpetBlockStateModelProvider extends FabricModelProvider {
    public VonoImpetBlockStateModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        // MIRAKELL
        blockStateModelGenerator.registerLog(VonoImpetBlocks.MIRAKELL_LOG).log(VonoImpetBlocks.MIRAKELL_LOG).wood(VonoImpetBlocks.MIRAKELL_WOOD);
        blockStateModelGenerator.registerLog(VonoImpetBlocks.STRIPPED_MIRAKELL_LOG).log(VonoImpetBlocks.STRIPPED_MIRAKELL_LOG).wood(VonoImpetBlocks.STRIPPED_MIRAKELL_WOOD);
        blockStateModelGenerator.registerSimpleCubeAll(VonoImpetBlocks.MIRAKELL_LEAVES);
        blockStateModelGenerator.registerCubeAllModelTexturePool(VonoImpetBlocks.MIRAKELL_PLANKS)
                .stairs(VonoImpetBlocks.MIRAKELL_STAIRS)
                .slab(VonoImpetBlocks.MIRAKELL_SLAB)
                .button(VonoImpetBlocks.MIRAKELL_BUTTON)
                .fence(VonoImpetBlocks.MIRAKELL_FENCE)
                .fenceGate(VonoImpetBlocks.MIRAKELL_FENCE_GATE)
                .pressurePlate(VonoImpetBlocks.MIRAKELL_PRESSURE_PLATE);
        blockStateModelGenerator.registerDoor(VonoImpetBlocks.MIRAKELL_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(VonoImpetBlocks.MIRAKELL_TRAPDOOR);
        // TODO: SIGNS AND HANGING SIGNS
        // TODO: SAPLING AND POTTED SAPLING
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

    }
}
