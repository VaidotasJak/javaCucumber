package apiObjects.userApi;


import api.model.User;
import org.apache.commons.lang3.RandomStringUtils;

public class UserApiAct {

    public User generateValidUserPaylaod() throws InterruptedException {
        String generatedString = RandomStringUtils.randomAlphabetic(6);
        System.out.println("My thread ID: " + Thread.currentThread().getId() + ": " + generatedString);
        return new User(1, generatedString, "labasFistName", "labasLastName", "haha@@gmail.com", "slaptas", "123456789");
    }
}
