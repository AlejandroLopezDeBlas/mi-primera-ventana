package org.iesfm.ventana;

import javax.swing.*;
import java.awt.*;

public class TareaSwing {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setBounds(10, 10, 500, 400);
        f.setVisible(true);
        f.setResizable(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainpanel = new JPanel(new BorderLayout());
        mainpanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JPanel panelNorth = new JPanel(new FlowLayout());

        FlowLayout flowLayout = (FlowLayout) panelNorth.getLayout();

        flowLayout.setAlignment(FlowLayout.LEFT);

        panelNorth.setBackground(Color.CYAN.darker());

        JButton option1 = new JButton("Option 1");
        JButton option2 = new JButton("Option 2");
        JButton option3 = new JButton("Option 3");

        ButtonGroup buttonGroup = new ButtonGroup();

        buttonGroup.add(option1);
        buttonGroup.add(option2);
        buttonGroup.add(option3);

        panelNorth.add(option1);
        panelNorth.add(option2);
        panelNorth.add(option3);

        JPanel panelWest = new JPanel(new GridBagLayout());

        panelWest.setPreferredSize(new Dimension(90, 10));

        panelWest.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.BLACK), "Submenu"));

        panelWest.setBackground(Color.CYAN.darker());

        panelWest.add(new JLabel("Option 1"), new GridBagConstraints(
                0,
                0,
                1,
                1,
                1.0,
                1.0,
                GridBagConstraints.SOUTH,
                GridBagConstraints.HORIZONTAL,
                new Insets(0, 10, 0, 0),
                0,
                0)
        );
        panelWest.add(new JLabel("Option 2"), new GridBagConstraints(
                0,
                1,
                1,
                1,
                1.0,
                1.0,
                GridBagConstraints.SOUTH,
                GridBagConstraints.HORIZONTAL,
                new Insets(0, 10, 0, 0),
                0,
                0)
        );
        panelWest.add(new JLabel("Option 3"), new GridBagConstraints(
                0,
                2,
                1,
                1,
                1.0,
                1.0,
                GridBagConstraints.SOUTH,
                GridBagConstraints.HORIZONTAL,
                new Insets(0, 10, 0, 0),
                0,
                0)
        );
        panelWest.add(new JLabel("Option 4"), new GridBagConstraints(
                0,
                3,
                1,
                1,
                1.0,
                1.0,
                GridBagConstraints.SOUTH,
                GridBagConstraints.HORIZONTAL,
                new Insets(0, 10, 0, 0),
                0,
                0)
        );
        panelWest.add(new JLabel("Option 5"), new GridBagConstraints(
                0,
                4,
                1,
                1,
                1.0,
                1.0,
                GridBagConstraints.SOUTH,
                GridBagConstraints.HORIZONTAL,
                new Insets(0, 10, 0, 0),
                0,
                0)
        );
        panelWest.add(new JLabel(), new GridBagConstraints(
                0,
                5,
                1,
                1,
                1.0,
                1.0,
                GridBagConstraints.SOUTH,
                GridBagConstraints.HORIZONTAL,
                new Insets(0, 10, 0, 0),
                0,
                0)
        );

        JPanel panelCenter = new JPanel(new GridBagLayout());

        panelCenter.add(new JCheckBox("Name"), new GridBagConstraints(
                0,
                0,
                1,
                1,
                1.0,
                1.0,
                GridBagConstraints.CENTER,
                GridBagConstraints.BOTH,
                new Insets(0, 0, 0, 0),
                0,
                0)
        );
        panelCenter.add(new JCheckBox("Address"), new GridBagConstraints(
                0,
                1,
                1,
                1,
                1.0,
                1.0,
                GridBagConstraints.CENTER,
                GridBagConstraints.BOTH,
                new Insets(0, 0, 0, 0),
                0,
                0)
        );
        panelCenter.add(new JLabel("City"), new GridBagConstraints(
                0,
                2,
                1,
                1,
                1.0,
                1.0,
                GridBagConstraints.CENTER,
                GridBagConstraints.BOTH,
                new Insets(0, 0, 0, 0),
                0,
                0)
        );
        panelCenter.add(new JCheckBox("Description"), new GridBagConstraints(
                0,
                3,
                1,
                1,
                1.0,
                1.0,
                GridBagConstraints.CENTER,
                GridBagConstraints.BOTH,
                new Insets(0, 0, 0, 0),
                0,
                0)
        );
        panelCenter.add(new JTextField(), new GridBagConstraints(
                1,
                0,
                1,
                1,
                5.0,
                1.0,
                GridBagConstraints.CENTER,
                GridBagConstraints.BOTH,
                new Insets(0, 0, 0, 0),
                0,
                0)
        );
        panelCenter.add(new JTextField(), new GridBagConstraints(
                1,
                1,
                1,
                1,
                5.0,
                1.0,
                GridBagConstraints.CENTER,
                GridBagConstraints.BOTH,
                new Insets(0, 0, 0, 0),
                0,
                0)
        );
        panelCenter.add(new JTextField(), new GridBagConstraints(
                1,
                2,
                1,
                1,
                4.0,
                1.0,
                GridBagConstraints.CENTER,
                GridBagConstraints.BOTH,
                new Insets(0, 0, 0, 0),
                0,
                0)
        );
        JComboBox<String> jComboBox = new JComboBox<>();
        jComboBox.addItem("Spain");
        jComboBox.addItem("Germany");
        jComboBox.addItem("France");
        panelCenter.add(jComboBox, new GridBagConstraints(
                5,
                2,
                1,
                1,
                1.0,
                1.0,
                GridBagConstraints.CENTER,
                GridBagConstraints.BOTH,
                new Insets(0, 0, 0, 0),
                0,
                0)
        );
        panelCenter.add(new JTextArea(), new GridBagConstraints(
                1,
                3,
                1,
                1,
                5.0,
                5.0,
                GridBagConstraints.CENTER,
                GridBagConstraints.BOTH,
                new Insets(0, 0, 0, 0),
                0,
                0)
        );
        panelCenter.add(new JRadioButton("Active"), new GridBagConstraints(
                1,
                8,
                1,
                1,
                1.0,
                1.0,
                GridBagConstraints.CENTER,
                GridBagConstraints.BOTH,
                new Insets(0, 0, 0, 0),
                0,
                0)
        );
        panelCenter.add(new JRadioButton("Active"), new GridBagConstraints(
                5,
                8,
                1,
                1,
                1.0,
                1.0,
                GridBagConstraints.CENTER,
                GridBagConstraints.BOTH,
                new Insets(0, 0, 0, 0),
                0,
                0)
        );
        panelCenter.add(new JButton("Save"), new GridBagConstraints(
                5,
                9,
                1,
                1,
                1.0,
                1.0,
                GridBagConstraints.CENTER,
                GridBagConstraints.BOTH,
                new Insets(0, 0, 0, 0),
                0,
                0)
        );

        mainpanel.add(panelNorth, BorderLayout.NORTH);
        mainpanel.add(panelWest, BorderLayout.WEST);
        mainpanel.add(panelCenter, BorderLayout.CENTER);


        f.setContentPane(mainpanel);
        f.repaint();
        f.revalidate();
    }
}
