package org.iesfm.ventana;

import javax.swing.*;
import java.awt.*;

public class MyBorderLayoutWindow {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setBounds(10, 10, 200, 300);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainpanel = new JPanel();

        BorderLayout layoutNorth = new BorderLayout();
        mainpanel.setLayout(layoutNorth);
        BorderLayout layoutSouth = new BorderLayout();
        mainpanel.setLayout(layoutSouth);
        BorderLayout layoutEast = new BorderLayout();
        mainpanel.setLayout(layoutEast);
        BorderLayout layoutWest = new BorderLayout();
        mainpanel.setLayout(layoutWest);
        BorderLayout layoutCenter = new BorderLayout();
        mainpanel.setLayout(layoutCenter);
    }
}
