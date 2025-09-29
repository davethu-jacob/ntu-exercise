package com.headfirst.ch14;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleGui2 implements ActionListener {
    private JButton button;

    public static void main(String[] args) {
        SimpleGui2 gui = new SimpleGui2();
        gui.go();
    }

    private void go() {
        JFrame frame = new JFrame();
        button = new JButton("Click me");
        button.addActionListener(this);

        frame.getContentPane().add(button);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setVisible(true);

    }

    public void actionPerformed(ActionEvent event) {
        button.setText("I've been clicked");
    }
}
