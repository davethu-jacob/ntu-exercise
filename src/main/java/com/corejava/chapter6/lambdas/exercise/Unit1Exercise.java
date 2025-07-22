package com.corejava.chapter6.lambdas.exercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Unit1Exercise {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Charles", "Dickens", 60),
                new Person("Lewis", "Carroll", 42),
                new Person("Thomas", "Carlyle", 51),
                new Person("Charlotte", "Bronte", 45),
                new Person("Matthew", "Arnold", 39)
        );
        System.out.println(people);

        // Option 1 - Sort list by lastName in ascending order
        Collections.sort(people, new SortLastName());
        System.out.println(people);

        // Sort List by lastName in descending order using Lambda expression
        Collections.sort(people, (o1,o2) -> o2.getLastName().compareTo(o1.getLastName()));
        System.out.println(people);

        // Sort List by lastName in ascending order using Anonymous inner class
        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getLastName().compareTo(o2.getLastName());
            }
        });
        System.out.println(people);

        // Create a method that prints all elements in the list
        printAll(people);

        // Create a method that prints all people that have last name beginning with C
        System.out.println("\nPrint Conditionally last name starting with C");
        printLastNameBeginningWithC(people);

        System.out.println("\nPrint conditionally last name starting with C");
        printConditionally(people, new Condition() {

            @Override
            public boolean test(Person p) {
                return p.getLastName().startsWith("C");
            }
        });

        System.out.println("\nPrint conditionally first name starting with C");
        printConditionally(people, new Condition() {

            @Override
            public boolean test(Person p) {
                return p.getFirstName().startsWith("C");
            }
        });

    }

    private static void printConditionally(List<Person> people, Condition condition) {
        for(Person p : people) {
            if (condition.test(p))
                System.out.println(p);
        }
    }

    // Rigid implementation because if we want to print beginning with "D", then we have to write another method
    private static void printLastNameBeginningWithC(List<Person> people) {
        for(Person p : people) {
            if (p.getLastName().startsWith("C"))
                System.out.println(p);
        }
    }

    private static void printAll(List<Person> people) {
        for(Person p : people)
            System.out.println(p);
    }

    interface Condition {
        boolean test(Person p);
    }
}

class SortLastName implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        return o1.getLastName().compareTo(o2.getLastName());
    }
}
