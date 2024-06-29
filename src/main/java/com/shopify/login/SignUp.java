package com.shopify.login;

import org.testng.annotations.Test;

import com.shopify.TestBase;
import com.shopify.Utilities.Shopify_CommonMethods;

public class SignUp extends TestBase {
	
	@Test
	public void signUp()
	{
		Shopify_CommonMethods.doClickMouse(loginLink);
		Shopify_CommonMethods.expWait(getStarted, 5);
		Shopify_CommonMethods.doClickMouse(getStarted);
		Shopify_CommonMethods.doClickMouse(signUpWithEmail);
		// need to provide signup details
		Shopify_CommonMethods.doTypeTextbox(signUpEmailInput, "");
		Shopify_CommonMethods.doTypeTextbox(signUpFirstNameInput, "");
		Shopify_CommonMethods.doTypeTextbox(signUpLastNameInput, "");
		Shopify_CommonMethods.doTypeTextbox(signUpPasswordInput, "");
		Shopify_CommonMethods.doTypeTextbox(signUpConfirmPasswordInput, "");
		Shopify_CommonMethods.doClickMouse(createShopifyAccBtn);
	}

}
