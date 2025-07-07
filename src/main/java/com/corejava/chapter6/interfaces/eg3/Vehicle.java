package com.corejava.chapter6.interfaces.eg3;

public interface Vehicle {
    void changeGear(int gear);
    void speedUp(int increase);
    void applyBrakes(int decrease);

    default void startVehicle() {
        System.out.println("Starting the vehicle.....");
    }
}
