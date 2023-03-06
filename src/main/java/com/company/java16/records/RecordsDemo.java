package com.company.java16.records;

import static com.company.common.Utils.print;

/**
 * Record are data-only immutable classes (thus have specific use cases)
 * They are a restricted (specialized) form of a class (like enums)
 * Not suitable for objects that are meant to change state, etc.
 * <p>
 * Records are NOT:
 * - Boilerplate reduction mechanism
 * <p>
 * Records generate constructors, getters, fields; equals, hashCode, toString
 * <p>
 * Use cases:
 * - to model immutable data
 * - to hold read-only data in memory
 * - DTOs - Data Transfer Objects
 */
public class RecordsDemo {

    public static void main(String[] args) {
        Product p1 = new Product("milk", 50);
        Product p2 = new Product("milk", 50);

        print(p1.price()); // without "get" prefix
        print(p1);         // auto-generated toString() - Product[name=milk, price=50]

        print(p1 == p2);       // false    - different objects
        print(p1.equals(p2));  // true     - values of fields (milk, 50) are compared by the auto-generated equals()/hashCode()
    }
}
