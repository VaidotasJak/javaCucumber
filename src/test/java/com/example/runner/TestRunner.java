package com.example.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags = "", features = {"src/test/resources/features"}, glue = {"com/example/stepDefinitions"},
        plugin = {})

public class TestRunner extends AbstractTestNGCucumberTests {

}