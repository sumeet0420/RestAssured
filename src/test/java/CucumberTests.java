
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"pretty"},
		glue = {"com.restassured.test.stepdefinitions"},
		features = {"src/test/resources/features"},
		format={"html:report/cucumber.html"},
		monochrome = true
		)
public class CucumberTests {
	
}
