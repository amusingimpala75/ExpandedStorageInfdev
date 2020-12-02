package com.github.amusingimpala75.expandedStorageInfdev.block;

import com.github.amusingimpala75.expandedStorageInfdev.block.entity.BaseExpandedChestEntity;
import com.github.amusingimpala75.expandedStorageInfdev.client.ExpandedStorageScreen;
import com.github.amusingimpala75.expandedStorageInfdev.duck.PlayerDuck;
import net.minecraft.block.Chest;
import net.minecraft.block.tile.TileEntity;
import net.minecraft.client.gui.screen.DoubleChestScreen;
import net.minecraft.entity.living.player.Player;
import net.minecraft.storage.DoubleInventory;
import net.minecraft.storage.Inventory;
import net.minecraft.world.World;

public class BaseExpandedChest extends Chest {

    protected int inventorySlots;
    protected String textureLocation;

    public BaseExpandedChest(int id, int inventorySlots, int textureIndex, String textureLocation, boolean blastResistant) {
        super(id);
        this.inventorySlots = inventorySlots;
        this.textureIndex = textureIndex;
        this.textureLocation = textureLocation;
        if (blastResistant) {
            method_110(20.0F);
        }
    }

    @Override
    public int getMetaTextureIndex(World world, int x, int y, int z, int side) {
        return super.getMetaTextureIndex(world, x, y, z, side);
    }

    @Override
    public int getTextureIndex(int side) {
        return super.getTextureIndex(side);
    }

    //TODO: FIX DOUBLE CHESTS
    @Override
    public boolean method_90(World world, int i, int j, int k) {
        return true;
    }

    @Override
    protected boolean method_68(World world, int i, int j, int k) {
        return false;
    }

    @Override
    public void onRemove(World world, int x, int y, int z) {
        super.onRemove(world, x, y, z);
    }

    @Override
    public boolean use(World world, int x, int y, int z, Player player) {
        Inventory var6 = (net.minecraft.block.tile.Chest)world.getTileEntity(x, y, z);
        /*if (world.method_286(x, y + 1, z)) {
            return true;
        } else if (world.getBlockAtPosition(x - 1, y, z) == this.id && world.method_286(x - 1, y + 1, z)) {
            return true;
        } else if (world.getBlockAtPosition(x + 1, y, z) == this.id && world.method_286(x + 1, y + 1, z)) {
            return true;
        } else if (world.getBlockAtPosition(x, y, z - 1) == this.id && world.method_286(x, y + 1, z - 1)) {
            return true;
        } else if (world.getBlockAtPosition(x, y, z + 1) == this.id && world.method_286(x, y + 1, z + 1)) {
            return true;
        } else*/ {
            /*if (world.getBlockAtPosition(x - 1, y, z) == this.id) {
                var6 = new DoubleInventory("Large chest", (net.minecraft.block.tile.Chest)world.getTileEntity(x - 1, y, z), var6);
            }

            if (world.getBlockAtPosition(x + 1, y, z) == this.id) {
                var6 = new DoubleInventory("Large chest", var6, (net.minecraft.block.tile.Chest)world.getTileEntity(x + 1, y, z));
            }

            if (world.getBlockAtPosition(x, y, z - 1) == this.id) {
                var6 = new DoubleInventory("Large chest", (net.minecraft.block.tile.Chest)world.getTileEntity(x, y, z - 1), var6);
            }

            if (world.getBlockAtPosition(x, y, z + 1) == this.id) {
                var6 = new DoubleInventory("Large chest", var6, (net.minecraft.block.tile.Chest)world.getTileEntity(x, y, z + 1));
            }*/

            ((PlayerDuck)player).openScreen(new ExpandedStorageScreen(player.inventory, var6, textureLocation));
            return true;
        }
    }

    @Override
    protected TileEntity createTileEntity() {
        return new BaseExpandedChestEntity(inventorySlots);
    }

}
