package com.corejava.chapter6.interfaces.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


class Student implements Comparable<Student> {
    String name;
    int age;
    int weight;

    public Student(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return this.age - o.age;
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
        System.out.println("Student by insertion order: " + student);

        Collections.sort(student);
        System.out.println("Student natural sort by age: " + student);
    }
}
