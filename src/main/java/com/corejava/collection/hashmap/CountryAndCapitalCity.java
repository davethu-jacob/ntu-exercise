package com.corejava.collection.hashmap;

import java.util.HashMap;
import java.util.Map;

/**
 * 1. HashMap implements the Map interface
 * 2. HashMap is similar to ArrayList but with key-value pairs
 * 3. Keys are unique and values can be duplicated
 * 4. Does not maintain any order, but is memory efficient
 * e.g. (email, name), (user ID, user name), or (country, capital city
 */
public class CountryAndCapitalCity {
    public static void main(String[] args) {
        Map<String, String> country = new HashMap<>();

        country.put("USA", "Washington DC");
        country.put("Malaysia", "Kuala Lumpur");
        country.put("China", "Beijing");
        country.put("India", "New Delhi");
        country.put("Canada", "Ottawa");

        System.out.println("Country and capital city: " + country);
        System.out.println("Number of countries in the HashMap: " + country.size());
        System.out.println("Is country 'Kuala Lumpur' exist: " + country.containsKey("Kuala Lumpur"));
        System.out.println("Is country 'Malaysia' exist: " + country.containsKey("Malaysia"));
        System.out.println("Is the city 'New Delhi' found in the HashMap: " + country.containsValue("New Delhi"));
        System.out.println("Replace capital city of Canada with 'Quebec': " + country.replace("Canada","Quebec"));
        System.out.println(country);
        System.out.println("Capital city of Malaysia: " + country.get("Malaysia"));

        for (String key : country.keySet()) {
            System.out.println(key + ": " + country.get(key));
        }


    }
}
