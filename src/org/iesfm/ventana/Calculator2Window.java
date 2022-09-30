package org.iesfm.ventana;

import javax.swing.*;
import java.awt.*;

public class Calculator2Window {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setBounds(10, 10, 300, 300);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel(new BorderLayout());

        JPanel buttonPanel = new JPanel(new BorderLayout(10, 10));
        buttonPanel.setBackground(Color.GRAY);
        buttonPanel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));

        JPanel buttonPanel1 = new JPanel(new GridLayout(4, 4, 10, 10));
        buttonPanel1.setOpaque(false);

        JPanel buttonPanel2 = new JPanel(new GridLayout(1, 2, 10, 10));
        buttonPanel2.setPreferredSize(new Dimension(50, 50));
        buttonPanel2.setOpaque(false);

        JButton button = new JButton("7");
        buttonPanel1.add(button);
        JButton button1 = new JButton("8");
        buttonPanel1.add(button1);
        JButton button2 = new JButton("9");
        buttonPanel1.add(button2);
        JButton button3 = new JButton("DEL");
        button3.setBackground(Color.CYAN);
        buttonPanel1.add(button3);

        JButton button4 = new JButton("4");
        buttonPanel1.add(button4);
        JButton button5 = new JButton("5");
        buttonPanel1.add(button5);
        JButton button6 = new JButton("6");
        buttonPanel1.add(button6);
        JButton button7 = new JButton("+");
        buttonPanel1.add(button7);

        JButton button8 = new JButton("1");
        buttonPanel1.add(button8);
        JButton button9 = new JButton("2");
        buttonPanel1.add(button9);
        JButton button10 = new JButton("3");
        buttonPanel1.add(button10);
        JButton button11 = new JButton("-");
        buttonPanel1.add(button11);

        JButton button12 = new JButton(".");
        buttonPanel1.add(button12);
        JButton button13 = new JButton("0");
        buttonPanel1.add(button13);
        JButton button14 = new JButton("/");
        buttonPanel1.add(button14);
        JButton button15 = new JButton("x");
        buttonPanel1.add(button15);

        JButton button16 = new JButton("RESET");
        button16.setBackground(Color.CYAN);
        buttonPanel2.add(button16);
        JButton button17 = new JButton("=");
        button17.setBackground(Color.ORANGE);
        buttonPanel2.add(button17);

        buttonPanel.add(buttonPanel1, BorderLayout.CENTER);
        buttonPanel.add(buttonPanel2, BorderLayout.SOUTH);


        JPanel panel2 = new JPanel();

        JTextField textField = new JTextField("0", 16);

        panel2.add(textField);

        mainPanel.add(panel2, BorderLayout.NORTH);
        mainPanel.add(buttonPanel, BorderLayout.CENTER);

        f.setTitle("Calculadora");
        f.setContentPane(mainPanel);
        f.repaint();
        f.revalidate();
    }
}
