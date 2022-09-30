package org.iesfm.ventana;

import javax.swing.*;
import java.awt.*;

public class CalculatorWindow {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setBounds(10, 10, 500, 300);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel(new BorderLayout());

        JPanel panel1 = new JPanel();

        GridLayout gridLayout = new GridLayout(5, 4, 10, 10);

        panel1.setLayout(gridLayout);

        JButton button = new JButton("Rtc");
        panel1.add(button);
        JButton button1 = new JButton("CE");
        panel1.add(button1);
        JButton button2 = new JButton("CL");
        panel1.add(button2);
        JButton button3 = new JButton("+/-");
        panel1.add(button3);
        JButton button4 = new JButton("7");
        panel1.add(button4);

        JButton button5 = new JButton("8");
        panel1.add(button5);
        JButton button6 = new JButton("9");
        panel1.add(button6);
        JButton button7 = new JButton("/");
        panel1.add(button7);
        JButton button8 = new JButton("4");
        panel1.add(button8);
        JButton button9 = new JButton("5");
        panel1.add(button9);

        JButton button10 = new JButton("6");
        panel1.add(button10);
        JButton button11 = new JButton("x");
        panel1.add(button11);
        JButton button12 = new JButton("1");
        panel1.add(button12);
        JButton button13 = new JButton("2");
        panel1.add(button13);
        JButton button14 = new JButton("3");
        panel1.add(button14);

        JButton button15 = new JButton("-");
        panel1.add(button15);
        JButton button16 = new JButton("0");
        panel1.add(button16);
        JButton button17 = new JButton(".");
        panel1.add(button17);
        JButton button18 = new JButton("=");
        panel1.add(button18);
        JButton button19 = new JButton("+");
        panel1.add(button19);

        JPanel panel2 = new JPanel();

        JTextField textField = new JTextField(30);
        panel2.add(textField);

        mainPanel.add(panel2, BorderLayout.NORTH);
        mainPanel.add(panel1, BorderLayout.CENTER);

        f.setTitle("Calculadora");
        f.setContentPane(mainPanel);
        f.repaint();
        f.revalidate();
    }
}
