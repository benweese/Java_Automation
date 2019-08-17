package StepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

 class setup {

    private WebDriver driver;
    private String url;

    //Sets up the Driver
    void setDriver() {
        ChromeOptions options = new ChromeOptions();
        //Sets the location of the chrome driver based on the repo
        if(System.getProperty("user.dir").equalsIgnoreCase("/home/circleci/repo")){
            System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/main/resources/chromedriverLinux");
            options.addArguments("--headless");
        }else {
            System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/main/resources/chromedriver");
        }
        //This sets up the chrome browser with all options. Currently having issues with Headless in IntelliJ
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-gpu");
        options.addArguments("--window-size=1400x1200");
        options.addArguments("--disable-extensions");

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
