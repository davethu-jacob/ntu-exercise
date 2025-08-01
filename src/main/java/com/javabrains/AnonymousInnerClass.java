package com.javabrains;

class CarM {
    private int seats;
    private int wheels;
    private double weight;
    private double mileage;

    public int getSeats() {
        return seats;
    }

    public boolean isTwoSeater() {
        return seats == 2;
    }

    public boolean isFourSeater() {
        return seats == 4;
    }
}
public class AnonymousInnerClass {
    public static void main(String[] args) {
        CarM proton = new CarM() {
            @Override
            public boolean isTwoSeater() {
                return getSeats() >= 2;
            }
        };

    }
}
