package pagesObject.loginPage;

import org.openqa.selenium.By;
import pagesObject.BasePage;

public class LoginPageAct extends BasePage {

    public void openUrl(String url){
        driver.get(url);
    }

    public void fillInLoginForm(String userName, String passWord){
        driver.findElement(By.name("username")).sendKeys(userName);
        driver.findElement(By.name("password")).sendKeys(passWord);
    }

    public void clickSubmitButton(){
        driver.findElement(By.xpath("//*[@class='oxd-form']/div[3]/button")).submit();
    }



}
