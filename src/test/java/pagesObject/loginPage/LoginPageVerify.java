package pagesObject.loginPage;

import org.openqa.selenium.By;
import org.testng.Assert;
import pagesObject.BasePage;

public class LoginPageVerify extends BasePage {

    public void userIsLoggedIn(){
        String homePageHeading = driver.findElement(By.xpath("//*[@class='oxd-topbar-header-breadcrumb']/h6")).getText();
        Assert.assertEquals(homePageHeading, "Dashboard");
    }
}
