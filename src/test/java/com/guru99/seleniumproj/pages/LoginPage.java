package com.guru99.seleniumproj.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class LoginPage extends Page {
	
	
	public LoginPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(how = How.NAME, using = "uid")
	@CacheLookup
	public WebElement userId;

	@FindBy(how = How.NAME, using = "password")
	@CacheLookup
	public WebElement password;

	@FindBy(how = How.NAME, using = "btnLogin")
	@CacheLookup
	public WebElement login;

	@FindBy(how = How.XPATH, using = "//marquee[@class='heading3']")
	@CacheLookup
	public WebElement welcomeMessage;
		
}
