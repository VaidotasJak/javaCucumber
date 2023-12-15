package apiObjects.userApi;

import api.model.User;

import static org.testng.Assert.assertEquals;

public class UserApiVerify {
    public void newUserIsCreated(User expected, User actual){
        System.out.println("EXPECTED:" + expected);
        System.out.println("ACTUAL:" + actual);
        assertEquals(expected, actual);
    }

}
