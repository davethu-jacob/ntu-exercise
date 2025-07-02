package com.corejava.chapter5.hashcode;

public class HashcodeExample {
    public static void main(String[] args) {
        String hello = "Hello";
        String harry = "Harry";
        String h = "Harry";

        System.out.println("hashcode for hello: " + hello.hashCode());
        System.out.println("hashcode for harry: " + harry.hashCode());
        System.out.println("hashcode for h: " + h.hashCode());

        var helloSb = new StringBuilder(hello);
        System.out.println("hashcode helloSb: " + helloSb.hashCode());

    }
}
