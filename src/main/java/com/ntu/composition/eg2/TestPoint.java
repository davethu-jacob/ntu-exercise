package com.ntu.composition.eg2;

import java.util.Arrays;

public class TestPoint {
    public static void main(String[] args) {
        Point p1 = new Point();
        System.out.println(p1);
        p1.setX(1);
        p1.setY(1);
        System.out.println(p1);
        p1.setXY(2, 2);
        System.out.println(p1);
        System.out.println(p1.distance(8, 10));

        Point p2 = new Point(8, 10);
        System.out.println(p2);
        System.out.println(Arrays.toString(p2.getXY()));
        System.out.println(p1.distance(p2));
        Point p3 = new Point(12, 0);
        System.out.println(p3.distance());
    }
}
