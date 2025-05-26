package com.oop;

public class TestStudent {
    public static void main(String[] args) {
        Student student = new Student ("Davethu", "52 Jalan Eco Santuari 1/2");
        System.out.println(student);

        student.setAddress("18 Jalan USJ 3/1E, 47600 Subang Jaya");
        System.out.println(student);
        System.out.println(student.getName());
        System.out.println(student.getAddress());

        student.addCourseGrade("IM101", 89);
        student.addCourseGrade("IM102", 57);
        student.addCourseGrade("IM103", 96);
        student.printGrades();
        System.out.printf("The average grade is: %.2f%n", student.getAverageGrade());
    }
}
