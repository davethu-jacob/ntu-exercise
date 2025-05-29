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
    }
}
