package com.vin.parallelexecutions;

import org.testng.annotations.Test;

public class TestClass1 
{
	
	@Test
	public void testmethod1()
	{
		System.out.println("testclass1 >> testmethod1 >> " + Thread.currentThread().getId());
	}
	
	@Test
	public void testmethod2()
	{
		System.out.println("testclass1 >> testmethod2 >> " + Thread.currentThread().getId());
	}
	
	@Test
	public void testmethod3()
	{
		System.out.println("testclass1 >> testmethod3 >> " + Thread.currentThread().getId());
	}
	
	@Test
	public void testmethod4()
	{
		System.out.println("testclass1 >> testmethod4 >> " + Thread.currentThread().getId());
	}
}
