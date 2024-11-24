package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.api.helpers.ApiHelper;

import io.restassured.response.Response;

public class PostsApiTests {

    // Test GET request (Retrieve a post by ID)
    @Test
    public void testGetPost() {
        // Send GET request to retrieve post with ID 1
        Response response = ApiHelper.get("/posts/1");

        Assert.assertEquals(response.getStatusCode(), 200);
        System.out.println(response.getBody().asString());
        Assert.assertEquals(response.jsonPath().getInt("id"), 1);
        Assert.assertEquals(response.jsonPath().get("title"), "sunt aut facere repellat provident occaecati excepturi optio reprehenderit");
    }

    // Test POST request (Create a new post)
    @Test
    public void testCreatePost() {
        // Prepare JSON payload for new post
        String postPayload = "{\"title\": \"Post Test\", \"body\": \"Post Web API\", \"userId\": 1}";

        // Make POST request to create new post
        Response response = ApiHelper.post("/posts", postPayload);

        Assert.assertEquals(response.getStatusCode(), 201);
        Assert.assertNotNull(response.jsonPath().get("id"));
        Assert.assertEquals(response.jsonPath().get("title"), "Post Test");
        Assert.assertEquals(response.jsonPath().get("body"), "Post Web API");
    }

    // Test PUT request (Update post details)
    @Test
    public void testUpdatePost() {
        // Prepare JSON payload to update post details
        String updatePayload = "{\"id\": 1, \"title\": \"Post Web API Test\", \"body\": \"Automate Post Web API\", \"userId\": 1}";

        // Make PUT request to update post with ID 1
        Response response = ApiHelper.put("/posts/1", updatePayload);

        Assert.assertEquals(response.getStatusCode(), 200);
        Assert.assertEquals(response.jsonPath().get("title"), "Post Web API Test");
        Assert.assertEquals(response.jsonPath().get("body"), "Automate Post Web API");
    }

    // Test DELETE request (Delete post by ID)
    @Test
    public void testDeletePost() {
        // Make DELETE request to delete post with ID 1
        Response response = ApiHelper.delete("/posts/1");

        Assert.assertEquals(response.getStatusCode(), 200);
    }
}
