package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/Features",
        glue = "stepDefinitions",
        plugin = {"pretty", "html:target/cucumber-reports.html"}
)
public class TestRunner {
    // This class will not have any code. It's just a placeholder for the annotations.
}