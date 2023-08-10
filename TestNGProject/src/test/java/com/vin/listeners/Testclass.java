package com.vin.listeners;

import org.testng.Assert;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;

public class Testclass extends BaseTest 
{
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