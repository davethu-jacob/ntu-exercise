package com.corejava.collection.hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MultipleValueHashMap {
    public static void main(String[] args) {
        Map<String, List<String>> studentCourse = new HashMap<>();

        // add course for Alice
        addCourse(studentCourse, "Alice", "Maths");
        addCourse(studentCourse, "Alice", "Physics");
        addCourse(studentCourse, "Alice", "Chemistry");

        // add course for Bob
        addCourse(studentCourse, "Bob", "History");
        addCourse(studentCourse, "Bob", "Literature");

        // add course for Charlie
        addCourse(studentCourse, "Charlie", "Computer Science");

        // Print the student and the courses enrolled
        System.out.println("List of students and courses enrolled:");
        for (Map.Entry<String, List<String>> entry : studentCourse.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        // Retrieve courses for a student
        System.out.println("Courses enrolled by student Alice " + studentCourse.get("Alice"));

        // Retrieve courses for a student who is not in the Map
        System.out.println("Courses enrolled by student Davethu " + studentCourse.get("Davethu"));
    }

    // Helper method to enroll a course for a student
    // If the student is not in the Map, a new list is created for the student
    private static void addCourse(Map<String, List<String>> studentCourse, String name, String course) {
        studentCourse.computeIfAbsent(name, k -> new ArrayList<>()).add(course);
        System.out.println(studentCourse);
    }
}
