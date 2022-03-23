package com.pom_adactin_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Booking_page_Adactin {
	public WebDriver driver;

	@FindBy(id="first_name")private WebElement  firstname;
	@FindBy(id="last_name")private WebElement lastname ;
    @FindBy(id="address")private WebElement  address;
	@FindBy(id="cc_num")private WebElement  ccnumber ;
    @FindBy(id="cc_type")private WebElement  d7;
	@FindBy(id="cc_exp_month")private WebElement d8 ;
	@FindBy(id="cc_exp_year")private WebElement d9 ;
	@FindBy(id="cc_cvv")private WebElement  cvv ;
	@FindBy(id="book_now")private WebElement BN ;
	@FindBy(linkText="Booked Itinerary")private WebElement itinerary ;
	@FindBy(id="logout")private WebElement  logout ;
	public Booking_page_Adactin(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver,this );
	}
	public WebElement getFirstname() {
		return firstname;
	}
	public WebElement getLastname() {
		return lastname;
	}
	public WebElement getAddress() {
		return address;
	}
	public WebElement getCcnumber() {
		return ccnumber;
	}
	public WebElement getD7() {
		return d7;
	}
	public WebElement getD8() {
		return d8;
	}
	public WebElement getD9() {
		return d9;
	}
	public WebElement getCvv() {
		return cvv;
	}
	public WebElement getBN() {
		return BN;
	}
	public WebElement getItinerary() {
		return itinerary;
	}
	public WebElement getLogout() {
		return logout;
	}
	
	

}
