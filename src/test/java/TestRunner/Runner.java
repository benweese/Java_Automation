package TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

//This is the JUnit Runner for our test.
//We are using both Cucumber.
@RunWith(Cucumber.class)
//We define where the Cucumber framework is located and where our code is.
@CucumberOptions(features="src/test/resources/Features",glue={"StepDefinition"})

public class Runner {

}
