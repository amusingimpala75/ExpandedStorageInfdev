package com.github.amusingimpala75.expandedStorageInfdev.mixin;

import com.github.amusingimpala75.expandedStorageInfdev.ExpandedStorageInfdev;
import com.github.amusingimpala75.expandedStorageInfdev.block.BaseExpandedChest;
import net.minecraft.block.Chest;
import net.minecraft.block.Material;
import net.minecraft.block.TileEntityBlock;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(Chest.class)
public abstract class ChestFreeIdMixin extends TileEntityBlock {
    protected ChestFreeIdMixin(int i, Material material) {
        super(i, material);
    }

    @ModifyConstant(method = "<init>", constant = @Constant(intValue = 54))
    private static int dynamic(int oldValue) {
        return (ExpandedStorageInfdev.registeringCustomChest) ? ExpandedStorageInfdev.currentChestRegistryId : oldValue;
    }
}
