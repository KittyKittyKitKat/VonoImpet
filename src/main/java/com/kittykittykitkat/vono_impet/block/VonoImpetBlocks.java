package com.kittykittykitkat.vono_impet.block;

import com.kittykittykitkat.vono_impet.world.tree.MirakellSaplingGenerator;
import com.kittykittykitkat.vono_impet.world.tree.VarsterSaplingGenerator;
import com.terraformersmc.terraform.sign.block.TerraformHangingSignBlock;
import com.terraformersmc.terraform.sign.block.TerraformSignBlock;
import com.terraformersmc.terraform.sign.block.TerraformWallHangingSignBlock;
import com.terraformersmc.terraform.sign.block.TerraformWallSignBlock;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.type.BlockSetTypeBuilder;
import net.fabricmc.fabric.api.object.builder.v1.block.type.WoodTypeBuilder;
import net.minecraft.block.*;
import net.minecraft.data.family.BlockFamilies;
import net.minecraft.data.family.BlockFamily;
import net.minecraft.item.BlockItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

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
    public static final Block MIRAKELL_SAPLING = registerBlock("mirakell_sapling", new SaplingBlock(new MirakellSaplingGenerator(), VonoImpetBlockSettings.MIRAKELL_SAPLING));
    public static final Block POTTED_MIRAKELL_SAPLING = registerBlockNoItem("potted_mirakell_sapling", new FlowerPotBlock(MIRAKELL_SAPLING, VonoImpetBlockSettings.POTTED_MIRAKELL_SAPLING));
    public static final Block MIRAKELL_SIGN = registerBlockNoItem("mirakell_sign", new TerraformSignBlock(VonoImpetBlockTextureIdentifiers.MIRAKELL_SIGN_TEXTURE, VonoImpetBlockSettings.MIRAKELL_SIGN));
    public static final Block MIRAKELL_WALL_SIGN = registerBlockNoItem("mirakell_wall_sign", new TerraformWallSignBlock(VonoImpetBlockTextureIdentifiers.MIRAKELL_SIGN_TEXTURE, VonoImpetBlockSettings.MIRAKELL_WALL_SIGN.dropsLike(MIRAKELL_SIGN)));
    public static final Block MIRAKELL_HANGING_SIGN = registerBlockNoItem("mirakell_hanging_sign", new TerraformHangingSignBlock(VonoImpetBlockTextureIdentifiers.MIRAKELL_HANGING_SIGN_TEXTURE, VonoImpetBlockTextureIdentifiers.MIRAKELL_HANGING_SIGN_GUI_TEXTURE, VonoImpetBlockSettings.MIRAKELL_HANGING_SIGN));
    public static final Block MIRAKELL_WALL_HANGING_SIGN = registerBlockNoItem("mirakell_wall_hanging_sign", new TerraformWallHangingSignBlock(VonoImpetBlockTextureIdentifiers.MIRAKELL_HANGING_SIGN_TEXTURE, VonoImpetBlockTextureIdentifiers.MIRAKELL_HANGING_SIGN_GUI_TEXTURE, VonoImpetBlockSettings.MIRAKELL_WALL_HANGING_SIGN.dropsLike(MIRAKELL_HANGING_SIGN)));
    public static final Block MIRAKELL_VINE = registerBlock("mirakell_vine", new VineBlock(VonoImpetBlockSettings.MIRAKELL_VINE));
    // TODO: Better bushy vines item texture?
    public static final Block MIRAKELL_BUSHY_VINES = registerBlock("mirakell_bushy_vines", new MirakellBushyVinesHeadBlock(VonoImpetBlockSettings.MIRAKELL_BUSHY_VINES));
    public static final Block MIRAKELL_BUSHY_VINES_PLANT = registerBlockNoItem("mirakell_bushy_vines_plant", new MirakellBushyVinesBodyBlock(VonoImpetBlockSettings.MIRAKELL_BUSHY_VINES_PLANT));
    public static final BlockFamily MIRAKELL_FAMILY = BlockFamilies.register(MIRAKELL_PLANKS)
            .sign(MIRAKELL_SIGN, MIRAKELL_WALL_SIGN)
            .group("wooden").unlockCriterionName("has_planks").build();

    public static final BlockSetType VARSTER_WOOD_SET = BlockSetTypeBuilder.copyOf(BlockSetType.OAK).register(new Identifier(MOD_ID, "varster"));
    public static final WoodType VARSTER_WOOD_TYPE = WoodTypeBuilder.copyOf(WoodType.OAK).register(new Identifier(MOD_ID, "varster"), VARSTER_WOOD_SET);

    public static final Block VARSTER_LOG = registerBlock("varster_log", new PillarBlock(VonoImpetBlockSettings.VARSTER_LOG));
    public static final Block VARSTER_WOOD = registerBlock("varster_wood", new PillarBlock(VonoImpetBlockSettings.VARSTER_LOG));
    public static final Block STRIPPED_VARSTER_LOG = registerBlock("stripped_varster_log", new PillarBlock(VonoImpetBlockSettings.VARSTER_LOG));
    public static final Block STRIPPED_VARSTER_WOOD = registerBlock("stripped_varster_wood", new PillarBlock(VonoImpetBlockSettings.VARSTER_LOG));
    public static final Block VARSTER_LEAVES = registerBlock("varster_leaves", new LeavesBlock(VonoImpetBlockSettings.VARSTER_LEAVES));
    public static final Block VARSTER_PLANKS = registerBlock("varster_planks", new Block(VonoImpetBlockSettings.VARSTER_PLANKS));
    public static final Block VARSTER_SLAB = registerBlock("varster_slab", new SlabBlock(VonoImpetBlockSettings.VARSTER_PLANKS));
    public static final Block VARSTER_STAIRS = registerBlock("varster_stairs", new StairsBlock(VARSTER_PLANKS.getDefaultState(), VonoImpetBlockSettings.VARSTER_PLANKS));
    public static final Block VARSTER_FENCE = registerBlock("varster_fence", new FenceBlock(VonoImpetBlockSettings.VARSTER_PLANKS));
    public static final Block VARSTER_FENCE_GATE = registerBlock("varster_fence_gate", new FenceGateBlock(VonoImpetBlockSettings.VARSTER_PLANKS, VARSTER_WOOD_TYPE));
    public static final Block VARSTER_DOOR = registerBlock("varster_door", new DoorBlock(VonoImpetBlockSettings.VARSTER_DOOR, VARSTER_WOOD_SET));
    public static final Block VARSTER_TRAPDOOR = registerBlock("varster_trapdoor", new TrapdoorBlock(VonoImpetBlockSettings.VARSTER_TRAPDOOR, VARSTER_WOOD_SET));
    public static final Block VARSTER_BUTTON = registerBlock("varster_button", new ButtonBlock(VonoImpetBlockSettings.VARSTER_BUTTON, VARSTER_WOOD_SET, 30, true));
    public static final Block VARSTER_PRESSURE_PLATE = registerBlock("varster_pressure_plate", new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, VonoImpetBlockSettings.VARSTER_PRESSURE_PLATE, VARSTER_WOOD_SET));
    public static final Block VARSTER_SAPLING = registerBlock("varster_sapling", new SaplingBlock(new VarsterSaplingGenerator(), VonoImpetBlockSettings.VARSTER_SAPLING));
    public static final Block POTTED_VARSTER_SAPLING = registerBlockNoItem("potted_varster_sapling", new FlowerPotBlock(VARSTER_SAPLING, VonoImpetBlockSettings.POTTED_VARSTER_SAPLING));
    public static final Block VARSTER_SIGN = registerBlockNoItem("varster_sign", new TerraformSignBlock(VonoImpetBlockTextureIdentifiers.VARSTER_SIGN_TEXTURE, VonoImpetBlockSettings.VARSTER_SIGN));
    public static final Block VARSTER_WALL_SIGN = registerBlockNoItem("varster_wall_sign", new TerraformWallSignBlock(VonoImpetBlockTextureIdentifiers.VARSTER_SIGN_TEXTURE, VonoImpetBlockSettings.VARSTER_WALL_SIGN.dropsLike(VARSTER_SIGN)));
    public static final Block VARSTER_HANGING_SIGN = registerBlockNoItem("varster_hanging_sign", new TerraformHangingSignBlock(VonoImpetBlockTextureIdentifiers.VARSTER_HANGING_SIGN_TEXTURE, VonoImpetBlockTextureIdentifiers.VARSTER_HANGING_SIGN_GUI_TEXTURE, VonoImpetBlockSettings.VARSTER_HANGING_SIGN));
    public static final Block VARSTER_WALL_HANGING_SIGN = registerBlockNoItem("varster_wall_hanging_sign", new TerraformWallHangingSignBlock(VonoImpetBlockTextureIdentifiers.VARSTER_HANGING_SIGN_TEXTURE, VonoImpetBlockTextureIdentifiers.VARSTER_HANGING_SIGN_GUI_TEXTURE, VonoImpetBlockSettings.VARSTER_WALL_HANGING_SIGN.dropsLike(VARSTER_HANGING_SIGN)));

    public static final BlockFamily VARSTER_FAMILY = BlockFamilies.register(VARSTER_PLANKS)
            .sign(VARSTER_SIGN, VARSTER_WALL_SIGN)
            .group("wooden").unlockCriterionName("has_planks").build();

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
