package com.pom_adactin_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select_Page {
	public WebDriver driver;
	
	@FindBy(id="radiobutton_0")private WebElement  select;
	@FindBy(id="continue")private WebElement con ;
	public Select_Page(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver,this);
	}
	public WebElement getSelect() {
		return select;
	}
	public WebElement getCon() {
		return con;
	}

}
