package TestRunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

//This is the JUnit Runner for our test.
//We are using both Cucumber.
@RunWith(Cucumber.class)
//We define where the Cucumber framework is located and where our code is.
@CucumberOptions(features="src/test/resources/Features",glue={"StepDefinition"})

public class runner {

}
