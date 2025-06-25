package com.ntu.composition.eg2;

public class TestLine {
    public static void main(String[] args) {
        Line l1 = new Line(new Point(1,2), new Point(3, 4));
        System.out.println(l1);


        Line l2 = new Line(6, 7, 10, 12);
        System.out.println(l2);
    }
}
