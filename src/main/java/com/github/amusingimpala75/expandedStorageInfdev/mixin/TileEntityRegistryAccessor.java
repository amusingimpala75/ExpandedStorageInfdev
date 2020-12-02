package com.github.amusingimpala75.expandedStorageInfdev.mixin;

import net.minecraft.block.tile.TileEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

import java.util.Map;

@Mixin(TileEntity.class)
public interface TileEntityRegistryAccessor {
    @Accessor
    static Map getNAMES_BY_CLASSES() {
        throw new AssertionError();
    }
}
