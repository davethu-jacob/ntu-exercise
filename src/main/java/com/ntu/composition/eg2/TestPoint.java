package com.ntu.composition.eg2;

public class TestPoint {
    public static void main(String[] args) {
        Point p1 = new Point();
        System.out.println(p1);

        Point p2 = new Point(2, 5);
        System.out.println(p2);
    }
}
