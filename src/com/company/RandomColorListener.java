package com.company;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static com.company.RectangleDrawPanel.repaintPanel;

public class RandomColorListener implements ActionListener {

    RectangleDrawPanel rectDrawPanel = new RectangleDrawPanel();

    public void actionPerformed(ActionEvent recColor) {
        rectDrawPanel.randomColorGenerator();
        repaintPanel(rectDrawPanel);
    }


}
