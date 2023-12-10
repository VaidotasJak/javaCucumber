package com.example.stepDefinitions.UserApi;

import api.model.User;
import api.untilities.DataTransfer;
import apiObjects.userApi.UserApi;
import io.cucumber.java.en.Given;

public class GivenSteps {

    UserApi userApi = new UserApi();

    @Given("Valid user payload is generated")
    public void generateValidCreateUserPayload() {
        User newUser = userApi.act().generateValidUserPaylaod();
        DataTransfer.addData("validUserPayload", newUser);
        System.out.println(newUser);
    }
}
