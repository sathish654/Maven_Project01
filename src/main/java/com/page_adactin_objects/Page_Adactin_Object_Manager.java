package com.page_adactin_objects;

import org.openqa.selenium.WebDriver;

import com.pom_adactin_class.Booking_page_Adactin;
import com.pom_adactin_class.Login_Page_Adactin;
import com.pom_adactin_class.Search_Hotel_page;
import com.pom_adactin_class.Select_Page;

public class Page_Adactin_Object_Manager {
	
	
	public WebDriver driver;
	

	
	private Login_Page_Adactin lp;
	private Search_Hotel_page sp; 
	private Select_Page sep;
	private Booking_page_Adactin bp ;
	
	
	public Page_Adactin_Object_Manager(WebDriver driver2) {
	this.driver = driver2;
	
	}

	public Login_Page_Adactin getinstance_lp() {
		
		Login_Page_Adactin lp = new Login_Page_Adactin(driver);
		return lp;

	}
	
	public Search_Hotel_page getinstance_sp() {
		
		
		Search_Hotel_page sp = new Search_Hotel_page(driver);
		return sp;
		

	}
	
	public Select_Page getinstance_sep() {
		Select_Page sep = new Select_Page(driver);
		
     return sep;
	}
	
	public Booking_page_Adactin getinstance_bp() {
		
		Booking_page_Adactin bp = new Booking_page_Adactin(driver);
		
		return bp;
		
	}
	
	
	
}
