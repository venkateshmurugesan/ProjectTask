package org.adactin;

import org.main.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMBooking extends Base {
	
	public POMBooking() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="username")
	private WebElement username;
	
	@FindBy(id="password")
	private WebElement passord;
	
	@FindBy(id="login")
	private WebElement btnLogin;
	
	@FindBy(name="location")
	private WebElement location;

	@FindBy(id="hotels")
	private WebElement hotels;
	
	@FindBy(xpath="(//select[@class='search_combobox'])[3]")
	private WebElement rooms;
	
	@FindBy(xpath="//select[@id='room_nos']")
	private WebElement norooms;
	
	@FindBy(xpath="(//input[@class='date_pick'])[1]")
	private WebElement checkin;
	
	@FindBy(xpath="(//input[@class='date_pick'])[2]")
	private WebElement checkout;
	
	@FindBy(xpath="//select[@name='adult_room']")
	private WebElement adults;
	
	@FindBy(xpath="//select[@name='child_room']")
	private WebElement child;
	
	@FindBy(id="Submit")
	private WebElement search;
	
	@FindBy(xpath="(//input[@type='radio'])[1]")
	private WebElement selectHotel;
	
	@FindBy(id="continue")
	private WebElement continues;
	
	@FindBy(xpath="(//input[@type='text'])[11]")
	private WebElement firstname;
	
	@FindBy(xpath="(//input[@type='text'])[12]")
	private WebElement lastname;
	
	@FindBy(id="address")
	private WebElement address;
	
	@FindBy(xpath="(//input[@type='text'])[13]")
	private WebElement creditcard;
	
	@FindBy(xpath="//select[@class='select_combobox']")
	private WebElement cardType;
	
	@FindBy(xpath="(//select[@class='select_combobox2'])[1]")
	private WebElement expiryMonth;
	
	@FindBy(xpath="(//select[@class='select_combobox2'])[2]")
	private WebElement expiryYear;
	
	@FindBy(xpath="//input[@id='cc_cvv']")
	private WebElement cvv;
	
	@FindBy(xpath="//input[@onclick='book_hotel_validate();']")
	private WebElement bookNow;
	
	@FindBy(xpath="//input[@name='order_no']")
	private WebElement orderId;
	
	@FindBy(xpath="//a[text()='Booked Itinerary']")
	private WebElement bookeditnerary;
	
	@FindBy(name="cancelall")
	private WebElement cancel;

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassord() {
		return passord;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRooms() {
		return rooms;
	}

	public WebElement getNorooms() {
		return norooms;
	}

	public WebElement getCheckin() {
		return checkin;
	}

	public WebElement getCheckout() {
		return checkout;
	}

	public WebElement getAdults() {
		return adults;
	}

	public WebElement getChild() {
		return child;
	}

	public WebElement getSearch() {
		return search;
	}

	public WebElement getSelectHotel() {
		return selectHotel;
	}

	public WebElement getContinues() {
		return continues;
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCreditcard() {
		return creditcard;
	}

	public WebElement getCardType() {
		return cardType;
	}

	public WebElement getExpiryMonth() {
		return expiryMonth;
	}

	public WebElement getExpiryYear() {
		return expiryYear;
	}

	public WebElement getCvv() {
		return cvv;
	}

	public WebElement getBookNow() {
		return bookNow;
	}

	public WebElement getOrderId() {
		return orderId;
	}	

	public WebElement getBookeditnerary() {
		return bookeditnerary;
	}

	public WebElement getCancel() {
		return cancel;
	}
	
	
}
