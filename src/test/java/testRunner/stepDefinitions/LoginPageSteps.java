package testRunner.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;
import pagesObject.BasePage;
import pagesObject.loginPage.LoginPage;

public class LoginPageSteps extends BasePage {

    LoginPage loginPage = new LoginPage();

    @Given("User is on HRMLogin page {string}")
    public void loginTest(String url) {
        loginPage.act().openUrl(url);
    }

    @When("User enters username as {string} and password as {string}")
    public void goToHomePage(String userName, String passWord) {
        loginPage.act().fillInLoginForm(userName, passWord);
    }

    @When("User clicks submit button")
    public void userClicksSubmitButton() {
        loginPage.act().clickSubmitButton();
    }

    @Then("User should be able to login successfully and new page open")
    public void verifyLogin() {
        loginPage.verify().userIsLoggedIn();
    }

    @Then("User should be able to see error message {string}")
    public void verifyErrorMessage(String expectedErrorMessage) {
        String actualErrorMessage = driver.findElement(By.xpath("//*[@class='orangehrm-login-error']/div[1]/div[1]/p")).getText();
        Assert.assertEquals(actualErrorMessage, expectedErrorMessage);
    }

}
