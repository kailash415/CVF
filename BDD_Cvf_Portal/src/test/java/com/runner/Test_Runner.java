package com.runner;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.Cucumber_Test.Base_Class;
import com.pageobject.Configuration_Reader;
import com.pageobject.File_Reader_Manager;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src//test//java//com//feature",glue = "com.stepdefinition",
monochrome = true,
dryRun = false,
strict = true,
tags= {"@releasepo"}
// @pauseatkci1 @updateNAD @Addresskey @OntCreation @releasepo
//plugin = {"com.cucumber.listener.ExtentCucumberFormatter:kailash/ExtentReport.html",
//		"pretty",
//		"html:Report/Html_Report",
//		
//		"json:Reports/cucumber.json",
//}
)





public class Test_Runner  {
 public static WebDriver driver;

	
	
@BeforeClass
public static void set() throws Throwable {
	
	String browser =File_Reader_Manager.getInstance().getInstanceCR().getbrowser();
	
	driver=Base_Class.browser(browser);
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	//driver.get("https://www.cvfshp.openreach.co.uk/SHP/#/login");


}
//	@AfterClass
//	public static void logout() {
//       		driver.close();
//
//	}
	
}
