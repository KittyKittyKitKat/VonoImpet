package com.kittykittykitkat.vono_impet.datagen;

import com.kittykittykitkat.vono_impet.item.VonoImpetItems;
import com.kittykittykitkat.vono_impet.tag.VonoImpetBlockTags;
import com.kittykittykitkat.vono_impet.tag.VonoImpetItemTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.item.Item;
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
                .add(VonoImpetBlocks.MIRAKELL_SAPLING.asItem())
                .add(VonoImpetBlocks.VARSTER_SAPLING.asItem());

        getOrCreateTagBuilder(ItemTags.STONE_TOOL_MATERIALS)
                .add(VonoImpetBlocks.HADELITE.asItem());

        getOrCreateTagBuilder(ItemTags.STONE_CRAFTING_MATERIALS)
                .add(VonoImpetBlocks.HADELITE.asItem());

        getOrCreateTagBuilder(ItemTags.MUSIC_DISCS)
                .add(VonoImpetItems.MUSIC_DISC_PASET_E_IMPETIF_LENA)
                .add(VonoImpetItems.MUSIC_DISC_ZERO);

        getOrCreateTagBuilder(VonoImpetItemTags.WRETCHED_DROP_MUSIC_DISCS)
                .add(VonoImpetItems.MUSIC_DISC_PASET_E_IMPETIF_LENA);

        getOrCreateTagBuilder(ItemTags.TRIM_MATERIALS)
                .add(VonoImpetItems.CRYNIA_INGOT);

        getOrCreateTagBuilder(ItemTags.BEACON_PAYMENT_ITEMS)
                .add(VonoImpetItems.CRYNIA_INGOT);

        getOrCreateTagBuilder(ItemTags.SWORDS)
                .add(VonoImpetItems.CRYNIA_SWORD);

        getOrCreateTagBuilder(ItemTags.PICKAXES)
                .add(VonoImpetItems.CRYNIA_PICKAXE);

        getOrCreateTagBuilder(ItemTags.AXES)
                .add(VonoImpetItems.CRYNIA_AXE);

        getOrCreateTagBuilder(ItemTags.SHOVELS)
                .add(VonoImpetItems.CRYNIA_SHOVEL);

        getOrCreateTagBuilder(ItemTags.HOES)
                .add(VonoImpetItems.CRYNIA_HOE);

        getOrCreateTagBuilder(ItemTags.CLUSTER_MAX_HARVESTABLES)
                .add(VonoImpetItems.CRYNIA_PICKAXE);

        getOrCreateTagBuilder(ItemTags.DOORS)
                .add(VonoImpetBlocks.CRYNIA_DOOR.asItem());

        getOrCreateTagBuilder(ItemTags.TRAPDOORS)
                .add(VonoImpetBlocks.CRYNIA_TRAPDOOR.asItem());

        getOrCreateTagBuilder(ItemTags.SMALL_FLOWERS)
                .add(VonoImpetBlocks.KAYO.asItem());
    }
}
