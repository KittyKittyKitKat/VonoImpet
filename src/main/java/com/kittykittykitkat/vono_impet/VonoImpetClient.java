package com.kittykittykitkat.vono_impet;

import com.kittykittykitkat.vono_impet.block.VonoImpetBlocks;
import com.kittykittykitkat.vono_impet.entity.VonoImpetBoats;
import com.kittykittykitkat.vono_impet.particle.VonoImpetParticles;
import com.terraformersmc.terraform.boat.api.client.TerraformBoatClientHelper;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.client.render.RenderLayer;

public class VonoImpetClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        VonoImpetParticles.clientRegisterParticles();

        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(),
                VonoImpetBlocks.MIRAKELL_LEAVES,
                VonoImpetBlocks.MIRAKELL_DOOR,
                VonoImpetBlocks.MIRAKELL_TRAPDOOR,
                VonoImpetBlocks.MIRAKELL_SAPLING,
                VonoImpetBlocks.POTTED_MIRAKELL_SAPLING,
                VonoImpetBlocks.MIRAKELL_VINE,
                VonoImpetBlocks.MIRAKELL_BUSHY_VINES,
                VonoImpetBlocks.MIRAKELL_BUSHY_VINES_PLANT,
                VonoImpetBlocks.VARSTER_LEAVES,
                VonoImpetBlocks.VARSTER_DOOR,
                VonoImpetBlocks.VARSTER_TRAPDOOR,
                VonoImpetBlocks.VARSTER_SAPLING,
                VonoImpetBlocks.POTTED_VARSTER_SAPLING,
                VonoImpetBlocks.CRYNIA_BARS,
                VonoImpetBlocks.CRYNIA_DOOR,
                VonoImpetBlocks.CRYNIA_TRAPDOOR,
                VonoImpetBlocks.KAYO,
                VonoImpetBlocks.POTTED_KAYO
        );

        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getTranslucent(),
                VonoImpetBlocks.BLACK_SAIGA,
                VonoImpetBlocks.BLUE_SAIGA,
                VonoImpetBlocks.BROWN_SAIGA,
                VonoImpetBlocks.CYAN_SAIGA,
                VonoImpetBlocks.GRAY_SAIGA,
                VonoImpetBlocks.GREEN_SAIGA,
                VonoImpetBlocks.LIGHT_BLUE_SAIGA,
                VonoImpetBlocks.LIGHT_GRAY_SAIGA,
                VonoImpetBlocks.LIME_SAIGA,
                VonoImpetBlocks.MAGENTA_SAIGA,
                VonoImpetBlocks.ORANGE_SAIGA,
                VonoImpetBlocks.PINK_SAIGA,
                VonoImpetBlocks.PURPLE_SAIGA,
                VonoImpetBlocks.RED_SAIGA,
                VonoImpetBlocks.WHITE_SAIGA,
                VonoImpetBlocks.YELLOW_SAIGA,
                VonoImpetBlocks.BLACK_SAIGA_PANE,
                VonoImpetBlocks.BLUE_SAIGA_PANE,
                VonoImpetBlocks.BROWN_SAIGA_PANE,
                VonoImpetBlocks.CYAN_SAIGA_PANE,
                VonoImpetBlocks.GRAY_SAIGA_PANE,
                VonoImpetBlocks.GREEN_SAIGA_PANE,
                VonoImpetBlocks.LIGHT_BLUE_SAIGA_PANE,
                VonoImpetBlocks.LIGHT_GRAY_SAIGA_PANE,
                VonoImpetBlocks.LIME_SAIGA_PANE,
                VonoImpetBlocks.MAGENTA_SAIGA_PANE,
                VonoImpetBlocks.ORANGE_SAIGA_PANE,
                VonoImpetBlocks.PINK_SAIGA_PANE,
                VonoImpetBlocks.PURPLE_SAIGA_PANE,
                VonoImpetBlocks.RED_SAIGA_PANE,
                VonoImpetBlocks.WHITE_SAIGA_PANE,
                VonoImpetBlocks.YELLOW_SAIGA_PANE
        );

        TerraformBoatClientHelper.registerModelLayers(VonoImpetBoats.MIRAKELL_BOAT_ID, false);
        TerraformBoatClientHelper.registerModelLayers(VonoImpetBoats.VARSTER_BOAT_ID, false);

        if (FabricLoader.getInstance().isModLoaded("dramaticdoors")) {
//            BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(),
//            );
        }
    }
}
