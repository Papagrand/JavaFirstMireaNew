package ru.mirea.task16;

import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JMenu;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

public class TextColour extends JFrame {
    private static final int WINDOW_WIDTH = 1000;
    private static final int WINDOW_HEIGHT = 600;
    public TextColour() {
        super("Text Editor");
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setLayout(null);
        JMenuBar menuBar = new JMenuBar();
        JMenu fontOption = new JMenu("Fonts");
        JMenu fontColor = new JMenu("Color");
        JMenuItem[] families = {
                new JMenuItem("Times New Roman"),
                new JMenuItem("MS Sans Serif"),
                new JMenuItem("Courier New")
        };
        JMenuItem[] colors = {
                new JMenuItem("Pink"), new JMenuItem("Yellow"), new JMenuItem("black")
        };
        JTextArea textArea = new JTextArea();
        JScrollPane scrollBar = new JScrollPane(textArea);
        menuBar.setBounds(0, 0, WINDOW_WIDTH, 30);
        fontOption.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        fontColor.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        textArea.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        scrollBar.setBounds(0, menuBar.getHeight(), WINDOW_WIDTH, WINDOW_HEIGHT - menuBar.getHeight());
        for (JMenuItem item : families) {
            item.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    String fontName = item.getText();
                    textArea.setFont(new Font(fontName, Font.PLAIN, 14));
                }
            });
            fontOption.add(item);
        }
        for (JMenuItem item : colors) {
            item.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    String fontName = item.getText();
                    textArea.setFont(new Font(fontName, Font.PLAIN, 14));
                }
            });
            fontOption.add(item);
        }
        for (JMenuItem item : colors) {
            item.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    String color = item.getText();
                    Color colorToSet;
                    if (color.equals("Pink")) {
                        colorToSet = Color.PINK;
                    }
                    else if (color.equals("Yellow")) {
                        colorToSet = Color.YELLOW;
                    }
                    else {
                        colorToSet = Color.BLACK;
                    }
                    textArea.setForeground(colorToSet);
                }
            });
            fontColor.add(item);
        }
        menuBar.add(fontOption);
        menuBar.add(fontColor);
        add(menuBar);
        add(scrollBar);
    }
    public static void main(String[] args) {
        TextColour window = new TextColour();
        window.setVisible(true);
        window.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}