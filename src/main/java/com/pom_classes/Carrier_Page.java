package com.pom_classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Carrier_Page {
	public WebDriver driver;
	@FindBy(id="cgv")private WebElement termsaccept ;
	@FindBy(name="processCarrier")private WebElement  proceedcarrier;
	public Carrier_Page(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}
	public WebElement getTermsaccept() {
		return termsaccept;
	}
	public WebElement getProceedcarrier() {
		return proceedcarrier;
	}
	

}
