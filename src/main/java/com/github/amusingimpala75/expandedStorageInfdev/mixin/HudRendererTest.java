package com.github.amusingimpala75.expandedStorageInfdev.mixin;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawableHelper;
import net.minecraft.client.gui.screen.HudRenderer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(HudRenderer.class)
public abstract class HudRendererTest extends DrawableHelper {
    @Shadow private MinecraftClient mc;
    //@Shadow protected abstract static void method_594();

    //@Inject(at=@At(value = "INVOKE", target = "Lnet/minecraft/client/gui/DrawableHelper;method_594(IIIIII)V", ordinal = 9), method = "render", cancellable = true)
    //@Inject(method = "render", at=@At(value = "INVOKE", target = "Lnet/minecraft/client/gui/screen/HudRenderer;method_594(IIIIII)V"), cancellable = true)
    //public void testPlayerAccess(float f, CallbackInfo info) {
        //System.out.println(this.mc.player.dead);
    //    if (true) {
    //        info.cancel();
    //    }
    //}
    //@Inject(at=@At(value = "INVOKE", target = "Lnet/minecraft/client/gui/screen/HudRenderer;method_594(IIIIII)V", ordinal = 10), method = "render", cancellable = true)
    //public void testPlayerAccess2(float f, CallbackInfo info) {
        //System.out.println(this.mc.player.dead);
    //    if (true) {
    //        info.cancel();
    //    }
    //}
    /*@Redirect(at=@At(value = "INVOKE", target = "Lnet/minecraft/client/gui/screen/HudRenderer;method_594(IIIIII)V", ordinal = 9), method = "render")
    public void testPlayerAccess(HudRenderer rend, int i, int j, int k, int h, int l, int d) {
        if (mc.player.isCreative()) {

        } else {
            super.method_594(i,j,k,h,l,d);
        }
    }
    @Redirect(at=@At(value = "INVOKE", target = "Lnet/minecraft/client/gui/screen/HudRenderer;method_594(IIIIII)V", ordinal = 10), method = "render")
    public void testPlayerAccess2(HudRenderer rend, int i, int j, int k, int h, int l, int d) {
        if (mc.player.isCreative()) {

        } else {
            super.method_594(i,j,k,h,l,d);
        }
    }
    @Redirect(at=@At(value = "INVOKE", target = "Lnet/minecraft/client/gui/screen/HudRenderer;method_594(IIIIII)V", ordinal = 6), method = "render")
    public void testPlayerAccess3(HudRenderer rend, int i, int j, int k, int h, int l, int d) {
        if (mc.player.isCreative()) {

        } else {
            super.method_594(i,j,k,h,l,d);
        }
    }*/
}
