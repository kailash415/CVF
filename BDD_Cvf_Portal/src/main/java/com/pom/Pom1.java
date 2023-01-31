package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom1 {
	public static WebDriver driver;

	public  Pom1(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	// ONT Creation
	@FindBy(xpath = "/html/body/app-root/app-login/div/div[2]/div/div/div/form/table/tbody/tr[1]/td[2]/input")
	private WebElement userid;
	@FindBy(xpath = "/html/body/app-root/app-login/div/div[2]/div/div/div/form/table/tbody/tr[2]/td[2]/input")
	private WebElement Password;
	@FindBy(xpath = "/html/body/app-root/app-login/div/div[2]/div/div/div/form/table/tbody/tr[3]/td/button/span")
	private WebElement loginbutton;
	@FindBy(xpath = "/html/body/app-root/app-cpsubmission/div/div[1]/div[2]/div/table/tbody/tr[1]/td[6]/select")
	private WebElement Journey;
	@FindBy(xpath = "/html/body/app-root/app-cpsubmission/div/div[1]/div[2]/div/table/tbody/tr[3]/td[2]/select")
	private WebElement Product;
	@FindBy(xpath = "/html/body/app-root/app-cpsubmission/div/div[1]/div[2]/div/table/tbody/tr[3]/td[6]/select")
	private WebElement Transaction;
	@FindBy(xpath = "/html/body/app-root/app-cpsubmission/div/div[1]/div[2]/div/table/tbody/tr[5]/td[2]/select")
	private WebElement EventType;
	@FindBy(xpath = "/html/body/app-root/app-cpsubmission/div/div[1]/div[2]/div/table/tbody/tr[5]/td[6]/select")
	private WebElement Event;
	@FindBy(xpath = "/html/body/app-root/app-cpsubmission/div/div[1]/div[3]/div/div/div/form/table/tbody/tr[3]/td[2]/input")
	private WebElement AddressKey;
	@FindBy(xpath = "/html/body/app-root/app-cpsubmission/div/div[1]/div[3]/div/div/div/form/table/tbody/tr[4]/td[2]/input")
	private WebElement Floor;
	@FindBy(xpath = "/html/body/app-root/app-cpsubmission/div/div[1]/div[3]/div/div/div/form/table/tbody/tr[5]/td[2]/input")
	private WebElement Room;
	@FindBy(xpath = "/html/body/app-root/app-cpsubmission/div/div[1]/div[3]/div/div/div/form/table/tbody/tr[6]/td[2]/input")
	private WebElement Position;
	@FindBy(xpath = "/html/body/app-root/app-cpsubmission/div/div[1]/div[3]/div/div/div/form/table/tbody/tr[9]/td[2]/button")
	private WebElement Submitbutton;
	
	//CreateNAD 
	
	@FindBy(xpath = "/html/body/app-root/app-cpsubmission/div/div[1]/div[3]/div/div/div/form/table/tbody/tr[6]/td[2]/input")
	private WebElement ThoroughfareNo;
	@FindBy(xpath = "/html/body/app-root/app-cpsubmission/div/div[1]/div[3]/div/div/div/form/table/tbody/tr[7]/td[2]/input")
	private WebElement ThoroughfareName;
	@FindBy(xpath = "/html/body/app-root/app-cpsubmission/div/div[1]/div[3]/div/div/div/form/table/tbody/tr[9]/td[2]/input")
	private WebElement PostTown;
	@FindBy(xpath = "/html/body/app-root/app-cpsubmission/div/div[1]/div[3]/div/div/div/form/table/tbody/tr[11]/td[2]/input")
	private WebElement Postcode;
	
	// update NAD
	
	@FindBy(xpath = "/html/body/app-root/app-cpsubmission/div/div[1]/div[3]/div/div/div/form/table/tbody/tr[3]/td[2]/input")
	private WebElement updateNAD;
	@FindBy(xpath = "/html/body/app-root/app-cpsubmission/div/div[1]/div[3]/div/div/div/form/table/tbody/tr[4]/td[2]/select")
	private WebElement AddressTypeupdateNAD;
	@FindBy(xpath = "/html/body/app-root/app-cpsubmission/div/div[1]/div[3]/div/div/div/form/table/tbody/tr[5]/td[2]/select")
	private WebElement TransportMediumupdateNAD;
	@FindBy(xpath = "/html/body/app-root/app-cpsubmission/div/div[1]/div[3]/div/div/div/form/table/tbody/tr[6]/td[2]/select")
	private WebElement FTTPSiteTypeupdateNAD;
	@FindBy(xpath = "//*[text()='Submit']")
	private WebElement NADSubmitbtn;
	
	
	//pauseatkci1
	@FindBy(xpath = "//table[@class='table  borderless rcorners1']/tbody/tr[3]/td[2]/input")
	private WebElement OrderNumber;
	@FindBy(xpath = "//table[@class='table  borderless rcorners1']/tbody/tr[5]/td[2]/select")
	private WebElement KCI;
	
		
	
	public static WebDriver getDriver() {
		return driver;
	}
	public WebElement getOrderNumber() {
		return OrderNumber;
	}
	public WebElement getKCI() {
		return KCI;
	}
	
	
	public WebElement getNADSubmitbtn() {
		return NADSubmitbtn;
	}
	public WebElement getAddressTypeupdateNAD() {
		return AddressTypeupdateNAD;
	}
	public WebElement getTransportMediumupdateNAD() {
		return TransportMediumupdateNAD;
	}
	public WebElement getFTTPSiteTypeupdateNAD() {
		return FTTPSiteTypeupdateNAD;
	}
	
	public WebElement getUpdateNAD() {
		return updateNAD;
	}
	public WebElement getThoroughfareNo() {
		return ThoroughfareNo;
	}
	public WebElement getThoroughfareName() {
		return ThoroughfareName;
	}
	public WebElement getPostTown() {
		return PostTown;
	}
	public WebElement getPostcode() {
		return Postcode;
	}
	
	public WebElement getSubmitbutton() {
		return Submitbutton;
	}
	public WebElement getUserid() {
		return userid;
	}
	public WebElement getPassword() {
		return Password;
	}
	public WebElement getLoginbutton() {
		return loginbutton;
	}
	public WebElement getJourney() {
		return Journey;
	}
	public WebElement getProduct() {
		return Product;
	}
	public WebElement getTransaction() {
		return Transaction;
	}
	public WebElement getEventType() {
		return EventType;
	}
	public WebElement getEvent() {
		return Event;
	}
	public WebElement getAddressKey() {
		return AddressKey;
	}
	public WebElement getFloor() {
		return Floor;
	}
	public WebElement getRoom() {
		return Room;
	}
	public WebElement getPosition() {
		return Position;
	}
	
	
	
	
}
