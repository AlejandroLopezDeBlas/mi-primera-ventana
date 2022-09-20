package org.iesfm.ventana;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyRadioButtonsWindow {
    public static void main(String[] args) {

        JFrame f = new JFrame();
        f.setBounds(10, 10, 200, 300);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainpanel = new JPanel();

        JRadioButton boton1 = new JRadioButton("Linux");
        boton1.setActionCommand("Linux");
        boton1.setBounds(75,50, 100, 30);
        JRadioButton boton2 = new JRadioButton("Windows");
        boton2.setActionCommand("Windows");
        boton2.setBounds(150,50, 100, 30);
        JRadioButton boton3 = new JRadioButton("Macintosh");
        boton3.setActionCommand("Macintosh");
        boton3.setBounds(225,50, 100, 30);

        ButtonGroup grupo = new ButtonGroup();

        grupo.add(boton1);
        grupo.add(boton2);
        grupo.add(boton3);

        mainpanel.add(boton1);
        mainpanel.add(boton2);
        mainpanel.add(boton3);

        JLabel icono = new JLabel();
        mainpanel.add(icono);

        JButton aceptar = new JButton("Aceptar");
        aceptar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String selected = grupo.getSelection().getActionCommand();
                JOptionPane.showMessageDialog(f, "Has selecionado " + selected);

                icono.setIcon(new ImageIcon(selected + ".jpeg"));
            }
        });
        mainpanel.add(aceptar);

        f.setContentPane(mainpanel);
    }
}
