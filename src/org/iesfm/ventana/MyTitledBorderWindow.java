package org.iesfm.ventana;

import javax.swing.*;
import java.awt.*;

public class MyTitledBorderWindow {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setBounds(10, 10, 200, 300);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();


        JPanel mainpanel = new JPanel();
        panel.setBounds(40, 40, 400, 100);

        panel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.gray, 10, true), "Search"));

        JRadioButton boton1 = new JRadioButton("By Name");

        JRadioButton boton2 = new JRadioButton("By ID");

        ButtonGroup grupo = new ButtonGroup();

        mainpanel.add(panel);

        grupo.add(boton1);
        grupo.add(boton2);

        panel.add(boton1);
        panel.add(boton2);

        f.setContentPane(mainpanel);
        f.repaint();
        f.revalidate();
    }
}
