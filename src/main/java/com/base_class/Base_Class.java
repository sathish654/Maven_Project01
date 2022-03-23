package com.base_class;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base_Class {

	public static WebDriver driver;
	public static String value;

	public static WebDriver browser_Configuration(String type) {
		if (type.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
		}

		else if (type.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\Driver\\geckodriver.exe");
			driver = new FirefoxDriver();

		}
		driver.manage().window().maximize();

		return driver;

	}

	// implicitlyWait
	public static void implicitlyWait(int seconds, TimeUnit format) {
		driver.manage().timeouts().implicitlyWait(seconds, format);
		// explicitWait

	}

	// explicitWait
	public static void explicitWait(int seconds, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, seconds);
		wait.until(ExpectedConditions.visibilityOf(element));

	}

	/*
	 * //fluentWait //private void fluentWait(int timeoutseconds,int
	 * pollingseconds,TimeUnit format) { // Wait wait = new FluentWait(driver).with
	 */

//Sleep
	public static void Sleep(int seconds) throws Throwable {
		Thread.sleep(seconds);

	}

	// getURl
	public static void getUrl(String url) {

		driver.get(url);
	}

	// get Title
	public static void getTitle() {
		driver.getTitle();
	}

	// get current URL
	public static void getCurrentURL() {
		driver.getCurrentUrl();
	}

	// get page source
	public static void getPagesource() {
		driver.getPageSource();

	}

	// click
	public static void clickOnElement(WebElement element) {

		element.click();

	}

	// sendkeys
	public static void inputValueElement(WebElement element, String data) {

		element.sendKeys(data);
	}

	// getWindowHandle
	public static void getWindowHandle() {
		driver.getWindowHandle();
	}

	// close
	public static void close() {

		driver.close();
	}

	// quit
	public static void quit() {
		driver.quit();
	}

	// dropdown
	public static void dropDown(String type, WebElement element, String value) {
		Select s = new Select(element);
		if (type.equalsIgnoreCase("byvalue")) {
			s.selectByValue(value);

		} else if (type.equalsIgnoreCase("byvisibletext")) {
			s.selectByVisibleText(value);

		} else if (type.equalsIgnoreCase("byindex")) {
			int index = Integer.parseInt(value);
			s.selectByIndex(index);

		}

	}

	// ScrollUpandDown
	public static void scrollUpandDown(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView()", element);

	}

	// Action
	public static void ActionsClass(String actionname, WebElement element) {

		Actions a = new Actions(driver);
		if (actionname.equalsIgnoreCase("moveto")) {
			a.moveToElement(element).build().perform();

		} else if (actionname.equalsIgnoreCase("clickon")) {
			a.click(element).build().perform();

		} else if (actionname.equalsIgnoreCase("doubleclick")) {
			a.contextClick(element).build().perform();

		} else if (actionname.equalsIgnoreCase("click")) {
			a.click(element).build().perform();

		}
	}

	// screenshot
	public static void takeScreenshot(String path) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File(path);
		FileHandler.copy(source, destination);

	}

	// Read particular data
	public static String particular_Data(String path, int row_index, int cell_index) throws IOException {
		File f = new File(path);

		FileInputStream fis = new FileInputStream(f);

		Workbook w = new XSSFWorkbook(fis);

		org.apache.poi.ss.usermodel.Sheet sheetAt = w.getSheetAt(0);

		Row row = sheetAt.getRow(row_index);

		org.apache.poi.ss.usermodel.Cell cell = row.getCell(cell_index);
		CellType type = cell.getCellType();

		if (type.equals(CellType.STRING)) {

			value = cell.getStringCellValue();
		}

		else if (type.equals(CellType.NUMERIC)) {
			double numericCellValue = cell.getNumericCellValue();

			int val = (int) numericCellValue;

			value = String.valueOf(val);

		}

		return value;

	}

}
