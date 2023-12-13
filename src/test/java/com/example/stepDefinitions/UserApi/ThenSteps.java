package com.example.stepDefinitions.UserApi;

import api.model.User;
import api.untilities.DataTransferSingleton;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;

import static org.testng.Assert.assertEquals;

public class ThenSteps {

    DataTransferSingleton dataTransferSingleton = DataTransferSingleton.getInstance();

    @Then("response is {int}")
    public void userResponseIs(int expectedResponseCode) {
        Response response = dataTransferSingleton.getCurrentResponse();
        assertEquals(response.statusCode(), expectedResponseCode);
    }

    @Then("user is successfully created")
    public void userSuccessfullyCreated() {
        User user = dataTransferSingleton.getUserPayload();


        Response response = dataTransferSingleton.getCurrentResponse();
        System.out.println(response.statusCode());
    }

}
