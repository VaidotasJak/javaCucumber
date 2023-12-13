package apiObjects.userApi;


import api.model.User;
import org.apache.commons.lang3.RandomStringUtils;

public class UserApiAct {

    public User generateValidUserPayload() {
        String generatedString = RandomStringUtils.randomAlphabetic(6);
        int id = (int) Math.floor(Math.random() *(9999 - 1000 + 1) + 1000);
        return new User(id, generatedString, generatedString+"FistName", generatedString+"LastName", generatedString+"@gmail.com",
                generatedString+"slaptas", "123456789");
    }
}
