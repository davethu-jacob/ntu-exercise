package com.headfirst.ch9;

class Car {
    private String name;
    private int doors;
    private int capacity;

    Car(String name) {
        this(name, 2);
    }

    Car(String name, int doors) {
        this(name, doors, 1300);
    }

    Car(String name, int doors, int capacity) {
        this.name = name;
        this.doors = doors;
        this.capacity = capacity;
    }

    String getName() {
        return name;
    }

    public static void main(String[] args) {
        Car c1 = new Car("Mini");
        System.out.println("Car: " + c1.getName() + " Doors: " + c1.doors + " Capacity: " + c1.capacity);

        Car c2 = new Car("Toyota", 5);
        System.out.println("Car: " + c2.getName() + " Doors: " + c2.doors + " Capacity: " + c2.capacity);

        Car c3 = new Car("Honda", 6, 1500);
        System.out.println("Car: " + c3.getName() + " Doors: " + c3.doors + " Capacity: " + c3.capacity);

    }
}

