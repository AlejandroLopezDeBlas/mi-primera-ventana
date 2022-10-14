package org.iesfm.ventana;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MoveOptionsWindow {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setBounds(100, 100, 400, 300);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setTitle("MoveOptionsWindow");

        JPanel mainpanel = new JPanel(new BorderLayout());

        JPanel panelCenter = new JPanel();

        JList<String> jList = new JList<>();

        DefaultListModel<String> jListModel = new DefaultListModel<>();

        jList.setModel(jListModel);

        jList.setPreferredSize(new Dimension(200, 80));

        jListModel.addElement("strSubjectName");
        jListModel.addElement("strStandardName");
        jListModel.addElement("strReferenceBook");

        JButton buttonRight = new JButton(">>");
        JButton buttonLeft = new JButton("<<");

        JList<String> jList1 = new JList<>();

        DefaultListModel<String> jListModel1 = new DefaultListModel<>();

        jList1.setModel(jListModel1);

        jList1.setPreferredSize(new Dimension(200, 80));

        buttonRight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String s = jList.getSelectedValue();
                if (jList.isSelectionEmpty()){
                    JOptionPane.showMessageDialog(f, "Debe introducir un nombre");
                }else{
                    jListModel1.addElement(s);
                    jListModel.removeElement(s);
                }
            }
        });

        buttonLeft.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String s = jList1.getSelectedValue();
                if (jList1.isSelectionEmpty()){
                    JOptionPane.showMessageDialog(f, "Debe introducir un nombre");
                }else{
                    jListModel.addElement(s);
                    jListModel1.removeElement(s);
                }
            }
        });

        panelCenter.add(jList, BorderLayout.WEST);
        panelCenter.add(buttonRight, BorderLayout.CENTER);
        panelCenter.add(buttonLeft, BorderLayout.CENTER);
        panelCenter.add(jList1, BorderLayout.EAST);

        JPanel panelSouth = new JPanel();

        JButton buttonAddAll = new JButton("Add All");

        JButton buttonRemoveAll = new JButton("Remove All");

        buttonAddAll.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                for (int i = 0 ; i < jListModel.size(); i++){
                    jListModel1.addElement(jListModel.elementAt(i));
                    jListModel.removeElementAt(i);
                }
            }
        });

        buttonRemoveAll.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                for (int i = 0 ; i < jListModel1.size(); i++){
                    jListModel.addElement(jListModel1.elementAt(i));
                    jListModel1.removeElementAt(i);
                }
            }
        });

        panelSouth.add(buttonAddAll, BorderLayout.WEST);
        panelSouth.add(buttonRemoveAll, BorderLayout.EAST);

        mainpanel.add(panelCenter, BorderLayout.CENTER);
        mainpanel.add(panelSouth, BorderLayout.SOUTH);

        f.setContentPane(mainpanel);
        f.repaint();
        f.revalidate();
    }
}
