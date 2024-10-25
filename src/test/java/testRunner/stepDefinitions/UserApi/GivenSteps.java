package testRunner.stepDefinitions.UserApi;

import api.model.User;
import api.untilities.DataTransferSingleton;
import services.userApi.UserServiceApi;
import io.cucumber.java.en.Given;
import org.testng.Assert;

public class GivenSteps {

    UserServiceApi userServiceApi = new UserServiceApi();
    DataTransferSingleton dataTransferSingleton = DataTransferSingleton.getInstance();

    @Given("Valid user payload is generated")
    public void generateValidCreateUserPayload() {
        User newUser = userServiceApi.act().generateValidUserPayload();
        dataTransferSingleton.setUserPayload(newUser);
    }
    @Given("User is already created")
    public void userAlreadyCreated() {
        User actualNewUser = dataTransferSingleton.getCurrentResponse().as(User.class);
        dataTransferSingleton.setActualNewUser(actualNewUser);
        Assert.assertNotNull(actualNewUser);
    }
}
