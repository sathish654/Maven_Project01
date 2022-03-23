package com.pom_classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {
	public WebDriver driver;
	
 @FindBy(xpath="(//input[@name='email'])[1]")private WebElement email;
 @FindBy(id="passwd")private WebElement password;
 @FindBy(id="SubmitLogin")private WebElement signin_btn;
 public Login_Page(WebDriver driver2) {
	this.driver = driver2;
	
	PageFactory.initElements(driver, this);
}

public WebElement getEmail() {
	return email;
}


 
 public WebElement getPassword() {
	return password;
}



public WebElement getSignin_btn() {
	return signin_btn;
}
 
}
