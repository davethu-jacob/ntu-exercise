package com.ntu.generics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PreJ5ArrayListTest {
    public static void main(String[] args) {
        List stringList = new ArrayList();
        stringList.add("alpha");
        stringList.add("beta");
        System.out.println(stringList);

        Iterator stringIterator = stringList.iterator();
        while (stringIterator.hasNext()) {
            String string = (String) stringIterator.next();  // Need to explicitly downcast Object to String
            System.out.println(string);
        }

        stringList.add(999);
        stringList.add(new Integer(1024));
        System.out.println(stringList);
        /* Compile time ok, but runtime exception
        String number = (String) stringList.get(2);
        System.out.println(number);

         */
    }
}
