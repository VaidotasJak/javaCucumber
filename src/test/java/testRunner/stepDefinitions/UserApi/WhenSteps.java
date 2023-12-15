package testRunner.stepDefinitions.UserApi;

import api.model.User;
import api.untilities.DataTransferSingleton;
import apiObjects.userApi.UserApi;
import io.cucumber.java.en.When;

public class WhenSteps {
    UserApi userApi = new UserApi();
    DataTransferSingleton dataTransferSingleton = DataTransferSingleton.getInstance();

    @When("post user method is called")
    public void userPostMethodIsCalled() {
        User user = dataTransferSingleton.getUserPayload();
        userApi.act().create(user);
    }

    @When("user fetches new user with get request")
    public void fetchNewlyCreatedUser() {
        User actualNewUser = dataTransferSingleton.getActualNewUser();
        if(actualNewUser==null){
            actualNewUser = dataTransferSingleton.getUserPayload();
        }
        userApi.act().getUser(actualNewUser);
    }

    @When("user is deleted")
    public void deleteUser() {
        User actualNewUser = dataTransferSingleton.getCurrentResponse().as(User.class);
        userApi.act().delete(actualNewUser);
    }

}
