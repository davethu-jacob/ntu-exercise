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

        String song1 = "Circles";
        String song2 = song1;
        System.out.println("Hashcode for 'song1': " + song1.hashCode());
        System.out.println("Hashcode for 'song2': " + song2.hashCode());
        if (song1 == song2)
            System.out.println("The references song1 and song2 are referring to the same object in the heap");
        if (song1.equals(song2))
            System.out.println("The objects referenced by song1 and song2 are equal");

        String song3 = new String ("Circles");
        String song4 = new String ("Circles");
        System.out.println("Hashcode for 'song3': " + song3.hashCode());
        System.out.println("Hashcode for 'song4': " + song4.hashCode());
        if (song3 == song4)
            System.out.println("The references song3 and song4 are referring to the same object in the heap");
        else System.out.println("The references song3 and song 4 are referring to TWO different objects in the heap");
        if (song3.equals(song4))
            System.out.println("The references song3 and song4 are referring to two objects that are equal");



    }
}
