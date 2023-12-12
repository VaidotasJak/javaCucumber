package com.example.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(tags = "",
        features = {
                "src/test/resources/features/UserApi.feature",
                "src/test/resources/features/UserApi2.feature"
        },
        glue = {"com/example/stepDefinitions"},
        plugin = {})

public class TestRunner extends AbstractTestNGCucumberTests {

    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }
}