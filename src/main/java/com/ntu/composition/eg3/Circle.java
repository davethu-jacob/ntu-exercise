package com.ntu.composition.eg3;

public class Circle {
    private Point center;
    private double radius = 1.0;

    public Circle() {
        center = new Point(0, 0);
    }

    public Circle(int xCenter, int yCenter, double radius) {
        center = new Point(xCenter, yCenter);
        this.radius = radius;
    }

    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public int getCenterX() {
        return center.getX();
    }

    public void setCenterX(int x) {
        center.setX(x);
    }

    public int getCenterY() {
        return center.getY();
    }

    public void setCenterY(int y) {
        center.setY(y);
    }

    public int[] getCenterXY() {
        int[] result = new int[2];
        result[0] = center.getX();
        result[1] = center.getY();
        return result;
    }

    public void setCenterXY(int x, int y) {
        center.setXY(x, y);
    }

    @Override
    public String toString() {
        return String.format("Circle[center=%s,radius=%.2f]", center.toString(), radius);
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }
}
