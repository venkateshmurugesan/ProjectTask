package org.textboxsuggestion;

import java.io.IOException;
import java.util.Date;
import java.util.List;

import org.main.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Google extends Base {

	
	@BeforeClass
	private void before() {
		browserLaunch("edge");
		urlLaunch("https://www.google.com/");
	}
	
	@BeforeMethod
	private void beforeMethod() {
		Date d = new Date();
		System.out.println("Before..."+d);
		
	}
	
	@AfterMethod
	private void afterMethod() {
		Date d = new Date();
		System.out.println("Before..."+d);
	}
	
	@Test
	private void test1() throws InterruptedException {
	   driver.findElement(By.id("APjFqb")).sendKeys("iphone");
	   Thread.sleep(5000);
	    List<WebElement> list = driver.findElements(By.xpath("//div[@role='presentation']//following::li"));
	    for(int i=0;i<list.size();i++) {
	    	String text = list.get(i).getText();
	    	System.out.println(text);
	    }
    	System.out.println("Total Suggestions...\n"+list.size());

	}

	
}
