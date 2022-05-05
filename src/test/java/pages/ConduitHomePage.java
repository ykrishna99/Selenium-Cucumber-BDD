package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import core.CommonMethods;

public class ConduitHomePage extends CommonMethods{

	public ConduitHomePage(WebDriver driver) throws IOException {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public By conduitTitle = By.xpath("//h1[text()='conduit']/following-sibling :: p");
	public By globalFeed = By.xpath("//a[text()=' Global Feed ']");
	public By articleHeaders = By.xpath("//div[@class='article-preview']//h1");
	public By articleText = By.xpath("//div[@class='article-preview']//p");
	public By tagsSection = By.xpath("//div[@class='sidebar']");
	public By popularTags = By.xpath("//div[@class='tag-list']/a");

}
