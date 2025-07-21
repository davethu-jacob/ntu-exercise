package com.corejava.chapter6.methodreference;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class ComparisonHelper {
    int compareByName(Person a, Person b) {
        return a.getName().compareTo(b.getName());
    }

    int compareByAge(Person a, Person b) {
        return a.getAge().compareTo(b.getAge());
    }
}

public class ReferenceToInstanceMethod {
    public static void main(String[] args) {
        // create an empty ArrayList of user-defined type
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Davethu D Jacob", 64));
        personList.add(new Person("Esther", 62));
        personList.add(new Person("Joel", 21));
        personList.add(new Person("Philip", 24));
        personList.add(new Person("Paul", 30));
        personList.add(new Person("Melissa", 31));
        personList.add(new Person("Michelle", 33));

        ComparisonHelper comparisonHelper = new ComparisonHelper();

        // sort name in ascending order
        System.out.println();
        System.out.println("Name sorted in ascending order");
        Collections.sort(personList, comparisonHelper::compareByName);
        personList.stream().map(x -> x.getName()).forEach(System.out::println);

        // sort age in ascending order
        System.out.println();
        System.out.println("Age sorted in ascending order");
        Collections.sort(personList, comparisonHelper::compareByAge);
        personList.stream().map(x -> x.getAge()).forEach(System.out::println);

    }


}
