package com.inheritance;

public class TestPoint2D {
    public static void main(String[] args) {
        var c1 = new Point2D();
        System.out.println(c1);

        var c2 = new Point2D(2, 5);
        System.out.println(c2);

        System.out.println("Coordinate is: (" + c1.getX() + "," + c1.getY() + ")");

        float[] coordinate = c2.getXY();
        System.out.println("Coordinate is: (" + coordinate[0] + "," + coordinate[1] + ")");
    }
}
