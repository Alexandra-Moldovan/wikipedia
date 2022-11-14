package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class StartPage {
	WebDriver driver;

	public StartPage(WebDriver driver) {
		this.driver = driver;
	}

	// locators
	private By englishLink = By.id("js-link-box-en");
	private By headerLabel = By.xpath("//h1[@class=\"central-textlogo-wrapper\"]/span");
	private By subheaderLabel = By.xpath("//h1[@class=\"central-textlogo-wrapper\"]/strong");

	// actions
	public void clickEnglighLink() {
		driver.findElement(englishLink).click();
	}

	public String getHeaderName() {
		return driver.findElement(headerLabel).getText();
	}

	public String getSubheaderName() {
		return driver.findElement(subheaderLabel).getText();
	}
}
