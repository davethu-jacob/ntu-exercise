package com.composition;

public class TestMyPoint {
    public static void main(String[] args) {
        MyPoint p1 = new MyPoint(3, 4);
        System.out.println(p1);
        MyPoint p2 = new MyPoint(5, 6);
        System.out.println(p2);
        MyPoint p3 = new MyPoint();
        System.out.println(p3);
        System.out.println(p1.distance(p2));
        System.out.println(p2.distance());
        System.out.println(p1.distance(5, 6));

        p1.setX(8);
        System.out.println("x coordinate of p1 is: " + p1.getX());
        p1.setY(9);
        System.out.println("y coordinate of p1 is: " + p1.getY());
    }
}
