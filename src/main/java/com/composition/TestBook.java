package com.composition;

public class TestBook {
    public static void main(String[] args) {
        Author author = new Author("Davethu", "davethu@mcruncher.com", 'm');
        System.out.println(author);

        Book book = new Book("Java for Dummy", author, 19.95, 99);
        System.out.println(book);

        book.setPrice(29.95);
        book.setQuantity(28);
        System.out.println("Book name: " + book.getName());
        System.out.println("Price is: " + book.getPrice());
        System.out.println("Quantity is: " + book.getQuantity());
        System.out.println("Author details: " + book.getAuthor());
        System.out.println("Author's name is: " + book.getAuthor().getName());
        System.out.println("Author's email is: " + book.getAuthor().getEmail());

        Book anotherBook = new Book("More Java", new Author("Paul Tan", "paul@somewhere.com", 'm'), 29.95, 999);
        System.out.println(anotherBook);

        Book freeBook = new Book("Maven", 99.99, new Author("Esther", "esther@mcruncher.com", 'f'));
        System.out.println(freeBook);
    }
}
