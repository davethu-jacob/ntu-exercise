package com.composition;

public class TestAuthor {
    public static void main(String[] args) {
        Author author = new Author("Davethu D Jacob", "davethu@mcruncher.com");
        System.out.println(author);

        author.setEmail("davethu@gmail.com");
        System.out.println("Name is: " + author.getName());
        System.out.println("Email is: " + author.getEmail());
    }
}
