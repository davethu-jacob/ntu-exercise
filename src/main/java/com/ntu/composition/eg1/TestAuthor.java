package com.ntu.composition.eg1;

public class TestAuthor {
    public static void main(String[] args) {
        Author author = new Author("Davethu D Jacob", "davethu@mcruncher.com", 'M');
        System.out.println(author);

        author.setEmail("davethu@gmail.com");
        System.out.println("Name is: " + author.getName());
        System.out.println("Email is: " + author.getEmail());
        System.out.println("Gender is: " + author.getGender());
    }
}
