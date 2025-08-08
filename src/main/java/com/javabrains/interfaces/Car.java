package com.javabrains.interfaces;

public interface Car {
    public void drive();
    public default void defaultDrive() {
        System.out.println("Drive by default");
    }
    public void refuel(Fuel f);
}
