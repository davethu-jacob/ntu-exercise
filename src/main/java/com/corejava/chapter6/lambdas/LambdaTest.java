package com.corejava.chapter6.lambdas;

import javax.swing.*;
import java.lang.FunctionalInterface;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.Timer;

public class LambdaTest {
    public static void main(String[] args) {
        String[] planets = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"};
        System.out.println("Planets in insert order: " + Arrays.toString(planets));
        Arrays.sort(planets);
        System.out.println("Planets in dictionary order: " + Arrays.toString(planets));

        // Option 1
        Arrays.sort(planets, new StringLengthComparator());
        System.out.println("Planets name length sorted in ascending order: " + Arrays.toString(planets));

        // Option 2 - using lambda
        Arrays.sort(planets, (first, second) -> second.length() - first.length());
        System.out.println("Planets name length sorted in descending order: " + Arrays.toString(planets));

        // The following code has bugs. Need to be fixed
//        var timer = new Timer(1000, event -> System.out.println("The time is: " + new Date()));
//        timer.start();
//
//        JOptionPane.showMessageDialog(null, "Quit program?");
//        System.exit(0);
    }
}

class StringLengthComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        return o1.length() - o2.length();
    }
}

