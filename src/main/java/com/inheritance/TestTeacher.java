package com.inheritance;

import java.util.ArrayList;

public class TestTeacher {
    public static void main(String[] args) {
        var t1 = new Teacher("Jeyaseelan", "Lim Garden", 6000);
        System.out.println(t1);
        var t2 = new Teacher("Purushotaman", "Ipoh Garden", 7578);
        System.out.println(t2);

        var s1 = new Student("Davethu", "18 Jalan USJ 3/1E, 47600 subang Jaya");
        System.out.println(s1);

        int i = 0;
        while (i < 25) {
            s1.study();
            i++;
        }
        System.out.println(s1);

        ArrayList<Person> person = new ArrayList<>();
        person.add(new Teacher("Esther", "139 Indian Settlement, Batu Gajah", 3500));
        person.add(new Student("Davethu", "527-B, Block 1, Sri Pahang Flats, Bukit Bangsar"));

        printPersons(person);

        Person s2 = new Student("Michelle", "53 Jalan Eco Santuari 1/2");
        System.out.println(s2.getName());

        Student ollie = new Student("Ollie", "6381 Hollywood Blvd");
        System.out.println(ollie);
        Person olliePerson = new Student("Ollie", "63 Hollywood Blvd");
        System.out.println(olliePerson);
        Object ollieObject = new Student("Ollie", "6 Hollywood Blvd");
        System.out.println(ollieObject);

    }

    public static void printPersons(ArrayList<Person> person) {
        for (Person item : person) {
            System.out.println(item);
        }
    }
}
