package com.guru99.seleniumproj.pages;

import org.openqa.selenium.WebDriver;


public abstract class Page {

		  protected WebDriver driver;

		  public Page(WebDriver driver) {
		    this.driver = driver;
		  }
}
	

