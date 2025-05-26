/**
 *  A Test Driver for the Point class.
 */
package com.oop;

public class TestPoint {
    public static void main(String[] args) {
        Point p1 = new Point(1, 2);
        System.out.println("Coordinate of Point p1 is: " + p1);

        Point p2 = new Point();
        System.out.println("Coordinate of Point p2 is: " + p2);

        p1.setX(3);
        p1.setY(4);
        System.out.println("X coordinate of Point p1 is: " + p1.getX());
        System.out.println("Y coordinate of Point p1 is: " + p1.getY());

        p1.setXY(5, 6);
        System.out.println("The new coordinates of Point p1 is: " + p1.getXY()[0]);
        System.out.println("The new coordinates of Point p1 is: " + p1.getXY()[1]);

        p2.setXY(10, 11);
        System.out.printf("The distance between Point p1 and p2 is: %.2f%n", p1.distance(10, 11));
        System.out.printf("The distance between Point p1 and p2 is: %.2f%n", p1.distance(p2) );
        System.out.printf("The distance between Point p1 and p2 is: %.2f%n", p2.distance(p1));
        System.out.printf("The distance between Point p1 and (0, 0) is: %.2f%n", p1.distance());
    }
}
