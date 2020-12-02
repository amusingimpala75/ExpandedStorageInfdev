package com.github.amusingimpala75.expandedStorageInfdev.resource;

import net.minecraft.client.render.texture.DynamicTexture;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class BasicCustomTexture extends DynamicTexture {
    BufferedImage image;

    public BasicCustomTexture(int replaceId, String filePath) {
        super(replaceId);
        try {
            this.image = ImageIO.read(BasicCustomTexture.class.getResourceAsStream(filePath));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void method_478() {
        for(int var3 = 0; var3 < 16; ++var3) {
            for(int var4 = 0; var4 < 16; ++var4) {
                int var9 = var3 + (var4 << 4);
                this.field_684[var9 << 2] = (byte)(new Color(image.getRGB(var3, var4))).getRed();
                this.field_684[(var9 << 2) + 1] = (byte)(new Color(image.getRGB(var3, var4))).getGreen();
                this.field_684[(var9 << 2) + 2] = (byte)(new Color(image.getRGB(var3, var4))).getBlue();
                this.field_684[(var9 << 2) + 3] = (byte)(new Color(image.getRGB(var3, var4))).getAlpha();
            }
        }
    }
}
