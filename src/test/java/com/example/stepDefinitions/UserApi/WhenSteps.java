package com.example.stepDefinitions.UserApi;

import api.untilities.DataTransfer;
import io.cucumber.java.en.When;

public class WhenSteps {

    @When("post user method is called")
    public void userPostMethodIsCalled() {
        System.out.println(DataTransfer.getData("validUserPayload"));
    }
}
