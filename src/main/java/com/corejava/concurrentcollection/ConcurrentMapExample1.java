package com.corejava.concurrentcollection;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentMapExample1 {
    public static void main(String[] args) {
        Map<String, Integer> concurrentMap = new ConcurrentHashMap<>();

        // Multiple threads can safely add or retrieve elements
        concurrentMap.put("Key1", 10);
        concurrentMap.put("Key2", 20);

        int value = concurrentMap.get("Key1");
        System.out.println("Value for Key1 is: " + value);

        // Atomic operation: put if absent
        concurrentMap.putIfAbsent("Key3", 30);
        concurrentMap.putIfAbsent("Key1", 100);

        System.out.println(concurrentMap);
    }
}
