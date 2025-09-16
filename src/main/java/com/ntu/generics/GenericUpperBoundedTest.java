package com.ntu.generics;

import java.util.*;

public class GenericUpperBoundedTest {
    public static void main(String[] args) {
        List<Number> numberList = new ArrayList<>();
        numberList.add(1.1f);
        numberList.add(9.8f);
        System.out.println(numberList);

        // Integer is a subtype of Number, which satisfies <? extends E>
        Collection<Integer> integerCollection = new LinkedList<>();
        integerCollection.add(2);
        integerCollection.add(36);
        System.out.println(integerCollection);

        numberList.addAll(integerCollection);
        System.out.println(numberList);

        // Double is a subtype of Number, which satisfies <? extends E=Number>
        // Set is a subtype of Collection. Set<Double> is a subtype of Collection<Double>
        Set<Double> doubleSet = new HashSet<>();
        doubleSet.add(1.28);
        doubleSet.add(9.99);
        doubleSet.add(9.99);
        System.out.println(doubleSet);

        numberList.addAll(doubleSet);
        System.out.println(numberList);
    }
}
