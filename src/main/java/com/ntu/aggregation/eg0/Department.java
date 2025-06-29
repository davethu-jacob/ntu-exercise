package com.ntu.aggregation.eg0;

import java.util.List;

public class Department {
    private final String name;
    private final List<Student> student;

    public Department(String name, List<Student> student) {
        this.name = name;
        this.student = student;
    }

//    public List<Student> getStudent() {
//        return student;
//    }
//
//    public void addStudent(Student student) {
//        this.student.add(student);
//    }

    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                ", student=" + student +
                '}';
    }
}
