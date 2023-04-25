package com.company.java11to16.java11.httpclient;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.Optional;

public class BasicLinkValidator {

    private static HttpClient client;

    public static void main(String[] args) throws IOException {

        client = HttpClient.newHttpClient();

        String links = """
                https://github.com/andrejs-ps
                https://httpstat.us/404
                https://httpstat.us/500
                """;

        var invalidResponses = links.lines()
                .map(BasicLinkValidator::getResponse)
                .filter(Optional::isPresent)
                .map(Optional::get)
                .filter(r -> r.statusCode() >= 400)
                .toList();

        invalidResponses.forEach(r ->
                System.out.printf("%s responded with %s\n", r.uri(), r.statusCode())
        );
    }

    private static Optional<HttpResponse<Void>> getResponse(String link) {
        HttpRequest request = HttpRequest.newBuilder(URI.create(link)).build();
        try {
            var response = client.send(request, BodyHandlers.discarding());
            return Optional.of(response);
        } catch (IOException | InterruptedException e) {
            return Optional.empty();
        }
    }
}
