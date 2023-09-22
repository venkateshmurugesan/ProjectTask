package org.adactin;

import org.main.Base;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Mainn extends Base {
	
	@BeforeMethod
	public static void beforeClass() {
		browserLaunch("edge");
		implicitlywait(10);
	}
	
	@Test
	public  void test1() {
        urlLaunch("https://adactinhotelapp.com/");
		POMBooking r=new POMBooking();
		sendKeys(r.getUsername(), "venkat1210");
		sendKeys(r.getPassord(), "987654321");
		click(r.getBtnLogin());
		selectByIndex(r.getLocation(), 4);
		selectByIndex(r.getHotels(), 2);
		selectByIndex(r.getRooms(), 1);
		selectByIndex(r.getNorooms(), 4);
		sendKeys(r.getCheckin(), "22/08/2023");
		sendKeys(r.getCheckout(), "23/08/2023");
		selectByIndex(r.getAdults(), 1);
		selectByIndex(r.getChild(), 3);
		click(r.getSearch());
		click(r.getSelectHotel());
		click(r.getContinues());
		sendKeys(r.getFirstname(), "Venkat");
		sendKeys(r.getLastname(), "M");
		sendKeys(r.getAddress(), "Chennai");
		sendKeys(r.getCreditcard(), "8765432187654321");
		selectByIndex(r.getCardType(), 2);
		click(r.getExpiryMonth());
		selectByIndex(r.getExpiryMonth(), 10);
		sendKeys(r.getExpiryYear(), "2022");
		sendKeys(r.getCvv(), "321");
		click(r.getBookNow());
		implicitlywait(20);		
	}
		
	    @AfterMethod
	    public static void after() {
	    	POMBooking r=new POMBooking();
			System.out.println("Your Booking Id...\n"+getAttributejs(r.getOrderId()));

		}
	}