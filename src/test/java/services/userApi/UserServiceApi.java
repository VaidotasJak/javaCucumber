package services.userApi;

public class UserServiceApi {

    UserApiAct userApiAct;
    UserApiVerify userApiVerify;
    public UserServiceApi(){
        this.userApiAct = new UserApiAct();
        this.userApiVerify = new UserApiVerify();
    }

    public UserApiAct act(){
        return this.userApiAct;
    }

    public UserApiVerify verify(){
        return this.userApiVerify;
    }
}
