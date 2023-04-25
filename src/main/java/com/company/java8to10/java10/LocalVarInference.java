package com.company.java8to10.java10;

import java.io.BufferedReader;
import java.net.http.HttpClient;
import java.util.List;

public class LocalVarInference {

    /**
     * Allowed: only as a local variable
     * Not allowed: anywhere else (class field, method param, etc.)
     * User var responsibly!
     *
     * Use:
     *  - when it's clear what the type is (string, int)
     *  - to shorten very long ugly types
     *
     *  Don't use:
     *      - returned value is unclear (var data = service.getData();)
     */

    public static void main(String[] args) {

        // allowed, but brings little benefit
        var b = "b";
        var c = 5; // int
        var d = 5.0; // double
        var httpClient = HttpClient.newHttpClient();

        // one hell of an inference :)
        var list = List.of(1, 2.0, "3");

        // the benefit becomes more evident with types with long names
        var reader = new BufferedReader(null);
        // vs.
        BufferedReader reader2 = new BufferedReader(null);
    }
}
