package components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HeadMenu {
	WebDriver driver;

	public HeadMenu(WebDriver driver) {
		this.driver = driver;
	}

	private By loginLink = By.xpath("//li[@id=\"pt-login\"]/a");
	private By loggedUserLabel = By.xpath("//li[@id=\"pt-userpage\"]/a");
	private By logoutLink = By.xpath("//li[@id=\"pt-logout\"]/a");
	
	public void clickLogin() {
		driver.findElement(loginLink).click();
	}

	public String getLoggedUsername() {
		return driver.findElement(loggedUserLabel).getText();
	}

	public boolean getLogoutButtonDisplayState() {
		return driver.findElement(logoutLink).isDisplayed();
	}
	
}
