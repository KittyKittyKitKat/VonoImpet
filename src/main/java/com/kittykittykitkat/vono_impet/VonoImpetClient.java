package com.kittykittykitkat.vono_impet;

import com.kittykittykitkat.vono_impet.block.VonoImpetBlockTextureIdentifiers;
import com.kittykittykitkat.vono_impet.block.VonoImpetBlocks;
import com.kittykittykitkat.vono_impet.entity.VonoImpetBoats;
import com.kittykittykitkat.vono_impet.particles.VonoImpetParticles;
import com.terraformersmc.terraform.boat.api.client.TerraformBoatClientHelper;
import com.terraformersmc.terraform.sign.SpriteIdentifierRegistry;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.TexturedRenderLayers;
import net.minecraft.client.util.SpriteIdentifier;

public class VonoImpetClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        VonoImpetParticles.clientRegisterParticles();

        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(),
                VonoImpetBlocks.MIRAKELL_LEAVES,
                VonoImpetBlocks.MIRAKELL_DOOR,
                VonoImpetBlocks.MIRAKELL_TRAPDOOR,
                VonoImpetBlocks.VARSTER_LEAVES,
                VonoImpetBlocks.VARSTER_DOOR,
                VonoImpetBlocks.VARSTER_TRAPDOOR
        );

        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getTranslucent()
        );

        SpriteIdentifierRegistry.INSTANCE.addIdentifier(new SpriteIdentifier(TexturedRenderLayers.SIGNS_ATLAS_TEXTURE, VonoImpetBlockTextureIdentifiers.MIRAKELL_SIGN_TEXTURE));
        SpriteIdentifierRegistry.INSTANCE.addIdentifier(new SpriteIdentifier(TexturedRenderLayers.SIGNS_ATLAS_TEXTURE, VonoImpetBlockTextureIdentifiers.MIRAKELL_HANGING_SIGN_TEXTURE));
        SpriteIdentifierRegistry.INSTANCE.addIdentifier(new SpriteIdentifier(TexturedRenderLayers.SIGNS_ATLAS_TEXTURE, VonoImpetBlockTextureIdentifiers.VARSTER_SIGN_TEXTURE));
        SpriteIdentifierRegistry.INSTANCE.addIdentifier(new SpriteIdentifier(TexturedRenderLayers.SIGNS_ATLAS_TEXTURE, VonoImpetBlockTextureIdentifiers.VARSTER_HANGING_SIGN_TEXTURE));

        TerraformBoatClientHelper.registerModelLayers(VonoImpetBoats.MIRAKELL_BOAT_ID, false);
        TerraformBoatClientHelper.registerModelLayers(VonoImpetBoats.VARSTER_BOAT_ID, false);

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
