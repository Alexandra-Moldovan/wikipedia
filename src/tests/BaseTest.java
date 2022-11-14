package tests;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import components.HeadMenu;
import messages.Start;
import pages.LoginPage;
import pages.MainPage;
import pages.StartPage;
import testdata.URL;
import testdata.User;

public class BaseTest {
	static WebDriver driver;
	public static StartPage startPage;
	public static MainPage mainPage;
	public static LoginPage loginPage;
	public static HeadMenu topMenu;
	
	public static User userTD = new User("user");
	
	@BeforeClass
	public static void beforeAll() {
	}
	@AfterClass
	public static void afterAll() {
	}
	@Before
	public void before() {
		System.setProperty("webdriver.chrome.driver", "src/resource/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		startPage = new StartPage(driver);
		mainPage = new MainPage(driver);
		loginPage = new LoginPage(driver);
		topMenu = new HeadMenu(driver);
		
		driver.navigate().to(URL.BASE_URL);
		Assert.assertEquals(Start.HEADER, startPage.getHeaderName());
		Assert.assertEquals(Start.SUBHEADER, startPage.getSubheaderName());
	}
	@After
	public void after() {
		driver.close();
		driver.quit();
	}
}


