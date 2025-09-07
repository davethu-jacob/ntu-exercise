package com.headfirst.ch11;

import java.util.List;

abstract class Animal {
    void eat() {
        System.out.println("animal eating");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    void meow() {
        System.out.println("Cat meows");
    }
}
public class TestGenerics1 {
    public static void main(String[] args) {
        List<Animal> animals = List.of(new Dog(), new Cat(), new Dog());
        takeAnimals(animals);
    }

    private static void takeAnimals(List<Animal> animals) {
        for (Animal a : animals) {
            a.eat();
        }
    }
}
