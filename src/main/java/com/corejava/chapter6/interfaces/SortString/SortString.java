package com.corejava.chapter6.interfaces.SortString;

import java.util.*;

class Person implements Comparable<Person> {
    private int id;
    private String name;
    private int age;

    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
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
        // natural sort by age
//        return this.age - o.age;
        return this.name.compareTo(o.name);
    }

}

class naturalSortByAgeComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return Integer.compare(o1.getAge(), o2.getAge());
    }
}

class CustomStringLengthComparator implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        return Integer.compare(o1.length(), o2.length());
    }
}


public class SortString {
    public static void main(String[] args) {
        String[] names = {"Davethu", "Esther", "Abraham", "Mery Selver Rani", "Manickam"};
        System.out.println("Name in insert order: " + Arrays.toString(names));

        Arrays.sort(names);
        System.out.println("Name in (ascending) sort order: " + Arrays.toString(names));

        // provides a Comparator that sorts elements in reverse natural order (descending)
        Arrays.sort(names, Collections.reverseOrder());
        System.out.println("Name in (descending) sort order: " + Arrays.toString(names));

        List<String> fruits = new ArrayList<>();
        fruits.add("Durian");
        fruits.add("durian");
        fruits.add("Pineapple");
        fruits.add("pineapple");
        fruits.add("Rambutan");
        fruits.add("rambutan");
        fruits.add("Banana");
        fruits.add("banana");
        fruits.add("Mangosteen");
        fruits.add("mangosteen");
        System.out.println("Fruits in insert order: " + fruits);

        Collections.sort(fruits);
        System.out.println("Fruits in (ascending) sort order: " + fruits);

        fruits.sort(Collections.reverseOrder());
        System.out.println("Fruits in (descending) sort order: " + fruits);

        // sort by string length
        Collections.sort(fruits, new CustomStringLengthComparator());
        System.out.println(fruits);

        List<Person> person = new ArrayList<>();
        person.add(new Person(1, "Davethu", 64));
        person.add(new Person(2, "Esther", 62));
        person.add(new Person(3, "Abraham", 67));
        person.add(new Person(4, "Mery Selver Rani", 65));
        person.add(new Person(5, "Manickam", 71));
        System.out.println("Person in insert order: " + person);

        Collections.sort(person);
        System.out.println("Person sorted by Name in natural ascending order: " + person);

        Collections.sort(person, new naturalSortByAgeComparator());
        System.out.println("Natural sort (ascending) order by Age: " + person);


    }
}
