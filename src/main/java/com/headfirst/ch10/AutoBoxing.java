package com.headfirst.ch10;

public class AutoBoxing {
    public static void main(String[] args) {
        int i = 10;
        int j = getNumber(i);
        System.out.println(j);

    }

    private static int getNumber(Integer i) {
        i++;
        return i;
    }
}
