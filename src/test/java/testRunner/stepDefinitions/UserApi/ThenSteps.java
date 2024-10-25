package testRunner.stepDefinitions.UserApi;

import api.model.User;
import api.untilities.DataTransferSingleton;
import services.userApi.UserServiceApi;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;

import static org.testng.Assert.assertEquals;

public class ThenSteps {

    DataTransferSingleton dataTransferSingleton = DataTransferSingleton.getInstance();
    UserServiceApi userServiceApi = new UserServiceApi();

    @Then("response is {int}")
    public void userResponseIs(int expectedResponseCode) {
        Response response = dataTransferSingleton.getCurrentResponse();
        assertEquals(response.statusCode(), expectedResponseCode);
    }

    @Then("^response contains message \"([^\"]*)\"$")
    public void userResponseIs(String responseMessage) {
        System.out.println("Expected message: " + responseMessage);
        Response response = dataTransferSingleton.getCurrentResponse();
        assertEquals(response.jsonPath().get("message"), responseMessage);
    }

    @Then("user is successfully created")
    public void userSuccessfullyCreated() {
        User actualUser = dataTransferSingleton.getCurrentResponse().as(User.class);
        User expectedUser = dataTransferSingleton.getUserPayload();
        userServiceApi.verify().newUserIsCreated(expectedUser, actualUser);
    }

}
