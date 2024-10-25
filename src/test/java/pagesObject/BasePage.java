package pagesObject;

import org.openqa.selenium.WebDriver;
import webdriverFactory.WebDriverFactory;

import java.time.Duration;
public class BasePage {
    public static WebDriver driver;
    public final static int TIMEOUT = 5;

    public void setUp() {
        driver = WebDriverFactory.createDriver();
//        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMEOUT));
    }

    public void tearDown() {
        // Quit WebDriver
        if (driver != null) {
            driver.quit();
        }
    }
}
