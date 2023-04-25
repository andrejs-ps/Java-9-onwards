package com.company.java11to16.java12;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static com.company.common.Utils.print;

public class NewFilesMethod {

    static String filePath = System.getProperty("user.dir") + "/src/main/resources/";
    static String file_1 = filePath + "file_1.txt";
    static String file_2 = filePath + "file_2.txt";

    public static void main(String[] args) throws IOException {

        // Finds and returns the position of the first mismatched byte in the content of two files,
        // or -1L if there is no mismatch
        long result = Files.mismatch(Paths.get(file_1), Paths.get(file_2));

        print(result);      // -1
    }
}
