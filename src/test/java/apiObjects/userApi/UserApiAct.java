package apiObjects.userApi;


import api.model.User;

public class UserApiAct {

    public User generateValidUserPaylaod(){
        User validUser = new User(1, "pirmasUser", "labasFistName", "labasLastName", "haha@@gmail.com", "slaptas", "123456789");
        System.out.println("generuojam");
        return validUser;
    }
}
