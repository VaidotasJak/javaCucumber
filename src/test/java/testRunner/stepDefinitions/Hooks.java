package testRunner.stepDefinitions;

import api.endpoints.UserEndpoints;
import api.model.User;
import api.untilities.DataTransferSingleton;
import apiObjects.userApi.UserApi;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import pagesObject.BasePage;
public class Hooks extends BasePage {
    UserApi userApi = new UserApi();
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
        User newUser = userApi.act().generateValidUserPayload();
        userEndpoints.createNewUser(newUser);
        userEndpoints.getUser(newUser.getUsername());
        System.out.println("BEFORE: :" + newUser);
    }

}
