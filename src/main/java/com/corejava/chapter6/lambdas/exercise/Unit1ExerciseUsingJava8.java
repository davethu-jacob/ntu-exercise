package com.corejava.chapter6.lambdas.exercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;


public class Unit1ExerciseUsingJava8 {
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

        // Step 1 - sort by lastName in ascending order using Lambda expression
        Collections.sort(people, (p1, p2) -> p1.getLastName().compareTo(p2.getLastName()));

        // Step 2 - Print all elements in Person object using a method
        // Option 1
        System.out.println("\nPrint List sorted in ascending order by lastName using Lambda expression and Predicate");
        printConditionally(people, p -> true);
        // Option 2
        System.out.println("\nPrint List sorted in ascending order by lastName using Lambda expression, Predicate and Consumer");
        performConditionally(people, p -> true, p -> System.out.println(p));

        performConditionally(people, p -> true, p -> System.out.println(p));

        // Step 3 - Print all elements that have lastName beginning with C using Lambda expression
        System.out.println("\nPrint List lastName beginning with C using Lambda expression and Predicate");
        // Option 1
        printConditionally(people, p -> (p.getLastName().startsWith("C")));
        // Option 2
        System.out.println("\nPrint List lastName beginning with C using Lambda expression, Predicate and Consumer");
        performConditionally(people, p -> (p.getLastName().startsWith("C")), p -> System.out.println(p));

        System.out.println("\nPrint firstName for lastName beginning with C using Lambda expression, Predicate and Consumer");
        performConditionally(people, p -> (p.getLastName().startsWith("C")), p -> System.out.println(p.getFirstName()));

    }

    private static void performConditionally(List<Person> people, Predicate<Person> predicate , Consumer<Person> consumer) {
        for (Person p : people) {
            if (predicate.test(p))
                consumer.accept(p);
        }
    }

    private static void printConditionally(List<Person> people, Predicate<Person> predicate) {
        for (Person p : people) {
            if (predicate.test(p))
                System.out.println(p);
        }
    }

}


