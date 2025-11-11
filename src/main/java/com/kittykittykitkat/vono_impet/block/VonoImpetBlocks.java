package com.kittykittykitkat.vono_impet.block;

import com.kittykittykitkat.vono_impet.world.tree.MirakellSaplingGenerator;
import com.kittykittykitkat.vono_impet.world.tree.VarsterSaplingGenerator;
import com.terraformersmc.terraform.sign.block.TerraformHangingSignBlock;
import com.terraformersmc.terraform.sign.block.TerraformSignBlock;
import com.terraformersmc.terraform.sign.block.TerraformWallHangingSignBlock;
import com.terraformersmc.terraform.sign.block.TerraformWallSignBlock;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.type.BlockSetTypeBuilder;
import net.fabricmc.fabric.api.object.builder.v1.block.type.WoodTypeBuilder;
import net.minecraft.block.*;
import net.minecraft.data.family.BlockFamilies;
import net.minecraft.data.family.BlockFamily;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.BlockItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundEvents;
import net.minecraft.state.property.Properties;
import net.minecraft.util.DyeColor;
import net.minecraft.util.Identifier;

import static com.kittykittykitkat.vono_impet.VonoImpet.MOD_ID;

public class VonoImpetBlocks {
    // TODO: Map Colors for everything

    // MIRAKELL
    // <editor-fold>
    public static final BlockSetType MIRAKELL_WOOD_SET = BlockSetTypeBuilder.copyOf(BlockSetType.OAK).register(new Identifier(MOD_ID, "mirakell"));
    public static final WoodType MIRAKELL_WOOD_TYPE = WoodTypeBuilder.copyOf(WoodType.OAK).register(new Identifier(MOD_ID, "mirakell"), MIRAKELL_WOOD_SET);

    public static final Block MIRAKELL_LOG = registerBlock(
            "mirakell_log",
            new PillarBlock(
                    FabricBlockSettings.copyOf(Blocks.OAK_LOG)
            )
    );

    public static final Block MIRAKELL_WOOD = registerBlock(
            "mirakell_wood",
            new PillarBlock(
                    FabricBlockSettings.copyOf(Blocks.OAK_WOOD)
            )
    );

    public static final Block STRIPPED_MIRAKELL_LOG = registerBlock(
            "stripped_mirakell_log",
            new PillarBlock(
                    FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_LOG)
            )
    );

    public static final Block STRIPPED_MIRAKELL_WOOD = registerBlock(
            "stripped_mirakell_wood",
            new PillarBlock(
                    FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD)
            )
    );

    // TODO: Update bushy leaves texture
    public static final Block MIRAKELL_LEAVES = registerBlock(
            "mirakell_leaves",
            new MirakellLeavesBlock(
                    FabricBlockSettings.copyOf(Blocks.OAK_LEAVES)
            )
    );

    public static final Block MIRAKELL_PLANKS = registerBlock(
            "mirakell_planks",
            new Block(
                    FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)
            )
    );

    public static final Block MIRAKELL_SLAB = registerBlock(
            "mirakell_slab",
            new SlabBlock(
                    FabricBlockSettings.copyOf(Blocks.OAK_SLAB)
            )
    );

    public static final Block MIRAKELL_STAIRS = registerBlock(
            "mirakell_stairs",
            new StairsBlock(
                    MIRAKELL_PLANKS.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.OAK_STAIRS)
            )
    );

    public static final Block MIRAKELL_FENCE = registerBlock(
            "mirakell_fence",
            new FenceBlock(
                    FabricBlockSettings.copyOf(Blocks.OAK_FENCE)
            )
    );

    public static final Block MIRAKELL_FENCE_GATE = registerBlock(
            "mirakell_fence_gate",
            new FenceGateBlock(
                    FabricBlockSettings.copyOf(Blocks.OAK_FENCE_GATE),
                    MIRAKELL_WOOD_TYPE
            )
    );

    public static final Block MIRAKELL_DOOR = registerBlock(
            "mirakell_door",
            new DoorBlock(
                    FabricBlockSettings.copyOf(Blocks.OAK_DOOR),
                    MIRAKELL_WOOD_SET
            )
    );

    public static final Block MIRAKELL_TRAPDOOR = registerBlock(
            "mirakell_trapdoor",
            new TrapdoorBlock(
                    FabricBlockSettings.copyOf(Blocks.OAK_TRAPDOOR),
                    MIRAKELL_WOOD_SET
            )
    );

    public static final Block MIRAKELL_BUTTON = registerBlock(
            "mirakell_button",
            new ButtonBlock(
                    FabricBlockSettings.copyOf(Blocks.OAK_BUTTON),
                    MIRAKELL_WOOD_SET,
                    30,
                    true
            )
    );

    public static final Block MIRAKELL_PRESSURE_PLATE = registerBlock(
            "mirakell_pressure_plate",
            new PressurePlateBlock(
                    PressurePlateBlock.ActivationRule.EVERYTHING,
                    FabricBlockSettings.copyOf(Blocks.OAK_PRESSURE_PLATE),
                    MIRAKELL_WOOD_SET
            )
    );

    public static final Block MIRAKELL_SAPLING = registerBlock(
            "mirakell_sapling",
            new SaplingBlock(
                    new MirakellSaplingGenerator(),
                    FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)
            )
    );

    public static final Block POTTED_MIRAKELL_SAPLING = registerBlockNoItem(
            "potted_mirakell_sapling",
            new FlowerPotBlock(
                    MIRAKELL_SAPLING,
                    FabricBlockSettings.copyOf(Blocks.POTTED_OAK_SAPLING)
            )
    );

    public static final Block MIRAKELL_SIGN = registerBlockNoItem(
            "mirakell_sign",
            new TerraformSignBlock(
                    VonoImpetBlockTextureIdentifiers.MIRAKELL_SIGN_TEXTURE,
                    FabricBlockSettings.copyOf(Blocks.OAK_SIGN)
            )
    );

    public static final Block MIRAKELL_WALL_SIGN = registerBlockNoItem(
            "mirakell_wall_sign",
            new TerraformWallSignBlock(
                    VonoImpetBlockTextureIdentifiers.MIRAKELL_SIGN_TEXTURE,
                    FabricBlockSettings.copyOf(Blocks.OAK_WALL_SIGN)
                            .dropsLike(MIRAKELL_SIGN)
            )
    );

    public static final Block MIRAKELL_HANGING_SIGN = registerBlockNoItem(
            "mirakell_hanging_sign",
            new TerraformHangingSignBlock(
                    VonoImpetBlockTextureIdentifiers.MIRAKELL_HANGING_SIGN_TEXTURE,
                    VonoImpetBlockTextureIdentifiers.MIRAKELL_HANGING_SIGN_GUI_TEXTURE,
                    FabricBlockSettings.copyOf(Blocks.OAK_HANGING_SIGN)
            )
    );

    public static final Block MIRAKELL_WALL_HANGING_SIGN = registerBlockNoItem(
            "mirakell_wall_hanging_sign",
            new TerraformWallHangingSignBlock(
                    VonoImpetBlockTextureIdentifiers.MIRAKELL_HANGING_SIGN_TEXTURE,
                    VonoImpetBlockTextureIdentifiers.MIRAKELL_HANGING_SIGN_GUI_TEXTURE,
                    FabricBlockSettings.copyOf(Blocks.OAK_WALL_HANGING_SIGN)
                            .dropsLike(MIRAKELL_HANGING_SIGN)
            )
    );

    public static final Block MIRAKELL_VINE = registerBlock(
            "mirakell_vine",
            new VineBlock(
                    FabricBlockSettings.copyOf(Blocks.VINE)
            )
    );

    // TODO: Better bushy vines item texture?
    public static final Block MIRAKELL_BUSHY_VINES = registerBlock(
            "mirakell_bushy_vines",
            new MirakellBushyVinesHeadBlock(
                    FabricBlockSettings.copyOf(Blocks.CAVE_VINES)
                            .luminance(0)
            )
    );

    public static final Block MIRAKELL_BUSHY_VINES_PLANT = registerBlockNoItem(
            "mirakell_bushy_vines_plant",
            new MirakellBushyVinesBodyBlock(
                    FabricBlockSettings.copyOf(Blocks.CAVE_VINES_PLANT)
                            .luminance(0)
            )
    );

    public static final BlockFamily MIRAKELL_FAMILY = BlockFamilies.register(MIRAKELL_PLANKS)
            .sign(MIRAKELL_SIGN, MIRAKELL_WALL_SIGN)
            .group("wooden").unlockCriterionName("has_planks").build();

    // </editor-fold>

    // VARSTER
    // <editor-fold>
    public static final BlockSetType VARSTER_WOOD_SET = BlockSetTypeBuilder.copyOf(BlockSetType.OAK).register(new Identifier(MOD_ID, "varster"));
    public static final WoodType VARSTER_WOOD_TYPE = WoodTypeBuilder.copyOf(WoodType.OAK).register(new Identifier(MOD_ID, "varster"), VARSTER_WOOD_SET);

    public static final Block VARSTER_LOG = registerBlock(
            "varster_log",
            new PillarBlock(
                    FabricBlockSettings.copyOf(Blocks.SPRUCE_LOG)
            )
    );

    public static final Block VARSTER_WOOD = registerBlock(
            "varster_wood",
            new PillarBlock(
                    FabricBlockSettings.copyOf(Blocks.SPRUCE_WOOD)
            )
    );

    public static final Block STRIPPED_VARSTER_LOG = registerBlock(
            "stripped_varster_log",
            new PillarBlock(
                    FabricBlockSettings.copyOf(Blocks.STRIPPED_SPRUCE_LOG)
            )
    );

    public static final Block STRIPPED_VARSTER_WOOD = registerBlock(
            "stripped_varster_wood",
            new PillarBlock(
                    FabricBlockSettings.copyOf(Blocks.STRIPPED_SPRUCE_WOOD)
            )
    );

    // TODO: Bushy leaves model and texture
    public static final Block VARSTER_LEAVES = registerBlock(
            "varster_leaves",
            new LeavesBlock(
                    FabricBlockSettings.copyOf(Blocks.SPRUCE_LEAVES)
            )
    );

    public static final Block VARSTER_PLANKS = registerBlock(
            "varster_planks",
            new Block(
                    FabricBlockSettings.copyOf(Blocks.SPRUCE_PLANKS)
            )
    );

    public static final Block VARSTER_SLAB = registerBlock(
            "varster_slab",
            new SlabBlock(
                    FabricBlockSettings.copyOf(Blocks.SPRUCE_SLAB)
            )
    );

    public static final Block VARSTER_STAIRS = registerBlock(
            "varster_stairs",
            new StairsBlock(
                    VARSTER_PLANKS.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.SPRUCE_STAIRS)
            )
    );

    public static final Block VARSTER_FENCE = registerBlock(
            "varster_fence",
            new FenceBlock(
                    FabricBlockSettings.copyOf(Blocks.SPRUCE_FENCE)
            )
    );

    public static final Block VARSTER_FENCE_GATE = registerBlock(
            "varster_fence_gate",
            new FenceGateBlock(
                    FabricBlockSettings.copyOf(Blocks.SPRUCE_FENCE_GATE),
                    VARSTER_WOOD_TYPE
            )
    );

    public static final Block VARSTER_DOOR = registerBlock(
            "varster_door",
            new DoorBlock(
                    FabricBlockSettings.copyOf(Blocks.SPRUCE_DOOR),
                    VARSTER_WOOD_SET
            )
    );

    public static final Block VARSTER_TRAPDOOR = registerBlock(
            "varster_trapdoor",
            new TrapdoorBlock(
                    FabricBlockSettings.copyOf(Blocks.SPRUCE_TRAPDOOR),
                    VARSTER_WOOD_SET
            )
    );

    public static final Block VARSTER_BUTTON = registerBlock(
            "varster_button",
            new ButtonBlock(
                    FabricBlockSettings.copyOf(Blocks.SPRUCE_BUTTON),
                    VARSTER_WOOD_SET,
                    30,
                    true
            )
    );

    public static final Block VARSTER_PRESSURE_PLATE = registerBlock(
            "varster_pressure_plate",
            new PressurePlateBlock(
                    PressurePlateBlock.ActivationRule.EVERYTHING,
                    FabricBlockSettings.copyOf(Blocks.SPRUCE_PRESSURE_PLATE),
                    VARSTER_WOOD_SET
            )
    );

    public static final Block VARSTER_SAPLING = registerBlock(
            "varster_sapling",
            new SaplingBlock(
                    new VarsterSaplingGenerator(),
                    FabricBlockSettings.copyOf(Blocks.SPRUCE_SAPLING)
            )
    );

    public static final Block POTTED_VARSTER_SAPLING = registerBlockNoItem(
            "potted_varster_sapling",
            new FlowerPotBlock(VARSTER_SAPLING,
                    FabricBlockSettings.copyOf(Blocks.POTTED_SPRUCE_SAPLING)
            )
    );

    public static final Block VARSTER_SIGN = registerBlockNoItem(
            "varster_sign",
            new TerraformSignBlock(
                    VonoImpetBlockTextureIdentifiers.VARSTER_SIGN_TEXTURE,
                    FabricBlockSettings.copyOf(Blocks.SPRUCE_SIGN)
            )
    );

    public static final Block VARSTER_WALL_SIGN = registerBlockNoItem(
            "varster_wall_sign",
            new TerraformWallSignBlock(
                    VonoImpetBlockTextureIdentifiers.VARSTER_SIGN_TEXTURE,
                    FabricBlockSettings.copyOf(Blocks.SPRUCE_WALL_SIGN)
                            .dropsLike(VARSTER_SIGN)
            )
    );

    public static final Block VARSTER_HANGING_SIGN = registerBlockNoItem(
            "varster_hanging_sign",
            new TerraformHangingSignBlock(
                    VonoImpetBlockTextureIdentifiers.VARSTER_HANGING_SIGN_TEXTURE,
                    VonoImpetBlockTextureIdentifiers.VARSTER_HANGING_SIGN_GUI_TEXTURE,
                    FabricBlockSettings.copyOf(Blocks.SPRUCE_HANGING_SIGN)
            )
    );

    public static final Block VARSTER_WALL_HANGING_SIGN = registerBlockNoItem(
            "varster_wall_hanging_sign",
            new TerraformWallHangingSignBlock(
                    VonoImpetBlockTextureIdentifiers.VARSTER_HANGING_SIGN_TEXTURE,
                    VonoImpetBlockTextureIdentifiers.VARSTER_HANGING_SIGN_GUI_TEXTURE,
                    FabricBlockSettings.copyOf(Blocks.SPRUCE_WALL_HANGING_SIGN)
                            .dropsLike(VARSTER_HANGING_SIGN)
            )
    );

    public static final BlockFamily VARSTER_FAMILY = BlockFamilies.register(VARSTER_PLANKS)
            .sign(VARSTER_SIGN, VARSTER_WALL_SIGN)
            .group("wooden").unlockCriterionName("has_planks").build();
    // </editor-fold>

    // HADELITE
    // <editor-fold>
    public static final BlockSetType HADELITE_SET = BlockSetTypeBuilder.copyOf(BlockSetType.STONE).register(new Identifier(MOD_ID, "hadelite"));

    public static final Block HADELITE = registerBlock(
            "hadelite",
            new Block(
                    FabricBlockSettings.copyOf(Blocks.DEEPSLATE)
            )
    );

    public static final Block HADELITE_SLAB = registerBlock(
            "hadelite_slab",
            new SlabBlock(
                    FabricBlockSettings.copyOf(Blocks.DEEPSLATE)
            )
    );

    public static final Block HADELITE_STAIRS = registerBlock(
            "hadelite_stairs",
            new StairsBlock(
                    HADELITE.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.DEEPSLATE)
            )
    );

    public static final Block HADELITE_WALL = registerBlock(
            "hadelite_wall",
            new WallBlock(
                    FabricBlockSettings.copyOf(Blocks.DEEPSLATE)
                            .solid()
            )
    );

    public static final Block HADELITE_BUTTON = registerBlock(
            "hadelite_button",
            new ButtonBlock(
                    FabricBlockSettings.copyOf(Blocks.STONE_BUTTON),
                    HADELITE_SET,
                    20,
                    false
            )
    );

    public static final Block HADELITE_PRESSURE_PLATE = registerBlock(
            "hadelite_pressure_plate",
            new PressurePlateBlock(
                    PressurePlateBlock.ActivationRule.MOBS,
                    FabricBlockSettings.copyOf(Blocks.STONE_PRESSURE_PLATE),
                    HADELITE_SET
            )
    );

    public static final Block POLISHED_HADELITE = registerBlock(
            "polished_hadelite",
            new Block(
                    FabricBlockSettings.copyOf(Blocks.POLISHED_DEEPSLATE)
            )
    );

    public static final Block POLISHED_HADELITE_SLAB = registerBlock(
            "polished_hadelite_slab",
            new SlabBlock(
                    FabricBlockSettings.copyOf(Blocks.POLISHED_DEEPSLATE_SLAB)
            )
    );

    public static final Block POLISHED_HADELITE_STAIRS = registerBlock(
            "polished_hadelite_stairs",
            new StairsBlock(
                    POLISHED_HADELITE.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.POLISHED_DEEPSLATE_STAIRS)
            )
    );

    public static final Block POLISHED_HADELITE_WALL = registerBlock(
            "polished_hadelite_wall",
            new WallBlock(
                    FabricBlockSettings.copyOf(Blocks.POLISHED_DEEPSLATE_WALL)
            )
    );

    public static final Block HADELITE_TILES = registerBlock(
            "hadelite_tiles",
            new Block(
                    FabricBlockSettings.copyOf(Blocks.DEEPSLATE_TILES)
            )
    );

    public static final Block HADELITE_TILE_SLAB = registerBlock(
            "hadelite_tile_slab",
            new SlabBlock(
                    FabricBlockSettings.copyOf(Blocks.DEEPSLATE_TILE_SLAB)
            )
    );

    public static final Block HADELITE_TILE_STAIRS = registerBlock(
            "hadelite_tile_stairs",
            new StairsBlock(
                    HADELITE_TILES.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.DEEPSLATE_TILE_STAIRS)
            )
    );

    public static final Block HADELITE_TILE_WALL = registerBlock(
            "hadelite_tile_wall",
            new WallBlock(
                    FabricBlockSettings.copyOf(Blocks.DEEPSLATE_TILE_WALL)
            )
    );

    public static final Block CRACKED_HADELITE_TILES = registerBlock(
            "cracked_hadelite_tiles",
            new Block(
                    FabricBlockSettings.copyOf(Blocks.CRACKED_DEEPSLATE_TILES)
            )
    );

    public static final Block HADELITE_BRICKS = registerBlock(
            "hadelite_bricks",
            new Block(
                    FabricBlockSettings.copyOf(Blocks.DEEPSLATE_BRICKS)
            )
    );

    public static final Block HADELITE_BRICK_SLAB = registerBlock(
            "hadelite_brick_slab",
            new SlabBlock(
                    FabricBlockSettings.copyOf(Blocks.DEEPSLATE_BRICK_SLAB)
            )
    );

    public static final Block HADELITE_BRICK_STAIRS = registerBlock(
            "hadelite_brick_stairs",
            new StairsBlock(
                    HADELITE_BRICKS.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.DEEPSLATE_BRICK_STAIRS)
            )
    );

    public static final Block HADELITE_BRICK_WALL = registerBlock(
            "hadelite_brick_wall",
            new WallBlock(
                    FabricBlockSettings.copyOf(Blocks.DEEPSLATE_BRICK_WALL)
            )
    );

    public static final Block CRACKED_HADELITE_BRICKS = registerBlock(
            "cracked_hadelite_bricks",
            new Block(
                    FabricBlockSettings.copyOf(Blocks.CRACKED_DEEPSLATE_BRICKS)
            )
    );

    public static final Block CHISELED_HADELITE_BRICKS = registerBlock(
            "chiseled_hadelite_bricks",
            new ChiseledHadeliteBlock(
                    FabricBlockSettings.copyOf(Blocks.CRACKED_DEEPSLATE_BRICKS)
                            .luminance(blockState -> blockState.get(Properties.LIT) ? 8 : 0)
            )
    );

    public static final Block HADELITE_PILLAR = registerBlock(
            "hadelite_pillar",
            new PillarBlock(
                    FabricBlockSettings.copyOf(Blocks.CHISELED_DEEPSLATE)
            )
    );

    public static final Block HADELITE_CORNER_PILLAR = registerBlock(
            "hadelite_corner_pillar",
            new Block(
                    FabricBlockSettings.copyOf(Blocks.CHISELED_DEEPSLATE)
            )
    );

    // </editor-fold>

    // CRYNIA
    // <editor-fold>
    public static final BlockSetType CRYNIA_SET_TYPE = BlockSetTypeBuilder.copyOf(BlockSetType.IRON)
            .soundGroup(BlockSoundGroup.NETHERITE)
            .build(new Identifier(MOD_ID, "crynia"));

    public static final Block UNREFINED_CRYNIA = registerBlock(
            "unrefined_crynia",
            new Block(
                    FabricBlockSettings.copyOf(Blocks.ANCIENT_DEBRIS)
            )
    );

    public static final Block CRYNIA_BLOCK = registerBlock(
            "crynia_block",
            new Block(
                    FabricBlockSettings.copyOf(Blocks.NETHERITE_BLOCK)
            )
    );

    public static final Block CRYNIA_BARS = registerBlock(
            "crynia_bars",
            new CryniaBarsBlock(
                    FabricBlockSettings.copyOf(Blocks.IRON_BARS)
            )
    );

    public static final Block CRYNIA_DOOR = registerBlock(
            "crynia_door",
            new DoorBlock(
                    FabricBlockSettings.copyOf(Blocks.IRON_DOOR),
                    CRYNIA_SET_TYPE
            )
    );

    public static final Block CRYNIA_TRAPDOOR = registerBlock(
            "crynia_trapdoor",
            new TrapdoorBlock(
                    FabricBlockSettings.copyOf(Blocks.IRON_TRAPDOOR),
                    CRYNIA_SET_TYPE
            )
    );

    // </editor-fold>

    // SAIGA
    // <editor-fold>
    public static final Block BLACK_SAIGA = registerBlock(
            "black_saiga",
            new SaigaBlock(
                    DyeColor.BLACK,
                    FabricBlockSettings.copyOf(Blocks.BLACK_STAINED_GLASS)
            )
    );

    public static final Block BLUE_SAIGA = registerBlock(
            "blue_saiga",
            new SaigaBlock(
                    DyeColor.BLUE,
                    FabricBlockSettings.copyOf(Blocks.BLUE_STAINED_GLASS)
            )
    );

    public static final Block BROWN_SAIGA = registerBlock(
            "brown_saiga",
            new SaigaBlock(
                    DyeColor.BROWN,
                    FabricBlockSettings.copyOf(Blocks.BROWN_STAINED_GLASS)
            )
    );

    public static final Block CYAN_SAIGA = registerBlock(
            "cyan_saiga",
            new SaigaBlock(
                    DyeColor.CYAN,
                    FabricBlockSettings.copyOf(Blocks.CYAN_STAINED_GLASS)
            )
    );

    public static final Block GRAY_SAIGA = registerBlock(
            "gray_saiga",
            new SaigaBlock(
                    DyeColor.GRAY,
                    FabricBlockSettings.copyOf(Blocks.GRAY_STAINED_GLASS)
            )
    );

    public static final Block GREEN_SAIGA = registerBlock(
            "green_saiga",
            new SaigaBlock(
                    DyeColor.GREEN,
                    FabricBlockSettings.copyOf(Blocks.GREEN_STAINED_GLASS)
            )
    );

    public static final Block LIGHT_BLUE_SAIGA = registerBlock(
            "light_blue_saiga",
            new SaigaBlock(
                    DyeColor.LIGHT_BLUE,
                    FabricBlockSettings.copyOf(Blocks.LIGHT_BLUE_STAINED_GLASS)
            )
    );

    public static final Block LIGHT_GRAY_SAIGA = registerBlock(
            "light_gray_saiga",
            new SaigaBlock(
                    DyeColor.LIGHT_GRAY,
                    FabricBlockSettings.copyOf(Blocks.LIGHT_GRAY_STAINED_GLASS)
            )
    );

    public static final Block LIME_SAIGA = registerBlock(
            "lime_saiga",
            new SaigaBlock(
                    DyeColor.LIME,
                    FabricBlockSettings.copyOf(Blocks.LIME_STAINED_GLASS)
            )
    );

    public static final Block MAGENTA_SAIGA = registerBlock(
            "magenta_saiga",
            new SaigaBlock(
                    DyeColor.MAGENTA,
                    FabricBlockSettings.copyOf(Blocks.MAGENTA_STAINED_GLASS)
            )
    );

    public static final Block ORANGE_SAIGA = registerBlock(
            "orange_saiga",
            new SaigaBlock(
                    DyeColor.ORANGE,
                    FabricBlockSettings.copyOf(Blocks.ORANGE_STAINED_GLASS)
            )
    );

    public static final Block PINK_SAIGA = registerBlock(
            "pink_saiga",
            new SaigaBlock(
                    DyeColor.PINK,
                    FabricBlockSettings.copyOf(Blocks.PINK_STAINED_GLASS)
            )
    );

    public static final Block PURPLE_SAIGA = registerBlock(
            "purple_saiga",
            new SaigaBlock(
                    DyeColor.PURPLE,
                    FabricBlockSettings.copyOf(Blocks.PURPLE_STAINED_GLASS)
            )
    );


    public static final Block RED_SAIGA = registerBlock(
            "red_saiga",
            new SaigaBlock(
                    DyeColor.RED,
                    FabricBlockSettings.copyOf(Blocks.RED_STAINED_GLASS)
            )
    );

    public static final Block WHITE_SAIGA = registerBlock(
            "white_saiga",
            new SaigaBlock(
                    DyeColor.WHITE,
                    FabricBlockSettings.copyOf(Blocks.WHITE_STAINED_GLASS)
            )
    );

    public static final Block YELLOW_SAIGA = registerBlock(
            "yellow_saiga",
            new SaigaBlock(
                    DyeColor.YELLOW,
                    FabricBlockSettings.copyOf(Blocks.YELLOW_STAINED_GLASS)
            )
    );

    public static final Block BLACK_SAIGA_PANE = registerBlock(
            "black_saiga_pane",
            new SaigaPaneBlock(
                    DyeColor.BLACK,
                    FabricBlockSettings.copyOf(Blocks.BLACK_STAINED_GLASS_PANE)
            )
    );

    public static final Block BLUE_SAIGA_PANE = registerBlock(
            "blue_saiga_pane",
            new SaigaPaneBlock(
                    DyeColor.BLUE,
                    FabricBlockSettings.copyOf(Blocks.BLUE_STAINED_GLASS_PANE)
            )
    );

    public static final Block BROWN_SAIGA_PANE = registerBlock(
            "brown_saiga_pane",
            new SaigaPaneBlock(
                    DyeColor.BROWN,
                    FabricBlockSettings.copyOf(Blocks.BROWN_STAINED_GLASS_PANE)
            )
    );

    public static final Block CYAN_SAIGA_PANE = registerBlock(
            "cyan_saiga_pane",
            new SaigaPaneBlock(
                    DyeColor.CYAN,
                    FabricBlockSettings.copyOf(Blocks.CYAN_STAINED_GLASS_PANE)
            )
    );

    public static final Block GRAY_SAIGA_PANE = registerBlock(
            "gray_saiga_pane",
            new SaigaPaneBlock(
                    DyeColor.GRAY,
                    FabricBlockSettings.copyOf(Blocks.GRAY_STAINED_GLASS_PANE)
            )
    );

    public static final Block GREEN_SAIGA_PANE = registerBlock(
            "green_saiga_pane",
            new SaigaPaneBlock(
                    DyeColor.GREEN,
                    FabricBlockSettings.copyOf(Blocks.GREEN_STAINED_GLASS_PANE)
            )
    );

    public static final Block LIGHT_BLUE_SAIGA_PANE = registerBlock(
            "light_blue_saiga_pane",
            new SaigaPaneBlock(
                    DyeColor.LIGHT_BLUE,
                    FabricBlockSettings.copyOf(Blocks.LIGHT_BLUE_STAINED_GLASS_PANE)
            )
    );

    public static final Block LIGHT_GRAY_SAIGA_PANE = registerBlock(
            "light_gray_saiga_pane",
            new SaigaPaneBlock(
                    DyeColor.LIGHT_GRAY,
                    FabricBlockSettings.copyOf(Blocks.LIGHT_GRAY_STAINED_GLASS_PANE)
            )
    );

    public static final Block LIME_SAIGA_PANE = registerBlock(
            "lime_saiga_pane",
            new SaigaPaneBlock(
                    DyeColor.LIME,
                    FabricBlockSettings.copyOf(Blocks.LIME_STAINED_GLASS_PANE)
            )
    );

    public static final Block MAGENTA_SAIGA_PANE = registerBlock(
            "magenta_saiga_pane",
            new SaigaPaneBlock(
                    DyeColor.MAGENTA,
                    FabricBlockSettings.copyOf(Blocks.MAGENTA_STAINED_GLASS_PANE)
            )
    );

    public static final Block ORANGE_SAIGA_PANE = registerBlock(
            "orange_saiga_pane",
            new SaigaPaneBlock(
                    DyeColor.ORANGE,
                    FabricBlockSettings.copyOf(Blocks.ORANGE_STAINED_GLASS_PANE)
            )
    );

    public static final Block PINK_SAIGA_PANE = registerBlock(
            "pink_saiga_pane",
            new SaigaPaneBlock(
                    DyeColor.PINK,
                    FabricBlockSettings.copyOf(Blocks.PINK_STAINED_GLASS_PANE)
            )
    );

    public static final Block PURPLE_SAIGA_PANE = registerBlock(
            "purple_saiga_pane",
            new SaigaPaneBlock(
                    DyeColor.PURPLE,
                    FabricBlockSettings.copyOf(Blocks.PURPLE_STAINED_GLASS_PANE)
            )
    );


    public static final Block RED_SAIGA_PANE = registerBlock(
            "red_saiga_pane",
            new SaigaPaneBlock(
                    DyeColor.RED,
                    FabricBlockSettings.copyOf(Blocks.RED_STAINED_GLASS_PANE)
            )
    );

    public static final Block WHITE_SAIGA_PANE = registerBlock(
            "white_saiga_pane",
            new SaigaPaneBlock(
                    DyeColor.WHITE,
                    FabricBlockSettings.copyOf(Blocks.WHITE_STAINED_GLASS_PANE)
            )
    );

    public static final Block YELLOW_SAIGA_PANE = registerBlock(
            "yellow_saiga_pane",
            new SaigaPaneBlock(
                    DyeColor.YELLOW,
                    FabricBlockSettings.copyOf(Blocks.YELLOW_STAINED_GLASS_PANE)
            )
    );

    // </editor-fold>


    public static final Block VOID_PORTAL = registerBlock(
            "void_portal",
            new VoidPortalBlock(FabricBlockSettings.copyOf(Blocks.END_PORTAL))
    );

    // TODO: Custom status effect and duration
    public static final Block KAYO = registerBlock(
            "kayo",
            new FlowerBlock(
                    StatusEffects.LEVITATION,
                    12,
                    FabricBlockSettings.copyOf(Blocks.POPPY)
            )
    );

    public static final Block POTTED_KAYO = registerBlock(
            "potted_kayo",
            new FlowerPotBlock(
                    KAYO,
                    FabricBlockSettings.copyOf(Blocks.POTTED_POPPY)
            )
    );

    public static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, new Identifier(MOD_ID, name), new BlockItem(block, new FabricItemSettings()));
    }

    public static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(MOD_ID, name), block);
    }

    public static Block registerBlockNoItem(String name, Block block) {
        return Registry.register(Registries.BLOCK, new Identifier(MOD_ID, name), block);
    }

    public static void registerBlocks() {
    }
}
