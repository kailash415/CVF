package com.stepdefinition;

import java.awt.RenderingHints.Key;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.Cucumber_Test.Base_Class;
import com.pageobject.File_Reader_Manager;
import com.pageobject.Page_Object;
import com.pom.Pom1;
import com.runner.Test_Runner;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step_Definition extends Base_Class {

	public static WebDriver driver=Test_Runner.driver;
	
	
	
//	Pom1 p=new Pom1(driver);
	Page_Object h = new Page_Object(driver);
	
	
	
	@Given("^user open the url$")
	public void user_open_the_url() throws Throwable {
		
		String url=File_Reader_Manager.getInstance().getInstanceCR().geturl();
		launch(url);
	//driver.get("https://www.cvfshp.openreach.co.uk/SHP/#/login");
		System.out.println("sucessfully enter into CVF portal");
	    
	}

	@When("^enter userid \"([^\"]*)\"$")
	public void enter_userid(String arg1) throws Throwable {
		
		input(h.getlogin().getUserid(), arg1);
		
	   
	}

	@When("^enter password \"([^\"]*)\"$")
	public void enter_password(String arg2) throws Throwable {
		input(h.getlogin().getPassword(), arg2);

	   
	}

	@Then("^click login button$")
	public void click_login_button() throws Throwable {

Robot r = new Robot();
r.keyPress(KeyEvent.VK_ENTER);
r.keyRelease(KeyEvent.VK_ENTER);
//Thread.sleep(30000);
	   
	}

	// Create ONT
	@When("^select journey type$")
	public void select_journey_type() throws Throwable {
		System.out.println("entering into selecting part");
		selectByIndex(h.getlogin().getJourney(), 2);
	   
	}

	@When("^select Product type$")
	public void select_Product_type() throws Throwable {
		selectByIndex(h.getlogin().getProduct(), 5);
	}

	@When("^select Transaction type$")
	public void select_Transaction_type() throws Throwable {
		selectByIndex(h.getlogin().getTransaction(), 3);

	}

	@When("^select EventType type$")
	public void select_EventType_type() throws Throwable {
	    selectbyvalue(h.getlogin().getEventType(), "64");
	}

	@When("^select Event type$")
	public void select_Event_type() throws Throwable {
		selectbyvalue(h.getlogin().getEvent(), "303");
		Thread.sleep(3000);
	}

	@When("^enter Address Key \"([^\"]*)\"$")
	public void enter_Address_Key(String NAD) throws Throwable {
	    input(h.getlogin().getAddressKey(), NAD);
	}

	@When("^enter Floor \"([^\"]*)\"$")
	public void enter_Floor(String Floorno) throws Throwable {
	    input(h.getlogin().getFloor(), Floorno);
	}
	
	@When("^enter Room \"([^\"]*)\"$")
	public void enter_Room(String roomno) throws Throwable {
		 input(h.getlogin().getRoom(), roomno);
	}

	@When("^enter Position \"([^\"]*)\"$")
	public void enter_Position(String positionno) throws Throwable {
		 input(h.getlogin().getPosition(), positionno);
	}

	@Then("^click submit button$")
	public void click_submit_button() throws Throwable {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
	}
	
	//Create NAD 
	
	@When("^select Addresskeyjourney type$")
	public void select_Addresskeyjourney_type() throws Throwable {
		selectbyvalue(h.getlogin().getJourney(), "3");
	}

	@When("^select AddresskeyProduct type$")
	public void select_AddresskeyProduct_type() throws Throwable {
		selectbyvalue(h.getlogin().getProduct(), "18");
	}

	@When("^select AddresskeyTransaction type$")
	public void select_AddresskeyTransaction_type() throws Throwable {
	    System.out.println("Successfully selected Transaction Type");
	}

	@When("^select AddresskeyEventType type$")
	public void select_AddresskeyEventType_type() throws Throwable {
		selectbyvalue(h.getlogin().getEventType(), "67");
	}

	@When("^select AddresskeyEvent type$")
	public void select_AddresskeyEvent_type() throws Throwable {
		selectbyvalue(h.getlogin().getEvent(), "302");

	}

	@When("^enter thoroughfarenNo \"([^\"]*)\"$")
	public void enter_thoroughfarenNo(String thoroughfarenNo) throws Throwable {
		input(h.getlogin().getThoroughfareNo(), thoroughfarenNo);
	    
	}

	@When("^enter thoroughfarenName \"([^\"]*)\"$")
	public void enter_thoroughfarenName(String thoroughfarenName) throws Throwable {
		input(h.getlogin().getThoroughfareName(), thoroughfarenName);
	}

	@When("^enter PostTown \"([^\"]*)\"$")
	public void enter_PostTown(String PostTown) throws Throwable {
		input(h.getlogin().getPostTown(), PostTown);
	}

	@When("^enter Postcode \"([^\"]*)\"$")
	public void enter_Postcode(String Postcode) throws Throwable {
		input(h.getlogin().getPostcode(), Postcode);
	}

	// update NAD
	
	@When("^select updateNADjourney type$")
	public void select_updateNADjourney_type() throws Throwable {
		selectbyvalue(h.getlogin().getJourney(), "3");
	}
	
    @When("^select updateNADProduct type$")
	public void select_updateNADProduct_type() throws Throwable {
    	selectbyvalue(h.getlogin().getProduct(), "18");
	}

	@When("^select updateNADTransaction type$")
	public void select_updateNADTransaction_type() throws Throwable {
		 System.out.println("Successfully selected Transaction Type for update NAD");
	}

	@When("^select updateNADEventType type$")
	public void select_updateNADEventType_type() throws Throwable {
		selectbyvalue(h.getlogin().getEventType(), "67");
	}

	@When("^select updateNADEvent type$")
	public void select_updateNADEvent_type() throws Throwable {
		selectbyvalue(h.getlogin().getEvent(), "310");
		Thread.sleep(3000);
	}

	@When("^enter Addresskey for updateNAD \"([^\"]*)\"$")
	public void enter_Addresskey_for_updateNAD(String oldnad) throws Throwable {
      input(h.getlogin().getUpdateNAD(), oldnad);
	}

	@When("^enter Addresstype for updateNAD$")
	public void enter_Addresstype_for_updateNAD() throws Throwable {
	   selectbyvalue(h.getlogin().getAddressTypeupdateNAD(), "G");
	}

	@When("^enter Addresstype for TransportMedium$")
	public void enter_Addresstype_for_TransportMedium() throws Throwable {
		selectbyvalue(h.getlogin().getTransportMediumupdateNAD(), "WLR3 PSTN Single Line Residential");
	}

	@When("^enter Addresstype for FTTPSiteType$")
	public void enter_Addresstype_for_FTTPSiteType() throws Throwable {
		//selectbyvalue(h.getlogin().getFTTPSiteTypeupdateNAD(), "Not Required_@@_DISPVAL");
		selectByVisibleText(h.getlogin().getFTTPSiteTypeupdateNAD(), "Not Required");
		Thread.sleep(3000);
	}

	@Then("^click submit button for updateNAD$")
	public void click_submit_button_for_updateNAD() throws Throwable {
		System.out.println("click submit button");
//		Robot r = new Robot();
//		r.keyPress(KeyEvent.VK_ENTER);
//		r.keyRelease(KeyEvent.VK_ENTER);
		boolean submitbtnforupdatend=h.getlogin().getNADSubmitbtn().isEnabled();
		System.out.println(submitbtnforupdatend);
		//clickonelement(h.getlogin().getNADSubmitbtn());
		try {
			clickonelement(h.getlogin().getNADSubmitbtn());
		  } catch (Exception e) {
		     JavascriptExecutor executor = (JavascriptExecutor) driver;
		     executor.executeScript("arguments[0].click();", h.getlogin().getNADSubmitbtn());
		  }
		System.out.println("Submit button Succesfully clicked");

	}
	
	// pause at KCI1
	@When("^select pause(\\d+)journey type$")
	public void select_pause_journey_type(int arg1) throws Throwable {
		selectbyvalue(h.getlogin().getJourney(), "1");
	}

	@When("^select pause(\\d+)Product type$")
	public void select_pause_Product_type(int arg1) throws Throwable {
		selectbyvalue(h.getlogin().getProduct(), "3");
	}

	@When("^select pause(\\d+)Transaction type$")
	public void select_pause_Transaction_type(int arg1) throws Throwable {
		selectbyvalue(h.getlogin().getTransaction(), "13");
	}

	@When("^select pause(\\d+)EventType type$")
	public void select_pause_EventType_type(int arg1) throws Throwable {
		selectbyvalue(h.getlogin().getEventType(), "66");
	}
	
	@When("^select pause(\\d+)Event type$")
	public void select_pause_Event_type(int arg1) throws Throwable {
		selectbyvalue(h.getlogin().getEvent(), "214");
	}

	@When("^enter order for pausedatkci(\\d+) \"([^\"]*)\"$")
	public void enter_order_for_pausedatkci(int arg1, String sellerid) throws Throwable {
	   input(h.getlogin().getOrderNumber(), sellerid);
	}

	@When("^select kci$")
	public void select_kci() throws Throwable {
		selectbyvalue(h.getlogin().getKCI(), "KSU1");
	    
	}

	@Then("^click_submit_button_for_pauseatkci(\\d+)$")
	public void click_submit_button_for_pauseatkci(int arg1) throws Throwable {
		try {
			clickonelement(h.getlogin().getNADSubmitbtn());
		  } catch (Exception e) {
		     JavascriptExecutor executor = (JavascriptExecutor) driver;
		     executor.executeScript("arguments[0].click();", h.getlogin().getNADSubmitbtn());
		  }
		System.out.println("paused at kci1 = Submit button Succesfully clicked");
	}

	// release PO
	@When("^select kcireleasepo$")
	public void select_kcireleasepo() throws Throwable {
		selectByIndex(h.getlogin().getKCI(), 3);
	}
}
