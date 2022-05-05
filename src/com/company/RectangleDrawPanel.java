package com.company;

import javax.swing.*;
import java.awt.*;

public class RectangleDrawPanel extends JPanel {
    private Color backgroundColor;
    private int height = 50;
    private int width = 80;
    private int xAxisPosition = 50;
    private int yAxisPosition = 50;

    @Override
    public void paintComponent (Graphics g){
        super.paintComponent(g);

        g.setColor(backgroundColor);
        g.fillRect(xAxisPosition,yAxisPosition,width,height);
    }

    public void randomColorGenerator(){
        int redColorValue = randomNumberGenerator();
        int greenColorValue = randomNumberGenerator();
        int blueColorValue = randomNumberGenerator();
        backgroundColor = new Color(redColorValue,greenColorValue,blueColorValue);

    }

    public void randomSizeGenerator(){
        int displace = 5;
        height = (int)(Math.random()*getHeight());
        width = (int)(Math.random()*getWidth());

        int temp;
        if ((yAxisPosition + height) > getHeight()){  // this to keep all of the height of the rectangle inside the draw panel
            temp = getHeight() - (yAxisPosition + height);
            height = height + temp - displace;  // temp is a negative number
        }
        if (height < 5) height = 5;//minimum height

        if ((xAxisPosition + width) > getWidth()){  // this to keep all of the width of the rectangle inside the draw panel
            temp = getWidth() - (xAxisPosition + width);
            width = width + temp - displace;  // temp is a negative number
        }
        if (width < 5) width = 5; //minimum width
    }
    public static int randomNumberGenerator(){
        return  (int)(Math.random()*255);
    }

    public static void repaintPanel(JPanel jPanel){
        jPanel.repaint();
    }
}
