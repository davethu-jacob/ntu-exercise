package com.composition;

public class MyCircle {
    private MyPoint center;
    private int radius = 1;

    public MyCircle() {
        center = new MyPoint();
    }

    public MyCircle(int x, int y, int radius) {
        center = new MyPoint(x, y);
        this.radius = radius;
    }

    public MyCircle(MyPoint center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public MyPoint getCenter() {
        return center;
    }

    public void setCenter(MyPoint center) {
        this.center = center;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    public double distance(MyCircle another) {
        System.out.println("Center: " + center);
        return center.distance(another.getCenter());
    }

    @Override
    public String toString() {
        return String.format("MyCircle[radius=%d,center=%s]", radius, center);
    }
}
