package com.composition.car;

public class Main {
    public static void main(String[] args) {
        // Composition = Represents a "part-of" relationship between objects.
        // For example, an engine is "part of" car.
        // Allows complex objects to be constructed from smaller objects

        Car car = new Car("Toyota Alphard", 2025, "Turbo");

        System.out.println(car.getModel());
        System.out.println(car.getYear());
        System.out.println(car.getEngine().getType());

        car.start();
    }
}
