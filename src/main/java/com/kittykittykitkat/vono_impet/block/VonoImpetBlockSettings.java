package com.kittykittykitkat.vono_impet.block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.sound.BlockSoundGroup;

public class VonoImpetBlockSettings {
    // MIRAKELL

    public static final AbstractBlock.Settings MIRAKELL_LOG = FabricBlockSettings.copyOf(Blocks.OAK_LOG);
//            .mapColor((blockState -> {return blockState.get(PillarBlock.AXIS) == Direction.Axis.Y ? top : side).instrument();

    public static final AbstractBlock.Settings MIRAKELL_PLANKS = FabricBlockSettings.copyOf(Blocks.OAK_PLANKS);
//            .mapColor();

    public static final AbstractBlock.Settings MIRAKELL_LEAVES = FabricBlockSettings.copyOf(Blocks.OAK_LEAVES);
//            .mapColor();

    public static final AbstractBlock.Settings MIRAKELL_DOOR = FabricBlockSettings.copyOf(Blocks.OAK_DOOR);
//            .mapColor();

    public static final AbstractBlock.Settings MIRAKELL_TRAPDOOR = FabricBlockSettings.copyOf(Blocks.OAK_TRAPDOOR);
//            .mapColor();

    public static final AbstractBlock.Settings MIRAKELL_BUTTON = FabricBlockSettings.copyOf(Blocks.OAK_BUTTON);
//            .mapColor();

    public static final AbstractBlock.Settings MIRAKELL_PRESSURE_PLATE = FabricBlockSettings.copyOf(Blocks.OAK_PRESSURE_PLATE);
//            .mapColor()

    public static final AbstractBlock.Settings MIRAKELL_SAPLING = FabricBlockSettings.copyOf(Blocks.OAK_SAPLING);
//            .mapColor();

    public static final AbstractBlock.Settings POTTED_MIRAKELL_SAPLING = FabricBlockSettings.copyOf(Blocks.POTTED_OAK_SAPLING);
//            .mapColor();

    public static final AbstractBlock.Settings MIRAKELL_SIGN = FabricBlockSettings.copyOf(Blocks.OAK_SIGN);
//            .mapColor();

    public static final AbstractBlock.Settings MIRAKELL_WALL_SIGN = FabricBlockSettings.copyOf(Blocks.OAK_WALL_SIGN);
//            .mapColor();

    public static final AbstractBlock.Settings MIRAKELL_HANGING_SIGN = FabricBlockSettings.copyOf(Blocks.OAK_HANGING_SIGN);
//            .mapColor();

    public static final AbstractBlock.Settings MIRAKELL_WALL_HANGING_SIGN = FabricBlockSettings.copyOf(Blocks.OAK_WALL_HANGING_SIGN);
//            .mapColor();

    public static final AbstractBlock.Settings MIRAKELL_VINE = FabricBlockSettings.copyOf(Blocks.VINE);
//            .mapColor();

    public static final AbstractBlock.Settings MIRAKELL_BUSHY_VINES = AbstractBlock.Settings.create()
//            .mapColor()
            .ticksRandomly()
            .noCollision()
            .breakInstantly()
            .sounds(BlockSoundGroup.CAVE_VINES)
            .pistonBehavior(PistonBehavior.DESTROY);

    public static final AbstractBlock.Settings MIRAKELL_BUSHY_VINES_PLANT = AbstractBlock.Settings.create()
//            .mapColor()
            .ticksRandomly()
            .noCollision()
            .breakInstantly()
            .sounds(BlockSoundGroup.CAVE_VINES)
            .pistonBehavior(PistonBehavior.DESTROY);

    public static final AbstractBlock.Settings MIRAKELL_VINES = FabricBlockSettings.copyOf(Blocks.VINE);
//            .mapColor();

    // VARSTER

    public static final AbstractBlock.Settings VARSTER_LOG = FabricBlockSettings.copyOf(Blocks.SPRUCE_LOG);
//            .mapColor((blockState -> {return blockState.get(PillarBlock.AXIS) == Direction.Axis.Y ? top : side).instrument();

    public static final AbstractBlock.Settings VARSTER_PLANKS = FabricBlockSettings.copyOf(Blocks.SPRUCE_PLANKS);
//            .mapColor();

    public static final AbstractBlock.Settings VARSTER_LEAVES = FabricBlockSettings.copyOf(Blocks.SPRUCE_LEAVES);
//            .mapColor();

    public static final AbstractBlock.Settings VARSTER_DOOR = FabricBlockSettings.copyOf(Blocks.SPRUCE_DOOR);
//            .mapColor();

    public static final AbstractBlock.Settings VARSTER_TRAPDOOR = FabricBlockSettings.copyOf(Blocks.SPRUCE_TRAPDOOR);
//            .mapColor();

    public static final AbstractBlock.Settings VARSTER_BUTTON = FabricBlockSettings.copyOf(Blocks.SPRUCE_BUTTON);
//            .mapColor();

    public static final AbstractBlock.Settings VARSTER_PRESSURE_PLATE = FabricBlockSettings.copyOf(Blocks.SPRUCE_PRESSURE_PLATE);
//            .mapColor()

    public static final AbstractBlock.Settings VARSTER_SAPLING = FabricBlockSettings.copyOf(Blocks.SPRUCE_SAPLING);
//            .mapColor();

    public static final AbstractBlock.Settings POTTED_VARSTER_SAPLING = FabricBlockSettings.copyOf(Blocks.POTTED_SPRUCE_SAPLING);
//            .mapColor();

    public static final AbstractBlock.Settings VARSTER_SIGN = FabricBlockSettings.copyOf(Blocks.SPRUCE_SIGN);
//            .mapColor();

    public static final AbstractBlock.Settings VARSTER_WALL_SIGN = FabricBlockSettings.copyOf(Blocks.SPRUCE_WALL_SIGN);
//            .mapColor();

    public static final AbstractBlock.Settings VARSTER_HANGING_SIGN = FabricBlockSettings.copyOf(Blocks.SPRUCE_HANGING_SIGN);
//            .mapColor();

    public static final AbstractBlock.Settings VARSTER_WALL_HANGING_SIGN = FabricBlockSettings.copyOf(Blocks.SPRUCE_WALL_HANGING_SIGN);
//            .mapColor();
}
