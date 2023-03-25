package org.example;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        GameGraphics gameGraphics = new GameGraphics();
        JFrame f = new JFrame();

        f.add(gameGraphics);
        f.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
                gameGraphics.setNarutoY(180);
                gameGraphics.update(gameGraphics.getGraphics());

                try {
                    Thread.sleep(900);
                } catch (InterruptedException ex) {
                    throw new RuntimeException(ex);
                }

                gameGraphics.setNarutoY(280);
                gameGraphics.update(gameGraphics.getGraphics());
            }

            @Override
            public void keyReleased(KeyEvent e) {
            }
        });

        f.setSize(500, 500);
        //f.setLayout(null);
        f.setVisible(true);

        Thread.sleep(2000);

        Executors.newSingleThreadExecutor().submit(() -> {
            while (true) {
                gameGraphics.drawStone();
                Thread.sleep(200);
                gameGraphics.update(gameGraphics.getGraphics());
            }
        });
    }
}
