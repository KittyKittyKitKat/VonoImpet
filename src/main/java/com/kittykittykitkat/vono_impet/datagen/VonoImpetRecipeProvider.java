package com.kittykittykitkat.vono_impet.datagen;

import com.kittykittykitkat.vono_impet.block.VonoImpetBlocks;
import com.kittykittykitkat.vono_impet.item.VonoImpetItems;
import com.kittykittykitkat.vono_impet.tag.VonoImpetItemTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.CookingRecipeJsonBuilder;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;

import java.util.function.Consumer;

public class VonoImpetRecipeProvider extends FabricRecipeProvider {
    public VonoImpetRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    public static void offerStairsRecipe(Consumer<RecipeJsonProvider> exporter, ItemConvertible output, ItemConvertible input) {
        createStairsRecipe(output, Ingredient.ofItems(input)).criterion(hasItem(input), conditionsFromItem(input)).offerTo(exporter);
    }

    public static void offerButtonRecipe(Consumer<RecipeJsonProvider> exporter, ItemConvertible output, ItemConvertible input) {
        createTransmutationRecipe(output, Ingredient.ofItems(input)).criterion(hasItem(input), conditionsFromItem(input)).offerTo(exporter);
    }


    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        offerMirakellRecipes(exporter);
        offerVarsterRecipes(exporter);
        offerHadeliteRecipes(exporter);
        offerCryniaRecipes(exporter);
    }

    public static void offerMirakellRecipes(Consumer<RecipeJsonProvider> exporter) {
        offerBarkBlockRecipe(exporter, VonoImpetBlocks.MIRAKELL_WOOD, VonoImpetBlocks.MIRAKELL_LOG);
        offerBarkBlockRecipe(exporter, VonoImpetBlocks.STRIPPED_MIRAKELL_WOOD, VonoImpetBlocks.STRIPPED_MIRAKELL_LOG);
        offerPlanksRecipe(exporter, VonoImpetBlocks.MIRAKELL_PLANKS, VonoImpetItemTags.MIRAKELL_LOGS, 4);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, VonoImpetBlocks.MIRAKELL_SLAB, VonoImpetBlocks.MIRAKELL_PLANKS);
        offerStairsRecipe(exporter, VonoImpetBlocks.MIRAKELL_STAIRS, VonoImpetBlocks.MIRAKELL_PLANKS);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, VonoImpetBlocks.MIRAKELL_FENCE, 3)
                .input('P', VonoImpetBlocks.MIRAKELL_PLANKS)
                .input('S', Items.STICK)
                .pattern("PSP")
                .pattern("PSP")
                .criterion(hasItem(VonoImpetBlocks.MIRAKELL_PLANKS), conditionsFromItem(VonoImpetBlocks.MIRAKELL_PLANKS))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, VonoImpetBlocks.MIRAKELL_FENCE_GATE)
                .input('P', VonoImpetBlocks.MIRAKELL_PLANKS)
                .input('S', Items.STICK)
                .pattern("SPS")
                .pattern("SPS")
                .criterion(hasItem(VonoImpetBlocks.MIRAKELL_PLANKS), conditionsFromItem(VonoImpetBlocks.MIRAKELL_PLANKS))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter);
        createDoorRecipe(VonoImpetBlocks.MIRAKELL_DOOR, Ingredient.ofItems(VonoImpetBlocks.MIRAKELL_PLANKS)).criterion(hasItem(VonoImpetBlocks.MIRAKELL_PLANKS), conditionsFromItem(VonoImpetBlocks.MIRAKELL_PLANKS)).offerTo(exporter);
        createTrapdoorRecipe(VonoImpetBlocks.MIRAKELL_TRAPDOOR, Ingredient.ofItems(VonoImpetBlocks.MIRAKELL_PLANKS)).criterion(hasItem(VonoImpetBlocks.MIRAKELL_PLANKS), conditionsFromItem(VonoImpetBlocks.MIRAKELL_PLANKS)).offerTo(exporter);
        offerShapelessRecipe(exporter, VonoImpetBlocks.MIRAKELL_BUTTON, VonoImpetBlocks.MIRAKELL_PLANKS, "", 1);
        offerPressurePlateRecipe(exporter, VonoImpetBlocks.MIRAKELL_PRESSURE_PLATE, VonoImpetBlocks.MIRAKELL_PLANKS);
        createSignRecipe(VonoImpetBlocks.MIRAKELL_SIGN, Ingredient.ofItems(VonoImpetBlocks.MIRAKELL_PLANKS)).criterion("has_planks", conditionsFromItem(VonoImpetBlocks.MIRAKELL_PLANKS)).offerTo(exporter);
        offerHangingSignRecipe(exporter, VonoImpetBlocks.MIRAKELL_HANGING_SIGN, VonoImpetBlocks.STRIPPED_MIRAKELL_LOG);
        offerBoatRecipe(exporter, VonoImpetItems.MIRAKELL_BOAT, VonoImpetBlocks.MIRAKELL_PLANKS);
        offerChestBoatRecipe(exporter, VonoImpetItems.MIRAKELL_CHEST_BOAT, VonoImpetItems.MIRAKELL_BOAT);
    }

    public static void offerVarsterRecipes(Consumer<RecipeJsonProvider> exporter) {
        offerBarkBlockRecipe(exporter, VonoImpetBlocks.VARSTER_WOOD, VonoImpetBlocks.VARSTER_LOG);
        offerBarkBlockRecipe(exporter, VonoImpetBlocks.STRIPPED_VARSTER_WOOD, VonoImpetBlocks.STRIPPED_VARSTER_LOG);
        offerPlanksRecipe(exporter, VonoImpetBlocks.VARSTER_PLANKS, VonoImpetItemTags.VARSTER_LOGS, 4);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, VonoImpetBlocks.VARSTER_SLAB, VonoImpetBlocks.VARSTER_PLANKS);
        offerStairsRecipe(exporter, VonoImpetBlocks.VARSTER_STAIRS, VonoImpetBlocks.VARSTER_PLANKS);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, VonoImpetBlocks.VARSTER_FENCE, 3)
                .input('P', VonoImpetBlocks.VARSTER_PLANKS)
                .input('S', Items.STICK)
                .pattern("PSP")
                .pattern("PSP")
                .criterion(hasItem(VonoImpetBlocks.VARSTER_PLANKS), conditionsFromItem(VonoImpetBlocks.VARSTER_PLANKS))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, VonoImpetBlocks.VARSTER_FENCE_GATE)
                .input('P', VonoImpetBlocks.VARSTER_PLANKS)
                .input('S', Items.STICK)
                .pattern("SPS")
                .pattern("SPS")
                .criterion(hasItem(VonoImpetBlocks.VARSTER_PLANKS), conditionsFromItem(VonoImpetBlocks.VARSTER_PLANKS))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter);
        createDoorRecipe(VonoImpetBlocks.VARSTER_DOOR, Ingredient.ofItems(VonoImpetBlocks.VARSTER_PLANKS)).criterion(hasItem(VonoImpetBlocks.VARSTER_PLANKS), conditionsFromItem(VonoImpetBlocks.VARSTER_PLANKS)).offerTo(exporter);
        createTrapdoorRecipe(VonoImpetBlocks.VARSTER_TRAPDOOR, Ingredient.ofItems(VonoImpetBlocks.VARSTER_PLANKS)).criterion(hasItem(VonoImpetBlocks.VARSTER_PLANKS), conditionsFromItem(VonoImpetBlocks.VARSTER_PLANKS)).offerTo(exporter);
        offerShapelessRecipe(exporter, VonoImpetBlocks.VARSTER_BUTTON, VonoImpetBlocks.VARSTER_PLANKS, "", 1);
        offerPressurePlateRecipe(exporter, VonoImpetBlocks.VARSTER_PRESSURE_PLATE, VonoImpetBlocks.VARSTER_PLANKS);
        createSignRecipe(VonoImpetBlocks.VARSTER_SIGN, Ingredient.ofItems(VonoImpetBlocks.VARSTER_PLANKS)).criterion("has_planks", conditionsFromItem(VonoImpetBlocks.VARSTER_PLANKS)).offerTo(exporter);
        offerHangingSignRecipe(exporter, VonoImpetBlocks.VARSTER_HANGING_SIGN, VonoImpetBlocks.STRIPPED_VARSTER_LOG);
        offerBoatRecipe(exporter, VonoImpetItems.VARSTER_BOAT, VonoImpetBlocks.VARSTER_PLANKS);
        offerChestBoatRecipe(exporter, VonoImpetItems.VARSTER_CHEST_BOAT, VonoImpetItems.VARSTER_BOAT);
    }

    public static void offerHadeliteRecipes(Consumer<RecipeJsonProvider> exporter) {
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, VonoImpetBlocks.HADELITE_SLAB, VonoImpetBlocks.HADELITE);
        offerStairsRecipe(exporter, VonoImpetBlocks.HADELITE_STAIRS, VonoImpetBlocks.HADELITE);
        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, VonoImpetBlocks.HADELITE_WALL, VonoImpetBlocks.HADELITE);
        offerButtonRecipe(exporter, VonoImpetBlocks.HADELITE_BUTTON, VonoImpetBlocks.HADELITE);
        offerPressurePlateRecipe(exporter, VonoImpetBlocks.HADELITE_PRESSURE_PLATE, VonoImpetBlocks.HADELITE);

        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, VonoImpetBlocks.POLISHED_HADELITE, VonoImpetBlocks.HADELITE);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, VonoImpetBlocks.POLISHED_HADELITE_SLAB, VonoImpetBlocks.POLISHED_HADELITE);
        offerStairsRecipe(exporter, VonoImpetBlocks.POLISHED_HADELITE_STAIRS, VonoImpetBlocks.POLISHED_HADELITE);
        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, VonoImpetBlocks.POLISHED_HADELITE_WALL, VonoImpetBlocks.POLISHED_HADELITE);

        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, VonoImpetBlocks.HADELITE_TILES, VonoImpetBlocks.HADELITE_BRICKS);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, VonoImpetBlocks.HADELITE_TILE_SLAB, VonoImpetBlocks.HADELITE_TILES);
        offerStairsRecipe(exporter, VonoImpetBlocks.HADELITE_TILE_STAIRS, VonoImpetBlocks.HADELITE_TILES);
        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, VonoImpetBlocks.HADELITE_TILE_WALL, VonoImpetBlocks.HADELITE_TILES);
        offerCrackingRecipe(exporter, VonoImpetBlocks.CRACKED_HADELITE_TILES, VonoImpetBlocks.HADELITE_TILES);

        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, VonoImpetBlocks.HADELITE_BRICKS, VonoImpetBlocks.POLISHED_HADELITE);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, VonoImpetBlocks.HADELITE_BRICK_SLAB, VonoImpetBlocks.HADELITE_BRICKS);
        offerStairsRecipe(exporter, VonoImpetBlocks.HADELITE_BRICK_STAIRS, VonoImpetBlocks.HADELITE_BRICKS);
        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, VonoImpetBlocks.HADELITE_BRICK_WALL, VonoImpetBlocks.HADELITE_BRICKS);
        offerCrackingRecipe(exporter, VonoImpetBlocks.CRACKED_HADELITE_BRICKS, VonoImpetBlocks.HADELITE_BRICKS);

        offerChiseledBlockRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, VonoImpetBlocks.CHISELED_HADELITE_BRICKS, VonoImpetBlocks.HADELITE_SLAB);
        offerChiseledBlockRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, VonoImpetBlocks.HADELITE_PILLAR, VonoImpetBlocks.POLISHED_HADELITE);
        offerBarkBlockRecipe(exporter, VonoImpetBlocks.HADELITE_CORNER_PILLAR, VonoImpetBlocks.HADELITE_PILLAR);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, VonoImpetBlocks.HADELITE, VonoImpetBlocks.HADELITE_SLAB, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, VonoImpetBlocks.HADELITE, VonoImpetBlocks.HADELITE_STAIRS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, VonoImpetBlocks.HADELITE, VonoImpetBlocks.HADELITE_WALL);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, VonoImpetBlocks.HADELITE, VonoImpetBlocks.POLISHED_HADELITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, VonoImpetBlocks.HADELITE, VonoImpetBlocks.POLISHED_HADELITE_SLAB, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, VonoImpetBlocks.HADELITE, VonoImpetBlocks.POLISHED_HADELITE_STAIRS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, VonoImpetBlocks.HADELITE, VonoImpetBlocks.POLISHED_HADELITE_WALL);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, VonoImpetBlocks.HADELITE, VonoImpetBlocks.HADELITE_TILES);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, VonoImpetBlocks.HADELITE, VonoImpetBlocks.HADELITE_TILE_SLAB, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, VonoImpetBlocks.HADELITE, VonoImpetBlocks.HADELITE_TILE_STAIRS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, VonoImpetBlocks.HADELITE, VonoImpetBlocks.HADELITE_TILE_WALL);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, VonoImpetBlocks.HADELITE, VonoImpetBlocks.HADELITE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, VonoImpetBlocks.HADELITE, VonoImpetBlocks.HADELITE_BRICK_SLAB, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, VonoImpetBlocks.HADELITE, VonoImpetBlocks.HADELITE_BRICK_STAIRS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, VonoImpetBlocks.HADELITE, VonoImpetBlocks.HADELITE_BRICK_WALL);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, VonoImpetBlocks.HADELITE, VonoImpetBlocks.CHISELED_HADELITE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, VonoImpetBlocks.HADELITE, VonoImpetBlocks.HADELITE_PILLAR);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, VonoImpetBlocks.HADELITE, VonoImpetBlocks.HADELITE_CORNER_PILLAR);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, VonoImpetBlocks.POLISHED_HADELITE, VonoImpetBlocks.POLISHED_HADELITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, VonoImpetBlocks.POLISHED_HADELITE, VonoImpetBlocks.POLISHED_HADELITE_SLAB, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, VonoImpetBlocks.POLISHED_HADELITE, VonoImpetBlocks.POLISHED_HADELITE_STAIRS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, VonoImpetBlocks.POLISHED_HADELITE, VonoImpetBlocks.POLISHED_HADELITE_WALL);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, VonoImpetBlocks.POLISHED_HADELITE, VonoImpetBlocks.HADELITE_TILES);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, VonoImpetBlocks.POLISHED_HADELITE, VonoImpetBlocks.HADELITE_TILE_SLAB, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, VonoImpetBlocks.POLISHED_HADELITE, VonoImpetBlocks.HADELITE_TILE_STAIRS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, VonoImpetBlocks.POLISHED_HADELITE, VonoImpetBlocks.HADELITE_TILE_WALL);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, VonoImpetBlocks.POLISHED_HADELITE, VonoImpetBlocks.HADELITE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, VonoImpetBlocks.POLISHED_HADELITE, VonoImpetBlocks.HADELITE_BRICK_SLAB, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, VonoImpetBlocks.POLISHED_HADELITE, VonoImpetBlocks.HADELITE_BRICK_STAIRS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, VonoImpetBlocks.POLISHED_HADELITE, VonoImpetBlocks.HADELITE_BRICK_WALL);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, VonoImpetBlocks.POLISHED_HADELITE, VonoImpetBlocks.CHISELED_HADELITE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, VonoImpetBlocks.POLISHED_HADELITE, VonoImpetBlocks.HADELITE_PILLAR);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, VonoImpetBlocks.POLISHED_HADELITE, VonoImpetBlocks.HADELITE_CORNER_PILLAR);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, VonoImpetBlocks.HADELITE_BRICKS, VonoImpetBlocks.POLISHED_HADELITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, VonoImpetBlocks.HADELITE_BRICKS, VonoImpetBlocks.POLISHED_HADELITE_SLAB, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, VonoImpetBlocks.HADELITE_BRICKS, VonoImpetBlocks.POLISHED_HADELITE_STAIRS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, VonoImpetBlocks.HADELITE_BRICKS, VonoImpetBlocks.POLISHED_HADELITE_WALL);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, VonoImpetBlocks.HADELITE_BRICKS, VonoImpetBlocks.HADELITE_TILES);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, VonoImpetBlocks.HADELITE_BRICKS, VonoImpetBlocks.HADELITE_TILE_SLAB, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, VonoImpetBlocks.HADELITE_BRICKS, VonoImpetBlocks.HADELITE_TILE_STAIRS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, VonoImpetBlocks.HADELITE_BRICKS, VonoImpetBlocks.HADELITE_TILE_WALL);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, VonoImpetBlocks.HADELITE_BRICKS, VonoImpetBlocks.HADELITE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, VonoImpetBlocks.HADELITE_BRICKS, VonoImpetBlocks.HADELITE_BRICK_SLAB, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, VonoImpetBlocks.HADELITE_BRICKS, VonoImpetBlocks.HADELITE_BRICK_STAIRS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, VonoImpetBlocks.HADELITE_BRICKS, VonoImpetBlocks.HADELITE_BRICK_WALL);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, VonoImpetBlocks.HADELITE_BRICKS, VonoImpetBlocks.CHISELED_HADELITE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, VonoImpetBlocks.HADELITE_BRICKS, VonoImpetBlocks.HADELITE_PILLAR);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, VonoImpetBlocks.HADELITE_BRICKS, VonoImpetBlocks.HADELITE_CORNER_PILLAR);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, VonoImpetBlocks.HADELITE_TILES, VonoImpetBlocks.POLISHED_HADELITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, VonoImpetBlocks.HADELITE_TILES, VonoImpetBlocks.POLISHED_HADELITE_SLAB, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, VonoImpetBlocks.HADELITE_TILES, VonoImpetBlocks.POLISHED_HADELITE_STAIRS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, VonoImpetBlocks.HADELITE_TILES, VonoImpetBlocks.POLISHED_HADELITE_WALL);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, VonoImpetBlocks.HADELITE_TILES, VonoImpetBlocks.HADELITE_TILES);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, VonoImpetBlocks.HADELITE_TILES, VonoImpetBlocks.HADELITE_TILE_SLAB, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, VonoImpetBlocks.HADELITE_TILES, VonoImpetBlocks.HADELITE_TILE_STAIRS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, VonoImpetBlocks.HADELITE_TILES, VonoImpetBlocks.HADELITE_TILE_WALL);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, VonoImpetBlocks.HADELITE_TILES, VonoImpetBlocks.HADELITE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, VonoImpetBlocks.HADELITE_TILES, VonoImpetBlocks.HADELITE_BRICK_SLAB, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, VonoImpetBlocks.HADELITE_TILES, VonoImpetBlocks.HADELITE_BRICK_STAIRS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, VonoImpetBlocks.HADELITE_TILES, VonoImpetBlocks.HADELITE_BRICK_WALL);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, VonoImpetBlocks.HADELITE_TILES, VonoImpetBlocks.CHISELED_HADELITE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, VonoImpetBlocks.HADELITE_TILES, VonoImpetBlocks.HADELITE_PILLAR);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, VonoImpetBlocks.HADELITE_TILES, VonoImpetBlocks.HADELITE_CORNER_PILLAR);
    }

    public static void offerCryniaRecipes(Consumer<RecipeJsonProvider> exporter) {
        CookingRecipeJsonBuilder.createSmelting(
                Ingredient.ofItems(VonoImpetBlocks.UNREFINED_CRYNIA),
                RecipeCategory.MISC,
                VonoImpetItems.ELUSIVE_REMNANT,
                2.0F,
                200
        )
                .criterion("has_unrefined_crynia", conditionsFromItem(VonoImpetBlocks.UNREFINED_CRYNIA))
                .offerTo(exporter);

        CookingRecipeJsonBuilder.createBlasting(
                Ingredient.ofItems(VonoImpetBlocks.UNREFINED_CRYNIA),
                RecipeCategory.MISC,
                VonoImpetItems.ELUSIVE_REMNANT,
                2.0F,
                100
        )
                .criterion("has_unrefined_crynia", conditionsFromItem(VonoImpetBlocks.UNREFINED_CRYNIA))
                .offerTo(exporter, getBlastingItemPath(VonoImpetItems.ELUSIVE_REMNANT));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, VonoImpetItems.CRYNIA_INGOT)
                .input(VonoImpetItems.ELUSIVE_REMNANT, 4)
                .input(VonoImpetItems.MIRAKELL_SPARK, 4)
                .group("crynia_ingot")
                .criterion("has_elusive_remnant", conditionsFromItem(VonoImpetItems.ELUSIVE_REMNANT))
                .criterion("has_potential_spark", conditionsFromItem(VonoImpetItems.MIRAKELL_SPARK))
                .offerTo(exporter);

        offerReversibleCompactingRecipesWithReverseRecipeGroup(
                exporter,
                RecipeCategory.MISC,
                VonoImpetItems.CRYNIA_INGOT,
                RecipeCategory.BUILDING_BLOCKS,
                VonoImpetBlocks.CRYNIA_BLOCK,
                "crynia_ingot_from_crynia_block",
                "crynia_ingot"
        );

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, VonoImpetItems.CRYNIA_SWORD)
                .input('#', Items.STICK)
                .input('X', VonoImpetItems.CRYNIA_INGOT)
                .pattern("X")
                .pattern("X")
                .pattern("#")
                .criterion("has_crynia_ingot", conditionsFromItem(VonoImpetItems.CRYNIA_INGOT))
                .offerTo(exporter);
        
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, VonoImpetItems.CRYNIA_PICKAXE)
                .input('#', Items.STICK)
                .input('X', VonoImpetItems.CRYNIA_INGOT)
                .pattern("XXX")
                .pattern(" # ")
                .pattern(" # ")
                .criterion("has_crynia_ingot", conditionsFromItem(VonoImpetItems.CRYNIA_INGOT))
                .offerTo(exporter);
        
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, VonoImpetItems.CRYNIA_AXE)
                .input('#', Items.STICK)
                .input('X', VonoImpetItems.CRYNIA_INGOT)
                .pattern("XX")
                .pattern("X#")
                .pattern(" #")
                .criterion("has_crynia_ingot", conditionsFromItem(VonoImpetItems.CRYNIA_INGOT))
                .offerTo(exporter);
        
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, VonoImpetItems.CRYNIA_SHOVEL)
                .input('#', Items.STICK)
                .input('X', VonoImpetItems.CRYNIA_INGOT)
                .pattern("X")
                .pattern("#")
                .pattern("#")
                .criterion("has_crynia_ingot", conditionsFromItem(VonoImpetItems.CRYNIA_INGOT))
                .offerTo(exporter);
        
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, VonoImpetItems.CRYNIA_HOE)
                .input('#', Items.STICK)
                .input('X', VonoImpetItems.CRYNIA_INGOT)
                .pattern("XX")
                .pattern(" #")
                .pattern(" #")
                .criterion("has_crynia_ingot", conditionsFromItem(VonoImpetItems.CRYNIA_INGOT))
                .offerTo(exporter);

    }
}
