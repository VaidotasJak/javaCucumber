package com.example.stepDefinitions.UserApi;

import api.endpoints.UserEndpoints;
import api.model.User;
import apiObjects.userApi.UserApi;
import io.cucumber.java.en.Given;
import io.restassured.response.Response;

public class GivenSteps {

    UserApi userApi = new UserApi();

    @Given("Valid user payload is generated")
    public void generateValidCreateUserPayload() {
        User newUser = userApi.act().generateValidUserPaylaod();
        Response user = UserEndpoints.createUser(newUser);
        System.out.println(user.statusCode());
        user.prettyPrint();

    }
}
