package testRunner.stepDefinitions.UserApi;

import api.model.User;
import api.untilities.DataTransferSingleton;
import services.userApi.UserServiceApi;
import io.cucumber.java.en.When;

public class WhenSteps {
    UserServiceApi userServiceApi = new UserServiceApi();
    DataTransferSingleton dataTransferSingleton = DataTransferSingleton.getInstance();

    @When("post user method is called")
    public void userPostMethodIsCalled() {
        User user = dataTransferSingleton.getUserPayload();
        userServiceApi.act().create(user);
    }

    @When("user fetches new user with get request")
    public void fetchNewlyCreatedUser() {
        User actualNewUser = dataTransferSingleton.getActualNewUser();
        if(actualNewUser==null){
            actualNewUser = dataTransferSingleton.getUserPayload();
        }
        userServiceApi.act().getUser(actualNewUser);
    }

    @When("user is deleted")
    public void deleteUser() {
        User actualNewUser = dataTransferSingleton.getCurrentResponse().as(User.class);
        userServiceApi.act().delete(actualNewUser);
    }

}
