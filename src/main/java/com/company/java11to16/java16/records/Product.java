package com.company.java11to16.java16.records;

/**
 * params are called "Components"
 * want more fields - must add into the signature
 * Extending not allowed, implementing interfaces IS allowed
 */
public record Product(String name, int price) {

    // static fields allowed, but not non-static
    static String country = "US";

    // constructor with all fields is generated

    // can add validation
    public Product {
        if(price < 0) {
            throw new IllegalArgumentException();
        }
    }

    // possible to override auto-generated methods like toString()
}
