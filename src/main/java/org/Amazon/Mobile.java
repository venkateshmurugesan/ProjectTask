package org.Amazon;

import java.io.IOException;
import java.util.List;
import java.util.Set;

import org.main.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Mobile extends Base {
	
	@BeforeMethod
	private void bf() {
		browserLaunch("edge");
		urlLaunch("https://www.amazon.in/");
	}
	
	@Test
	private void test1() throws IOException {
		
		POM a=new POM();	
		selectByVisibleText(a.getDropdown(), "Electronics");
		sendKeys(a.getTxtsearchbox(), "mobile"+Keys.ENTER);
		click(a.getSeemore());
		click(a.getBrand());
		click(a.getPricerange());
		click(a.getMobile());
		switchWindows(1);
		click(a.getBuyingoptions());
		implicitlywait(10);
		List<WebElement> cart = driver.findElements(By.xpath("(//input[@name='submit.addToCart'])[1]"));
		click(cart.get(0));
		click(a.getViewcart());
		screenshot("C:\\Users\\venka\\Desktop\\Task\\Amazon.png");
	}
	@AfterClass
	private void afterclass() {
		System.out.println("===Completed===");
	}
}