package com.company.java9;

import java.util.*;

import static java.util.Map.entry;

public class CollectionFactoryMethods {

    /**
     * New factory .of() methods
     */
    public static void main(String[] args) {

        // new factory methods - create unmodifiable (!) collections
        // i.e.  set(), add() and other modifying methods throw UnsupportedOperationException
        List<Integer> list = List.of(1, 2, 3);
        Set<String> set = Set.of("a", "b");
        Map<String, String> map = Map.of("key1", "val1", "key2", "val2");


        // Map.of() has 10 overloaded methods accepting up to 10 Key-Value pairs
        // To create a map with 11+ elements:
        Map<String, String> test2 = Map.ofEntries(
                entry("key1", "val1"),
                entry("key2", "val2")
                // etc.
        );


        // older ways
        List<Integer> listOld = Arrays.asList(1, 2, 3);

        Map<String, String> mapOld = new HashMap<>();
        mapOld.put("key1", "val1");
        mapOld.put("key2", "val2");
    }
}
