package com.company;

import javax.swing.*;
import java.awt.*;

public class RandomRectangleGUI {
    private JFrame frame;
    private JButton colorButton;
    private JButton sizeButton;

    RectangleDrawPanel rectDrawPanel = new RectangleDrawPanel();

    public void createFrame() {
        frame = new JFrame("RectanglePlayFrame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);

        colorButton = new JButton("Click me for a random colour");
        sizeButton = new JButton("Click me for a random size");

        frame.getContentPane().add(BorderLayout.PAGE_START, colorButton);
        frame.getContentPane().add(BorderLayout.PAGE_END, sizeButton);
        frame.getContentPane().add(BorderLayout.CENTER, rectDrawPanel);

        colorButton.addActionListener(new RandomColorListener());
        sizeButton.addActionListener(new RandomSizeListener());
        rectDrawPanel.repaint();
        frame.setVisible(true);
        //System.out.println("I create frame in rect gui class");
    }
}
