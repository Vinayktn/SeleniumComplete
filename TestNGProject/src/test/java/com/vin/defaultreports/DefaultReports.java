package com.vin.defaultreports;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DefaultReports  
{
	public static  WebDriver driver;

	@BeforeTest
	public void setup() 
	{
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(co);
	}

	@AfterTest
	public void teardown() 
	{
		driver.quit();
	}

	@Test(testName = "testgoogle")
	public void testgoogle()
	{
		driver.get("https://www.google.com/");
		String Actualtitle = driver.getTitle();
		String Expectedtitle = "Google";
		Assert.assertEquals(Actualtitle, Expectedtitle);
	}

	@Test(testName = "testfacebook")
	public void testfacebook()
	{
		driver.get("https://www.facebook.com/");
		String Actualtitle = driver.getTitle();
		String Expectedtitle = "Facebook – log in or sign";
		Assert.assertEquals(Actualtitle, Expectedtitle);
	}

	@Test(testName = "orangehrm")
	public void orangehrm() throws InterruptedException		
	{
		driver.get("https://opensource-demo.orangehrmlive.com");
		Thread.sleep(10000);
		String Actualtitle = driver.getTitle();
		String Expectedtitle = "orangehrm";
		Assert.assertEquals(Actualtitle, Expectedtitle);
	}
}
