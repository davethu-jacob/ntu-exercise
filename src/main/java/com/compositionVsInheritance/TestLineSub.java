package com.compositionVsInheritance;

public class TestLineSub {
    public static void main(String[] args) {
        LineSub ls1 = new LineSub(1, 2, 3, 4);
        System.out.println(ls1);

        Point p1 = new Point(8, 10);
        Point p2 = new Point(12, 14);
        LineSub ls2 = new LineSub(p1, p2);
        System.out.println(ls2);
        System.out.println(ls2.getBegin());
        System.out.println(ls2.getEnd());
        ls2.setBegin(28, 30);
        System.out.println(ls2.getBegin());
        ls2.setEnd(new Point(18, 20));
        System.out.println(ls2.getEnd());

    }
}
