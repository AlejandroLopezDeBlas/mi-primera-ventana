package org.iesfm.ventana;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyComboBoxWindow {

    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setBounds(10, 10, 200, 300);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainpanel = new JPanel();



        JComboBox<String> comboBox = new JComboBox<>();

        comboBox.setBounds(29, 35, 148, 20);

        comboBox.addItem("Java");
        comboBox.addItem("C");
        comboBox.addItem("C++");
        comboBox.addItem("C#");
        comboBox.addItem("PHP");



        JButton aceptar = new JButton("Aceptar");

        JLabel label = new JLabel();
        label.setText("Programming language selected:");

        comboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String selected = comboBox.getItemAt(comboBox.getSelectedIndex());
                label.setText("Programming language selected " + selected + ":");
            }
        });

        mainpanel.add(label);

        mainpanel.add(comboBox);

        mainpanel.add(aceptar);

        f.setContentPane(mainpanel);
    }
}
