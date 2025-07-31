package com.javabrains.generics;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

public class ArrayListSampleJDK14 {
    public static void main(String[] args) {
        /*
        1. Create an ArrayList
        2. We did not include the Type parameters
        3. We can add all data types into the ArrayList as there is no type checking
         */

        ArrayList myArrayList = new ArrayList();

        // add elements of type String to the ArrayList
        myArrayList.add("Apple");
        myArrayList.add("Banana");
        myArrayList.add("Cherry");
        System.out.println(myArrayList);

        // We need to cast the Object returned to String. Otherwise an exception will be thrown
        String myFavoriteFruit = (String) myArrayList.get(1);

        // add elements of type int to the ArrayList
        myArrayList.add(125);
        System.out.println(myArrayList);

        // add elements of type Integer
        myArrayList.add(new Integer(1024));
        System.out.println(myArrayList);

        myArrayList.add(new Date());
        System.out.println(myArrayList);

        // Accessing element at index 1
        System.out.println("Element in index 1 is: " + myArrayList.get(1));

        // Modify the element at index 1
        myArrayList.set(1, "Apricot");
        System.out.println("Modified ArrayList index 1 is: " + myArrayList.get(1));

        // Remove element at index 3
        myArrayList.remove(3);
        System.out.println("ArrayList after removing element 3: " + myArrayList);

        // size of the ArrayList
        System.out.println("Size of the ArrayList: " + myArrayList.size());

        // Iterating through the ArrayList
        System.out.println("Iterating through the ArrayList: ");
        Iterator iterator = myArrayList.iterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());

        // Clear the ArrayList
        myArrayList.clear();
        System.out.println("ArrayList after clearing: " + myArrayList);
        System.out.println("Size of the ArrayList: " + myArrayList.size());


    }
}
