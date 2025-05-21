package com.kittykittykitkat.vono_impet.block;

import net.minecraft.block.*;
import net.minecraft.block.enums.Instrument;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.math.Direction;

public class VonoImpetBlockSettings {
    public static final AbstractBlock.Settings MIRAKELL_LOG = AbstractBlock.Settings.create()
//            .mapColor((blockState -> {return blockState.get(PillarBlock.AXIS) == Direction.Axis.Y ? top : side).instrument();
            .instrument(Instrument.BASS)
            .strength(2.0F)
            .sounds(BlockSoundGroup.WOOD)
            .burnable();

    public static final AbstractBlock.Settings MIRAKELL_PLANKS = AbstractBlock.Settings.create()
//            .mapColor()
            .instrument(Instrument.BASS)
            .strength(2.0F, 3.0F)
            .sounds(BlockSoundGroup.WOOD)
            .burnable();

    public static final AbstractBlock.Settings MIRAKELL_LEAVES = AbstractBlock.Settings.create()
//            .mapColor()
            .strength(0.2F)
            .ticksRandomly()
            .sounds(BlockSoundGroup.GRASS)
            .nonOpaque()
            .allowsSpawning(Blocks::canSpawnOnLeaves)
            .suffocates(Blocks::never)
            .blockVision(Blocks::never)
            .burnable()
            .pistonBehavior(PistonBehavior.DESTROY)
            .solidBlock(Blocks::never);

    public static final AbstractBlock.Settings MIRAKELL_DOOR = AbstractBlock.Settings.create()
//            .mapColor()
            .instrument(Instrument.BASS)
            .strength(3.0F)
            .nonOpaque()
            .burnable()
            .pistonBehavior(PistonBehavior.DESTROY);

    public static final AbstractBlock.Settings MIRAKELL_TRAPDOOR = AbstractBlock.Settings.create()
//            .mapColor()
            .instrument(Instrument.BASS)
            .strength(3.0F)
            .nonOpaque()
            .burnable()
            .allowsSpawning(Blocks::never);

    public static final AbstractBlock.Settings MIRAKELL_BUTTON = AbstractBlock.Settings.create()
            .noCollision()
            .strength(0.5F)
            .pistonBehavior(PistonBehavior.DESTROY);

    public static final AbstractBlock.Settings MIRAKELL_PRESSURE_PLATE = AbstractBlock.Settings.create()
//            .mapColor()
            .solid()
            .instrument(Instrument.BASS)
            .nonOpaque()
            .strength(0.5F)
            .burnable()
            .pistonBehavior(PistonBehavior.DESTROY);

    public static final AbstractBlock.Settings MIRAKELL_SAPLING = AbstractBlock.Settings.create()
//            .mapColor()
            .noCollision()
            .ticksRandomly()
            .breakInstantly()
            .sounds(BlockSoundGroup.GRASS)
            .pistonBehavior(PistonBehavior.DESTROY);

    public static final AbstractBlock.Settings POTTED_MIRAKELL_SAPLING = AbstractBlock.Settings.create()
//            .mapColor()
            .breakInstantly()
            .nonOpaque()
            .pistonBehavior(PistonBehavior.DESTROY);

    public static final AbstractBlock.Settings MIRAKELL_SIGN = AbstractBlock.Settings.create()
//            .mapColor()
            .instrument(Instrument.BASS)
            .nonOpaque()
            .strength(1.0F)
            .burnable();

    public static final AbstractBlock.Settings MIRAKELL_WALL_SIGN = AbstractBlock.Settings.create()
//            .mapColor()
            .solid()
            .instrument(Instrument.BASS)
            .noCollision()
            .strength(1.0F)
            .burnable();

    public static final AbstractBlock.Settings MIRAKELL_HANGING_SIGN = AbstractBlock.Settings.create()
//            .mapColor()
            .solid()
            .instrument(Instrument.BASS)
            .noCollision()
            .strength(1.0F)
            .burnable();

    public static final AbstractBlock.Settings MIRAKELL_WALL_HANGING_SIGN = AbstractBlock.Settings.create()
            .solid()
            .instrument(Instrument.BASS)
            .noCollision()
            .strength(1.0F)
            .burnable();

}
