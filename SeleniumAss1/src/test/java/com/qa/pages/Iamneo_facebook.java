package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.testng.Reporter;
//import org.testng.asserts.SoftAssert;

public class Iamneo_facebook {
	public static void main(String []a) throws InterruptedException {
	WebDriver driver=null;
	//SoftAssert sass=new SoftAssert();
	String browser="firefox";
	if(browser.equalsIgnoreCase("firefox")) {
	System.setProperty("webdriver.gecko.driver","D:\\geckodriver-v0.30.0-win32\\geckodriver.exe" );
 	driver=new FirefoxDriver();
	}
	driver.manage().window().maximize();
	driver.get("http://iamneo.ai");
	if(driver.getTitle()=="We are Hiring!") {
		System.out.println("PASS");
	}
	 System.out.println("FAIL");
//	boolean contains=driver.getTitle().contains("We are Hiring!");
//	if(contains) {
//		sass.assertTrue(true);
//		Reporter.log("PASS");
//	}
//	else { sass.assertTrue(false);
//	Reporter.log("FAIL");
//	}
	 
		
	driver.get("https://www.facebook.com");
	driver.navigate().back();
	System.out.println(driver.getCurrentUrl());
	driver.navigate().forward();
	driver.navigate().refresh();
	Thread.sleep(15000);
	driver.close();
	
	}

}

