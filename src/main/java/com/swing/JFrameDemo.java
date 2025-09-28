package com.swing;

import javax.swing.JFrame;
import java.awt.*;

public class JFrameDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame();  // Create a frame
        frame.setTitle("JFrame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(420, 420);
        frame.setVisible(true); // Make frame visible
//        frame.getContentPane().setBackground(Color.LIGHT_GRAY);
//        frame.getContentPane().setBackground(new Color(0, 0, 0));  // black
//        frame.getContentPane().setBackground(new Color(255, 255, 255));  // white
        frame.getContentPane().setBackground(new Color(0xffffff));  // white
    }
}
