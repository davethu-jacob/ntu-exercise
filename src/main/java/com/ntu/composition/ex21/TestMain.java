package com.ntu.composition.ex21;

public class TestMain {
    public static void main(String[] args) {
        Author author = new Author("Davethu", "davethu@mcruncher.com", 'M');
        System.out.println(author);
        author.setEmail("davethu@gmail.com");
        System.out.println(author.getEmail());
        System.out.println(author.getName());
        System.out.println(author.getGender());

        Book book1 = new Book("Java for Dummies", author, 99.99, 88);
        System.out.println(book1);
        book1.setPrice(77.77);
        book1.setQuantity(8);
        System.out.println(book1);

        System.out.println(book1.getAuthor().getName());
        System.out.println(book1.getAuthor().getEmail());
        System.out.println(book1.getAuthorName());
    }
}
