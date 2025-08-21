package com.headfirst.ch9;

abstract class PetAnimal {
    private String name;

    String getName() {
        return name;
    }

    PetAnimal(String name) {
        this.name = name;
    }
}

class Dog extends PetAnimal {
    Dog(String name) {
        super(name);
    }
}
public class MakeDog {
    public static void main(String[] args) {
        Dog d = new Dog("Sonia");
        System.out.println(d.getName());
    }
}
