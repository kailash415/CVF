package com.Cucumber_Test;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Base_Class {
	public static WebDriver driver;
	public static WebDriver browser(String browser) {
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\eclipse-workspace\\Rest_Api\\driver\\chromedriver.exe");
//			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+ "//driver//chromedriver.exe");
			driver = new ChromeDriver();
		}
		else {
			System.out.println("invalid");
		}
		driver.manage().window().maximize();
		return driver;
	}
	public static void clickonelement(WebElement element) {
        element.click();    
	}
	public static void input(WebElement element,String str) {
    element.sendKeys(str);
	}
	
	public static void launch(String url) {
		
    driver.get(url);
    
	}
	public static void action(WebElement element) {
     Actions a = new Actions(driver);
     a.moveToElement(element).build().perform();
//     a.click(element).build().perform();
//     a.doubleClick(element).build().perform();
//     a.contextClick(element).build().perform();
}
	public static void frame(int index) {
     driver.switchTo().frame(index);
     	}
	
	public static void returnframe() {
     driver.switchTo().defaultContent();
   	}
	
	public static void takesscreen() throws IOException  {
		 TakesScreenshot ts= (TakesScreenshot) driver;
         File source = ts.getScreenshotAs(OutputType.FILE);	
         File destination= new File("C:\\Users\\user\\eclipse-workspace\\Green\\screenshot\\ok.png");
         FileUtils.copyFile(source, destination);
	}
     public static void selectByIndex(WebElement element, int i) {
     Select s= new Select(element);
     s.selectByIndex(i);
	}
	public static void selectbyvalue(WebElement element,String srt ) {
		  Select s= new Select(element);
		  s.selectByValue(srt);
	}
	public static void selectByVisibleText(WebElement element,String srt ) {
		  Select s= new Select(element);
		  s.selectByVisibleText(srt);
		  
	}
	public static  void quit() {
    driver.quit();
   
	}
	public static void close() {
   driver.close();
 	}
	public static void getTitle() {
      System.out.println(driver.getTitle());
	}
	public static void getcurrenturl() {
	      System.out.println(driver.getCurrentUrl());
		}
	public static void navigateto(String str) {
      driver.navigate().to(str);
	}
	public static void navigateback() {
		driver.navigate().back();
	}
	public static void navigateforward() {
		driver.navigate().forward();
	}
	public static void navigaterefresh() {
		driver.navigate().refresh();
	}
	public static void selected(WebElement element) {
		element.isSelected();
		
	}
	public static void enable(WebElement element) {
		element.isEnabled();
	}
	public static void displayed(WebElement element) {
		element.isDisplayed();
	}
	
	public static void gettext(WebElement element) {
		element.getText();
		
	}
	public static void robot() throws AWTException {
		Robot r = new Robot();
//		r.keyPress(keycode);

	}
	}

	
	
	
	

