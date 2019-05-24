package TestRunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

//This is the JUnit Runner for our test.
//We are using both Cucumber and Serenity.
@RunWith(CucumberWithSerenity.class)
//We define where the Cucumber framework is located and where our code is.
@CucumberOptions(features="src/test/resources/Features",glue={"StepDefinition"})

public class runner {

}
