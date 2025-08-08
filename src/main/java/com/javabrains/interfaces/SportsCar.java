package com.javabrains.interfaces;

public class SportsCar implements Car {
    @Override
    public void drive() {
        System.out.println("In drive method in SportsCar");
    }

    @Override
    public void refuel(Fuel f) {
        System.out.println("In refuel method in SportsCar ");
    }

    public static void main(String[] args) {
        SportsCar sc = new SportsCar();
        sc.defaultDrive();
    }
}
