package com.guru99seleniumproj.tests;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class BaseConfiguration {
	
	protected WebDriver driver = null;
	
	
	@BeforeTest
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver","./dri/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5L, TimeUnit.SECONDS);	
	}

	@AfterTest
	public void tearDown() {
		System.out.println("Executed the tear down method");
		driver.quit();
	}

}
