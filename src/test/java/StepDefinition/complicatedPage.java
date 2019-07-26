package StepDefinition;

import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.logging.Level;
import java.util.logging.Logger;

public class complicatedPage {

    private WebDriver driver;
    private complicatedPOM comPOM;
    private String url;
    private setup setup = new setup();
    private static final Logger LOGGER = Logger.getLogger( complicatedPage.class.getName() );

    @Before
    public void beforeSenario(){
        setup.setDriver();
        driver = setup.getDriver();
        comPOM  = new complicatedPOM(driver);
        setup.setUrl("complicated-page");
        url = setup.getUrl();
        driver.get(url);
    }

    @Given("I find a button")
    public void i_find_a_button() {
        Assert.assertEquals(url, driver.getCurrentUrl());
        WebElement button = driver.findElement(comPOM.button0);
        Assert.assertTrue(button.isDisplayed());
    }

    @When("I click the button with (\\d+)")
    public void i_click_the_button_at_and(int arg) {
        By[] button = comPOM.getButton();

        driver.findElement(button[arg]).click();


    }

    @Then("I am taken back to the page")
    public void i_am_taken_back_to_the_page() {

        Assert.assertEquals(url, driver.getCurrentUrl());
        driver.quit();
    }

    @Given("I find a icon")
    public void i_find_a_icon() {
        Assert.assertEquals(url, driver.getCurrentUrl());
        WebElement social = driver.findElement(comPOM.socialM0);
        Assert.assertTrue(social.isDisplayed());
    }

    @When("I click the icon with (\\d+)")
    public void i_click_the_icon_with(int arg) {
        By[] social = comPOM.getSocial();

        driver.findElement(social[arg]).click();
    }

    @Then("I am taken to the media platform (\\d+)")
    public void i_am_taken_to_the_media_platform(int arg) {
        if(arg%2 == 0){
            Assert.assertEquals("https://twitter.com/Nikolay_A00", driver.getCurrentUrl());
        }else{
            Assert.assertEquals("https://www.facebook.com/Ultimateqa1/", driver.getCurrentUrl());
        }
        driver.quit();
    }

    //Twitter Share Button
    @Given("I find a twitter icon")
    public void i_find_a_twitter_icon() {
        Assert.assertEquals(url, driver.getCurrentUrl());
        WebElement social = driver.findElement(comPOM.twitterShare);
        Assert.assertTrue(social.isDisplayed());
    }

    @When("I click the twitter icon")
    public void i_click_the_twitter_icon() {
        driver.findElement(comPOM.twitterShare).click();
    }

    @Then("I am shown a popup to share on twitter")
    public void i_am_shown_a_popup_to_share_on_twitter() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        for(String child : driver.getWindowHandles()){
            driver.switchTo().window(child);
        }
        String twURL = "https://twitter.com/intent/tweet?text=Complicated+Page&url=https%3A%2F%2Fwww.ultimateqa.com%2Fcomplicated-page%2F&via=Nikolay_A00";
        Assert.assertEquals(twURL, driver.getCurrentUrl());
        driver.close();
        driver.quit();
    }
    //LinkedIn Share Button
    @Given("I find a LinkedIn icon")
    public void i_find_a_linkedIn_icon() {
        Assert.assertEquals(url, driver.getCurrentUrl());
        WebElement social = driver.findElement(comPOM.linkedInShare);
        Assert.assertTrue(social.isDisplayed());
    }

    @When("I click the LinkedIn icon")
    public void i_click_the_linkedIn_icon() {
        driver.findElement(comPOM.linkedInShare).click();
    }

    @Then("I am shown a popup to share on LinkedIn")
    public void i_am_shown_a_popup_to_share_on_linkedIn() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        for(String child : driver.getWindowHandles()){
            driver.switchTo().window(child);
        }
        String liURL = "https://www.linkedin.com/m/login/";
        //String liURL = "https://www.linkedin.com/cws/share?url=https%3A%2F%2Fwww.ultimateqa.com%2Fcomplicated-page%2F";
        Assert.assertEquals(liURL, driver.getCurrentUrl());
        driver.close();
        driver.quit();
    }
    //Tumblr Share Button
    @Given("I find a Tumblr icon")
    public void i_find_a_tumblr_icon() {
        Assert.assertEquals(url, driver.getCurrentUrl());
        WebElement social = driver.findElement(comPOM.tumblrShare);
        Assert.assertTrue(social.isDisplayed());
    }

    @When("I click the Tumblr icon")
    public void i_click_the_tumblr_icon() {
        driver.findElement(comPOM.tumblrShare).click();
    }

    @Then("I am shown a popup to share on Tumblr")
    public void i_am_shown_a_popup_to_share_on_tumblr() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        for(String child : driver.getWindowHandles()){
            driver.switchTo().window(child);
        }
        String tbURL = "https://www.tumblr.com/login?redirect_to=https%3A%2F%2Fwww.tumblr.com%2Fwidgets%2Fshare%2Ftool%3Fposttype%3Dlink%26canonicalUrl%3Dhttps%253A%252F%252Fwww.ultimateqa.com%252Fcomplicated-page%252F%26title%3DComplicated%2BPage";
        Assert.assertEquals(tbURL, driver.getCurrentUrl());
        driver.close();
        driver.quit();
    }
    //Facebook Share Button
    @Given("I find a Facebook icon")
    public void i_find_a_facebook_icon() {
        Assert.assertEquals(url, driver.getCurrentUrl());
        WebElement social = driver.findElement(comPOM.facebookShare);
        Assert.assertTrue(social.isDisplayed());
    }

    @When("I click the Facebook icon")
    public void i_click_the_facebook_icon() {
        driver.findElement(comPOM.facebookShare).click();
    }

    @Then("I am shown a popup to share on Facebook")
    public void i_am_shown_a_popup_to_share_on_facebook() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        for(String child : driver.getWindowHandles()){
            driver.switchTo().window(child);
        }
        String fbURL = "https://www.facebook.com/login.php?skip_api_login=1&api_key=966242223397117&signed_next=1&next=https%3A%2F%2Fwww.facebook.com%2Fshare.php%3Fu%3Dhttps%253A%252F%252Fwww.ultimateqa.com%252Fcomplicated-page%252F&cancel_url=https%3A%2F%2Fwww.facebook.com%2Fdialog%2Fclose_window%2F%3Fapp_id%3D966242223397117%26connect%3D0%23_%3D_&display=popup&locale=en_US";
        Assert.assertEquals(fbURL, driver.getCurrentUrl());
        driver.close();
        driver.quit();
    }

    @Given("I enter in contact information")
    public void i_enter_in_contact_information() {
        Assert.assertEquals(url, driver.getCurrentUrl());
        driver.findElement(comPOM.capName).sendKeys("Bugs Bunny");
        driver.findElement(comPOM.capEmail).sendKeys("Bugs@WhatsUp.Doc");
    }

    @And("I enter in a message")
    public void i_enter_in_a_message() {
        driver.findElement(comPOM.capMessage).sendKeys("What's up Doc?");
    }

    @When("I come to the captcha")
    public void i_come_to_the_captcha() {
        Assert.assertEquals("Bugs Bunny", driver.findElement(comPOM.capName).getAttribute("value"));
        Assert.assertEquals("Bugs@WhatsUp.Doc", driver.findElement(comPOM.capEmail).getAttribute("value"));
        Assert.assertEquals("What's up Doc?", driver.findElement(comPOM.capMessage).getAttribute("value"));
    }

    @And("I calculate the answer")
    public void i_calculate_the_answer() {
        String d1 = driver.findElement(comPOM.capAnswer).getAttribute("data-first_digit");
        String d2 = driver.findElement(comPOM.capAnswer).getAttribute("data-second_digit");
        int calc = Integer.parseInt(d1) + Integer.parseInt(d2);
        String result = String.valueOf(calc);
        driver.findElement(comPOM.capAnswer).sendKeys(result);
        Assert.assertNotNull(driver.findElement(comPOM.capAnswer).getAttribute("value"));
    }

    @Then("I click submit")
    public void i_click_submit() {
        driver.findElement(comPOM.capAnswer).submit();
    }

    @And("I see the message")
    public void i_see_the_message() {
        WebDriverWait wait=new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.textToBe(comPOM.capSuccess, "Thanks for contacting us"));
        String message = driver.findElement(comPOM.capSuccess).getText();
        LOGGER.log(Level.INFO, message);
        Assert.assertEquals("Thanks for contacting us", message);
        driver.quit();
    }

    @Given("I find the search function")
    public void iFindTheSearchFunction() {
        Assert.assertEquals(url, driver.getCurrentUrl());
        WebElement search = driver.findElement(comPOM.search2);
        Assert.assertTrue(search.isDisplayed());
    }

    @When("I enter the word holidays and submit")
    public void iEnterTheWordHolidaysAndSubmit() {
        WebElement search = driver.findElement(comPOM.search2);
        search.sendKeys("holidays");
        search.submit();

    }

    @Then("I am taken to the search page")
    public void iAmTakenToTheSearchPage() {
        Assert.assertEquals("https://www.ultimateqa.com/?s=holidays", driver.getCurrentUrl());
        WebElement post = driver.findElement(comPOM.post);
        Assert.assertTrue(post.isDisplayed());
        Assert.assertTrue(post.getText().contains("Happy Holidays!"));
        driver.quit();
    }
}
