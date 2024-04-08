package com.example.httpClient;

import java.io.IOException;
import java.net.HttpRetryException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class TodoRepository {

    String getTodo() throws URISyntaxException, IOException, InterruptedException {
        // use HttpResponse.BodyHandlers.ofString() handler
        // return response body
        HttpRequest request = HttpRequest.newBuilder()
        .uri(new URI("https://jsonplaceholder.typicode.com/todos/1"))
        .build();
        HttpResponse<String> response =
                HttpClient.newHttpClient().send(request,HttpResponse.BodyHandlers.ofString());
        return response.body();
    }

}
