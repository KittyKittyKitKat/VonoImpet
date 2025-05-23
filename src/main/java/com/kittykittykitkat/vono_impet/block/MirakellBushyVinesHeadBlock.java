package com.kittykittykitkat.vono_impet.block;

import net.minecraft.block.*;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.state.StateManager;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.WorldView;

public class MirakellBushyVinesHeadBlock extends AbstractPlantStemBlock {
    private static final float GROW_CHANCE = 0.11F;

    public MirakellBushyVinesHeadBlock(AbstractBlock.Settings settings) {
        super(settings, Direction.DOWN, Block.createCuboidShape(1.0, 0.0, 1.0, 15.0, 16.0, 15.0), false, GROW_CHANCE);
        this.setDefaultState(this.stateManager.getDefaultState().with(AGE, 0));
    }

    @Override
    protected int getGrowthLength(Random random) {
        return 1;
    }

    @Override
    protected boolean chooseStemState(BlockState state) {
        return state.isAir();
    }

    @Override
    protected Block getPlant() {
        return VonoImpetBlocks.MIRAKELL_BUSHY_VINES_PLANT;
    }

    @Override
    protected BlockState age(BlockState state, Random random) {
        return super.age(state, random);
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        super.appendProperties(builder);
    }

    @Override
    public boolean canPlaceAt(BlockState state, WorldView world, BlockPos pos) {
        BlockPos blockPos = pos.offset(this.growthDirection.getOpposite());
        BlockState blockState = world.getBlockState(blockPos);
        return blockState.isOf(this.getStem()) || blockState.isOf(this.getPlant()) || blockState.isSideSolidFullSquare(world, blockPos, this.growthDirection) || blockState.isIn(BlockTags.LEAVES);
    }
}
