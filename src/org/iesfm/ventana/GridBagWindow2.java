package org.iesfm.ventana;

import javax.swing.*;
import java.awt.*;

public class GridBagWindow2 {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setBounds(10, 10, 400, 300);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setTitle("Ejemplo 1 GridBagLayout");

        JPanel mainpanel = new JPanel(new GridBagLayout());

        mainpanel.add(new JButton("Boton 1"), new GridBagConstraints(
                2,
                0,
                1,
                1,
                4.0,
                4.0,
                GridBagConstraints.NORTH,
                GridBagConstraints.HORIZONTAL,
                new Insets(0, 0, 0, 0),
                0,
                0
        ));
        mainpanel.add(new JButton("Boton 2"), new GridBagConstraints(
                2,
                1,
                1,
                1,
                4.0,
                4.0,
                GridBagConstraints.NORTH,
                GridBagConstraints.HORIZONTAL,
                new Insets(0, 0, 0, 0),
                0,
                0
        ));
        mainpanel.add(new JButton("Boton 3"), new GridBagConstraints(
                0,
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
        mainpanel.add(new JButton("Boton 4"), new GridBagConstraints(
                2,
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
        mainpanel.add(new JTextField("Campo texto", 16), new GridBagConstraints(
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
        mainpanel.add(new JTextArea("Area texto",2, 2), new GridBagConstraints(
                0,
                0,
                2,
                2,
                8.0,
                8.0,
                GridBagConstraints.CENTER,
                GridBagConstraints.BOTH,
                new Insets(5, 5, 5, 5),
                0,
                0
        ));


        f.setContentPane(mainpanel);
        f.repaint();
        f.revalidate();
    }
}
