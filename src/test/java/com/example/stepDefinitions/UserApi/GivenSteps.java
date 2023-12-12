package com.example.stepDefinitions.UserApi;

import api.model.User;
import api.untilities.DataTransferSingleton;
import apiObjects.userApi.UserApi;
import io.cucumber.java.en.Given;

public class GivenSteps {

    UserApi userApi = new UserApi();
    DataTransferSingleton dataTransferSingleton = DataTransferSingleton.getInstance();

    @Given("Valid user payload is generated")
    public void generateValidCreateUserPayload() throws InterruptedException {
        User newUser = userApi.act().generateValidUserPaylaod();
        dataTransferSingleton.setUserPayload(newUser);
    }
}
