package com.example.stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import pagesObject.BasePage;
public class Hooks extends BasePage {
    @Before("@InitiateBrowser")
    public void setUpBeforeTest() {
        setUp();
    }
    @After("@ClearAfter")
    public void clearAfterAll() {
        tearDown();
    }

}
