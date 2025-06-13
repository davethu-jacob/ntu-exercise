package com.inheritance;

public class TestShape {
    public static void main(String[] args) {
        var s1 = new Shape();
        System.out.println(s1);

        var s2 = new Shape("blue", false);
        System.out.println(s2);
    }
}
