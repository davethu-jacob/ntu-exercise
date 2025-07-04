package com.corejava.chapter5.wrapper;

import java.util.ArrayList;

public class WrapperExample {
    public static void main(String[] args) {
        var list = new ArrayList<Integer>();
        list.add(3);  // automatically translated to list.add(Integer.valueOf(3)); This is called autoboxing
        int n = list.get(0); // automatically translates to int n = list.get(i).intValue(); This is called unboxing
        System.out.println(n);
        list.add(33);
        list.add(333);
        list.add(3333);
        System.out.println(list);

        var friends = new ArrayList<String>();
        friends.add("Davethu");
        friends.add("Esther");
        System.out.println(friends);

        Integer x = 100;
        Integer y = null;

        System.out.println(x);
        System.out.println(y);
        // throws NullPointerException
//        System.out.println(2 * y);

        // ternary operator example
        var result = (Math.random() < 0) ? "Negative" : "Positive";
        System.out.println("The random number is: " + result);

        Integer a = 105;
        Double b = 2.0;
        System.out.println(true ? a : b);

        // to convert a String to an int
        String s = "33";
        int c = Integer.parseInt(s);
        System.out.println(c);

        // int intValue
        int z = a.intValue();
        System.out.println(z);
    }
}
