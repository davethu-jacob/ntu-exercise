package com.headfirst.ch8;

public class AnimalTestDrive {
    public static void main(String[] args) {
        MyAnimalList list = new MyAnimalList();
        Dog dog = new Dog();
        Cat cat = new Cat();
        Dog gsd = new Dog();
        list.add(dog);
        list.add(cat);

        // equals(Object o)
        System.out.println("dog.equals(gsd): " + dog.equals(gsd));

        // getClass()
        System.out.println("dog belongs to: " + dog.getClass());
        System.out.println("gsd belongs to: " + gsd.getClass());

        // hashCode()
        System.out.println("Hashcode for dog: " + dog.hashCode());

    }
}

class MyAnimalList {
    private Animal[] animals = new Animal[5];
    private int nextIndex = 0;

    void add(Animal a) {
        if (nextIndex < animals.length) {
            animals[nextIndex] = a;
            System.out.println("Animal added at " + nextIndex);
        }
    }
}

class Dog extends Canine {

}

class Cat extends Feline {

}

abstract class Animal {

}

abstract class Feline extends Animal {

}

abstract class Canine extends Animal {

}
