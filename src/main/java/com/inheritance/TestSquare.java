package com.inheritance;

public class TestSquare {
    public static void main(String[] args) {
        var s1 = new Square();
        System.out.println(s1);
        s1.setSide(20);
        System.out.println(s1);

        var s2 = new Square(2);
        System.out.println(s2);
        s2.setLength(8);
        System.out.println(s2);

        var s3 = new Square(7, "Green", true);
        System.out.println(s3);
        System.out.println("The side is: " + s3.getSide());
        s3.setSide(5);
        System.out.println(s3);


    }
}

