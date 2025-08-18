package com.headfirst.ch8;

class DogList {
    private Dog[] dogs = new Dog[5];
    private int nextIndex = 0;

    public void add (Dog d) {
        if (nextIndex < dogs.length) {
            dogs[nextIndex] = d;
            System.out.println("dog added at: " + nextIndex);
            nextIndex++;
        }
    }
}

public class MyDogList {
    public static void main(String[] args) {
        DogList dogList = new DogList();
        Dog dog = new Dog();
        Dog dog1 = new Dog();
        dogList.add(dog);
        dogList.add(dog1);

    }
}
