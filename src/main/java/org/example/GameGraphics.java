package org.example;

import java.awt.*;
import java.awt.image.BufferedImage;

public class GameGraphics extends Canvas {
    private static final BufferedImage BACKGROUND = ImageLoader.loadImage("src/main/resources/background.jpg");
    private static final BufferedImage NARUTO = ImageLoader.loadImage("src/main/resources/naruto.png");
    private static final BufferedImage SHIT = ImageLoader.loadImage("src/main/resources/shit.png");
    private int offset = 0;
    private int narutoY;

    public GameGraphics() {
        this.narutoY = 280;
    }

    public void setNarutoY(int narutoY) {
        this.narutoY = narutoY;
    }

    public void paint(Graphics g) {
        g.drawImage(BACKGROUND, 0, 0, 500, 500, null);
        drawNaruto(g);
    }

    void drawStone() {
        var g = getGraphics();
        int shitX = 330 - offset;
        if (offset < 300) {
            offset += 30;
        } else {
            offset = 0;
        }
        g.drawImage(SHIT, shitX, 420, 30, 30, null);

    }

    void drawNaruto(Graphics g) {
        g.drawImage(NARUTO, -70, narutoY, null);
    }
}
