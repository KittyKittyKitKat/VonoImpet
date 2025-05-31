package com.kittykittykitkat.vono_impet.datagen;

import com.kittykittykitkat.vono_impet.block.VonoImpetBlocks;
import com.kittykittykitkat.vono_impet.item.VonoImpetItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.*;
import net.minecraft.util.Identifier;

public class VonoImpetBlockStateModelProvider extends FabricModelProvider {
    public VonoImpetBlockStateModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        generateMirakell(blockStateModelGenerator);
        generateVarster(blockStateModelGenerator);
        generateHadelite(blockStateModelGenerator);
        blockStateModelGenerator.registerSimpleCubeAll(VonoImpetBlocks.UNREFINED_CRYNIA);
        blockStateModelGenerator.registerSimpleCubeAll(VonoImpetBlocks.CRYNIA_BLOCK);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(VonoImpetItems.MIRAKELL_BOAT, Models.GENERATED);
        itemModelGenerator.register(VonoImpetItems.MIRAKELL_CHEST_BOAT, Models.GENERATED);

        itemModelGenerator.register(VonoImpetItems.VARSTER_BOAT, Models.GENERATED);
        itemModelGenerator.register(VonoImpetItems.VARSTER_CHEST_BOAT, Models.GENERATED);

        itemModelGenerator.register(VonoImpetItems.MUSIC_DISC_PASET_E_IMPETIF_LENA, Models.TEMPLATE_MUSIC_DISC);

        itemModelGenerator.register(VonoImpetItems.POTENTIAL_SPARK, Models.GENERATED);
        itemModelGenerator.register(VonoImpetItems.VARSTER_ANVI, Models.GENERATED);

        itemModelGenerator.register(VonoImpetItems.ELUSIVE_REMNANT, Models.GENERATED);
        itemModelGenerator.register(VonoImpetItems.CRYNIA_INGOT, Models.GENERATED);
        itemModelGenerator.register(VonoImpetItems.CRYNIA_SWORD, Models.HANDHELD);
        itemModelGenerator.register(VonoImpetItems.CRYNIA_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(VonoImpetItems.CRYNIA_AXE, Models.HANDHELD);
        itemModelGenerator.register(VonoImpetItems.CRYNIA_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(VonoImpetItems.CRYNIA_HOE, Models.HANDHELD);
    }

    public void generateMirakell(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerLog(VonoImpetBlocks.MIRAKELL_LOG).log(VonoImpetBlocks.MIRAKELL_LOG).wood(VonoImpetBlocks.MIRAKELL_WOOD);
        blockStateModelGenerator.registerLog(VonoImpetBlocks.STRIPPED_MIRAKELL_LOG).log(VonoImpetBlocks.STRIPPED_MIRAKELL_LOG).wood(VonoImpetBlocks.STRIPPED_MIRAKELL_WOOD);
        blockStateModelGenerator.registerSimpleCubeAll(VonoImpetBlocks.MIRAKELL_LEAVES);
        blockStateModelGenerator.registerCubeAllModelTexturePool(VonoImpetBlocks.MIRAKELL_PLANKS)
                .stairs(VonoImpetBlocks.MIRAKELL_STAIRS)
                .slab(VonoImpetBlocks.MIRAKELL_SLAB)
                .button(VonoImpetBlocks.MIRAKELL_BUTTON)
                .fence(VonoImpetBlocks.MIRAKELL_FENCE)
                .fenceGate(VonoImpetBlocks.MIRAKELL_FENCE_GATE)
                .pressurePlate(VonoImpetBlocks.MIRAKELL_PRESSURE_PLATE)
                .family(VonoImpetBlocks.MIRAKELL_FAMILY);
        blockStateModelGenerator.registerDoor(VonoImpetBlocks.MIRAKELL_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(VonoImpetBlocks.MIRAKELL_TRAPDOOR);
        blockStateModelGenerator.registerHangingSign(VonoImpetBlocks.STRIPPED_MIRAKELL_LOG, VonoImpetBlocks.MIRAKELL_HANGING_SIGN, VonoImpetBlocks.MIRAKELL_WALL_HANGING_SIGN);
        blockStateModelGenerator.registerFlowerPotPlant(VonoImpetBlocks.MIRAKELL_SAPLING, VonoImpetBlocks.POTTED_MIRAKELL_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerTintableCross(VonoImpetBlocks.MIRAKELL_BUSHY_VINES, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerTintableCross(VonoImpetBlocks.MIRAKELL_BUSHY_VINES_PLANT, BlockStateModelGenerator.TintType.NOT_TINTED);
    }

    public void generateVarster(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerLog(VonoImpetBlocks.VARSTER_LOG).log(VonoImpetBlocks.VARSTER_LOG).wood(VonoImpetBlocks.VARSTER_WOOD);
        blockStateModelGenerator.registerLog(VonoImpetBlocks.STRIPPED_VARSTER_LOG).log(VonoImpetBlocks.STRIPPED_VARSTER_LOG).wood(VonoImpetBlocks.STRIPPED_VARSTER_WOOD);
        blockStateModelGenerator.registerSimpleCubeAll(VonoImpetBlocks.VARSTER_LEAVES);
        blockStateModelGenerator.registerCubeAllModelTexturePool(VonoImpetBlocks.VARSTER_PLANKS)
                .stairs(VonoImpetBlocks.VARSTER_STAIRS)
                .slab(VonoImpetBlocks.VARSTER_SLAB)
                .button(VonoImpetBlocks.VARSTER_BUTTON)
                .fence(VonoImpetBlocks.VARSTER_FENCE)
                .fenceGate(VonoImpetBlocks.VARSTER_FENCE_GATE)
                .pressurePlate(VonoImpetBlocks.VARSTER_PRESSURE_PLATE)
                .family(VonoImpetBlocks.VARSTER_FAMILY);
        blockStateModelGenerator.registerDoor(VonoImpetBlocks.VARSTER_DOOR);
        blockStateModelGenerator.registerTrapdoor(VonoImpetBlocks.VARSTER_TRAPDOOR);
        blockStateModelGenerator.registerHangingSign(VonoImpetBlocks.STRIPPED_VARSTER_LOG, VonoImpetBlocks.VARSTER_HANGING_SIGN, VonoImpetBlocks.VARSTER_WALL_HANGING_SIGN);
        blockStateModelGenerator.registerFlowerPotPlant(VonoImpetBlocks.VARSTER_SAPLING, VonoImpetBlocks.POTTED_VARSTER_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);
    }

    public void generateHadelite(BlockStateModelGenerator blockStateModelGenerator) {
        // HADELITE
        blockStateModelGenerator.registerMirrorable(VonoImpetBlocks.HADELITE);

        blockStateModelGenerator.blockStateCollector.accept(
                BlockStateModelGenerator.createStairsBlockState(
                        VonoImpetBlocks.HADELITE_STAIRS,
                        Models.INNER_STAIRS.upload(VonoImpetBlocks.HADELITE_STAIRS, TextureMap.all(VonoImpetBlocks.HADELITE), blockStateModelGenerator.modelCollector),
                        Models.STAIRS.upload(VonoImpetBlocks.HADELITE_STAIRS, TextureMap.all(VonoImpetBlocks.HADELITE), blockStateModelGenerator.modelCollector),
                        Models.OUTER_STAIRS.upload(VonoImpetBlocks.HADELITE_STAIRS, TextureMap.all(VonoImpetBlocks.HADELITE), blockStateModelGenerator.modelCollector)
                )
        );

        blockStateModelGenerator.blockStateCollector.accept(
                BlockStateModelGenerator.createSlabBlockState(
                        VonoImpetBlocks.HADELITE_SLAB,
                        Models.SLAB.upload(VonoImpetBlocks.HADELITE_SLAB, TextureMap.all(VonoImpetBlocks.HADELITE), blockStateModelGenerator.modelCollector),
                        Models.SLAB_TOP.upload(VonoImpetBlocks.HADELITE_SLAB, TextureMap.all(VonoImpetBlocks.HADELITE), blockStateModelGenerator.modelCollector),
                        ModelIds.getBlockModelId(VonoImpetBlocks.HADELITE)
                )
        );

        blockStateModelGenerator.blockStateCollector.accept(
                BlockStateModelGenerator.createWallBlockState(
                        VonoImpetBlocks.HADELITE_WALL,
                        Models.TEMPLATE_WALL_POST.upload(
                                VonoImpetBlocks.HADELITE_WALL,
                                TextureMap.all(VonoImpetBlocks.HADELITE),
                                blockStateModelGenerator.modelCollector
                        ),
                        Models.TEMPLATE_WALL_SIDE.upload(
                                VonoImpetBlocks.HADELITE_WALL,
                                TextureMap.all(VonoImpetBlocks.HADELITE),
                                blockStateModelGenerator.modelCollector
                        ),
                        Models.TEMPLATE_WALL_SIDE_TALL.upload(
                                VonoImpetBlocks.HADELITE_WALL,
                                TextureMap.all(VonoImpetBlocks.HADELITE),
                                blockStateModelGenerator.modelCollector
                        )
                )
        );
        Models.WALL_INVENTORY.upload(
                VonoImpetBlocks.HADELITE_WALL,
                TextureMap.all(VonoImpetBlocks.HADELITE),
                blockStateModelGenerator.modelCollector
        );
        blockStateModelGenerator.registerParentedItemModel(VonoImpetBlocks.HADELITE_WALL, ModelIds.getBlockSubModelId(VonoImpetBlocks.HADELITE_WALL, "_inventory"));

        blockStateModelGenerator.blockStateCollector.accept(
                BlockStateModelGenerator.createButtonBlockState(
                        VonoImpetBlocks.HADELITE_BUTTON,
                        Models.BUTTON.upload(
                                VonoImpetBlocks.HADELITE_BUTTON,
                                TextureMap.all(VonoImpetBlocks.HADELITE),
                                blockStateModelGenerator.modelCollector
                        ),
                        Models.BUTTON_PRESSED.upload(
                                VonoImpetBlocks.HADELITE_BUTTON,
                                TextureMap.all(VonoImpetBlocks.HADELITE),
                                blockStateModelGenerator.modelCollector
                        )
                )
        );
        Models.BUTTON_INVENTORY.upload(
                VonoImpetBlocks.HADELITE_BUTTON,
                TextureMap.all(VonoImpetBlocks.HADELITE),
                blockStateModelGenerator.modelCollector
        );
        blockStateModelGenerator.registerParentedItemModel(VonoImpetBlocks.HADELITE_BUTTON, ModelIds.getBlockSubModelId(VonoImpetBlocks.HADELITE_BUTTON, "_inventory"));

        blockStateModelGenerator.blockStateCollector.accept(
                BlockStateModelGenerator.createPressurePlateBlockState(
                        VonoImpetBlocks.HADELITE_PRESSURE_PLATE,
                        Models.PRESSURE_PLATE_UP.upload(
                                VonoImpetBlocks.HADELITE_PRESSURE_PLATE,
                                TextureMap.all(VonoImpetBlocks.HADELITE),
                                blockStateModelGenerator.modelCollector
                        ),
                        Models.PRESSURE_PLATE_DOWN.upload(
                                VonoImpetBlocks.HADELITE_PRESSURE_PLATE,
                                TextureMap.all(VonoImpetBlocks.HADELITE),
                                blockStateModelGenerator.modelCollector
                        )
                )
        );


        blockStateModelGenerator.registerCubeAllModelTexturePool(VonoImpetBlocks.POLISHED_HADELITE)
                .stairs(VonoImpetBlocks.POLISHED_HADELITE_STAIRS)
                .slab(VonoImpetBlocks.POLISHED_HADELITE_SLAB)
                .wall(VonoImpetBlocks.POLISHED_HADELITE_WALL);
        blockStateModelGenerator.registerCubeAllModelTexturePool(VonoImpetBlocks.HADELITE_TILES)
                .stairs(VonoImpetBlocks.HADELITE_TILE_STAIRS)
                .slab(VonoImpetBlocks.HADELITE_TILE_SLAB)
                .wall(VonoImpetBlocks.HADELITE_TILE_WALL);
        blockStateModelGenerator.registerSimpleCubeAll(VonoImpetBlocks.CRACKED_HADELITE_TILES);
        blockStateModelGenerator.registerCubeAllModelTexturePool(VonoImpetBlocks.HADELITE_BRICKS)
                .stairs(VonoImpetBlocks.HADELITE_BRICK_STAIRS)
                .slab(VonoImpetBlocks.HADELITE_BRICK_SLAB)
                .wall(VonoImpetBlocks.HADELITE_BRICK_WALL);
        blockStateModelGenerator.registerSimpleCubeAll(VonoImpetBlocks.CRACKED_HADELITE_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(VonoImpetBlocks.CHISELED_HADELITE_BRICKS);
        blockStateModelGenerator.registerAxisRotated(VonoImpetBlocks.HADELITE_PILLAR, TexturedModel.END_FOR_TOP_CUBE_COLUMN, TexturedModel.END_FOR_TOP_CUBE_COLUMN_HORIZONTAL);
        blockStateModelGenerator.registerSimpleCubeAll(VonoImpetBlocks.HADELITE_CORNER_PILLAR);
    }
}
