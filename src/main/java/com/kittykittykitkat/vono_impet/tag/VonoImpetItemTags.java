package com.kittykittykitkat.vono_impet.tag;

import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import static com.kittykittykitkat.vono_impet.VonoImpet.MOD_ID;

public class VonoImpetItemTags {
    public static final TagKey<Item> MIRAKELL_LOGS = TagKey.of(RegistryKeys.ITEM, new Identifier(MOD_ID, "mirakell_logs"));
    public static final TagKey<Item> VARSTER_LOGS = TagKey.of(RegistryKeys.ITEM, new Identifier(MOD_ID, "varster_logs"));
}
