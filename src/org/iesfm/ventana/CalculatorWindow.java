package org.iesfm.ventana;

import javax.swing.*;
import java.awt.*;

public class CalculatorWindow {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setBounds(10, 10, 200, 300);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel();

        JPanel panel1 = new JPanel();

        GridLayout gridLayout = new GridLayout(5, 4);
        gridLayout.setVgap(10);
        gridLayout.setHgap(10);

        panel1.setLayout(gridLayout);

        JButton button = new JButton("Rtc");
        panel1.add(button, gridLayout);
        JButton button1 = new JButton("CE");
        panel1.add(button1, gridLayout);
        JButton button2 = new JButton("CL");
        panel1.add(button2, gridLayout);
        JButton button3 = new JButton("+/-");
        panel1.add(button3, gridLayout);
        JButton button4 = new JButton("7");
        panel1.add(button4, gridLayout);
        JButton button5 = new JButton("8");
        panel1.add(button5, gridLayout);
        JButton button6 = new JButton("9");
        panel1.add(button6, gridLayout);
        JButton button7 = new JButton("/");
        panel1.add(button7, gridLayout);
        JButton button8 = new JButton("4");
        panel1.add(button8, gridLayout);
        JButton button9 = new JButton("5");
        panel1.add(button9, gridLayout);
        JButton button10 = new JButton("6");
        panel1.add(button10, gridLayout);
        JButton button11 = new JButton("x");
        panel1.add(button11, gridLayout);
        JButton button12 = new JButton("1");
        panel1.add(button12, gridLayout);
        JButton button13 = new JButton("2");
        panel1.add(button13, gridLayout);
        JButton button14 = new JButton("3");
        panel1.add(button14, gridLayout);
        JButton button15 = new JButton("-");
        panel1.add(button15, gridLayout);
        JButton button16 = new JButton("0");
        panel1.add(button16, gridLayout);
        JButton button17 = new JButton(".");
        panel1.add(button17, gridLayout);
        JButton button18 = new JButton("=");
        panel1.add(button18, gridLayout);
        JButton button19 = new JButton("+");
        panel1.add(button19, gridLayout);

        JPanel panel2 = new JPanel();

        JTextField textField = new JTextField(16);
        panel2.add(textField);

        mainPanel.add(panel2, BorderLayout.NORTH);
        mainPanel.add(panel1, BorderLayout.CENTER);

        f.setContentPane(mainPanel);
        f.repaint();
        f.revalidate();
    }
}
