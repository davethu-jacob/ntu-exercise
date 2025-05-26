package com.oop;

public class Student {
    private final String name;
    private String address;
    private int numCourses;
    private final String[] courses;
    private final int[] grades;
    private static final int MAX_COURSES = 30;

    public Student(String name, String address) {
        this.name = name;
        this.address = address;
        courses = new String[MAX_COURSES];
        grades = new int [MAX_COURSES];
        numCourses = 0;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String toString() {
        return String.format("%s(%s)",name, address);
    }

    public void addCourseGrade(String course, int grade) {
        courses[numCourses] = course;
        grades[numCourses] = grade;
        ++numCourses;
    }

    public void printGrades() {
        System.out.print(name);
        for (int i = 0; i <= numCourses - 1; i++) {
            System.out.print(" " + courses[i] + ":" + grades[i]);
        }
        System.out.println();
    }

    public double getAverageGrade() {
        int sumOfGrade = 0;
        for (int i = 0; i <= numCourses; i++) {
            sumOfGrade += grades[i];
        }
        return (double)sumOfGrade/numCourses;
    }
}
