package com.corejava.collection.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListTest {
    public static void main(String[] args) {
        List<String> ladies = new LinkedList<>();
        ladies.add("Amy");
        ladies.add("Carla");
        ladies.add("Erica");
        System.out.println("Ladies: " + ladies);

        List<String> men = new LinkedList<>();
        men.add("Bob");
        men.add("Doug");
        men.add("Francis");
        men.add("Raymond");
        System.out.println("Men: " + men);

        // Merge the men into ladies

        ListIterator<String> ladiesListIterator = ladies.listIterator();
        Iterator<String> menIterator = men.iterator();

        while (menIterator.hasNext()) {
            if (ladiesListIterator.hasNext())
                ladiesListIterator.next();
            ladiesListIterator.add(menIterator.next());
        }
        System.out.println(ladies);
    }
}
