package com.inheritance;

public class TestMovablePoint {
    public static void main(String[] args) {
        var mp1 = new MovablePoint();
        System.out.println(mp1);

        var mp2 = new MovablePoint(1, 2);
        System.out.println(mp2);

        var mp3 = new MovablePoint(1, 2, 5, 6);
        System.out.println(mp3);
        System.out.println(mp3.move().move());
        System.out.println(mp3);
    }
}
