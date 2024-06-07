package com.shopify;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class TestBase {
	
	public static WebDriver driver;
	static FileInputStream reader;
	static Properties props;
	
	public static String loginBtn;
	public static String emailInput;
	public static String ctnEmailBtn;
	public static String getStarted;
	public static String signUpWithEmail;
	public static String email;
	public static String firstName;
	public static String lastName;
	public static String password;
	public static String confirmPassword;
	public static String createShopifyAccBtn;
	
	
	@BeforeClass
	@Parameters({"browser","url"})
	public static void setup(String browser, String url) throws IOException
	{
		if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.edge.driver", "D:\\Drivers\\msedgedriver.exe");
			driver = new EdgeDriver();
		}
		driver.manage().window().maximize();
		reader=new FileInputStream("D:\\shopify\\Config\\Locators.properties"); 
	    props=new Properties(); 
		props.load(reader);
		
		loginBtn = props.getProperty("loginBtn");
		emailInput = props.getProperty("emailInput");
		ctnEmailBtn = props.getProperty("ctnEmailBtn");
		getStarted = props.getProperty("getStarted");
		signUpWithEmail = props.getProperty("signUpWithEmail");
		email = props.getProperty("email");
		firstName = props.getProperty("firstName");
		lastName = props.getProperty("lastName");
		password = props.getProperty("password");
		confirmPassword = props.getProperty("confirmPassword");
		createShopifyAccBtn = props.getProperty("createShopifyAccBtn");
		
		driver.get(url);
	}
	

}
