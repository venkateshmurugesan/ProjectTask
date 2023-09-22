package org.flipkart;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.main.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Task1 extends Base {
	
	@BeforeClass
	private void before() {
		browserLaunch("edge");
		urlLaunch("https://www.flipkart.com/");
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
	private void test1() {
		POM a = new POM();
		
	    a.getClose().click();
	    implicitlywait(10);
	    sendKeys(a.getTxtSearch(), "iphone");
	    a.getSearch().click();
	    List<WebElement> iphones = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
	    List<WebElement> iphoneprz = driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));

    
	    for(int i=0; i<iphones.size();i++) {
	    	for(int j=i; j<=i;j++) {
	    		
//	    		System.out.println(iphones.get(i).getText());
//	    		System.out.println(iphoneprz.get(j).getText());
	    		System.out.println(iphones.get(i).getText() +"="+ iphoneprz.get(j).getText());
	    		
	    	}
	    }
	    
	    
	    }
	}
