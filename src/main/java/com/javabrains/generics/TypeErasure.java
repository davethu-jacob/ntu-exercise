package com.javabrains.generics;

import java.util.ArrayList;
import java.util.List;
 /*
1. Type erasure in Java generics is a process performed by the Java compiler during compilation, where all generic type information is removed from the code.
2. This means that at runtime, the Java Virtual Machine (JVM) does not have access to the specific type parameters used in generic classes or methods.

Process
1. Replacement of Type Parameters: The compiler replaces all type parameters in generic types with their bounds (if a bound is specified,
   e.g., T extends Comparable) or with Object if the type parameter is unbounded (e.g., T)
2. Insertion of Casts: To maintain type safety, the compiler inserts necessary type casts where generic methods are invoked or generic types are retrieved.
   This ensures that the retrieved value is cast back to its expected type
3. Generation of Bridge Methods: For cases involving inheritance and generics (e.g., a subclass overriding a generic method from a superclass),
   the compiler might generate "bridge methods" to preserve polymorphism and ensure correct method dispatch at runtime.
*/

public class TypeErasure {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        addToNames(names, "Name 1");
        addToNames(names, "Name 2");
        System.out.println(names);
        incorrectAddToNames(names, 100);
        System.out.println(names);
        // The following throws ClassCastException during run time
//        String names3 = names.get(2);
    }

    private static void incorrectAddToNames(List list, Integer i) {
        list.add(i);
    }

    private static void addToNames(List<String> names, String s) {
        names.add(s);
    }
}
