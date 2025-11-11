package com.kittykittykitkat.vono_impet.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.PaneBlock;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.EnumProperty;
import net.minecraft.util.StringIdentifiable;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.WorldAccess;

// TODO: More complex connection logic/states?

public class CryniaBarsBlock extends PaneBlock {
    public static final EnumProperty<UpDownConnection> UP_DOWN_CONNECTION = EnumProperty.of("up_down_connection", UpDownConnection.class);

    public CryniaBarsBlock(Settings settings) {
        super(settings);
        this.setDefaultState(
                this.stateManager
                        .getDefaultState()
                        .with(NORTH, false)
                        .with(EAST, false)
                        .with(SOUTH, false)
                        .with(WEST, false)
                        .with(WATERLOGGED,false)
                        .with(UP_DOWN_CONNECTION, UpDownConnection.NONE)
        );
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        super.appendProperties(builder);
        builder.add(UP_DOWN_CONNECTION);
    }

    @Override
    public BlockState getStateForNeighborUpdate(BlockState state, Direction facing, BlockState facingState, WorldAccess world, BlockPos pos, BlockPos neighborPos) {
        BlockState new_state = super.getStateForNeighborUpdate(state, facing, facingState, world, pos, neighborPos);
        if (facingState.isOf(this)) {
            return connectTo(new_state, facing);
        } else {
            return disconnectFrom(new_state, facing);
        }
    }

    private BlockState connectTo(BlockState state, Direction facing) {
        BlockState newState = state;
        if (facing == Direction.DOWN) {
            if (state.get(UP_DOWN_CONNECTION) == UpDownConnection.NONE)
                newState = newState.with(UP_DOWN_CONNECTION, UpDownConnection.UP);
            else if (state.get(UP_DOWN_CONNECTION) == UpDownConnection.DOWN) {
                newState = newState.with(UP_DOWN_CONNECTION, UpDownConnection.MIDDLE);
            }
        } else if (facing == Direction.UP) {
            if (state.get(UP_DOWN_CONNECTION) == UpDownConnection.NONE)
                newState = newState.with(UP_DOWN_CONNECTION, UpDownConnection.DOWN);
            else if (state.get(UP_DOWN_CONNECTION) == UpDownConnection.UP) {
                newState = newState.with(UP_DOWN_CONNECTION, UpDownConnection.MIDDLE);
            }
        }

        return newState;
    }

    private BlockState disconnectFrom(BlockState state, Direction facing) {
        BlockState newState = state;
        if (facing == Direction.DOWN) {
            if (state.get(UP_DOWN_CONNECTION) == UpDownConnection.MIDDLE)
                newState = newState.with(UP_DOWN_CONNECTION, UpDownConnection.DOWN);
            else if (state.get(UP_DOWN_CONNECTION) == UpDownConnection.UP) {
                newState = newState.with(UP_DOWN_CONNECTION, UpDownConnection.NONE);
            }
        } else if (facing == Direction.UP) {
            if (state.get(UP_DOWN_CONNECTION) == UpDownConnection.MIDDLE)
                newState = newState.with(UP_DOWN_CONNECTION, UpDownConnection.UP);
            else if (state.get(UP_DOWN_CONNECTION) == UpDownConnection.DOWN) {
                newState = newState.with(UP_DOWN_CONNECTION, UpDownConnection.NONE);
            }
        }
        return newState;
    }


    public enum UpDownConnection implements StringIdentifiable {
        UP,
        MIDDLE,
        DOWN,
        NONE;

        @Override
        public String asString() {
            return this.getSerializedName();
        }

        public String getSerializedName() {
            return switch (this) {
                case UP -> "up";
                case DOWN -> "down";
                case MIDDLE -> "middle";
                case NONE -> "none";
            };
        }
    }
}
