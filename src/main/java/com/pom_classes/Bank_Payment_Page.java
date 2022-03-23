package com.pom_classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Bank_Payment_Page {
	
	public WebDriver driver;
	@FindBy(className="bankwire")private WebElement bankpayment;
	public Bank_Payment_Page(WebDriver driver2) {
		this.driver=driver2;
		
		PageFactory.initElements(driver, this);
	}
	public WebElement getBankpayment() {
		return bankpayment;
	}
	
		
	}


