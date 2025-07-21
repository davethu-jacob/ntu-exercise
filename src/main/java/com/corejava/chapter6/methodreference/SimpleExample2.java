package com.corejava.chapter6.methodreference;

import java.util.Arrays;
import java.util.List;

public class SimpleExample2 {
    public static void main(String[] args) {
        // 1. Reference to a static method
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        numbers.forEach(System.out::println);

        // 2. Reference to an instance method of a particular object
        System.out.println();
        Greeter greeter = new Greeter();
        List<String> family = List.of("Davethu", "Esther", "Michelle", "Melissa", "Paul", "Philip", "Joel");
        family.forEach(greeter::greet);

        // 3. Reference to an instance method of an arbitrary object of a particular type
        System.out.println();
        List<String> children = Arrays.asList("Michelle", "Melissa", "Paul", "Philip", "Joel");
        // children.sort((s1, s2) -> s1.compareTo(s2)
        children.sort(String::compareTo);
        System.out.println(children);

        // 4. Reference to a constructor
        System.out.println();
        List<String> names = Arrays.asList("Michelle", "Melissa", "Paul", "Philip", "Joel");
        // List<Sibling> people = names.stream().map( name -> new Sibling(name)).toList();
        List<Sibling> people = names.stream().map(Sibling::new).toList();
        System.out.println(people);

    }


}
