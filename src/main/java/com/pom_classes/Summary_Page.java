package com.pom_classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Summary_Page {
	public WebDriver driver;
	@FindBy(xpath="//i[@class='icon-plus']")private WebElement qty;
	@FindBy(xpath="//a[@href='http://automationpractice.com/index.php?controller=order&step=1']")private WebElement proceed2;
	public Summary_Page(WebDriver driver2) {
		this.driver= driver2;
		
		PageFactory.initElements(driver, this);
	}
	public WebElement getQty() {
		return qty;
	}
	public WebElement getProceed2() {
		return proceed2;
	}


}
