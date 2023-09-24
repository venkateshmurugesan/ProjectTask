package org.adactin;
import java.util.List;
import org.main.Base;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
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
	public  void test1() throws InterruptedException {
        urlLaunch("https://adactinhotelapp.com/");
		POMBooking r=new POMBooking();
		sendKeys(r.getUsername(), "venkat1210");
		sendKeys(r.getPassord(), "987654321");
		click(r.getBtnLogin());
		System.out.println("-----Account logged in successfully-----");
		selectByIndex(r.getLocation(), 4);
		selectByIndex(r.getHotels(), 2);
		selectByIndex(r.getRooms(), 1);
		selectByIndex(r.getNorooms(), 4);
		sendKeys(r.getCheckin(), "08/08/2023");
		sendKeys(r.getCheckout(), "09/08/2023");
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
		System.out.println("-----Room Booked Sucessfully-----");
		click(r.getBookeditnerary());
		
		List<WebElement> totaltable = driver.findElements(By.tagName("table"));
		WebElement table = driver.findElement(By.xpath("//table[@cellpadding='5']"));
		List<WebElement> tabledata = table.findElements(By.tagName("td"));
		List<WebElement> checkbox = driver.findElements(By.xpath("//input[@type='checkbox']"));
		List<WebElement> tablerow = driver.findElements(By.xpath("//input[@type='button']"));
		click(tablerow.get(tablerow.size()-1));
		click(checkbox.get(checkbox.size()-1));
		Thread.sleep(10);
		click(r.getCancel());
		Alert a=driver.switchTo().alert();
		a.accept();
		System.out.println("-----Room Cancelled Sucessfully-----");
	}    
	}
