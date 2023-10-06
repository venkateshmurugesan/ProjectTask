package org.flipkart;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.main.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class New extends Base{
	
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
	private void test1() throws InterruptedException, IOException {
		POM a = new POM();
		
	    a.getCloses().click();
	    implicitlywait(10);
	    sendKeys(a.getTxtSearch(), "iphone");
	    a.getSearch().click();
	    
File f1=new File("C:\\Users\\venka\\Desktop\\Task\\FlipkartMultiple.xlsx");
FileOutputStream fo=new FileOutputStream(f1);

	    
	    Workbook w=new XSSFWorkbook();
	    Sheet s=w.createSheet("Flipkart");
	    
	      
	    String all="";
	    for(int i=0;i<5;i++) {
	    	List<WebElement> iphones = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
		    List<WebElement> iphoneprz = driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));	
		    System.out.println("Page"+i);
		    for(int j=0;j<iphones.size()-1;j++) {	
		    	for(int k=j;k<=j;k++) {
		    		String name = iphones.get(j).getText();
		    		String price = iphoneprz.get(k).getText();
			    	all=all+name+"="+price+"\n";
			    	Row r=s.createRow(j);
				    Cell c=r.createCell(0);
				    c.setCellValue(all);
		    	}
		    }
	    	click(a.getNext());
	    	Thread.sleep(10000);
	    }
	    System.out.println(all);   
	    
	    File f=new File("C:\\Users\\venka\\Desktop\\Task\\FlipkartMultiplePage.txt");
	    FileUtils.write(f, all, false);
	    
	    
	    
	    w.write(fo);
	    
	    
	}
}