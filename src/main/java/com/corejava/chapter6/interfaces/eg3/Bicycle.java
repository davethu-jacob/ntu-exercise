package com.corejava.chapter6.interfaces.eg3;

public class Bicycle implements Vehicle {
    int speed;
    int gear;

    @Override
    public void changeGear(int gear) {
        this.gear = gear;
    }

    @Override
    public void speedUp(int increase) {
        speed += increase;
    }

    @Override
    public void applyBrakes(int decrease) {
        speed -= decrease;
    }

    public void printStates() {
        System.out.println("Speed= " + speed + " Gear= " + gear);
    }
}
