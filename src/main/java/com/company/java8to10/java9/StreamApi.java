package com.company.java8to10.java9;

import java.util.List;
import java.util.function.Predicate;

public class StreamApi {

    /**
     * New Stream API methods - takeWhile() and dropWhile()
     * They are like filter(), but with stop conditions
     */
    public static void main(String[] args) {

        // filter (from Java 8) - filter through the entire stream
        List<Integer> list = List.of(1, 2, 3, 7, 9, 2, 6);
        Predicate<Integer> p = i-> i < 5;
        list.stream()
                .filter(p)
                .forEach(System.out::print);    // 1232

        System.out.println();

        // takeWhile - like filter(), but exit the stream as soon as the predicate does NOT match the 1st time
        list.stream()
            .takeWhile(p)
            .forEach(System.out::print);    // 123

        System.out.println();

        // dropWhile - remove elements while the given predicate returns true
        // and stops removing (but keeps going) when the predicate returns false for the 1st time
        list.stream()
                .dropWhile(p)
                .forEach(System.out::print);    // 7926

        System.out.println();
        // trick to extract a chunk of string
        String chunk = """
                Lorem ipsum
                ==========
                This is the text
                That we care about
                ==========
                Lorem ipsum
                """;
        // task: extract the text between "=========="
        String separator = "==========";
        chunk.lines()
                .dropWhile(l -> !l.contains(separator))
                .skip(1)
                .takeWhile(l -> !l.contains(separator))
                .forEach(System.out::println);
    }


}
