package com.ntu.interfacetutorial.ex68;

public class TestMovableCircle {
    public static void main(String[] args) {
        MovableCircle mc1 = new MovableCircle(5, 6, 10, 15, 20);
        System.out.println(mc1);
        mc1.moveRight();
        System.out.println(mc1);
        mc1.moveLeft();
        System.out.println(mc1);
        mc1.moveDown();
        System.out.println(mc1);
        mc1.moveUp();
        System.out.println(mc1);
    }
}
