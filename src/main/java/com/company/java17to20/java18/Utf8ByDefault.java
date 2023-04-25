package com.company.java17to20.java18;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class Utf8ByDefault {

    // https://openjdk.org/jeps/400 - Platform Default Encoding

    public static void main(String[] args) throws IOException {

        // Problem:
        // 1) On Windows, use the below FileWriter to write characters outside the ASCII table, e.g. some exotic Unicode chars, without explicitly specifying a char set
        // 2) Copy or transfer the file to a UNIX-based OS, like a Mac, and read the file using the default char encoding of the system
        // 3) Likely result - garbled output
        // Hence the problem - unpredictable behavior.
        FileWriter writer = new FileWriter("out.txt");

        // Solution before Java 18: always specify the charset, (and good luck not forgetting it!)
        FileWriter writer2 = new FileWriter("out.txt", StandardCharsets.UTF_8);

        // Solution since Java 18: UTF-8 is now default, so no need to specify the Char set


    }


}
