package StepDefinition;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;


public class complicatedPage {

    private WebDriver driver;
    private complicatedPOM comPOM;
    private String url;
    private setup setup = new setup();


    @Before
    public void beforeSenario(){
        setup.setDriver();
        driver = setup.getDriver();
        comPOM  = new complicatedPOM(driver);
        setup.setUrl("complicated-page");
        url = setup.getUrl();
        driver.get(url);
    }

    @Given("^I find a button$")
    public void i_find_a_button() {
        Assert.assertEquals(url, driver.getCurrentUrl());
        WebElement button = driver.findElement(comPOM.button0);
        Assert.assertTrue(button.isDisplayed());
    }

    @When("^I click the button with (\\d+)$")
    public void i_click_the_button_at_and(int arg) {
        By[] button = comPOM.getButton();

        driver.findElement(button[arg]).click();


    }

    @Then("^I am taken back to the page$")
    public void i_am_taken_back_to_the_page() {

        Assert.assertEquals(url, driver.getCurrentUrl());
        driver.quit();
    }

    @Given("^I find a icon$")
    public void i_find_a_icon() {
        Assert.assertEquals(url, driver.getCurrentUrl());
        WebElement social = driver.findElement(comPOM.socialM0);
        Assert.assertTrue(social.isDisplayed());
    }

    @When("^I click the icon with (\\d+)$")
    public void i_click_the_icon_with(int arg) {
        By[] social = comPOM.getSocial();

        driver.findElement(social[arg]).click();
    }

    @Then("^I am taken to the media platform (\\d+)$")
    public void i_am_taken_to_the_media_platform(int arg) {
        if(arg%2 == 0){
            Assert.assertEquals("https://twitter.com/Nikolay_A00", driver.getCurrentUrl());
        }else{
            Assert.assertEquals("https://www.facebook.com/Ultimateqa1/", driver.getCurrentUrl());
        }
        driver.quit();
    }
}
