package com.company.java11;

import java.util.function.Predicate;
import java.util.stream.Stream;

import static com.company.common.Utils.print;

public class NewStringMethods {

    public static void main(String[] args) {

        // repeat
        print("hello ".repeat(3));

        // instead of "".equals(text.trim())
        // or instead of str.trim().isEmpty()
        // https://stackoverflow.com/questions/3598770/check-whether-a-string-is-not-null-and-not-empty
        print(" ".isBlank());

        // strip() slightly different from trim()
        print("text  \u2005".strip());

        // lines()
        // instead of ugly BufferedReader or other older solutions
        Stream<String> linesFromString = "1\n 2 \n 3".lines();
        linesFromString.forEach(System.out::print);

        // predicate::not
        linesFromString
                .filter(Predicate.not(String::isBlank))
                .forEach(System.out::println);
    }

}
