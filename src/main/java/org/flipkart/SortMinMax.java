package org.flipkart;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

import org.main.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SortMinMax extends Base {
	
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
		
	    a.getCloses().click();
	    implicitlywait(10);
	    sendKeys(a.getTxtSearch(), "iphone");
	    a.getSearch().click();
	    List<WebElement> iphones = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
	    List<WebElement> iphoneprz = driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
        
	    HashMap<String, Integer> products=new HashMap<String,Integer>();
	    for(int i=0;i<iphones.size();i++) {
	    	String name = iphones.get(i).getText();
	    	String price = iphoneprz.get(i).getText();
	    	if(price.contains("₹")) {
	    		price=price.replace("₹"	, "");
	    	}
	    	if(price.contains(",")) {
	    		price=price.replace(",", "");
	    	}
	    	Integer int_price=Integer.parseInt(price);
	    	products.put(name, int_price);
	    	System.out.println("int price\n"+int_price);	
	    }
	    System.out.println("products\n"+products);
	 
	    List<String> keys=new ArrayList<>(products.keySet());
	    Collections.sort(keys);
	    System.out.println("max"+Collections.max(keys));
	    System.out.println("min\n"+Collections.min(keys));
	    
	    
//        String name="";
//        String price="";
//	    for(int i=0; i<iphones.size();i++) {
//	    	for(int j=i; j<=i;j++) {
//	    		
//	    		name= iphones.get(i).getText()+name;
//	    		price=iphoneprz.get(j).getText()+price;
//	    		System.out.println(iphones.get(i).getText());
//	    		System.out.println(iphoneprz.get(j).getText());
//	    		System.out.println(iphones.get(i).getText() +"="+ iphoneprz.get(j).getText());
//	    		
//	    	}
//	    }
	    
//	    List<String> li=new LinkedList<String>();
//	    li.add(price);
//	    Collections.sort(li);
//	    System.out.println("Sort"+li);

//	    System.out.println("=====Mobile Names=====\n"+name);
//	    System.out.println("=====Mobile Prices=====\n"+price);
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    }
	}
