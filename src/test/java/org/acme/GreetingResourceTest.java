package org.acme;

import jakarta.json.Json;
import jakarta.json.JsonObject;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.StringReader;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

@Tag("integration")
public class GreetingResourceTest {

    private final HttpClient client = HttpClient.newHttpClient();

    private final String resourceUri = "http://localhost:8083/payara-sandbox/greeting";

    @Test
    void checkOnBob() throws IOException, InterruptedException {
        var request = HttpRequest.newBuilder(URI.create(resourceUri)).build();
        var response = client.send(request, HttpResponse.BodyHandlers.ofString());
        Assertions.assertEquals(200, response.statusCode());
        try (var reader = Json.createReader(new StringReader(response.body()))) {
            var json = reader.readObject();
            Assertions.assertEquals("Bob", json.getString("greetings"));
        }
    }
}
