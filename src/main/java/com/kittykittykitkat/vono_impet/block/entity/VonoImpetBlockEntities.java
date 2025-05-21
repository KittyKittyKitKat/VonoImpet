package com.kittykittykitkat.vono_impet.block.entity;

import com.kittykittykitkat.vono_impet.block.VonoImpetBlocks;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import static com.kittykittykitkat.vono_impet.VonoImpet.MOD_ID;

public class VonoImpetBlockEntities {
    public static final BlockEntityType<VonoImpetSignBlockEntity> VONO_IMPET_SIGN_BLOCK_ENTITY = registerBlockEntity(
            MOD_ID + "_sign",
            FabricBlockEntityTypeBuilder
                    .create(
                        VonoImpetSignBlockEntity::new,
                        VonoImpetBlocks.MIRAKELL_SIGN,
                        VonoImpetBlocks.MIRAKELL_WALL_SIGN
                    )
                    .build()
    );
    public static final BlockEntityType<VonoImpetHangingSignBlockEntity> VONO_IMPET_HANGING_SIGN_BLOCK_ENTITY = registerBlockEntity(
            MOD_ID + "_hanging_sign",
            FabricBlockEntityTypeBuilder.create(
                    VonoImpetHangingSignBlockEntity::new,
                    VonoImpetBlocks.MIRAKELL_HANGING_SIGN,
                    VonoImpetBlocks.MIRAKELL_WALL_HANGING_SIGN
            ).build()
    );

    public static <T extends BlockEntity> BlockEntityType<T> registerBlockEntity(String name, BlockEntityType<T> blockEntityType) {
        return Registry.register(Registries.BLOCK_ENTITY_TYPE, new Identifier(MOD_ID, name), blockEntityType);
    }

    public static void registerBlockEntities() {

    }
}
