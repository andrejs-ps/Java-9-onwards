package com.company.java12;

import java.util.Arrays;

import static com.company.common.Utils.print;

public class NewStringMethod {

    /**
     * indent(int i) and transform(String s) were added
     */
    public static void main(String[] args) {

        print("hi");
        print("hi".indent(5)); // also takes negative nums

        // transform - orderly transformation of date,
        // as opposed to writing code inside out 'words(clean(""))'
        String[] result = "some text $whatever$"
                .transform(NewStringMethod::clean)
                .transform(String::toUpperCase)
                .transform(NewStringMethod::words);

        print(Arrays.toString(result));
    }

    public static String clean(String s) {
        return s.replaceAll("\\$", "");
    }
    public static String[] words(String s) {
        return s.split(" ");
    }
}
