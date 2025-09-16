package com.ntu.generics;

class Creature {

}

class Animal extends Creature {

    public void makeSound() {
        System.out.println("Animal make sound");
    }

}

class Dog extends Animal {

}

class Cat extends Animal {

}

class IndianCat extends Cat {

}

class Husky extends Dog {

}

// Unbounded <T>
// Upper bounded <T extends Animal>
class Home<T extends Animal> {
    private T animal1;
    private T animal2;

    public Home(T animal1, T animal2) {
        this.animal1 = animal1;
        this.animal2 = animal2;
    }

    public T getAnimal1() {
        animal1.makeSound();
        animal2.makeSound();
        return animal1;
    }

    public void setAnimal1(T animal1) {
        this.animal1 = animal1;
    }

    public T getAnimal2() {
        return animal2;
    }

    public void setAnimal2(T animal2) {
        this.animal2 = animal2;
    }
}

public class UpperBoundGenericsAnimalClass {
    public static void main(String[] args) {
        Home<Animal> animalHome = new Home<>(new Animal(), new Animal());
        Home<Dog> dogHome = new Home<>(new Dog(), new Dog());
        Home<Cat> catHome = new Home<>(new Cat(), new Cat());
        Home<Husky> huskyHome = new Home<>(new Husky(), new Husky());
        Home<IndianCat> indianCatHome = new Home<>(new IndianCat(), new IndianCat());

        animalHome.getAnimal1();


    }
}
