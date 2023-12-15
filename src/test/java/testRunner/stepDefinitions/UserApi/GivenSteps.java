package testRunner.stepDefinitions.UserApi;

import api.model.User;
import api.untilities.DataTransferSingleton;
import apiObjects.userApi.UserApi;
import io.cucumber.java.en.Given;
import org.testng.Assert;

public class GivenSteps {

    UserApi userApi = new UserApi();
    DataTransferSingleton dataTransferSingleton = DataTransferSingleton.getInstance();

    @Given("Valid user payload is generated")
    public void generateValidCreateUserPayload() {
        User newUser = userApi.act().generateValidUserPayload();
        dataTransferSingleton.setUserPayload(newUser);
    }
    @Given("User is already created")
    public void userAlreadyCreated() {
        User actualNewUser = dataTransferSingleton.getCurrentResponse().as(User.class);
        dataTransferSingleton.setActualNewUser(actualNewUser);
        System.out.println(actualNewUser);
        Assert.assertNotNull(actualNewUser);
    }
}
