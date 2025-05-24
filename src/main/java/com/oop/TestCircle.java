package com.oop;

public class TestCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle(2.0, "blue");
        System.out.println("Radius of circle c1 is: " + c1.getRadius());
        System.out.println("Color of circle c1 is: " + c1.getColor());
        System.out.println("Area of circle c1 is: " + c1.getArea());

        Circle c2 = new Circle(2.0);
        System.out.println("Radius of circle c2 is: " + c2.getRadius());
        System.out.println("Color of circle c2 is: " + c2.getColor());
        System.out.println("Area of circle c2 is: " + c2.getArea());

        Circle c3 = new Circle();
        System.out.println("Radius of circle c3 is: " + c3.getRadius());
        System.out.println("Color of circle c3 is: " + c3.getColor());
        System.out.println("Area of circle c3 is: " + c3.getArea());

    }
}
