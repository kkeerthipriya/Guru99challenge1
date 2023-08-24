package com.guru99seleniumproj.tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.guru99.seleniumproj.pages.LoginPage;

public class Login extends BaseConfiguration {
	


	private LoginPage loginPage;
	
	@BeforeTest
	public void testInit() {
		driver.get("https://www.demo.guru99.com/V4/");
		loginPage = PageFactory.initElements(driver, LoginPage.class);
	}

	
	@Test
	@Parameters({ "username", "password" })
	public void loginPage(@Optional("Abc") String username,@Optional("Abc") String password) {
		//loginPage.userId.sendKeys("mngr523164");
		//loginPage.password.sendKeys("tavEpAd");
		loginPage.userId.sendKeys(username);
		loginPage.password.sendKeys(password);
		loginPage.login.click();
        /*Assertion to verify login confirmation message*/
		String actualWelMsg = loginPage.welcomeMessage.getText();
		String expectedWelMsg = "Welcome To Manager's Page of Guru99 Bank";
		System.out.println("the welcome message is " + actualWelMsg);
		Assert.assertEquals(expectedWelMsg, actualWelMsg, "Sorry the login confirmation page assertion failed");
		/*Assertion to verify the current page title after login */
		String actualPageTitle=driver.getTitle();
		String expectedPageTitle="Guru99 Bank Manager HomePage";
		Assert.assertEquals(actualPageTitle,expectedPageTitle,"Current page title assertion failed");
	}

}
