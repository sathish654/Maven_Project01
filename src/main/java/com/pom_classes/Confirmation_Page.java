package com.pom_classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Confirmation_Page {
	public WebDriver driver;
	@FindBy(xpath="(//button[@type='submit'])[2]")private WebElement confirm;
	@FindBy(xpath="//a[@class='logout']")private WebElement sign_out;
	
	

	public Confirmation_Page(WebDriver driver2) {
		this.driver = driver2;
		
		PageFactory.initElements(driver, this);
	}
		
		public WebElement getConfirm() {
			return confirm;
		}
		public WebElement getSign_out() {
			return sign_out;
		}
	}


