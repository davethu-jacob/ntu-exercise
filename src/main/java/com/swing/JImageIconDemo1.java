package com.swing;

import javax.swing.*;

public class JImageIconDemo1 {
    public static void main(String[] args) {

        ImageIcon image = new ImageIcon("src/main/resources/image1.png");
        JLabel imageLabel = new JLabel(image);

        JFrame frame = new JFrame("Image Display");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
//        frame.setTitle("JFrame");
        frame.setSize(450, 450);
        frame.add(imageLabel);
        frame.setVisible(true);
    }
}
