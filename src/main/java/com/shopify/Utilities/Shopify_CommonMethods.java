package com.shopify.Utilities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.shopify.TestBase;

public class Shopify_CommonMethods extends TestBase {
	
	public static void doClickMouse(String locator)
	{
		driver.findElement(By.xpath(locator)).click();
	}

	public static void doTypeTextbox(String locator, String value)
	{
		driver.findElement(By.xpath(locator)).sendKeys(value);
	}

	public static void expWait(String locator, int seconds) 
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(seconds));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(locator)));
	}
}
