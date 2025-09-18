package com.corejava.chapter4.constructor;

public class ObjectInitializationBlock {
    public static void main(String[] args) {
        Student student = new Student(9031, "Davethu");
        System.out.println("name= " + student.getName());
        System.out.println("id= " + student.getId());

    }
}

class Student {
    private int id;
    private String name;

    {
        id = 1;
        name = "Default name";
        System.out.println("In initialization block= name: " + name);
        System.out.println("In initialization block= id: " + id);
    }

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
