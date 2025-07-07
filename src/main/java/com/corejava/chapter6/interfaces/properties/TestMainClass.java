package com.corejava.chapter6.interfaces.properties;

class Animal {}
class Dog extends Animal {}

public class TestMainClass {
    public static void main(String[] args) {
        Animal myAnimal = new Dog();
        Animal anotherAnimal = new Animal();
        String text = "Hello";

        if (myAnimal instanceof Dog)
            System.out.println("myAnimal instanceof Dog: true");
        else System.out.println("myAnimal instanceof Dog: false");

        if (myAnimal instanceof Animal)
            System.out.println("myAnimal instanceof Animal: true");
        else System.out.println("myAnimal instanceof Animal: false");

        if (anotherAnimal instanceof Animal)
            System.out.println("anotherAnimal instanceof Animal: true");
        else System.out.println("anotherAnimal instanceof Animal: false");

        if (anotherAnimal instanceof Dog)
            System.out.println("anotherAnimal instanceof Dog: true");
        else System.out.println("anotherAnimal instanceof Dog: false");

//        System.out.println("myAnimalInstanceOFDog: " + myAnimal instanceof Animal);

        if (text instanceof String)
            System.out.println("text instanceof String: true");
        else System.out.println("text instanceof String: false");
    }

}
