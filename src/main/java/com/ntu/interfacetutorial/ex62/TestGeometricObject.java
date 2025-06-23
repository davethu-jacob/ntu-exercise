package com.ntu.interfacetutorial.ex62;

public class TestGeometricObject {
    public static void main(String[] args) {
        Circle c1 = new Circle(2);
        System.out.println(c1);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());

        Rectangle r1 = new Rectangle(3, 4);
        System.out.println(r1);
        System.out.println(r1.getArea());
        System.out.println(r1.getPerimeter());
    }
}
