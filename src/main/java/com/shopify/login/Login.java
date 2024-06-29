package com.shopify.login;

import java.io.IOException;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.shopify.TestBase;
import com.shopify.Utilities.ExcelUtility;
import com.shopify.Utilities.Shopify_CommonMethods;

public class Login extends TestBase {

	@Test
	public void login()
	{
		
		Shopify_CommonMethods.doClickMouse(loginLink);
		Shopify_CommonMethods.expWait(emailInput, 5);
		Shopify_CommonMethods.doTypeTextbox(emailInput, email);
		Shopify_CommonMethods.expWait(ctnEmailBtn, 10);
		Shopify_CommonMethods.doClickEnter(ctnEmailBtn);
		Shopify_CommonMethods.expWait(passwordInput, 5);
		Shopify_CommonMethods.doTypeTextbox(passwordInput, password);
		Shopify_CommonMethods.expWait(loginBtn, 10);
		Shopify_CommonMethods.doClickEnter(loginBtn);	
		
	}
}
