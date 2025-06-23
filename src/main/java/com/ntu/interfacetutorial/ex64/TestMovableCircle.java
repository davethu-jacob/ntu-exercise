package com.ntu.interfacetutorial.ex64;

public class TestMovableCircle {
    public static void main(String[] args) {
        MovableCircle m1 = new MovableCircle(1, 2, 3, 4, 5);
        System.out.println(m1);
        m1.moveUp();
        System.out.println(m1);
        m1.moveDown();
        System.out.println(m1);
        m1.moveLeft();
        System.out.println(m1);
        m1.moveRight();
        System.out.println(m1);
    }
}
