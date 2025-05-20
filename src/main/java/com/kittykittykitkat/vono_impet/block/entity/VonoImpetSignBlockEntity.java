package com.kittykittykitkat.vono_impet.block.entity;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.block.entity.SignBlockEntity;
import net.minecraft.util.math.BlockPos;

//import static com.kittykittykitkat.vono_impet.block.entity.VonoImpetBlockEntities.VONO_IMPET_SIGN_BLOCK_ENTITY;

public class VonoImpetSignBlockEntity extends SignBlockEntity {
    public VonoImpetSignBlockEntity(BlockPos pos, BlockState state) {
        super(pos, state);
    }

//    @Override
//    public BlockEntityType<?> getType() {
//        return VONO_IMPET_SIGN_BLOCK_ENTITY;
//    }
}
