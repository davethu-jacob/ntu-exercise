package com.ntu.composition.eg2;

import java.util.Arrays;

public class TestLine {
    public static void main(String[] args) {
        Line l1 = new Line(new Point(1,2), new Point(7, 10));
        System.out.println(l1);
        System.out.println(l1.getLength());


        Line l2 = new Line(6, 7, 10, 12);
        System.out.println(l2);
        System.out.println(Arrays.toString(l2.getBeginXY()));
        l2.setBeginXY(16,17);
        System.out.println(Arrays.toString(l2.getBeginXY()));
        System.out.println(l2.getEndX());

    }
}
