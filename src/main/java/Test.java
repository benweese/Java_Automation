import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class Test {


    public static void main(String[] args) {
        String URL = "https://www.ultimateqa.com/complicated-page/";
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/main/resources/chromedriver");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox");
        //options.addArguments("--headless");
        options.addArguments("--disable-gpu");
        options.addArguments("--window-size=1200x1100");
        options.addArguments("--disable-extensions");

        WebDriver driver = new ChromeDriver(options);
        driver.get(URL);
        driver.findElement(By.id("et_pb_contact_name_0")).sendKeys("Bugs Bunny");
        driver.findElement(By.id("et_pb_contact_email_0")).sendKeys("Bugs@WhatsUp.Doc");
        driver.findElement(By.id("et_pb_contact_message_0")).sendKeys("What's up Doc?");

        String d1 = driver.findElement(By.name("et_pb_contact_captcha_0")).getAttribute("data-first_digit");
        String d2 = driver.findElement(By.name("et_pb_contact_captcha_0")).getAttribute("data-second_digit");

        int calc = Integer.parseInt(d1) + Integer.parseInt(d2);
        String result = String.valueOf(calc);

        driver.findElement(By.name("et_pb_contact_captcha_0")).sendKeys(result);
        Assert.assertNotNull(driver.findElement(By.name("et_pb_contact_captcha_0")).getAttribute("value"));
        driver.findElement(By.name("et_pb_contact_captcha_0")).submit();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        WebElement p1 = driver.findElement(By.id("et_pb_contact_form_0"));
//        WebElement p2 = p1.findElement(By.className("et-pb-contact-message"));
//        String message = p2.findElement(By.tagName("p")).getText();
//        System.out.println(message);
    }
}
