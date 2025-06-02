package com.kittykittykitkat.vono_impet.datagen;

import com.kittykittykitkat.vono_impet.block.CryniaBarsBlock;
import com.kittykittykitkat.vono_impet.block.VonoImpetBlocks;
import com.kittykittykitkat.vono_impet.item.VonoImpetItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.client.*;
import net.minecraft.state.property.Properties;
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
        generateCrynia(blockStateModelGenerator);
        generateSaiga(blockStateModelGenerator);

        blockStateModelGenerator.registerFlowerPotPlant(VonoImpetBlocks.KAYO, VonoImpetBlocks.POTTED_KAYO, BlockStateModelGenerator.TintType.NOT_TINTED);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(VonoImpetItems.MIRAKELL_BOAT, Models.GENERATED);
        itemModelGenerator.register(VonoImpetItems.MIRAKELL_CHEST_BOAT, Models.GENERATED);
        itemModelGenerator.register(VonoImpetBlocks.MIRAKELL_VINE.asItem(), Models.GENERATED);

        itemModelGenerator.register(VonoImpetItems.VARSTER_BOAT, Models.GENERATED);
        itemModelGenerator.register(VonoImpetItems.VARSTER_CHEST_BOAT, Models.GENERATED);

        itemModelGenerator.register(VonoImpetItems.MUSIC_DISC_PASET_E_IMPETIF_LENA, Models.TEMPLATE_MUSIC_DISC);
        itemModelGenerator.register(VonoImpetItems.MUSIC_DISC_ZERO, Models.TEMPLATE_MUSIC_DISC);

        itemModelGenerator.register(VonoImpetItems.POTENTIAL_SPARK, Models.GENERATED);
        itemModelGenerator.register(VonoImpetItems.MIRAKELL_SPARK, Models.GENERATED);
        itemModelGenerator.register(VonoImpetItems.VARSTER_ANVI, Models.GENERATED);
        itemModelGenerator.register(VonoImpetItems.PEACH, Models.GENERATED);

        itemModelGenerator.register(VonoImpetItems.ELUSIVE_REMNANT, Models.GENERATED);
        itemModelGenerator.register(VonoImpetItems.CRYNIA_NUGGET, Models.GENERATED);
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
        blockStateModelGenerator.registerOrientableTrapdoor(VonoImpetBlocks.VARSTER_TRAPDOOR);
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

        TextureMap chiseledHadeliteBricksMap = new TextureMap()
                .put(TextureKey.ALL, TextureMap.getId(VonoImpetBlocks.CHISELED_HADELITE_BRICKS));
        TextureMap litChiseledHadeliteBricksMap = new TextureMap()
                .put(TextureKey.ALL, TextureMap.getSubId(VonoImpetBlocks.CHISELED_HADELITE_BRICKS, "_lit"));

        blockStateModelGenerator.blockStateCollector.accept(
                VariantsBlockStateSupplier
                        .create(VonoImpetBlocks.CHISELED_HADELITE_BRICKS)
                        .coordinate(BlockStateVariantMap.create(Properties.LIT)
                                .register(
                                        false,
                                        BlockStateVariant.create().put(
                                                VariantSettings.MODEL,
                                                Models.CUBE_ALL.upload(
                                                        VonoImpetBlocks.CHISELED_HADELITE_BRICKS,
                                                        chiseledHadeliteBricksMap,
                                                        blockStateModelGenerator.modelCollector
                                                )
                                        )
                                )
                                .register(
                                        true,
                                        BlockStateVariant.create().put(
                                                VariantSettings.MODEL,
                                                Models.CUBE_ALL.upload(
                                                        VonoImpetBlocks.CHISELED_HADELITE_BRICKS,
                                                        "_lit",
                                                        litChiseledHadeliteBricksMap,
                                                        blockStateModelGenerator.modelCollector
                                                )
                                        )
                                )
                        )
        );
        blockStateModelGenerator.registerAxisRotated(VonoImpetBlocks.HADELITE_PILLAR, TexturedModel.END_FOR_TOP_CUBE_COLUMN, TexturedModel.END_FOR_TOP_CUBE_COLUMN_HORIZONTAL);
        blockStateModelGenerator.blockStateCollector.accept(
                BlockStateModelGenerator.createSingletonBlockState(
                        VonoImpetBlocks.HADELITE_CORNER_PILLAR,
                        Models.CUBE_ALL.upload(
                                VonoImpetBlocks.HADELITE_CORNER_PILLAR,
                                new TextureMap().put(TextureKey.ALL, TextureMap.getSubId(VonoImpetBlocks.HADELITE_PILLAR, "_top")),
                                blockStateModelGenerator.modelCollector
                        )
                )
        );
    }

    public void generateCrynia(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(VonoImpetBlocks.UNREFINED_CRYNIA);
        blockStateModelGenerator.registerSimpleCubeAll(VonoImpetBlocks.CRYNIA_BLOCK);
        blockStateModelGenerator.registerDoor(VonoImpetBlocks.CRYNIA_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(VonoImpetBlocks.CRYNIA_TRAPDOOR);

        Identifier cryniaBarsPostTopID = ModelIds.getBlockSubModelId(VonoImpetBlocks.CRYNIA_BARS, "_post_end_top");
        Identifier cryniaBarsPostBottomID = ModelIds.getBlockSubModelId(VonoImpetBlocks.CRYNIA_BARS, "_post_end_bottom");
        Identifier cryniaBarsPostID = ModelIds.getBlockSubModelId(VonoImpetBlocks.CRYNIA_BARS, "_post");
        Identifier cryniaBarsCapID = ModelIds.getBlockSubModelId(VonoImpetBlocks.CRYNIA_BARS, "_cap");
        Identifier cryniaBarsCapAltID = ModelIds.getBlockSubModelId(VonoImpetBlocks.CRYNIA_BARS, "_cap_alt");
        Identifier cryniaBarsSideID = ModelIds.getBlockSubModelId(VonoImpetBlocks.CRYNIA_BARS, "_side");
        Identifier cryniaBarsSideEndTopID = ModelIds.getBlockSubModelId(VonoImpetBlocks.CRYNIA_BARS, "_side_end_top");
        Identifier cryniaBarsSideEndBottomID = ModelIds.getBlockSubModelId(VonoImpetBlocks.CRYNIA_BARS, "_side_end_bottom");
        Identifier cryniaBarsSideAltID = ModelIds.getBlockSubModelId(VonoImpetBlocks.CRYNIA_BARS, "_side_alt");
        Identifier cryniaBarsSideAltEndTopID = ModelIds.getBlockSubModelId(VonoImpetBlocks.CRYNIA_BARS, "_side_alt_end_top");
        Identifier cryniaBarsSideAltEndBottomID = ModelIds.getBlockSubModelId(VonoImpetBlocks.CRYNIA_BARS, "_side_alt_end_bottom");
        blockStateModelGenerator.blockStateCollector.accept(
                MultipartBlockStateSupplier.create(VonoImpetBlocks.CRYNIA_BARS)
                        .with(
                                When.anyOf(
                                        When.create().set(CryniaBarsBlock.UP_DOWN_CONNECTION, CryniaBarsBlock.UpDownConnection.UP),
                                        When.create().set(CryniaBarsBlock.UP_DOWN_CONNECTION, CryniaBarsBlock.UpDownConnection.NONE)
                                ),
                                BlockStateVariant.create().put(VariantSettings.MODEL, cryniaBarsPostTopID)
                        )
                        .with(
                                When.anyOf(
                                        When.create().set(CryniaBarsBlock.UP_DOWN_CONNECTION, CryniaBarsBlock.UpDownConnection.DOWN),
                                        When.create().set(CryniaBarsBlock.UP_DOWN_CONNECTION, CryniaBarsBlock.UpDownConnection.NONE)
                                ),
                                BlockStateVariant.create().put(VariantSettings.MODEL, cryniaBarsPostBottomID)
                        )
                        .with(
                                When.create().set(Properties.NORTH, false).set(Properties.EAST, false).set(Properties.SOUTH, false).set(Properties.WEST, false),
                                BlockStateVariant.create().put(VariantSettings.MODEL, cryniaBarsPostID)
                        )
                        .with(
                                When.create().set(Properties.NORTH, true).set(Properties.EAST, false).set(Properties.SOUTH, false).set(Properties.WEST, false),
                                BlockStateVariant.create().put(VariantSettings.MODEL, cryniaBarsCapID)
                        )
                        .with(
                                When.create().set(Properties.NORTH, false).set(Properties.EAST, true).set(Properties.SOUTH, false).set(Properties.WEST, false),
                                BlockStateVariant.create().put(VariantSettings.MODEL, cryniaBarsCapID).put(VariantSettings.Y, VariantSettings.Rotation.R90)
                        )
                        .with(
                                When.create().set(Properties.NORTH, false).set(Properties.EAST, false).set(Properties.SOUTH, true).set(Properties.WEST, false),
                                BlockStateVariant.create().put(VariantSettings.MODEL, cryniaBarsCapAltID)
                        )
                        .with(
                                When.create().set(Properties.NORTH, false).set(Properties.EAST, false).set(Properties.SOUTH, false).set(Properties.WEST, true),
                                BlockStateVariant.create().put(VariantSettings.MODEL, cryniaBarsCapAltID).put(VariantSettings.Y, VariantSettings.Rotation.R90)
                        )
                        .with(
                                When.create().set(Properties.NORTH, true),
                                BlockStateVariant.create().put(VariantSettings.MODEL, cryniaBarsSideID)
                        )
                        .with(
                                When.anyOf(
                                        When.create().set(Properties.NORTH, true).set(CryniaBarsBlock.UP_DOWN_CONNECTION, CryniaBarsBlock.UpDownConnection.UP),
                                        When.create().set(Properties.NORTH, true).set(CryniaBarsBlock.UP_DOWN_CONNECTION, CryniaBarsBlock.UpDownConnection.NONE)
                                ),
                                BlockStateVariant.create().put(VariantSettings.MODEL, cryniaBarsSideEndTopID)
                        )
                        .with(
                                When.anyOf(
                                        When.create().set(Properties.NORTH, true).set(CryniaBarsBlock.UP_DOWN_CONNECTION, CryniaBarsBlock.UpDownConnection.DOWN),
                                        When.create().set(Properties.NORTH, true).set(CryniaBarsBlock.UP_DOWN_CONNECTION, CryniaBarsBlock.UpDownConnection.NONE)
                                ),
                                BlockStateVariant.create().put(VariantSettings.MODEL, cryniaBarsSideEndBottomID)
                        )
                        .with(
                                When.create().set(Properties.EAST, true),
                                BlockStateVariant.create().put(VariantSettings.MODEL, cryniaBarsSideID).put(VariantSettings.Y, VariantSettings.Rotation.R90)
                        )
                        .with(
                                When.anyOf(
                                        When.create().set(Properties.EAST, true).set(CryniaBarsBlock.UP_DOWN_CONNECTION, CryniaBarsBlock.UpDownConnection.UP),
                                        When.create().set(Properties.EAST, true).set(CryniaBarsBlock.UP_DOWN_CONNECTION, CryniaBarsBlock.UpDownConnection.NONE)
                                ),
                                BlockStateVariant.create().put(VariantSettings.MODEL, cryniaBarsSideEndTopID).put(VariantSettings.Y, VariantSettings.Rotation.R90)
                        )
                        .with(
                                When.anyOf(
                                        When.create().set(Properties.EAST, true).set(CryniaBarsBlock.UP_DOWN_CONNECTION, CryniaBarsBlock.UpDownConnection.DOWN),
                                        When.create().set(Properties.EAST, true).set(CryniaBarsBlock.UP_DOWN_CONNECTION, CryniaBarsBlock.UpDownConnection.NONE)
                                ),
                                BlockStateVariant.create().put(VariantSettings.MODEL, cryniaBarsSideEndBottomID).put(VariantSettings.Y, VariantSettings.Rotation.R90)
                        )
                        .with(
                                When.create().set(Properties.SOUTH, true),
                                BlockStateVariant.create().put(VariantSettings.MODEL, cryniaBarsSideAltID)
                        )
                        .with(
                                When.anyOf(
                                        When.create().set(Properties.SOUTH, true).set(CryniaBarsBlock.UP_DOWN_CONNECTION, CryniaBarsBlock.UpDownConnection.UP),
                                        When.create().set(Properties.SOUTH, true).set(CryniaBarsBlock.UP_DOWN_CONNECTION, CryniaBarsBlock.UpDownConnection.NONE)
                                ),
                                BlockStateVariant.create().put(VariantSettings.MODEL, cryniaBarsSideAltEndTopID)
                        )
                        .with(
                                When.anyOf(
                                        When.create().set(Properties.SOUTH, true).set(CryniaBarsBlock.UP_DOWN_CONNECTION, CryniaBarsBlock.UpDownConnection.DOWN),
                                        When.create().set(Properties.SOUTH, true).set(CryniaBarsBlock.UP_DOWN_CONNECTION, CryniaBarsBlock.UpDownConnection.NONE)
                                ),
                                BlockStateVariant.create().put(VariantSettings.MODEL, cryniaBarsSideAltEndBottomID)
                        )
                        .with(
                                When.create().set(Properties.WEST, true),
                                BlockStateVariant.create().put(VariantSettings.MODEL, cryniaBarsSideAltID).put(VariantSettings.Y, VariantSettings.Rotation.R90)
                        )
                        .with(
                                When.anyOf(
                                        When.create().set(Properties.WEST, true).set(CryniaBarsBlock.UP_DOWN_CONNECTION, CryniaBarsBlock.UpDownConnection.UP),
                                        When.create().set(Properties.WEST, true).set(CryniaBarsBlock.UP_DOWN_CONNECTION, CryniaBarsBlock.UpDownConnection.NONE)
                                ),
                                BlockStateVariant.create().put(VariantSettings.MODEL, cryniaBarsSideAltEndTopID).put(VariantSettings.Y, VariantSettings.Rotation.R90)
                        )
                        .with(
                                When.anyOf(
                                        When.create().set(Properties.WEST, true).set(CryniaBarsBlock.UP_DOWN_CONNECTION, CryniaBarsBlock.UpDownConnection.DOWN),
                                        When.create().set(Properties.WEST, true).set(CryniaBarsBlock.UP_DOWN_CONNECTION, CryniaBarsBlock.UpDownConnection.NONE)
                                ),
                                BlockStateVariant.create().put(VariantSettings.MODEL, cryniaBarsSideAltEndBottomID).put(VariantSettings.Y, VariantSettings.Rotation.R90)
                        )
        );
        blockStateModelGenerator.registerItemModel(VonoImpetBlocks.CRYNIA_BARS);
    }

    public void generateSaiga(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerGlassPane(VonoImpetBlocks.BLACK_SAIGA, VonoImpetBlocks.BLACK_SAIGA_PANE);
        blockStateModelGenerator.registerGlassPane(VonoImpetBlocks.BLUE_SAIGA, VonoImpetBlocks.BLUE_SAIGA_PANE);
        blockStateModelGenerator.registerGlassPane(VonoImpetBlocks.BROWN_SAIGA, VonoImpetBlocks.BROWN_SAIGA_PANE);
        blockStateModelGenerator.registerGlassPane(VonoImpetBlocks.CYAN_SAIGA, VonoImpetBlocks.CYAN_SAIGA_PANE);
        blockStateModelGenerator.registerGlassPane(VonoImpetBlocks.GRAY_SAIGA, VonoImpetBlocks.GRAY_SAIGA_PANE);
        blockStateModelGenerator.registerGlassPane(VonoImpetBlocks.GREEN_SAIGA, VonoImpetBlocks.GREEN_SAIGA_PANE);
        blockStateModelGenerator.registerGlassPane(VonoImpetBlocks.LIGHT_BLUE_SAIGA, VonoImpetBlocks.LIGHT_BLUE_SAIGA_PANE);
        blockStateModelGenerator.registerGlassPane(VonoImpetBlocks.LIGHT_GRAY_SAIGA, VonoImpetBlocks.LIGHT_GRAY_SAIGA_PANE);
        blockStateModelGenerator.registerGlassPane(VonoImpetBlocks.LIME_SAIGA, VonoImpetBlocks.LIME_SAIGA_PANE);
        blockStateModelGenerator.registerGlassPane(VonoImpetBlocks.MAGENTA_SAIGA, VonoImpetBlocks.MAGENTA_SAIGA_PANE);
        blockStateModelGenerator.registerGlassPane(VonoImpetBlocks.ORANGE_SAIGA, VonoImpetBlocks.ORANGE_SAIGA_PANE);
        blockStateModelGenerator.registerGlassPane(VonoImpetBlocks.PINK_SAIGA, VonoImpetBlocks.PINK_SAIGA_PANE);
        blockStateModelGenerator.registerGlassPane(VonoImpetBlocks.PURPLE_SAIGA, VonoImpetBlocks.PURPLE_SAIGA_PANE);
        blockStateModelGenerator.registerGlassPane(VonoImpetBlocks.RED_SAIGA, VonoImpetBlocks.RED_SAIGA_PANE);
        blockStateModelGenerator.registerGlassPane(VonoImpetBlocks.WHITE_SAIGA, VonoImpetBlocks.WHITE_SAIGA_PANE);
        blockStateModelGenerator.registerGlassPane(VonoImpetBlocks.YELLOW_SAIGA, VonoImpetBlocks.YELLOW_SAIGA_PANE);
    }
}
