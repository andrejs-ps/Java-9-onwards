package com.company.java11to16.java16.patterns;

import java.util.Set;

import static com.company.common.Utils.print;

public class PatternMatchingForInstanceof {

    public static void main(String[] args) {

        Object o = new Book("Harry Potter", Set.of("Jon Doe"));

        // old way
        if (o instanceof Book) {
            Book book = (Book) o;
            print("The book's author(s) are " + book.getAuthors());
        }

        // new way
        if (o instanceof Book book) {
            print("The book's author(s) are " + book.getAuthors());
        }

    }
}
