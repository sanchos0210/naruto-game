package org.example;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImageLoader {

    public static BufferedImage loadImage(String fileName)
    {
        BufferedImage bi = null;
        //System.err.println("....setimg...." + fileName);

        try {
            bi = ImageIO.read(new File(fileName));

        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Image could not be read");
            System.exit(1);
        }

        return bi;
    }
}
