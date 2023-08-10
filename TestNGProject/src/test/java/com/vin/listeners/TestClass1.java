package com.vin.listeners;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(TestListener.class)
public class TestClass1 
{
	
	@Test
	public void testmethod1()
	{
		System.out.println("I am in TestMethod-1");
	}
	
	@Test
	public void testmethod2()
	{
		System.out.println("I am in TestMethod-2");
		Assert.assertTrue(false);
	}
	
	@Test(timeOut = 1000)
	public void testmethod3() throws InterruptedException
	{
		Thread.sleep(3000);
		System.out.println("I am in TestMethod-3");
	}
	
	@Test(dependsOnMethods = "testmethod3")
	public void testmethod4()
	{
		System.out.println("I am in TestMethod-4");
	}
}
