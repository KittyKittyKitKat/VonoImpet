package com.kittykittykitkat.vono_impet.datagen;

import com.kittykittykitkat.vono_impet.item.VonoImpetItems;
import com.kittykittykitkat.vono_impet.tag.VonoImpetItemTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import com.kittykittykitkat.vono_impet.block.VonoImpetBlocks;

import java.util.concurrent.CompletableFuture;

public class VonoImpetItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public VonoImpetItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(VonoImpetItemTags.MIRAKELL_LOGS)
                .add(VonoImpetBlocks.MIRAKELL_LOG.asItem())
                .add(VonoImpetBlocks.MIRAKELL_WOOD.asItem())
                .add(VonoImpetBlocks.STRIPPED_MIRAKELL_LOG.asItem())
                .add(VonoImpetBlocks.STRIPPED_MIRAKELL_WOOD.asItem());

        getOrCreateTagBuilder(VonoImpetItemTags.VARSTER_LOGS)
                .add(VonoImpetBlocks.VARSTER_LOG.asItem())
                .add(VonoImpetBlocks.VARSTER_WOOD.asItem())
                .add(VonoImpetBlocks.STRIPPED_VARSTER_LOG.asItem())
                .add(VonoImpetBlocks.STRIPPED_VARSTER_WOOD.asItem());

        getOrCreateTagBuilder(ItemTags.LOGS)
                .add(VonoImpetBlocks.MIRAKELL_LOG.asItem())
                .add(VonoImpetBlocks.MIRAKELL_WOOD.asItem())
                .add(VonoImpetBlocks.STRIPPED_MIRAKELL_LOG.asItem())
                .add(VonoImpetBlocks.STRIPPED_MIRAKELL_WOOD.asItem())
                .add(VonoImpetBlocks.VARSTER_LOG.asItem())
                .add(VonoImpetBlocks.VARSTER_WOOD.asItem())
                .add(VonoImpetBlocks.STRIPPED_VARSTER_LOG.asItem())
                .add(VonoImpetBlocks.STRIPPED_VARSTER_WOOD.asItem());

        getOrCreateTagBuilder(ItemTags.LOGS_THAT_BURN)
                .add(VonoImpetBlocks.MIRAKELL_LOG.asItem())
                .add(VonoImpetBlocks.MIRAKELL_WOOD.asItem())
                .add(VonoImpetBlocks.STRIPPED_MIRAKELL_LOG.asItem())
                .add(VonoImpetBlocks.STRIPPED_MIRAKELL_WOOD.asItem())
                .add(VonoImpetBlocks.VARSTER_LOG.asItem())
                .add(VonoImpetBlocks.VARSTER_WOOD.asItem())
                .add(VonoImpetBlocks.STRIPPED_VARSTER_LOG.asItem())
                .add(VonoImpetBlocks.STRIPPED_VARSTER_WOOD.asItem());

        getOrCreateTagBuilder(ItemTags.PLANKS)
                .add(VonoImpetBlocks.MIRAKELL_PLANKS.asItem())
                .add(VonoImpetBlocks.VARSTER_PLANKS.asItem());

        getOrCreateTagBuilder(ItemTags.WOODEN_SLABS)
                .add(VonoImpetBlocks.MIRAKELL_SLAB.asItem())
                .add(VonoImpetBlocks.VARSTER_SLAB.asItem());

        getOrCreateTagBuilder(ItemTags.WOODEN_STAIRS)
                .add(VonoImpetBlocks.MIRAKELL_STAIRS.asItem())
                .add(VonoImpetBlocks.VARSTER_STAIRS.asItem());

        getOrCreateTagBuilder(ItemTags.WOODEN_FENCES)
                .add(VonoImpetBlocks.MIRAKELL_FENCE.asItem())
                .add(VonoImpetBlocks.VARSTER_FENCE.asItem());

        getOrCreateTagBuilder(ItemTags.WOODEN_TRAPDOORS)
                .add(VonoImpetBlocks.MIRAKELL_TRAPDOOR.asItem())
                .add(VonoImpetBlocks.VARSTER_TRAPDOOR.asItem());

        getOrCreateTagBuilder(ItemTags.WOODEN_DOORS)
                .add(VonoImpetBlocks.MIRAKELL_DOOR.asItem())
                .add(VonoImpetBlocks.VARSTER_DOOR.asItem());

        getOrCreateTagBuilder(ItemTags.WOODEN_BUTTONS)
                .add(VonoImpetBlocks.MIRAKELL_BUTTON.asItem())
                .add(VonoImpetBlocks.VARSTER_BUTTON.asItem());

        getOrCreateTagBuilder(ItemTags.WOODEN_PRESSURE_PLATES)
                .add(VonoImpetBlocks.MIRAKELL_PRESSURE_PLATE.asItem())
                .add(VonoImpetBlocks.VARSTER_PRESSURE_PLATE.asItem());

        getOrCreateTagBuilder(ItemTags.BOATS)
                .add(VonoImpetItems.MIRAKELL_BOAT)
                .add(VonoImpetItems.VARSTER_BOAT);

        getOrCreateTagBuilder(ItemTags.CHEST_BOATS)
                .add(VonoImpetItems.MIRAKELL_CHEST_BOAT)
                .add(VonoImpetItems.VARSTER_CHEST_BOAT);

        getOrCreateTagBuilder(ItemTags.SAPLINGS)
                .add(VonoImpetBlocks.MIRAKELL_SAPLING.asItem());
//                .add(VonoImpetBlocks.VARSTER_SAPLING.asItem())
    }
}
