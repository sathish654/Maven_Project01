package com.pom_adactin_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page_Adactin {
	public WebDriver driver;
	
	@FindBy(id="username")private WebElement username;
	@FindBy(xpath="//input[@name='password']")private WebElement passwordad;
	@FindBy(xpath="//input[@type='Submit']")private WebElement login;
	public Login_Page_Adactin(WebDriver driver2) {
		this.driver= driver2;
		
		PageFactory.initElements(driver,this);
	}
	public WebElement getUsername() {
		return username;
	}
	public WebElement getPassword() {
		return passwordad;
	}
	public WebElement getLogin() {
		return login;
	}
	

}
