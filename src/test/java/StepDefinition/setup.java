package StepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class setup {

    private WebDriver driver;
    private String url;

    void setDriver() {

        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/main/resources/chromedriver");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-gpu");
        options.addArguments("--window-size=1200x1100");
        options.addArguments("--disable-extensions");

        driver = new ChromeDriver(options);

    }

    WebDriver getDriver() {
        return driver;
    }

    String getUrl() {

        return url;
    }
    void setUrl(String website) {
        url = "https://www.ultimateqa.com/" + website + "/";
    }
}
