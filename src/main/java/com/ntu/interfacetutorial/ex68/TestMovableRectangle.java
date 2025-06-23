package com.ntu.interfacetutorial.ex68;

public class TestMovableRectangle {
    public static void main(String[] args) {
        MovableRectangle mR1 = new MovableRectangle(1, 2, 8, 9, 2, 3);
        System.out.println(mR1);
        mR1.moveUp();
        System.out.println(mR1);
        mR1.moveDown();
        System.out.println(mR1);
        mR1.moveLeft();
        System.out.println(mR1);
        mR1.moveRight();
        System.out.println(mR1);

    }
}
