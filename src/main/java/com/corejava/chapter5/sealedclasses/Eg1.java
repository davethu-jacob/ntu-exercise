package com.corejava.chapter5.sealedclasses;

// Human is the parent class of Manish, Vartika, Anjali
// It is a sealed class and must have subclasses
// So only classes Manish, Vartika and Anjali can inherit it
// When a class is declared sealed, you must specify the list of classes that can inherit it.
// If any class other than Manish, Vartika, and Anjali tries to inherit from the Human class,
// it will cause a compile error

sealed class Human permits Manish, Vartika, Anjali {
    public void printName() {
        System.out.println("Default");
    }
}

// Manish, Vartika, and Anjali are child classes of the Human class
// All child classes must be either sealed, non-sealed or final

non-sealed class Manish extends Human {
    public void printName() {
        System.out.println("Manish Sharma");
    }
}

sealed class Vartika extends Human {
    public void printName() {
        System.out.println("Vartika Dadheech");
    }
}

final class Anjali extends Human {
    public void printName() {
        System.out.println("Anjali Sharma");
    }
}

final class Davethu extends Vartika {
    public void printName() {
        System.out.println("Davethu");
    }
}

non-sealed class Esther extends Vartika {
    public void printName() {
        System.out.println("Esther");
    }
}

public class Eg1 {
    public static void main(String[] args) {
        Human h1 = new Anjali();
        Human h2 = new Manish();
        Human h3 = new Vartika();
        Davethu v1 = new Davethu();
        Esther v2 = new Esther();

        h1.printName();
        h2.printName();
        h3.printName();
        v1.printName();
        v2.printName();

    }
}
