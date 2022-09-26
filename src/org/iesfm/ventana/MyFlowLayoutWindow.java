package org.iesfm.ventana;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFlowLayoutWindow {
    public static void main(String[] args) {
        JFrame f  = new JFrame();
        f.setBounds(10, 10, 200, 300);
        f.setVisible(true);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        FlowLayout layout = new FlowLayout();
        panel.setLayout(layout);
        JButton button1 = new JButton("Button 1");
        button1.setActionCommand("Button 1");
        JButton button2 = new JButton("Button 2");
        button1.setActionCommand("Button 2");
        JButton button3 = new JButton("Button 3");
        button1.setActionCommand("Button 3");
        JButton button4 = new JButton("Long-Named Button 4");
        button1.setActionCommand("Long-Named Button 4");
        JButton button5 = new JButton("5");
        button1.setActionCommand("5");
        JRadioButton radioButton1 = new JRadioButton("Left to right");
        radioButton1.setSelected(true);
        button1.setActionCommand("Left to right");
        JRadioButton radioButton2 = new JRadioButton("Right to left");
        button1.setActionCommand("Right to left");
        JButton button6 = new JButton("Apply orientation");
        button1.setActionCommand("Apply orientation");

        ButtonGroup grupo = new ButtonGroup();

        grupo.add(button1);
        grupo.add(button2);
        grupo.add(button3);
        grupo.add(button4);
        grupo.add(button5);
        grupo.add(radioButton1);
        grupo.add(radioButton2);
        grupo.add(button6);

        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(button4);
        panel.add(button5);
        panel.add(radioButton1);
        panel.add(radioButton2);
        panel.add(button6);

        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                FlowLayout flowLayout = (FlowLayout) panel.getLayout();
                if (radioButton1.isSelected()){
                    flowLayout.setAlignment(FlowLayout.LEFT);
                } else {
                    flowLayout.setAlignment(FlowLayout.RIGHT);
                }
                panel.revalidate();
                panel.repaint();
            }
        });


        f.setContentPane(panel);

    }
}