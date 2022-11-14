package tests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import messages.Login;
import messages.Main;

public class LoginTests extends BaseTest {
	@Before
	@Override
	public void before() {
		super.before();
		startPage.clickEnglighLink();
		Assert.assertEquals(Main.HEADER, mainPage.getHeaderText());
		topMenu.clickLogin();
		Assert.assertEquals(Login.HEADER, loginPage.getHeaderText());
	}

	@Test
	public void loginWithValidCredentials() {
		loginPage.authenticate(userTD.getUsername(), userTD.getPassword());
		Assert.assertEquals(userTD.getUsername(), topMenu.getLoggedUsername());
		Assert.assertTrue(topMenu.getLogoutButtonDisplayState());
	}

	@Test
	public void loginWithInvalidPassword() {
		loginPage.authenticate(userTD.getUsername(), "invalid");
		Assert.assertEquals(Login.LOGIN_ERROR, loginPage.getLoginError());
	}

}
