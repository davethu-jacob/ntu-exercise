package com.inheritance;

public class TestCircle {
    public static void main(String[] args) {
        var c1 = new Circle();
        System.out.println(c1);
        System.out.println("Area of circle is: " + c1.getArea());
        System.out.println("Perimeter of circle is: " + c1.getPerimeter());

        var c2 = new Circle(0);
        System.out.println(c2);
        System.out.println("Area of Circle is: " + c2.getArea());
        System.out.println("Perimeter of circle is: " + c2.getPerimeter());

        var c3 = new Circle(3, "Yellow", true);
        System.out.println(c3);
        System.out.println("Area of Circle is: " + c3.getArea());
        System.out.println("Perimeter of circle is: " + c3.getPerimeter());

    }
}
