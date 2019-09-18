package StepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

class Setup {

    private WebDriver driver;
    private String url;

    //Sets up the Driver
    void setDriver() {
        //This sets up the chrome browser with all options. Currently having issues with Headless in IntelliJ
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-gpu");
        options.addArguments("--window-size=1400x1200");
        options.addArguments("--disable-extensions");

        //Sets the location of the chrome driver based on the repo as well as headless
        if (System.getProperty("user.dir").equalsIgnoreCase("/root/project")) {
            System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
            options.addArguments("--headless");
        }else {
            System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/main/resources/chromedriver");
        }
        driver = new ChromeDriver(options);
    }

    WebDriver getDriver() {
        return driver;
    }

    String getUrl() {

        return url;
    }
    //Sets url with the added next page.
    void setUrl(String website) {
        url = "https://www.ultimateqa.com/" + website + "/";
    }
}
