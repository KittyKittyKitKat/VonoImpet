package com.kittykittykitkat.vono_impet.item;

import com.kittykittykitkat.vono_impet.block.VonoImpetBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import static com.kittykittykitkat.vono_impet.VonoImpet.MOD_ID;

public class VonoImpetItemGroups {
    public static final Identifier VONO_IMPET_GROUP_ID = new Identifier(MOD_ID, MOD_ID);
    public static final RegistryKey<ItemGroup> VONO_IMPET_ITEM_GROUP_KEY = RegistryKey.of(RegistryKeys.ITEM_GROUP, VONO_IMPET_GROUP_ID);
    public static final ItemGroup VONO_IMPET_GROUP = Registry.register(
            Registries.ITEM_GROUP,
            VONO_IMPET_GROUP_ID,
            FabricItemGroup.builder()
                    .displayName(Text.translatable("itemGroup." + MOD_ID))
                    .icon(() -> new ItemStack(Blocks.OBSIDIAN))
                    .entries(((displayContext, entries) -> {
                        entries.add(VonoImpetBlocks.MIRAKELL_LOG);
                        entries.add(VonoImpetBlocks.MIRAKELL_WOOD);
                        entries.add(VonoImpetBlocks.STRIPPED_MIRAKELL_LOG);
                        entries.add(VonoImpetBlocks.STRIPPED_MIRAKELL_WOOD);
                        entries.add(VonoImpetBlocks.MIRAKELL_PLANKS);
                        entries.add(VonoImpetBlocks.MIRAKELL_STAIRS);
                        entries.add(VonoImpetBlocks.MIRAKELL_SLAB);
                        entries.add(VonoImpetBlocks.MIRAKELL_FENCE);
                        entries.add(VonoImpetBlocks.MIRAKELL_FENCE_GATE);
                        entries.add(VonoImpetBlocks.MIRAKELL_DOOR);
                        entries.add(VonoImpetBlocks.MIRAKELL_TRAPDOOR);
                        entries.add(VonoImpetBlocks.MIRAKELL_PRESSURE_PLATE);
                        entries.add(VonoImpetBlocks.MIRAKELL_BUTTON);
                        entries.add(VonoImpetItems.MIRAKELL_SIGN_ITEM);
                        entries.add(VonoImpetItems.MIRAKELL_HANGING_SIGN_ITEM);
                        entries.add(VonoImpetItems.MIRAKELL_BOAT);
                        entries.add(VonoImpetItems.MIRAKELL_CHEST_BOAT);
                        entries.add(VonoImpetBlocks.MIRAKELL_LEAVES);
                        entries.add(VonoImpetItems.POTENTIAL_SPARK);
                        entries.add(VonoImpetBlocks.MIRAKELL_SAPLING);
                        entries.add(VonoImpetBlocks.MIRAKELL_VINE);
                        entries.add(VonoImpetBlocks.MIRAKELL_BUSHY_VINES);

                        entries.add(VonoImpetBlocks.VARSTER_LOG);
                        entries.add(VonoImpetBlocks.VARSTER_WOOD);
                        entries.add(VonoImpetBlocks.STRIPPED_VARSTER_LOG);
                        entries.add(VonoImpetBlocks.STRIPPED_VARSTER_WOOD);
                        entries.add(VonoImpetBlocks.VARSTER_PLANKS);
                        entries.add(VonoImpetBlocks.VARSTER_STAIRS);
                        entries.add(VonoImpetBlocks.VARSTER_SLAB);
                        entries.add(VonoImpetBlocks.VARSTER_FENCE);
                        entries.add(VonoImpetBlocks.VARSTER_FENCE_GATE);
                        entries.add(VonoImpetBlocks.VARSTER_DOOR);
                        entries.add(VonoImpetBlocks.VARSTER_TRAPDOOR);
                        entries.add(VonoImpetBlocks.VARSTER_PRESSURE_PLATE);
                        entries.add(VonoImpetBlocks.VARSTER_BUTTON);
                        entries.add(VonoImpetItems.VARSTER_SIGN_ITEM);
                        entries.add(VonoImpetItems.VARSTER_HANGING_SIGN_ITEM);
                        entries.add(VonoImpetItems.VARSTER_BOAT);
                        entries.add(VonoImpetItems.VARSTER_CHEST_BOAT);
                        entries.add(VonoImpetBlocks.VARSTER_LEAVES);
                        entries.add(VonoImpetItems.VARSTER_ANVI);
                        entries.add(VonoImpetBlocks.VARSTER_SAPLING);

                        entries.add(VonoImpetBlocks.HADELITE);
                        entries.add(VonoImpetBlocks.HADELITE_SLAB);
                        entries.add(VonoImpetBlocks.HADELITE_STAIRS);
                        entries.add(VonoImpetBlocks.HADELITE_WALL);
                        entries.add(VonoImpetBlocks.HADELITE_BUTTON);
                        entries.add(VonoImpetBlocks.HADELITE_PRESSURE_PLATE);
                        entries.add(VonoImpetBlocks.POLISHED_HADELITE);
                        entries.add(VonoImpetBlocks.POLISHED_HADELITE_SLAB);
                        entries.add(VonoImpetBlocks.POLISHED_HADELITE_STAIRS);
                        entries.add(VonoImpetBlocks.POLISHED_HADELITE_WALL);
                        entries.add(VonoImpetBlocks.HADELITE_TILES);
                        entries.add(VonoImpetBlocks.HADELITE_TILE_SLAB);
                        entries.add(VonoImpetBlocks.HADELITE_TILE_STAIRS);
                        entries.add(VonoImpetBlocks.HADELITE_TILE_WALL);
                        entries.add(VonoImpetBlocks.CRACKED_HADELITE_TILES);
                        entries.add(VonoImpetBlocks.HADELITE_BRICKS);
                        entries.add(VonoImpetBlocks.HADELITE_BRICK_SLAB);
                        entries.add(VonoImpetBlocks.HADELITE_BRICK_STAIRS);
                        entries.add(VonoImpetBlocks.HADELITE_BRICK_WALL);
                        entries.add(VonoImpetBlocks.CRACKED_HADELITE_BRICKS);
                        entries.add(VonoImpetBlocks.CHISELED_HADELITE_BRICKS);
                        entries.add(VonoImpetBlocks.HADELITE_PILLAR);
                        entries.add(VonoImpetBlocks.HADELITE_CORNER_PILLAR);

                        entries.add(VonoImpetBlocks.UNREFINED_CRYNIA);
                        entries.add(VonoImpetBlocks.CRYNIA_BLOCK);
                        entries.add(VonoImpetItems.ELUSIVE_REMNANT);
                        entries.add(VonoImpetItems.CRYNIA_INGOT);

                        entries.add(VonoImpetItems.CRYNIA_SWORD);
                        entries.add(VonoImpetItems.CRYNIA_PICKAXE);
                        entries.add(VonoImpetItems.CRYNIA_AXE);
                        entries.add(VonoImpetItems.CRYNIA_SHOVEL);
                        entries.add(VonoImpetItems.CRYNIA_HOE);

                        entries.add(VonoImpetItems.MUSIC_DISC_PASET_E_IMPETIF_LENA);
                    }))
                    .build()
    );

    public static void registerItemGroups() {

    }
}
