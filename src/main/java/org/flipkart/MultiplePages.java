package org.flipkart;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.main.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MultiplePages extends Base{
	
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
	      
	    String all="";
	    for(int i=0;i<5;i++) {
	    	List<WebElement> iphones = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
		    List<WebElement> iphoneprz = driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));	
		    System.out.println("Page "+i);
		    for(int j=0;j<iphones.size()-1;j++) {	
		    	for(int k=j;k<=j;k++) {
		    		String name = iphones.get(j).getText();
		    		String price = iphoneprz.get(k).getText();
			    	all=all+name+"=="+price+"\n";
		    	}
		    }
	    	click(a.getNext());
	    	Thread.sleep(10000);
	    }
	    System.out.println(all);   
	    
	    File ftxt=new File("C:\\Users\\venka\\Desktop\\NewTask\\excel.xls");
	    FileUtils.write(ftxt, all,false);
	    
	    File ftxts=new File("C:\\Users\\venka\\Desktop\\NewTask\\Text.txt");
	    FileUtils.write(ftxts, all,false);
	    
	    File f1=new File("C:\\Users\\venka\\Desktop\\Task\\FlipkartMultiplePages.xlsx"); 
	    FileOutputStream fo=new FileOutputStream(f1);
	    XSSFWorkbook w=new XSSFWorkbook();
	    XSSFSheet s=w.createSheet("Flipkart");
	    XSSFRow r = s.createRow(0);
	    XSSFCell c = r.createCell(0);
	    c.setCellValue(all);
		w.write(fo);	
	}
}