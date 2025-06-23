package com.ntu.interfacetutorial.ex62;

public class Rectangle implements GeometricObject {
    private final double width;
    private final double length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public String toString() {
        return String.format("Rectangle[width=%.2f,length=%.2f]", width, length);
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public double getPerimeter() {
        return (2 * length) + (2 * width);
    }
}
