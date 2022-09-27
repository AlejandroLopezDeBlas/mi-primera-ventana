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
        mainpanel.setLayout(new BorderLayout(10, 10));

        JButton northButton = new JButton("Hide North Border");
        mainpanel.add(northButton, BorderLayout.NORTH);
        JButton southButton = new JButton("Hide South Border");
        mainpanel.add(southButton, BorderLayout.SOUTH);
        JButton centerButton = new JButton("Hide Center Border");
        mainpanel.add(centerButton, BorderLayout.CENTER);
        JButton westButton = new JButton("Hide West Border");
        mainpanel.add(westButton, BorderLayout.WEST);
        JButton eastButton = new JButton("Hide East Border");
        mainpanel.add(eastButton, BorderLayout.EAST);

        f.setContentPane(mainpanel);
        f.repaint();
        f.revalidate();
    }
}
