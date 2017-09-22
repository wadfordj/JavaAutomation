package com.jonwadford;

import org.junit.Test;
import org.junit.Before;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
	public class CheckForValueInList {
		private WebDriver driver;
		
		@Before
		public void setUp() {
			System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir") + "/vendor/geckodriver");
			System.out.println(System.getProperty("user.dir"));
			driver = new FirefoxDriver();
		}
		
		@Test
		public void succeeded() {
			driver.get("http://127.0.0.1:8000/");
			
			boolean foundInList = false;
			Select make = new Select(driver.findElement(By.cssSelector("select#stuff")));
			List<String> act_options = new ArrayList<String>();
			
			for(WebElement option : make.getOptions()) {
				act_options.add(option.getText());
			}
				for(String elm : act_options) {
					if (elm.equals("Volvo")){
						System.out.println("Found it");
						foundInList = true;
						break;
						}
					}
					
					if (!foundInList) {
						System.out.println("Didnt Find it");
					}
				}
			
			
		
		
		
		@After
		public void tearDown() {
			driver.quit();
		}
	
}
