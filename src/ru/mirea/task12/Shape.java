package ru.mirea.task12;

import javax.swing.JComponent;
import java.awt.*;

public abstract class Shape extends JComponent{
    protected int x, y;
    protected Color color;

    public Shape(int x, int y, Color color) {
        super();
        this.x = x;
        this.y = y;
        this.color = color;
        this.setLocation(x, y);
        this.setVisible(true);
        this.setOpaque(false);
    }

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
    };
}
