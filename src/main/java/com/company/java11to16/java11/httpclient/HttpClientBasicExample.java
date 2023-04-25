package com.company.java11to16.java11.httpclient;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import static com.company.common.Utils.print;

public class HttpClientBasicExample {

    /**
     * Create a client, send a GET Request, print Response info
     */
    public static void main(String... args) throws Exception {
        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request =
                HttpRequest.newBuilder(URI.create("https://github.com/"))
                        .GET()  // default, may be omitted
                        .build();

        HttpResponse<String> response =
                client.send(request, HttpResponse.BodyHandlers.ofString());

        print("Status code was: " + response.statusCode());

        print(response.headers().map());
    }
}
