package com.headfirst.ch10;

public class NumberFormatting {
    public static void main(String[] args) {
        long myBillion = 1_000_000_000;
        int billion = 1_000_000_000;
        String s = String.format("%,d", myBillion);
        System.out.println(s);
        System.out.printf("My first billion %,d",billion);
    }
}
