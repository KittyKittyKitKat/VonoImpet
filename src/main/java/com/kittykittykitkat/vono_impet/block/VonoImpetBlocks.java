package com.kittykittykitkat.vono_impet.block;

import com.kittykittykitkat.vono_impet.block.entity.VonoImpetHangingSignBlockEntity;
import com.kittykittykitkat.vono_impet.block.entity.VonoImpetSignBlockEntity;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.type.BlockSetTypeBuilder;
import net.fabricmc.fabric.api.object.builder.v1.block.type.WoodTypeBuilder;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;

import static com.kittykittykitkat.vono_impet.VonoImpet.MOD_ID;

public class VonoImpetBlocks {
    public static final BlockSetType MIRAKELL_WOOD_SET = BlockSetTypeBuilder.copyOf(BlockSetType.OAK).register(new Identifier(MOD_ID, "mirakell"));
    public static final WoodType MIRAKELL_WOOD_TYPE = WoodTypeBuilder.copyOf(WoodType.OAK).register(new Identifier(MOD_ID, "mirakell"), MIRAKELL_WOOD_SET);

    public static final Block MIRAKELL_LOG = registerBlock("mirakell_log", new PillarBlock(VonoImpetBlockSettings.MIRAKELL_LOG));
    public static final Block MIRAKELL_WOOD = registerBlock("mirakell_wood", new PillarBlock(VonoImpetBlockSettings.MIRAKELL_LOG));
    public static final Block STRIPPED_MIRAKELL_LOG = registerBlock("stripped_mirakell_log", new PillarBlock(VonoImpetBlockSettings.MIRAKELL_LOG));
    public static final Block STRIPPED_MIRAKELL_WOOD = registerBlock("stripped_mirakell_wood", new PillarBlock(VonoImpetBlockSettings.MIRAKELL_LOG));
    public static final Block MIRAKELL_LEAVES = registerBlock("mirakell_leaves", new LeavesBlock(VonoImpetBlockSettings.MIRAKELL_LEAVES));
    public static final Block MIRAKELL_PLANKS = registerBlock("mirakell_planks", new Block(VonoImpetBlockSettings.MIRAKELL_PLANKS));
    public static final Block MIRAKELL_SLAB = registerBlock("mirakell_slab", new SlabBlock(VonoImpetBlockSettings.MIRAKELL_PLANKS));
    public static final Block MIRAKELL_STAIRS = registerBlock("mirakell_stairs", new StairsBlock(MIRAKELL_PLANKS.getDefaultState(), VonoImpetBlockSettings.MIRAKELL_PLANKS));
    public static final Block MIRAKELL_FENCE = registerBlock("mirakell_fence", new FenceBlock(VonoImpetBlockSettings.MIRAKELL_PLANKS));
    public static final Block MIRAKELL_FENCE_GATE = registerBlock("mirakell_fence_gate", new FenceGateBlock(VonoImpetBlockSettings.MIRAKELL_PLANKS, MIRAKELL_WOOD_TYPE));
    public static final Block MIRAKELL_DOOR = registerBlock("mirakell_door", new DoorBlock(VonoImpetBlockSettings.MIRAKELL_DOOR, MIRAKELL_WOOD_SET));
    public static final Block MIRAKELL_TRAPDOOR = registerBlock("mirakell_trapdoor", new TrapdoorBlock(VonoImpetBlockSettings.MIRAKELL_TRAPDOOR, MIRAKELL_WOOD_SET));
    public static final Block MIRAKELL_BUTTON = registerBlock("mirakell_button", new ButtonBlock(VonoImpetBlockSettings.MIRAKELL_BUTTON, MIRAKELL_WOOD_SET, 30, true));
    public static final Block MIRAKELL_PRESSURE_PLATE = registerBlock("mirakell_pressure_plate", new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, VonoImpetBlockSettings.MIRAKELL_PRESSURE_PLATE, MIRAKELL_WOOD_SET));
//    public static final Block MIRAKELL_SAPLING = registerBlock("mirakell_sapling", new SaplingBlock(VonoImpetBlockSettings.MIRAKELL_SAPLING));
//    public static final Block POTTED_MIRAKELL_SAPLING = registerBlockNoItem("potted_mirakell_sapling", new FlowerPotBlock(MIRAKELL_SAPLING, VonoImpetBlockSettings.POTTED_MIRAKELL_SAPLING));

    public static final Block MIRAKELL_SIGN = registerBlockNoItem("mirakell_sign", new SignBlock(VonoImpetBlockSettings.MIRAKELL_SIGN, MIRAKELL_WOOD_TYPE) {
        @Override
        public VonoImpetSignBlockEntity createBlockEntity(BlockPos pos, BlockState state) {
            return new VonoImpetSignBlockEntity(pos, state);
        }
    });
    public static final Block MIRAKELL_WALL_SIGN = registerBlockNoItem("mirakell_wall_sign", new WallSignBlock(VonoImpetBlockSettings.MIRAKELL_WALL_SIGN.dropsLike(MIRAKELL_SIGN), MIRAKELL_WOOD_TYPE) {
        @Override
        public VonoImpetSignBlockEntity createBlockEntity(BlockPos pos, BlockState state) {
            return new VonoImpetSignBlockEntity(pos, state);
        }
    });
    public static final Block MIRAKELL_HANGING_SIGN = registerBlockNoItem("mirakell_hanging_sign", new HangingSignBlock(VonoImpetBlockSettings.MIRAKELL_HANGING_SIGN, MIRAKELL_WOOD_TYPE) {
        @Override
        public VonoImpetHangingSignBlockEntity createBlockEntity(BlockPos pos, BlockState state) {
            return new VonoImpetHangingSignBlockEntity(pos, state);
        }
    });
    public static final Block MIRAKELL_WALL_HANGING_SIGN = registerBlockNoItem("mirakell_wall_hanging_sign", new WallHangingSignBlock(VonoImpetBlockSettings.MIRAKELL_WALL_HANGING_SIGN.dropsLike(MIRAKELL_HANGING_SIGN), MIRAKELL_WOOD_TYPE) {
        @Override
        public VonoImpetHangingSignBlockEntity createBlockEntity(BlockPos pos, BlockState state) {
            return new VonoImpetHangingSignBlockEntity(pos, state);
        }
    });




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
