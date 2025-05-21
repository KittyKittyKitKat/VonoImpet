package com.kittykittykitkat.vono_impet.tag;

import net.minecraft.block.Block;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import static com.kittykittykitkat.vono_impet.VonoImpet.MOD_ID;

public class VonoImpetBlockTags {
    public static final TagKey<Block> MIRAKELL_LOGS = TagKey.of(RegistryKeys.BLOCK, new Identifier(MOD_ID, "mirakell_logs"));
}
