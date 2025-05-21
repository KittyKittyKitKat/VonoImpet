package com.kittykittykitkat.vono_impet.datagen;

import com.kittykittykitkat.vono_impet.block.VonoImpetBlocks;
import com.kittykittykitkat.vono_impet.item.VonoImpetItems;
import com.kittykittykitkat.vono_impet.tag.VonoImpetItemTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
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


    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {

    }

    public static void offerMirakellRecipes(Consumer<RecipeJsonProvider> exporter) {
        offerBarkBlockRecipe(exporter, VonoImpetBlocks.MIRAKELL_WOOD, VonoImpetBlocks.MIRAKELL_LOG);
        offerBarkBlockRecipe(exporter, VonoImpetBlocks.STRIPPED_MIRAKELL_WOOD, VonoImpetBlocks.STRIPPED_MIRAKELL_LOG);
        offerPlanksRecipe2(exporter, VonoImpetBlocks.MIRAKELL_PLANKS, VonoImpetItemTags.MIRAKELL_LOGS, 4);
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
        offerBoatRecipe(exporter, VonoImpetItems.MIRAKELL_BOAT_ITEM, VonoImpetBlocks.MIRAKELL_PLANKS);
        offerChestBoatRecipe(exporter, VonoImpetItems.MIRAKELL_CHEST_BOAT_ITEM, VonoImpetItems.MIRAKELL_BOAT_ITEM);
    }
}
