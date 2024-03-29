package simpleobjects;

import goo.Goo;
import java.awt.Graphics;

class GooDropColor extends Goo {

    Drop bDrop;

    public GooDropColor (int width, int height) {

        super(width, height);

        int xpos = width/2;
        int ypos = 0;
        int xvel = 0;
        int yvel = 2;
        int size = 30;

        bDrop = new BlueDrop(xpos, ypos, xvel, yvel, size);
    }

    public void draw(Graphics g) {

        bDrop.move(getWidth(), getHeight());
        bDrop.draw(g);
    }
}