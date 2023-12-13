package com.example.stepDefinitions.UserApi;

import api.endpoints.UserEndpoints;
import api.model.User;
import api.untilities.DataTransferSingleton;
import io.cucumber.java.en.When;
import io.restassured.response.Response;

public class WhenSteps {
    UserEndpoints userEndpoints = new UserEndpoints();
    DataTransferSingleton dataTransferSingleton = DataTransferSingleton.getInstance();

    @When("post user method is called")
    public void userPostMethodIsCalled() {
        User user = dataTransferSingleton.getUserPayload();
        Response response = userEndpoints.createUser(user);
        dataTransferSingleton.setCurrentResponse(response);
    }

    @When("user fetches new user with get request")
    public void fetchNewlyCreatedUser() {
        User expectedUser = dataTransferSingleton.getUserPayload();
        User actualUser = userEndpoints.getUser(expectedUser.getUsername());
        dataTransferSingleton.setActualNewUser(actualUser);
    }

}
