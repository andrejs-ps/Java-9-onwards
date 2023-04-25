package com.company.java17to20.java18;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class CharSetUpdate {

    public static void main(String[] args) throws IOException {

        // Before - this might throw an 'UnsupportedCharsetException' if the specified charset not present on the system
        Charset charSet = Charset.forName("windows-1252");
        FileWriter writer = new FileWriter("out.txt", charSet);

        // Now - added .forName() overload that accepts a fallback
        // use 'UTF_8' if 'windows-1252' no present on the system
        Charset charSetWithFallback = Charset.forName("windows-1252", StandardCharsets.UTF_8);


    }
}
