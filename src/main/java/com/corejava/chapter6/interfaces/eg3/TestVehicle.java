package com.corejava.chapter6.interfaces.eg3;

public class TestVehicle {
    public static void main(String[] args) {
        Bicycle b1 = new Bicycle();
        b1.startVehicle();
        b1.printStates();
        b1.changeGear(5);
        b1.speedUp(10);
        b1.printStates();

        Bike b2 = new Bike();
        b2.startVehicle();
        b2.printStates();
        b2.changeGear(13);
        b2.speedUp(25);
        b2.printStates();
        b2.applyBrakes(5);
        b2.printStates();

    }
}
