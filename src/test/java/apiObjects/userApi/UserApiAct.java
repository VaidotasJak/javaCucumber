package apiObjects.userApi;


import api.endpoints.UserEndpoints;
import api.model.User;
import org.apache.commons.lang3.RandomStringUtils;

public class UserApiAct {
    UserEndpoints userEndpoints = new UserEndpoints();

    public User generateValidUserPayload() {
        String generatedString = RandomStringUtils.randomAlphabetic(6);
        int id = (int) Math.floor(Math.random() *(9999 - 1000 + 1) + 1000);
        return new User(id, generatedString, generatedString+"FistName", generatedString+"LastName", generatedString+"@gmail.com",
                generatedString+"slaptas", "123456789", 0);
    }

    public void delete(User user) {
        userEndpoints.deleteUser(user.getUsername());
    }

    public void getUser(User user) {
        userEndpoints.getUser(user.getUsername());
    }

    public void create(User user) {
        userEndpoints.createNewUser(user);
    }



}
