package com.oop;

import java.util.Arrays;

public class TestBall {
    public static void main(String[] args) {
        Ball b1 = new Ball(1, 2, 11, 12);
        System.out.println(b1);

        b1.setX(3);
        b1.setY(4);
        b1.setXStep(13);
        b1.setYStep(14);
        System.out.println(b1);

        System.out.println("x coordinate is: " + b1.getX());
        System.out.println("y coordinate is: " + b1.getY());
        System.out.println("xStep coordinate is: " + b1.getXStep());
        System.out.println("yStep coordinate is: " + b1.getYStep());

        b1.setXY(5, 6);
        b1.setXYStep(15,16);
        System.out.println(b1);
        System.out.println("x and y are: " + Arrays.toString(b1.getXY()));
        System.out.println("xStep and yStep are: " + Arrays.toString(b1.getXYStep()));

        System.out.println(b1.move());
        System.out.println(b1.move().move().move());
    }
}
