package com.corejava.chapter6.interfaces.comparable;

public class Person implements Identifiable, Comparable<Person> {
    private String name;
    private String socialSecurityNumber;

    public Person(String name, String socialSecurityNumber) {
        this.name = name;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public String getName() {
        return name;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    @Override
    public String getId() {
        return getSocialSecurityNumber();
    }

    @Override
    public int compareTo(Person o) {
        return this.getId().compareTo(o.getId());
    }
}
