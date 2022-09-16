package org.iesfm.ventana;

import javax.swing.*;
import java.awt.*;

public class main {
    public static void main(String[] args) {
        JFrame f  = new JFrame();
        f.setBounds(10, 10, 200, 300);
        f.setVisible(true);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel();
        mainPanel.setBackground(Color.WHITE);
        mainPanel.setLayout(null);

        JLabel label = new JLabel("Usuario");
        mainPanel.add(label);

        JTextField t = new JTextField(16);
        mainPanel.add(t);

        JButton b = new JButton("Aceptar");
        mainPanel.add(b);

        f.setContentPane(mainPanel);


    }
}
