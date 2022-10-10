package org.iesfm.ventana;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JListWindow {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setBounds(100, 100, 400, 300);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setTitle("MyJListWindow");

        JPanel mainpanel = new JPanel(new BorderLayout());

        JPanel panelNorth = new JPanel();

        JLabel label = new JLabel("JList", SwingConstants.CENTER);

        label.setFont(new Font("Calibri", Font.PLAIN, 20));

        label.setPreferredSize(new Dimension(200, 80));

        label.setBorder(BorderFactory.createLoweredBevelBorder());

        panelNorth.add(label);

        JPanel panelCenter = new JPanel(new BorderLayout());

        JPanel panelCenterNorth = new JPanel();

        JTextField textField = new JTextField(20);

        JButton buttonAgregar = new JButton("Agregar");

        panelCenterNorth.add(textField, BorderLayout.WEST);

        panelCenterNorth.add(buttonAgregar, BorderLayout.EAST);

        JPanel panelCenterCenter = new JPanel();

        JList<String> jList = new JList<>();

        DefaultListModel<String> jListModel = new DefaultListModel<>();

        jList.setModel(jListModel);

        jListModel.addElement("Christian David");
        jListModel.addElement("Ana Milena");

        JScrollPane scrollPane = new JScrollPane(jList);

        scrollPane.setPreferredSize(new Dimension(200, 80));

        scrollPane.createVerticalScrollBar();

        panelCenterCenter.add(scrollPane);

        buttonAgregar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String person = textField.getText();
                if (person.isBlank()){
                    JOptionPane.showMessageDialog(f, "Debe introducir un nombre");
                }else{
                    jListModel.addElement(person);
                    textField.setText("");
                }
            }
        });

        JPanel panelCenterSouth = new JPanel();

        JButton buttonEliminar = new JButton("Eliminar");

        JButton buttonBorrarLista = new JButton("Borrar lista");

        panelCenterSouth.add(buttonEliminar, BorderLayout.WEST);

        panelCenterSouth.add(buttonBorrarLista, BorderLayout.EAST);

        buttonBorrarLista.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                jListModel.clear();
            }
        });

        buttonEliminar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                jListModel.removeElementAt(jList.getSelectedIndex());
            }
        });

        panelCenter.add(panelCenterNorth, BorderLayout.NORTH);
        panelCenter.add(panelCenterCenter, FlowLayout.CENTER);
        panelCenter.add(panelCenterSouth, BorderLayout.SOUTH);

        JPanel panelSouth = new JPanel();

        JLabel label1 = new JLabel("Se agregó un nuevo elemento");

        panelSouth.add(label1);

        mainpanel.add(panelNorth, BorderLayout.NORTH);
        mainpanel.add(panelCenter, FlowLayout.CENTER);
        mainpanel.add(panelSouth, BorderLayout.SOUTH);

        f.setContentPane(mainpanel);
        f.repaint();
        f.revalidate();
    }
}
