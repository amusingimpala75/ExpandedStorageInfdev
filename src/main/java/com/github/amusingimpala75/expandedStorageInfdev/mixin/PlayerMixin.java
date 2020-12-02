package com.github.amusingimpala75.expandedStorageInfdev.mixin;

import com.github.amusingimpala75.expandedStorageInfdev.duck.PlayerDuck;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.GameplayScreen;
import net.minecraft.entity.player.ClientPlayer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;

@Mixin(ClientPlayer.class)
public class PlayerMixin implements PlayerDuck {
    @Shadow private MinecraftClient client;

    @Unique
    public void openScreen(GameplayScreen screen) {
        this.client.showScreen(screen);
    }
}
