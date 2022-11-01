package ru.mirea.task12;
import javax.swing.*;
import java.awt.*;
public class Animated {
    public static void main(String[] args) {
        String path=args[0];
        JFrame frame = new JFrame("Gif");
        frame.setSize(420,455);
        JLabel jlabel =new JLabel("");
        Image image =Toolkit.getDefaultToolkit().createImage(path);
        ImageIcon imageIcon= new ImageIcon(image);
        imageIcon.setImageObserver(jlabel);
        jlabel.setIcon(imageIcon);
        frame.add(jlabel);
        frame.setVisible(true);
    }
}