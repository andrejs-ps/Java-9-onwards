package com.company.java16;

import java.util.List;
import java.util.stream.Stream;

public class StreamApi {

    public static void main(String[] args) {

        List<Integer> ints = Stream.of(1, 2, 3)
                .filter(n -> n < 3)
                .toList();  // new, instead of the verbose .collect(Collectors.toList())

        ints.forEach(System.out::println);

    }
}
