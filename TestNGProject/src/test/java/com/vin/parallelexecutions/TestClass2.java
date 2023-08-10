package com.vin.parallelexecutions;

import org.testng.annotations.Test;

public class TestClass2 
{
	
	@Test
	public void testmethod5()
	{
		System.out.println("testclass2 >> testmethod5 >> " + Thread.currentThread().getId());
	}
	
	@Test
	public void testmethod6()
	{
		System.out.println("testclass2 >> testmethod6 >> " + Thread.currentThread().getId());
	}
	
	@Test
	public void testmethod7()
	{
		System.out.println("testclass2 >> testmethod7 >> " + Thread.currentThread().getId());
	}
}
