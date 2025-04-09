package com.gamedev.game.graphics;

public class Render {
    public final int width;
    public final int height;
    public final int[] pixels;

    /**
     * Initializes the pixels array, which is every pixel in the window, or <i>width</i> times <i>height</i>, both inherited from <b>Display()</b> parent in the <i>Display.java</i> class.
     * @param width Inherited from Display() parent class
     * @param height Inherited from Display() parent class
     */
    public Render(int width, int height) {
        this.width = width;
        this.height = height;
        pixels = new int[width * height];
    }

    /**
     * 
     * @param render
     * @param xOffs 
     * @param yOffs
     */
    public void draw(Render render, int xOffs, int yOffs) {
        for (int y = 0; y < render.height; y++) {
            int yPix = y + yOffs;
            for (int x = 0; x < render.width; x++) {
                int xPix = x + xOffs;

                pixels[xPix + yPix * width] = render.pixels[x + y * render.width];
            }
        }
    }

}
