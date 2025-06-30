package com.composition.computer;


/* Composition in Java is a fundamental object-oriented programming (OOP) principal used to establish a "has-a" relationship between classes.
 * It involves one class containing an object of another class as an instant variable, rather than inheriting from it.
 * This approach promotes loose coupling and enhances flexibility, maintainability, and reusability in software design.
 *
 * Key characteristics of Composition
 * ==================================
 * 1. "Has-a" Relationship - This signifies that an object of one class "has" an object of another class. for example, a Computer object "has an" Processor object.
 * 2. Strong Relationship (Ownership) - In Composition, the contained object (e.g. Processor) is often considered a part of the containing object (e.g. Computer)
 * and may not be able to exist independently if the containing object is destroyed.
 * 3. Achieved via Instance Variables - Composition is implemented by declaring an instance of one class within another class.
 * 4. Delegation of Responsibility - The containing class can delegate specific functionalities to the contained object, leveraging its methods and data.
 *
 */

public class Main {
    public static void main(String[] args) {
        Processor intelI7 = new Processor("Intel i7", 3.8);
        System.out.println(intelI7);
        RAM ram = new RAM(16);
        System.out.println(ram);
        HardDrive hardDrive = new HardDrive(1);
        Computer computer = new Computer(intelI7, ram, hardDrive);
        System.out.println(computer);
    }
}
