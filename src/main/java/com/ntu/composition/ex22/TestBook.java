package com.ntu.composition.ex22;

import com.ntu.composition.ex21.Author;

import java.util.ArrayList;

public class TestBook {
    public static void main(String[] args) {
        Author[] authors = new Author[2];
        authors[0] = new Author("Davethu", "davethu@gmail.com", 'M');
        authors[1] = new Author("Esther", "esther@yahoo.com", 'F');
        System.out.println(authors[0]);
        System.out.println(authors[1]);
//        System.out.println(ArrayList);
        Book book1 = new Book("Java for Dummy", authors, 19.99, 99);
        System.out.println(book1);
    }
}
