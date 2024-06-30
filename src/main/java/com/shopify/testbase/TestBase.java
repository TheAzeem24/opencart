package com.shopify.testbase;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.ITestResult;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.shopify.Utilities.Shopify_CommonMethods;

public class TestBase {
	
	public static WebDriver driver;
	public static FileInputStream reader;
	public static Properties props;
	
	
	//Creds
	public static String email;
	public static String password;
	public static String firstName;
	public static String lastName;
	
	//Excel
	public static String excelFilePath;
	public static String sheetName;
	
	//Login 
	public static String loginLink;
	public static String emailInput;
	public static String ctnEmailBtn;
	public static String passwordInput;
	public static String loginBtn;
	
	//SignUP
	public static String getStarted;
	public static String signUpWithEmail;
	public static String signUpEmailInput;
	public static String signUpFirstNameInput;
	public static String signUpLastNameInput;
	public static String signUpPasswordInput;
	public static String signUpConfirmPasswordInput;
	public static String createShopifyAccBtn;
	
	//Home
	public static String HomeBtn;
	public static String heading;
	public static String subText;
	public static String setupGuide;
	public static String setupGuideSubText;
	public static String taskStatus;
	public static String setupExpandBtn;
	
	@BeforeSuite
	@Parameters({"browser","url"})
	public static void setup(String browser, String url) throws IOException
	{
		if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("edge"))
		{
			System.setProperty("webdriver.edge.driver", "D:\\Drivers\\msedgedriver.exe");
			driver = new EdgeDriver();
		}
		
		  driver.manage().window().maximize(); 
		  reader = new FileInputStream("D:\\shopify\\Config\\Locators.properties"); 
		  props = new Properties(); 
		  props.load(reader); 
		  
			
			// Creds 
		  	email = props.getProperty("Email"); 
		  	password = props.getProperty("Password");

			// Login 
		  	loginLink = props.getProperty("loginLink"); 
		  	emailInput = props.getProperty("emailInput");
			ctnEmailBtn = props.getProperty("ctnEmailBtn");
			passwordInput = props.getProperty("passwordInput");
			loginBtn = props.getProperty("loginBtn");

			// SignUP getStarted = props.getProperty("getStarted"); 
			signUpWithEmail = props.getProperty("signUpWithEmail");
			signUpEmailInput = props.getProperty("signUpEmailInput");
			signUpFirstNameInput = props.getProperty("signUpFirstNameInput");
			signUpLastNameInput = props.getProperty("signUpLastNameInput");
			signUpPasswordInput = props.getProperty("signUpPasswordInput");
			signUpConfirmPasswordInput = props.getProperty("signUpConfirmPasswordInput");
			createShopifyAccBtn = props.getProperty("createShopifyAccBtn");

			// Home 
			HomeBtn = props.getProperty("HomeBtn"); 
			heading = props.getProperty("GetReadytosell");
			subText = props.getProperty("SubText");
			setupGuide = props.getProperty("SetupGuide");
			setupGuideSubText = props.getProperty("SetupGuideSubText");
			taskStatus = props.getProperty("TaskStatus");
			setupExpandBtn = props.getProperty("SetupExpandBtn");
			excelFilePath = props.getProperty("ExcelPath");
			sheetName = props.getProperty("SheetName");
			 
		  
		
		 
		driver.get(url);
	}
}
