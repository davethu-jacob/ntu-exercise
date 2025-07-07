package com.corejava.chapter6.interfaces.properties;

interface Car {
}

class Toyota implements Car {
}

public class TestMainInterface {
    public static void main(String[] args) {
        Toyota alphard = new Toyota();
        Toyota vellfire = new Toyota();

        if (alphard instanceof Toyota)
            System.out.println("alphard instanceof Toyota: true");
        else System.out.println("alphard instanceof Toyota: false");

        if (alphard instanceof Car)
            System.out.println("alphard instanceof Car: true");
        else System.out.println("alphard instanceof Car: false");

// In java all the classes are inherited from the Object class
// So instances of all the classes are also an instance of the Object class
        if (alphard instanceof Object)
            System.out.println("alphard instanceof Object: true");
        else System.out.println("alphard instanceof Object: false");


    }
}
