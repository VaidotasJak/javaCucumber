package webdriverFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class WebDriverFactory {

    public static WebDriver createDriver() {
        String envType = System.getProperty("type");
// Retrieve environment variable
        WebDriver driver;
        if ("remote".equalsIgnoreCase(envType)) {
            driver = createRemoteDriver();
        } else {
            driver = createLocalDriver();
        }

        return driver;
    }

    private static WebDriver createRemoteDriver() {
        System.out.println("CREATING REMOTE DRIVER");
        ChromeOptions options = new ChromeOptions();
        options.setCapability("browserName", "chrome");
// Remove 'platform' and 'version' as these are no longer supported in W3C
// If you want to set options like headless, add them here
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");


        String gridUrl = "http://13.48.49.108:4444/wd/hub"; // Replace with actual Selenium Grid URL
        try {
            return new RemoteWebDriver(new URL(gridUrl), options);
        } catch (MalformedURLException e) {
            throw new RuntimeException("Invalid Selenium Grid URL", e);
        }
    }

    private static WebDriver createLocalDriver() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox");    // For stable, single session handling
        options.addArguments("--disable-infobars");
        options.addArguments("--disable-extensions");
        options.addArguments("--start-maximized");

        String browser = System.getProperty("Dbrowser"); // Optional: Set up local browser type via env var
        if ("firefox".equalsIgnoreCase(browser)) {
            return new FirefoxDriver();
        } else {
            return new ChromeDriver(); // Default to ChromeDriver
        }
    }
}
