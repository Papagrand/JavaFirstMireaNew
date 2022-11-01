package ru.mirea.task12;

import java.awt.*;

class Circle extends Shape {
    private int radius;

    Circle(int x, int y, int radius, Color color) {
        super(x, y, color);
        this.radius=radius;
        this.setSize(radius, radius);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(this.color);
        g.fillOval(0,0, radius, radius);
    }
}