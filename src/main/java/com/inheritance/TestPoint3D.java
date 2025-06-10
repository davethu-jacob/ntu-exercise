package com.inheritance;

public class TestPoint3D {
    public static void main(String[] args) {
        var p1 = new Point3D();
        System.out.println(p1);

        var p2 = new Point3D(1, 2, 3);
        System.out.println(p2);

        float[] coordinate = p2.getXYZ();
        System.out.println("Coordinate is: (" + coordinate[0] + "," + coordinate[1] + "," + coordinate[2] +")");
    }
}
