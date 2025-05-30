package com.composition;

public class TestMyTriangle {
    public static void main(String[] args) {
        MyTriangle t1 = new MyTriangle(1, 1, 2, 2, 3, 3);
        System.out.println(t1);

        MyPoint p1 = new MyPoint(4, 4);
        MyPoint p2 = new MyPoint(5, 5);
        MyPoint p3 = new MyPoint(6, 6);
        MyTriangle t2 = new MyTriangle(p1, p2, p3);
        System.out.println(t2);

        System.out.printf("Perimeter of triangle t2 is: %.2f%n", t2.getPerimeter());

        System.out.println("Triangle type is: " + t2.getType());

        MyPoint p4 = new MyPoint(0,0);
        MyPoint p5 = new MyPoint(2,2);
        MyPoint p6 = new MyPoint(3,-4);
        MyTriangle t3 = new MyTriangle(p4, p5, p6);
        System.out.println("Triangle type is: " + t3.getType());
    }
}
