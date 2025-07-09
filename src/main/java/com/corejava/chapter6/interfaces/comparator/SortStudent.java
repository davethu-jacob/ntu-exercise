package com.corejava.chapter6.interfaces.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student {
    String name;
    int age;
    int weight;

    public Student(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }
}

public class SortStudent {
    public static void main(String[] args) {
        List<Student> student = new ArrayList<>();
        student.add(new Student("Davethu", 7, 25));
        student.add(new Student("Esther", 5, 18));
        student.add(new Student("Abraham", 10, 28));
        student.add(new Student("Mery Selver Rani", 8, 20));
        student.add(new Student("Manickam Samyveloo", 13, 35));
        System.out.println(student);

        Comparator<Student> ageComparator = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return (o1.age > o2.age) ? 1 : -1;
            }
        };
        Collections.sort(student, ageComparator);
        System.out.println("Sorted age order: " + student);

        Comparator<Student> weightComparator = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return (o1.weight > o2.weight) ? 1 : -1;
            }
        };
        Collections.sort(student, weightComparator);
        System.out.println("Sorted weight order: " + student);
    }
}
