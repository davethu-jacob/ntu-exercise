package com.composition;

public class TestMyCircle {
    public static void main(String[] args) {
        MyCircle c1 = new MyCircle();
        System.out.println(c1);
        c1.setRadius(2);
        System.out.println("radius is: " + c1.getRadius());

        MyCircle c2 = new MyCircle(8, 9, 5);
        System.out.println(c2);

        MyPoint p1 = new MyPoint(3, 4);
        MyCircle c3 = new MyCircle(p1, 3);
        System.out.println(c3);
        MyPoint p2 = new MyPoint(5, 5);
        System.out.println(p2);
        c3.setCenter(p2);
        System.out.println(c3.getCenter());
        System.out.println("Circumference of circle c3 is: " + c3.getCircumference());
        System.out.println("Area of circle c3 is: " + c3.getArea());
        System.out.println("Distance between center of the circle: " + c3.distance(c2));



    }
}
