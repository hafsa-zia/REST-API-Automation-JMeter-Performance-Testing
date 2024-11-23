package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.api.helpers.ApiHelper;

import io.restassured.response.Response;

public class UserApiTests {
    @Test
    public void testGetUser() {
      
        Response response = ApiHelper.get("/users/1");
        Assert.assertEquals(response.getStatusCode(), 200);
        System.out.println(response.getBody().asString());
        Assert.assertEquals(response.jsonPath().getInt("id"), 1);
        Assert.assertEquals(response.jsonPath().get("name"), "Leanne Graham");
    }
    @Test
    public void testCreateUser() {
        // Prepare JSON payload for new user
        String userPayload = "{\"name\": \"John Doe\", \"username\": \"johndoe\", \"email\": \"johndoe@example.com\"}";

        // Make a POST request to create user
        Response response = ApiHelper.post("/users", userPayload);

        // Validate response
        Assert.assertEquals(response.getStatusCode(), 201);
        Assert.assertNotNull(response.jsonPath().get("id"));
    }

    // Test for PUT request (update user details)
    @Test
    public void testUpdateUser() {
        // Prepare JSON payload to update user details
        String updatePayload = "{\"name\": \"Jane Doe\", \"username\": \"janedoe\", \"email\": \"janedoe@example.com\"}";

        // Make a PUT request to update user with ID 1
        Response response = ApiHelper.put("/users/1", updatePayload);

        // Validate response
        Assert.assertEquals(response.getStatusCode(), 200);
        Assert.assertEquals(response.jsonPath().get("name"), "Jane Doe");
    }

    // Test for DELETE request (delete user by ID)
    @Test
    public void testDeleteUser() {
        // Make a DELETE request to delete user with ID 1
        Response response = ApiHelper.delete("/users/1");

        // Validate response
        Assert.assertEquals(response.getStatusCode(), 200);
    }
}
