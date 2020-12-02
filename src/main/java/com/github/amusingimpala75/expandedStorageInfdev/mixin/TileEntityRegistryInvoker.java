package com.github.amusingimpala75.expandedStorageInfdev.mixin;

import net.minecraft.block.tile.TileEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin(TileEntity.class)
public interface TileEntityRegistryInvoker {
    @Invoker
    static void invokeRegister(Class klass, String name) {
        throw new AssertionError();
    }
}
