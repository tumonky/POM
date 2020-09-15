package com.project.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class base {

	private WebDriver driver;
	
	public base (WebDriver driver) {
		this.driver =  driver;
		
	}
	
	
	public WebDriver ConexionChrome () {
		
		System.setProperty("webdriver.chrome.driver" , "./config/chromedriver_mac/chromedriver");
		driver = new ChromeDriver();
		return driver;
	}
	
	public WebElement Findelement (By locator) {
		return driver.findElement(locator);
		
	}
	
	public WebElement getText (By Element) {
		return ((base) driver).getText(Element);
		
	}
	
	public void Type (String inputText, By Locator) {
		driver.findElement(Locator).sendKeys(inputText);
		
	}
	
	public void click ( By Locator) {
		driver.findElement(Locator).click();
		
	}
	
	public void visit (String url) {
		driver.get(url);
		
	}
	
	public Boolean isDisplayed (By locator) {
		try {
		      return driver.findElement(locator).isDisplayed();  		
		} catch (org.openqa.selenium.NoSuchElementException e) {
			return false;
		}
		
	}
	
}
