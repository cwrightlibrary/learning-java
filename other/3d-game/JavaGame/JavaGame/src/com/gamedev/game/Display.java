package com.gamedev.game;

import java.awt.image.BufferedImage;
import java.awt.image.BufferStrategy;
import java.awt.Canvas;
import java.awt.image.DataBufferInt;
import java.awt.Graphics;
import javax.swing.JFrame;

import com.gamedev.game.graphics.Render;
import com.gamedev.game.graphics.Screen;

public class Display extends Canvas implements Runnable {
    public static final int WIDTH = 800;
    public static final int HEIGHT = 600;
    public static final String TITLE = "Game Pre-Alpha";

    private Thread thread;
    private Screen screen;
    private BufferedImage img;
    private boolean running = false;
    private Render render;
    private int[] pixels;

    public Display() {
        screen = new Screen(WIDTH, HEIGHT);
        img = new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_RGB);
        pixels = ((DataBufferInt) img.getRaster().getDataBuffer()).getData();
    }

    /**
     * Starts the game loop and the thread if not already running.
     */
    private void start() {
        if (running)
            return;
        running = true;
        thread = new Thread(this);
        thread.start();
    }

    /**
     * Stops the game loop and thread if running (for use when turning game into an
     * applet later).
     */
    private void stop() {
        if (!running)
            return;
        running = false;
        try {
            thread.join();
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(0);
        }
    }

    /**
     * Game loop
     */
    public void run() {
        while (running) {
            tick();
            render();
        }
    }

    private void tick() {

    }

    private void render() {
        BufferStrategy bs = this.getBufferStrategy();
        if (bs == null) {
            createBufferStrategy(3);
            return;
        }

        screen.render();

        for (int i = 0; i < WIDTH * HEIGHT; i++) {
            pixels[i] = screen.pixels[i];
        }

        Graphics g = bs.getDrawGraphics();
        g.drawImage(img, 0, 0, WIDTH, HEIGHT, null);
        g.dispose();
        bs.show();
    }

    public static void main(String[] args) {
        Display game = new Display();
        JFrame frame = new JFrame();
        frame.add(game);
        frame.pack();
        frame.setTitle(TITLE);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(WIDTH, HEIGHT);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setVisible(true);

        game.start();
    }
}
