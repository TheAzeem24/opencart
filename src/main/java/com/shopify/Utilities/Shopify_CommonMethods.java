package com.shopify.Utilities;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;

import com.shopify.TestBase;

public class Shopify_CommonMethods extends TestBase {
	
	//Mouse click
	public static void doClickMouse(String locator)
	{
		driver.findElement(By.xpath(locator)).click();
	}
	//Enter
	public static void doClickEnter(String locator)
	{
		driver.findElement(By.xpath(locator)).sendKeys(Keys.ENTER);
	}
	//Enter data in input field
	public static void doTypeTextbox(String locator, String value)
	{
		driver.findElement(By.xpath(locator)).sendKeys(value);
	}	
	//isDisplay
	public boolean isDisplay(String locator)
	{
		boolean displayed = driver.findElement(By.xpath(locator)).isDisplayed();
		return displayed;
	}
	//isSelected
	public static boolean isSelected(String locator)
	{
		boolean selected = driver.findElement(By.xpath(locator)).isSelected();
		return selected;
	}
	//isEnable
	public static boolean isEnabled(String locator)
	{
		boolean enabled = driver.findElement(By.xpath(locator)).isEnabled();
		return enabled;
	}
	//getText
	public static String getText(String locator)
	{
		String text = driver.findElement(By.xpath(locator)).getText();
		return text;
	}
	//HTMLText
	public static String getHTMLText(String locator)
	{
		String text = driver.findElement(By.xpath(locator)).getAttribute("innerHTML");
		return text;
	}
	//attribute value
	public static String getAttributeValue(String locator, String value)
	{
		String attribute = driver.findElement(By.xpath(locator)).getAttribute(value);
		return attribute;
	}
	//Wait
	public static void expWait(String locator, int seconds) 
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(seconds));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(locator)));
	}
	
	public static String takeScreenShot(ITestResult iTestResult)
	{
		String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		String dest = System.getProperty("user.dir") + "/Screenshots/" + iTestResult.getName() + timeStamp + ".png";
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(scrFile, new File(dest));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return dest;
	}
}
