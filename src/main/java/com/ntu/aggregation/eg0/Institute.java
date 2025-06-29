package com.ntu.aggregation.eg0;

import java.util.List;

public class Institute {
    private String instituteName;
    private List<Department> department;

    public Institute(String instituteName, List<Department> department) {
        this.instituteName = instituteName;
        this.department = department;
    }

//    public void addDepartment(Department department) {
//        department.add(department);
//    }

//    public int getTotalStudentsInInstitute() {
//        int noOfStudents = 0;
//        List<Student> student = null;
//        for (Department dept : departments) {
//            student = dept.getStudent();
//            for (Student s : student) {
//                noOfStudents++;
//            }
//        }
//        return noOfStudents;
//    }
}
