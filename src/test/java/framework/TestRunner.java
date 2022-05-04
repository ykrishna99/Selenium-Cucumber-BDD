package framework;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


//@RunWith(Cucumber.class)
@CucumberOptions(tags = "", 
					monochrome = true, 
					features = "src/test/java/features", 
					glue = { "logic", "framework" }, 
					plugin = { "pretty", "json:target/cucumber.json", "html:target/cucumber-report" })
public class TestRunner extends AbstractTestNGCucumberTests {

}
