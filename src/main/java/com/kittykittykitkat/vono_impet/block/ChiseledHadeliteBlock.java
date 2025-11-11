package com.kittykittykitkat.vono_impet.block;

import com.google.common.base.Predicates;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.pattern.BlockPattern;
import net.minecraft.block.pattern.BlockPatternBuilder;
import net.minecraft.block.pattern.CachedBlockPosition;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.predicate.block.BlockStatePredicate;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

// TODO: Lighting and extinguishing sounds
// TODO: Some sort of crackling sound when lit?

public class ChiseledHadeliteBlock extends Block {
    public static final BooleanProperty LIT = Properties.LIT;
    private static BlockPattern COMPLETED_FRAME;

    public ChiseledHadeliteBlock(Settings settings) {
        super(settings);
        this.setDefaultState(this.stateManager.getDefaultState().with(LIT, false));
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(LIT);
    }

    @SuppressWarnings("deprecation")
    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        ItemStack itemStack = player.getStackInHand(hand);
        if (itemStack.isOf(Items.FLINT_AND_STEEL) && hand == Hand.MAIN_HAND) {
            BlockState blockState = world.getBlockState(pos).with(LIT, true);
            world.setBlockState(pos, blockState);
            if (!world.isClient && !player.isCreative()) {
                itemStack.damage(1, player.getRandom(), (ServerPlayerEntity) player);
            }
            if (!world.isClient) {
//            world.syncWorldEvent(WorldEvents.END_PORTAL_FRAME_FILLED, pos, 0);
                BlockPattern.Result result = getCompletedFramePattern().searchAround(world, pos);
                if (result != null) {
                    System.out.println("yay portal");
//                BlockPos blockPos2 = result.getFrontTopLeft().add(-3, 0, -3);
//
//                for (int i = 0; i < 3; i++) {
//                    for (int j = 0; j < 3; j++) {
//                        world.setBlockState(blockPos2.add(i, 0, j), Blocks.END_PORTAL.getDefaultState(), Block.NOTIFY_LISTENERS);
//                    }
//                }
                } else {
                    System.out.println("invalid portal");
                }
            }

            return ActionResult.SUCCESS;
        } else if (itemStack.isIn(ItemTags.SHOVELS) && hand == Hand.MAIN_HAND) {
            BlockState blockState = world.getBlockState(pos).with(LIT, false);
            world.setBlockState(pos, blockState);
            if (!world.isClient && !player.isCreative()) {
                itemStack.damage(1, player.getRandom(), (ServerPlayerEntity) player);
            }
            return ActionResult.SUCCESS;
        }
        return ActionResult.PASS;
    }

    public static BlockPattern getCompletedFramePattern() {
        if (COMPLETED_FRAME == null) {
            COMPLETED_FRAME = BlockPatternBuilder.start()
                    .aisle("?-+-?", "-???-", "+???+", "-???-", "?-+-?")
                    .aisle("-???-", "?????", "?????", "?????", "-???-")
                    .aisle("+???+", "?????", "?????", "?????", "+???+")
                    .aisle("-???-", "?????", "?????", "?????", "-???-")
                    .aisle("?-+-?", "-???-", "+???+", "-???-", "?-+-?")
                    .where('?', CachedBlockPosition.matchesBlockState(BlockStatePredicate.ANY))
                    .where('+', CachedBlockPosition.matchesBlockState(
                            BlockStatePredicate.forBlock(VonoImpetBlocks.CHISELED_HADELITE_BRICKS)
                                    .with(LIT, Predicates.equalTo(true))
                    ))
                    .where('-', CachedBlockPosition.matchesBlockState(
                            BlockStatePredicate.forBlock(VonoImpetBlocks.HADELITE_CORNER_PILLAR)
                    ))
                    .build();

            System.out.println(COMPLETED_FRAME.getDepth());
            System.out.println(COMPLETED_FRAME.getHeight());
            System.out.println(COMPLETED_FRAME.getWidth());
        }
        return COMPLETED_FRAME;
    }
}
