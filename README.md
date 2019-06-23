# BenWeese.Dev
- [Home](https://benweese.dev)
- [Java Automation Template](https://benweese.dev/Java_Automation_Template/)
- [Postman](https://benweese.dev/Postman/)
- [BenWeese.com](https://benweese.com)

## Java Automation
This project is for practiceing Cucumber, Selenuim, and Java. You can find the link for the template above for creating your own automation. To learn more you can check out the [Wiki](https://github.com/benweese/Java_Automation/wiki) for this repo where I document what I have learned. 

## Motivation
This is to keep my automations skills sharp.

## Badges
[![CircleCI](https://circleci.com/gh/benweese/Java_Automation/tree/master.svg?style=shield)](https://circleci.com/gh/benweese/Java_Automation/tree/master) ![GitHub](https://img.shields.io/github/license/benweese/Java_Automation.svg) [![Known Vulnerabilities](https://snyk.io/test/github/benweese/Java_Automation/badge.svg)](https://snyk.io/test/github/benweese/Java_Automation) ![GitHub issues](https://img.shields.io/github/issues-raw/benweese/Java_Automation.svg)

## Tools

<b>BDD framework used</b>
- [Cucumber](https://cucumber.io/)

<b>Built with</b>
- [Intellij Community](https://www.jetbrains.com/idea/)

<b>Testing Language</b>
- [Selenium](https://www.seleniumhq.org/)

<b>Continuous Intergration</b>
- [CircleCI](https://circleci.com/)

<b>Depandacy Maintenance </b>
- [Dependabot by Github](https://dependabot.com/)

<b>Security</b>
- [Sonatype Depshield](https://www.sonatype.com/depshield)

<b>Downloads</b>
- [GeckoDriver](https://github.com/mozilla/geckodriver/releases)
- [ChromeDriver](https://sites.google.com/a/chromium.org/chromedriver/downloads)
- [Maven](https://maven.apache.org/)
- [Java SE Development Kit 8](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)

## Features
With testing our Circle-CI runner will use maven to run our automation scripts in Command line.

## Code Example
<b>Setup</b>
```
    void setDriver() {

        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/main/resources/chromedriver");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox");
        options.addArguments("--headless");
        options.addArguments("--disable-gpu");
        options.addArguments("--window-size=1200x1100");
        options.addArguments("--disable-extensions");

        driver = new ChromeDriver(options);

    }
```

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
<b>Cucumber</b>
```
    Given I find a button
    When I click the button with <id>
    Then I am taken back to the page
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
<b>Runner</b>
```
	//This is the JUnit Runner for our test.
	//We are using both Cucumber.
	@RunWith(Cucumber.class)
	//We define where the Cucumber framework is located and where our code is.
	@CucumberOptions(features="src/test/resources/Features",glue={"StepDefinition"})

	public class runner {

	}
```

## Documentation
- [Page Object Model by Guru99](https://www.guru99.com/page-object-model-pom-page-factory-in-selenium-ultimate-guide.html)
- [Maven and CircleCI](https://circleci.com/blog/optimizing-maven-builds-on-circleci/)
- [Browser Testing CircleCI](https://circleci.com/docs/2.0/browser-testing/)

## Credits
[Ben Weese](https://benweese.dev)
