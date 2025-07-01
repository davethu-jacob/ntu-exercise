package com.ntu.composition.ex23;

public class TestBook {
    public static void main(String[] args) {
        var author1 = new Author("Davethu", "davethu@mcruncher.com");
        System.out.println(author1);;
        System.out.println(author1.getName());

        Book book1 = new Book("isbn", "Java for Dummies", author1, 9.99, 99);
        System.out.println(book1);
        System.out.println(book1.getName());
        System.out.println(book1.getAuthorName());
        System.out.println(book1.getPrice());
        System.out.println(book1.getQuantity());
        System.out.println(book1.getAuthor().getName());
    }
}
