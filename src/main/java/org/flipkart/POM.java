package org.flipkart;

import org.main.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM extends Base {
	
	public POM() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(name="q")
	private WebElement txtSearch;
	
	@FindBy(xpath="//button[@class='_2KpZ6l _2doB4z']")
	private WebElement close;
	
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement search;
	
	
	@FindBy(xpath="(//div[@class='_4rR01T'])[1]")
	private WebElement iphone;
	
	
	
	public WebElement getTxtSearch() {
		return txtSearch;
	}

	public WebElement getIphone() {
		return iphone;
	}
	
	public WebElement getSearch() {
		return search;
}
	public WebElement getClose() {
		return close;
	}
}