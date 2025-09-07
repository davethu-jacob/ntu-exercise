package com.headfirst.ch11;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class TestGenerics2 {
    public static void main(String[] args) {
        new TestGenerics2().go();
    }

    private void go() {
        List<Animal> animals = List.of(new Dog(), new Cat(), new Dog());
        takeAnimals(animals);

        List<Dog> dogs = List.of(new Dog(), new Dog());
        takeDogs(dogs);
        takeDogs(new ArrayList<>());
        List<Dog> dogs1 = new ArrayList<>();
        takeDogs(dogs1);
        takeAnyAnimal(new ArrayList<Dog>());
        takeAnyAnimal(new ArrayList<>());
        takeAnyAnimal(new ArrayList<Animal>());

        List<Animal> animals1 = new ArrayList<>();
        takeAnyAnimal(animals);

        /* This does not compile because takeObjects wants an ArrayList not a List
        List<Object> objects = new ArrayList<>();
        takeObjects(objects);
         */

        /*
        takeObjects(new ArrayList<>(Dog));
         */

        takeObjects(new ArrayList<Object>());

        takeAnyAnimal(dogs);
        List<Dog> vaccinatedDogs = takeAllAnimals(dogs);
        System.out.println(vaccinatedDogs);

    }

    private void takeObjects(ArrayList<Object> objects) {

    }

    private void takeAnimals(List<Animal> animals) {
        for (Animal a : animals) {
            a.eat();
        }
    }

    private <T extends Animal> List<T> takeAllAnimals(List<T> list) {

        return list;

    }

    private void takeDogs(List<Dog> dogs) {
        for (Dog d : dogs) {
            d.eat();
            d.bark();
        }
    }

    private void takeAnyAnimal(List<? extends Animal> animals) {
        for (Animal a : animals) {
            a.eat();
        }
    }
}
