package StepDefinition;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.PendingException;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class complicatedPage {

    private WebDriver driver;
    private complicatedPOM comPOM = new complicatedPOM();
    private String url;
    private setup setup = new setup();


    @Before
    public void beforeSenario(){
        setup.setDriver();
        driver = setup.getDriver();
        setup.setUrl("complicated-page");
        url = setup.getUrl();
        driver.get(url);
    }

    @Given("^I find a button$")
    public void i_find_a_button() {
        Assert.assertEquals(driver.getCurrentUrl(), url);
        WebElement button = driver.findElement(comPOM.button0);
        Assert.assertTrue(button.isDisplayed());
    }

    @When("^I click the button with (\\d+)$")
    public void i_click_the_button_at_and(int arg) {

        throw new PendingException();

    }

    @Then("^I am taken back to the page$")
    public void i_am_taken_back_to_the_page() {

        Assert.assertEquals(driver.getCurrentUrl(), url);
        driver.quit();
    }
}
