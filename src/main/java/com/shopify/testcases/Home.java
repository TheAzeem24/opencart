package com.shopify.testcases;

import java.io.IOException;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import com.shopify.TestBase;
import com.shopify.Utilities.ExcelUtility;
import com.shopify.Utilities.Shopify_CommonMethods;

public class Home extends TestBase{
	
	@Test
	public void tc1_ValidateHomePage() throws IOException
	{
		System.out.println(heading);
		Shopify_CommonMethods.expWait(heading, 10);
		String actaulHeading = Shopify_CommonMethods.getText(heading);
		String expectedHeading = ExcelUtility.getCellData(excelFilePath, sheetName, 1, 0);
		String actualSubText = Shopify_CommonMethods.getText(subText);
		String expectedSubText = ExcelUtility.getCellData(excelFilePath,sheetName, 2, 0);
		String actualSetupGuide = Shopify_CommonMethods.getText(setupGuide);
		String expectedSetupGuide = ExcelUtility.getCellData(excelFilePath, sheetName, 3, 0);
		String actualSetupSubText = Shopify_CommonMethods.getText(setupGuideSubText);
		String expectedSetupSubText = ExcelUtility.getCellData(excelFilePath, sheetName, 4, 0);
		String actaulTaskStatus = Shopify_CommonMethods.getText(taskStatus);
		String expectedTaskStatus = ExcelUtility.getCellData(excelFilePath, sheetName, 5, 0);
		
		SoftAssert softAssertion = new SoftAssert();
		softAssertion.assertEquals(actaulHeading, expectedHeading);
		softAssertion.assertEquals(actualSubText, expectedSubText);
		softAssertion.assertEquals(actualSetupGuide, expectedSetupGuide);
		softAssertion.assertEquals(actualSetupSubText, expectedSetupSubText);
		softAssertion.assertEquals(actaulTaskStatus, expectedTaskStatus);
		softAssertion.assertAll();
	}
	@Test
	public void tc2_ValidateExpandCollapseButton()
	{

		String attributeValue = Shopify_CommonMethods.getAttributeValue(setupExpandBtn, "aria-expanded");
		System.out.println(attributeValue);
		if(attributeValue.contains("false"))
		{
			Shopify_CommonMethods.doClickMouse(setupExpandBtn);
		}
		String attributeValue2 = Shopify_CommonMethods.getAttributeValue(setupExpandBtn, "aria-expanded");
		System.out.println(attributeValue2);
		
	}
	
}
