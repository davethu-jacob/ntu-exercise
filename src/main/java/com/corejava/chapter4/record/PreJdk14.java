package com.corejava.chapter4.record;

import java.util.Objects;

class Person {
    private final String name;
    private final String address;

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, address);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else if (!(obj instanceof Person)) {
            return false;
        } else {
            Person other = (Person) obj;
            return Objects.equals(name, other.name) && Objects.equals(address, other.address);
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }
}

public class PreJdk14 {
    public static void main(String[] args) {
        Person p1 = new Person("Davethu D Jacob", "53 Jalan Eco Santuari 1/2");
        System.out.println(p1);
    }


}
