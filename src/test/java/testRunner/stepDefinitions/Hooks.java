package testRunner.stepDefinitions;

import api.httpRequests.UserEndpoints;
import api.model.User;
import api.untilities.DataTransferSingleton;
import services.userApi.UserServiceApi;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import pagesObject.BasePage;
public class Hooks extends BasePage {
    UserServiceApi userServiceApi = new UserServiceApi();
    DataTransferSingleton dataTransferSingleton = DataTransferSingleton.getInstance();
    UserEndpoints userEndpoints = new UserEndpoints();

    @Before("@InitiateBrowser")
    public void setUpBeforeTest() {
        setUp();
    }
    @After("@ClearAfter")
    public void clearAfterAll() {
        tearDown();
    }

    @Before("@CreateNewUsers")
    public void createUserBefore() {
        User newUser = userServiceApi.act().generateValidUserPayload();
        userEndpoints.createNewUser(newUser);
        userEndpoints.getUser(newUser.getUsername());
        System.out.println("BEFORE: :" + newUser);
    }

}
