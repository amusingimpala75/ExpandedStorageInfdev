package com.github.amusingimpala75.expandedStorageInfdev.mixin;

import net.minecraft.block.tile.TileEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(TileEntity.class)
public class TileEntityRegistry {

    //@Inject(at=@At("TAIL"), method = "y")
    //public void registerMine(CallbackInfo info) {
//
    //}

}
