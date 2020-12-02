package com.github.amusingimpala75.expandedStorageInfdev.mixin;

import com.github.amusingimpala75.expandedStorageInfdev.ExpandedStorageInfdev;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.recipe.RecipeDispatcher;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(RecipeDispatcher.class)
public abstract class RecipeMixin {
    @Shadow abstract void addShapedRecipe(ItemStack output, Object... args);

    @Inject(at=@At("TAIL"), method = "<init>")
    public void addRecipes(CallbackInfo info) {
        addShapedRecipe(new ItemStack(ExpandedStorageInfdev.IRON_CHEST, 1), "###", "#@#", "###", '#', Item.IRON_INGOT, '@', Block.CHEST);
        addShapedRecipe(new ItemStack(ExpandedStorageInfdev.GOLD_CHEST, 1), "###", "#@#", "###", '#', Item.GOLD_INGOT, '@', ExpandedStorageInfdev.IRON_CHEST);
        addShapedRecipe(new ItemStack(ExpandedStorageInfdev.DIAMOND_CHEST, 1), "###", "#@#", "###", '#', Item.DIAMOND, '@', ExpandedStorageInfdev.GOLD_CHEST);
        addShapedRecipe(new ItemStack(ExpandedStorageInfdev.OBSIDIAN_CHEST, 1), "###", "#@#", "###", '#', Block.OBSIDIAN, '@', ExpandedStorageInfdev.DIAMOND_CHEST);
        //TODO: CONVENIENCE RECIPES!! REMOVE IN PRODUCTION
        addShapedRecipe(new ItemStack(Item.IRON_INGOT, 8), "#", '#', Item.STICK);
        addShapedRecipe(new ItemStack(Item.GOLD_INGOT, 8), "###", '#', Item.STICK);
        addShapedRecipe(new ItemStack(Item.DIAMOND, 8), "#  ", "#  ", "#  ", '#', Item.STICK);
        addShapedRecipe(new ItemStack(Block.OBSIDIAN, 8), "#  ", " # ", "  #", '#', Item.STICK);
    }
}
