package com.javabrains;

class Car {
    private int seats;
    private int wheels;
    private double weight;
    private double mileage;

    boolean canSeat(int numberOfPeople) {
        return seats >= numberOfPeople;
    }

    boolean isHeavierThan(Car c) {
        return this.weight > c.weight;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}

public class ObjectAsParameter {
    public static void main(String[] args) {
        Car car = new Car();
        Car mpv = new Car();

        car.setSeats(5);
        car.setWeight(1500);
        mpv.setSeats(7);
        mpv.setWeight(700);

        System.out.println(car.isHeavierThan(mpv));
    }
}
