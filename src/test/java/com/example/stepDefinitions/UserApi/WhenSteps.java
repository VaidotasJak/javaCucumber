package com.example.stepDefinitions.UserApi;

import api.model.User;
import api.untilities.DataTransferSingleton;
import io.cucumber.java.en.When;

public class WhenSteps {
    DataTransferSingleton dataTransferSingleton = DataTransferSingleton.getInstance();
    long threadId = Thread.currentThread().getId();

    @When("post user method is called")
    public void userPostMethodIsCalled() {
        User user = (User) dataTransferSingleton.getDataHandler("validCreateUser" + threadId);
        System.out.println("My thread ID: " + Thread.currentThread().getId() + ":" + user.getUsername());
        System.out.println(dataTransferSingleton.getAllData());
    }
}
