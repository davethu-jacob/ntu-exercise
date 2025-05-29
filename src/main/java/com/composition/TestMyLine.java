package com.composition;

public class TestMyLine {
    public static void main(String[] args) {
        MyPoint p1 = new MyPoint(12,10);
        MyPoint p2 = new MyPoint(4, 4);
        System.out.println(p1);
        System.out.println(p2);
        MyLine l1 = new MyLine(p1, p2);
        System.out.println(l1);
        System.out.println("Gradient of line l1 is: " + l1.getGradient());
        System.out.println("Length of line l1 is: " + l1.getLength());

        l1.setBeginXY(8, 12);
        int[] newBegin = l1.getBeginXY();
        System.out.println("New start point: " + newBegin[0] + "," + newBegin[1]);

        MyLine l2 = new MyLine(2, 2, 5, 5);
        System.out.println(l2);
    }
}
