package com.corejava.concurrentcollection;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class ConcurrentMapExample2 {
    public static void main(String[] args) {

        ConcurrentMap<String, String> concurrentMap = new ConcurrentHashMap<>();

        concurrentMap.put("A", "1");
        concurrentMap.put("B", "2");
        concurrentMap.put("C", "3");

        System.out.println("Initial ConcurrentHashMap: " + concurrentMap);

        concurrentMap.put("B", concurrentMap.get("B") + 10);

        System.out.println("Final ConcurrentHashMap: " + concurrentMap);

    }
}
