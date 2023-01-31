package com.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.pom.Pom1;

public class Page_Object {

	public static WebDriver driver;

	public Pom1 pm;

	public Page_Object(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public Pom1 getlogin() {
		Pom1 pm = new Pom1(driver);
		return pm;

	}

}
