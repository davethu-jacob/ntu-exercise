package com.headfirst.ch11;

import java.util.ArrayList;
import java.util.List;

public class SortMountains {
    public static void main(String[] args) {
        new SortMountains().go();
    }

    private void go() {
        List<Mountain> mountains = new ArrayList<>();
        mountains.add(new Mountain("Longs", 14255));
        mountains.add(new Mountain("Elbert", 14433));
        mountains.add(new Mountain("Maroon", 14156));
        mountains.add(new Mountain("Castle", 14265));
        System.out.println("as entered:\n" + mountains);

        mountains.sort((Mountain m1, Mountain m2) -> m1.getName().compareTo(m2.getName()));
        System.out.println("by name:\n" + mountains);

        mountains.sort((Mountain m1, Mountain m2) -> m2.getHeight() - m1.getHeight());
        System.out.println("by height:\n" + mountains);

        mountains.sort((Mountain m1, Mountain m2) -> (m1.getHeight() > m2.getHeight() ? 1 : -1));
        System.out.println("by height ascending:\n" + mountains);

    }
}

class Mountain {
    private final String name;
    private final int height;

    Mountain(String name, int height) {
        this.name = name;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return (name + " " + height);
    }
}
