# BenWeese.Dev
- [Home](https://benweese.dev)
- [Postman](https://benweese.dev/Postman/)
- [BenWeese.com](https://benweese.com)

## Java Automation
This project is for practiceing Cucumber, Selenuim, and Java.

## Motivation
This is to keep my automations skills sharp.

## Build status of master

[![CircleCI](https://circleci.com/gh/benweese/javaautomation/tree/master.svg?style=svg)](https://circleci.com/gh/benweese/javaautomation/tree/master)

## Tools

<b>BDD framework used</b>
- [Cucumber](https://cucumber.io/)

<b>Built with</b>
- [Intellij Community](https://www.jetbrains.com/idea/)

<b>Testing Language</b>
- [Selenium](https://www.seleniumhq.org/)

<b>Downloads</b>
- [GeckoDriver](https://github.com/mozilla/geckodriver/releases)
- [ChromeDriver](https://sites.google.com/a/chromium.org/chromedriver/downloads)
- [Maven](https://maven.apache.org/)
- [Java SE Development Kit 8](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)

## Features
With testing our Circle-CI runner will use maven to run our automation scripts in Command line.

## Code Example
<b>Page Object</b>
	
  ```
  public class complicatedPOM {
    WebDriver driver;

    By button0 = By.className("et_pb_button_0");
    By button1 = By.className("et_pb_button_1");
    By button2 = By.className("et_pb_button_2");
    ...
    By socialM0 = By.className("et_pb_social_media_follow_network_0");
    By socialM1 = By.className("et_pb_social_media_follow_network_1");
    By socialM2 = By.className("et_pb_social_media_follow_network_2");
    ...
    public complicatedPOM(WebDriver driver){
        this.driver = driver;
    }
    
```

<b>Java/Cucumber</b>

```
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

```

## Documentation
- [Page Object Model by Guru99](https://www.guru99.com/page-object-model-pom-page-factory-in-selenium-ultimate-guide.html)

## Credits
Ben Weese

Ben Weese © [Ben Weese](https://benweese.dev)
