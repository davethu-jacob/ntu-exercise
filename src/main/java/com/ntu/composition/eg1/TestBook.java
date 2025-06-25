package com.ntu.composition.eg1;

public class TestBook {
    public static void main(String[] args) {
        Author author = new Author("Davethu", "davethu@mcruncher.com", 'M');
        System.out.println(author);

        author.setEmail("finance@mcruncher.com");
        System.out.println(author);
        System.out.println("Author's name is: " + author.getName());
        System.out.println("Author's email is: " + author.getEmail());

        Book b1 = new Book("Java for Dummies", author, 8.88, 88);
        System.out.println(b1);

        b1.setPrice(9.9);
        b1.setQuantity(99);
        System.out.println(b1);
        System.out.println("Book name: " + b1.getName());
        System.out.println("Price is: " + b1.getPrice());
        System.out.println("Quantity is: " + b1.getQuantity());
        System.out.println("Author details: " + b1.getAuthor());
        System.out.println("Author's name is: " + b1.getAuthor().getName());
        System.out.println("Author's name is: " + b1.getAuthorName());
        System.out.println("Author's email is: " + b1.getAuthor().getEmail());

        Book b2 = new Book("A22222", new Author("Paul Tan", "paul@somewhere.com", 'F'), 99.99);
        System.out.println(b2);
    }
}
