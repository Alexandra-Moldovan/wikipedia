package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage {
	WebDriver driver;

	public MainPage(WebDriver driver) {
		this.driver = driver;
	}

	private By headerLabel = By.id("Welcome_to_Wikipedia");

	public String getHeaderText() {
		return driver.findElement(headerLabel).getText();
	}
}
