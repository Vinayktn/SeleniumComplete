package com.vin.parallelexecutions;

import org.testng.annotations.Test;

public class TestClass3 
{
	@Test
	public void testmethod8()
	{
		System.out.println("testclass3 >> testmethod8 >> " + Thread.currentThread().getId());
	}
	
	@Test
	public void testmethod9()
	{
		System.out.println("testclass3 >> testmethod9 >> " + Thread.currentThread().getId());
	}
	
	@Test
	public void testmethod10()
	{
		System.out.println("testclass3 >> testmethod10 >> " + Thread.currentThread().getId());
	}
	
	@Test
	public void testmethod11()
	{
		System.out.println("testclass3 >> testmethod11 >> " + Thread.currentThread().getId());
	}
}