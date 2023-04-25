package com.company.java17to20.java18;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import static com.company.common.Utils.print;

public class HttpHeadDemo {

    /**
     * HEAD() convenience method added
     */
    public static void main(String[] args) throws IOException, InterruptedException {
        HttpRequest head = HttpRequest.newBuilder(URI.create("https://api.github.com/"))
                .HEAD()
                .build();

        var response = HttpClient.newHttpClient().send(head, HttpResponse.BodyHandlers.ofString());

        print(response);
    }
}
