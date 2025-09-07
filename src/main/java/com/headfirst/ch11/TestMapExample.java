package com.headfirst.ch11;

import java.util.HashMap;
import java.util.Map;

public class TestMapExample {
    public static void main(String[] args) {
        // 1. Creating a Map using HashMap
        // The Map interface defines the contract, and HashMap provides the implementation.
        // <String, Integer> specifies that keys will be Strings and values will be Integers.
        Map<String, Integer> studentScores = new HashMap<>();

        // 2. Add key value pairs to the map
        studentScores.put("Alice", 95);
        studentScores.put("Bob", 88);
        studentScores.put("Charlie", 92);
        studentScores.put("David", 75);
        System.out.println("Initial Map: " + studentScores);

        // 3. Accessing values using get
        System.out.println("Alice score: " + studentScores.get("Alice"));

        // 4. Check if a key exists
        System.out.println("Does the Map contain Eve?: " + studentScores.containsKey("Eve"));
        System.out.println("Does the Map contain Bob?: " + studentScores.containsKey("Bob"));

        // 5. Updating a value using put (Overwrite the existing value for the key
        studentScores.put("Bob", 90);
        System.out.println("Map after updating Bob's score: " + studentScores);

        // 6. Removing am entry using remove()
        Integer removedScore = studentScores.remove("David");
        System.out.println("Removed David's score: " + removedScore);
        System.out.println("Map after removing David's score: " + studentScores);

        // 7. Iterating over the Map
        // Iterating over key
        System.out.println("Iterating over keys:");
        for (String studentName : studentScores.keySet())
            System.out.println("Student: " + studentName);

        // Iterating over entries (key-value pairs)
        System.out.println("Iterating over entries:");
        for (Map.Entry<String, Integer> entry: studentScores.entrySet())
            System.out.println("Student: " + entry.getKey() + ",Score: " + entry.getValue());

        // 8. Getting the size of the Map
        System.out.println("Number of students in the Map: " + studentScores.size());

        // 9. clearing the Map
        studentScores.clear();
        System.out.println("Map after clearing: " + studentScores);
        System.out.println("Is the Map empty?: " + studentScores.isEmpty());

    }
}
