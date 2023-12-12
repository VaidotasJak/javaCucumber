package com.example.stepDefinitions.UserApi;

import api.endpoints.UserEndpoints;
import api.model.User;
import api.untilities.DataTransferSingleton;
import io.cucumber.java.en.When;

public class WhenSteps {
    UserEndpoints userEndpoints = new UserEndpoints();
    DataTransferSingleton dataTransferSingleton = DataTransferSingleton.getInstance();

    @When("post user method is called")
    public void userPostMethodIsCalled() {
        User user = dataTransferSingleton.getUserPayload();
        System.out.println("My thread ID: " + Thread.currentThread().getId() + ":" + user.getUsername());
        userEndpoints.createUser(user);
    }
}
