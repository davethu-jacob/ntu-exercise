package com.headfirst.ch11;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ConvenienceFactoryMethods {
    public static void main(String[] args) {
        List<String> songs1 = new ArrayList<>();
        songs1.add("somersault");
        songs1.add("cassidy");
        songs1.add("$10");
        System.out.println(songs1);

        List<String> songs2 = List.of("somersault", "cassidy", "$10");
        System.out.println(songs2);

        Set<Book> books = Set.of(new Book("How Cats Work"),
                new Book("Remix your Body"),
                new Book("Finding Emo"),
                new Book("How Cats Work"),
                new Book("How Dogs Work"));
        System.out.println(books);

        Map<String, Integer> scores = Map.of("Kathy", 42, "Bert", 343, "Skyler", 420);
        System.out.println(scores);
    }
}
