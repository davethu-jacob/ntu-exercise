package com.ntu.composition.ex26;

import java.util.Arrays;

public class TestMyPoint {
    public static void main(String[] args) {
        MyPoint mp1 = new MyPoint();
        System.out.println(mp1);
        System.out.println("mp1: " + Arrays.toString(mp1.getXY()));
        mp1.setXY(6, 8);
        System.out.println("mp1: " + Arrays.toString(mp1.getXY()));
        System.out.println("distance: " + mp1.distance());


        System.out.println();
        MyPoint mp2 = new MyPoint(3, 4);
        System.out.println(mp2);
        System.out.println("Distance: " + mp1.distance(mp2));
    }
}
