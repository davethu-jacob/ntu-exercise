package com.ntu.interfacetutorial.ex68;

public class TestMovablePoint {
    public static void main(String[] args) {
        MovablePoint mp1 = new MovablePoint(1, 2, 3, 4);
        System.out.println(mp1);
        mp1.moveUp();
        System.out.println(mp1);
        mp1.moveDown();
        System.out.println(mp1);
        mp1.moveLeft();
        System.out.println(mp1);
        mp1.moveRight();
        System.out.println(mp1);
    }
}
