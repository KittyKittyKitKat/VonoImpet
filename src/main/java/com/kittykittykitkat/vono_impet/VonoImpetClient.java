package com.kittykittykitkat.vono_impet;

import com.kittykittykitkat.vono_impet.entity.VonoImpetBoats;
import com.kittykittykitkat.vono_impet.particles.VonoImpetParticles;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.client.render.RenderLayer;

public class VonoImpetClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        VonoImpetParticles.clientRegisterParticles();

        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout()
        );

        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getTranslucent()
        );

        if (FabricLoader.getInstance().isModLoaded("dramaticdoors")) {
//            BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(),
//            );
        }

//        BlockEntityRendererFactories.register(VONO_IMPET_SIGN_BLOCK_ENTITY, SignBlockEntityRenderer::new);
//        BlockEntityRendererFactories.register(VONO_IMPET_HANGING_SIGN_BLOCK_ENTITY, HangingSignBlockEntityRenderer::new);

//        TerraformBoatClientHelper.registerModelLayers(VonoImpetBoats., false);
//        TerraformBoatClientHelper.registerModelLayers(VonoImpetBoats., false);
    }
}
