package com.kittykittykitkat.vono_impet.item;

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

                    }))
                    .build()
    );

    public static void registerItemGroups() {

    }
}
