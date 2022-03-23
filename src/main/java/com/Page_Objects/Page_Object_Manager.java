package com.Page_Objects;

import org.openqa.selenium.WebDriver;

import com.pom_classes.Address_Page;
import com.pom_classes.Bank_Payment_Page;
import com.pom_classes.Carrier_Page;
import com.pom_classes.Confirmation_Page;
import com.pom_classes.Dresses_page;
import com.pom_classes.Home_Page;
import com.pom_classes.Login_Page;
import com.pom_classes.Summary_Page;

public class Page_Object_Manager {
	
	public WebDriver driver;
	private Home_Page home;
    private  Login_Page login; 
	private Dresses_page dress ;
    private Summary_Page summary ;
	private  Address_Page address ;
	private Carrier_Page carrier ;
	private Bank_Payment_Page payment ;
	private Confirmation_Page ordercon ;
	
	
	public Page_Object_Manager(WebDriver driver2) {

    this.driver=driver2;
    
	}
	public Home_Page get_Instance_home() {
		
		 home = new Home_Page(driver);
		return home;
		
    }
	public Login_Page get_instance_login() {
		
		login = new Login_Page(driver); 
		
		return login;
		
	}
	public Dresses_page get_instance_dress() {
		 dress = new Dresses_page(driver);
		return dress;
		
	}
	public Summary_Page get_instance_summary() {
		summary = new Summary_Page(driver);
		return summary;
		
	}
	public Address_Page get_instance_address() {
		 address = new Address_Page(driver);
		return address;
		
	}
	public Carrier_Page get_instance_carrier() {
		carrier = new Carrier_Page(driver);
		
		return carrier;
		

	}
	public Bank_Payment_Page get_instance_payment() {
		payment = new Bank_Payment_Page(driver);
		return payment;
	

	}
	public Confirmation_Page get_instance_ordercon() {
		 ordercon = new Confirmation_Page(driver);

		return ordercon;
		
	}
	



}
