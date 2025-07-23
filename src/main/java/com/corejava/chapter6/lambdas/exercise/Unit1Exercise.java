package com.corejava.chapter6.lambdas.exercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

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
        System.out.println("\nPrint List sorted by lastName using SortLastName class");
        Collections.sort(people, new SortLastName());
        System.out.println(people);

        // Option 2 - Sort List by lastName in descending order using Lambda expression
        System.out.println("\nPrint List sorted by lastName using Lambda expression");
        Collections.sort(people, (o1,o2) -> o2.getLastName().compareTo(o1.getLastName()));
        System.out.println(people);

        // Option 3 - Sort List by lastName in ascending order using Anonymous inner class
        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getLastName().compareTo(o2.getLastName());
            }
        });
        System.out.println(people);

        // Prints all elements in the list
        System.out.println("\nPrint all elements in the List");
        printAll(people);

        // Prints all elements in the list using Lambda expression
        System.out.println("\nPrint all elements in the List using Lambda expression");
        printConditionallyUsingInterface(people, p -> true);

        // Prints all elements in the list using Lambda expression and using the Function Interface Consumer
        performConditionally(people,p -> true, p -> System.out.println(p));

        // Create a method that prints all people that have last name beginning with C
        System.out.println("\nPrint Conditionally last name starting with C");
        printLastNameBeginningWithC(people);

        System.out.println("\nPrint conditionally last name starting with C using Anonymous inner class");
        printConditionallyUsingInterface(people, new Condition() {

            @Override
            public boolean test(Person p) {
                return p.getLastName().startsWith("C");
            }
        });

        System.out.println("\nPrint conditionally first name starting with C using Lambda expression");
        printConditionallyUsingInterface(people, p -> p.getFirstName().startsWith("C"));

        // Here we are not using interface but using Predicate
        System.out.println("\nPrint conditionally first name starting with C using Predicate");
        printConditionallyUsingPredicate(people, p -> p.getFirstName().startsWith("C"));

    }

    private static void printConditionallyUsingInterface(List<Person> people, Condition condition) {
        for(Person p : people) {
            if (condition.test(p))
                System.out.println(p);
        }
    }

    private static void printConditionallyUsingPredicate(List<Person> people, Predicate<Person> predicate) {
        for(Person p : people) {
            if (predicate.test(p))
                System.out.println(p);
        }
    }

    private static void performConditionally(List<Person> people, Predicate<Person> predicate, Consumer<Person> consumer) {
        for(Person p : people) {
            if (predicate.test(p))
                consumer.accept(p);
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

}

class SortLastName implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        return o1.getLastName().compareTo(o2.getLastName());
    }
}

interface Condition {
    boolean test(Person p);
}

