package com.TestRunner;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import com.base_class.Base_Class;
import com.page_adactin_objects.Page_Adactin_Object_Manager;

public class Adactin_Runner extends Base_Class {
	public static WebDriver driver = browser_Configuration("chrome");
	public static Page_Adactin_Object_Manager pom = new Page_Adactin_Object_Manager(driver);
	public static Logger log = Logger.getLogger(Adactin_Runner.class);
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		PropertyConfigurator.configure("log4j.properties");

		getUrl("https://adactinhotelapp.com/");
		log.info("Url successfully launched");

		implicitlyWait(3000, TimeUnit.SECONDS);

		// login page

		
       
		inputValueElement(pom.getinstance_lp().getUsername(),particular_Data("C:\\Users\\sathish kumar\\eclipse-workspace\\MyMaven_Projectt\\TestCases\\TextCasesDevelpmentAdactin.xlsx",1, 5));
		inputValueElement(pom.getinstance_lp().getPassword(),particular_Data("C:\\Users\\sathish kumar\\eclipse-workspace\\MyMaven_Projectt\\TestCases\\TextCasesDevelpmentAdactin.xlsx",2, 5));
		clickOnElement(pom.getinstance_lp().getLogin());
		log.info("log in success");
		

		// search hotel page

		

		dropDown("byvisibletext", pom.getinstance_sp().getD1(), "Melbourne");
		dropDown("byvisibletext", pom.getinstance_sp().getD2(), "Hotel Sunshine");
		dropDown("byvisibletext", pom.getinstance_sp().getD3(), "Double");
		dropDown("byvisibletext", pom.getinstance_sp().getD4(), "4 - Four");
		inputValueElement(pom.getinstance_sp().getCheckin(),particular_Data("C:\\Users\\sathish kumar\\eclipse-workspace\\MyMaven_Projectt\\TestCases\\TextCasesDevelpmentAdactin.xlsx",8, 5));
		inputValueElement(pom.getinstance_sp().getCheckout(),particular_Data("C:\\Users\\sathish kumar\\eclipse-workspace\\MyMaven_Projectt\\TestCases\\TextCasesDevelpmentAdactin.xlsx",9, 5));
		dropDown("byvalue",pom.getinstance_sp().getD5(), "4");
		dropDown("byvalue",pom.getinstance_sp().getD6(), "0");
		clickOnElement(pom.getinstance_sp().getSearch());
        log.info("Hotel details selected and entered");

		// select page

	
		
		clickOnElement(pom.getinstance_sep().getSelect());
		clickOnElement(pom.getinstance_sep().getCon());

		// booking page
		
		
		inputValueElement(pom.getinstance_bp().getFirstname(),particular_Data("C:\\Users\\sathish kumar\\eclipse-workspace\\MyMaven_Projectt\\TestCases\\TextCasesDevelpmentAdactin.xlsx",15, 5));
		inputValueElement(pom.getinstance_bp().getLastname(),particular_Data("C:\\Users\\sathish kumar\\eclipse-workspace\\MyMaven_Projectt\\TestCases\\TextCasesDevelpmentAdactin.xlsx",16, 5));
		inputValueElement(pom.getinstance_bp().getAddress(),particular_Data("C:\\Users\\sathish kumar\\eclipse-workspace\\MyMaven_Projectt\\TestCases\\TextCasesDevelpmentAdactin.xlsx",17, 5));
		inputValueElement(pom.getinstance_bp().getCcnumber(),particular_Data("C:\\Users\\sathish kumar\\eclipse-workspace\\MyMaven_Projectt\\TestCases\\TextCasesDevelpmentAdactin.xlsx",18, 5));
		dropDown("byvisibletext",pom.getinstance_bp().getD7(), "American Express");
		dropDown("byindex",pom.getinstance_bp().getD8(), "3");
		dropDown("byvisibletext",pom.getinstance_bp().getD9(), "2022");
		inputValueElement(pom.getinstance_bp().getCvv(),particular_Data("C:\\Users\\sathish kumar\\eclipse-workspace\\MyMaven_Projectt\\TestCases\\TextCasesDevelpmentAdactin.xlsx",22, 5));
		clickOnElement(pom.getinstance_bp().getBN());
		clickOnElement(pom.getinstance_bp().getItinerary());
		log.info("Hotel booked");
		// booked Itinerary
		
		// booked screenshot

        takeScreenshot("C:\\Users\\sathish kumar\\eclipse-workspace\\MyMaven_Projectt\\Screenshot\\booked.png");
        clickOnElement(pom.getinstance_bp().getLogout());
        log.info("logged out successfully");

	}

}
