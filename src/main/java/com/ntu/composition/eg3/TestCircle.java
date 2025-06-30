package com.ntu.composition.eg3;

public class TestCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.out.println(c1);

        Circle c2 = new Circle (3, 4, 2.0);
        System.out.println(c2);

        Point p1 = new Point(1, 2);
        System.out.println(p1);
        Circle c3 = new Circle(p1, 3.0);
        System.out.println(c3);
        System.out.println(c3.getArea());
        System.out.println(c3.getCircumference());

        System.out.println("Distance between c1 and c3 is: " + c1.distance(c3));
        System.out.println("Distance between c3 and c1 is: " + c3.distance(c1));
    }
}
