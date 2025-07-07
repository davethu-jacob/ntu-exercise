package com.corejava.chapter6.interfaces.properties;

interface Moveable {
    double CAPACITY = 60;
    void move(double x, double y);
}

interface Powered extends Moveable {
    double milesPerGallon();
    double SPEED_LIMIT = 95; // a public static final constant
}

class Circle implements Moveable {
    private double x;
    private double y;

    Circle(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void move(double x, double y) {
        this.x -= x;
        this.y -= y;
    }
}

public class AnotherExample {
    public static void main(String[] args) {
        Circle c1 = new Circle(5, 6);
        System.out.println(Circle.CAPACITY);
        c1.move(1, 2);

    }
}
