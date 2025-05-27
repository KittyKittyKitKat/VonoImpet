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
                VonoImpetBlocks.POTTED_VARSTER_SAPLING
        );

        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getTranslucent()
        );

        TerraformBoatClientHelper.registerModelLayers(VonoImpetBoats.MIRAKELL_BOAT_ID, false);
        TerraformBoatClientHelper.registerModelLayers(VonoImpetBoats.VARSTER_BOAT_ID, false);

        if (FabricLoader.getInstance().isModLoaded("dramaticdoors")) {
//            BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(),
//            );
        }
    }
}
