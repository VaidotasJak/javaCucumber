package pagesObject.loginPage;

import pagesObject.BasePage;

public class LoginPage extends BasePage {

    LoginPageAct loginPageAct;
    LoginPageVerify loginPageVerify;
    public LoginPage(){
        this.loginPageAct = new LoginPageAct();
        this.loginPageVerify = new LoginPageVerify();
    }

    public LoginPageAct act(){
        return this.loginPageAct;
    }

    public LoginPageVerify verify(){
        return this.loginPageVerify;
    }
}
