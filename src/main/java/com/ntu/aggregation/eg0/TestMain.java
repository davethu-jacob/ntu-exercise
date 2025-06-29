package com.ntu.aggregation.eg0;

import java.util.ArrayList;
import java.util.List;

public class TestMain {
    public static void main(String[] args) {
        Student cs1 = new Student("Davethu", 9031);
        System.out.println(cs1);
        System.out.println(cs1.getStudentName());
        System.out.println(cs1.getStudentId());
        Student cs2 = new Student("Vijayan Pillai", 8875);
        List<Student> csStudent = new ArrayList<>();
        csStudent.add(cs1);
        csStudent.add(cs2);
        Student as1 = new Student("Bernard D Silva", 8873);
        List<Student> asStudent = new ArrayList<>();
        asStudent.add(as1);

        Department csdepartment = new Department("Computer Science", csStudent);
        Department asdepartment = new Department("Applied Science", asStudent);
        System.out.println(csdepartment);
        System.out.println(asdepartment);

        List<Department> department = new ArrayList<>();
        department.add(csdepartment);
        department.add(asdepartment);


    }
}
