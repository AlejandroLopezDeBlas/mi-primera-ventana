package org.iesfm.ventana;

import javax.swing.*;

public class MyRadioButtonsWindow {
    public static void main(String[] args) {

        JFrame f = new JFrame();
        f.setBounds(10, 10, 200, 300);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainpanel = new JPanel();

        JRadioButton boton1 = new JRadioButton("Linux");
        boton1.setBounds(75,50, 100, 30);
        JRadioButton boton2 = new JRadioButton("Windows");
        boton2.setBounds(150,50, 100, 30);
        JRadioButton boton3 = new JRadioButton("Macintosh");
        boton3.setBounds(225,50, 100, 30);

        ButtonGroup grupo = new ButtonGroup();

        grupo.add(boton1);
        grupo.add(boton2);
        grupo.add(boton3);

        mainpanel.add(boton1);
        mainpanel.add(boton2);
        mainpanel.add(boton3);

        JLabel imagen = new JLabel();
        imagen.setIcon(new ImageIcon ("descarga.jpeg"));

        mainpanel.add(imagen);

        JButton aceptar = new JButton("Aceptar");
        mainpanel.add(aceptar);

        f.setContentPane(mainpanel);
    }
}
