package org.iesfm.ventana;

import javax.swing.*;
import java.awt.*;

public class GridBagLayoutBuilder {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setBounds(10, 10, 400, 300);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setTitle("GridBagLayout Builder");

        JPanel mainpanel = new JPanel(new GridBagLayout());

        mainpanel.add(new JLabel("Full Name"), new GridBagConstraints(
                0,
                0,
                1,
                1,
                1.0,
                1.0,
                GridBagConstraints.EAST,
                GridBagConstraints.VERTICAL,
                new Insets(0, 0, 0, 5),
                0,
                0
        ));
        mainpanel.add(new JLabel("Address"), new GridBagConstraints(
                0,
                1,
                1,
                1,
                1.0,
                1.0,
                GridBagConstraints.EAST,
                GridBagConstraints.VERTICAL,
                new Insets(0, 0, 0, 5),
                0,
                0
        ));
        mainpanel.add(new JLabel("Phone"), new GridBagConstraints(
                0,
                2,
                1,
                1,
                1.0,
                1.0,
                GridBagConstraints.EAST,
                GridBagConstraints.VERTICAL,
                new Insets(0, 0, 0, 5),
                0,
                0
        ));
        mainpanel.add(new JLabel("Description"), new GridBagConstraints(
                0,
                3,
                1,
                1,
                1.0,
                1.0,
                GridBagConstraints.EAST,
                GridBagConstraints.VERTICAL,
                new Insets(0, 0, 0, 5),
                0,
                0
        ));
        mainpanel.add(new JLabel("Street"), new GridBagConstraints(
                1,
                1,
                1,
                1,
                1.0,
                1.0,
                GridBagConstraints.NORTH,
                GridBagConstraints.HORIZONTAL,
                new Insets(0, 0, 0, 0),
                0,
                0
        ));
        mainpanel.add(new JLabel("City"), new GridBagConstraints(
                2,
                1,
                1,
                1,
                1.0,
                1.0,
                GridBagConstraints.NORTH,
                GridBagConstraints.HORIZONTAL,
                new Insets(0, 0, 0, 0),
                0,
                0
        ));
        mainpanel.add(new JLabel("Zip Code"), new GridBagConstraints(
                3,
                1,
                1,
                1,
                1.0,
                1.0,
                GridBagConstraints.NORTH,
                GridBagConstraints.HORIZONTAL,
                new Insets(0, 0, 0, 0),
                0,
                0
        ));
        mainpanel.add(new JLabel("Age"), new GridBagConstraints(
                2,
                2,
                1,
                1,
                1.0,
                1.0,
                GridBagConstraints.EAST,
                GridBagConstraints.VERTICAL,
                new Insets(0, 0, 0, 10),
                0,
                0
        ));
        mainpanel.add(new JTextField(), new GridBagConstraints(
                1,
                0,
                3,
                1,
                1.0,
                1.0,
                GridBagConstraints.CENTER,
                GridBagConstraints.HORIZONTAL,
                new Insets(0, 0, 0, 20),
                0,
                0
        ));
        mainpanel.add(new JTextField(), new GridBagConstraints(
                1,
                1,
                1,
                1,
                1.0,
                1.0,
                GridBagConstraints.CENTER,
                GridBagConstraints.HORIZONTAL,
                new Insets(10, 0, 0, 0),
                0,
                0
        ));
        mainpanel.add(new JTextField(), new GridBagConstraints(
                2,
                1,
                1,
                1,
                1.0,
                1.0,
                GridBagConstraints.CENTER,
                GridBagConstraints.HORIZONTAL,
                new Insets(10, 0, 0, 0),
                0,
                0
        ));
        mainpanel.add(new JTextField(), new GridBagConstraints(
                3,
                1,
                1,
                1,
                1.0,
                1.0,
                GridBagConstraints.CENTER,
                GridBagConstraints.HORIZONTAL,
                new Insets(10, 0, 0, 20),
                0,
                0
        ));
        mainpanel.add(new JTextField(), new GridBagConstraints(
                1,
                2,
                1,
                1,
                1.0,
                1.0,
                GridBagConstraints.CENTER,
                GridBagConstraints.HORIZONTAL,
                new Insets(0, 0, 0, 0),
                0,
                0
        ));
        mainpanel.add(new JTextField(), new GridBagConstraints(
                3,
                2,
                1,
                1,
                1.0,
                1.0,
                GridBagConstraints.CENTER,
                GridBagConstraints.HORIZONTAL,
                new Insets(0, 0, 0, 20),
                0,
                0
        ));
        mainpanel.add(new JTextField(), new GridBagConstraints(
                1,
                3,
                3,
                1,
                1.0,
                4.0,
                GridBagConstraints.CENTER,
                GridBagConstraints.BOTH,
                new Insets(0, 0, 0, 20),
                0,
                0
        ));
        mainpanel.add(new JButton("Submit"), new GridBagConstraints(
                2,
                4,
                2,
                1,
                1.0,
                1.0,
                GridBagConstraints.CENTER,
                GridBagConstraints.BOTH,
                new Insets(0, 0, 0, 20),
                0,
                0
        ));

        f.setContentPane(mainpanel);
        f.repaint();
        f.revalidate();
    }
}
