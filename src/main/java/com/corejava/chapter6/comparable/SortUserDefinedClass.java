package com.corejava.chapter6.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Person implements Comparable<Person> {
    private int id;
    private String name;
    private int age;

    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Person o) {
        return this.name.compareTo(o.name);
    }
}

public class SortUserDefinedClass {
    public static void main(String[] args) {

        List<Person> person = new ArrayList<>();
        person.add( new Person(1, "Davethu D Jacob", 64));
        person.add(new Person(2, "Esther", 62));
        person.add(new Person(3, "Abraham", 67));
        person.add(new Person(4, "Mery Selver Rani", 65));
        person.add(new Person(5, "Manickam", 71));
        System.out.println("Person in insertion order: " + person);

        // We must implement the comparable interface for the Collections.sort(person) to work
        Collections.sort(person);
        System.out.println("Person in natural order by name: " + person);

    }
}
