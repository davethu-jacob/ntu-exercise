package com.corejava.collection.hashmap;

import java.util.HashMap;
import java.util.Map;

public class StudentScore {
    public static void main(String[] args) {
        Map<String, Integer> score = new HashMap<>();

        score.put("Davethu", 96);
        score.put("Esther", 99);
        score.put("Michelle", 90);
        score.put("Melissa", 96);
        score.put("Paul", 99);
        score.put("Philip", 98);
        score.put("Joel", 92);

        System.out.println("Score: " + score);

        System.out.println("Esther's score is: " + score.get("Esther"));
        System.out.println("Any students with score 99: " + score.containsValue(99));
        score.put("Esther", 100);
        System.out.println("Esther's score is: " + score.get("Esther"));

        // Iterate over the HashMap using entrySet()
        System.out.println("Iterating through HashMap entries:");
        for (Map.Entry<String, Integer> entry : score.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        // Iterate over keys using keySet()
        System.out.println("Iterate through HashMap keys:");
        for (String name : score.keySet()) {
            System.out.println(name);
        }

        // Iterate over values using values()
        System.out.println("Iterate over values using values():");
        for (Integer scores : score.values()) {
            System.out.println(scores);
        }
    }
}
