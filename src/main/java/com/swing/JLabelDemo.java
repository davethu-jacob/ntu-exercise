package com.swing;

import javax.swing.*;
import java.awt.*;

public class JLabelDemo {
    public static void main(String[] args) {

        JFrame frame = new JFrame("JLabel Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setTitle("JFrame");
        frame.setSize(800, 600);
        frame.setLayout(new FlowLayout());

        // Create a JLabel with text
        JLabel textLabel = new JLabel("Hello, Swing!");
        textLabel.setFont(new Font("Serif", Font.BOLD, 20));
        textLabel.setForeground(Color.BLUE);

        // Create a JLabel with an image icon
        ImageIcon icon = new ImageIcon("src/main/resources/image1.png");
        JLabel imageLabel = new JLabel(icon);

        // Create a JLabel with both text and an image
        JLabel combinedLabel = new JLabel("Info:", icon, SwingConstants.RIGHT); // Text on the right of icon
        combinedLabel.setVerticalTextPosition(SwingConstants.CENTER);
        combinedLabel.setHorizontalTextPosition(SwingConstants.LEFT);  // Text on the left of icon
        combinedLabel.setIconTextGap(10);

        frame.add(textLabel);
        frame.add(imageLabel);
        frame.add(combinedLabel);

        frame.setVisible(true);
    }


}
