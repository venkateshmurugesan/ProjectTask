package org.Amazon;

import org.main.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM extends Base {
	
	public POM() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="searchDropdownBox")
	private WebElement dropdown;
	
	@FindBy(id="twotabsearchtextbox")
	private WebElement txtsearchbox;
	
	@FindBy(xpath="(//span[text()='See more'])[1]")
	private WebElement seemore;
	
	@FindBy(xpath="(//span[text()='Motorola'])[1]")
	private WebElement brand;
	
	@FindBy(xpath="//span[text()='Over ₹20,000']")
	private WebElement pricerange;
	
	@FindBy(xpath="//span[text()='Motorola G62 5G (6GB, 128GB) (Midnight Gray)']")
	private WebElement mobile;
	
	@FindBy(xpath="//a[text()=' See All Buying Options ']")
	private WebElement buyingoptions;
	
	@FindBy(xpath="(//input[@type='submit'])[2]")
	private WebElement viewcart;

	public WebElement getDropdown() {
		return dropdown;
	}

	public WebElement getTxtsearchbox() {
		return txtsearchbox;
	}

	public WebElement getSeemore() {
		return seemore;
	}

	public WebElement getBrand() {
		return brand;
	}

	public WebElement getPricerange() {
		return pricerange;
	}

	public WebElement getMobile() {
		return mobile;
	}

	public WebElement getBuyingoptions() {
		return buyingoptions;
	}

	public WebElement getViewcart() {
		return viewcart;
	}

	
}
