package com.pom_adactin_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Hotel_page {
	public WebDriver driver;
	
	@FindBy(id="location")private WebElement d1;
	@FindBy(id="hotels")private WebElement d2 ;
	@FindBy(xpath="//select[@name='room_type']")private WebElement d3;
	@FindBy(xpath="//select[@name='room_nos']")private WebElement d4;
	@FindBy(id="datepick_in")private WebElement checkin;
	@FindBy(id="datepick_out")private WebElement checkout;
   @FindBy(xpath="//select[@name='adult_room']")private WebElement d5 ;
   @FindBy(id="child_room")private WebElement d6;
   @FindBy(id="Submit")private WebElement search;
public Search_Hotel_page(WebDriver driver2) {
	this.driver= driver2;
	PageFactory.initElements(driver, this);
}
public WebElement getD1() {
	return d1;
}
public WebElement getD2() {
	return d2;
}
public WebElement getD3() {
	return d3;
}
public WebElement getD4() {
	return d4;
}
public WebElement getCheckin() {
	return checkin;
}
public WebElement getCheckout() {
	return checkout;
}
public WebElement getD5() {
	return d5;
}
public WebElement getD6() {
	return d6;
}
public WebElement getSearch() {
	return search;
}
   
}
