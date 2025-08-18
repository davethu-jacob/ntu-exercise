package com.headfirst.ch8;

import java.util.ArrayList;

public class Exercise1 {
    public static void main(String[] args) {
        // We can only add Dog object into the ArrayList
        ArrayList<Dog> myDogArrayList = new ArrayList<>();
        Dog aDog = new Dog();
        myDogArrayList.add(aDog);
        System.out.println(myDogArrayList.get(0));

        // We can add any object into the ArrayList
        ArrayList<Object> myDogObjectArrayList = new ArrayList<>();
        Dog bDog = new Dog();
        myDogObjectArrayList.add(bDog);
        Cat aCat = new Cat();
        myDogObjectArrayList.add(aCat);
        System.out.println(myDogObjectArrayList.toString());

        // We cannot add a Cat object into the ArrayList
        /*
        myDogArrayList.add(aCat);
         */

        // This will not compile. This is because the get method returns type Object and
        // we are attempting to assign it to type Dog
        /*
        Dog cDog = myDogObjectArrayList.get(0);
         */


    }
}
