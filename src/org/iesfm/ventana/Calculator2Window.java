package org.iesfm.ventana;

import javax.swing.*;
import java.awt.*;

public class Calculator2Window {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setBounds(10, 10, 200, 300);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel();

        JPanel buttonPanel = new JPanel();

        buttonPanel.setLayout(new BorderLayout());

        JPanel buttonPanel1 = new JPanel();

        JPanel buttonPanel2 = new JPanel();

        GridLayout gridLayout = new GridLayout(5, 4);
        gridLayout.setVgap(10);
        gridLayout.setHgap(10);

        GridLayout gridLayout1 = new GridLayout(1, 2);
        gridLayout1.setVgap(10);
        gridLayout1.setHgap(10);

        buttonPanel1.setLayout(gridLayout);
        buttonPanel2.setLayout(gridLayout1);

        JButton button = new JButton("7");
        buttonPanel1.add(button, gridLayout);
        JButton button1 = new JButton("8");
        buttonPanel1.add(button1, gridLayout);
        JButton button2 = new JButton("9");
        buttonPanel1.add(button2, gridLayout);
        JButton button3 = new JButton("DEL");
        button3.setBackground(Color.CYAN);
        buttonPanel1.add(button3, gridLayout);
        JButton button4 = new JButton("4");
        buttonPanel1.add(button4, gridLayout);
        JButton button5 = new JButton("5");
        buttonPanel1.add(button5, gridLayout);
        JButton button6 = new JButton("6");
        buttonPanel1.add(button6, gridLayout);
        JButton button7 = new JButton("+");
        buttonPanel1.add(button7, gridLayout);
        JButton button8 = new JButton("1");
        buttonPanel1.add(button8, gridLayout);
        JButton button9 = new JButton("2");
        buttonPanel1.add(button9, gridLayout);
        JButton button10 = new JButton("3");
        buttonPanel1.add(button10, gridLayout);
        JButton button11 = new JButton("-");
        buttonPanel1.add(button11, gridLayout);
        JButton button12 = new JButton(".");
        buttonPanel1.add(button12, gridLayout);
        JButton button13 = new JButton("0");
        buttonPanel1.add(button13, gridLayout);
        JButton button14 = new JButton("/");
        buttonPanel1.add(button14, gridLayout);
        JButton button15 = new JButton("x");
        buttonPanel1.add(button15, gridLayout);
        JButton button16 = new JButton("RESET");
        button16.setBackground(Color.CYAN);
        buttonPanel2.add(button16, gridLayout1);
        JButton button17 = new JButton("=");
        button17.setBackground(Color.ORANGE);
        buttonPanel2.add(button17, gridLayout1);

        buttonPanel.add(buttonPanel1, BorderLayout.NORTH);
        buttonPanel.add(buttonPanel2, BorderLayout.CENTER);


        JPanel panel2 = new JPanel();

        JTextField textField = new JTextField("0", 16);

        panel2.add(textField);

        mainPanel.add(panel2, BorderLayout.NORTH);
        mainPanel.add(buttonPanel, BorderLayout.CENTER);

        f.setContentPane(mainPanel);
        f.repaint();
        f.revalidate();
    }
}
