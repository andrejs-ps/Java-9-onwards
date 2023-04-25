package com.company.java8to10.java9;

public interface IThing {

    double getPrice();

    default double getPriceWithVat() {
        return calculateThing() * 1.2;
    }

    // private methods now allowed
    // use case - to be used in default methods
    private double calculateThing() {
        return 1;
    }
}
