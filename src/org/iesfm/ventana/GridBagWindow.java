package org.iesfm.ventana;

import javax.swing.*;
import java.awt.*;

public class GridBagWindow {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setBounds(10, 10, 200, 300);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setTitle("GridBagLayoutDemo");

        JPanel mainpanel = new JPanel(new GridBagLayout());

        mainpanel.add(new JButton("Button 1"), new GridBagConstraints(
                0,
                0,
                1,
                1,
                1.0,
                1.0,
                GridBagConstraints.CENTER,
                GridBagConstraints.BOTH,
                new Insets(0, 0, 0, 0),
                0,
                0
        ));
        mainpanel.add(new JButton("Button 2"), new GridBagConstraints(
                1,
                0,
                1,
                1,
                1.0,
                1.0,
                GridBagConstraints.CENTER,
                GridBagConstraints.BOTH,
                new Insets(0, 0, 0, 0),
                0,
                0
        ));
        mainpanel.add(new JButton("Button 3"), new GridBagConstraints(
                2,
                0,
                1,
                1,
                1.0,
                1.0,
                GridBagConstraints.CENTER,
                GridBagConstraints.BOTH,
                new Insets(0, 0, 0, 0),
                0,
                0
        ));
        mainpanel.add(new JButton("Long named button 4"), new GridBagConstraints(
                0,
                1,
                3,
                1,
                1.0,
                4.0,
                GridBagConstraints.CENTER,
                GridBagConstraints.BOTH,
                new Insets(0, 0, 0, 0),
                0,
                0
        ));
        mainpanel.add(new JButton("5"), new GridBagConstraints(
                1,
                2,
                2,
                1,
                1.0,
                1.0,
                GridBagConstraints.SOUTH,
                GridBagConstraints.HORIZONTAL,
                new Insets(0, 0, 0, 0),
                0,
                0
        ));

        f.setContentPane(mainpanel);
        f.repaint();
        f.revalidate();
    }
}
