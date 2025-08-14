package com.headfirst.ch7;

public class TestBoats {
    public static void main(String[] args) {
        Boat b1 = new Boat();
        Sailboat b2 = new Sailboat();
        Rowboat b3 = new Rowboat();

        b2.setLength(32);
        b1.move();
        b3.move();
        b2.move();
    }
}

class Rowboat extends Boat {
    public void rowTheBoat() {
        System.out.print("stroke natasha");
    }

}

class Boat {
    private int length;

    void setLength(int len) {
        length = len;
    }

    int getLength() {
        return length;
    }

    void move() {
        System.out.print("drift ");
    }

}

class Sailboat extends Boat {
    @Override
    void move() {
        System.out.println("hoist sail");
    }

}
