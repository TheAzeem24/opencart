package com.shopify.testcases;

import org.testng.annotations.Test;
import com.shopify.Utilities.*;

import com.shopify.TestBase;

public class Login extends TestBase {
	@Test
	public static void login()
	{
		//Shopify_CommonMethods.expWait(loginBtn, 2000);
		Shopify_CommonMethods.doClickMouse(loginBtn);
		Shopify_CommonMethods.expWait(getStarted, 2000);
		
		  Shopify_CommonMethods.doClickMouse(getStarted);
		  Shopify_CommonMethods.doClickMouse(signUpWithEmail);
		  Shopify_CommonMethods.doTypeTextbox(email, "sbindu221997@gmail.com");
		  Shopify_CommonMethods.doTypeTextbox(firstName, "bindu");
		  Shopify_CommonMethods.doTypeTextbox(lastName, "Mohammed");
		  Shopify_CommonMethods.doTypeTextbox(password, "Azm@123");
		  Shopify_CommonMethods.doTypeTextbox(confirmPassword, "Azm@123");
		  Shopify_CommonMethods.doClickMouse(createShopifyAccBtn);
		 
		
	}
}
