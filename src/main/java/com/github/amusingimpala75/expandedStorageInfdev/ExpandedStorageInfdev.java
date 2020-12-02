package com.github.amusingimpala75.expandedStorageInfdev;

import com.github.amusingimpala75.expandedStorageInfdev.block.BaseExpandedChest;
import com.github.amusingimpala75.expandedStorageInfdev.block.entity.BaseExpandedChestEntity;
import com.github.amusingimpala75.expandedStorageInfdev.mixin.TileEntityRegistryInvoker;
import net.fabricmc.api.ModInitializer;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;

public class ExpandedStorageInfdev implements ModInitializer {
    public static int currentChestRegistryId;
    public static boolean registeringCustomChest = false;
    public static Block IRON_CHEST;
    public static Item IRON_CHEST_ITEM;
    public static Block GOLD_CHEST;
    public static Item GOLD_CHEST_ITEM;
    public static Block DIAMOND_CHEST;
    public static Item DIAMOND_CHEST_ITEM;
    public static Block OBSIDIAN_CHEST;
    public static Item OBSIDIAN_CHEST_ITEM;

    //TODO: FIX TEXTURES
    @Override
    public void onInitialize() {
        //Iron Chest - 54 stacks
        IRON_CHEST = registerBaseChest(110, 54, 186, "/gui/container.png", false);
        IRON_CHEST_ITEM = registerItemFromBlock(IRON_CHEST);
        //Gold Chest - 81 stacks
        GOLD_CHEST = registerBaseChest(111, 81, 189, "/assets/expandedStorage/container9x9.png", false);
        GOLD_CHEST_ITEM = registerItemFromBlock(GOLD_CHEST);
        //Diamond Chest - 108 stacks
        DIAMOND_CHEST = registerBaseChest(112, 108, 192, "/assets/expandedStorage/container9x12.png", false);
        DIAMOND_CHEST_ITEM = registerItemFromBlock(DIAMOND_CHEST);
        //Obsidian Chest - diamond but blast resistant
        OBSIDIAN_CHEST = registerBaseChest(113, 108, 195, "/assets/expandedStorage/container9x12.png", true);
        OBSIDIAN_CHEST_ITEM = registerItemFromBlock(OBSIDIAN_CHEST);
        TileEntityRegistryInvoker.invokeRegister(BaseExpandedChestEntity.class, "baseExpandedChestEntity");
    }

    public static Block registerBaseChest(int id, int slots, int textureIndex, String textureLocation, boolean blastResistant) {
        currentChestRegistryId = id;
        registeringCustomChest = true;
        Block chest = new BaseExpandedChest(id, slots, textureIndex, textureLocation, blastResistant);
        registeringCustomChest = false;
        return chest;
    }
    public static Item registerItemFromBlock(Block block) {
        int var2 = block.id;
        if (Block.BLOCKS[var2] != null) {
            return Item.ITEMS[var2] = new BlockItem(var2 - 256);
        }
        return null;
    }
}
