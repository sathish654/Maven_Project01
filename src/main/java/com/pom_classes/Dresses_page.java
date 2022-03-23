package com.pom_classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dresses_page {
	public WebDriver driver;
	@FindBy(xpath="(//a[@title='Dresses'])[2]")private WebElement dress;
	@FindBy(xpath="//a[@href='http://automationpractice.com/index.php?controller=cart&add=1&id_product=3&token=0fbd0f97fb442797aa08b7cb22252c72']")private WebElement addcart;
    @FindBy(xpath="(//a[@href='http://automationpractice.com/index.php?controller=order'])[3]")private WebElement proceed_cout;
	public Dresses_page(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}
	public WebElement getDress() {
		return dress;
	}
	public WebElement getAddcart() {
		return addcart;
	}
	public WebElement getProceed_cout() {
		return proceed_cout;
	}
}
