package com.ntu.aggregation.eg1;

/* In Java, aggregation is a type of association between two classes that represents a "has-a" relationship.
 * This means one class contains a reference to an object of another class as part of its internal structure.
 *
 * Key characteristics of Aggregation
 * ==================================
 * 1. "Has-a" relationship - this signifies that one object "has" or contains another object.
 * For example a Student "has-a" Address.
 * 2. Loose coupling - The contained object can exist independently of the containing object. If the containing
 * object is destroyed, the contained object can still exist. For instance, if a Student object is deleted, the
 * Address object associated with it can still exist independently.
 * 3. Code reusability - Aggregation promotes code reusability as the contained objects can be reused in different
 * contexts or by different containing objects.
 * 4. Flexibility - It offers flexibility in design as the contained objects are not tightly bound to the container
 * and can easily replaced or modified.
 *
 * How aggregation is achieved in Java
 * ===================================
 * Aggregation is implemented by defining an instance variable of one class within another class. This instance variable
 * holds a reference to an object of the "part" class within the "whole" class.
 *
 */
public class Main {
    public static void main(String[] args) {
        Address studentAddress = new Address("53 Jalan Eco Santuari 1/2", "Telok Panglima Garang");
        System.out.println(studentAddress);

        Student student = new Student("Davethu", 64, studentAddress);
        System.out.println(student);
    }
}
