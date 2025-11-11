package com.kittykittykitkat.vono_impet.mixin;

import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.render.Camera;
import net.minecraft.client.render.GameRenderer;
import net.minecraft.client.util.math.MatrixStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(GameRenderer.class)
public class GameRendererMixin {

    @Inject(method = "renderWorld", at = @At("HEAD"))
    private void beforeWorldRender(float tickDelta, long limitTime, MatrixStack matrices, CallbackInfo ci) {
        MinecraftClient client = MinecraftClient.getInstance();
        Camera camera = client.gameRenderer.getCamera();

        if (true) {
            RenderSystem.setShaderColor(0.0f, 0.0f, 0.0f, 1.0f);
        }
    }

    @Inject(method = "renderWorld", at = @At("TAIL"))
    private void afterWorldRender(float tickDelta, long limitTime, MatrixStack matrices, CallbackInfo ci) {
//        RenderSystem.setShaderColor(1.0f, 1.0f, 1.0f, 1.0f);
    }
}
