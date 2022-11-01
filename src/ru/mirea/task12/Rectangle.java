package ru.mirea.task12;

import java.awt.*;

class Rectangle extends Shape {
    private int x2, y2, length, width;
    public Rectangle(int x, int y, int width, int length, Color color){
        super(x, y, color);
        this.length=length;
        this.width=width;
        this.x2=x+length;
        this.y2=y+width;
        this.setSize(width,length);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.setBounds(x, y, width, length);
        g.setColor(this.color);
        g.fillRect(0,0,width, length);
    }
}