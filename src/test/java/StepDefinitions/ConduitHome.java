package StepDefinitions;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import core.Assertions;
import core.CreateSession;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ConduitHomePage;

public class ConduitHome {

	ConduitHomePage conduitHome;
	WebDriver driver;
	Assertions ass = new Assertions(driver);

	public ConduitHome() throws IOException {
		driver = CreateSession.getWebDriver();
		conduitHome = new ConduitHomePage(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@Given("User is on Conduit app")
	public void user_is_on_conduit_app() {
		conduitHome.get("http://angular.realworld.io/");
	}

	@And("I will verify conduit title")
	public void verify_conduit_title() {
		ass.verifyEquals(conduitHome.findElement(conduitHome.conduitTitle).getText(),
				"A place to share your Angular knowledge.", "Title Verification", true, false);
	}

	@When("I go to Global Feed section")
	public void goto_globalfeed() {
		conduitHome.findElement(conduitHome.globalFeed).click();
	}

	@And("I will verify articles are displayed")
	public void article_displayed() {
		List<WebElement> articles = conduitHome.findElements(conduitHome.articleHeaders);
		if (articles.size() > 0) {
			ass.verifyTrue(true, "Articles Displayed", true, false);
		} else {
			ass.screenShot("Articles not displayed");
		}

	}

	@Then("I will display articles in console")
	public void articles_in_console() {
		List<WebElement> articleHeader = conduitHome.findElements(conduitHome.articleHeaders);
		List<WebElement> articleText = conduitHome.findElements(conduitHome.articleText);
		System.out.println("+++++++++++++++++++++++++++++");
		for (int i = 0; i < articleHeader.size(); i++) {
			System.out.println(articleHeader.get(i).getText());
			System.out.println(articleText.get(i).getText());
		}
		System.out.println("+++++++++++++++++++++++++++++");
	}
}
