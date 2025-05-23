package com.kittykittykitkat.vono_impet.block;

import net.minecraft.block.*;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.WorldView;

public class MirakellBushyVinesBodyBlock extends AbstractPlantBlock {
    public MirakellBushyVinesBodyBlock(AbstractBlock.Settings settings) {
        super(settings, Direction.DOWN, Block.createCuboidShape(1.0, 0.0, 1.0, 15.0, 16.0, 15.0), false);
        this.setDefaultState(this.stateManager.getDefaultState());
    }

    @Override
    protected AbstractPlantStemBlock getStem() {
        return (AbstractPlantStemBlock) VonoImpetBlocks.MIRAKELL_BUSHY_VINES;
    }

    @Override
    public boolean canPlaceAt(BlockState state, WorldView world, BlockPos pos) {
        BlockPos blockPos = pos.offset(this.growthDirection.getOpposite());
        BlockState blockState = world.getBlockState(blockPos);
        return blockState.isOf(this.getStem()) || blockState.isOf(this.getPlant()) || blockState.isSideSolidFullSquare(world, blockPos, this.growthDirection) || blockState.isIn(BlockTags.LEAVES);
    }
}
