package core;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//@RunWith(Cucumber.class)
@CucumberOptions(tags = "@edit", monochrome = true, features = "src/test/java/features", glue = {
		"StepDefinitions", "core" }, plugin = { "pretty", "json:target/cucumber.json", "html:target/cucumber-report" })
public class TestRunner extends AbstractTestNGCucumberTests {

}
