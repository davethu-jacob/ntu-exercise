package com.ntu.composition.ex26;

public class TestMyLine {
    public static void main(String[] args) {
        MyPoint p1 = new MyPoint(3, 4);
        System.out.println(p1);
        MyPoint p2 = new MyPoint(6, 8);
        System.out.println(p2);

        MyLine l1 = new MyLine(p1, p2);
        System.out.println(l1);
        System.out.println(p1.distance(p2));
    }
}
