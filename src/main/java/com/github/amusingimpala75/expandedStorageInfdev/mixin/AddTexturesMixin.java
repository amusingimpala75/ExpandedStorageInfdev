package com.github.amusingimpala75.expandedStorageInfdev.mixin;

import com.github.amusingimpala75.expandedStorageInfdev.resource.BasicCustomTexture;
import net.minecraft.client.resource.TextureManager;
import net.minecraft.world.ClientWorldManager;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(ClientWorldManager.class)
public class AddTexturesMixin {
    @Shadow private TextureManager textureManager;

    @Inject(at=@At("TAIL"), method = "<init>")
    public void addTextures(CallbackInfo info) {
        this.textureManager.registerDynamicTexture(new BasicCustomTexture(185, "/assets/expandedStorage/iron_chest_top.png"));
        this.textureManager.registerDynamicTexture(new BasicCustomTexture(186, "/assets/expandedStorage/iron_chest_side.png"));
        this.textureManager.registerDynamicTexture(new BasicCustomTexture(187, "/assets/expandedStorage/iron_chest_front.png"));
        this.textureManager.registerDynamicTexture(new BasicCustomTexture(188, "/assets/expandedStorage/gold_chest_top.png"));
        this.textureManager.registerDynamicTexture(new BasicCustomTexture(189, "/assets/expandedStorage/gold_chest_side.png"));
        this.textureManager.registerDynamicTexture(new BasicCustomTexture(190, "/assets/expandedStorage/gold_chest_front.png"));
        this.textureManager.registerDynamicTexture(new BasicCustomTexture(191, "/assets/expandedStorage/diamond_chest_top.png"));
        this.textureManager.registerDynamicTexture(new BasicCustomTexture(192, "/assets/expandedStorage/diamond_chest_side.png"));
        this.textureManager.registerDynamicTexture(new BasicCustomTexture(193, "/assets/expandedStorage/diamond_chest_front.png"));
        this.textureManager.registerDynamicTexture(new BasicCustomTexture(194, "/assets/expandedStorage/obsidian_chest_top.png"));
        this.textureManager.registerDynamicTexture(new BasicCustomTexture(195, "/assets/expandedStorage/obsidian_chest_side.png"));
        this.textureManager.registerDynamicTexture(new BasicCustomTexture(196, "/assets/expandedStorage/obsidian_chest_front.png"));
    }
}
