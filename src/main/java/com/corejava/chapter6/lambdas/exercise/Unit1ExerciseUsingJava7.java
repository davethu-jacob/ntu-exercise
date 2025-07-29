package com.corejava.chapter6.lambdas.exercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Unit1ExerciseUsingJava7 {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Charles", "Dickens", 60),
                new Person("Lewis", "Carroll", 42),
                new Person("Thomas", "Carlyle", 51),
                new Person("Charlotte", "Bronte", 45),
                new Person("Matthew", "Arnold", 39)
        );
        System.out.println();
        System.out.println(people);

        // Step 1 - Print List sorted by lastName
        // Option 1a - Sort list by lastName in ascending order
        System.out.println("\nPrint List sorted in ascending order by lastName using SortLastName class");
        Collections.sort(people, new SortLastNameAscending());
        System.out.println(people);

        // Option 1b - Sort List by lastName in descending order using Anonymous inner class
        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o2.getLastName().compareTo(o1.getLastName());
            }
        });

        // Step 2 - Print all elements in Person object using a method
        System.out.println("\nPrint List sorted in descending order by lastName using Anonymous inner class");
        printAll(people);

        // Step 3 - Print all elements that have lastName beginning with C using a method

        // Option 1a
        // Create a method that prints all people that have last name beginning with C
        System.out.println("\nPrint List lastName beginning with C - Option 1a");
        printAllLastNameBeginningWithC(people);

        // Option 1b
        System.out.println("\nPrint List lastName beginning with C - Option 1b");
        printConditionally(people, new Condition() {

            @Override
            public boolean test(Person p) {
                return p.getLastName().startsWith("C");
            }
        });


    }

    private static void printConditionally(List<Person> people, Condition condition) {
        for (Person p : people) {
            if (condition.test(p))
                System.out.println(p);
        }
    }

    private static void printAllLastNameBeginningWithC(List<Person> people) {
        for (Person p : people) {
            if (p.getLastName().startsWith("C"))
                System.out.println(p);
        }
    }

    private static void printAll(List<Person> people) {
        for (Person p : people) {
            System.out.println(p);
        }
    }

    interface Condition {
        boolean test(Person p);
    }


}

class SortLastNameAscending implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        return o1.getLastName().compareTo(o2.getLastName());
    }
}


