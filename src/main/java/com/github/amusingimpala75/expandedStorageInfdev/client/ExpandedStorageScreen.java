package com.github.amusingimpala75.expandedStorageInfdev.client;

import net.minecraft.class_224;
import net.minecraft.client.gui.screen.GameplayScreen;
import net.minecraft.client.resource.TextureManager;
import net.minecraft.storage.Inventory;
import org.lwjgl.opengl.GL11;

@SuppressWarnings("unchecked")
public class ExpandedStorageScreen extends GameplayScreen {
    protected int rows;
    protected String textureLocation;
    //field_892:width

    public ExpandedStorageScreen(Inventory inventory, Inventory inventory2, String textureLocation) {
        this.rows = inventory2.size() / 9;
        this.textureLocation = textureLocation;
        int var4;
        int var5;
        int var3 = (this.rows - 4) * 18;
        this.field_893 = 114 + this.rows * 18;
        if (this.rows == 6) {           //Iron Chest
            //Chest Inventory
            for(var4 = 0; var4 < this.rows; ++var4) {
                for(var5 = 0; var5 < 9; ++var5) {
                    this.field_894.add(new class_224(this, inventory2, var5 + var4 * 9, 8 + var5 * 18, 18 + var4 * 18));
                }
            }

            //Top 27 of player inventory
            for(var4 = 0; var4 < 3; ++var4) {
                for(var5 = 0; var5 < 9; ++var5) {
                    this.field_894.add(new class_224(this, inventory, var5 + (var4 + 1) * 9, 8 + var5 * 18, 103 + var4 * 18 + var3));
                }
            }

            //Player hotbar
            for(var4 = 0; var4 < 9; ++var4) {
                this.field_894.add(new class_224(this, inventory, var4, 8 + var4 * 18, var3 + 161));
            }
        } else if (this.rows == 9) {    //Gold Chest
            //Chest Inventory
            for(var4 = 0; var4 < 9; ++var4) {
                for(var5 = 0; var5 < this.rows; ++var5) {
                    this.field_894.add(new class_224(this, inventory2, (var5 + (var4) * 9), (8 + var5 * 18), (18 + (var4) * 18)+4));
                }
            }

            //Top 27 of player inventory
            for(var4 = 0; var4 < 3; ++var4) {
                for(var5 = 0; var5 < 9; ++var5) {
                    this.field_894.add(new class_224(this, inventory, var5 + (var4 + 1) * 9, 8 + var5 * 18, (103 + var4 * 18 + var3)-5));
                }
            }

            //Player hotbar
            for(var4 = 0; var4 < 9; ++var4) {
                this.field_894.add(new class_224(this, inventory, var4, 8 + var4 * 18, (var3 + 161)-9));
            }
        } else if (this.rows == 12) {   //Diamond Chest and Obsidian Chest
            //Chest Inventory
            for(var4 = 0; var4 < 9; ++var4) {
                for(var5 = 0; var5 < this.rows; ++var5) {
                    this.field_894.add(new class_224(this, inventory2, /*(var5 + (var4) * 9)*/(var4 + var5 * 9), (8 + var5 * 18)-29, (((18 + (var4) * 18)+4)+8)+18));
                }
            }

            //Top 27 of player inventory
            for(var4 = 0; var4 < 3; ++var4) {
                for(var5 = 0; var5 < 9; ++var5) {
                    this.field_894.add(new class_224(this, inventory, var5 + (var4 + 1) * 9, 8 + var5 * 18, ((103 + var4 * 18 + var3)-5)-28));
                }
            }

            //Player hotbar
            for(var4 = 0; var4 < 9; ++var4) {
                this.field_894.add(new class_224(this, inventory, var4, 8 + var4 * 18, ((var3 + 161)-9)-28));
            }
        }
    }

    @Override
    protected void method_568() {
        switch (this.textureLocation) {
            case "/gui/container.png": {                                        //Iron Chest
                int var1 = this.mc.textureManager.getTextureId(textureLocation);
                GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
                TextureManager.bindTexture(var1);
                var1 = (this.screenWidth - this.field_892) / 2;
                int var2 = (this.screenHeight - this.field_893) / 2;
                this.method_594(var1, var2, 0, 0, this.field_892, (this.rows * 18 + 17));
                this.method_594(var1, var2 + this.rows * 18 + 17, 0, 126, this.field_892, 96);
                break;
            }
            case "/assets/expandedStorage/container9x9.png": {           //Gold Chest
                int var1 = this.mc.textureManager.getTextureId(textureLocation);
                GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
                TextureManager.bindTexture(var1);
                //var1 = (this.screenWidth - this.field_892) / 2;
                //int var2 = (this.screenHeight - this.field_893) / 2;
                //var2 = var2-8;  //FIX HEIGHT AND LAYOUT- good
                //this.method_594(var1, var2, 0, 0, this.field_892, (this.rows * 18 + 17));
                //this.method_594(var1, var2 + this.rows * 18 + 17, 0, 126, this.field_892, 96);
                var1 = (this.screenWidth - this.field_892) / 2;
                int var2 = (this.screenHeight - this.field_893) / 2;
                var2 += 7;
                this.method_594(var1, var2, 0, 0, this.field_892, this.field_893);
                break;
            }
            case "/assets/expandedStorage/container9x12.png": {          //Diamond Chest and Obsidian Chest
                int var1 = this.mc.textureManager.getTextureId(textureLocation);
                GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
                TextureManager.bindTexture(var1);
                var1 = (this.screenWidth - this.field_892) / 2;
                int var2 = (this.screenHeight - this.field_893) / 2;
                var2 += 33;
                var1 -= 32;
                this.method_594(var1, var2, 0, 0, this.field_892 + 58, this.field_893);
                break;
            }
        }
    }
}
