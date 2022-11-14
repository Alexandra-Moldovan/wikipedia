package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	private By headerLabel = By.id("firstHeading");
	private By usernameInput = By.id("wpName1");
	private By passwordInput = By.id("wpPassword1");
	private By loginButton = By.id("wpLoginAttempt");
	private By loginErrorLabel = By.xpath("//form[@name=\"userlogin\"]/div[1]");
	
	public String getHeaderText() {
		return driver.findElement(headerLabel).getText();
	}
	public void enterUsername(String username) {
		driver.findElement(usernameInput).sendKeys(username);
	}
	public void enterPassword(String password) {
		driver.findElement(passwordInput).sendKeys(password);
	}
	public void clickLogin() {
		driver.findElement(loginButton).click();
	}
	public void authenticate(String username, String password) {
		enterUsername(username);
		enterPassword(password);
		clickLogin();
	}
	public String getLoginError() {
		return driver.findElement(loginErrorLabel).getText();
	}

}


