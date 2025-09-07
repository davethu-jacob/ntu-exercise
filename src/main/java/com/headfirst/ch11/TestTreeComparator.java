package com.headfirst.ch11;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TestTreeComparator {
    public static void main(String[] args) {
        new TestTreeComparator().go();
    }

    private void go() {
        Book b1 = new Book("How Cats Work");
        Book b2 = new Book("Remix your Body");
        Book b3 = new Book("Finding Emo");

        BookCompare bookCompare = new BookCompare();
        Set<Book> tree = new TreeSet<>(bookCompare);
        tree.add(b1);
        tree.add(b2);
        tree.add(b3);
        System.out.println(tree);
    }
}

class BookCompare implements Comparator<Book> {

    @Override
    public int compare(Book o1, Book o2) {
        return o1.getTitle().compareTo(o2.getTitle());
    }
}
