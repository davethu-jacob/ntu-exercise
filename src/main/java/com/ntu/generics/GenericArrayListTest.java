package com.ntu.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericArrayListTest {
    public static void main(String[] args) {
        List<String> fruitList = new ArrayList<>();
        fruitList.add("apple");
        fruitList.add("orange");
        System.out.println(fruitList);

        for (String fruit : fruitList) {
            System.out.println(fruit);
        }

        List<String> coffeeList = new ArrayList<>();
        coffeeList.add("Expresso");
        coffeeList.add("Latte");
        System.out.println(coffeeList);

        for (String coffee : coffeeList) {
            System.out.println(coffee);
        }

        List<String> animalList = new ArrayList<>();
        animalList.add("Tiger");
        animalList.add("Elephant");
        System.out.println(animalList);

        for (String animal : animalList) {
            System.out.println(animal);
        }

        List<Integer> integerList = new ArrayList<>();
        integerList.add(11);
        integerList.add(456);
        System.out.println(integerList);

        for (Integer integer : integerList) {
            System.out.println(integer);
        }

        int i = integerList.get(0);
        System.out.println(i);

        List<Number> numberList = new ArrayList<>();
        numberList.add(25);
        numberList.add(1024);
        numberList.add(Math.PI);
        System.out.println(numberList);

        for (Number number : numberList) {
            System.out.println(number);
        }

    }
}
