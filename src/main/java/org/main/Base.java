package org.main;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Base {	
	public static WebDriver driver;
	
	public static WebDriver chromeBrowser() {
		driver=new ChromeDriver();
		return driver;
	}
	public static WebDriver browserLaunch(String bname) {
		if(bname.equalsIgnoreCase("chrome")) {
			 driver=new ChromeDriver();
		}
		else if(bname.equalsIgnoreCase("edge")) {
			driver=new EdgeDriver();
		}
		else if(bname.equalsIgnoreCase("firefox")) {
			driver=new FirefoxDriver();
		}
		return driver;	
	}
	public static WebDriver browserLaunch2(String bname) {
		switch(bname){
			case "chrome":
				 driver=new ChromeDriver();
				break;
			case "edge":
				driver=new EdgeDriver();
			case"firefox":
				driver=new FirefoxDriver();
				default:
					System.out.println("Invalid browser name..");
		}
		return driver;
	}
	
	public static void urlLaunch(String s) {
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(s);
	}
	public static void implicitlywait(int a) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(a));
	}
	public static void sendKeys(WebElement a,String value) {
		a.sendKeys(value);
	}
	public static void click(WebElement a) {
		a.click();
	}

	public static String getCurrentUrl() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
	}
	public static void quit() {
		driver.quit();
	}
	public static void clear(WebElement w) {
		w.clear();
	}
	public static String getText(WebElement w) {
		String text = w.getText();
		return text;
	}
	public static String getAttribute(WebElement w ) {
		String attribute = w.getAttribute("value");
		return attribute;
		
	}
	public static boolean isDisplayed(WebElement w) {
		boolean displayed = w.isDisplayed();
		return displayed;
	}
	public static boolean isEnabled(WebElement w) {
		boolean enabled = w.isEnabled();
		return enabled;
	}
	public static boolean isSelected(WebElement w) {
		boolean selected = w.isSelected();
		return selected;
	}
	//Actions
	
	public static void moveToElement(WebElement w) {
		Actions a=new Actions(driver);
		a.moveToElement(w).perform();
	}
	public static void dragAndDrop(WebElement src,WebElement dest) {
		Actions a=new Actions(driver);
		a.dragAndDrop(src, dest).perform();
	}
	public static void actionsClick(WebElement w) {
		Actions a=new Actions(driver);
		a.click(w).perform();
	}
	private void doubleClick(WebElement w) {
		Actions a=new Actions(driver);
		a.doubleClick(w).perform();
	}
	private void contextClick(WebElement w) {
		Actions a=new Actions(driver);
		a.contextClick(w).perform();
	}
	 
	//Robot
	public static void keyPress(char key) throws AWTException {
		Robot r=new Robot();
		r.keyPress(key);
	}
	public static void keyRelease(char keycode) throws AWTException {
		Robot r=new Robot();
		r.keyRelease(keycode);
	}
	
	//Drop Down
	
	public static Select selectByIndex(WebElement w , int index) {
		Select s=new Select(w);
		s.selectByIndex(index);
		return s;
	}
	public static Select selectByValue(WebElement w,String value) {
		Select s=new Select(w);
		s.selectByValue(value);
		return s;
	}
	public static Select selectByVisibleText(WebElement w,String text) {
		Select s=new Select(w);
		s.selectByVisibleText(text);
		return s;
	}
	public static Select getOptions(WebElement w) {
		Select s=new Select(w);
		s.getOptions();
		return s;
	}
	public static Select getFirstSelectedOptions(WebElement w) {
		Select s=new Select(w);
		s.getFirstSelectedOption();
		return s;
	}
	public static Select getAllSelectedOPtions(WebElement w) {
		Select s=new Select(w);
		s.getAllSelectedOptions();
		return s;
	}
	public static Select isMultiple(WebElement w) {
		Select s=new Select(w);
		s.isMultiple();
		return s;
	}
	public static Select deselectByIndex(WebElement w,int index) {
		Select s=new Select(w);
		s.deselectByIndex(index);
		return s;
	}
	public static Select deselectByValue(WebElement w,String value) {
		Select s=new Select(w);
		s.deselectByValue(value);
		return s;
	}
	public static Select deselectByVisibleText(WebElement w,String text) {
		Select s=new Select(w);
		s.deselectByVisibleText(text);
		return s;
	}
	public static Select deselectAll(WebElement w) {
		Select s=new Select(w);
		s.deselectAll();
		return s;
	}
	
	//Alerts
	
	public static void accept() {
		Alert a=driver.switchTo().alert();
		a.accept();
	}
	public static void dismiss() {
		Alert a=driver.switchTo().alert();
		a.dismiss();
	}
	public static void sendKeysAlert(String value) {
		Alert a=driver.switchTo().alert();
		a.sendKeys(value);
	}
	public static String gettextAlert() {
		Alert a=driver.switchTo().alert();
		String text = a.getText();
		return text;
	}
	public static void screenshot(String path) throws IOException {
		TakesScreenshot tk=(TakesScreenshot) driver;
		File srcFile = tk.getScreenshotAs(OutputType.FILE);
		File destFile=new File(path);
		FileUtils.copyFile(srcFile, destFile);
	}
	
	//java script executor
	
	public static Object getAttributejs(WebElement value) {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		Object executeScript = js.executeScript("return arguments[0].getAttribute('value')", value);
		return executeScript;
	}
	
	public static Object setAttribute(WebElement value) {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		Object executeScript = js.executeScript("arguments[0].getAttribute('value')", value);
		return executeScript;
	}
	
	//navigation
	
	public static void to(String url) {
		driver.navigate().to(url);
	}
	public static void back() {
		driver.navigate().back();
	}
	public static void forward() {
		driver.navigate().forward();
	}
	public static void refresh() {
		driver.navigate().refresh();
	}
	
	//Frames
	
	public static void switchToFrame(int index) {
		driver.switchTo().frame(index);
	}
	public static void switchToParentFrame() {
		driver.switchTo().parentFrame();
	}
	public static String getParentWindowId() {
		String windowHandle = driver.getWindowHandle();
		return windowHandle;
	}
	public static Set getAllWindowId() {
		Set<String> windowHandles = driver.getWindowHandles();
		return windowHandles;
	}
	
	//Find elements
	public static WebElement findElemenet(String loc, String value) {
		WebElement t=null;
		if(loc.equals("id")) {
			t=driver.findElement(By.id(value));
		}
		else if(loc.equals("name")) {
			t=driver.findElement(By.name(value));
		}
		else if(loc.equals("xpath")) {
			t=driver.findElement(By.xpath(value));
		}
		return t;
	}
	
//	public static String excelRead(String filename,String sheetname,int row,int cell) throws IOException {
//		File f=new File("E:\\EcllipseWorkspace\\M_BaseClass\\src\\main\\resources\\"+filename+".xlsx");
//		FileInputStream fi=new FileInputStream(f);
//		Workbook w=new XSSFWorkbook(fi);
//		Sheet s = w.getSheet(sheetname);
//		Row r = s.getRow(row);
//		Cell c = r.getCell(cell);
		
//		int type=c.getCellType();
//		
//		String value=null;
//		
//		if(type==1) {
//			 value = c.getStringCellValue();
//		}
//		else {
//			if(DateUtil.isCellDateFormatted(c)) {
//			java.util.Date d = c.getDateCellValue();
//			SimpleDateFormat st=new SimpleDateFormat("dd-MM-yyyy");
//			 value = st.format(d);
//		}
//			else {
//				double num = c.getNumericCellValue();
//				long l=(long) num;
//				 value = String.valueOf(l);
//			}
//		}
//		return value;
//	}
	
}