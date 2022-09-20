import javax.swing.*;

public class MyTitledBorderWindow {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setBounds(10, 10, 200, 300);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainpanel = new JPanel();
        mainpanel.setBounds(10, 10, 10, 20);

        mainpanel.setBorder(BorderFactory.createTitledBorder("Search"));

        JRadioButton boton1 = new JRadioButton("By Name");

        JRadioButton boton2 = new JRadioButton("By ID");

        mainpanel.add(boton1);
        mainpanel.add(boton2);


        f.setContentPane(mainpanel);
    }
}
