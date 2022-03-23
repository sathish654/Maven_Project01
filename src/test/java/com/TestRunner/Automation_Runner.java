package com.TestRunner;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;

import com.Page_Objects.Page_Object_Manager;
import com.base_class.Base_Class;
import com.pom_classes.Address_Page;
import com.pom_classes.Bank_Payment_Page;
import com.pom_classes.Carrier_Page;
import com.pom_classes.Confirmation_Page;
import com.pom_classes.Dresses_page;
import com.pom_classes.Home_Page;
import com.pom_classes.Login_Page;
import com.pom_classes.Summary_Page;

    public class Automation_Runner extends Base_Class {
	public static WebDriver driver = browser_Configuration("chrome");
    public static Page_Object_Manager pom = new Page_Object_Manager(driver);
    public static Logger log = Logger.getLogger(Automation_Runner.class);

	public static void main(String[] args) throws InterruptedException, IOException {
		
		PropertyConfigurator.configure("log4j.properties");

		getUrl("http://automationpractice.com/index.php");
		implicitlyWait(3000, TimeUnit.SECONDS);
		log.info("url launched");

		// Home page
		clickOnElement(pom.get_Instance_home().getSignin());
		// log in page

		inputValueElement(pom.get_instance_login().getEmail(),particular_Data("C:\\Users\\sathish kumar\\eclipse-workspace\\MyMaven_Projectt\\TestCases\\TastCasesDevelopmentAutomation_Practice.xlsx",18 , 5));
		inputValueElement(pom.get_instance_login().getPassword(),particular_Data("C:\\\\Users\\\\sathish kumar\\\\eclipse-workspace\\\\MyMaven_Projectt\\\\TestCases\\\\TastCasesDevelopmentAutomation_Practice.xlsx",19,5));
		clickOnElement(pom.get_instance_login().getSignin_btn());
		log.info("signed in");

		// Dress section
		clickOnElement(pom.get_instance_dress().getDress());
		clickOnElement(pom.get_instance_dress().getAddcart());
		clickOnElement(pom.get_instance_dress().getProceed_cout());
		log.info("dress selected");

		// summary
		clickOnElement(pom.get_instance_summary().getQty());
		clickOnElement(pom.get_instance_summary().getProceed2());
		log.info("Quantity selected");

		// address
		clickOnElement(pom.get_instance_address().getProadd());

		// carrier
		clickOnElement(pom.get_instance_carrier().getTermsaccept());
		clickOnElement(pom.get_instance_carrier().getProceedcarrier());

		// Bank payment
		clickOnElement(pom.get_instance_payment().getBankpayment());
		log.info("Bank payment type selected");

		// Confirm order
		clickOnElement(pom.get_instance_ordercon().getConfirm());
		log.info("order placed");

		// takescreenshot
		takeScreenshot("C:\\Users\\sathish kumar\\eclipse-workspace\\MyMaven_Projectt\\Screenshot\\orderconfirm.png");

		clickOnElement(pom.get_instance_ordercon().getSign_out());
		log.info("singed out");
	}
}
