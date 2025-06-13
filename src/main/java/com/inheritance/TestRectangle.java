package com.inheritance;

public class TestRectangle {
    public static void main(String[] args) {
        var r1 = new Rectangle();
        System.out.println(r1);
        System.out.println("Area of rectangle is: " + r1.getArea());
        System.out.println("Perimeter of rectangle is: " + r1.getPerimeter());

        var r2 = new Rectangle(4, 5);
        System.out.println(r2);
        System.out.println("Area of rectangle is: " + r2.getArea());
        System.out.println("Perimeter of rectangle is: " + r2.getPerimeter());

        var r3 = new Rectangle("blue", false, 8, 9);
        System.out.println(r3);
        System.out.println("Area of rectangle is: " + r3.getArea());
        System.out.println("Perimeter of rectangle is: " + r3.getPerimeter());
    }
}
