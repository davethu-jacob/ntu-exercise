package com.ntu.generics;

import java.util.*;

public class GenericUpperBoundedWildcard {
    public static void main(String[] args) {
        // Number is supertype of Integer, Double and Float
        List<Number> numberList = new ArrayList<>();
        numberList.add(1.1f);  // primitive float auto-box to Float, upcast to Number
        numberList.add(45);
        numberList.add(Math.PI);
        System.out.println(numberList);

        // Integer is a subtype of Number, which satisfies <? extends E=Number>
        Collection<Integer> integerCollection = new LinkedList<>();
        integerCollection.add(2);  // primitive int auto-box to Integer
        integerCollection.add(35);
        System.out.println(integerCollection);
        numberList.addAll(integerCollection);
        System.out.println(numberList);
        /* The following is not allowed
        integerCollection.addAll(numberList);
         */

        // Double is a subtype of Number, which satisfies <? extends E=Number>
        // Set is a subtype of Collection. Set<Double> is a subtype of Collection<Double>
        Set<Double> numberSet = new HashSet<>();
        numberSet.add(4.4);  // primitive double auto-box to Double
        numberSet.add(5.5);
        numberSet.add(5.5);
        numberSet.add(1.1);
        System.out.println(numberSet);
        numberList.addAll(numberSet);
        System.out.println(numberList);

    }
}
