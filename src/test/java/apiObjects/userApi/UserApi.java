package apiObjects.userApi;

public class UserApi {

    UserApiAct userApiAct;
    UserApiVerify userApiVerify;
    public UserApi(){
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
