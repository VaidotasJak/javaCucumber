package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class StartPageSteps {

    @Given("User has opened Chrome browser")
    public void user_has_opened_chrome_browser() {
        System.out.println("!!!!!!!!!!!");
    }

    @When("User navigates to application")
    public void user_navigates_to_application() {
        System.out.println("@@@@@@@@@@@@@");
    }

}
