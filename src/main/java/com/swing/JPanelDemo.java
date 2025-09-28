package com.swing;

import javax.swing.*;
import java.awt.*;

public class JPanelDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JPanel");

        JLabel label = new JLabel();
        label.setText("Hi");

        ImageIcon icon = new ImageIcon("src/main/resources/thumbs-up.jpeg");
        label.setIcon(icon);
        label.setVerticalAlignment(JLabel.TOP);

        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.RED);
        redPanel.setBounds(0, 0, 250, 250);
        redPanel.setLayout(new BorderLayout());

        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.GREEN);
        greenPanel.setBounds(251, 0, 250, 250);
        greenPanel.setLayout(new BorderLayout());

        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.BLUE);
        bluePanel.setBounds(0, 251, 500, 250);
        bluePanel.setLayout(new BorderLayout());


        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(750, 750);
        frame.setLayout(null);
        bluePanel.add(label);
        frame.add(redPanel);
        frame.add(greenPanel);
        frame.add(bluePanel);


        frame.setVisible(true);
    }
}
