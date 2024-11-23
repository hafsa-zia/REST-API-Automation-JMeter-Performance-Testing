package com.api.helpers;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class ApiHelper {

    // Base URL of JSONPlaceholder API
    private static final String BASE_URL = "https://jsonplaceholder.typicode.com";

    // Helper method for GET request
    public static Response get(String endpoint) {
        return RestAssured.given().baseUri(BASE_URL).get(endpoint);
    }

    // Helper method for POST request
    public static Response post(String endpoint, Object body) {
        return RestAssured.given().baseUri(BASE_URL)
                .contentType("application/json")
                .body(body)
                .post(endpoint);
    }

    // Helper method for PUT request
    public static Response put(String endpoint, Object body) {
        return RestAssured.given().baseUri(BASE_URL)
                .contentType("application/json")
                .body(body)
                .put(endpoint);
    }

    // Helper method for DELETE request
    public static Response delete(String endpoint) {
        return RestAssured.given().baseUri(BASE_URL).delete(endpoint);
    }
}
