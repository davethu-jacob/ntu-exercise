package com.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener{

    JButton button;
    MyFrame() {
        ImageIcon icon = new ImageIcon("src/main/resources/point-finger.png");

        button = new JButton();
        button.setBounds(225, 300, 300, 150);
        button.setText("I am a button!");
        button.setFont(new Font("San Serif", Font.BOLD, 10));
        button.setFocusable(false);
        button.setIcon(icon);
        button.addActionListener(this);

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(750, 750);
        this.setVisible(true);
        this.add(button);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            System.out.println("poo");
        }
    }
}
